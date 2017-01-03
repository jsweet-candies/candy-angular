package def.angular.legacy.ng;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IAttributes extends def.js.Object {
    /**
         * this is necessary to be able to access the scoped attributes. it's not very elegant
         * because you have to use attrs['foo'] instead of attrs.foo but I don't know of a better way
         * this should really be limited to return string but it creates this problem: http://stackoverflow.com/q/17201854/165656
         */
    native public java.lang.Object $get(String name);
    /**
         * Converts an attribute name (e.g. dash/colon/underscore-delimited string, optionally prefixed with x- or data-) to its normalized, camelCase form.
         *
         * Also there is special case for Moz prefix starting with upper case letter.
         *
         * For further information check out the guide on @see https://docs.angularjs.org/guide/directive#matching-directives
         */
    native public String $normalize(String name);
    /**
         * Adds the CSS class value specified by the classVal parameter to the
         * element. If animations are enabled then an animation will be triggered
         * for the class addition.
         */
    native public void $addClass(String classVal);
    /**
         * Removes the CSS class value specified by the classVal parameter from the
         * element. If animations are enabled then an animation will be triggered for
         * the class removal.
         */
    native public void $removeClass(String classVal);
    /**
         * Set DOM element attribute value.
         */
    native public void $set(String key, Object value);
    /**
         * Observes an interpolated attribute.
         * The observer function will be invoked once during the next $digest
         * following compilation. The observer is then invoked whenever the
         * interpolated value changes.
         */
    native public <T> Function $observe(String name, java.util.function.Function<T,Object> fn);
    /**
         * A map of DOM element attribute names to the normalized name. This is needed
         * to do reverse lookup from normalized name back to actual name.
         */
    public Object $attr;
    /**
         * Observes an interpolated attribute.
         * The observer function will be invoked once during the next $digest
         * following compilation. The observer is then invoked whenever the
         * interpolated value changes.
         */
    native public <T> Function $observe(String name, java.util.function.Supplier<Object> fn);
}

