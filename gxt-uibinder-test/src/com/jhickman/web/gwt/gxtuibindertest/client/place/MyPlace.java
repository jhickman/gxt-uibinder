/**
 * 
 */
package com.jhickman.web.gwt.gxtuibindertest.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.jhickman.web.gwt.gxtuibindertest.client.view.OverviewViewImpl;
import com.jhickman.web.gwt.gxtuibindertest.client.view.View;
import com.jhickman.web.gwt.gxtuibindertest.client.view.button.ButtonAligningView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.button.ButtonsView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.combos.ComboBoxView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.forms.FormsView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.grids.BasicGridView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.AbsoluteLayoutView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.AccordionLayoutView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.AnchorLayoutView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.BorderLayoutView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.CardLayoutView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.CenterLayoutView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.HBoxLayoutView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.PortalView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.RowLayoutView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.layout.VBoxLayoutView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.misc.DatePickerView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.misc.FxView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.misc.SliderView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.misc.ToolTipsView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.tabs.BasicTabsView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.toolbarmenu.BasicToolbarView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.toolbarmenu.MenuBarView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.tree.BasicTreeView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.tree.CheckboxTreeView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.work.ExperimentView;
import com.jhickman.web.gwt.gxtuibindertest.client.view.work.WorkInProgressView;

/**
 * @author hickman
 *
 */
public class MyPlace extends Place {
	private Token token;
	
	public MyPlace(Token token) {
		this.token = token;
	}
	
	public Token getToken() {
		return token;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if ( ! (obj instanceof MyPlace)) return false;
		
		MyPlace that = (MyPlace) obj;
		
		return this.token.equals(that.token);
	}
	
	
	public static enum Token {
		overview {
			public View getView() {
				return new OverviewViewImpl();
			}
		},
		wip {
			public View getView() {
				return new WorkInProgressView();
			}
		},
		experiment {
			public View getView() {
				return new ExperimentView();
			}
		},
		absolutelayout {
			public View getView() {
				return new AbsoluteLayoutView();
			}
		},
		borderlayout {
			public View getView() {
				return new BorderLayoutView();
			}
		},
		buttons {
			public View getView() {
				return new ButtonsView();
			}
		},
		tooltips {
			public View getView() {
				return new ToolTipsView();
			}
		},
		datepicker {
			public View getView() {
				return new DatePickerView();
			}
		},
		basictabs {
			public View getView() {
				return new BasicTabsView();
			}
		}, 
		slider {
			public View getView() {
				return new SliderView();
			}
			
		},
		buttonaligning {
			public View getView() {
				return new ButtonAligningView();
			}
		},
		menubar {
			public View getView() {
				return new MenuBarView();
			}
		},
		basicgrid {
			public View getView() {
				return new BasicGridView();
			}
		}, 
		forms {
			public View getView() {
				return new FormsView();
			}
		}, 
		rowlayout {
			public View getView() {
				return new RowLayoutView();
			}
			
		}, 
		cardlayout {
			public View getView() {
				return new CardLayoutView();
			}
		}, 
		centerlayout {
			public View getView() {
				return new CenterLayoutView();
			}
			
		}, 
		portal {
			public View getView() {
				return new PortalView();
			}
		}, 
		hboxlayout {
			public View getView() {
				return new HBoxLayoutView();
			}
		}, 
		vboxlayout {
			public View getView() {
				return new VBoxLayoutView();
			}
		},
		basictree {
			public View getView() {
				return new BasicTreeView();
			}
		}, 
		checkboxtree {
			public View getView() {
				return new CheckboxTreeView();
			}
		},
		anchorlayout {
			public View getView() {
				return new AnchorLayoutView();
			}
		},
		accordionlayout {
			public View getView() {
				return new AccordionLayoutView();
			}
		},
		combobox {
			public View getView() {
				return new ComboBoxView();
			}
		}, 
		fx {
			public View getView() {
				return new FxView();
			}
		}, 
		basictoolbar {
			public View getView() {
				return new BasicToolbarView();
			}
		}
		;

		
		public abstract View getView();
	}

	
	public static class Tokenizer implements PlaceTokenizer<MyPlace> {
		@Override
		public MyPlace getPlace(String token) {
			token = token.toLowerCase();
			return new MyPlace(Token.valueOf(token));
		}
		@Override
		public String getToken(MyPlace place) {
			return place.getToken().name();
		}
	}
}
