# `ContentPanel` #
GXT ContentPanel subclasses LayoutContainer, so all of the above apply, but ContentPanel's can also specify top and bottom components.  Typically used for status bars or toolbars.  This is done by using child elements: `<gxt:topcomponent>` and `<gxt:bottom>`

Example:
```
  <gxt:ContentPanel heading="Admin Scripting Console">
    <gxt:topcomponent>
      <menu:MenuBar borders="true">
        ...
      </menu:MenuBar>
    </gxt:topcomponent>
  </gxt:ContentPanel>
```