package def.angularjs.ng;
public interface IFilterCurrency {
    /**
         * Formats a number as a currency (ie $1,234.56). When no currency symbol is provided, default symbol for current locale is used.
         * @param amount Input to filter.
         * @param symbol Currency symbol or identifier to be displayed.
         * @param fractionSize Number of decimal places to round the amount to, defaults to default max fraction size for current locale
         * @return Formatted number
         */
    public String apply(double amount, String symbol, double fractionSize);
    /**
         * Formats a number as a currency (ie $1,234.56). When no currency symbol is provided, default symbol for current locale is used.
         * @param amount Input to filter.
         * @param symbol Currency symbol or identifier to be displayed.
         * @param fractionSize Number of decimal places to round the amount to, defaults to default max fraction size for current locale
         * @return Formatted number
         */
    public String apply(double amount, String symbol);
    /**
         * Formats a number as a currency (ie $1,234.56). When no currency symbol is provided, default symbol for current locale is used.
         * @param amount Input to filter.
         * @param symbol Currency symbol or identifier to be displayed.
         * @param fractionSize Number of decimal places to round the amount to, defaults to default max fraction size for current locale
         * @return Formatted number
         */
    public String apply(double amount);
}

