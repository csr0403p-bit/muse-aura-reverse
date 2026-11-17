package androidx.compose.foundation.text.input.internal;

import X.AbstractC1798ArH;
import X.AbstractC1815ArZ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.At0;
import X.Au2;
import X.Au3;
import X.AuA;
import X.AuC;
import X.AwZ;
import X.BBP;
import X.BTB;
import X.C0910AHm;
import X.C1890At8;
import X.C1891AtA;
import X.C1BO;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C8j3;
import X.InterfaceC2143AzF;
import X.InterfaceC2154Azi;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class TransformedTextFieldState {
    public InterfaceC2143AzF A00;
    public final C1890At8 A01;
    public final InterfaceC2154Azi A02;
    public final MutableState A03;
    public final C1BO<AuA> A04;

    public static final long A00(Au2 au2, AwZ awZ, long j) {
        int iA09;
        int iA092;
        long jA01 = Au2.A01(au2, (int) (j >> 32), true);
        long jA00 = jA01;
        boolean zA04 = Au3.A04(j);
        if (!zA04) {
            jA01 = Au2.A01(au2, AnonymousClass002.A09(j), true);
        }
        Integer num = null;
        Integer num2 = awZ != null ? awZ.A01 : null;
        if (zA04) {
            num = num2;
        } else if (awZ != null) {
            num = awZ.A00;
        }
        if (num2 != null && !Au3.A04(jA00)) {
            int iIntValue = num2.intValue();
            if (iIntValue == 0) {
                iA092 = (int) (jA00 >> 32);
            } else {
                if (iIntValue != 1) {
                    throw C3cG.A0q();
                }
                iA092 = AnonymousClass002.A09(jA00);
            }
            jA00 = AbstractC1815ArZ.A00(iA092, iA092);
        }
        if (num != null && !Au3.A04(jA01)) {
            int iIntValue2 = num.intValue();
            if (iIntValue2 == 0) {
                iA09 = (int) (jA01 >> 32);
            } else {
                if (iIntValue2 != 1) {
                    throw C3cG.A0q();
                }
                iA09 = AnonymousClass002.A09(jA01);
            }
            jA01 = AbstractC1815ArZ.A00(iA09, iA09);
        }
        int iMin = Math.min(Au3.A02(jA00), Au3.A02(jA01));
        int iMax = Math.max(Au3.A01(jA00), Au3.A01(jA01));
        return Au3.A05(j) ? AbstractC1815ArZ.A00(iMax, iMin) : AbstractC1815ArZ.A00(iMin, iMax);
    }

    public static final void A03(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, Integer num, long j, boolean z) {
        C1890At8 c1890At8 = transformedTextFieldState.A01;
        InterfaceC2143AzF interfaceC2143AzF = transformedTextFieldState.A00;
        C0910AHm.A06(c1890At8);
        C1891AtA c1891AtA = c1890At8.A00;
        long jA05 = transformedTextFieldState.A05(j);
        int iA02 = Au3.A02(jA05);
        c1891AtA.A05(charSequence, iA02, Au3.A01(jA05));
        int length = iA02 + charSequence.length();
        AuC.A01(c1891AtA, length, length);
        A01(c1891AtA, transformedTextFieldState);
        C1890At8.A02(interfaceC2143AzF, c1890At8, num, z);
        C1890At8.A06(c1890At8, true);
    }

    public static final void A04(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, Integer num, boolean z, boolean z2) {
        C1890At8 c1890At8 = transformedTextFieldState.A01;
        InterfaceC2143AzF interfaceC2143AzF = transformedTextFieldState.A00;
        C0910AHm.A06(c1890At8);
        C1891AtA c1891AtA = c1890At8.A00;
        if (z) {
            c1891AtA.A03();
        }
        long j = c1891AtA.A00;
        c1891AtA.A05(charSequence, Au3.A02(j), Au3.A01(j));
        int iA02 = Au3.A02(j) + charSequence.length();
        AuC.A01(c1891AtA, iA02, iA02);
        A01(c1891AtA, transformedTextFieldState);
        C1890At8.A02(interfaceC2143AzF, c1890At8, num, z2);
        C1890At8.A06(c1890At8, true);
    }

    public final long A05(long j) {
        AuA value;
        C1BO<AuA> c1bo = this.A04;
        if (c1bo == null || (value = c1bo.getValue()) == null) {
            return j;
        }
        Au2 au2 = value.A01;
        long jA01 = Au2.A01(au2, C8j3.A0G(j), false);
        if (!Au3.A04(j)) {
            jA01 = Au2.A01(au2, AnonymousClass002.A09(j), false);
        }
        int iMin = Math.min(Au3.A02(jA01), Au3.A02(jA01));
        int iMax = Math.max(Au3.A01(jA01), Au3.A01(jA01));
        return Au3.A05(j) ? AbstractC1815ArZ.A00(iMax, iMin) : AbstractC1815ArZ.A00(iMin, iMax);
    }

    public final long A06(long j) {
        AuA value;
        C1BO<AuA> c1bo = this.A04;
        return (c1bo == null || (value = c1bo.getValue()) == null) ? j : A00(value.A01, (AwZ) this.A03.getValue(), j);
    }

    public final At0 A07() {
        AuA value;
        C1BO<AuA> c1bo = this.A04;
        return (c1bo == null || (value = c1bo.getValue()) == null) ? (At0) this.A01.A05.getValue() : value.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(X.InterfaceC2157Azn r6, X.HtJ<?> r7) {
        /*
            r5 = this;
            r3 = 12
            boolean r0 = r7 instanceof X.C2312BTm
            if (r0 == 0) goto L28
            r4 = r7
            X.BTm r4 = (X.C2312BTm) r4
            int r0 = r4.$t
            if (r0 != r3) goto L28
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r2 = r4.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 == r0) goto L50
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L28:
            X.BTm r4 = new X.BTm
            r4.<init>(r5, r7, r3)
            goto L18
        L2e:
            X.Hwg.A00(r2)
            r4.A01 = r6
            r4.A00 = r0
            X.GBL r2 = X.C7Bm.A04(r4)
            X.At8 r0 = r5.A01
            X.AHm<X.Azn> r0 = r0.A06
            r0.A0G(r6)
            r1 = 3
            X.BT9 r0 = new X.BT9
            r0.<init>(r1, r5, r6)
            r2.AO2(r0)
            java.lang.Object r0 = r2.A0F()
            if (r0 != r3) goto L53
            return r3
        L50:
            X.Hwg.A00(r2)
        L53:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TransformedTextFieldState.A08(X.Azn, X.HtJ):X.Hji");
    }

    public final void A09() {
        C1890At8 c1890At8 = this.A01;
        InterfaceC2143AzF interfaceC2143AzF = this.A00;
        Integer num = C79.A0C;
        C0910AHm.A06(c1890At8);
        C1891AtA c1891AtA = c1890At8.A00;
        long j = c1891AtA.A00;
        c1891AtA.A05("", Au3.A02(j), Au3.A01(j));
        int iA02 = Au3.A02(c1891AtA.A00);
        AuC.A01(c1891AtA, iA02, iA02);
        A01(c1891AtA, this);
        C1890At8.A01(interfaceC2143AzF, c1890At8, num);
    }

    public final void A0A(long j) {
        C1890At8 c1890At8 = this.A01;
        InterfaceC2143AzF interfaceC2143AzF = this.A00;
        Integer num = C79.A00;
        C0910AHm.A06(c1890At8);
        AuC.A01(c1890At8.A00, C8j3.A0G(j), AnonymousClass002.A09(j));
        C1890At8.A01(interfaceC2143AzF, c1890At8, num);
    }

    public final void A0B(CharSequence charSequence) {
        C1890At8 c1890At8 = this.A01;
        InterfaceC2143AzF interfaceC2143AzF = this.A00;
        Integer num = C79.A00;
        C0910AHm.A06(c1890At8);
        C1891AtA c1891AtA = c1890At8.A00;
        c1891AtA.A05("", 0, c1891AtA.A05.length());
        c1891AtA.append(charSequence.toString());
        A01(c1891AtA, this);
        C1890At8.A01(interfaceC2143AzF, c1890At8, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransformedTextFieldState) {
            TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
            if (C7384Etj.areEqual(this.A01, transformedTextFieldState.A01) && C7384Etj.areEqual(this.A02, transformedTextFieldState.A02)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (AnonymousClass005.A0E(this.A01) + C60R.A01(this.A02)) * 31;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TransformedTextFieldState(textFieldState=");
        C1890At8 c1890At8 = this.A01;
        sbA0x.append(c1890At8);
        sbA0x.append(", outputTransformation=");
        sbA0x.append((Object) null);
        sbA0x.append(", outputTransformedText=");
        sbA0x.append((Object) null);
        sbA0x.append(", codepointTransformation=");
        sbA0x.append(this.A02);
        sbA0x.append(", codepointTransformedText=");
        sbA0x.append(this.A04);
        sbA0x.append(", outputText=\"");
        sbA0x.append(c1890At8.A05.getValue());
        sbA0x.append("\", visualText=\"");
        sbA0x.append((Object) A07());
        return AnonymousClass001.A0v("\")", sbA0x);
    }

    public TransformedTextFieldState(InterfaceC2143AzF interfaceC2143AzF, C1890At8 c1890At8, InterfaceC2154Azi interfaceC2154Azi) {
        this.A01 = c1890At8;
        this.A00 = interfaceC2143AzF;
        this.A02 = interfaceC2154Azi;
        this.A04 = interfaceC2154Azi != null ? new BBP(null, new BTB(21, this, interfaceC2154Azi)) : null;
        Integer num = C79.A00;
        this.A03 = AbstractC1798ArH.A06(new AwZ(num, num));
    }

    public static final void A01(C1891AtA c1891AtA, TransformedTextFieldState transformedTextFieldState) {
        if (c1891AtA.A02().A00.A00 <= 0 || !Au3.A04(c1891AtA.A00)) {
            return;
        }
        Integer num = C79.A00;
        transformedTextFieldState.A03.Af8(new AwZ(num, num));
    }

    public static void A02(TransformedTextFieldState transformedTextFieldState, long j) {
        transformedTextFieldState.A0A(transformedTextFieldState.A05(j));
    }
}
