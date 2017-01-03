package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class IModelValidators extends def.js.Object {
    /**
         * viewValue is any because it can be an object that is called in the view like $viewValue.name:$viewValue.subName
         */
    native public java.util.function.BiFunction<Object,Object,Boolean> $get(String index);
}

