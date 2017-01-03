package def.angularjs.ng;
import def.js.RegExp;
@jsweet.lang.Interface
public abstract class IAnimateProvider extends def.js.Object {
    /**
         * Registers a new injectable animation factory function.
         *
         * @param name The name of the animation.
         * @param factory The factory function that will be executed to return the animation object.
         */
    native public void register(String name, java.util.function.Supplier<IAnimateCallbackObject> factory);
    /**
         * Gets and/or sets the CSS class expression that is checked when performing an animation.
         *
         * @param expression The className expression which will be checked against all animations.
         * @returns The current CSS className expression value. If null then there is no expression value.
         */
    native public RegExp classNameFilter(RegExp expression);
    /**
         * Gets and/or sets the CSS class expression that is checked when performing an animation.
         *
         * @param expression The className expression which will be checked against all animations.
         * @returns The current CSS className expression value. If null then there is no expression value.
         */
    native public RegExp classNameFilter();
}

