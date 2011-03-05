/**
 * 
 */
package com.jhickman.web.gwt.gxtuibinder.elementparsers;

import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.uibinder.elementparsers.ElementParser;
import com.google.gwt.uibinder.rebind.UiBinderWriter;
import com.google.gwt.uibinder.rebind.XMLAttribute;
import com.google.gwt.uibinder.rebind.XMLElement;
import com.jhickman.web.gwt.gxtuibinder.elementparsers.layout.AbsoluteLayoutParser;
import com.jhickman.web.gwt.gxtuibinder.elementparsers.layout.BorderLayoutParser;
import com.jhickman.web.gwt.gxtuibinder.elementparsers.layout.GenericLayoutParser;
import com.jhickman.web.gwt.gxtuibinder.elementparsers.layout.LayoutParser;
import com.jhickman.web.gwt.gxtuibinder.elementparsers.layout.RowLayoutParser;


/**
 * Gives ability for any GXT Widget that extends LayoutContainer to
 * behave as if it implemented the HasWidgets interface.
 * 
 * @author hickman
 */
public class LayoutContainerParser implements ElementParser {
    private static enum Layout {
        BorderLayout(new BorderLayoutParser()),
        
        AccordionLayout(new GenericLayoutParser(GxtClassnameConstants.ACCORDIONLAYOUT)),
        FitLayout(new GenericLayoutParser(GxtClassnameConstants.FITLAYOUT)),
        FlowLayout(new GenericLayoutParser(GxtClassnameConstants.FLOWLAYOUT)),
        CardLayout(new GenericLayoutParser(GxtClassnameConstants.CARDLAYOUT)),
        CenterLayout(new GenericLayoutParser(GxtClassnameConstants.CENTERLAYOUT)),
        VBoxLayout(new GenericLayoutParser(GxtClassnameConstants.VBOXLAYOUT)),
        HBoxLayout(new GenericLayoutParser(GxtClassnameConstants.HBOXLAYOUT)),
        FormLayout(new GenericLayoutParser(GxtClassnameConstants.FORMLAYOUT)),
        AbsoluteLayout(new AbsoluteLayoutParser(GxtClassnameConstants.ABSOLUTELAYOUT)),
        RowLayout(new RowLayoutParser(GxtClassnameConstants.ROWLAYOUT)),
        FillLayout(new RowLayoutParser(GxtClassnameConstants.FILLLAYOUT))
        ;
        private final LayoutParser layoutParser;
        private Layout(LayoutParser layoutParser) {
            this.layoutParser = layoutParser;
        }
        
        // no need for optimization here
        public static boolean contains(String name) {
            for(Layout l : values()) {
                if (l.toString().equals(name)) {
                    return true;
                }
            }
            return false;
        }
    }
    
    
    @Override
    public void parse(XMLElement elem, String fieldName, JClassType type, UiBinderWriter writer) throws UnableToCompleteException {
        XMLAttribute layoutAttribute = elem.getAttribute("layout");
        if (layoutAttribute != null) {
            String layoutName = layoutAttribute.consumeRawValue();
            
            if ( ! Layout.contains(layoutName)) {
                StringBuilder sb = new StringBuilder()
                .append("'layout' must be one of ");
                for(Layout allowed : Layout.values()) {
                    sb.append(allowed.toString()).append(", ");
                }
                sb.append("but found ").append(layoutName);
                writer.die(elem, sb.toString());
            }
            
            Layout layout = Layout.valueOf(layoutName); 
            
            layout.layoutParser.parse(elem, fieldName, type, writer);
        } else if (GxtClassnameConstants.FORMPANEL.equals(type.getQualifiedSourceName())) {
        	// default layout for FormLayou
        	Layout.FormLayout.layoutParser.parse(elem, fieldName, type, writer);
        } else {
        	// FlowLayout is the default as per Sencha Javadoc
        	Layout.FlowLayout.layoutParser.parse(elem, fieldName, type, writer);
        }
    }
}
