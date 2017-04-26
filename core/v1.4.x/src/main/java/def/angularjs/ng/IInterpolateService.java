package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class IInterpolateService extends def.js.Object {
    native public IInterpolationFunction $apply(String text, Boolean mustHaveExpression, String trustedContext, Boolean allOrNothing);
    native public String endSymbol();
    native public String startSymbol();
    native public IInterpolationFunction $apply(String text, Boolean mustHaveExpression, String trustedContext);
    native public IInterpolationFunction $apply(String text, Boolean mustHaveExpression);
    native public IInterpolationFunction $apply(String text);
}

