package def.angularjs.ng;
/**
     * $cacheFactory.Cache - type in module ng
     *
     * A cache object used to store and retrieve data, primarily used by $http and the script directive to cache templates and other data.
     *
     * see https://docs.angularjs.org/api/ng/type/$cacheFactory.Cache
     */
@jsweet.lang.Interface
public abstract class ICacheObject extends def.js.Object {
    /**
         * Retrieve information regarding a particular Cache.
         */
    native public Info info();
    /**
         * Inserts a named entry into the Cache object to be retrieved later, and incrementing the size of the cache if the key was not already present in the cache. If behaving like an LRU cache, it will also remove stale entries from the set.
         *
         * It will not insert undefined values into the cache.
         *
         * @param key the key under which the cached data is stored.
         * @param value the value to store alongside the key. If it is undefined, the key will not be stored.
         */
    native public <T> T put(String key, T value);
    /**
         * Retrieves named data stored in the Cache object.
         *
         * @param key the key of the data to be retrieved
         */
    native public <T> T get(String key);
    /**
         * Removes an entry from the Cache object.
         *
         * @param key the key of the entry to be removed
         */
    native public void remove(String key);
    /**
         * Clears the cache object of any entries.
         */
    native public void removeAll();
    /**
         * Destroys the Cache object entirely, removing it from the $cacheFactory set.
         */
    native public void destroy();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Info extends def.js.Object {
        /**
             * the id of the cache instance
             */
        public String id;
        /**
             * the number of entries kept in the cache instance
             */
        public double size;
    }
    /**
         * Inserts a named entry into the Cache object to be retrieved later, and incrementing the size of the cache if the key was not already present in the cache. If behaving like an LRU cache, it will also remove stale entries from the set.
         *
         * It will not insert undefined values into the cache.
         *
         * @param key the key under which the cached data is stored.
         * @param value the value to store alongside the key. If it is undefined, the key will not be stored.
         */
    native public <T> T put(String key);
}

