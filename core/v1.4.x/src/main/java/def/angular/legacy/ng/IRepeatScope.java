package def.angular.legacy.ng;
/**
     * $scope for ngRepeat directive.
     * see https://docs.angularjs.org/api/ng/directive/ngRepeat
     */
@jsweet.lang.Interface
public abstract class IRepeatScope extends IScope {
    /**
         * iterator offset of the repeated element (0..length-1).
         */
    public double $index;
    /**
         * true if the repeated element is first in the iterator.
         */
    public Boolean $first;
    /**
         * true if the repeated element is between the first and last in the iterator.
         */
    public Boolean $middle;
    /**
         * true if the repeated element is last in the iterator.
         */
    public Boolean $last;
    /**
         * true if the iterator position $index is even (otherwise false).
         */
    public Boolean $even;
    /**
         * true if the iterator position $index is odd (otherwise false).
         */
    public Boolean $odd;
}

