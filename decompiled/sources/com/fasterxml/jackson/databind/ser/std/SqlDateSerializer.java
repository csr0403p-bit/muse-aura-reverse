package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.sql.Date;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class SqlDateSerializer extends DateTimeSerializerBase<Date> {
    public SqlDateSerializer() {
        super(null, Date.class, null);
    }
}
