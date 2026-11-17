package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7609F5w;
import X.AbstractC9804GhQ;
import X.AbstractC9806GhU;
import X.AbstractC9849Git;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.C79;
import X.C9788Ggx;
import X.C9790Ggz;
import X.C9791Gh0;
import X.C9805GhS;
import X.C9808GhY;
import X.C9809Ghf;
import X.C9810Ghi;
import X.C9811Ghl;
import X.C9814Ghy;
import X.C9816Gi3;
import X.C9820GiE;
import X.C9823GiH;
import X.C9898Gke;
import X.EnumC10051GoV;
import X.EnumC9819GiD;
import X.EnumC9965Gmd;
import X.F60;
import X.Gh1;
import X.InterfaceC10017Gnp;
import X.InterfaceC9830GiT;
import com.facebook.aura.common.formatting.LocalizedFormattingKt$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.math.BigDecimal;

/* loaded from: classes6.dex */
public abstract class BaseNodeDeserializer<T extends AbstractC9804GhQ> extends StdDeserializer<T> implements InterfaceC9830GiT {
    public final boolean _mergeArrays;
    public final boolean _mergeObjects;
    public final Boolean _supportsUpdates;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC9804GhQ A1L(X.AbstractC9916Gl7 r7, X.AbstractC9904Gkk r8, X.C9822GiG r9, X.C9809Ghf r10) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r6 = this;
            r4 = r7
            boolean r0 = r7.A1y()
            r3 = r6
            r5 = r8
            if (r0 == 0) goto Lab
            java.lang.String r2 = r7.A1d()
        Ld:
            X.Gke r0 = r8._config
            X.GhY r8 = r0._nodeFactory
        L11:
            if (r2 == 0) goto Lc0
            X.GiY r1 = r4.A1P()
            X.GhQ r7 = r10.A02(r2)
            r6 = r9
            if (r7 == 0) goto L53
            boolean r0 = r7 instanceof X.C9809Ghf
            if (r0 == 0) goto L41
            X.GiY r0 = X.EnumC9834GiY.START_OBJECT
            if (r1 != r0) goto L53
            boolean r0 = r3._mergeObjects
            if (r0 == 0) goto L57
            r0 = r7
            X.Ghf r0 = (X.C9809Ghf) r0
            X.GhQ r1 = r3.A1L(r4, r5, r9, r0)
            if (r1 == r7) goto L3c
            if (r1 != 0) goto L37
            X.Gh1 r1 = X.Gh1.A00
        L37:
            java.util.Map<java.lang.String, X.GhQ> r0 = r10._children
            r0.put(r2, r1)
        L3c:
            java.lang.String r2 = r4.A1d()
            goto L11
        L41:
            boolean r0 = r7 instanceof X.C9805GhS
            if (r0 == 0) goto L53
            X.GiY r0 = X.EnumC9834GiY.START_ARRAY
            if (r1 != r0) goto L53
            boolean r0 = r3._mergeArrays
            if (r0 == 0) goto L57
            X.GhW r7 = (X.AbstractC9807GhW) r7
            r3.A1N(r4, r5, r6, r7, r8)
            goto L3c
        L53:
            if (r1 != 0) goto L57
            X.GiY r1 = X.EnumC9834GiY.NOT_AVAILABLE
        L57:
            int r1 = r1._id
            r0 = 1
            if (r1 == r0) goto La2
            r0 = 3
            if (r1 == r0) goto L99
            r0 = 6
            if (r1 == r0) goto L90
            r0 = 7
            if (r1 == r0) goto L8b
            switch(r1) {
                case 9: goto L88;
                case 10: goto L85;
                case 11: goto L76;
                default: goto L68;
            }
        L68:
            X.GhQ r7 = r3.A01(r4, r5)
        L6c:
            if (r7 != 0) goto L70
            X.Gh1 r7 = X.Gh1.A00
        L70:
            java.util.Map<java.lang.String, X.GhQ> r0 = r10._children
            r0.put(r2, r7)
            goto L3c
        L76:
            X.GiD r1 = X.EnumC9819GiD.READ_NULL_PROPERTIES
            X.Gke r0 = r5._config
            X.GiH r0 = r0._datatypeFeatures
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L3c
            X.Gh1 r7 = X.Gh1.A00
            goto L6c
        L85:
            X.Ghy r7 = X.C9814Ghy.A00
            goto L6c
        L88:
            X.Ghy r7 = X.C9814Ghy.A01
            goto L6c
        L8b:
            X.GhU r7 = A03(r4, r5)
            goto L6c
        L90:
            java.lang.String r0 = r4.A1c()
            X.Gi3 r7 = X.C9816Gi3.A00(r0)
            goto L6c
        L99:
            X.GhS r7 = new X.GhS
            r7.<init>(r8)
            r3.A1N(r4, r5, r6, r7, r8)
            goto L6c
        La2:
            X.Ghf r7 = new X.Ghf
            r7.<init>(r8)
            r3.A1N(r4, r5, r6, r7, r8)
            goto L6c
        Lab:
            X.GiY r0 = X.EnumC9834GiY.FIELD_NAME
            boolean r0 = r7.A22(r0)
            if (r0 != 0) goto Lba
            java.lang.Object r0 = r6.A0i(r7, r8)
            X.GhQ r0 = (X.AbstractC9804GhQ) r0
            return r0
        Lba:
            java.lang.String r2 = r7.A1a()
            goto Ld
        Lc0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A1L(X.Gl7, X.Gkk, X.GiG, X.Ghf):X.GhQ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0101, code lost:
    
