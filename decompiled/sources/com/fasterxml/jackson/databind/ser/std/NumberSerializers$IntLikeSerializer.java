package com.fasterxml.jackson.databind.ser.std;

import X.EnumC10067Goo;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberSerializers$IntLikeSerializer extends NumberSerializers$Base<Object> {
    public static final NumberSerializers$IntLikeSerializer A00 = new NumberSerializers$IntLikeSerializer();

    public NumberSerializers$IntLikeSerializer() {
        super(EnumC10067Goo.INT, Number.class, "integer");
    }
}
