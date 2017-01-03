package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class IPromise<T> extends def.js.Object {
    /**
         * Regardless of when the promise was or will be resolved or rejected, then calls one of the success or error callbacks asynchronously as soon as the result is available. The callbacks are called with a single argument: the result or rejection reason. Additionally, the notify callback may be called zero or more times to provide a progress indication, before the promise is resolved or rejected.
         * The successCallBack may return IPromise<void> for when a $q.reject() needs to be returned
         * This method returns a new promise which is resolved or rejected via the return value of the successCallback, errorCallback. It also notifies via the return value of the notifyCallback method. The promise can not be resolved or rejected from the notifyCallback method.
         */
    @jsweet.lang.Name("then")
    native public <TResult> IPromise<TResult> thenSuccessCallbackIPromiseFunction(java.util.function.Function<T,IPromise<TResult>> successCallback, java.util.function.Function<Object,Object> errorCallback, java.util.function.Function<Object,Object> notifyCallback);
    /**
         * Shorthand for promise.then(null, errorCallback)
         */
    @jsweet.lang.Name("catch")
    native public <TResult> IPromise<TResult> catchOnRejectedIPromiseFunction(java.util.function.Function<Object,IPromise<TResult>> onRejected);
    /**
         * Allows you to observe either the fulfillment or rejection of a promise, but to do so without modifying the final value. This is useful to release resources or do some clean-up that needs to be done whether the promise was rejected or resolved. See the full specification for more information.
         *
         * Because finally is a reserved word in JavaScript and reserved keywords are not supported as property names by ES3, you'll need to invoke the method like promise['finally'](callback) to make your code IE8 and Android 2.x compatible.
         */
    @jsweet.lang.Name("finally")
    native public IPromise<T> Finally(java.util.function.Supplier<Object> finallyCallback);
    /**
         * Regardless of when the promise was or will be resolved or rejected, then calls one of the success or error callbacks asynchronously as soon as the result is available. The callbacks are called with a single argument: the result or rejection reason. Additionally, the notify callback may be called zero or more times to provide a progress indication, before the promise is resolved or rejected.
         * The successCallBack may return IPromise<void> for when a $q.reject() needs to be returned
         * This method returns a new promise which is resolved or rejected via the return value of the successCallback, errorCallback. It also notifies via the return value of the notifyCallback method. The promise can not be resolved or rejected from the notifyCallback method.
         */
    @jsweet.lang.Name("then")
    native public <TResult> IPromise<TResult> thenSuccessCallbackIPromiseFunction(java.util.function.Function<T,IPromise<TResult>> successCallback, java.util.function.Function<Object,Object> errorCallback);
    /**
         * Regardless of when the promise was or will be resolved or rejected, then calls one of the success or error callbacks asynchronously as soon as the result is available. The callbacks are called with a single argument: the result or rejection reason. Additionally, the notify callback may be called zero or more times to provide a progress indication, before the promise is resolved or rejected.
         * The successCallBack may return IPromise<void> for when a $q.reject() needs to be returned
         * This method returns a new promise which is resolved or rejected via the return value of the successCallback, errorCallback. It also notifies via the return value of the notifyCallback method. The promise can not be resolved or rejected from the notifyCallback method.
         */
    @jsweet.lang.Name("then")
    native public <TResult> IPromise<TResult> thenSuccessCallbackIPromiseFunction(java.util.function.Function<T,IPromise<TResult>> successCallback);
    /**
         * Regardless of when the promise was or will be resolved or rejected, then calls one of the success or error callbacks asynchronously as soon as the result is available. The callbacks are called with a single argument: the result or rejection reason. Additionally, the notify callback may be called zero or more times to provide a progress indication, before the promise is resolved or rejected.
         * The successCallBack may return IPromise<void> for when a $q.reject() needs to be returned
         * This method returns a new promise which is resolved or rejected via the return value of the successCallback, errorCallback. It also notifies via the return value of the notifyCallback method. The promise can not be resolved or rejected from the notifyCallback method.
         */
    @jsweet.lang.Name("then")
    native public <TResult> IPromise<TResult> thenSuccessCallbackFunction(java.util.function.Function<T,TResult> successCallback, java.util.function.Function<Object,Object> errorCallback, java.util.function.Function<Object,Object> notifyCallback);
    /**
         * Shorthand for promise.then(null, errorCallback)
         */
    @jsweet.lang.Name("catch")
    native public <TResult> IPromise<TResult> catchOnRejectedFunction(java.util.function.Function<Object,TResult> onRejected);
    /**
         * Regardless of when the promise was or will be resolved or rejected, then calls one of the success or error callbacks asynchronously as soon as the result is available. The callbacks are called with a single argument: the result or rejection reason. Additionally, the notify callback may be called zero or more times to provide a progress indication, before the promise is resolved or rejected.
         * The successCallBack may return IPromise<void> for when a $q.reject() needs to be returned
         * This method returns a new promise which is resolved or rejected via the return value of the successCallback, errorCallback. It also notifies via the return value of the notifyCallback method. The promise can not be resolved or rejected from the notifyCallback method.
         */
    @jsweet.lang.Name("then")
    native public <TResult> IPromise<TResult> thenSuccessCallbackFunction(java.util.function.Function<T,TResult> successCallback, java.util.function.Function<Object,Object> errorCallback);
    /**
         * Regardless of when the promise was or will be resolved or rejected, then calls one of the success or error callbacks asynchronously as soon as the result is available. The callbacks are called with a single argument: the result or rejection reason. Additionally, the notify callback may be called zero or more times to provide a progress indication, before the promise is resolved or rejected.
         * The successCallBack may return IPromise<void> for when a $q.reject() needs to be returned
         * This method returns a new promise which is resolved or rejected via the return value of the successCallback, errorCallback. It also notifies via the return value of the notifyCallback method. The promise can not be resolved or rejected from the notifyCallback method.
         */
    @jsweet.lang.Name("then")
    native public <TResult> IPromise<TResult> thenSuccessCallbackFunction(java.util.function.Function<T,TResult> successCallback);
}

