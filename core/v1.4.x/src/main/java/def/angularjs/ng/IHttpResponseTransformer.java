package def.angularjs.ng;
public interface IHttpResponseTransformer {
    public Object apply(Object data, IHttpHeadersGetter headersGetter, double status);
}

