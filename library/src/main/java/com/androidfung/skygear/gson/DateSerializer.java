package com.androidfung.skygear.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * Created by funglam on 3/3/17.
 */

public class DateSerializer implements JsonSerializer<Date> {
    @Override
    public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
        DateTimeFormatter formatter = ISODateTimeFormat.dateTime().withZoneUTC();
        String value = formatter.print(new DateTime(src));
        return context.serialize(value);
    }
}
