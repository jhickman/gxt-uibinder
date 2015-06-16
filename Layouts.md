# Layouts #

Layouts are supported for any Container widget that extends `LayoutContainer`.

Layouts are applied by using an attribute on a `LayoutContainer` element called **layout**.

Here's an example:
```
<gxt:LayoutContainer layout="FitLayout">
  ...
</gxt:LayoutContainer>
```

Some Layouts require special XML elements.  Please see specific `Layout` documentation page for more details.

Sometimes the Layout class has properties that need to be set.  In order to do this, you must specify the layout as a nested element.  Then that elements attribute values will be applied to the Layout instance.

For example:
```
<gxt:LayoutContainer>
  <gxt:layout type="FillLayout" margins="10" />

</gxt:LayoutContainer>
```

## LayoutData ##
Sometimes you may need to specify LayoutData (from `layout.add(widget, layoutdata)`).  This is done by using nested `<prefix:layoutdata>` elements.

For example:
```
<form:FormPanel ..>
  <form:layoutdata type="FormData" anchorSpec="-20">
    <form:TextField fieldLabel="Name" allowBlank="false" />
  </form:layoutdata>
</form:FormPanel>
```

It should be noted that the LayoutData instance will be applied to every nested element.  If each child element must have a different LayoutData instance, then you should surround each child element with a different `<prefix:layoutdata>` element.