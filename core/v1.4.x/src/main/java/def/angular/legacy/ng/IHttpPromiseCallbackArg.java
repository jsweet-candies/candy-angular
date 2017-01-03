package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class IHttpPromiseCallbackArg<T> extends def.js.Object {
    @jsweet.lang.Optional
    public T data;
    @jsweet.lang.Optional
    public double status;
    @jsweet.lang.Optional
    public IHttpHeadersGetter headers;
    @jsweet.lang.Optional
    public IRequestConfig config;
    @jsweet.lang.Optional
    public String statusText;
    native public def.angular.legacy.ng.IHttpHeadersGetter.Apply headers();
    native public java.lang.String headers(java.lang.String headerName);
}

