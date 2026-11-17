package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Date;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class DateSerializer extends DateTimeSerializerBase<Date> {
    public static final DateSerializer A00 = new DateSerializer(null, Date.class, null);

    public DateSerializer() {
        super(null, Date.class, null);
    }
}
