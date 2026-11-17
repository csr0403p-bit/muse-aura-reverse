package X;

import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Auv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1956Auv {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final C1834Ary A04;
    public final List<C1960Auz> A05;
    public final List<AaC> A06;
    public final boolean A07;

    public static final int A00(List<C1960Auz> list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C1960Auz) AbstractC0878AGe.A0H(list)).A00) {
            return AnonymousClass002.A0E(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C1960Auz c1960AuzA0i = C8j3.A0i(list, i2);
            if (c1960AuzA0i.A01 > f) {
                size = i2 - 1;
            } else {
                if (c1960AuzA0i.A00 > f) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final void A0D(InterfaceC1327AhE interfaceC1327AhE, C1780Aqg c1780Aqg, C16b c16b, BG3 bg3, long j) {
        interfaceC1327AhE.Ac2();
        List<C1960Auz> list = this.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2006AwF interfaceC2006AwF = list.get(i).A06;
            C1957Auw c1957Auw = (C1957Auw) interfaceC2006AwF;
            C1779Aqf c1779Aqf = c1957Auw.A02.A05;
            int i2 = c1779Aqf.A00;
            c1779Aqf.A02(j);
            c1779Aqf.A04(c1780Aqg);
            c1779Aqf.A06(bg3);
            c1779Aqf.A05(c16b);
            c1779Aqf.A01(3);
            C1957Auw.A01(interfaceC1327AhE, c1957Auw);
            c1779Aqf.A01(i2);
            interfaceC1327AhE.AhL(0.0f, interfaceC2006AwF.AGD());
        }
        interfaceC1327AhE.Abc();
    }

    public final void A0E(float[] fArr, long j) {
        A03(this, Au3.A02(j));
        A04(this, Au3.A01(j));
        F1E f1e = new F1E();
        f1e.element = 0;
        Av0.A02(this.A05, new BTP(fArr, new C1051ASv(), f1e, 1, j), j);
    }

    public C1956Auv(C1834Ary c1834Ary, int i, int i2, long j) {
        this.A04 = c1834Ary;
        this.A03 = i;
        boolean z = true;
        if (Constraints.A03(j) != 0 || Constraints.A02(j) != 0) {
            throw C60O.A0i("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayListA0h = C3cG.A0h();
        List<C1836As0> list = c1834Ary.A01;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (i3 < size) {
            C1836As0 c1836As0 = list.get(i3);
            InterfaceC1841AsE interfaceC1841AsE = c1836As0.A02;
            int iA01 = Constraints.A01(j);
            boolean zA09 = Constraints.A09(j);
            int iA00 = Constraints.A00(j);
            if (zA09 && (iA00 = iA00 - ((int) Math.ceil(f))) < 0) {
                iA00 = 0;
            }
            C1957Auw c1957Auw = new C1957Auw((C1833Arx) interfaceC1841AsE, this.A03 - i4, i2, AYL.A05(0, iA01, 0, iA00));
            float fAGD = f + c1957Auw.AGD();
            C1999Aw8 c1999Aw8 = c1957Auw.A01;
            int i5 = i4 + c1999Aw8.A06;
            arrayListA0h.add(new C1960Auz(c1957Auw, f, fAGD, c1836As0.A01, c1836As0.A00, i4, i5));
            if (!c1999Aw8.A0C) {
                if (i5 == this.A03) {
                    C7384Etj.A0Y(this.A04.A01, 0);
                    if (i3 != r0.size() - 1) {
                    }
                }
                i3++;
                i4 = i5;
                f = fAGD;
            }
            i4 = i5;
            f = fAGD;
            break;
        }
        z = false;
        this.A00 = f;
        this.A02 = i4;
        this.A07 = z;
        this.A05 = arrayListA0h;
        this.A01 = Constraints.A01(j);
        ArrayList arrayListA19 = C8j3.A19(arrayListA0h);
        int size2 = arrayListA0h.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C1960Auz c1960Auz = (C1960Auz) arrayListA0h.get(i6);
            List<AaC> list2 = ((C1957Auw) c1960Auz.A06).A04;
            ArrayList arrayList = new ArrayList(list2.size());
            int size3 = list2.size();
            for (int i7 = 0; i7 < size3; i7++) {
                AaC aaC = list2.get(i7);
                arrayList.add(aaC != null ? aaC.A03(AnonymousClass007.A0A(0.0f, c1960Auz.A01)) : null);
            }
            AbstractC0882AGj.A0r(arrayList, arrayListA19);
        }
        if (arrayListA19.size() < this.A04.A02.size()) {
            int size4 = this.A04.A02.size() - arrayListA19.size();
            ArrayList arrayListA11 = C60O.A11(size4);
            for (int i8 = 0; i8 < size4; i8++) {
                arrayListA11.add(null);
            }
            arrayListA19 = AbstractC0878AGe.A0P(arrayListA11, arrayListA19);
        }
        this.A06 = arrayListA19;
    }

    public static final void A03(C1956Auv c1956Auv, int i) {
        if (i < 0 || i >= C8j3.A0I(c1956Auv.A04.A00)) {
            throw C60O.A0i(C8j4.A0y("offset(", ") is out of bounds [0, ", i, c1956Auv.A04.A00.length()));
        }
    }

    public static final void A04(C1956Auv c1956Auv, int i) {
        if (i < 0 || i > C8j3.A0I(c1956Auv.A04.A00)) {
            throw C60O.A0i(FGI.A0Q("offset(", ") is out of bounds [0, ", ']', i, c1956Auv.A04.A00.length()));
        }
    }

    public static final void A05(C1956Auv c1956Auv, int i) {
        if (i < 0 || i >= c1956Auv.A02) {
            throw C60O.A0i(C8j4.A0y("lineIndex(", ") is out of bounds [0, ", i, c1956Auv.A02));
        }
    }

    public final int A08(float f) {
        List<C1960Auz> list = this.A05;
        C1960Auz c1960AuzA0i = C8j3.A0i(list, A00(list, f));
        if (c1960AuzA0i.A04 - c1960AuzA0i.A05 == 0) {
            return c1960AuzA0i.A03;
        }
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA0i.A06;
        float f2 = f - c1960AuzA0i.A01;
        C1999Aw8 c1999Aw8 = ((C1957Auw) interfaceC2006AwF).A01;
        return c1999Aw8.A09.getLineForVertical(((int) f2) - c1999Aw8.A07) + c1960AuzA0i.A03;
    }

    public final int A09(int i) {
        C1960Auz c1960AuzA0i = C8j3.A0i(this.A05, i >= this.A04.A00.length() ? AnonymousClass002.A0E(this.A05) : i < 0 ? 0 : Av0.A00(this.A05, i));
        return ((C1957Auw) c1960AuzA0i.A06).A01.A09.getLineForOffset(ATD.A05(c1960AuzA0i, i)) + c1960AuzA0i.A03;
    }

    public final int A0B(long j) {
        List<C1960Auz> list = this.A05;
        float fA01 = AnonymousClass001.A01(4294967295L, j);
        C1960Auz c1960AuzA0i = C8j3.A0i(list, A00(list, fA01));
        int i = c1960AuzA0i.A04;
        int i2 = c1960AuzA0i.A05;
        if (i - i2 == 0) {
            return i2;
        }
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA0i.A06;
        long jA0M = AnonymousClass005.A0M(AnonymousClass001.A00(j), fA01 - c1960AuzA0i.A01);
        C1999Aw8 c1999Aw8 = ((C1957Auw) interfaceC2006AwF).A01;
        int iA01 = (int) AnonymousClass001.A01(4294967295L, jA0M);
        Layout layout = c1999Aw8.A09;
        int lineForVertical = layout.getLineForVertical(iA01 - c1999Aw8.A07);
        return i2 + layout.getOffsetForHorizontal(lineForVertical, AnonymousClass001.A00(jA0M) + ((-1.0f) * (lineForVertical == c1999Aw8.A06 + (-1) ? c1999Aw8.A02 + c1999Aw8.A03 : 0.0f)));
    }

    public final long A0C(AaC aaC, InterfaceC2114Aye interfaceC2114Aye, int i) {
        List<C1960Auz> list = this.A05;
        int iA00 = A00(list, aaC.A03);
        float f = C8j3.A0i(list, iA00).A00;
        float f2 = aaC.A00;
        if (f >= f2 || iA00 == C60O.A00(list)) {
            return A01(aaC, interfaceC2114Aye, list, iA00, i);
        }
        int iA002 = A00(list, f2);
        long j = Au3.A01;
        long jA01 = j;
        while (jA01 == j && iA00 <= iA002) {
            jA01 = A01(aaC, interfaceC2114Aye, list, iA00, i);
            iA00++;
        }
        if (jA01 == j) {
            return j;
        }
        long jA012 = j;
        while (jA012 == j && iA00 <= iA002) {
            jA012 = A01(aaC, interfaceC2114Aye, list, iA002, i);
            iA002--;
        }
        return jA012 == j ? jA01 : AbstractC1815ArZ.A00(C8j3.A0G(jA01), AnonymousClass002.A09(jA012));
    }

    public static long A01(AaC aaC, InterfaceC2114Aye interfaceC2114Aye, List list, int i, int i2) {
        C1960Auz c1960Auz = (C1960Auz) list.get(i);
        int[] iArrA09 = ((C1957Auw) c1960Auz.A06).A01.A09(AbstractC1709Aos.A01(c1960Auz.A01(aaC)), new C2296BSw(interfaceC2114Aye, 19), i2 == 0 ? 0 : 1);
        return c1960Auz.A00(iArrA09 == null ? Au3.A01 : AbstractC1815ArZ.A00(iArrA09[0], iArrA09[1]), true);
    }

    public static C1960Auz A02(C1956Auv c1956Auv, int i) {
        A05(c1956Auv, i);
        List<C1960Auz> list = c1956Auv.A05;
        return list.get(Av0.A01(list, i));
    }

    public final float A06(int i) {
        C1960Auz c1960AuzA02 = A02(this, i);
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA02.A06;
        return ((C1957Auw) interfaceC2006AwF).A01.A03(i - c1960AuzA02.A03) + c1960AuzA02.A01;
    }

    public final float A07(int i) {
        C1960Auz c1960AuzA02 = A02(this, i);
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA02.A06;
        return ((C1957Auw) interfaceC2006AwF).A01.A04(i - c1960AuzA02.A03) + c1960AuzA02.A01;
    }

    public final int A0A(int i, boolean z) {
        int iA07;
        C1960Auz c1960AuzA02 = A02(this, i);
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA02.A06;
        int i2 = i - c1960AuzA02.A03;
        C1999Aw8 c1999Aw8 = ((C1957Auw) interfaceC2006AwF).A01;
        if (z) {
            Layout layout = c1999Aw8.A09;
            if (layout.getEllipsisCount(i2) <= 0 || c1999Aw8.A0B != TextUtils.TruncateAt.END) {
                C2000Aw9 c2000Aw9 = c1999Aw8.A00;
                if (c2000Aw9 == null) {
                    c2000Aw9 = new C2000Aw9(layout);
                    c1999Aw8.A00 = c2000Aw9;
                }
                Layout layout2 = c2000Aw9.A01;
                iA07 = C2000Aw9.A00(c2000Aw9, layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iA07 = layout.getLineStart(i2) + layout.getEllipsisStart(i2);
            }
        } else {
            iA07 = c1999Aw8.A07(i2);
        }
        return iA07 + c1960AuzA02.A05;
    }
}
