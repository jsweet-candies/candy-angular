package def.angular.legacy.ng;
import def.js.Function;
/**
     * Represents either a component type (`type` is `component`) or a loader function
     * (`type` is `loader`).
     *
     * See also {@link RouteDefinition}.
     */
@jsweet.lang.Interface
public abstract class ComponentDefinition extends def.js.Object {
    public String type;
    @jsweet.lang.Optional
    public Function loader;
    @jsweet.lang.Optional
    public Type component;
    native public java.lang.Object loader(java.lang.Object... args);
}

