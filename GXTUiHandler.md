# Custom Event Handling #

GXT Event model differs from the GWT Event model, so a custom annotation and custom HandlerEvaluator is used.

Example:
In the UiBinder XML, say you have a menu that you want code executed when a user selects the menu.  Use ui:field as normal.
```
    ...
    <menu:MenuItem text="New" ui:field="newMenuItem" />
    ...
```

In the View java code, create a new method to accept this event and apply the `@GxtUiHandler` annotation on it.
```
  @GxtUiHandler(uiField = "newMenuItem", eventType = GxtEvent.Select)
  public void doSomething(MenuEvent event) {
    System.out.println("hi");
  }
```


This annotation, similar to `@UiHandler` supports multiple field names by adding an array of Strings.
```
  @GxtUiHandler(uiField ={"field1", "field2"}, eventType = GxtEvent.Select)
  public void doSomething(MenuEvent event) {
    System.out.println("hi");
  }
```



