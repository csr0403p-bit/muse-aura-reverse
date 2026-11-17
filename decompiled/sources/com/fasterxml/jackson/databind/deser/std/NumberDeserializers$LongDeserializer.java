package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV7;
import X.EnumC10000GnW;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

@JacksonStdImpl
/* loaded from: classes6.dex */
public final class NumberDeserializers$LongDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Long> {
    public static final NumberDeserializers$LongDeserializer A00;
    public static final NumberDeserializers$LongDeserializer A01;
    public static final long serialVersionUID = 1;

    static {
        Class cls = Long.TYPE;
        Long lA0o = BV7.A0o();
        EnumC10000GnW enumC10000GnW = EnumC10000GnW.Integer;
        A00 = new NumberDeserializers$LongDeserializer(enumC10000GnW, cls, lA0o, lA0o);
        A01 = new NumberDeserializers$LongDeserializer(enumC10000GnW, Long.class, null, lA0o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Long A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException {
        long jA0t;
        if (abstractC9916Gl7.A1w()) {
            jA0t = abstractC9916Gl7.A1G();
        } else {
            if (!this._primitive) {
                return A15(abstractC9916Gl7, abstractC9904Gkk, Long.class);
            }
            jA0t = A0t(abstractC9916Gl7, abstractC9904Gkk);
        }
        return Long.valueOf(jA0t);
    }
}
