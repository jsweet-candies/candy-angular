package def.angular.legacy.ng;
import def.js.Date;
public interface IFilterDate {
    /**
         * Formats date to a string based on the requested format.
         *
         * @param date Date to format either as Date object, milliseconds (string or number) or various ISO 8601 datetime string formats (e.g. yyyy-MM-ddTHH:mm:ss.sssZ and its shorter versions like yyyy-MM-ddTHH:mmZ, yyyy-MM-dd or yyyyMMddTHHmmssZ). If no timezone is specified in the string input, the time is considered to be in the local timezone.
         * @param format Formatting rules (see Description). If not specified, mediumDate is used.
         * @param timezone Timezone to be used for formatting. It understands UTC/GMT and the continental US time zone abbreviations, but for general use, use a time zone offset, for example, '+0430' (4 hours, 30 minutes east of the Greenwich meridian) If not specified, the timezone of the browser will be used.
         * @return Formatted string or the input if input is not recognized as date/millis.
         */
    public String apply(Date date, String format, String timezone);
    /**
         * Formats date to a string based on the requested format.
         *
         * @param date Date to format either as Date object, milliseconds (string or number) or various ISO 8601 datetime string formats (e.g. yyyy-MM-ddTHH:mm:ss.sssZ and its shorter versions like yyyy-MM-ddTHH:mmZ, yyyy-MM-dd or yyyyMMddTHHmmssZ). If no timezone is specified in the string input, the time is considered to be in the local timezone.
         * @param format Formatting rules (see Description). If not specified, mediumDate is used.
         * @param timezone Timezone to be used for formatting. It understands UTC/GMT and the continental US time zone abbreviations, but for general use, use a time zone offset, for example, '+0430' (4 hours, 30 minutes east of the Greenwich meridian) If not specified, the timezone of the browser will be used.
         * @return Formatted string or the input if input is not recognized as date/millis.
         */
    public String apply(Date date, String format);
    /**
         * Formats date to a string based on the requested format.
         *
         * @param date Date to format either as Date object, milliseconds (string or number) or various ISO 8601 datetime string formats (e.g. yyyy-MM-ddTHH:mm:ss.sssZ and its shorter versions like yyyy-MM-ddTHH:mmZ, yyyy-MM-dd or yyyyMMddTHHmmssZ). If no timezone is specified in the string input, the time is considered to be in the local timezone.
         * @param format Formatting rules (see Description). If not specified, mediumDate is used.
         * @param timezone Timezone to be used for formatting. It understands UTC/GMT and the continental US time zone abbreviations, but for general use, use a time zone offset, for example, '+0430' (4 hours, 30 minutes east of the Greenwich meridian) If not specified, the timezone of the browser will be used.
         * @return Formatted string or the input if input is not recognized as date/millis.
         */
    public String apply(Date date);
    /**
         * Formats date to a string based on the requested format.
         *
         * @param date Date to format either as Date object, milliseconds (string or number) or various ISO 8601 datetime string formats (e.g. yyyy-MM-ddTHH:mm:ss.sssZ and its shorter versions like yyyy-MM-ddTHH:mmZ, yyyy-MM-dd or yyyyMMddTHHmmssZ). If no timezone is specified in the string input, the time is considered to be in the local timezone.
         * @param format Formatting rules (see Description). If not specified, mediumDate is used.
         * @param timezone Timezone to be used for formatting. It understands UTC/GMT and the continental US time zone abbreviations, but for general use, use a time zone offset, for example, '+0430' (4 hours, 30 minutes east of the Greenwich meridian) If not specified, the timezone of the browser will be used.
         * @return Formatted string or the input if input is not recognized as date/millis.
         */
    public String apply(double date, String format, String timezone);
    /**
         * Formats date to a string based on the requested format.
         *
         * @param date Date to format either as Date object, milliseconds (string or number) or various ISO 8601 datetime string formats (e.g. yyyy-MM-ddTHH:mm:ss.sssZ and its shorter versions like yyyy-MM-ddTHH:mmZ, yyyy-MM-dd or yyyyMMddTHHmmssZ). If no timezone is specified in the string input, the time is considered to be in the local timezone.
         * @param format Formatting rules (see Description). If not specified, mediumDate is used.
         * @param timezone Timezone to be used for formatting. It understands UTC/GMT and the continental US time zone abbreviations, but for general use, use a time zone offset, for example, '+0430' (4 hours, 30 minutes east of the Greenwich meridian) If not specified, the timezone of the browser will be used.
         * @return Formatted string or the input if input is not recognized as date/millis.
         */
    public String apply(String date, String format, String timezone);
    /**
         * Formats date to a string based on the requested format.
         *
         * @param date Date to format either as Date object, milliseconds (string or number) or various ISO 8601 datetime string formats (e.g. yyyy-MM-ddTHH:mm:ss.sssZ and its shorter versions like yyyy-MM-ddTHH:mmZ, yyyy-MM-dd or yyyyMMddTHHmmssZ). If no timezone is specified in the string input, the time is considered to be in the local timezone.
         * @param format Formatting rules (see Description). If not specified, mediumDate is used.
         * @param timezone Timezone to be used for formatting. It understands UTC/GMT and the continental US time zone abbreviations, but for general use, use a time zone offset, for example, '+0430' (4 hours, 30 minutes east of the Greenwich meridian) If not specified, the timezone of the browser will be used.
         * @return Formatted string or the input if input is not recognized as date/millis.
         */
    public String apply(double date, String format);
    /**
         * Formats date to a string based on the requested format.
         *
         * @param date Date to format either as Date object, milliseconds (string or number) or various ISO 8601 datetime string formats (e.g. yyyy-MM-ddTHH:mm:ss.sssZ and its shorter versions like yyyy-MM-ddTHH:mmZ, yyyy-MM-dd or yyyyMMddTHHmmssZ). If no timezone is specified in the string input, the time is considered to be in the local timezone.
         * @param format Formatting rules (see Description). If not specified, mediumDate is used.
         * @param timezone Timezone to be used for formatting. It understands UTC/GMT and the continental US time zone abbreviations, but for general use, use a time zone offset, for example, '+0430' (4 hours, 30 minutes east of the Greenwich meridian) If not specified, the timezone of the browser will be used.
         * @return Formatted string or the input if input is not recognized as date/millis.
         */
    public String apply(String date, String format);
    /**
         * Formats date to a string based on the requested format.
         *
         * @param date Date to format either as Date object, milliseconds (string or number) or various ISO 8601 datetime string formats (e.g. yyyy-MM-ddTHH:mm:ss.sssZ and its shorter versions like yyyy-MM-ddTHH:mmZ, yyyy-MM-dd or yyyyMMddTHHmmssZ). If no timezone is specified in the string input, the time is considered to be in the local timezone.
         * @param format Formatting rules (see Description). If not specified, mediumDate is used.
         * @param timezone Timezone to be used for formatting. It understands UTC/GMT and the continental US time zone abbreviations, but for general use, use a time zone offset, for example, '+0430' (4 hours, 30 minutes east of the Greenwich meridian) If not specified, the timezone of the browser will be used.
         * @return Formatted string or the input if input is not recognized as date/millis.
         */
    public String apply(String date);
    /**
         * Formats date to a string based on the requested format.
         *
         * @param date Date to format either as Date object, milliseconds (string or number) or various ISO 8601 datetime string formats (e.g. yyyy-MM-ddTHH:mm:ss.sssZ and its shorter versions like yyyy-MM-ddTHH:mmZ, yyyy-MM-dd or yyyyMMddTHHmmssZ). If no timezone is specified in the string input, the time is considered to be in the local timezone.
         * @param format Formatting rules (see Description). If not specified, mediumDate is used.
         * @param timezone Timezone to be used for formatting. It understands UTC/GMT and the continental US time zone abbreviations, but for general use, use a time zone offset, for example, '+0430' (4 hours, 30 minutes east of the Greenwich meridian) If not specified, the timezone of the browser will be used.
         * @return Formatted string or the input if input is not recognized as date/millis.
         */
    public String apply(double date);
}

