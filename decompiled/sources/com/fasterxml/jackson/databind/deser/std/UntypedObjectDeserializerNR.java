package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7609F5w;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.EnumC9965Gmd;
import X.F60;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes6.dex */
public final class UntypedObjectDeserializerNR extends StdDeserializer<Object> {
    public static final long serialVersionUID = 1;
    public final boolean _nonMerging;
    public static final Object[] A01 = new Object[0];
    public static final UntypedObjectDeserializerNR A00 = new UntypedObjectDeserializerNR(false);

    public UntypedObjectDeserializerNR() {
        this(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        com.fasterxml.jackson.databind.JsonDeserializer.A0S(r8, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        throw X.F60.createAndThrow();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object A01(X.AbstractC9916Gl7 r8, X.AbstractC9904Gkk r9, X.C10434Hhf r10) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.A01(X.Gl7, X.Gkk, X.Hhf):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (X.AbstractC7609F5w.A1U(X.EnumC9965Gmd.A0N._mask, r4._featureFlags) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.AbstractC9916Gl7 r3, X.AbstractC9904Gkk r4) {
        /*
            java.lang.Integer r2 = r3.A1T()
            java.lang.Integer r0 = X.C79.A0K
            if (r2 == r0) goto L1a
            boolean r0 = r3.A1z()
            if (r0 != 0) goto L1f
            X.Gmd r0 = X.EnumC9965Gmd.A0N
            int r1 = r4._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L1f
        L1a:
            java.math.BigDecimal r0 = r3.A1f()
            return r0
        L1f:
            java.lang.Integer r0 = X.C79.A01
            if (r2 != r0) goto L2c
            float r0 = r3.A1A()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L2c:
            double r0 = r3.A17()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.A00(X.Gl7, X.Gkk):java.lang.Object");
    }

    public static Object A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, UntypedObjectDeserializerNR untypedObjectDeserializerNR, int i) {
        switch (i) {
            case 6:
                return abstractC9916Gl7.A1c();
            case 7:
                return AbstractC7609F5w.A1U(EnumC9965Gmd.A0O._mask, abstractC9904Gkk._featureFlags) ? abstractC9916Gl7.A1g() : abstractC9916Gl7.A1U();
            case 8:
                return A00(abstractC9916Gl7, abstractC9904Gkk);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return abstractC9916Gl7.A1V();
            default:
                JsonDeserializer.A0S(abstractC9916Gl7, abstractC9904Gkk, untypedObjectDeserializerNR);
                throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0i(X.AbstractC9916Gl7 r5, X.AbstractC9904Gkk r6) {
        /*
            r4 = this;
            int r0 = r5.A1B()
            switch(r0) {
                case 1: goto Lad;
                case 2: goto L9c;
                case 3: goto La2;
                case 4: goto L7;
                case 5: goto L37;
                case 6: goto L32;
                case 7: goto L21;
                case 8: goto L1c;
                case 9: goto L19;
                case 10: goto L16;
                case 11: goto L14;
                case 12: goto Lf;
                default: goto L7;
            }
        L7:
            com.fasterxml.jackson.databind.JsonDeserializer.A0S(r5, r6, r4)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        Lf:
            java.lang.Object r0 = r5.A1V()
            return r0
        L14:
            r0 = 0
            return r0
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L19:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L1c:
            java.lang.Object r0 = A00(r5, r6)
            return r0
        L21:
            int r1 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A00
            int r0 = r6._featureFlags
            r1 = r1 & r0
            if (r1 == 0) goto L2d
            java.lang.Object r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0B(r5, r6)
            return r0
        L2d:
            java.lang.Number r0 = r5.A1U()
            return r0
        L32:
            java.lang.String r0 = r5.A1c()
            return r0
        L37:
            X.GoV r1 = X.EnumC10051GoV.DUPLICATE_PROPERTIES
            X.GoH<X.GoV> r0 = r6._readCapabilities
            int r1 = r1._mask
            int r0 = r0._enabled
            boolean r1 = X.AbstractC7609F5w.A1U(r1, r0)
            r0 = 0
            X.Hhf r3 = new X.Hhf
            r3.<init>(r0, r1)
            java.lang.String r2 = r5.A1a()
        L4d:
            if (r2 == 0) goto L92
            X.GiY r0 = r5.A1P()
            if (r0 != 0) goto L57
            X.GiY r0 = X.EnumC9834GiY.NOT_AVAILABLE
        L57:
            int r1 = r0._id
            r0 = 1
            if (r1 == r0) goto L86
            r0 = 2
            if (r1 == r0) goto L92
            r0 = 3
            if (r1 == r0) goto L80
            java.lang.Object r1 = A02(r5, r6, r4, r1)
        L66:
            boolean r0 = r3.A04
            if (r0 == 0) goto L72
            X.C10434Hhf.A01(r3, r1, r2)
        L6d:
            java.lang.String r2 = r5.A1d()
            goto L4d
        L72:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.A02
            if (r0 != 0) goto L7c
            java.util.LinkedHashMap r0 = X.C3cG.A0j()
            r3.A02 = r0
        L7c:
            r0.put(r2, r1)
            goto L6d
        L80:
            X.Hhf r0 = new X.Hhf
            r0.<init>(r3)
            goto L8d
        L86:
            boolean r1 = r3.A04
            X.Hhf r0 = new X.Hhf
            r0.<init>(r3, r1)
        L8d:
            java.lang.Object r1 = r4.A01(r5, r6, r0)
            goto L66
        L92:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.A02
            if (r0 != 0) goto La1
            r0 = 2
            java.util.LinkedHashMap r0 = X.C60O.A15(r0)
            return r0
        L9c:
            r0 = 2
            java.util.LinkedHashMap r0 = X.C60O.A15(r0)
        La1:
            return r0
        La2:
            r1 = 0
            X.Hhf r0 = new X.Hhf
            r0.<init>(r1)
            java.lang.Object r0 = r4.A01(r5, r6, r0)
            return r0
        Lad:
            X.GoV r1 = X.EnumC10051GoV.DUPLICATE_PROPERTIES
            X.GoH<X.GoV> r0 = r6._readCapabilities
            int r1 = r1._mask
            int r0 = r0._enabled
            boolean r2 = X.AbstractC7609F5w.A1U(r1, r0)
            r1 = 0
            X.Hhf r0 = new X.Hhf
            r0.<init>(r1, r2)
            java.lang.Object r0 = r4.A01(r5, r6, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.A0i(X.Gl7, X.Gkk):java.lang.Object");
    }

    public UntypedObjectDeserializerNR(boolean z) {
        super((Class<?>) Object.class);
        this._nonMerging = z;
    }
}
