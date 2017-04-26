package def.angularjs.ng;
/**
     * $cacheFactory - service in module ng
     *
     * Factory that constructs Cache objects and gives access to them.
     *
     * see https://docs.angularjs.org/api/ng/service/$cacheFactory
     */
@jsweet.lang.Interface
public abstract class ICacheFactoryService extends def.js.Object {
    /**
         * Factory that constructs Cache objects and gives access to them.
         *
         * @param cacheId Name or id of the newly created cache.
         * @param optionsMap Options object that specifies the cache behavior. Properties:
         *
         * capacity — turns the cache into LRU cache.
         */
    native public ICacheObject $apply(String cacheId, OptionsMap optionsMap);
    /**
         * Get information about all the caches that have been created.
         * @returns key-value map of cacheId to the result of calling cache#info
         */
    native public Object info();
    /**
         * Get access to a cache object by the cacheId used when it was created.
         *
         * @param cacheId Name or id of a cache to access.
         */
    native public ICacheObject get(String cacheId);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class OptionsMap extends def.js.Object {
        @jsweet.lang.Optional
        public double capacity;
    }
    /**
         * Factory that constructs Cache objects and gives access to them.
         *
         * @param cacheId Name or id of the newly created cache.
         * @param optionsMap Options object that specifies the cache behavior. Properties:
         *
         * capacity — turns the cache into LRU cache.
         */
    native public ICacheObject $apply(String cacheId);
}

