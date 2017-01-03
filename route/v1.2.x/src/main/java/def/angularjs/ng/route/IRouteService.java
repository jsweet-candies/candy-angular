package def.angularjs.ng.route;
@jsweet.lang.Interface
public abstract class IRouteService extends def.js.Object {
    /**
         * Causes $route service to reload the current route even if $location hasn't changed.
         * As a result of that, ngView creates new scope, reinstantiates the controller.
         */
    native public void reload();
    /**
         * Object with all route configuration Objects as its properties.
         */
    public Object routes;
    @jsweet.lang.Optional
    public ICurrentRoute current;
}

