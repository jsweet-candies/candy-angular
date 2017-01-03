package def.angular.legacy.ng;
public interface IHttpResponseTransformer {
    public Object apply(Object data, IHttpHeadersGetter headersGetter, double status);
}

