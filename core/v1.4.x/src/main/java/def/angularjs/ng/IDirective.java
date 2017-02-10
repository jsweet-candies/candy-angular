package def.angularjs.ng;
import def.js.Function;
@jsweet.lang.Interface
public abstract class IDirective extends def.js.Object {
    @jsweet.lang.Optional
    public Object controller;
    @jsweet.lang.Optional
    public String controllerAs;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Boolean,Object> bindToController;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<IDirectiveLinkFn,IDirectivePrePost> link;
    @jsweet.lang.Optional
    public String name;
    @jsweet.lang.Optional
    public double priority;
    @jsweet.lang.Optional
    public Boolean replace;
    @jsweet.lang.Optional
    public Object require;
    @jsweet.lang.Optional
    public String restrict;
    @jsweet.lang.Optional
    public Object scope;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Function> template;
    @jsweet.lang.Optional
    public String templateNamespace;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Function> templateUrl;
    @jsweet.lang.Optional
    public Boolean terminal;
    @jsweet.lang.Optional
    public Object transclude;
    
    native public IDirectivePrePost compile(IAugmentedJQuery templateElement, IAttributes templateAttributes, ITranscludeFunction transclude);
}

