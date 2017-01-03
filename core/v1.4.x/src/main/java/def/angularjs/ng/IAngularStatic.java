package def.angularjs.ng;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IAngularStatic extends def.js.Object {
    native public Function bind(Object context, Function fn, Object... args);
    /**
         * Use this function to manually start up angular application.
         *
         * @param element DOM element which is the root of angular application.
         * @param modules An array of modules to load into the application.
         *     Each item in the array should be the name of a predefined module or a (DI annotated)
         *     function that will be invoked by the injector as a config block.
         * @param config an object for defining configuration options for the application. The following keys are supported:
         *     - `strictDi`: disable automatic function annotation for the application. This is meant to assist in finding bugs which break minified code.
         */
    native public def.angularjs.ng.auto.IInjectorService bootstrap(Object element, String[] modules, IAngularBootstrapConfig config);
    /**
         * Creates a deep copy of source, which should be an object or an array.
         *
         * - If no destination is supplied, a copy of the object or array is created.
         * - If a destination is provided, all of its elements (for array) or properties (for objects) are deleted and then all elements/properties from the source are copied to it.
         * - If source is not an object or array (inc. null and undefined), source is returned.
         * - If source is identical to 'destination' an exception will be thrown.
         *
         * @param source The source that will be used to make a copy. Can be any type, including primitives, null, and undefined.
         * @param destination Destination into which the source is copied. If provided, must be of the same type as source.
         */
    native public <T> T copy(T source, T destination);
    /**
         * Wraps a raw DOM element or HTML string as a jQuery element.
         *
         * If jQuery is available, angular.element is an alias for the jQuery function. If jQuery is not available, angular.element delegates to Angular's built-in subset of jQuery, called "jQuery lite" or "jqLite."
         */
    public IAugmentedJQueryStatic element;
    native public Boolean equals(Object value1, Object value2);
    native public Object extend(Object destination, Object... sources);
    /**
         * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
         *
         * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
         *
         * @param obj Object to iterate over.
         * @param iterator Iterator function.
         * @param context Object to become context (this) for the iterator function.
         */
    native public <T> Object forEach(T[] obj, java.util.function.BiFunction<T,Double,Object> iterator, Object context);
    /**
         * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
         *
         * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
         *
         * @param obj Object to iterate over.
         * @param iterator Iterator function.
         * @param context Object to become context (this) for the iterator function.
         */
    native public <T> Object forEach(Obj<T> obj, java.util.function.BiFunction<T,String,Object> iterator, Object context);
    /**
         * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
         *
         * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
         *
         * @param obj Object to iterate over.
         * @param iterator Iterator function.
         * @param context Object to become context (this) for the iterator function.
         */
    native public Object forEach(Object obj, java.util.function.BiFunction<Object,Object,Object> iterator, Object context);
    native public Object fromJson(String json);
    native public <T> T identity(T arg);
    native public def.angularjs.ng.auto.IInjectorService injector(Object[] modules, Boolean strictDi);
    native public Boolean isArray(Object value);
    native public Boolean isDate(Object value);
    native public Boolean isDefined(Object value);
    native public Boolean isElement(Object value);
    native public Boolean isFunction(Object value);
    native public Boolean isNumber(Object value);
    native public Boolean isObject(Object value);
    native public Boolean isString(Object value);
    native public Boolean isUndefined(Object value);
    native public String lowercase(String str);
    /**
         * Deeply extends the destination object dst by copying own enumerable properties from the src object(s) to dst. You can specify multiple src objects. If you want to preserve original objects, you can do so by passing an empty object as the target: var object = angular.merge({}, object1, object2).
         *
         * Unlike extend(), merge() recursively descends into object properties of source objects, performing a deep copy.
         *
         * @param dst Destination object.
         * @param src Source object(s).
         */
    native public Object merge(Object dst, Object... src);
    /**
         * The angular.module is a global place for creating, registering and retrieving Angular modules. All modules (angular core or 3rd party) that should be available to an application must be registered using this mechanism.
         *
         * When passed two or more arguments, a new module is created. If passed only one argument, an existing module (the name passed as the first argument to module) is retrieved.
         *
         * @param name The name of the module to create or retrieve.
         * @param requires The names of modules this module depends on. If specified then new module is being created. If unspecified then the module is being retrieved for further configuration.
         * @param configFn Optional configuration function for the module.
         */
    native public IModule module(String name, String[] requires, Function configFn);
    native public void noop(Object... args);
    native public void reloadWithDebugInfo();
    native public String toJson(Object obj, Boolean pretty);
    native public String uppercase(String str);
    public Version version;
    /**
         * If window.name contains prefix NG_DEFER_BOOTSTRAP! when angular.bootstrap is called, the bootstrap process will be paused until angular.resumeBootstrap() is called.
         * @param extraModules An optional array of modules that should be added to the original list of modules that the app was about to be bootstrapped with.
         */
    native public def.angularjs.ng.auto.IInjectorService resumeBootstrap(String[] extraModules);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Obj<T> extends def.js.Object {
        native public T $get(String index);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Version extends def.js.Object {
        public String full;
        public double major;
        public double minor;
        public double dot;
        public String codeName;
    }
    /**
         * Use this function to manually start up angular application.
         *
         * @param element DOM element which is the root of angular application.
         * @param modules An array of modules to load into the application.
         *     Each item in the array should be the name of a predefined module or a (DI annotated)
         *     function that will be invoked by the injector as a config block.
         * @param config an object for defining configuration options for the application. The following keys are supported:
         *     - `strictDi`: disable automatic function annotation for the application. This is meant to assist in finding bugs which break minified code.
         */
    native public def.angularjs.ng.auto.IInjectorService bootstrap(Object element, String[] modules);
    /**
         * Use this function to manually start up angular application.
         *
         * @param element DOM element which is the root of angular application.
         * @param modules An array of modules to load into the application.
         *     Each item in the array should be the name of a predefined module or a (DI annotated)
         *     function that will be invoked by the injector as a config block.
         * @param config an object for defining configuration options for the application. The following keys are supported:
         *     - `strictDi`: disable automatic function annotation for the application. This is meant to assist in finding bugs which break minified code.
         */
    native public def.angularjs.ng.auto.IInjectorService bootstrap(Object element);
    /**
         * Creates a deep copy of source, which should be an object or an array.
         *
         * - If no destination is supplied, a copy of the object or array is created.
         * - If a destination is provided, all of its elements (for array) or properties (for objects) are deleted and then all elements/properties from the source are copied to it.
         * - If source is not an object or array (inc. null and undefined), source is returned.
         * - If source is identical to 'destination' an exception will be thrown.
         *
         * @param source The source that will be used to make a copy. Can be any type, including primitives, null, and undefined.
         * @param destination Destination into which the source is copied. If provided, must be of the same type as source.
         */
    native public <T> T copy(T source);
    /**
         * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
         *
         * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
         *
         * @param obj Object to iterate over.
         * @param iterator Iterator function.
         * @param context Object to become context (this) for the iterator function.
         */
    native public <T> Object forEach(T[] obj, java.util.function.BiFunction<T,Double,Object> iterator);
    /**
         * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
         *
         * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
         *
         * @param obj Object to iterate over.
         * @param iterator Iterator function.
         * @param context Object to become context (this) for the iterator function.
         */
    native public <T> Object forEach(Obj<T> obj, java.util.function.BiFunction<T,String,Object> iterator);
    /**
         * Invokes the iterator function once for each item in obj collection, which can be either an object or an array. The iterator function is invoked with iterator(value, key), where value is the value of an object property or an array element and key is the object property key or array element index. Specifying a context for the function is optional.
         *
         * It is worth noting that .forEach does not iterate over inherited properties because it filters using the hasOwnProperty method.
         *
         * @param obj Object to iterate over.
         * @param iterator Iterator function.
         * @param context Object to become context (this) for the iterator function.
         */
    native public Object forEach(Object obj, java.util.function.BiFunction<Object,Object,Object> iterator);
    native public <T> T identity();
    native public def.angularjs.ng.auto.IInjectorService injector(Object[] modules);
    native public def.angularjs.ng.auto.IInjectorService injector();
    /**
         * The angular.module is a global place for creating, registering and retrieving Angular modules. All modules (angular core or 3rd party) that should be available to an application must be registered using this mechanism.
         *
         * When passed two or more arguments, a new module is created. If passed only one argument, an existing module (the name passed as the first argument to module) is retrieved.
         *
         * @param name The name of the module to create or retrieve.
         * @param requires The names of modules this module depends on. If specified then new module is being created. If unspecified then the module is being retrieved for further configuration.
         * @param configFn Optional configuration function for the module.
         */
    native public IModule module(String name, String[] requires);
    /**
         * The angular.module is a global place for creating, registering and retrieving Angular modules. All modules (angular core or 3rd party) that should be available to an application must be registered using this mechanism.
         *
         * When passed two or more arguments, a new module is created. If passed only one argument, an existing module (the name passed as the first argument to module) is retrieved.
         *
         * @param name The name of the module to create or retrieve.
         * @param requires The names of modules this module depends on. If specified then new module is being created. If unspecified then the module is being retrieved for further configuration.
         * @param configFn Optional configuration function for the module.
         */
    native public IModule module(String name);
    native public String toJson(Object obj);
    /**
         * If window.name contains prefix NG_DEFER_BOOTSTRAP! when angular.bootstrap is called, the bootstrap process will be paused until angular.resumeBootstrap() is called.
         * @param extraModules An optional array of modules that should be added to the original list of modules that the app was about to be bootstrapped with.
         */
    native public def.angularjs.ng.auto.IInjectorService resumeBootstrap();
    /**
         * Use this function to manually start up angular application.
         *
         * @param element DOM element which is the root of angular application.
         * @param modules An array of modules to load into the application.
         *     Each item in the array should be the name of a predefined module or a (DI annotated)
         *     function that will be invoked by the injector as a config block.
         * @param config an object for defining configuration options for the application. The following keys are supported:
         *     - `strictDi`: disable automatic function annotation for the application. This is meant to assist in finding bugs which break minified code.
         */
    native public def.angularjs.ng.auto.IInjectorService bootstrap(Object element, Function[] modules, IAngularBootstrapConfig config);
    /**
         * Use this function to manually start up angular application.
         *
         * @param element DOM element which is the root of angular application.
         * @param modules An array of modules to load into the application.
         *     Each item in the array should be the name of a predefined module or a (DI annotated)
         *     function that will be invoked by the injector as a config block.
         * @param config an object for defining configuration options for the application. The following keys are supported:
         *     - `strictDi`: disable automatic function annotation for the application. This is meant to assist in finding bugs which break minified code.
         */
    native public def.angularjs.ng.auto.IInjectorService bootstrap(Object element, Object[][] modules, IAngularBootstrapConfig config);
    /**
         * Use this function to manually start up angular application.
         *
         * @param element DOM element which is the root of angular application.
         * @param modules An array of modules to load into the application.
         *     Each item in the array should be the name of a predefined module or a (DI annotated)
         *     function that will be invoked by the injector as a config block.
         * @param config an object for defining configuration options for the application. The following keys are supported:
         *     - `strictDi`: disable automatic function annotation for the application. This is meant to assist in finding bugs which break minified code.
         */
    native public def.angularjs.ng.auto.IInjectorService bootstrap(Object element, Object[][] modules);
    /**
         * Use this function to manually start up angular application.
         *
         * @param element DOM element which is the root of angular application.
         * @param modules An array of modules to load into the application.
         *     Each item in the array should be the name of a predefined module or a (DI annotated)
         *     function that will be invoked by the injector as a config block.
         * @param config an object for defining configuration options for the application. The following keys are supported:
         *     - `strictDi`: disable automatic function annotation for the application. This is meant to assist in finding bugs which break minified code.
         */
    native public def.angularjs.ng.auto.IInjectorService bootstrap(Object element, Function[] modules);
    native public def.angularjs.ng.IAugmentedJQuery element(java.lang.String selector, Object context);
    native public def.angularjs.ng.IAugmentedJQuery element(def.dom.Element element);
    native public def.angularjs.ng.IAugmentedJQuery element(java.lang.Object object);
    native public def.angularjs.ng.IAugmentedJQuery element(def.dom.Element[] elementArray);
    native public def.angularjs.ng.IAugmentedJQuery element(def.jquery.JQuery object);
    native public def.angularjs.ng.IAugmentedJQuery element(def.js.Function func);
    native public def.angularjs.ng.IAugmentedJQuery element(Object[] array);
    native public def.angularjs.ng.IAugmentedJQuery element();
    native public def.angularjs.ng.IAugmentedJQuery element(java.lang.String selector);
}

