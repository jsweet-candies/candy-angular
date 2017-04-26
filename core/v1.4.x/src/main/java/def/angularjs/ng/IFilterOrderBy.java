package def.angularjs.ng;
public interface IFilterOrderBy {
    /**
         * Orders a specified array by the expression predicate. It is ordered alphabetically for strings and numerically for numbers. Note: if you notice numbers are not being sorted as expected, make sure they are actually being saved as numbers and not strings.
         * @param array The array to sort.
         * @param expression A predicate to be used by the comparator to determine the order of elements.
         * @param reverse Reverse the order of the array.
         * @return Reverse the order of the array.
         */
    public <T> T[] $apply(T[] array, String expression, Boolean reverse);
    /**
         * Orders a specified array by the expression predicate. It is ordered alphabetically for strings and numerically for numbers. Note: if you notice numbers are not being sorted as expected, make sure they are actually being saved as numbers and not strings.
         * @param array The array to sort.
         * @param expression A predicate to be used by the comparator to determine the order of elements.
         * @param reverse Reverse the order of the array.
         * @return Reverse the order of the array.
         */
    public <T> T[] $apply(T[] array, String expression);
    /**
         * Orders a specified array by the expression predicate. It is ordered alphabetically for strings and numerically for numbers. Note: if you notice numbers are not being sorted as expected, make sure they are actually being saved as numbers and not strings.
         * @param array The array to sort.
         * @param expression A predicate to be used by the comparator to determine the order of elements.
         * @param reverse Reverse the order of the array.
         * @return Reverse the order of the array.
         */
    public <T> T[] $apply(T[] array, String[] expression, Boolean reverse);
    /**
         * Orders a specified array by the expression predicate. It is ordered alphabetically for strings and numerically for numbers. Note: if you notice numbers are not being sorted as expected, make sure they are actually being saved as numbers and not strings.
         * @param array The array to sort.
         * @param expression A predicate to be used by the comparator to determine the order of elements.
         * @param reverse Reverse the order of the array.
         * @return Reverse the order of the array.
         */
    public <T> T[] $apply(T[] array, java.util.function.Function<T,Object>[] expression, Boolean reverse);
    /**
         * Orders a specified array by the expression predicate. It is ordered alphabetically for strings and numerically for numbers. Note: if you notice numbers are not being sorted as expected, make sure they are actually being saved as numbers and not strings.
         * @param array The array to sort.
         * @param expression A predicate to be used by the comparator to determine the order of elements.
         * @param reverse Reverse the order of the array.
         * @return Reverse the order of the array.
         */
    public <T> T[] $apply(T[] array, java.util.function.Function<T,Object> expression, Boolean reverse);
    /**
         * Orders a specified array by the expression predicate. It is ordered alphabetically for strings and numerically for numbers. Note: if you notice numbers are not being sorted as expected, make sure they are actually being saved as numbers and not strings.
         * @param array The array to sort.
         * @param expression A predicate to be used by the comparator to determine the order of elements.
         * @param reverse Reverse the order of the array.
         * @return Reverse the order of the array.
         */
    public <T> T[] $apply(T[] array, String[] expression);
    /**
         * Orders a specified array by the expression predicate. It is ordered alphabetically for strings and numerically for numbers. Note: if you notice numbers are not being sorted as expected, make sure they are actually being saved as numbers and not strings.
         * @param array The array to sort.
         * @param expression A predicate to be used by the comparator to determine the order of elements.
         * @param reverse Reverse the order of the array.
         * @return Reverse the order of the array.
         */
    public <T> T[] $apply(T[] array, java.util.function.Function<T,Object> expression);
    /**
         * Orders a specified array by the expression predicate. It is ordered alphabetically for strings and numerically for numbers. Note: if you notice numbers are not being sorted as expected, make sure they are actually being saved as numbers and not strings.
         * @param array The array to sort.
         * @param expression A predicate to be used by the comparator to determine the order of elements.
         * @param reverse Reverse the order of the array.
         * @return Reverse the order of the array.
         */
    public <T> T[] $apply(T[] array, java.util.function.Function<T,Object>[] expression);
}

