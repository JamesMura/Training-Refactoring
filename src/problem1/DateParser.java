package problem1;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateParser {
    private final String dateAndTimeString;

    public DateParser(String dateAndTimeString) {
        this.dateAndTimeString = dateAndTimeString;
    }

    public Date parse() {
        int year, month, date, hour, minute;

        year = parseValue("Year", 2012, 2000, 0, 4);

        month = parseValue("Month", 12, 1, 5, 7);

        date = parseValue("Date", 31, 1, 8, 10);

        hour = parseValue("Hour", 23, 0, 11, 13);

        minute = parseValue("Minute", 59, 0, 14, 16);

        Calendar calendar = getCalendar();
        calendar.set(year, month - 1, date, hour, minute, 0);
        return calendar.getTime();
    }

    private Calendar getCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

    private int parseValue(String type, int max, int min, int start, int stop) {
        int valueType;
        try {
            String dataString = dateAndTimeString.substring(start, stop);
            valueType = Integer.parseInt(dataString);
        } catch (StringIndexOutOfBoundsException e) {
            int delta = stop - start;
            throw new IllegalArgumentException(type + " string is less than " + delta + " characters");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(type + " is not an integer");
        }
        if (valueType < min || valueType > max)
            throw new IllegalArgumentException(type + " cannot be less than " + min + " or more than " + max);
        return valueType;
    }


}