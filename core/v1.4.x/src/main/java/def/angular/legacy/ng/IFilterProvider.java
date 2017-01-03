package def.angular.legacy.ng;
/**
     * $filterProvider - $filter - provider in module ng
     *
     * Filters are just functions which transform input to an output. However filters need to be Dependency Injected. To achieve this a filter definition consists of a factory function which is annotated with dependencies and is responsible for creating a filter function.
     *
     * see https://docs.angularjs.org/api/ng/provider/$filterProvider
     */
@jsweet.lang.Interface
public abstract class IFilterProvider extends IServiceProvider {
    /**
         * register(name);
         *
         * @param name Name of the filter function, or an object map of filters where the keys are the filter names and the values are the filter factories. Note: Filter names must be valid angular Expressions identifiers, such as uppercase or orderBy. Names with special characters, such as hyphens and dots, are not allowed. If you wish to namespace your filters, then you can use capitalization (myappSubsectionFilterx) or underscores (myapp_subsection_filterx).
         */
    native public IServiceProvider register(String name);
    /**
         * register(name);
         *
         * @param name Name of the filter function, or an object map of filters where the keys are the filter names and the values are the filter factories. Note: Filter names must be valid angular Expressions identifiers, such as uppercase or orderBy. Names with special characters, such as hyphens and dots, are not allowed. If you wish to namespace your filters, then you can use capitalization (myappSubsectionFilterx) or underscores (myapp_subsection_filterx).
         */
    native public IServiceProvider register(java.lang.Object name);
}

