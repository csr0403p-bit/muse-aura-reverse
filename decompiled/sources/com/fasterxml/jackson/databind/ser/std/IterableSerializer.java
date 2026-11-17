package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Iterator;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class IterableSerializer extends AsArraySerializerBase<Iterable<?>> {
    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, IterableSerializer iterableSerializer, Iterable iterable) {
        JsonSerializer<Object> jsonSerializer;
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            AbstractC9996GnP abstractC9996GnP = iterableSerializer._valueTypeSerializer;
            Class<?> cls = null;
            JsonSerializer<Object> jsonSerializerA0N = null;
            do {
                Object next = it.next();
                if (next == null) {
                    abstractC9842Gii.A0U(abstractC9919GlE);
                } else {
                    JsonSerializer<Object> jsonSerializer2 = iterableSerializer._elementSerializer;
                    if (jsonSerializer2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            jsonSerializerA0N = abstractC9842Gii.A0N(iterableSerializer._property, cls2);
                            cls = cls2;
                        }
                        jsonSerializer = jsonSerializerA0N;
                    } else {
                        jsonSerializer = jsonSerializerA0N;
                        jsonSerializerA0N = jsonSerializer2;
                    }
                    JsonSerializer.A07(abstractC9919GlE, jsonSerializerA0N, abstractC9842Gii, abstractC9996GnP, next);
                    jsonSerializerA0N = jsonSerializer;
                }
            } while (it.hasNext());
        }
    }
}
