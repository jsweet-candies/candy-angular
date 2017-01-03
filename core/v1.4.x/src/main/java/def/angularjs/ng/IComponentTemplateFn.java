package def.angularjs.ng;
public interface IComponentTemplateFn {
    public String apply(IAugmentedJQuery $element, IAttributes $attrs);
    public String apply(IAugmentedJQuery $element);
    public String apply();
}

