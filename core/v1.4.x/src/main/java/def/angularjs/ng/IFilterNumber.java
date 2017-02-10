package def.angularjs.ng;
public interface IFilterNumber {
    /**
         * Formats a number as text.
         * @param number Number to format.
         * @param fractionSize Number of decimal places to round the number to. If this is not provided then the fraction size is computed from the current locale's number formatting pattern. In the case of the default locale, it will be 3.
         * @return Number rounded to decimalPlaces and places a "," after each third digit.
         */
    public String apply(double value, double fractionSize);
    /**
         * Formats a number as text.
         * @param number Number to format.
         * @param fractionSize Number of decimal places to round the number to. If this is not provided then the fraction size is computed from the current locale's number formatting pattern. In the case of the default locale, it will be 3.
         * @return Number rounded to decimalPlaces and places a "," after each third digit.
         */
    public String apply(double value);
    /**
         * Formats a number as text.
         * @param number Number to format.
         * @param fractionSize Number of decimal places to round the number to. If this is not provided then the fraction size is computed from the current locale's number formatting pattern. In the case of the default locale, it will be 3.
         * @return Number rounded to decimalPlaces and places a "," after each third digit.
         */
    public String apply(String value, double fractionSize);
    /**
         * Formats a number as text.
         * @param number Number to format.
         * @param fractionSize Number of decimal places to round the number to. If this is not provided then the fraction size is computed from the current locale's number formatting pattern. In the case of the default locale, it will be 3.
         * @return Number rounded to decimalPlaces and places a "," after each third digit.
         */
    public String apply(double value, String fractionSize);
    /**
         * Formats a number as text.
         * @param number Number to format.
         * @param fractionSize Number of decimal places to round the number to. If this is not provided then the fraction size is computed from the current locale's number formatting pattern. In the case of the default locale, it will be 3.
         * @return Number rounded to decimalPlaces and places a "," after each third digit.
         */
    public String apply(String value, String fractionSize);
    /**
         * Formats a number as text.
         * @param number Number to format.
         * @param fractionSize Number of decimal places to round the number to. If this is not provided then the fraction size is computed from the current locale's number formatting pattern. In the case of the default locale, it will be 3.
         * @return Number rounded to decimalPlaces and places a "," after each third digit.
         */
    public String apply(String value);
}

