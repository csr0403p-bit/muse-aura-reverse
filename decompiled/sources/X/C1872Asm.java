package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.Asm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1872Asm {
    public long A00;
    public Integer A01;
    public final float A02;
    public final At0 A03;
    public final AwZ A04;
    public final TransformedTextFieldState A05;
    public final C2110Aya A06;
    public final C1958Aux A07;
    public final String A08;
    public final boolean A09;

    public static int A00(C1872Asm c1872Asm) {
        c1872Asm.A06.A00 = Float.NaN;
        return c1872Asm.A08.length();
    }

    public static final int A01(C1872Asm c1872Asm, int i) {
        int iA09 = AnonymousClass002.A09(c1872Asm.A03.A00);
        C1958Aux c1958Aux = c1872Asm.A07;
        if (c1958Aux != null) {
            float f = c1872Asm.A02;
            if (!Float.isNaN(f)) {
                AaC aaCA02 = c1958Aux.A06(iA09).A02(0.0f, f * i);
                float f2 = aaCA02.A03;
                C1956Auv c1956Auv = c1958Aux.A03;
                float fA06 = c1956Auv.A06(c1956Auv.A08(f2));
                float fA01 = C8j3.A01(f2, fA06);
                float f3 = aaCA02.A00;
                float fA012 = C8j3.A01(f3, fA06);
                float f4 = aaCA02.A01;
                return c1956Auv.A0B(fA01 > fA012 ? AnonymousClass005.A0J(f4, f2) : AnonymousClass005.A0J(f4, f3));
            }
        }
        return iA09;
    }

    public static final int A02(C1872Asm c1872Asm, C1958Aux c1958Aux, int i) {
        int iA09 = AnonymousClass002.A09(c1872Asm.A00);
        C2110Aya c2110Aya = c1872Asm.A06;
        if (Float.isNaN(c2110Aya.A00)) {
            c2110Aya.A00 = c1958Aux.A06(iA09).A01;
        }
        C1956Auv c1956Auv = c1958Aux.A03;
        int iA092 = c1956Auv.A09(iA09) + i;
        if (iA092 < 0) {
            return Integer.MIN_VALUE;
        }
        if (iA092 >= c1956Auv.A02) {
            return Integer.MAX_VALUE;
        }
        float fA06 = c1956Auv.A06(iA092) - 1.0f;
        float f = c2110Aya.A00;
        return ((!A05(c1872Asm) || f < c1958Aux.A01(iA092)) && (A05(c1872Asm) || f > c1958Aux.A00(iA092))) ? c1956Auv.A0B(AnonymousClass007.A0A(f, fA06)) : c1956Auv.A0A(iA092, true);
    }

    public static final void A03(C1872Asm c1872Asm) {
        c1872Asm.A06.A00 = Float.NaN;
        String str = c1872Asm.A08;
        if (str.length() > 0) {
            int iA09 = AnonymousClass002.A09(c1872Asm.A00);
            long jA00 = AuE.A00(c1872Asm.A05, E9Z.A01(str, iA09), iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(c1872Asm)) {
                AbstractC1815ArZ.A03(c1872Asm, iA0G);
            }
            if (numA00 != null) {
                c1872Asm.A01 = numA00;
            }
        }
    }

    public static boolean A04(C1872Asm c1872Asm) {
        return Au3.A04(c1872Asm.A00);
    }

    public static final boolean A05(C1872Asm c1872Asm) {
        C1958Aux c1958Aux = c1872Asm.A07;
        return c1958Aux == null || c1958Aux.A09(AnonymousClass002.A09(c1872Asm.A00)) == C79.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            r5 = this;
            X.Aux r2 = r5.A07
            r1 = 1
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L43
            int r4 = A02(r5, r2, r1)
            if (r4 != r0) goto L14
        Le:
            X.Aya r1 = r5.A06
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.A00 = r0
        L14:
            java.lang.String r0 = r5.A08
            int r2 = r0.length()
            if (r2 <= 0) goto L42
            long r0 = r5.A00
            int r3 = X.AnonymousClass002.A09(r0)
            if (r4 <= r2) goto L25
            r4 = r2
        L25:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r5.A05
            long r0 = X.AuE.A00(r0, r4, r3)
            int r2 = X.C8j3.A0G(r0)
            java.lang.Integer r1 = X.AbstractC2093AyI.A00(r0)
            if (r2 != r3) goto L3b
            boolean r0 = A04(r5)
            if (r0 != 0) goto L3e
        L3b:
            X.AbstractC1815ArZ.A03(r5, r2)
        L3e:
            if (r1 == 0) goto L42
            r5.A01 = r1
        L42:
            return
        L43:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1872Asm.A06():void");
    }

    public final void A07() {
        if (this.A08.length() > 0) {
            int iA09 = AnonymousClass002.A09(this.A00);
            long jA00 = AuE.A00(this.A05, A01(this, 1), iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    public final void A08() {
        this.A06.A00 = Float.NaN;
        String str = this.A08;
        if (str.length() > 0) {
            int iA09 = AnonymousClass002.A09(this.A00);
            long jA00 = AuE.A00(this.A05, E9Z.A00(str, iA09), iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    public final void A09() {
        this.A06.A00 = Float.NaN;
        String str = this.A08;
        int length = str.length();
        if (length > 0) {
            long j = this.A00;
            int iA09 = AnonymousClass002.A09(j);
            int iA00 = AbstractC2057AxU.A00(str, Au3.A01(j));
            if (iA00 == Au3.A01(this.A00) && iA00 != length) {
                iA00 = AbstractC2057AxU.A00(str, iA00 + 1);
            }
            long jA00 = AuE.A00(this.A05, iA00, iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    public final void A0B() {
        this.A06.A00 = Float.NaN;
        String str = this.A08;
        if (str.length() > 0) {
            long j = this.A00;
            int iA09 = AnonymousClass002.A09(j);
            int iA01 = AbstractC2057AxU.A01(str, Au3.A02(j));
            if (iA01 == Au3.A02(this.A00) && iA01 != 0) {
                iA01 = AbstractC2057AxU.A01(str, iA01 - 1);
            }
            long jA00 = AuE.A00(this.A05, iA01, iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H() {
        /*
            r4 = this;
            X.Aux r2 = r4.A07
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L43
            r0 = -1
            int r2 = A02(r4, r2, r0)
            if (r2 != r1) goto L13
        Ld:
            X.Aya r1 = r4.A06
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.A00 = r0
        L13:
            java.lang.String r0 = r4.A08
            int r0 = r0.length()
            if (r0 <= 0) goto L42
            long r0 = r4.A00
            int r3 = X.AnonymousClass002.A09(r0)
            r0 = 0
            if (r2 >= r0) goto L25
            r2 = 0
        L25:
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r4.A05
            long r0 = X.AuE.A00(r0, r2, r3)
            int r2 = X.C8j3.A0G(r0)
            java.lang.Integer r1 = X.AbstractC2093AyI.A00(r0)
            if (r2 != r3) goto L3b
            boolean r0 = A04(r4)
            if (r0 != 0) goto L3e
        L3b:
            X.AbstractC1815ArZ.A03(r4, r2)
        L3e:
            if (r1 == 0) goto L42
            r4.A01 = r1
        L42:
            return
        L43:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1872Asm.A0H():void");
    }

    public final void A0I() {
        if (this.A08.length() > 0) {
            int iA09 = AnonymousClass002.A09(this.A00);
            long jA00 = AuE.A00(this.A05, A01(this, -1), iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    public C1872Asm(TransformedTextFieldState transformedTextFieldState, C2110Aya c2110Aya, C1958Aux c1958Aux, float f, boolean z) {
        this.A05 = transformedTextFieldState;
        this.A07 = c1958Aux;
        this.A09 = z;
        this.A02 = f;
        this.A06 = c2110Aya;
        Snapshot snapshotA03 = Snapshot.A03();
        G0U g0uA1F = C8j3.A1F(snapshotA03);
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            At0 at0A07 = transformedTextFieldState.A07();
            this.A03 = at0A07;
            this.A04 = (AwZ) transformedTextFieldState.A03.getValue();
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
            this.A00 = at0A07.A00;
            this.A08 = at0A07.A02.toString();
        } catch (Throwable th) {
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
            throw th;
        }
    }

    public final void A0A() {
        int length;
        int iA00 = A00(this);
        if (iA00 > 0) {
            int iA09 = AnonymousClass002.A09(this.A00);
            C1958Aux c1958Aux = this.A07;
            if (c1958Aux != null) {
                int i = iA09;
                while (true) {
                    At0 at0 = this.A03;
                    if (i < at0.length()) {
                        int i2 = i;
                        int i3 = iA00 - 1;
                        if (i > i3) {
                            i2 = i3;
                        }
                        length = AnonymousClass002.A09(c1958Aux.A04(i2));
                        if (length > i) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        length = at0.length();
                        break;
                    }
                }
            } else {
                length = iA00;
            }
            long jA00 = AuE.A00(this.A05, length, iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    public final void A0C() {
        int iA00 = A00(this);
        if (iA00 > 0) {
            int iA09 = AnonymousClass002.A09(this.A00);
            C1958Aux c1958Aux = this.A07;
            int iA0G = 0;
            if (c1958Aux != null) {
                int i = iA09;
                while (true) {
                    iA0G = 0;
                    if (i <= 0) {
                        break;
                    }
                    int i2 = i;
                    int i3 = iA00 - 1;
                    if (i > i3) {
                        i2 = i3;
                    }
                    iA0G = C8j3.A0G(c1958Aux.A04(i2));
                    if (iA0G < i) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            long jA00 = AuE.A00(this.A05, iA0G, iA09);
            int iA0G2 = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G2 != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G2);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    public final void A0D() {
        int iA00 = A00(this);
        if (iA00 > 0) {
            int iA09 = AnonymousClass002.A09(this.A00);
            long jA00 = AuE.A00(this.A05, iA00, iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    public final void A0E() {
        if (A00(this) > 0) {
            int iA09 = AnonymousClass002.A09(this.A00);
            long jA00 = AuE.A00(this.A05, 0, iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    public final void A0F() {
        int iA00 = A00(this);
        if (iA00 > 0) {
            long j = this.A00;
            int iA09 = AnonymousClass002.A09(j);
            C1958Aux c1958Aux = this.A07;
            if (c1958Aux != null) {
                int iA01 = Au3.A01(j);
                C1956Auv c1956Auv = c1958Aux.A03;
                iA00 = c1956Auv.A0A(c1956Auv.A09(iA01), true);
            }
            long jA00 = AuE.A00(this.A05, iA00, iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }

    public final void A0G() {
        if (A00(this) > 0) {
            long j = this.A00;
            int iA09 = AnonymousClass002.A09(j);
            C1958Aux c1958Aux = this.A07;
            int iA03 = 0;
            if (c1958Aux != null) {
                iA03 = c1958Aux.A03(c1958Aux.A03.A09(Au3.A02(j)));
            }
            long jA00 = AuE.A00(this.A05, iA03, iA09);
            int iA0G = C8j3.A0G(jA00);
            Integer numA00 = AbstractC2093AyI.A00(jA00);
            if (iA0G != iA09 || !A04(this)) {
                AbstractC1815ArZ.A03(this, iA0G);
            }
            if (numA00 != null) {
                this.A01 = numA00;
            }
        }
    }
}
