package com.fasterxml.jackson.databind.ser.std;

import X.EnumC10067Goo;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberSerializers$FloatSerializer extends NumberSerializers$Base<Object> {
    public static final NumberSerializers$FloatSerializer A00 = new NumberSerializers$FloatSerializer();

    public NumberSerializers$FloatSerializer() {
        super(EnumC10067Goo.FLOAT, Float.class, "number");
    }
}
