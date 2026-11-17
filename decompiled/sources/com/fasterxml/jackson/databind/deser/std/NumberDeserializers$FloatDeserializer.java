package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass005;
import X.EnumC10000GnW;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberDeserializers$FloatDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Float> {
    public static final NumberDeserializers$FloatDeserializer A00;
    public static final NumberDeserializers$FloatDeserializer A01;
    public static final long serialVersionUID = 1;

    static {
        Class cls = Float.TYPE;
        Float fA0a = AnonymousClass005.A0a();
        EnumC10000GnW enumC10000GnW = EnumC10000GnW.Float;
        A00 = new NumberDeserializers$FloatDeserializer(enumC10000GnW, cls, fA0a, fA0a);
        A01 = new NumberDeserializers$FloatDeserializer(enumC10000GnW, Float.class, null, fA0a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        if (r1 == X.EnumC10072Got.AsEmpty) goto L41;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Float A0i(X.AbstractC9916Gl7 r5, X.AbstractC9904Gkk r6) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r4 = this;
            X.GiY r0 = X.EnumC9834GiY.VALUE_NUMBER_FLOAT
            boolean r0 = r5.A22(r0)
            if (r0 != 0) goto L80
            boolean r0 = r4._primitive
            if (r0 == 0) goto L15
            float r0 = r4.A0r(r5, r6)
        L10:
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L14:
            return r1
        L15:
            int r1 = r5.A1B()
            r0 = 1
            if (r1 == r0) goto L35
            r0 = 3
            if (r1 == r0) goto L63
            r0 = 11
            if (r1 == r0) goto L7b
            r0 = 6
            if (r1 == r0) goto L39
            r0 = 7
            if (r1 == r0) goto L68
            r0 = 8
            if (r1 == r0) goto L80
            com.fasterxml.jackson.databind.JsonDeserializer.A0S(r5, r6, r4)
        L30:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L35:
            com.fasterxml.jackson.databind.JsonDeserializer.A0T(r5, r6, r4)
            goto L30
        L39:
            java.lang.String r0 = r5.A1c()
            java.lang.Float r1 = r4.A13(r0)
            if (r1 != 0) goto L14
            X.Got r2 = r4.A0x(r6, r0)
            X.Got r1 = X.EnumC10072Got.AsNull
            if (r2 == r1) goto L7b
            X.Got r1 = X.EnumC10072Got.AsEmpty
            if (r2 == r1) goto L76
            java.lang.String r3 = r0.trim()
            boolean r0 = r4.A1J(r6, r3)
            if (r0 != 0) goto L7b
            boolean r0 = X.HlV.A0A(r3)
            if (r0 == 0) goto L94
            com.fasterxml.jackson.databind.JsonDeserializer.A0V(r5, r3)
            goto L85
        L63:
            java.lang.Object r1 = r4.A16(r5, r6)
            goto L78
        L68:
            java.lang.Class<?> r0 = r4._valueClass
            X.Got r1 = r4.A0w(r5, r6, r0)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L7b
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 != r0) goto L80
        L76:
            T r1 = r4._emptyValue
        L78:
            java.lang.Float r1 = (java.lang.Float) r1
            return r1
        L7b:
            java.lang.Object r1 = r4.AIA(r6)
            goto L78
        L80:
            float r0 = r5.A1A()
            goto L10
        L85:
            X.Gnl r0 = X.EnumC10013Gnl.A02     // Catch: java.lang.IllegalArgumentException -> L94
            boolean r0 = r5.A23(r0)     // Catch: java.lang.IllegalArgumentException -> L94
            float r0 = X.HlV.A02(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L94
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L94
            return r1
        L94:
            java.lang.Class<?> r2 = r4._valueClass
            java.lang.Object[] r1 = X.BV4.A1W()
            java.lang.String r0 = "not a valid `Float` value"
            r6.A0k(r2, r3, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer.A0i(X.Gl7, X.Gkk):java.lang.Float");
    }
}
