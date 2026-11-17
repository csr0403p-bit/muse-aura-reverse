package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.EnumC10000GnW;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public final class NumberDeserializers$IntegerDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Integer> {
    public static final NumberDeserializers$IntegerDeserializer A00;
    public static final NumberDeserializers$IntegerDeserializer A01;
    public static final long serialVersionUID = 1;

    static {
        Class cls = Integer.TYPE;
        Integer numA0V = BV4.A0V();
        EnumC10000GnW enumC10000GnW = EnumC10000GnW.Integer;
        A00 = new NumberDeserializers$IntegerDeserializer(enumC10000GnW, cls, numA0V, numA0V);
        A01 = new NumberDeserializers$IntegerDeserializer(enumC10000GnW, Integer.class, null, numA0V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Integer A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        int iA0s;
        if (abstractC9916Gl7.A1w()) {
            iA0s = abstractC9916Gl7.A1C();
        } else {
            if (!this._primitive) {
                return A14(abstractC9916Gl7, abstractC9904Gkk, Integer.class);
            }
            iA0s = A0s(abstractC9916Gl7, abstractC9904Gkk);
        }
        return Integer.valueOf(iA0s);
    }
}
