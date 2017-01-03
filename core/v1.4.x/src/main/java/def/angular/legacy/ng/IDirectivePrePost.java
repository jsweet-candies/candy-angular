package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class IDirectivePrePost extends def.js.Object {
    @jsweet.lang.Optional
    public IDirectiveLinkFn pre;
    @jsweet.lang.Optional
    public IDirectiveLinkFn post;
    native public void pre(def.angular.legacy.ng.IScope scope, def.angular.legacy.ng.IAugmentedJQuery instanceElement, def.angular.legacy.ng.IAttributes instanceAttributes, java.lang.Object controller, def.angular.legacy.ng.ITranscludeFunction transclude);
    native public void post(def.angular.legacy.ng.IScope scope, def.angular.legacy.ng.IAugmentedJQuery instanceElement, def.angular.legacy.ng.IAttributes instanceAttributes, java.lang.Object controller, def.angular.legacy.ng.ITranscludeFunction transclude);
}

