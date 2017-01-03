package def.angular.legacy.ng;
@jsweet.lang.Interface
public abstract class ISCEService extends def.js.Object {
    native public Object getTrusted(String type, Object mayBeTrusted);
    native public Object getTrustedCss(Object value);
    native public Object getTrustedHtml(Object value);
    native public Object getTrustedJs(Object value);
    native public Object getTrustedResourceUrl(Object value);
    native public Object getTrustedUrl(Object value);
    native public java.util.function.BiFunction<Object,Object,Object> parse(String type, String expression);
    native public java.util.function.BiFunction<Object,Object,Object> parseAsCss(String expression);
    native public java.util.function.BiFunction<Object,Object,Object> parseAsHtml(String expression);
    native public java.util.function.BiFunction<Object,Object,Object> parseAsJs(String expression);
    native public java.util.function.BiFunction<Object,Object,Object> parseAsResourceUrl(String expression);
    native public java.util.function.BiFunction<Object,Object,Object> parseAsUrl(String expression);
    native public Object trustAs(String type, Object value);
    native public Object trustAsHtml(Object value);
    native public Object trustAsJs(Object value);
    native public Object trustAsResourceUrl(Object value);
    native public Object trustAsUrl(Object value);
    native public Boolean isEnabled();
}

