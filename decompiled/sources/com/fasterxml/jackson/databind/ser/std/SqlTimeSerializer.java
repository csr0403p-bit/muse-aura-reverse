package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.sql.Time;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class SqlTimeSerializer extends StdScalarSerializer<Time> {
    public SqlTimeSerializer() {
        super(Time.class);
    }
}
