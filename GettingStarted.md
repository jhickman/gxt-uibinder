# Getting Started #

This library depends on [gwt-customuibinder](http://code.google.com/p/gwt-customuibinder) to register the custom ElementParsers in the UiBinderGenerator.  If you haven't downloaded it, please do so now.


## Update to Module XML ##

To use gxt-uibinder, you must inherit the module.  Since this library uses [gwt-customuibinder](http://code.google.com/p/gwt-customuibinder/) to register custom ElementParser classes, this module must be inherited after all other `<inherit>` lines.

Example:
```
<module>

  <inherits name="com.google.gwt.user.User" />
  <inherits name="com.extjs.gxt.ui.GXT" />

  <inherits name="com.jhickman.web.gwt.gxtuibinder.GxtUiBinder" />

  <source path="client" />
  <source path="shared" />
</module>
```

# Examples #

The best source for examples is to browse the demo site.  This site contains many example of how to use GXT in UiBinder XML files.

[Visit Demo Site](http://gxt-uibinder.appspot.com/)