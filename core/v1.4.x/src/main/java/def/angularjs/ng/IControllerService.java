package def.angularjs.ng;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IControllerService extends def.js.Object {
    native public <T> T $apply(java.util.function.Function<Object,T> controllerConstructor, Object locals, Object bindToController);
    native public <T> T $apply(Function controllerConstructor, Object locals, Object bindToController);
    native public <T> T $apply(String controllerName, Object locals, Object bindToController);
    native public <T> T $apply(java.util.function.Function<Object,T> controllerConstructor, Object locals);
    native public <T> T $apply(java.util.function.Function<Object,T> controllerConstructor);
    native public <T> T $apply(Function controllerConstructor, Object locals);
    native public <T> T $apply(Function controllerConstructor);
    native public <T> T $apply(String controllerName, Object locals);
    native public <T> T $apply(String controllerName);
}

