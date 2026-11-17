package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7609F5w;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.EnumC10000GnW;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberDeserializers$DoubleDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer<Double> {
    public static final NumberDeserializers$DoubleDeserializer A00;
    public static final NumberDeserializers$DoubleDeserializer A01;
    public static final long serialVersionUID = 1;

    static {
        Class cls = Double.TYPE;
        Double dA0k = AbstractC7609F5w.A0k();
        EnumC10000GnW enumC10000GnW = EnumC10000GnW.Float;
        A00 = new NumberDeserializers$DoubleDeserializer(enumC10000GnW, cls, dA0k, dA0k);
        A01 = new NumberDeserializers$DoubleDeserializer(enumC10000GnW, Double.class, null, dA0k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Double A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        double dA0q;
        if (abstractC9916Gl7.A22(EnumC9834GiY.VALUE_NUMBER_FLOAT)) {
            dA0q = abstractC9916Gl7.A17();
        } else {
            if (!this._primitive) {
                return A01(abstractC9916Gl7, abstractC9904Gkk, this);
            }
            dA0q = A0q(abstractC9916Gl7, abstractC9904Gkk);
        }
        return Double.valueOf(dA0q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r1 == X.EnumC10072Got.AsEmpty) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Double A01(X.AbstractC9916Gl7 r4, X.AbstractC9904Gkk r5, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer r6) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            int r1 = r4.A1B()
            r0 = 1
            if (r1 == r0) goto L20
            r0 = 3
            if (r1 == r0) goto L6c
            r0 = 11
            if (r1 == r0) goto L84
            r0 = 6
            if (r1 == r0) goto L24
            r0 = 7
            if (r1 == r0) goto L71
            r0 = 8
            if (r1 == r0) goto L89
            com.fasterxml.jackson.databind.JsonDeserializer.A0S(r4, r5, r6)
        L1b:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L20:
            com.fasterxml.jackson.databind.JsonDeserializer.A0T(r4, r5, r6)
            goto L1b
        L24:
            java.lang.String r0 = r4.A1c()
            java.lang.Double r1 = r6.A12(r0)
            if (r1 != 0) goto L83
            X.Got r2 = r6.A0x(r5, r0)
            X.Got r1 = X.EnumC10072Got.AsNull
            if (r2 == r1) goto L84
            X.Got r1 = X.EnumC10072Got.AsEmpty
            if (r2 == r1) goto L7f
            java.lang.String r3 = r0.trim()
            boolean r0 = r6.A1J(r5, r3)
            if (r0 != 0) goto L84
            boolean r0 = X.HlV.A0A(r3)
            if (r0 == 0) goto L5c
            com.fasterxml.jackson.databind.JsonDeserializer.A0V(r4, r3)
            X.Gnl r0 = X.EnumC10013Gnl.A02     // Catch: java.lang.IllegalArgumentException -> L5c
            boolean r0 = r4.A23(r0)     // Catch: java.lang.IllegalArgumentException -> L5c
            double r0 = X.HlV.A00(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L5c
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L5c
            return r1
        L5c:
            java.lang.Class<?> r2 = r6._valueClass
            java.lang.Object[] r1 = X.BV4.A1W()
            java.lang.String r0 = "not a valid `Double` value"
            r5.A0k(r2, r3, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L6c:
            java.lang.Object r1 = r6.A16(r4, r5)
            goto L81
        L71:
            java.lang.Class<?> r0 = r6._valueClass
            X.Got r1 = r6.A0w(r4, r5, r0)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L84
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 != r0) goto L89
        L7f:
            T r1 = r6._emptyValue
        L81:
            java.lang.Double r1 = (java.lang.Double) r1
        L83:
            return r1
        L84:
            java.lang.Object r1 = r6.AIA(r5)
            goto L81
        L89:
            double r0 = r4.A17()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer.A01(X.Gl7, X.Gkk, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer):java.lang.Double");
    }
}
