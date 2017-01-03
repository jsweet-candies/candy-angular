package def.angularjs.ng;
import jsweet.util.union.Union3;
import def.js.Function;
/**
     * `RouteDefinition` defines a route within a {@link RouteConfig} decorator.
     *
     * Supported keys:
     * - `path` or `aux` (requires exactly one of these)
     * - `component`, `loader`,  `redirectTo` (requires exactly one of these)
     * - `name` or `as` (optional) (requires exactly one of these)
     * - `data` (optional)
     *
     * See also {@link Route}, {@link AsyncRoute}, {@link AuxRoute}, and {@link Redirect}.
     */
@jsweet.lang.Interface
public abstract class RouteDefinition extends def.js.Object {
    @jsweet.lang.Optional
    public String path;
    @jsweet.lang.Optional
    public String aux;
    @jsweet.lang.Optional
    public Union3<Type,ComponentDefinition,String> component;
    @jsweet.lang.Optional
    public Function loader;
    @jsweet.lang.Optional
    public Object[] redirectTo;
    @jsweet.lang.Optional
    public String as;
    @jsweet.lang.Optional
    public String name;
    @jsweet.lang.Optional
    public Object data;
    @jsweet.lang.Optional
    public Boolean useAsDefault;
    native public java.lang.Object loader(java.lang.Object... args);
}

