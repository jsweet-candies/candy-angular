package def.angularjs.ng;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IAngularEvent extends def.js.Object {
    /**
         * the scope on which the event was $emit-ed or $broadcast-ed.
         */
    public IScope targetScope;
    /**
         * the scope that is currently handling the event. Once the event propagates through the scope hierarchy, this property is set to null.
         */
    public IScope currentScope;
    /**
         * name of the event.
         */
    public String name;
    /**
         * calling stopPropagation function will cancel further event propagation (available only for events that were $emit-ed).
         */
    @jsweet.lang.Optional
    public Function stopPropagation;
    /**
         * calling preventDefault sets defaultPrevented flag to true.
         */
    public Function preventDefault;
    /**
         * true if preventDefault was called.
         */
    public Boolean defaultPrevented;
    native public java.lang.Object stopPropagation(java.lang.Object... args);
    native public java.lang.Object preventDefault(java.lang.Object... args);
}

