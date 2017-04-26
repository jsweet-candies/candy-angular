package def.angularjs.ng;
public interface IHttpPromiseCallback<T> {
    public void $apply(T data, double status, IHttpHeadersGetter headers, IRequestConfig config);
}

