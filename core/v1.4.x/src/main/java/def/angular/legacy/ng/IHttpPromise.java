package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class IHttpPromise<T> extends IPromise<IHttpPromiseCallbackArg<T>> {
    native public IHttpPromise<T> success(IHttpPromiseCallback<T> callback);
    native public IHttpPromise<T> error(IHttpPromiseCallback<?> callback);
}

