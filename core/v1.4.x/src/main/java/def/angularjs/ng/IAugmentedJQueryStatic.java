package def.angularjs.ng;
import def.jquery.JQuery;
import def.jquery.JQueryStatic;
import def.dom.Element;
import def.js.Function;
/**
     * angular.element
     * when calling angular.element, angular returns a jQuery object,
     * augmented with additional methods like e.g. scope.
     * see: http://docs.angularjs.org/api/angular.element
     */
@jsweet.lang.Interface
public abstract class IAugmentedJQueryStatic extends JQueryStatic {
    native public IAugmentedJQuery $apply(String selector, Object context);
    native public IAugmentedJQuery $apply(Element element);
    native public IAugmentedJQuery $apply(java.lang.Object object);
    native public IAugmentedJQuery $apply(Element[] elementArray);
    native public IAugmentedJQuery $apply(JQuery object);
    native public IAugmentedJQuery $apply(Function func);
    native public IAugmentedJQuery $apply(Object[] array);
    native public IAugmentedJQuery $apply();
    native public IAugmentedJQuery $apply(String selector);
}

