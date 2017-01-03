package def.angularjs.ng;
/**
    * Object that controls the defaults for $http provider. Not all fields of IRequestShortcutConfig can be configured
    * via defaults and the docs do not say which. The following is based on the inspection of the source code.
    * https://docs.angularjs.org/api/ng/service/$http#defaults
    * https://docs.angularjs.org/api/ng/service/$http#usage
    * https://docs.angularjs.org/api/ng/provider/$httpProvider The properties section
    */
@jsweet.lang.Interface
public abstract class IHttpProviderDefaults extends def.js.Object {
    /**
         * {boolean|Cache}
         * If true, a default $http cache will be used to cache the GET request, otherwise if a cache instance built with $cacheFactory, this cache will be used for caching.
         */
    @jsweet.lang.Optional
    public Object cache;
    /**
         * Transform function or an array of such functions. The transform function takes the http request body and
         * headers and returns its transformed (typically serialized) version.
         * @see {@link https://docs.angularjs.org/api/ng/service/$http#transforming-requests-and-responses}
         */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<IHttpRequestTransformer,IHttpRequestTransformer[]> transformRequest;
    /**
         * Transform function or an array of such functions. The transform function takes the http response body and
         * headers and returns its transformed (typically deserialized) version.
         */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<IHttpResponseTransformer,IHttpResponseTransformer[]> transformResponse;
    /**
         * Map of strings or functions which return strings representing HTTP headers to send to the server. If the
         * return value of a function is null, the header will not be sent.
         * The key of the map is the request verb in lower case. The "common" key applies to all requests.
         * @see {@link https://docs.angularjs.org/api/ng/service/$http#setting-http-headers}
         */
    @jsweet.lang.Optional
    public IHttpRequestConfigHeaders headers;
    /** Name of HTTP header to populate with the XSRF token. */
    @jsweet.lang.Optional
    public String xsrfHeaderName;
    /** Name of cookie containing the XSRF token. */
    @jsweet.lang.Optional
    public String xsrfCookieName;
    /**
         * whether to to set the withCredentials flag on the XHR object. See [requests with credentials]https://developer.mozilla.org/en/http_access_control#section_5 for more information.
         */
    @jsweet.lang.Optional
    public Boolean withCredentials;
    /**
        * A function used to the prepare string representation of request parameters (specified as an object). If
        * specified as string, it is interpreted as a function registered with the $injector. Defaults to
        * $httpParamSerializer.
        */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,java.util.function.Function<Object,String>> paramSerializer;
}

