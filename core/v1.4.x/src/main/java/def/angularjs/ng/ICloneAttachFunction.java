package def.angularjs.ng;
import def.jquery.JQuery;
public interface ICloneAttachFunction {
    public Object apply(JQuery clonedElement, IScope scope);
    public Object apply(JQuery clonedElement);
    public Object apply();
}

