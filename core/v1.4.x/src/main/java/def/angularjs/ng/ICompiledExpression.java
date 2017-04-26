package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class ICompiledExpression extends def.js.Object {
    native public Object $apply(Object context, Object locals);
    public Boolean literal;
    public Boolean constant;
    native public Object assign(Object context, Object value);
    native public Object $apply(Object context);
}

