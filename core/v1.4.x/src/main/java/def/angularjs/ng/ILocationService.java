package def.angularjs.ng;
/**
     * $location - $locationProvider - service in module ng
     * see https://docs.angularjs.org/api/ng/service/$location
     */
@jsweet.lang.Interface
public abstract class ILocationService extends def.js.Object {
    native public String absUrl();
    native public String hash();
    native public ILocationService hash(String newHash);
    native public String host();
    /**
         * Return path of current url
         */
    native public String path();
    /**
         * Change path when called with parameter and return $location.
         * Note: Path should always begin with forward slash (/), this method will add the forward slash if it is missing.
         *
         * @param path New path
         */
    native public ILocationService path(String path);
    native public double port();
    native public String protocol();
    native public ILocationService replace();
    /**
         * Return search part (as object) of current url
         */
    native public Object search();
    /**
         * Change search part when called with parameter and return $location.
         *
         * @param search When called with a single argument the method acts as a setter, setting the search component of $location to the specified value.
         *
         * If the argument is a hash object containing an array of values, these values will be encoded as duplicate search parameters in the url.
         */
    native public ILocationService search(Object search);
    /**
         * Change search part when called with parameter and return $location.
         *
         * @param search New search params
         * @param paramValue If search is a string or a Number, then paramValue will override only a single search property. If paramValue is null, the property specified via the first argument will be deleted. If paramValue is an array, it will override the property of the search component of $location specified via the first argument. If paramValue is true, the property specified via the first argument will be added with no value nor trailing equal sign.
         */
    native public ILocationService search(String search, Object paramValue);
    native public Object state();
    native public ILocationService state(Object state);
    native public String url();
    native public ILocationService url(String url);
}

