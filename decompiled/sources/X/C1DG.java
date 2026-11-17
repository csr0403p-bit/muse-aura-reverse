package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.1DG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DG implements Comparable<C1DG> {
    public final float A00;

    public static C1DG A03() {
        return new C1DG(0.0f);
    }

    public static AKJ A02(AKH akh, float f) {
        return akh.A04(new C1DG(f));
    }

    public static C1DG A04(C1DG c1dg, float f) {
        C1DG c1dg2 = new C1DG(f);
        return c1dg.compareTo(c1dg2) < 0 ? c1dg2 : c1dg;
    }

    public static void A06(float f, MutableState mutableState) {
        mutableState.Af8(new C1DG(f));
    }

    public static boolean A09(float f, Object obj) {
        return (obj instanceof C1DG) && Float.compare(f, ((C1DG) obj).A00) == 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C1DG c1dg) {
        return A01(this.A00, c1dg.A00);
    }

    public final boolean equals(Object obj) {
        return A09(this.A00, obj);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return A05(this.A00);
    }

    public /* synthetic */ C1DG(float f) {
        this.A00 = f;
    }

    public static float A00(BFM bfm, AKN akn) {
        return ((C1DG) bfm.A6v(akn)).A00;
    }

    public static int A01(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static String A05(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        return AnonymousClass001.A0v(".dp", sb);
    }

    public static void A07(StringBuilder sb, float f) {
        sb.append((Object) A05(f));
    }

    public static final boolean A08(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }
}