        r1.A06(r7);
     */
    /* JADX WARN: Incorrect return type in method signature: (LX/Gl7;LX/Gkk;LX/GhY;LX/GiG;LX/GhW<*>;)LX/GhW<*>; */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1N(X.AbstractC9916Gl7 r12, X.AbstractC9904Gkk r13, X.C9822GiG r14, X.AbstractC9807GhW r15, X.C9808GhY r16) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A1N(X.Gl7, X.Gkk, X.GiG, X.GhW, X.GhY):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r1 == X.EnumC10067Goo.LONG) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        return new X.C9817Gi7(r2.A1G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        return new X.C9821GiF(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if ((r3 & X.EnumC9965Gmd.A0O._mask) != 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        r0 = r2.A1g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        return X.Gh1.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC9806GhU A02(X.AbstractC9916Gl7 r2, int r3) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            if (r3 == 0) goto L12
            X.Gmd r0 = X.EnumC9965Gmd.A0O
            int r0 = r0._mask
            r3 = r3 & r0
            if (r3 == 0) goto L2f
        L9:
            java.math.BigInteger r0 = r2.A1g()
            if (r0 != 0) goto L39
            X.Gh1 r2 = X.Gh1.A00
            return r2
        L12:
            X.Goo r1 = r2.A1L()
            X.Goo r0 = X.EnumC10067Goo.INT
            if (r1 != r0) goto L2b
            int r3 = r2.A1C()
            r0 = 10
            if (r3 > r0) goto L3f
            r1 = -1
            if (r3 < r1) goto L3f
            X.Gi8[] r0 = X.C9818Gi8.A00
            int r3 = r3 - r1
            r2 = r0[r3]
            return r2
        L2b:
            X.Goo r0 = X.EnumC10067Goo.LONG
            if (r1 != r0) goto L9
        L2f:
            long r0 = r2.A1G()
            X.Gi7 r2 = new X.Gi7
            r2.<init>(r0)
            return r2
        L39:
            X.GiF r2 = new X.GiF
            r2.<init>(r0)
            return r2
        L3f:
            X.Gi8 r2 = new X.Gi8
            r2.<init>(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A02(X.Gl7, int):X.GhU");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC9806GhU A03(X.AbstractC9916Gl7 r2, X.AbstractC9904Gkk r3) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            int r1 = r3._featureFlags
            int r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A00
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            X.Gmd r0 = X.EnumC9965Gmd.A0O
            int r0 = r0._mask
            r0 = r0 & r1
            if (r0 == 0) goto L25
            X.Goo r1 = X.EnumC10067Goo.BIG_INTEGER
        L10:
            X.Goo r0 = X.EnumC10067Goo.INT
            if (r1 != r0) goto L3a
            int r3 = r2.A1C()
            r0 = 10
            if (r3 > r0) goto L34
            r1 = -1
            if (r3 < r1) goto L34
            X.Gi8[] r0 = X.C9818Gi8.A00
            int r3 = r3 - r1
            r2 = r0[r3]
            return r2
        L25:
            X.Gmd r0 = X.EnumC9965Gmd.A0Q
            int r0 = r0._mask
            r1 = r1 & r0
            if (r1 == 0) goto L2f
            X.Goo r1 = X.EnumC10067Goo.LONG
            goto L10
        L2f:
            X.Goo r1 = r2.A1L()
            goto L10
        L34:
            X.Gi8 r2 = new X.Gi8
            r2.<init>(r3)
            return r2
        L3a:
            X.Goo r0 = X.EnumC10067Goo.LONG
            if (r1 != r0) goto L48
            long r0 = r2.A1G()
            X.Gi7 r2 = new X.Gi7
            r2.<init>(r0)
            return r2
        L48:
            java.math.BigInteger r0 = r2.A1g()
            if (r0 != 0) goto L51
            X.Gh1 r2 = X.Gh1.A00
            return r2
        L51:
            X.GiF r2 = new X.GiF
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A03(X.Gl7, X.Gkk):X.GhU");
    }

    public static final void A05(AbstractC9904Gkk abstractC9904Gkk, AbstractC9804GhQ abstractC9804GhQ, AbstractC9804GhQ abstractC9804GhQ2, C9808GhY c9808GhY, C9809Ghf c9809Ghf, String str) throws MismatchedInputException {
        EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A0D;
        if (AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
            throw AbstractC9849Git.A04(abstractC9904Gkk, AbstractC9804GhQ.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", new Object[]{str});
        }
        if (AbstractC7609F5w.A1U(EnumC10051GoV.DUPLICATE_PROPERTIES._mask, abstractC9904Gkk._readCapabilities._enabled)) {
            if (abstractC9804GhQ instanceof C9805GhS) {
                ((C9805GhS) abstractC9804GhQ).A06(abstractC9804GhQ2);
                c9809Ghf._children.put(str, abstractC9804GhQ);
            } else {
                C9805GhS c9805GhS = new C9805GhS(c9808GhY);
                c9805GhS.A06(abstractC9804GhQ);
                c9805GhS.A06(abstractC9804GhQ2);
                c9809Ghf._children.put(str, c9805GhS);
            }
        }
    }

    public final AbstractC9804GhQ A1K(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        C9808GhY c9808GhY = abstractC9904Gkk._config._nodeFactory;
        int iA1B = abstractC9916Gl7.A1B();
        if (iA1B == 2) {
            return new C9809Ghf(c9808GhY);
        }
        switch (iA1B) {
            case 6:
                return C9816Gi3.A00(abstractC9916Gl7.A1c());
            case 7:
                return A03(abstractC9916Gl7, abstractC9904Gkk);
            case 8:
                return A04(abstractC9916Gl7, abstractC9904Gkk, c9808GhY);
            case 9:
                return C9814Ghy.A01;
            case 10:
                return C9814Ghy.A00;
            case 11:
                return Gh1.A00;
            case 12:
                return A00(abstractC9916Gl7);
            default:
                abstractC9904Gkk.A0X(abstractC9916Gl7, A0h());
                throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.GhW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9809Ghf A1M(X.AbstractC9916Gl7 r15, X.AbstractC9904Gkk r16, X.C9822GiG r17, X.C9808GhY r18) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r14 = this;
            X.Ghf r6 = new X.Ghf
            r5 = r18
            r6.<init>(r5)
            r9 = r15
            java.lang.String r7 = r15.A1a()
        Lc:
            if (r7 == 0) goto L50
            X.GiY r0 = r15.A1P()
            if (r0 != 0) goto L16
            X.GiY r0 = X.EnumC9834GiY.NOT_AVAILABLE
        L16:
            int r1 = r0._id
            r0 = 1
            r8 = r14
            r2 = r16
            if (r1 == r0) goto L3c
            r0 = 3
            if (r1 == r0) goto L42
            X.GhQ r4 = r14.A1K(r15, r2)
        L25:
            r1 = r4
            if (r4 != 0) goto L2a
            X.Gh1 r1 = X.Gh1.A00
        L2a:
            java.util.Map<java.lang.String, X.GhQ> r0 = r6._children
            java.lang.Object r3 = r0.put(r7, r1)
            X.GhQ r3 = (X.AbstractC9804GhQ) r3
            if (r3 == 0) goto L37
            A05(r2, r3, r4, r5, r6, r7)
        L37:
            java.lang.String r7 = r15.A1d()
            goto Lc
        L3c:
            X.Ghf r4 = new X.Ghf
            r4.<init>(r5)
            goto L47
        L42:
            X.GhS r4 = new X.GhS
            r4.<init>(r5)
        L47:
            r11 = r17
            r10 = r2
            r12 = r4
            r13 = r5
            r8.A1N(r9, r10, r11, r12, r13)
            goto L25
        L50:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A1M(X.Gl7, X.Gkk, X.GiG, X.GhY):X.Ghf");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        C9898Gke c9898Gke = abstractC9904Gkk._config;
        Boolean boolA0C = c9898Gke.A0C(C9805GhS.class);
        Boolean boolA0C2 = c9898Gke.A0C(C9809Ghf.class);
        Boolean boolA0C3 = c9898Gke.A0C(AbstractC9804GhQ.class);
        boolean zBooleanValue = boolA0C != null ? boolA0C.booleanValue() : boolA0C3 != null ? boolA0C3.booleanValue() : true;
        boolean zBooleanValue2 = boolA0C2 != null ? boolA0C2.booleanValue() : boolA0C3 != null ? boolA0C3.booleanValue() : true;
        return (zBooleanValue == this._mergeArrays && zBooleanValue2 == this._mergeObjects) ? this : this instanceof JsonNodeDeserializer ? new JsonNodeDeserializer(this, zBooleanValue, zBooleanValue2) : this instanceof JsonNodeDeserializer.ObjectDeserializer ? new JsonNodeDeserializer.ObjectDeserializer(this, zBooleanValue, zBooleanValue2) : new JsonNodeDeserializer.ArrayDeserializer(this, zBooleanValue, zBooleanValue2);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<TT;>;Ljava/lang/Boolean;)V */
    public BaseNodeDeserializer(Boolean bool, Class cls) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
        this._mergeArrays = true;
        this._mergeObjects = true;
    }

    public static final AbstractC9804GhQ A00(AbstractC9916Gl7 abstractC9916Gl7) {
        Object objA1V = abstractC9916Gl7.A1V();
        if (objA1V == null) {
            return Gh1.A00;
        }
        if (objA1V.getClass() != byte[].class) {
            return ((objA1V instanceof C9810Ghi) || !(objA1V instanceof AbstractC9804GhQ)) ? new C9788Ggx(objA1V) : (AbstractC9804GhQ) objA1V;
        }
        byte[] bArr = (byte[]) objA1V;
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? C9811Ghl.A00 : new C9811Ghl(bArr);
    }

    private final AbstractC9804GhQ A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        int iA1B = abstractC9916Gl7.A1B();
        if (iA1B == 2) {
            return new C9809Ghf(abstractC9904Gkk._config._nodeFactory);
        }
        if (iA1B == 8) {
            return A04(abstractC9916Gl7, abstractC9904Gkk, abstractC9904Gkk._config._nodeFactory);
        }
        if (iA1B == 12) {
            return A00(abstractC9916Gl7);
        }
        abstractC9904Gkk.A0X(abstractC9916Gl7, A0h());
        throw F60.createAndThrow();
    }

    private final AbstractC9806GhU A04(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, C9808GhY c9808GhY) throws InvalidFormatException {
        Integer numA1T = abstractC9916Gl7.A1T();
        if (numA1T != C79.A0K) {
            if (AbstractC7609F5w.A1U(EnumC9965Gmd.A0N._mask, abstractC9904Gkk._featureFlags)) {
                if (abstractC9916Gl7.A1z()) {
                    if (abstractC9904Gkk._config._datatypeFeatures.A00(EnumC9819GiD.FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION)) {
                        abstractC9904Gkk.A0i(A0h(), Double.valueOf(abstractC9916Gl7.A17()), "Cannot convert NaN into BigDecimal", BV4.A1W());
                        throw F60.createAndThrow();
                    }
                }
            } else if (numA1T == C79.A01) {
                return new C9790Ggz(abstractC9916Gl7.A1A());
            }
            return new C9791Gh0(abstractC9916Gl7.A17());
        }
        BigDecimal bigDecimalA1f = abstractC9916Gl7.A1f();
        C9823GiH c9823GiH = abstractC9904Gkk._config._datatypeFeatures;
        EnumC9819GiD enumC9819GiD = EnumC9819GiD.STRIP_TRAILING_BIGDECIMAL_ZEROES;
        if (AbstractC7609F5w.A1U(c9823GiH._explicitFor2, enumC9819GiD._mask) ? c9823GiH.A00(enumC9819GiD) : !c9808GhY._cfgBigDecimalExact) {
            try {
                bigDecimalA1f = LocalizedFormattingKt$$ExternalSyntheticBackportWithForwarding0.m(bigDecimalA1f);
            } catch (ArithmeticException unused) {
            }
        }
        return bigDecimalA1f == null ? Gh1.A00 : new C9820GiE(bigDecimalA1f);
    }

    public BaseNodeDeserializer(BaseNodeDeserializer<?> baseNodeDeserializer, boolean z, boolean z2) {
        super(baseNodeDeserializer);
        this._supportsUpdates = baseNodeDeserializer._supportsUpdates;
        this._mergeArrays = z;
        this._mergeObjects = z2;
    }
}
