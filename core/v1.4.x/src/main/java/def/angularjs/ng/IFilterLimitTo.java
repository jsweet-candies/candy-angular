package def.angularjs.ng;
@jsweet.lang.Interface
public abstract class IFilterLimitTo extends def.js.Object {
    /**
         * Creates a new array containing only a specified number of elements. The elements are taken from either the beginning or the end of the source array, string or number, as specified by the value and sign (positive or negative) of limit.
         * @param input Source array to be limited.
         * @param limit The length of the returned array. If the limit number is positive, limit number of items from the beginning of the source array/string are copied. If the number is negative, limit number of items from the end of the source array are copied. The limit will be trimmed if it exceeds array.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new sub-array of length limit or less if input array had less than limit elements.
         */
    native public <T> T[] $apply(T[] input, String limit, String begin);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(String input, String limit, String begin);
    /**
         * Creates a new array containing only a specified number of elements. The elements are taken from either the beginning or the end of the source array, string or number, as specified by the value and sign (positive or negative) of limit.
         * @param input Source array to be limited.
         * @param limit The length of the returned array. If the limit number is positive, limit number of items from the beginning of the source array/string are copied. If the number is negative, limit number of items from the end of the source array are copied. The limit will be trimmed if it exceeds array.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new sub-array of length limit or less if input array had less than limit elements.
         */
    native public <T> T[] $apply(T[] input, String limit);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(String input, String limit);
    /**
         * Creates a new array containing only a specified number of elements. The elements are taken from either the beginning or the end of the source array, string or number, as specified by the value and sign (positive or negative) of limit.
         * @param input Source array to be limited.
         * @param limit The length of the returned array. If the limit number is positive, limit number of items from the beginning of the source array/string are copied. If the number is negative, limit number of items from the end of the source array are copied. The limit will be trimmed if it exceeds array.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new sub-array of length limit or less if input array had less than limit elements.
         */
    native public <T> T[] $apply(T[] input, String limit, double begin);
    /**
         * Creates a new array containing only a specified number of elements. The elements are taken from either the beginning or the end of the source array, string or number, as specified by the value and sign (positive or negative) of limit.
         * @param input Source array to be limited.
         * @param limit The length of the returned array. If the limit number is positive, limit number of items from the beginning of the source array/string are copied. If the number is negative, limit number of items from the end of the source array are copied. The limit will be trimmed if it exceeds array.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new sub-array of length limit or less if input array had less than limit elements.
         */
    native public <T> T[] $apply(T[] input, double limit, double begin);
    /**
         * Creates a new array containing only a specified number of elements. The elements are taken from either the beginning or the end of the source array, string or number, as specified by the value and sign (positive or negative) of limit.
         * @param input Source array to be limited.
         * @param limit The length of the returned array. If the limit number is positive, limit number of items from the beginning of the source array/string are copied. If the number is negative, limit number of items from the end of the source array are copied. The limit will be trimmed if it exceeds array.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new sub-array of length limit or less if input array had less than limit elements.
         */
    native public <T> T[] $apply(T[] input, double limit, String begin);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(double input, double limit, double begin);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(double input, String limit, String begin);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(double input, double limit, String begin);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(String input, String limit, double begin);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(String input, double limit, String begin);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(double input, String limit, double begin);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(String input, double limit, double begin);
    /**
         * Creates a new array containing only a specified number of elements. The elements are taken from either the beginning or the end of the source array, string or number, as specified by the value and sign (positive or negative) of limit.
         * @param input Source array to be limited.
         * @param limit The length of the returned array. If the limit number is positive, limit number of items from the beginning of the source array/string are copied. If the number is negative, limit number of items from the end of the source array are copied. The limit will be trimmed if it exceeds array.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new sub-array of length limit or less if input array had less than limit elements.
         */
    native public <T> T[] $apply(T[] input, double limit);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(String input, double limit);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(double input, double limit);
    /**
         * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
         * @param input Source string or number to be limited.
         * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
         * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
         * @return A new substring of length limit or less if input had less than limit elements.
         */
    native public String $apply(double input, String limit);
}

