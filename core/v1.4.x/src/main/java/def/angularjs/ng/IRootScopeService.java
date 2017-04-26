package def.angularjs.ng;
import def.js.Function;
/**
     * $rootScope - $rootScopeProvider - service in module ng
     * see https://docs.angularjs.org/api/ng/type/$rootScope.Scope and https://docs.angularjs.org/api/ng/service/$rootScope
     */
@jsweet.lang.Interface
public abstract class IRootScopeService extends def.js.Object {
    native public java.lang.Object $get(String index);
    native public Object $apply();
    native public Object $apply(String exp);
    native public Object $apply(java.util.function.Function<IScope,Object> exp);
    native public Object $applyAsync();
    native public Object $applyAsync(String exp);
    native public Object $applyAsync(java.util.function.Function<IScope,Object> exp);
    /**
         * Dispatches an event name downwards to all child scopes (and their children) notifying the registered $rootScope.Scope listeners.
         *
         * The event life cycle starts at the scope on which $broadcast was called. All listeners listening for name event on this scope get notified. Afterwards, the event propagates to all direct and indirect scopes of the current scope and calls all registered listeners along the way. The event cannot be canceled.
         *
         * Any exception emitted from the listeners will be passed onto the $exceptionHandler service.
         *
         * @param name Event name to broadcast.
         * @param args Optional one or more arguments which will be passed onto the event listeners.
         */
    native public IAngularEvent $broadcast(String name, Object... args);
    native public void $destroy();
    native public void $digest();
    /**
         * Dispatches an event name upwards through the scope hierarchy notifying the registered $rootScope.Scope listeners.
         *
         * The event life cycle starts at the scope on which $emit was called. All listeners listening for name event on this scope get notified. Afterwards, the event traverses upwards toward the root scope and calls all registered listeners along the way. The event will stop propagating if one of the listeners cancels it.
         *
         * Any exception emitted from the listeners will be passed onto the $exceptionHandler service.
         *
         * @param name Event name to emit.
         * @param args Optional one or more arguments which will be passed onto the event listeners.
         */
    native public IAngularEvent $emit(String name, Object... args);
    native public Object $eval();
    native public Object $eval(String expression, Object locals);
    native public Object $eval(java.util.function.Function<IScope,Object> expression, Object locals);
    native public void $evalAsync();
    native public void $evalAsync(String expression);
    native public void $evalAsync(java.util.function.Function<IScope,Object> expression);
    public IRootScopeService(Boolean isolate, IScope parent){}
    /**
         * Listens on events of a given type. See $emit for discussion of event life cycle.
         *
         * The event listener function format is: function(event, args...).
         *
         * @param name Event name to listen on.
         * @param listener Function to call when the event is emitted.
         */
    native public Function $on(String name, java.util.function.BiFunction<IAngularEvent,Object,Object> listener);
    native public Function $watch(String watchExpression, String listener, Boolean objectEquality);
    native public <T> Function $watch(String watchExpression, jsweet.util.function.TriFunction<T,T,IScope,Object> listener, Boolean objectEquality);
    native public Function $watch(java.util.function.Function<IScope,Object> watchExpression, String listener, Boolean objectEquality);
    native public <T> Function $watch(java.util.function.Function<IScope,T> watchExpression, jsweet.util.function.TriFunction<T,T,IScope,Object> listener, Boolean objectEquality);
    native public <T> Function $watchCollection(String watchExpression, jsweet.util.function.TriFunction<T,T,IScope,Object> listener);
    native public <T> Function $watchCollection(java.util.function.Function<IScope,T> watchExpression, jsweet.util.function.TriFunction<T,T,IScope,Object> listener);
    native public Function $watchGroup(Object[] watchExpressions, jsweet.util.function.TriFunction<Object,Object,IScope,Object> listener);
    native public Function $watchGroup(WatchExpressions[] watchExpressions, jsweet.util.function.TriFunction<Object,Object,IScope,Object> listener);
    public IScope $parent;
    public IRootScopeService $root;
    public double $id;
    public Object $$isolateBindings;
    public Object $$phase;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class WatchExpressions extends def.js.Object {
        native public Object $apply(IScope scope);
    }
    native public Object $eval(String expression);
    native public Object $eval(java.util.function.Function<IScope,Object> expression);
    public IRootScopeService(Boolean isolate){}
    public IRootScopeService(){}
    native public Function $watch(String watchExpression, String listener);
    native public Function $watch(String watchExpression);
    native public <T> Function $watch(String watchExpression, jsweet.util.function.TriFunction<T,T,IScope,Object> listener);
    native public Function $watch(java.util.function.Function<IScope,Object> watchExpression, String listener);
    @jsweet.lang.Name("$watch")
    native public Function $watchWatchExpressionAnyFunction(java.util.function.Function<IScope,Object> watchExpression);
    native public <T> Function $watch(java.util.function.Function<IScope,T> watchExpression, jsweet.util.function.TriFunction<T,T,IScope,Object> listener);
    @jsweet.lang.Name("$watch")
    native public <T> Function $watchWatchExpressionFunction(java.util.function.Function<IScope,T> watchExpression);
}

