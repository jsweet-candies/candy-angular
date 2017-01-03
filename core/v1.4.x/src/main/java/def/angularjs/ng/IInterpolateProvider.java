package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class IInterpolateProvider extends IServiceProvider {
    native public String startSymbol();
    native public IInterpolateProvider startSymbol(String value);
    native public String endSymbol();
    native public IInterpolateProvider endSymbol(String value);
}

