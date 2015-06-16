# General Notes #

There are some global functions that should be identified.   These items apply to all Components:

## ToolTips ##

ToolTips can be handled by one of two ways.  Either setting the toolTip attribute or by using the nested tooltipconfig element.

**Using toolTip attribute**
```
<button:Button toolTip="Click here to continue" />
```

**Using tooltipconfig element**
```
<button:Button>
   <button:tooltipconfig text="Click here to continue" closeable="true" title="Information" />
</button:Button>
```


## Style Attributes ##

GXT Components can use the method `setStyleConfig(String attr, String value)` to set different CSS style attribute values.

This can also be achieved by using the **styleAttribute** attribute.

**For example:**
```
<gxt:LayoutContainer styleAttribute="backgroundColor:red">
```

Multiple's can be applied by using this syntax:
```
<gxt:LayoutContainer styleAttribute="backgroundColor:red;display:none">
```