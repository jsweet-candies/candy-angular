package def.angular.legacy.ng;
import def.js.RegExp;
import def.js.Function;
@jsweet.lang.Interface
public abstract class ICompileProvider extends IServiceProvider {
    native public ICompileProvider directive(String name, Function directiveFactory);
    native public ICompileProvider directive(Object directivesMap);
    native public RegExp aHrefSanitizationWhitelist();
    native public ICompileProvider aHrefSanitizationWhitelist(RegExp regexp);
    native public RegExp imgSrcSanitizationWhitelist();
    native public ICompileProvider imgSrcSanitizationWhitelist(RegExp regexp);
    native public Object debugInfoEnabled(Boolean enabled);
    native public Object debugInfoEnabled();
}

