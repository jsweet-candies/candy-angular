package def.angular.legacy.ng;
import def.dom.Node;
import def.js.Function;
/**
     * The animation object which contains callback functions for each event that is expected to be animated.
     */
@jsweet.lang.Interface
public abstract class IAnimateCallbackObject extends def.js.Object {
    native public Function eventFn(Node element, java.lang.Runnable doneFn);
}

