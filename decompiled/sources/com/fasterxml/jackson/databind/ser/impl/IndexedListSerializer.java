package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC10109Gpa;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.F60;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.List;

@JacksonStdImpl
/* loaded from: classes6.dex */
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    public static final long serialVersionUID = 1;

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00ce: INVOKE (r9v0 ?? I:X.Gii), (r11v0 ?? I:java.lang.Object), (r0v0 ?? I:java.lang.Throwable), (r5 I:int) STATIC call: com.fasterxml.jackson.databind.ser.std.StdSerializer.A04(X.Gii, java.lang.Object, java.lang.Throwable, int):void A[MD:(X.Gii, java.lang.Object, java.lang.Throwable, int):void throws java.lang.Throwable (m)] (LINE:206), block:B:60:0x00ce */
    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, IndexedListSerializer indexedListSerializer, List list) throws Throwable {
        int iA04;
        AbstractC10109Gpa abstractC10109GpaA01;
        AbstractC10109Gpa abstractC10109GpaA012;
        JsonSerializer<Object> jsonSerializer = indexedListSerializer._elementSerializer;
        try {
            if (jsonSerializer != null) {
                int size = list.size();
                if (size != 0) {
                    AbstractC9996GnP abstractC9996GnP = indexedListSerializer._valueTypeSerializer;
                    for (int i = 0; i < size; i++) {
                        Object obj = list.get(i);
                        if (obj == null) {
                            abstractC9842Gii.A0U(abstractC9919GlE);
                        } else if (abstractC9996GnP == null) {
                            jsonSerializer.A0C(abstractC9919GlE, abstractC9842Gii, obj);
                        } else {
                            jsonSerializer.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, obj);
                        }
                    }
                    return;
                }
                return;
            }
            if (indexedListSerializer._valueTypeSerializer == null) {
                int size2 = list.size();
                if (size2 != 0) {
                    AbstractC10109Gpa abstractC10109Gpa = indexedListSerializer._dynamicSerializers;
                    for (int i2 = 0; i2 < size2; i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 == null) {
                            abstractC9842Gii.A0U(abstractC9919GlE);
                        } else {
                            Class<?> cls = obj2.getClass();
                            JsonSerializer<Object> jsonSerializerA00 = abstractC10109Gpa.A00(cls);
                            if (jsonSerializerA00 == null) {
                                AbstractC9870GjI abstractC9870GjI = indexedListSerializer._elementType;
                                if (abstractC9870GjI.A0N()) {
                                    AbstractC9870GjI abstractC9870GjIA0G = abstractC9842Gii.A0G(abstractC9870GjI, cls);
                                    jsonSerializerA00 = abstractC9842Gii.A0H(indexedListSerializer._property, abstractC9870GjIA0G);
                                    abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, abstractC9870GjIA0G._class);
                                    if (abstractC10109Gpa != abstractC10109GpaA01) {
                                        indexedListSerializer._dynamicSerializers = abstractC10109GpaA01;
                                    }
                                    abstractC10109Gpa = indexedListSerializer._dynamicSerializers;
                                } else {
                                    jsonSerializerA00 = abstractC9842Gii.A0L(indexedListSerializer._property, cls);
                                    abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, cls);
                                    if (abstractC10109Gpa != abstractC10109GpaA01) {
                                        indexedListSerializer._dynamicSerializers = abstractC10109GpaA01;
                                    }
                                    abstractC10109Gpa = indexedListSerializer._dynamicSerializers;
                                }
                            }
                            jsonSerializerA00.A0C(abstractC9919GlE, abstractC9842Gii, obj2);
                        }
                    }
                    return;
                }
                return;
            }
            int size3 = list.size();
            if (size3 != 0) {
                AbstractC9996GnP abstractC9996GnP2 = indexedListSerializer._valueTypeSerializer;
                AbstractC10109Gpa abstractC10109Gpa2 = indexedListSerializer._dynamicSerializers;
                for (int i3 = 0; i3 < size3; i3++) {
                    Object obj3 = list.get(i3);
                    if (obj3 == null) {
                        abstractC9842Gii.A0U(abstractC9919GlE);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        JsonSerializer<Object> jsonSerializerA002 = abstractC10109Gpa2.A00(cls2);
                        if (jsonSerializerA002 == null) {
                            AbstractC9870GjI abstractC9870GjI2 = indexedListSerializer._elementType;
                            if (abstractC9870GjI2.A0N()) {
                                AbstractC9870GjI abstractC9870GjIA0G2 = abstractC9842Gii.A0G(abstractC9870GjI2, cls2);
                                jsonSerializerA002 = abstractC9842Gii.A0H(indexedListSerializer._property, abstractC9870GjIA0G2);
                                abstractC10109GpaA012 = abstractC10109Gpa2.A01(jsonSerializerA002, abstractC9870GjIA0G2._class);
                                if (abstractC10109Gpa2 != abstractC10109GpaA012) {
                                    indexedListSerializer._dynamicSerializers = abstractC10109GpaA012;
                                }
                                abstractC10109Gpa2 = indexedListSerializer._dynamicSerializers;
                            } else {
                                jsonSerializerA002 = abstractC9842Gii.A0L(indexedListSerializer._property, cls2);
                                abstractC10109GpaA012 = abstractC10109Gpa2.A01(jsonSerializerA002, cls2);
                                if (abstractC10109Gpa2 != abstractC10109GpaA012) {
                                    indexedListSerializer._dynamicSerializers = abstractC10109GpaA012;
                                }
                                abstractC10109Gpa2 = indexedListSerializer._dynamicSerializers;
                            }
                        }
                        jsonSerializerA002.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP2, obj3);
                    }
                }
            }
        } catch (Exception e) {
            StdSerializer.A04(abstractC9842Gii, list, e, iA04);
            throw F60.createAndThrow();
        }
    }
}
