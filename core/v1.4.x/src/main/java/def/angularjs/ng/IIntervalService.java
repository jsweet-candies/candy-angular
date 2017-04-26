package def.angularjs.ng;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IIntervalService extends def.js.Object {
    native public IPromise<?> $apply(Function func, double delay, double count, Boolean invokeApply, Object... args);
    native public Boolean cancel(IPromise<?> promise);
    native public IPromise<?> $apply(Function func, double delay, double count);
    native public IPromise<?> $apply(Function func, double delay);
}

