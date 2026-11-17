package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class EnumSetSerializer extends AsArraySerializerBase<EnumSet<? extends Enum<?>>> {
    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, EnumSetSerializer enumSetSerializer, EnumSet enumSet) {
        JsonSerializer<Object> jsonSerializerA0L = enumSetSerializer._elementSerializer;
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            Enum r2 = (Enum) it.next();
            if (jsonSerializerA0L == null) {
                jsonSerializerA0L = abstractC9842Gii.A0L(enumSetSerializer._property, r2.getDeclaringClass());
            }
            jsonSerializerA0L.A0C(abstractC9919GlE, abstractC9842Gii, r2);
        }
    }
}
