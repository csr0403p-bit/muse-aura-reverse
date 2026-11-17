package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigDecimal;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class NumberDeserializers$BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
    public static final NumberDeserializers$BigDecimalDeserializer A00 = new NumberDeserializers$BigDecimalDeserializer();

    public NumberDeserializers$BigDecimalDeserializer() {
        super(BigDecimal.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r1 == X.EnumC10072Got.AsEmpty) goto L34;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.math.BigDecimal A0i(X.AbstractC9916Gl7 r5, X.AbstractC9904Gkk r6) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r4 = this;
            int r1 = r5.A1B()
            r0 = 1
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 == r0) goto L60
            r0 = 6
            if (r1 == r0) goto L20
            r0 = 7
            if (r1 == r0) goto L65
            r0 = 8
            if (r1 == r0) goto L7d
            com.fasterxml.jackson.databind.JsonDeserializer.A0S(r5, r6, r4)
        L17:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1c:
            com.fasterxml.jackson.databind.JsonDeserializer.A0T(r5, r6, r4)
            goto L17
        L20:
            java.lang.String r2 = r5.A1c()
            X.Got r1 = r4.A0x(r6, r2)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L78
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 == r0) goto L73
            java.lang.String r3 = r2.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L78
            boolean r0 = X.HlV.A0A(r3)
            if (r0 == 0) goto L50
            com.fasterxml.jackson.databind.JsonDeserializer.A0V(r5, r3)
            X.Gnl r0 = X.EnumC10013Gnl.A01     // Catch: java.lang.IllegalArgumentException -> L50
            boolean r0 = r5.A23(r0)     // Catch: java.lang.IllegalArgumentException -> L50
            java.math.BigDecimal r0 = X.HlV.A09(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L50
            return r0
        L50:
            java.lang.Class<?> r2 = r4._valueClass
            java.lang.Object[] r1 = X.BV4.A1W()
            java.lang.String r0 = "not a valid representation"
            r6.A0k(r2, r3, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L60:
            java.lang.Object r0 = r4.A16(r5, r6)
            goto L75
        L65:
            java.lang.Class<?> r0 = r4._valueClass
            X.Got r1 = r4.A0w(r5, r6, r0)
            X.Got r0 = X.EnumC10072Got.AsNull
            if (r1 == r0) goto L78
            X.Got r0 = X.EnumC10072Got.AsEmpty
            if (r1 != r0) goto L7d
        L73:
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
        L75:
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            return r0
        L78:
            java.lang.Object r0 = r4.AIA(r6)
            goto L75
        L7d:
            java.math.BigDecimal r0 = r5.A1f()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer.A0i(X.Gl7, X.Gkk):java.math.BigDecimal");
    }
}
