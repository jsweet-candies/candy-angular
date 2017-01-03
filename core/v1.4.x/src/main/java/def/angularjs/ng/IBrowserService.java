package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class IBrowserService extends def.js.Object {
    public def.angularjs.ng.ITimeoutService defer;
    native public java.lang.Object $get(String key);
    native public def.angularjs.ng.IPromise<Void> defer(double delay, java.lang.Boolean invokeApply);
    native public <T> def.angularjs.ng.IPromise<T> defer(java.util.function.Function<Object,T> fn, double delay, java.lang.Boolean invokeApply, Object... args);
    native public def.angularjs.ng.IPromise<Void> defer(double delay);
    native public def.angularjs.ng.IPromise<Void> defer();
    native public <T> def.angularjs.ng.IPromise<T> defer(java.util.function.Function<Object,T> fn, double delay);
    native public <T> def.angularjs.ng.IPromise<T> defer(java.util.function.Function<Object,T> fn);
}

