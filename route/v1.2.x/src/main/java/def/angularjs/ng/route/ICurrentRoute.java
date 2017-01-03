package def.angularjs.ng.route;
import def.angularjs.ng.IScope;
@jsweet.lang.Interface
public abstract class ICurrentRoute extends IRoute {
    public Locals locals;
    public Object params;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Locals extends def.js.Object {
        public IScope $scope;
        public String $template;
    }
}

