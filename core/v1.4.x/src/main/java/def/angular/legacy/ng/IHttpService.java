package def.angular.legacy.ng;
/**
     * HttpService
     * see http://docs.angularjs.org/api/ng/service/$http
     */
@jsweet.lang.Interface
public abstract class IHttpService extends def.js.Object {
    /**
         * Object describing the request to be made and how it should be processed.
         */
    native public <T> IHttpPromise<T> apply(IRequestConfig config);
    /**
         * Shortcut method to perform GET request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> get(String url, IRequestShortcutConfig config);
    /**
         * Shortcut method to perform DELETE request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> delete(String url, IRequestShortcutConfig config);
    /**
         * Shortcut method to perform HEAD request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> head(String url, IRequestShortcutConfig config);
    /**
         * Shortcut method to perform JSONP request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> jsonp(String url, IRequestShortcutConfig config);
    /**
         * Shortcut method to perform POST request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param data Request content
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> post(String url, Object data, IRequestShortcutConfig config);
    /**
         * Shortcut method to perform PUT request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param data Request content
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> put(String url, Object data, IRequestShortcutConfig config);
    /**
         * Shortcut method to perform PATCH request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param data Request content
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> patch(String url, Object data, IRequestShortcutConfig config);
    /**
         * Runtime equivalent of the $httpProvider.defaults property. Allows configuration of default headers, withCredentials as well as request and response transformations.
         */
    public IHttpProviderDefaults defaults;
    /**
         * Array of config objects for currently pending requests. This is primarily meant to be used for debugging purposes.
         */
    public IRequestConfig[] pendingRequests;
    /**
         * Shortcut method to perform GET request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> get(String url);
    /**
         * Shortcut method to perform DELETE request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> delete(String url);
    /**
         * Shortcut method to perform HEAD request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> head(String url);
    /**
         * Shortcut method to perform JSONP request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> jsonp(String url);
    /**
         * Shortcut method to perform POST request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param data Request content
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> post(String url, Object data);
    /**
         * Shortcut method to perform PUT request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param data Request content
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> put(String url, Object data);
    /**
         * Shortcut method to perform PATCH request.
         *
         * @param url Relative or absolute URL specifying the destination of the request
         * @param data Request content
         * @param config Optional configuration object
         */
    native public <T> IHttpPromise<T> patch(String url, Object data);
}

