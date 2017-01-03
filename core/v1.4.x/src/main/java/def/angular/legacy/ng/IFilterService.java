package def.angular.legacy.ng;
/**
     * $filter - $filterProvider - service in module ng
     *
     * Filters are used for formatting data displayed to the user.
     *
     * see https://docs.angularjs.org/api/ng/service/$filter
     */
@jsweet.lang.Interface
public abstract class IFilterService extends def.js.Object {
    native public IFilterFilter apply(def.angular.legacy.StringTypes.filter name);
    native public IFilterCurrency apply(def.angular.legacy.StringTypes.currency name);
    native public IFilterNumber apply(def.angular.legacy.StringTypes.number name);
    native public IFilterDate apply(def.angular.legacy.StringTypes.date name);
    native public IFilterJson apply(def.angular.legacy.StringTypes.json name);
    native public IFilterLowercase apply(def.angular.legacy.StringTypes.lowercase name);
    native public IFilterUppercase apply(def.angular.legacy.StringTypes.uppercase name);
    native public IFilterLimitTo apply(def.angular.legacy.StringTypes.limitTo name);
    native public IFilterOrderBy apply(def.angular.legacy.StringTypes.orderBy name);
    /**
         * Usage:
         * $filter(name);
         *
         * @param name Name of the filter function to retrieve
         */
    native public <T> T apply(String name);
}

