package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class INgModelController extends def.js.Object {
    native public void $render();
    native public void $setValidity(String validationErrorKey, Boolean isValid);
    native public void $setViewValue(Object value, String trigger);
    native public void $setPristine();
    native public void $setDirty();
    native public void $validate();
    native public void $setTouched();
    native public void $setUntouched();
    native public void $rollbackViewValue();
    native public void $commitViewValue();
    native public Boolean $isEmpty(Object value);
    public Object $viewValue;
    public Object $modelValue;
    public IModelParser[] $parsers;
    public IModelFormatter[] $formatters;
    public IModelViewChangeListener[] $viewChangeListeners;
    public Object $error;
    public String $name;
    public Boolean $touched;
    public Boolean $untouched;
    public IModelValidators $validators;
    public IAsyncModelValidators $asyncValidators;
    public Object $pending;
    public Boolean $pristine;
    public Boolean $dirty;
    public Boolean $valid;
    public Boolean $invalid;
    native public void $setViewValue(Object value);
}

