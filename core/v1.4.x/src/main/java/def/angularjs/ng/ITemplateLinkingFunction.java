package def.angularjs.ng;
public interface ITemplateLinkingFunction {
    public IAugmentedJQuery $apply(IScope scope, ICloneAttachFunction cloneAttachFn);
    public IAugmentedJQuery $apply(IScope scope);
}

