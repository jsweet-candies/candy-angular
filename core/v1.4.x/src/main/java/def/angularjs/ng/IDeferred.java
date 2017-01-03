package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class IDeferred<T> extends def.js.Object {
    native public void resolve(T value);
    native public void reject(Object reason);
    native public void notify(Object state);
    public IPromise<T> promise;
    native public void resolve();
    native public void reject();
    @jsweet.lang.Name("notify")
    native public void Notify();
    native public void resolve(IPromise<T> value);
}

