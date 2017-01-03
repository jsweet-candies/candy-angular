package def.angular.legacy.ng;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IControllerProvider extends IServiceProvider {
    native public void register(String name, Function controllerConstructor);
    native public void register(String name, Object[] dependencyAnnotatedConstructor);
    native public void allowGlobals();
}

