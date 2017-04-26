package def.angularjs.ng;
import def.jquery.JQuery;
import def.dom.Element;
@jsweet.lang.Interface
public abstract class ICompileService extends def.js.Object {
    native public ITemplateLinkingFunction $apply(String element, ITranscludeFunction transclude, double maxPriority);
    native public ITemplateLinkingFunction $apply(Element element, ITranscludeFunction transclude, double maxPriority);
    native public ITemplateLinkingFunction $apply(JQuery element, ITranscludeFunction transclude, double maxPriority);
    native public ITemplateLinkingFunction $apply(String element, ITranscludeFunction transclude);
    native public ITemplateLinkingFunction $apply(String element);
    native public ITemplateLinkingFunction $apply(Element element, ITranscludeFunction transclude);
    native public ITemplateLinkingFunction $apply(Element element);
    native public ITemplateLinkingFunction $apply(JQuery element, ITranscludeFunction transclude);
    native public ITemplateLinkingFunction $apply(JQuery element);
}

