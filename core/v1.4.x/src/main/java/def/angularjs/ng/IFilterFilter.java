package def.angularjs.ng;
public interface IFilterFilter {
    public <T> T[] apply(T[] array, String expression, IFilterFilterComparatorFunc<T> comparator);
    public <T> T[] apply(T[] array, String expression);
    public <T> T[] apply(T[] array, String expression, Boolean comparator);
    public <T> T[] apply(T[] array, IFilterFilterPatternObject expression, Boolean comparator);
    public <T> T[] apply(T[] array, IFilterFilterPatternObject expression, IFilterFilterComparatorFunc<T> comparator);
    public <T> T[] apply(T[] array, IFilterFilterPredicateFunc<T> expression, IFilterFilterComparatorFunc<T> comparator);
    public <T> T[] apply(T[] array, IFilterFilterPredicateFunc<T> expression, Boolean comparator);
    public <T> T[] apply(T[] array, IFilterFilterPatternObject expression);
    public <T> T[] apply(T[] array, IFilterFilterPredicateFunc<T> expression);
}

