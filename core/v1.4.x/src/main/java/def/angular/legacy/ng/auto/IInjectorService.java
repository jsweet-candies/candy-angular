package def.angular.legacy.ng.auto;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IInjectorService extends def.js.Object {
    native public String[] annotate(Function fn);
    native public String[] annotate(Object[] inlineAnnotatedFunction);
    native public <T> T get(String name, String caller);
    native public Boolean has(String name);
    native public <T> T instantiate(Function typeConstructor, Object locals);
    native public Object invoke(Object[] inlineAnnotatedFunction);
    native public Object invoke(Function func, Object context, Object locals);
    native public <T> T get(String name);
    native public <T> T instantiate(Function typeConstructor);
    native public Object invoke(Function func, Object context);
    native public Object invoke(Function func);
}

