package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class IDirectivePrePost extends def.js.Object {
    @jsweet.lang.Optional
    public IDirectiveLinkFn pre;
    @jsweet.lang.Optional
    public IDirectiveLinkFn post;
    native public void pre(def.angularjs.ng.IScope scope, def.angularjs.ng.IAugmentedJQuery instanceElement, def.angularjs.ng.IAttributes instanceAttributes, java.lang.Object controller, def.angularjs.ng.ITranscludeFunction transclude);
    native public void post(def.angularjs.ng.IScope scope, def.angularjs.ng.IAugmentedJQuery instanceElement, def.angularjs.ng.IAttributes instanceAttributes, java.lang.Object controller, def.angularjs.ng.ITranscludeFunction transclude);
}

