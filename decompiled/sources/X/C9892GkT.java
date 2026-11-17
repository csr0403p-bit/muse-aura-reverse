package X;

import java.io.Serializable;

/* renamed from: X.GkT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9892GkT extends AbstractC9852Giw implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.AbstractC9916Gl7 r6, X.AbstractC9904Gkk r7, X.C9892GkT r8) throws com.fasterxml.jackson.databind.exc.MismatchedInputException, com.fasterxml.jackson.databind.exc.InvalidDefinitionException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            boolean r0 = r6.A1q()
            if (r0 == 0) goto L20
            java.lang.Object r1 = r6.A1Z()
            if (r1 == 0) goto L20
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L1b
            java.lang.String r1 = (java.lang.String) r1
        L12:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r8.A08(r7, r1)
            java.lang.Object r0 = r0.A0i(r6, r7)
            return r0
        L1b:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L12
        L20:
            boolean r5 = r6.A1x()
            r4 = 0
            if (r5 != 0) goto L68
            X.GjI r0 = r8._defaultImpl
            if (r0 == 0) goto L54
            X.Gix r2 = r8._idResolver
            X.Gif r2 = (X.AbstractC9840Gif) r2
            X.GjI r0 = r2._baseType
            java.lang.Class<?> r1 = r0._class
            r0 = 0
            java.lang.String r1 = r2.ANR(r1, r0)
            if (r1 != 0) goto L7d
            X.Gix r0 = r8._idResolver
            java.lang.Class r3 = r0.getClass()
            java.lang.String r2 = "`idFromBaseType()` (of "
            java.lang.String r1 = X.AbstractC9855Gj3.A07(r0)
            java.lang.String r0 = ") returned `null`"
            java.lang.String r0 = X.FGI.A0U(r2, r1, r0)
            r7.A0F(r0, r3)
        L4f:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L54:
            X.GjI r3 = r8._baseType
            X.GiY r2 = X.EnumC9834GiY.START_ARRAY
            java.lang.String r1 = "need Array value to contain `As.WRAPPER_ARRAY` type information for class "
            java.lang.String r0 = X.AbstractC9870GjI.A04(r3)
            java.lang.String r1 = X.FGI.A0M(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r7.A0Y(r2, r3, r1, r0)
            goto L4f
        L68:
            X.GiY r0 = r6.A1P()
            X.GiY r3 = X.EnumC9834GiY.VALUE_STRING
            if (r0 == r3) goto L76
            if (r0 == 0) goto Lb6
            boolean r0 = r0._isScalar
            if (r0 == 0) goto Lb6
        L76:
            java.lang.String r1 = r6.A1c()
            r6.A1P()
        L7d:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r8.A08(r7, r1)
            boolean r0 = r8._typeIdVisible
            if (r0 == 0) goto L8f
            boolean r0 = r8 instanceof X.C10128Gpt
            if (r0 != 0) goto L8f
            X.GiY r0 = X.EnumC9834GiY.START_OBJECT
            X.Gl7 r6 = X.AbstractC9852Giw.A00(r6, r0, r8, r1)
        L8f:
            if (r5 == 0) goto L9e
            X.GiY r1 = r6.A1N()
            X.GiY r0 = X.EnumC9834GiY.END_ARRAY
            if (r1 != r0) goto L9e
            java.lang.Object r0 = r2.AIA(r7)
            return r0
        L9e:
            java.lang.Object r1 = r2.A0i(r6, r7)
            if (r5 == 0) goto Lc6
            X.GiY r0 = r6.A1P()
            X.GiY r3 = X.EnumC9834GiY.END_ARRAY
            if (r0 == r3) goto Lc6
            X.GjI r2 = r8._baseType
            java.lang.String r1 = "expected closing `JsonToken.END_ARRAY` after type information and deserialized value"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r7.A0Y(r3, r2, r1, r0)
            goto L4f
        Lb6:
            X.GjI r2 = r8._baseType
            java.lang.String r0 = X.AbstractC9870GjI.A04(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "need String, Number of Boolean value that contains type id (for subtype of %s)"
            r7.A0Y(r3, r2, r0, r1)
            goto L4f
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9892GkT.A01(X.Gl7, X.Gkk, X.GkT):java.lang.Object");
    }
}
