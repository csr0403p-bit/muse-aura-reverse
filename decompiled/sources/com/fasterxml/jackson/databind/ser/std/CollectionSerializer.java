package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC10109Gpa;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.F60;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    public static final long serialVersionUID = 1;

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0095: INVOKE (r9v0 ?? I:X.Gii), (r11v0 ?? I:java.lang.Object), (r0v0 ?? I:java.lang.Throwable), (r4 I:int) STATIC call: com.fasterxml.jackson.databind.ser.std.StdSerializer.A04(X.Gii, java.lang.Object, java.lang.Throwable, int):void A[MD:(X.Gii, java.lang.Object, java.lang.Throwable, int):void throws java.lang.Throwable (m)] (LINE:149), block:B:41:0x0095 */
    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, CollectionSerializer collectionSerializer, Collection collection) {
        int iA04;
        AbstractC10109Gpa abstractC10109GpaA01;
        abstractC9919GlE.A0i(collection);
        JsonSerializer<Object> jsonSerializer = collectionSerializer._elementSerializer;
        try {
            if (jsonSerializer != null) {
                Iterator it = collection.iterator();
                if (it.hasNext()) {
                    AbstractC9996GnP abstractC9996GnP = collectionSerializer._valueTypeSerializer;
                    int i = 0;
                    do {
                        Object next = it.next();
                        if (next == null) {
                            abstractC9842Gii.A0U(abstractC9919GlE);
                        } else if (abstractC9996GnP == null) {
                            jsonSerializer.A0C(abstractC9919GlE, abstractC9842Gii, next);
                        } else {
                            jsonSerializer.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, next);
                        }
                        i++;
                    } while (it.hasNext());
                    return;
                }
                return;
            }
            Iterator it2 = collection.iterator();
            if (it2.hasNext()) {
                AbstractC10109Gpa abstractC10109Gpa = collectionSerializer._dynamicSerializers;
                AbstractC9996GnP abstractC9996GnP2 = collectionSerializer._valueTypeSerializer;
                int i2 = 0;
                do {
                    Object next2 = it2.next();
                    if (next2 == null) {
                        abstractC9842Gii.A0U(abstractC9919GlE);
                    } else {
                        Class<?> cls = next2.getClass();
                        JsonSerializer<Object> jsonSerializerA00 = abstractC10109Gpa.A00(cls);
                        if (jsonSerializerA00 == null) {
                            AbstractC9870GjI abstractC9870GjI = collectionSerializer._elementType;
                            if (abstractC9870GjI.A0N()) {
                                AbstractC9870GjI abstractC9870GjIA0G = abstractC9842Gii.A0G(abstractC9870GjI, cls);
                                jsonSerializerA00 = abstractC9842Gii.A0H(collectionSerializer._property, abstractC9870GjIA0G);
                                abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, abstractC9870GjIA0G._class);
                                if (abstractC10109Gpa != abstractC10109GpaA01) {
                                    collectionSerializer._dynamicSerializers = abstractC10109GpaA01;
                                }
                                abstractC10109Gpa = collectionSerializer._dynamicSerializers;
                            } else {
                                jsonSerializerA00 = abstractC9842Gii.A0L(collectionSerializer._property, cls);
                                abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA00, cls);
                                if (abstractC10109Gpa != abstractC10109GpaA01) {
                                    collectionSerializer._dynamicSerializers = abstractC10109GpaA01;
                                }
                                abstractC10109Gpa = collectionSerializer._dynamicSerializers;
                            }
                        }
                        if (abstractC9996GnP2 == null) {
                            jsonSerializerA00.A0C(abstractC9919GlE, abstractC9842Gii, next2);
                        } else {
                            jsonSerializerA00.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP2, next2);
                        }
                    }
                    i2++;
                } while (it2.hasNext());
            }
        } catch (Exception e) {
            StdSerializer.A04(abstractC9842Gii, collection, e, iA04);
            throw F60.createAndThrow();
        }
    }
}
