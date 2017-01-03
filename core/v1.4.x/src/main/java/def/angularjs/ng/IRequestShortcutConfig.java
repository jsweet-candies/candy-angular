package def.angularjs.ng;
/**
     * Object describing the request to be made and how it should be processed.
     * see http://docs.angularjs.org/api/ng/service/$http#usage
     */
@jsweet.lang.Interface
public abstract class IRequestShortcutConfig extends IHttpProviderDefaults {
    /**
         * {Object.<string|Object>}
         * Map of strings or objects which will be turned to ?key1=value1&key2=value2 after the url. If the value is not a string, it will be JSONified.
         */
    @jsweet.lang.Optional
    public Object params;
    /**
         * {string|Object}
         * Data to be sent as the request message data.
         */
    @jsweet.lang.Optional
    public Object data;
    /**
         * Timeout in milliseconds, or promise that should abort the request when resolved.
         */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,IPromise<?>> timeout;
    /**
         * See [XMLHttpRequest.responseType]https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest#xmlhttprequest-responsetype
         */
    @jsweet.lang.Optional
    public String responseType;
}

