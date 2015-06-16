# DEPRECATED #

Please note that with the newer releases of GWT, this project is now deprecated as many of the techniques used to add custom element parsers to UiBinder are now not possible.

It should also be noted that this open source project has no relation to Sencha Inc and their product GXT.


---



Much of the components in ExtGWT (GXT) were written before GWT 2.0, thus not having support for UiBinder.

This project utilizes the ability to add custom ElementParsers from the [gwt-customuibinder](http://code.google.com/p/gwt-customuibinder/) project add a number of parsers that can handle GXT layouts and widgets.

This project also adds support for using GXT events from UiBinder.

To get started, check out the [User's Guide](GettingStarted.md).  Also check out the [Demo Site](http://gxt-uibinder.appspot.com/)

# News #
**2011-05-11**
Announcement:  gxt-uibinder is now in Maven Central

New Release: 1.0.0
  * Closed Issues
    * [Issue 19](https://code.google.com/p/gxt-uibinder/issues/detail?id=19) - LayoutContainer with BorderLayout should change the styleAttribute attribute to be more consistent
    * [Issue 26](https://code.google.com/p/gxt-uibinder/issues/detail?id=26) - Modified pom dependency to not use system path to gwt-customuibinder
    * [Issue 27](https://code.google.com/p/gxt-uibinder/issues/detail?id=27) - Add project to public maven repository

**2011-04-03**
New Release: 0.11
  * Closed Issues
    * [Issue 21](https://code.google.com/p/gxt-uibinder/issues/detail?id=21) - Support MarginData for layout data
    * [Issue 24](https://code.google.com/p/gxt-uibinder/issues/detail?id=24) - Support for TableLayout and ColumnLayout
    * [Issue 25](https://code.google.com/p/gxt-uibinder/issues/detail?id=25) - Support for AdapterMenuItem
  * New Demos
    * ComboBox
    * Basic Toolbar
  * Refactorings
    * Refactored LayoutContainerParser to pull out a LayoutParserFactory rather than using a hard coded enum
    * Refactored GenericLayoutParser to pull out a LayoutDataFieldFactory rather than using a hard coded enum

**2011-03-27**
New Release: 0.10
  * Closed Issues
    * [Issue 18](https://code.google.com/p/gxt-uibinder/issues/detail?id=18) - BorderLayoutData should allow floats rather than int for size attribute
    * [Issue 20](https://code.google.com/p/gxt-uibinder/issues/detail?id=20) - Need the SimpleComboBox to accept attribute values
      * Adding support for nested 

&lt;form:item value="{msg.foo}" /&gt;


      * added a type attribute so that SimpleComboBox items can be values other than String type.
  * Misc
    * Updated pom with gwt version 2.2.0

**2011-03-20**
New Release: 0.9
  * Closed Issues
    * [Issue 9](https://code.google.com/p/gxt-uibinder/issues/detail?id=9) - Add support for tool buttons in ContentPanel headers
    * [Issue 14](https://code.google.com/p/gxt-uibinder/issues/detail?id=14) - Support for SimpleComboBox
    * [Issue 15](https://code.google.com/p/gxt-uibinder/issues/detail?id=15) - Support other Menu types in Buttons
  * New Demos
    * CheckboxTreeView
    * VBoxLayout
    * AccordionLayout
  * Misc
    * Upgraded GXT in demo from 2.2.0 to 2.2.3

**2011-03-15**
New Release: 0.8
  * New Demos
    * HBoxLayout
    * Basic Tree
  * Defects
    * [Issue 12](https://code.google.com/p/gxt-uibinder/issues/detail?id=12) - Full support for GXT events via GxtUiHandler annotation
    * [Issue 13](https://code.google.com/p/gxt-uibinder/issues/detail?id=13) - nested 

&lt;gxt:layoutdata&gt;

 elements cause incorrect "add" ordering
  * New Functionality
    * ElementParser for ToggleButton.  Allows attribute toggle="boolean", which will call toggle(boolean)
    * [Issue 10](https://code.google.com/p/gxt-uibinder/issues/detail?id=10) - !HBoxLayout support
      * !HBoxLayout was already there, but didn't support the nested !HBoxLayoutData elements, nor the ability set data on the Layout object itself.
    * [Issue 11](https://code.google.com/p/gxt-uibinder/issues/detail?id=11) - Support for TreePanel
      * Added very basic support.  Just enough to construct with a store as constructor parameter


**2011-03-06**
Released version 0.7
  * New Demo's
    * Basic Grid
    * Forms
    * RowLayout
    * CardLayout
    * CenterLayout
    * Portal
  * Fixed Defect
    * [Issue 6](https://code.google.com/p/gxt-uibinder/issues/detail?id=6): FormPanel requires FormLayout to be the default
    * [Issue 7](https://code.google.com/p/gxt-uibinder/issues/detail?id=7): Support for AdapterField
    * Fixed issue with Slider having "value" attribute as it's ambiguous
  * New functionality
    * Added support for FormData
    * Custom ElementParser for SliderField.  Allows for single nested widget of type Slider
    * Added support for CheckBoxGroup
    * Modification of the ComponentParser to support Number property values.
    * Deprecated rowLayoutOrientation attribute (for RowLayout containers) in favor of layoutOrientation
    * Portal support with ability to setColumnWidth


**2011-01-18**
New Demo Site available!  All gxt-uibinder examples can now be found at http://gxt-uibinder.appspot.com/


**2011-01-18**
Released version 0.6.
  * New Functionality
    * FlowLayout
    * Html
    * Ability to "addButton" on ContentPanel's by using child element 

&lt;gxt:buttons&gt;


    * Adding LayoutData abilities with nested 

&lt;xx:layoutdata&gt;

 child elements of LayoutContainers
  * Reorganized repository layout to add new test project
    * Added Simple Unit Tests
      * AbsoluteLayout
    * Adding demo pages
      * BorderLayout
      * ToolTips
      * DatePicker
      * Basic Tabs
      * Slider
      * Buttons
      * ButtonAligning

**2011-01-12**
  * Started work on working Demo site very much like the Ext GWT Explorer, but with UiBinder source display

**2011-01-03**
  * Back from the holidays.  Starting development on Unit Tests
    * For future refactorings, we need unit tests to guarantee that changes aren't breaking existing functionality

**2010-12-21**
Released version 0.5.
  * New Functionality
    * support for AbsoluteLayout
    * support for RowLayout
    * Added support for using styleAttribute="" for all Components
  * Defect fix
    * ElementParserUtil had defect in that it always assumed attributes are being consumed.  Fixed by reversing order of attribute consumption.

**2010-12-20**
Released version 0.4.
  * New functionality
    * added maven pom file for easier jar builds
    * Support setting ToolTipConfig to any component by nesting a 

&lt;ns:tooltipconfig /&gt;

 element
    * FormLayout support
    * RadioGroup
  * Update to existing functionality
    * Added more Layout's for the LayoutContainer

**2010-12-12**
Released version 0.3.
  * New support:
    * Button menus
    * ButtonGroup

**2010-12-06**
New  Download available 0.2.   Added support for basic Grids.  See [Grid](Grid.md) for usage.


# Example Usage #

Here's a quick example usage:

**UiBinder File:**
```
<ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
    xmlns:g="urn:import:com.google.gwt.user.client.ui"
    xmlns:gxt="urn:import:com.extjs.gxt.ui.client.widget"
    xmlns:menu="urn:import:com.extjs.gxt.ui.client.widget.menu">

  <gxt:ContentPanel headerVisible="false" layout="FitLayout">
    <gxt:topcomponent>
      <menu:MenuBar borders="true">
        <menu:MenuBarItem text="File">
          <menu:Menu>
            <menu:MenuItem text="New" ui:field="newMenuItem" />
            <menu:MenuItem text="Open" ui:field="openMenuItem" />
            <menu:MenuItem text="Save"  ui:field="saveMenuItem" />
            <menu:MenuItem text="Save As" ui:field="saveAsMenuItem" />
          </menu:Menu>
        </menu:MenuBarItem>
      </menu:MenuBar>
    </gxt:topcomponent>
    <gxt:LayoutContainer layout="BorderLayout">
      <gxt:center>
        <gxt:LayoutContainer layout="FitLayout" ui:field="content" />
      </gxt:center>
      <gxt:south size="30">
        <gxt:Label ui:field="status" />
      </gxt:south>
    </gxt:LayoutContainer>
  </gxt:ContentPanel>
</ui:UiBinder>
```

**Owner Class:**
```
public class ApplicationShell extends Composite {

  static interface Binder extends UiBinder<Widget, ApplicationShell> {}
  private Binder BINDER = GWT.create(Binder.class);

  @UiField LayoutContainer content;
  @UiField Label status;

  public ApplicationShell() {
    initWidget(BINDER.createAndBindUi(this));
  }

  @GxtUiHandler(uiField="newMenuItem", eventType=GxtEvent.Select)
  public void newMenuItemClicked(MenuEvent event) {
     status.setText("new clicked");
  }

  @GxtUiHandler(uiField="openMenuItem", eventType=GxtEvent.Select)
  public void openMenuItemClicked(MenuEvent event) {
     status.setText("open clicked");
  }

  @GxtUiHandler(uiField={"saveMenuItem", "saveAsMenuItem"}, eventType=GxtEvent.Select)
  public void saveOrSaveAsClicked(MenuEvent event) {
     status.setText("save or save as clicked");
  }
}
```
