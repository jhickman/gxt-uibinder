# `BorderLayout` #

`BorderLayout` supports layout regions.  This means that the children of a LayoutContainer that is using the `BorderLayout` must be one of `<gxt:center>, <gxt:west>, <gxt:north>, <gxt:east>, <gxt:south>`.   Each region can only appear once.

Also note that each region, except `<gxt:center>` must specify a size attribute, specified in pixels.  These regions also support the following optional attributes:
  * split
    * boolean value.  true if resizable split panel is needed
  * collapsible
    * boolean value.  true if the panel should contain the collapse button.
  * margins
    * can be specified as a single integer (ie `margins="5"`) to make all margins the same, or a comma separated list of 4 integers (ie `margins="0,5,0,0"`).  The order is `top, right, bottom, left`

```
  <gxt:LayoutContainer layout="BorderLayout">
    <gxt:north size="30">
      <gxt:ContentPanel>...</gxt:ContentPanel>
    </gxt:north>
    <gxt:center>
      <gxt:ContentPanel>...</gxt:ContentPanel>
    </gxt:center>
    <gxt:east size="50" split="true" collapsible="true">
      <gxt:ContentPanel>...</gxt:ContentPanel>
    </gxt:east>
  </gxt:LayoutContainer>
```