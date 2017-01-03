package def.angular.legacy.ng;
public interface IDirectiveCompileFn {
    public IDirectivePrePost apply(IAugmentedJQuery templateElement, IAttributes templateAttributes, ITranscludeFunction transclude);
}

