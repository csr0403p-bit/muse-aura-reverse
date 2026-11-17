package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC10109Gpa;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10110Gpb;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> implements InterfaceC9833GiW {
    public AbstractC10109Gpa _dynamicSerializers;
    public JsonSerializer<Object> _elementSerializer;
    public final AbstractC9870GjI _elementType;
    public final boolean _staticTyping;
    public final AbstractC9996GnP _valueTypeSerializer;

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0098: INVOKE (r9v0 ?? I:X.Gii), (r4 I:java.lang.Object), (r0 I:java.lang.Throwable), (r5 I:int) STATIC call: com.fasterxml.jackson.databind.ser.std.StdSerializer.A04(X.Gii, java.lang.Object, java.lang.Throwable, int):void A[MD:(X.Gii, java.lang.Object, java.lang.Throwable, int):void throws java.lang.Throwable (m)] (LINE:152), block:B:50:0x0098 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0098: INVOKE (r9v0 ?? I:X.Gii), (r4v0 ?? I:java.lang.Object), (r0v0 ?? I:java.lang.Throwable), (r5 I:int) STATIC call: com.fasterxml.jackson.databind.ser.std.StdSerializer.A04(X.Gii, java.lang.Object, java.lang.Throwable, int):void A[MD:(X.Gii, java.lang.Object, java.lang.Throwable, int):void throws java.lang.Throwable (m)] (LINE:152), block:B:50:0x0098 */
    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, ObjectArraySerializer objectArraySerializer, Object[] objArr) throws Throwable {
        Object objA04;
        int iA04;
        AbstractC10109Gpa abstractC10109GpaA01;
        AbstractC10109Gpa abstractC10109GpaA012;
        int length = objArr.length;
        if (length != 0) {
            JsonSerializer<Object> jsonSerializer = objectArraySerializer._elementSerializer;
            try {
                if (jsonSerializer != null) {
                    AbstractC9996GnP abstractC9996GnP = objectArraySerializer._valueTypeSerializer;
                    int i = 0;
                    do {
                        Object obj = objArr[i];
                        if (obj == null) {
                            abstractC9842Gii.A0U(abstractC9919GlE);
                        } else if (abstractC9996GnP == null) {
                            jsonSerializer.A0C(abstractC9919GlE, abstractC9842Gii, obj);
                        } else {
                            jsonSerializer.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, obj);
                        }
                        i++;
                    } while (i < length);
                    return;
                }
                AbstractC9996GnP abstractC9996GnP2 = objectArraySerializer._valueTypeSerializer;
                int i2 = 0;
                if (abstractC9996GnP2 != null) {
                    AbstractC10109Gpa abstractC10109Gpa = objectArraySerializer._dynamicSerializers;
                    do {
                        Object obj2 = objArr[i2];
                        if (obj2 == null) {
                            abstractC9842Gii.A0U(abstractC9919GlE);
                        } else {
                            Class<?> cls = obj2.getClass();
                            JsonSerializer<Object> jsonSerializerA00 = abstractC10109Gpa.A00(cls);
                            if (jsonSerializerA00 == null && abstractC10109Gpa != (abstractC10109GpaA012 = abstractC10109Gpa.A01((jsonSerializerA00 = abstractC9842Gii.A0L(objectArraySerializer._property, cls)), cls))) {
                                objectArraySerializer._dynamicSerializers = abstractC10109GpaA012;
                            }
                            jsonSerializerA00.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP2, obj2);
                        }
                        i2++;
                    } while (i2 < length);
                    return;
                }
                AbstractC10109Gpa abstractC10109Gpa2 = objectArraySerializer._dynamicSerializers;
                do {
                    Object obj3 = objArr[i2];
                    if (obj3 == null) {
                        abstractC9842Gii.A0U(abstractC9919GlE);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        JsonSerializer<Object> jsonSerializerA002 = abstractC10109Gpa2.A00(cls2);
                        if (jsonSerializerA002 == null) {
                            AbstractC9870GjI abstractC9870GjI = objectArraySerializer._elementType;
                            if (abstractC9870GjI.A0N()) {
                                AbstractC9870GjI abstractC9870GjIA0G = abstractC9842Gii.A0G(abstractC9870GjI, cls2);
                                jsonSerializerA002 = abstractC9842Gii.A0H(objectArraySerializer._property, abstractC9870GjIA0G);
                                abstractC10109GpaA01 = abstractC10109Gpa2.A01(jsonSerializerA002, abstractC9870GjIA0G._class);
                                if (abstractC10109Gpa2 != abstractC10109GpaA01) {
                                    objectArraySerializer._dynamicSerializers = abstractC10109GpaA01;
                                }
                            } else {
                                jsonSerializerA002 = abstractC9842Gii.A0L(objectArraySerializer._property, cls2);
                                abstractC10109GpaA01 = abstractC10109Gpa2.A01(jsonSerializerA002, cls2);
                                if (abstractC10109Gpa2 != abstractC10109GpaA01) {
                                    objectArraySerializer._dynamicSerializers = abstractC10109GpaA01;
                                }
                            }
                        }
                        jsonSerializerA002.A0C(abstractC9919GlE, abstractC9842Gii, obj3);
                    }
                    i2++;
                } while (i2 < length);
            } catch (Exception e) {
                StdSerializer.A04(abstractC9842Gii, objA04, e, iA04);
                throw F60.createAndThrow();
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;ZLX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;)V */
    public ObjectArraySerializer(AbstractC9870GjI abstractC9870GjI, JsonSerializer jsonSerializer, AbstractC9996GnP abstractC9996GnP, boolean z) {
        super(Object[].class);
        this._elementType = abstractC9870GjI;
        this._staticTyping = z;
        this._valueTypeSerializer = abstractC9996GnP;
        this._dynamicSerializers = C10110Gpb.A00;
        this._elementSerializer = jsonSerializer;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/ser/std/ObjectArraySerializer;LX/Gnp;LX/GnP;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Ljava/lang/Boolean;)V */
    public ObjectArraySerializer(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, AbstractC9996GnP abstractC9996GnP, ObjectArraySerializer objectArraySerializer, Boolean bool) {
        super(interfaceC10017Gnp, objectArraySerializer, bool);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = abstractC9996GnP;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = C10110Gpb.A00;
        this._elementSerializer = jsonSerializer;
    }
}
