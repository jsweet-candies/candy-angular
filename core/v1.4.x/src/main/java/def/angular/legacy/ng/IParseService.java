package def.angular.legacy.ng;
public interface IParseService {
    public ICompiledExpression apply(String expression, jsweet.util.function.TriFunction<Object,IScope,Object,Object> interceptorFn, Boolean expensiveChecks);
    public ICompiledExpression apply(String expression, jsweet.util.function.TriFunction<Object,IScope,Object,Object> interceptorFn);
    public ICompiledExpression apply(String expression);
}

