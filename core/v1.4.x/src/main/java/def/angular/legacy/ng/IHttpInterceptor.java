package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class IHttpInterceptor extends def.js.Object {
    @jsweet.lang.Optional
    public java.util.function.Function<IRequestConfig,jsweet.util.union.Union<IRequestConfig,IPromise<IRequestConfig>>> request;
    @jsweet.lang.Optional
    public java.util.function.Function<Object,Object> requestError;
    @jsweet.lang.Optional
    public java.util.function.Function<IHttpPromiseCallbackArg<?>,jsweet.util.union.Union<IPromise<?>,?>> response;
    @jsweet.lang.Optional
    public java.util.function.Function<Object,Object> responseError;
}

