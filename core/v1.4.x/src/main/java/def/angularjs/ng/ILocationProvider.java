package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class ILocationProvider extends IServiceProvider {
    native public String hashPrefix();
    native public ILocationProvider hashPrefix(String prefix);
    native public Boolean html5Mode();
    native public ILocationProvider html5Mode(Boolean active);
    native public ILocationProvider html5Mode(Mode mode);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Mode extends def.js.Object {
        @jsweet.lang.Optional
        public Boolean enabled;
        @jsweet.lang.Optional
        public Boolean requireBase;
        @jsweet.lang.Optional
        public Boolean rewriteLinks;
    }
}

