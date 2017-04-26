package def.angularjs.ng;
/**
     * $filter - $filterProvider - service in module ng
     *
     * Filters are used for formatting data displayed to the user.
     *
     * see https://docs.angularjs.org/api/ng/service/$filter
     */
@jsweet.lang.Interface
public abstract class IFilterService extends def.js.Object {
    native public IFilterFilter $apply(def.angularjs.ng.StringTypes.filter name);
    native public IFilterCurrency $apply(def.angularjs.ng.StringTypes.currency name);
    native public IFilterNumber $apply(def.angularjs.ng.StringTypes._number name);
    native public IFilterDate $apply(def.angularjs.ng.StringTypes.date name);
    native public IFilterJson $apply(def.angularjs.ng.StringTypes.json name);
    native public IFilterLowercase $apply(def.angularjs.ng.StringTypes.lowercase name);
    native public IFilterUppercase $apply(def.angularjs.ng.StringTypes.uppercase name);
    native public IFilterLimitTo $apply(def.angularjs.ng.StringTypes.limitTo name);
    native public IFilterOrderBy $apply(def.angularjs.ng.StringTypes.orderBy name);
    /**
         * Usage:
         * $filter(name);
         *
         * @param name Name of the filter function to retrieve
         */
    native public <T> T $apply(String name);
}

