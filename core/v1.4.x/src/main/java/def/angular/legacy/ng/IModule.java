package def.angular.legacy.ng;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IModule extends def.js.Object {
    native public IModule animation(String name, Function animationFactory);
    native public IModule animation(String name, Object[] inlineAnnotatedFunction);
    native public IModule animation(Object object);
    /**
         * Use this method to register a component.
         *
         * @param name The name of the component.
         * @param options A definition object passed into the component.
         */
    native public IModule component(String name, IComponentOptions options);
    /**
         * Use this method to register work which needs to be performed on module loading.
         *
         * @param configFn Execute this function on module load. Useful for service configuration.
         */
    native public IModule config(Function configFn);
    /**
         * Use this method to register work which needs to be performed on module loading.
         *
         * @param inlineAnnotatedFunction Execute this function on module load. Useful for service configuration.
         */
    native public IModule config(Object[] inlineAnnotatedFunction);
    native public IModule config(Object object);
    /**
         * Register a constant service, such as a string, a number, an array, an object or a function, with the $injector. Unlike value it can be injected into a module configuration function (see config) and it cannot be overridden by an Angular decorator.
         *
         * @param name The name of the constant.
         * @param value The constant value.
         */
    native public IModule constant(String name, Object value);
    native public IModule constant(Object object);
    /**
         * The $controller service is used by Angular to create new controllers.
         *
         * This provider allows controller registration via the register method.
         *
         * @param name Controller name, or an object map of controllers where the keys are the names and the values are the constructors.
         * @param controllerConstructor Controller constructor fn (optionally decorated with DI annotations in the array notation).
         */
    native public IModule controller(String name, Function controllerConstructor);
    /**
         * The $controller service is used by Angular to create new controllers.
         *
         * This provider allows controller registration via the register method.
         *
         * @param name Controller name, or an object map of controllers where the keys are the names and the values are the constructors.
         * @param controllerConstructor Controller constructor fn (optionally decorated with DI annotations in the array notation).
         */
    native public IModule controller(String name, Object[] inlineAnnotatedConstructor);
    native public IModule controller(Object object);
    /**
         * Register a new directive with the compiler.
         *
         * @param name Name of the directive in camel-case (i.e. ngBind which will match as ng-bind)
         * @param directiveFactory An injectable directive factory function.
         */
    native public IModule directive(String name, IDirectiveFactory directiveFactory);
    /**
         * Register a new directive with the compiler.
         *
         * @param name Name of the directive in camel-case (i.e. ngBind which will match as ng-bind)
         * @param directiveFactory An injectable directive factory function.
         */
    native public IModule directive(String name, Object[] inlineAnnotatedFunction);
    native public IModule directive(Object object);
    /**
         * Register a service factory, which will be called to return the service instance. This is short for registering a service where its provider consists of only a $get property, which is the given service factory function. You should use $provide.factory(getFn) if you do not need to configure your service in a provider.
         *
         * @param name The name of the instance.
         * @param $getFn The $getFn for the instance creation. Internally this is a short hand for $provide.provider(name, {$get: $getFn}).
         */
    native public IModule factory(String name, Function $getFn);
    /**
         * Register a service factory, which will be called to return the service instance. This is short for registering a service where its provider consists of only a $get property, which is the given service factory function. You should use $provide.factory(getFn) if you do not need to configure your service in a provider.
         *
         * @param name The name of the instance.
         * @param inlineAnnotatedFunction The $getFn for the instance creation. Internally this is a short hand for $provide.provider(name, {$get: $getFn}).
         */
    native public IModule factory(String name, Object[] inlineAnnotatedFunction);
    native public IModule factory(Object object);
    native public IModule filter(String name, Function filterFactoryFunction);
    native public IModule filter(String name, Object[] inlineAnnotatedFunction);
    native public IModule filter(Object object);
    native public IModule provider(String name, IServiceProviderFactory serviceProviderFactory);
    native public IModule provider(String name, IServiceProviderClass serviceProviderConstructor);
    native public IModule provider(String name, Object[] inlineAnnotatedConstructor);
    native public IModule provider(String name, IServiceProvider providerObject);
    native public IModule provider(Object object);
    /**
         * Run blocks are the closest thing in Angular to the main method. A run block is the code which needs to run to kickstart the application. It is executed after all of the service have been configured and the injector has been created. Run blocks typically contain code which is hard to unit-test, and for this reason should be declared in isolated modules, so that they can be ignored in the unit-tests.
         */
    native public IModule run(Function initializationFunction);
    /**
         * Run blocks are the closest thing in Angular to the main method. A run block is the code which needs to run to kickstart the application. It is executed after all of the service have been configured and the injector has been created. Run blocks typically contain code which is hard to unit-test, and for this reason should be declared in isolated modules, so that they can be ignored in the unit-tests.
         */
    native public IModule run(Object[] inlineAnnotatedFunction);
    native public IModule service(String name, Function serviceConstructor);
    native public IModule service(String name, Object[] inlineAnnotatedConstructor);
    native public IModule service(Object object);
    /**
         * Register a value service with the $injector, such as a string, a number, an array, an object or a function. This is short for registering a service where its provider's $get property is a factory function that takes no arguments and returns the value service.

           Value services are similar to constant services, except that they cannot be injected into a module configuration function (see config) but they can be overridden by an Angular decorator.
         *
         * @param name The name of the instance.
         * @param value The value.
         */
    native public IModule value(String name, Object value);
    native public IModule value(Object object);
    /**
         * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
         * @param name The name of the service to decorate
         * @param decorator This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments: $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
         */
    native public IModule decorator(String name, Function decoratorConstructor);
    native public IModule decorator(String name, Object[] inlineAnnotatedConstructor);
    public String name;
    public String[] requires;
}

