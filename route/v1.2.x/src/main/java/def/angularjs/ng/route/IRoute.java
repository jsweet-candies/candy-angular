package def.angularjs.ng.route;
/**
     * see https://code.angularjs.org/1.2.26/docs/api/ngRoute/provider/$routeProvider#when for API documentation
     */
@jsweet.lang.Interface
public abstract class IRoute extends def.js.Object {
    /**
         * {(string|function()=}
         * Controller fn that should be associated with newly created scope or the name of a registered controller if passed as a string.
         */
    @jsweet.lang.Optional
    public Object controller;
    /**
         * A controller alias name. If present the controller will be published to scope under the controllerAs name.
         */
    @jsweet.lang.Optional
    public String controllerAs;
    /**
         * Undocumented?
         */
    @jsweet.lang.Optional
    public String name;
    /**
         * {string=|function()=}
         * Html template as a string or a function that returns an html template as a string which should be used by ngView or ngInclude directives. This property takes precedence over templateUrl.
         *
         * If template is a function, it will be called with the following parameters:
         *
         * {Array.<Object>} - route parameters extracted from the current $location.path() by applying the current route
         */
    @jsweet.lang.Optional
    public String template;
    /**
         * {string=|function()=}
         * Path or function that returns a path to an html template that should be used by ngView.
         *
         * If templateUrl is a function, it will be called with the following parameters:
         *
         * {Array.<Object>} - route parameters extracted from the current $location.path() by applying the current route
         */
    @jsweet.lang.Optional
    public Object templateUrl;
    /**
         * {Object.<string, function>=} - An optional map of dependencies which should be injected into the controller. If any of these dependencies are promises, the router will wait for them all to be resolved or one to be rejected before the controller is instantiated. If all the promises are resolved successfully, the values of the resolved promises are injected and $routeChangeSuccess event is fired. If any of the promises are rejected the $routeChangeError event is fired. The map object is:
         *
         * - key - {string}: a name of a dependency to be injected into the controller.
         * - factory - {string|function}: If string then it is an alias for a service. Otherwise if function, then it is injected and the return value is treated as the dependency. If the result is a promise, it is resolved before its value is injected into the controller. Be aware that ngRoute.$routeParams will still refer to the previous route within these resolve functions. Use $route.current.params to access the new route parameters, instead.
         */
    @jsweet.lang.Optional
    public Resolve resolve;
    /**
         * {(string|function())=}
         * Value to update $location path with and trigger route redirection.
         *
         * If redirectTo is a function, it will be called with the following parameters:
         *
         * - {Object.<string>} - route parameters extracted from the current $location.path() by applying the current route templateUrl.
         * - {string} - current $location.path()
         * - {Object} - current $location.search()
         * - The custom redirectTo function is expected to return a string which will be used to update $location.path() and $location.search().
         */
    @jsweet.lang.Optional
    public Object redirectTo;
    /**
         * Reload route when only $location.search() or $location.hash() changes.
         *
         * This option defaults to true. If the option is set to false and url in the browser changes, then $routeUpdate event is broadcasted on the root scope.
         */
    @jsweet.lang.Optional
    public Boolean reloadOnSearch;
    /**
         * Match routes without being case sensitive
         *
         * This option defaults to false. If the option is set to true, then the particular route can be matched without being case sensitive
         */
    @jsweet.lang.Optional
    public Boolean caseInsensitiveMatch;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Resolve extends def.js.Object {
        native public java.lang.Object $get(String key);
    }
}

