package def.angular.legacy.ng;
/**
     * form.FormController - type in module ng
     * see https://docs.angularjs.org/api/ng/type/form.FormController
     */
@jsweet.lang.Interface
public abstract class IFormController extends def.js.Object {
    /**
         * Indexer which should return ng.INgModelController for most properties but cannot because of "All named properties must be assignable to string indexer type" constraint - see https://github.com/Microsoft/TypeScript/issues/272
         */
    native public java.lang.Object $get(String name);
    public Boolean $pristine;
    public Boolean $dirty;
    public Boolean $valid;
    public Boolean $invalid;
    public Boolean $submitted;
    public Object $error;
    native public void $addControl(INgModelController control);
    native public void $removeControl(INgModelController control);
    native public void $setValidity(String validationErrorKey, Boolean isValid, INgModelController control);
    native public void $setDirty();
    native public void $setPristine();
    native public void $commitViewValue();
    native public void $rollbackViewValue();
    native public void $setSubmitted();
    native public void $setUntouched();
}

