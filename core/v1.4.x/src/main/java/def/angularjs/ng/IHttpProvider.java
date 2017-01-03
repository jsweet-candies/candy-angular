package def.angularjs.ng;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class IHttpProvider extends IServiceProvider {
    public IHttpProviderDefaults defaults;
    /**
         * Register service factories (names or implementations) for interceptors which are called before and after
         * each request.
         */
    public Union3<String,IHttpInterceptorFactory,jsweet.util.union.Union<String,IHttpInterceptorFactory>[]>[] interceptors;
    native public Boolean useApplyAsync();
    native public IHttpProvider useApplyAsync(Boolean value);
    /**
         *
         * @param {boolean=} value If true, `$http` will return a normal promise without the `success` and `error` methods.
         * @returns {boolean|Object} If a value is specified, returns the $httpProvider for chaining.
         *    otherwise, returns the current configured value.
         */
    native public jsweet.util.union.Union<Boolean,IHttpProvider> useLegacyPromiseExtensions(Boolean value);
}

