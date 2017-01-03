package def.angular.legacy.ng;
public interface IHttpRequestTransformer {
    public Object apply(Object data, IHttpHeadersGetter headersGetter);
}

