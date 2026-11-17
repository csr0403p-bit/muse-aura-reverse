package X;

import java.util.BitSet;

/* renamed from: X.Gli, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9939Gli {
    public int A00;
    public int A01;
    public AbstractC10107GpX A02;
    public AbstractC10107GpX A03;
    public Object A04;
    public final AbstractC9904Gkk A05;
    public final AbstractC9930GlR A06;
    public final C10035GoB A07;
    public final BitSet A08;
    public final Object[] A09;
    public final AbstractC9916Gl7 A0A;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.AbstractC9915Gl5 r4, X.C9939Gli r5) throws com.fasterxml.jackson.databind.DatabindException {
        /*
            X.GlR r0 = r5.A06
            r3 = 0
            if (r0 == 0) goto L14
            int r1 = r4.A02()
            int r0 = r0.A01()
            if (r1 != r0) goto L14
            X.GpX r0 = r5.A02
            if (r0 == 0) goto L14
        L13:
            return r3
        L14:
            java.lang.Object r1 = r4.A0B()
            if (r1 == 0) goto L24
            X.Gkk r0 = r5.A05
            r0.A0l(r1)
        L1f:
            X.F60 r2 = X.F60.createAndThrow()
        L23:
            throw r2
        L24:
            X.GoA r0 = r4._metadata
            java.lang.Boolean r0 = r0._required
            if (r0 == 0) goto L31
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L32
        L31:
            r0 = 0
        L32:
            X.Gkk r2 = r5.A05
            if (r0 == 0) goto L48
            X.Gnh r0 = r4._propName
            java.lang.String r1 = r0._simpleName
            int r0 = r4.A02()
            java.lang.Object[] r1 = X.BV5.A1a(r1, r0)
            java.lang.String r0 = "Missing required creator property '%s' (index %d)"
        L44:
            r2.A0a(r4, r0, r1)
            goto L1f
        L48:
            X.Gmd r0 = X.EnumC9965Gmd.A08
            int r1 = r2._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L63
            X.Gnh r0 = r4._propName
            java.lang.String r1 = r0._simpleName
            int r0 = r4.A02()
            java.lang.Object[] r1 = X.BV5.A1a(r1, r0)
            java.lang.String r0 = "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled"
            goto L44
        L63:
            X.Gqa r0 = r4._nullProvider     // Catch: com.fasterxml.jackson.databind.DatabindException -> L74
            java.lang.Object r3 = r0.ACA(r2)     // Catch: com.fasterxml.jackson.databind.DatabindException -> L74
            if (r3 != 0) goto L13
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r4.A03()     // Catch: com.fasterxml.jackson.databind.DatabindException -> L74
            java.lang.Object r3 = r0.ACA(r2)     // Catch: com.fasterxml.jackson.databind.DatabindException -> L74
            return r3
        L74:
            r2 = move-exception
            X.Gmj r0 = r4.AHe()
            if (r0 == 0) goto L23
            java.lang.Class r1 = r0.A0C()
            X.Gnh r0 = r4._propName
            java.lang.String r0 = r0._simpleName
            r2.A06(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9939Gli.A00(X.Gl5, X.Gli):java.lang.Object");
    }

    public final void A01(AbstractC9930GlR abstractC9930GlR, Object obj, String str) {
        this.A03 = new C10146GqD(abstractC9930GlR, this.A03, obj, str);
    }

    public final void A02(AbstractC9915Gl5 abstractC9915Gl5, Object obj) {
        this.A03 = new C10149GqG(abstractC9915Gl5, this.A03, obj);
    }

    public final boolean A04(String str) {
        C10035GoB c10035GoB = this.A07;
        if (c10035GoB == null || !str.equals(c10035GoB.propertyName._simpleName)) {
            return false;
        }
        this.A04 = c10035GoB._deserializer.A0i(this.A0A, this.A05);
        return true;
    }

    public C9939Gli(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, AbstractC9930GlR abstractC9930GlR, C10035GoB c10035GoB, int i) {
        this.A0A = abstractC9916Gl7;
        this.A05 = abstractC9904Gkk;
        this.A00 = i;
        this.A07 = c10035GoB;
        this.A09 = new Object[i];
        if (i >= 32) {
            this.A08 = new BitSet();
        }
        if (abstractC9930GlR == null || abstractC9930GlR.A01() < 0) {
            return;
        }
        this.A06 = abstractC9930GlR;
    }

    public final boolean A03(AbstractC9915Gl5 abstractC9915Gl5, Object obj) {
        int iA02 = abstractC9915Gl5.A02();
        this.A09[iA02] = obj;
        BitSet bitSet = this.A08;
        if (bitSet == null) {
            int i = this.A01;
            int i2 = (1 << iA02) | i;
            if (i != i2) {
                this.A01 = i2;
                int i3 = this.A00 - 1;
                this.A00 = i3;
                if (i3 <= 0 && (this.A07 == null || this.A04 != null)) {
                    return true;
                }
            }
        } else if (!bitSet.get(iA02)) {
            bitSet.set(iA02);
            this.A00--;
        }
        return false;
    }
}
