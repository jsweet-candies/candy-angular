package def.angularjs.ng;
public interface IFilterJson {
    /**
         * Allows you to convert a JavaScript object into JSON string.
         * @param object Any JavaScript object (including arrays and primitive types) to filter.
         * @param spacing The number of spaces to use per indentation, defaults to 2.
         * @return JSON string.
         */
    public String apply(Object object, double spacing);
    /**
         * Allows you to convert a JavaScript object into JSON string.
         * @param object Any JavaScript object (including arrays and primitive types) to filter.
         * @param spacing The number of spaces to use per indentation, defaults to 2.
         * @return JSON string.
         */
    public String apply(Object object);
}

