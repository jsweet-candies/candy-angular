package def.angular.legacy.ng;
import def.jquery.JQuery;
@jsweet.lang.Interface
public abstract class IAugmentedJQuery extends JQuery {
    native public IAugmentedJQuery find(String selector);
    native public IAugmentedJQuery find(Object element);
    native public IAugmentedJQuery find(JQuery obj);
    native public Object controller();
    native public Object controller(String name);
    native public Object injector();
    native public IScope scope();
    native public IScope isolateScope();
    native public JQuery inheritedData(String key, Object value);
    native public JQuery inheritedData(Obj obj);
    native public Object inheritedData(String key);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Obj extends def.js.Object {
        native public java.lang.Object $get(String key);
    }
    native public Object inheritedData();
}

