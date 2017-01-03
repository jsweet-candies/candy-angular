package def.angularjs.ng;
/**
     * Object describing the request to be made and how it should be processed.
     * see http://docs.angularjs.org/api/ng/service/$http#usage
     */
@jsweet.lang.Interface
public abstract class IRequestConfig extends IRequestShortcutConfig {
    /**
         * HTTP method (e.g. 'GET', 'POST', etc)
         */
    public String method;
    /**
         * Absolute or relative URL of the resource that is being requested.
         */
    public String url;
}

