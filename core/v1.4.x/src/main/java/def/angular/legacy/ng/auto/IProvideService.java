package def.angular.legacy.ng.auto;
import def.angular.legacy.ng.IServiceProvider;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IProvideService extends def.js.Object {
    /**
             * Register a constant service, such as a string, a number, an array, an object or a function, with the $injector. Unlike value it can be injected into a module configuration function (see config) and it cannot be overridden by an Angular decorator.
             *
             * @param name The name of the constant.
             * @param value The constant value.
             */
    native public void constant(String name, Object value);
    /**
             * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
             *
             * @param name The name of the service to decorate.
             * @param decorator This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
             *
             * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
             */
    native public void decorator(String name, Function decorator);
    /**
             * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
             *
             * @param name The name of the service to decorate.
             * @param inlineAnnotatedFunction This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
             *
             * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
             */
    native public void decorator(String name, Object[] inlineAnnotatedFunction);
    native public IServiceProvider factory(String name, Function serviceFactoryFunction);
    native public IServiceProvider factory(String name, Object[] inlineAnnotatedFunction);
    native public IServiceProvider provider(String name, IServiceProvider provider);
    native public IServiceProvider provider(String name, Function serviceProviderConstructor);
    native public IServiceProvider service(String name, Function constructor);
    native public IServiceProvider service(String name, Object[] inlineAnnotatedFunction);
    native public IServiceProvider value(String name, Object value);
}

