package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class IBrowserService extends def.js.Object {
    public def.angular.legacy.ng.ITimeoutService defer;
    native public java.lang.Object $get(String key);
    native public def.angular.legacy.ng.IPromise<Void> defer(double delay, java.lang.Boolean invokeApply);
    native public <T> def.angular.legacy.ng.IPromise<T> defer(java.util.function.Function<Object,T> fn, double delay, java.lang.Boolean invokeApply, Object... args);
    native public def.angular.legacy.ng.IPromise<Void> defer(double delay);
    native public def.angular.legacy.ng.IPromise<Void> defer();
    native public <T> def.angular.legacy.ng.IPromise<T> defer(java.util.function.Function<Object,T> fn, double delay);
    native public <T> def.angular.legacy.ng.IPromise<T> defer(java.util.function.Function<Object,T> fn);
}

