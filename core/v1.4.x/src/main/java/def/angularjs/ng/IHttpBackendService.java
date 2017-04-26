package def.angularjs.ng;
import def.js.Function;
public interface IHttpBackendService {
    public void $apply(String method, String url, Object post, Function callback, Object headers, double timeout, Boolean withCredentials);
    public void $apply(String method, String url, Object post, Function callback, Object headers, double timeout);
    public void $apply(String method, String url, Object post, Function callback, Object headers);
    public void $apply(String method, String url, Object post, Function callback);
    public void $apply(String method, String url, Object post);
    public void $apply(String method, String url);
}

