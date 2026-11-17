package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC10109Gpa;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.Iterator;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>> {
    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, IteratorSerializer iteratorSerializer, Iterator it) throws InvalidDefinitionException {
        AbstractC10109Gpa abstractC10109GpaA01;
        if (it.hasNext()) {
            JsonSerializer<Object> jsonSerializer = iteratorSerializer._elementSerializer;
            if (jsonSerializer != null) {
                AbstractC9996GnP abstractC9996GnP = iteratorSerializer._valueTypeSerializer;
                do {
                    Object next = it.next();
                    if (next == null) {
                        abstractC9842Gii.A0U(abstractC9919GlE);
                    } else {
                        JsonSerializer.A07(abstractC9919GlE, jsonSerializer, abstractC9842Gii, abstractC9996GnP, next);
                    }
                } while (it.hasNext());
                return;
            }
            AbstractC9996GnP abstractC9996GnP2 = iteratorSerializer._valueTypeSerializer;
            AbstractC10109Gpa abstractC10109Gpa = iteratorSerializer._dynamicSerializers;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    abstractC9842Gii.A0U(abstractC9919GlE);
                } else {
                    Class<?> cls = next2.getClass();
                    JsonSerializer<Object> jsonSerializerA00 = abstractC10109Gpa.A00(cls);
                    if (jsonSerializerA00 == null) {
                        AbstractC9870GjI abstractC9870GjI = iteratorSerializer._elementType;
                        if (abstractC9870GjI.A0N()) {
                            AbstractC9870GjI abstractC9870GjIA0G = abstractC9842Gii.A0G(abstractC9870GjI, cls);
                            jsonSerializerA00 = abstractC9842Gii.A0H(iteratorSerializer._property, abstractC9870GjIA0G);
                            abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, abstractC9870GjIA0G._class);
                        } else {
                            jsonSerializerA00 = abstractC9842Gii.A0L(iteratorSerializer._property, cls);
                            abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, cls);
                        }
                        if (abstractC10109Gpa != abstractC10109GpaA01) {
                            iteratorSerializer._dynamicSerializers = abstractC10109GpaA01;
                        }
                        abstractC10109Gpa = iteratorSerializer._dynamicSerializers;
                    }
                    JsonSerializer.A07(abstractC9919GlE, jsonSerializerA00, abstractC9842Gii, abstractC9996GnP2, next2);
                }
            } while (it.hasNext());
        }
    }
}
