package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class ITimeoutService extends def.js.Object {
    native public IPromise<Void> apply(double delay, Boolean invokeApply);
    native public <T> IPromise<T> apply(java.util.function.Function<Object,T> fn, double delay, Boolean invokeApply, Object... args);
    native public Boolean cancel(IPromise<?> promise);
    native public IPromise<Void> apply(double delay);
    native public IPromise<Void> apply();
    native public <T> IPromise<T> apply(java.util.function.Function<Object,T> fn, double delay);
    native public <T> IPromise<T> apply(java.util.function.Function<Object,T> fn);
    native public Boolean cancel();
}

