package def.angularjs.ng;
import def.js.Function;
/**
     * Component definition object (a simplified directive definition object)
     */
@jsweet.lang.Interface
public abstract class IComponentOptions extends def.js.Object {
    /**
         * Controller constructor function that should be associated with newly created scope or the name of a registered
         * controller if passed as a string. Empty function by default.
         */
    @jsweet.lang.Optional
    public Object controller;
    /**
         * An identifier name for a reference to the controller. If present, the controller will be published to scope under
         * the controllerAs name. If not present, this will default to be the same as the component name.
         */
    @jsweet.lang.Optional
    public String controllerAs;
    /**
         * html template as a string or a function that returns an html template as a string which should be used as the
         * contents of this component. Empty string by default.
         * If template is a function, then it is injected with the following locals:
         * $element - Current element
         * $attrs - Current attributes object for the element
         */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Function> template;
    /**
         * path or function that returns a path to an html template that should be used as the contents of this component.
         * If templateUrl is a function, then it is injected with the following locals:
         * $element - Current element
         * $attrs - Current attributes object for the element
         */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Function> templateUrl;
    /**
         * Define DOM attribute binding to component properties. Component properties are always bound to the component
         * controller and not to the scope.
         */
    @jsweet.lang.Optional
    public Object bindings;
    /**
         * Whether transclusion is enabled. Enabled by default.
         */
    @jsweet.lang.Optional
    public Boolean transclude;
    @jsweet.lang.Optional
    public Object require;
    @jsweet.lang.Optional
    public java.util.function.Supplier<Boolean> $canActivate;
    @jsweet.lang.Optional
    public RouteDefinition[] $routeConfig;
}

