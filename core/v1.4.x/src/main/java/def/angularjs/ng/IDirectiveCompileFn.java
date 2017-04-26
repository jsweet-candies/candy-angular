package def.angularjs.ng;
public interface IDirectiveCompileFn {
    public IDirectivePrePost $apply(IAugmentedJQuery templateElement, IAttributes templateAttributes, ITranscludeFunction transclude);
}

