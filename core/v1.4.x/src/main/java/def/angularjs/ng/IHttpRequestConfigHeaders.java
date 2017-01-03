package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class IHttpRequestConfigHeaders extends def.js.Object {
    native public jsweet.util.union.Union<String,java.util.function.Supplier<String>> $get(String requestType);
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,java.util.function.Supplier<String>> common;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,java.util.function.Supplier<String>> get;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,java.util.function.Supplier<String>> post;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,java.util.function.Supplier<String>> put;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,java.util.function.Supplier<String>> patch;
}

