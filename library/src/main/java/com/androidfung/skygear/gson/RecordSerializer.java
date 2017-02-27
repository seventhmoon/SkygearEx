package com.androidfung.skygear.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.Map;

import io.skygear.skygear.Record;

/**
 * Created by funglam on 2/21/17.
 * For use with Gson to serialize the Record object of Skygear
 * @author funglam
 */
public class RecordSerializer implements JsonSerializer<Record> {


    public JsonElement serialize(Record src, Type typeOfSrc, JsonSerializationContext context) {
        Map<String, Object> root = src.getData();
        Map<String, Object> firstLevel = src.getTransient();

        root.putAll(firstLevel);

        return context.serialize(root);

    }
}
