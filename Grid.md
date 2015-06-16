# `Grid` #

The current implementation is for basic Grid support.

The Grid element (as indicated below as `grid:Grid`) can have column elements as nested children.  Each `grid:column` represents a `com.extjs.gxt.ui.client.widget.grid.ColumnConfig`, so all properties can be applied.


**UiBinder XML**
```
<ui:UiBinder xmlns:ui='urn:ui:com.google.gwt.uibinder'
    xmlns:g='urn:import:com.google.gwt.user.client.ui'
    xmlns:gxt='urn:import:com.extjs.gxt.ui.client.widget'
    xmlns:grid="urn:import:com.extjs.gxt.ui.client.widget.grid">
  

  <ui:with type="com.extjs.gxt.ui.client.store.ListStore" field="store" /> 
 
  <gxt:LayoutContainer layout="FitLayout">
    <grid:Grid store="{store}">
      <grid:column id="name"
                       header="Name"
                       width="75"  />
      <grid:column id="address"
                       header="Address"
                       width="100" />
    </grid>
  </gxt:LayoutContainer>
</ui:UiBinder>
```

**Owner View**
```
public class SomeView extends Composite {
  static interface Binder extends UiBinder<Widget, SomeView> {}
  static Binder BINDER = GWT.create(Binder.class);

  public SomeView() {
    initWidget(BINDER.createAndBindUi(this));
  }

  @UiFactory
  public ListStore<ModelData> provideListStore() {
    ListStore<ModelData> store = new ListStore<ModelData>();

    ModelData model = new BaseModel();
    model.set("name", "Justin");
    model.set("address", "foo@bar.com");
    store.add(model);

    return store;
  }
}
```