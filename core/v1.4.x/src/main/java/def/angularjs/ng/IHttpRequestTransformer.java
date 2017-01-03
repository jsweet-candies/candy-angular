package def.angularjs.ng;
public interface IHttpRequestTransformer {
    public Object apply(Object data, IHttpHeadersGetter headersGetter);
}

