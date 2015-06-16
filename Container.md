# `Container` #

Since most of the "panels" in GXT (such as LayoutContainer, ContentPanel, etc) extend Container, then all of these these will support nested children.

This means that there is no need to implement the HasWidgets interface to support nesting children.

Here is an example using LayoutContainer:

```
<gxt:LayoutContainer>
  <gxt:Label text="child 1" />
  <gxt:Label text="child 2" />
  <gxt:Label text="child 3" />
  <gxt:Label text="child 4" />
</gxt:LayoutContainer>
```