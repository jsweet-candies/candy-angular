package def.angular.legacy.ng;
/**
     * $q - service in module ng
     * A promise/deferred implementation inspired by Kris Kowal's Q.
     * See http://docs.angularjs.org/api/ng/service/$q
     */
@jsweet.lang.Interface
public abstract class IQService extends def.js.Object {
    public <T> IQService(java.util.function.Function<IQResolveReject<T>,Object> resolver){}
    public <T> IQService(java.util.function.BiFunction<IQResolveReject<T>,IQResolveReject<?>,Object> resolver){}
    native public <T> IPromise<T> apply(java.util.function.Function<IQResolveReject<T>,Object> resolver);
    native public <T> IPromise<T> apply(java.util.function.BiFunction<IQResolveReject<T>,IQResolveReject<?>,Object> resolver);
    /**
         * Combines multiple promises into a single promise that is resolved when all of the input promises are resolved.
         *
         * Returns a single promise that will be resolved with an array of values, each value corresponding to the promise at the same index in the promises array. If any of the promises is resolved with a rejection, this resulting promise will be rejected with the same rejection value.
         *
         * @param promises An array of promises.
         */
    native public <T> IPromise<T[]> all(IPromise<?>[] promises);
    native public <T extends java.lang.Object> IPromise<T> all(Promises promises);
    /**
         * Creates a Deferred object which represents a task which will finish in the future.
         */
    native public <T> IDeferred<T> defer();
    /**
         * Creates a promise that is resolved as rejected with the specified reason. This api should be used to forward rejection in a chain of promises. If you are dealing with the last promise in a promise chain, you don't need to worry about it.
         *
         * When comparing deferreds/promises to the familiar behavior of try/catch/throw, think of reject as the throw keyword in JavaScript. This also means that if you "catch" an error via a promise error callback and you want to forward the error to the promise derived from the current promise, you have to "rethrow" the error by returning a rejection constructed via reject.
         *
         * @param reason Constant, message, exception or an object representing the rejection reason.
         */
    native public IPromise<?> reject(Object reason);
    /**
         * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
         *
         * @param value Value or a promise
         */
    native public <T> IPromise<T> resolve(IPromise<T> value);
    /**
         * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
         */
    native public IPromise<Void> resolve();
    /**
         * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
         *
         * @param value Value or a promise
         */
    native public <T> IPromise<T> when(IPromise<T> value);
    /**
         * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
         */
    native public IPromise<Void> when();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class All extends def.js.Object {
        native public java.lang.Object $get(String id);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Promises extends def.js.Object {
        native public IPromise<?> $get(String id);
    }
    /**
         * Creates a promise that is resolved as rejected with the specified reason. This api should be used to forward rejection in a chain of promises. If you are dealing with the last promise in a promise chain, you don't need to worry about it.
         *
         * When comparing deferreds/promises to the familiar behavior of try/catch/throw, think of reject as the throw keyword in JavaScript. This also means that if you "catch" an error via a promise error callback and you want to forward the error to the promise derived from the current promise, you have to "rethrow" the error by returning a rejection constructed via reject.
         *
         * @param reason Constant, message, exception or an object representing the rejection reason.
         */
    native public IPromise<?> reject();
    /**
         * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
         *
         * @param value Value or a promise
         */
    native public <T> IPromise<T> resolve(T value);
    /**
         * Wraps an object that might be a value or a (3rd party) then-able promise into a $q promise. This is useful when you are dealing with an object that might or might not be a promise, or if the promise comes from a source that can't be trusted.
         *
         * @param value Value or a promise
         */
    native public <T> IPromise<T> when(T value);
    protected IQService(){}
}

