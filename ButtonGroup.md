# ButtonGroup #

ButtonGroup does not have a no-arg constructor, so a custom ElementParser was needed.   This element will require a `columns` attribute to specify the number of columns should be included in the ButtonGroup.


```
<button:ButtonGroup columns="2">
  <button:Button text="button 1" />
  <button:Button text="button 2" />
  <button:Button text="button 3" />
  <button:Button text="button 4" />
</button:ButtonGroup>
```