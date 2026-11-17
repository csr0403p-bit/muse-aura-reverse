package com.fasterxml.jackson.databind.deser.std;

import X.EnumC10000GnW;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberDeserializers$ShortDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Short> {
    public static final NumberDeserializers$ShortDeserializer A00;
    public static final NumberDeserializers$ShortDeserializer A01;
    public static final long serialVersionUID = 1;

    static {
        Class cls = Short.TYPE;
        EnumC10000GnW enumC10000GnW = EnumC10000GnW.Integer;
        A00 = new NumberDeserializers$ShortDeserializer(enumC10000GnW, cls, (short) 0, (short) 0);
        A01 = new NumberDeserializers$ShortDeserializer(enumC10000GnW, Short.class, null, (short) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        if (r1 == X.EnumC10072Got.AsEmpty) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Short A0i(X.AbstractC9916Gl7 r5, X.AbstractC9904Gkk r6) throws com.fasterxml.jackson.databind.exc.MismatchedInputException, com.fasterxml.jackson.core.exc.InputCoercionException {
        /*
            r4 = this;
            boolean r0 = r5.A1w()
            if (r0 != 0) goto L88
            boolean r0 = r4._primitive
            if (r0 == 0) goto L13
            short r0 = r4.A1D(r5, r6)
        Le:
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
        L13:
            int r1 = r5.A1B()
            r0 = 1
            if (r1 == r0) goto L65
            r0 = 3
            if (r1 == r0) goto L6b
            r0 = 11
            if (r1 == r0) goto L83
            r0 = 6
            if (r1 == r0) goto L33
            r0 = 7
            if (r1 == r0) goto L88
            r0 = 8
            if (r1 == r0) goto L70
            com.fasterxml.jackson.databind.JsonDeserializer.A0S(r5, r6, r4)
        L2e:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L33:
            java.lang.String r2 = r5.A1c()
            X.Got r1 = r4.A0x(r6, r2)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L83
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 == r0) goto L7e
            java.lang.String r3 = r2.trim()
            boolean r0 = r4.A1J(r6, r3)
            if (r0 != 0) goto L83
            int r2 = X.HlV.A04(r3)     // Catch: java.lang.IllegalArgumentException -> L8d
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r2 < r0) goto L5a
            r1 = 32767(0x7fff, float:4.5916E-41)
            r0 = 0
            if (r2 <= r1) goto L5b
        L5a:
            r0 = 1
        L5b:
            if (r0 == 0) goto L69
            java.lang.Class<?> r1 = r4._valueClass
            java.lang.String r0 = "overflow, value cannot be represented as 16-bit value"
            com.fasterxml.jackson.databind.JsonDeserializer.A0X(r6, r1, r3, r0)
            goto L2e
        L65:
            com.fasterxml.jackson.databind.JsonDeserializer.A0T(r5, r6, r4)
            goto L2e
        L69:
            short r0 = (short) r2
            goto Le
        L6b:
            java.lang.Object r0 = r4.A16(r5, r6)
            goto L80
        L70:
            java.lang.Class<?> r0 = r4._valueClass
            X.Got r1 = r4.A0v(r5, r6, r0)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L83
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 != r0) goto L88
        L7e:
            T r0 = r4._emptyValue
        L80:
            java.lang.Short r0 = (java.lang.Short) r0
            return r0
        L83:
            java.lang.Object r0 = r4.AIA(r6)
            goto L80
        L88:
            short r0 = r5.A1h()
            goto Le
        L8d:
            java.lang.Class<?> r1 = r4._valueClass
            java.lang.String r0 = "not a valid Short value"
            com.fasterxml.jackson.databind.JsonDeserializer.A0X(r6, r1, r3, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer.A0i(X.Gl7, X.Gkk):java.lang.Short");
    }
}
