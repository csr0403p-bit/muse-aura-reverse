package com.fasterxml.jackson.databind.ser.std;

import X.EnumC10067Goo;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberSerializers$ShortSerializer extends NumberSerializers$Base<Object> {
    public static final NumberSerializers$ShortSerializer A00 = new NumberSerializers$ShortSerializer();

    public NumberSerializers$ShortSerializer() {
        super(EnumC10067Goo.INT, Short.class, "integer");
    }
}
