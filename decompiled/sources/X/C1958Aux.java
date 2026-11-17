package X;

import android.graphics.RectF;
import android.text.Layout;
import java.util.List;

/* renamed from: X.Aux, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1958Aux {
    public final float A00;
    public final float A01;
    public final long A02;
    public final C1956Auv A03;
    public final C1870Ask A04;
    public final List<AaC> A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1958Aux) {
                C1958Aux c1958Aux = (C1958Aux) obj;
                if (!this.A04.equals(c1958Aux.A04) || !C7384Etj.areEqual(this.A03, c1958Aux.A03) || this.A02 != c1958Aux.A02 || this.A00 != c1958Aux.A00 || this.A01 != c1958Aux.A01 || !C7384Etj.areEqual(this.A05, c1958Aux.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final float A00(int i) {
        C1960Auz c1960AuzA02 = C1956Auv.A02(this.A03, i);
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA02.A06;
        int i2 = i - c1960AuzA02.A03;
        C1999Aw8 c1999Aw8 = ((C1957Auw) interfaceC2006AwF).A01;
        return c1999Aw8.A09.getLineLeft(i2) + (i2 == c1999Aw8.A06 + (-1) ? c1999Aw8.A02 : 0.0f);
    }

    public final float A01(int i) {
        C1960Auz c1960AuzA02 = C1956Auv.A02(this.A03, i);
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA02.A06;
        int i2 = i - c1960AuzA02.A03;
        C1999Aw8 c1999Aw8 = ((C1957Auw) interfaceC2006AwF).A01;
        return c1999Aw8.A09.getLineRight(i2) + (i2 == c1999Aw8.A06 + (-1) ? c1999Aw8.A03 : 0.0f);
    }

    public final float A02(int i, boolean z) {
        C1956Auv c1956Auv = this.A03;
        C1956Auv.A04(c1956Auv, i);
        int length = c1956Auv.A04.A00.length();
        List<C1960Auz> list = c1956Auv.A05;
        C1960Auz c1960AuzA0i = C8j3.A0i(list, i == length ? AnonymousClass002.A0E(list) : Av0.A00(list, i));
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA0i.A06;
        int iA05 = ATD.A05(c1960AuzA0i, i);
        C1999Aw8 c1999Aw8 = ((C1957Auw) interfaceC2006AwF).A01;
        return z ? c1999Aw8.A05(iA05, false) : c1999Aw8.A06(iA05, false);
    }

    public final int A03(int i) {
        C1960Auz c1960AuzA02 = C1956Auv.A02(this.A03, i);
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA02.A06;
        return ((C1957Auw) interfaceC2006AwF).A01.A09.getLineStart(i - c1960AuzA02.A03) + c1960AuzA02.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:
    
        if (X.C1959Auy.A05(r4, r2) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        if (X.C1959Auy.A03(r4, r2) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A04(int r7) {
        /*
            r6 = this;
            X.Auv r1 = r6.A03
            X.C1956Auv.A04(r1, r7)
            X.Ary r0 = r1.A04
            X.ApQ r0 = r0.A00
            int r0 = r0.length()
            java.util.List<X.Auz> r1 = r1.A05
            if (r7 != r0) goto Le4
            int r0 = X.AnonymousClass002.A0E(r1)
        L15:
            X.Auz r3 = X.C8j3.A0i(r1, r0)
            X.AwF r0 = r3.A06
            int r2 = X.ATD.A05(r3, r7)
            X.Auw r0 = (X.C1957Auw) r0
            X.Aw8 r0 = r0.A01
            X.Auy r4 = r0.A08()
            int r1 = r4.A07(r2)
            int r7 = r4.A01
            int r6 = r4.A00
            if (r1 >= r6) goto Le1
            if (r7 > r1) goto Le1
            java.lang.CharSequence r0 = r4.A02
            int r0 = java.lang.Character.codePointAt(r0, r1)
            boolean r0 = X.C1959Auy.A02(r0)
        L3d:
            r1 = r2
            if (r0 == 0) goto Lc0
            X.C1959Auy.A00(r4, r2)
        L43:
            r0 = -1
            if (r1 == r0) goto L5f
            if (r1 >= r6) goto Lbb
            if (r7 > r1) goto Lbb
            java.lang.CharSequence r0 = r4.A02
            int r0 = java.lang.Character.codePointAt(r0, r1)
            boolean r0 = X.C1959Auy.A02(r0)
            if (r0 == 0) goto Lbb
            boolean r0 = r4.A08(r1)
            if (r0 != 0) goto Lbb
        L5c:
            r0 = -1
            if (r1 != r0) goto L60
        L5f:
            r1 = r2
        L60:
            int r0 = r4.A06(r2)
            boolean r0 = r4.A08(r0)
            r5 = r2
            if (r0 == 0) goto L9a
            X.C1959Auy.A00(r4, r2)
        L6e:
            r0 = -1
            if (r5 == r0) goto L8a
            if (r5 >= r6) goto L81
            if (r7 > r5) goto L81
            java.lang.CharSequence r0 = r4.A02
            int r0 = java.lang.Character.codePointAt(r0, r5)
            boolean r0 = X.C1959Auy.A02(r0)
            if (r0 != 0) goto L95
        L81:
            boolean r0 = r4.A08(r5)
            if (r0 == 0) goto L95
        L87:
            r0 = -1
            if (r5 != r0) goto L8b
        L8a:
            r5 = r2
        L8b:
            long r1 = X.AbstractC1815ArZ.A00(r1, r5)
            r0 = 0
            long r0 = r3.A00(r1, r0)
            return r0
        L95:
            int r5 = r4.A06(r5)
            goto L6e
        L9a:
            X.C1959Auy.A00(r4, r2)
            boolean r0 = X.C1959Auy.A03(r4, r2)
            if (r0 == 0) goto Lb4
            boolean r0 = X.C1959Auy.A04(r4, r2)
            if (r0 == 0) goto Laf
            boolean r0 = X.C1959Auy.A05(r4, r2)
            if (r0 == 0) goto L87
        Laf:
            int r5 = r4.A06(r2)
            goto L87
        Lb4:
            boolean r0 = X.C1959Auy.A05(r4, r2)
            if (r0 == 0) goto L8a
            goto Laf
        Lbb:
            int r1 = r4.A07(r1)
            goto L43
        Lc0:
            X.C1959Auy.A00(r4, r2)
            boolean r0 = X.C1959Auy.A05(r4, r2)
            if (r0 == 0) goto Lda
            boolean r0 = X.C1959Auy.A04(r4, r2)
            if (r0 == 0) goto Ld5
            boolean r0 = X.C1959Auy.A03(r4, r2)
            if (r0 == 0) goto L5c
        Ld5:
            int r1 = r4.A07(r2)
            goto L5c
        Lda:
            boolean r0 = X.C1959Auy.A03(r4, r2)
            if (r0 == 0) goto L5f
            goto Ld5
        Le1:
            r0 = 0
            goto L3d
        Le4:
            int r0 = X.Av0.A00(r1, r7)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1958Aux.A04(int):long");
    }

    public final AaC A05(int i) {
        float fA06;
        float fA062;
        C1956Auv c1956Auv = this.A03;
        C1956Auv.A03(c1956Auv, i);
        List<C1960Auz> list = c1956Auv.A05;
        C1960Auz c1960AuzA0i = C8j3.A0i(list, Av0.A00(list, i));
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA0i.A06;
        int iA05 = ATD.A05(c1960AuzA0i, i);
        C1957Auw c1957Auw = (C1957Auw) interfaceC2006AwF;
        if (iA05 < 0 || iA05 >= c1957Auw.A03.length()) {
            throw C60O.A0i(C8j4.A0y("offset(", ") is out of bounds [0,", iA05, c1957Auw.A03.length()));
        }
        C1999Aw8 c1999Aw8 = c1957Auw.A01;
        Layout layout = c1999Aw8.A09;
        int lineForOffset = layout.getLineForOffset(iA05);
        float fA04 = c1999Aw8.A04(lineForOffset);
        float fA03 = c1999Aw8.A03(lineForOffset);
        boolean zA1Q = AnonymousClass002.A1Q(layout.getParagraphDirection(lineForOffset), 1);
        boolean zIsRtlCharAt = layout.isRtlCharAt(iA05);
        if (zA1Q) {
            if (zIsRtlCharAt) {
                fA062 = c1999Aw8.A06(iA05, false);
                fA06 = c1999Aw8.A06(iA05 + 1, true);
            } else {
                fA06 = c1999Aw8.A05(iA05, false);
                fA062 = c1999Aw8.A05(iA05 + 1, true);
            }
        } else if (zIsRtlCharAt) {
            fA062 = c1999Aw8.A05(iA05, false);
            fA06 = c1999Aw8.A05(iA05 + 1, true);
        } else {
            fA06 = c1999Aw8.A06(iA05, false);
            fA062 = c1999Aw8.A06(iA05 + 1, true);
        }
        RectF rectF = new RectF(fA06, fA04, fA062, fA03);
        return C8j3.A0f(rectF.left, rectF.top, rectF.right, rectF.bottom).A03(AnonymousClass007.A0A(0.0f, c1960AuzA0i.A01));
    }

    public final AaC A06(int i) {
        C1956Auv c1956Auv = this.A03;
        C1956Auv.A04(c1956Auv, i);
        int length = c1956Auv.A04.A00.length();
        List<C1960Auz> list = c1956Auv.A05;
        C1960Auz c1960AuzA0i = C8j3.A0i(list, i == length ? AnonymousClass002.A0E(list) : Av0.A00(list, i));
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA0i.A06;
        int iA05 = ATD.A05(c1960AuzA0i, i);
        C1957Auw c1957Auw = (C1957Auw) interfaceC2006AwF;
        if (iA05 < 0 || iA05 > c1957Auw.A03.length()) {
            throw C60O.A0i(FGI.A0Q("offset(", ") is out of bounds [0,", ']', iA05, c1957Auw.A03.length()));
        }
        C1999Aw8 c1999Aw8 = c1957Auw.A01;
        float fA05 = c1999Aw8.A05(iA05, false);
        int lineForOffset = c1999Aw8.A09.getLineForOffset(iA05);
        return new AaC(fA05, c1999Aw8.A04(lineForOffset), fA05, c1999Aw8.A03(lineForOffset)).A03(AnonymousClass007.A0A(0.0f, c1960AuzA0i.A01));
    }

    public final C1710Aot A07(int i, int i2) {
        C1956Auv c1956Auv = this.A03;
        if (i < 0 || i > i2 || i2 > C8j3.A0I(c1956Auv.A04.A00)) {
            throw C60O.A0i(FGI.A0f("Start(", ") or End(", ") is out of range [0..", "), or start > end!", i, i2, C8j3.A0I(c1956Auv.A04.A00)));
        }
        C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
        if (i != i2) {
            Av0.A02(c1956Auv.A05, new BT6(c1710AotA00, i, i2), C8j3.A0T(i, i2));
        }
        return c1710AotA00;
    }

    public final Integer A08(int i) {
        C1956Auv c1956Auv = this.A03;
        C1956Auv.A04(c1956Auv, i);
        int length = c1956Auv.A04.A00.length();
        List<C1960Auz> list = c1956Auv.A05;
        C1960Auz c1960AuzA0i = C8j3.A0i(list, i == length ? AnonymousClass002.A0E(list) : Av0.A00(list, i));
        return ((C1957Auw) c1960AuzA0i.A06).A01.A09.isRtlCharAt(ATD.A05(c1960AuzA0i, i)) ? C79.A01 : C79.A00;
    }

    public final Integer A09(int i) {
        C1956Auv c1956Auv = this.A03;
        C1956Auv.A04(c1956Auv, i);
        int length = c1956Auv.A04.A00.length();
        List<C1960Auz> list = c1956Auv.A05;
        C1960Auz c1960AuzA0i = C8j3.A0i(list, i == length ? AnonymousClass002.A0E(list) : Av0.A00(list, i));
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA0i.A06;
        int iA05 = ATD.A05(c1960AuzA0i, i);
        Layout layout = ((C1957Auw) interfaceC2006AwF).A01.A09;
        return layout.getParagraphDirection(layout.getLineForOffset(iA05)) == 1 ? C79.A00 : C79.A01;
    }

    public final boolean A0A() {
        long j = this.A02;
        float fA0G = C8j3.A0G(j);
        C1956Auv c1956Auv = this.A03;
        return fA0G < c1956Auv.A01 || c1956Auv.A07 || ((float) AnonymousClass002.A09(j)) < c1956Auv.A00;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A05, AnonymousClass005.A02(AnonymousClass005.A02(C60R.A00(this.A02, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A04))), this.A00), this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextLayoutResult(layoutInput=");
        sbA0x.append(this.A04);
        sbA0x.append(", multiParagraph=");
        sbA0x.append(this.A03);
        sbA0x.append(", size=");
        sbA0x.append((Object) BL4.A01(this.A02));
        sbA0x.append(", firstBaseline=");
        sbA0x.append(this.A00);
        sbA0x.append(", lastBaseline=");
        sbA0x.append(this.A01);
        sbA0x.append(", placeholderRects=");
        return AnonymousClass007.A0Z(this.A05, sbA0x);
    }

    public C1958Aux(C1956Auv c1956Auv, C1870Ask c1870Ask, long j) {
        float fA02;
        this.A04 = c1870Ask;
        this.A03 = c1956Auv;
        this.A02 = j;
        List<C1960Auz> list = c1956Auv.A05;
        this.A00 = list.isEmpty() ? 0.0f : ((C1957Auw) C8j3.A0i(list, 0).A06).A01.A02(0);
        if (list.isEmpty()) {
            fA02 = 0.0f;
        } else {
            C1960Auz c1960Auz = (C1960Auz) AbstractC0878AGe.A0H(list);
            fA02 = ((C1957Auw) c1960Auz.A06).A01.A02(r1.A06 - 1) + c1960Auz.A01;
        }
        this.A01 = fA02;
        this.A05 = c1956Auv.A06;
    }
}
