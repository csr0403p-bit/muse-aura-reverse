package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fy3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9076Fy3 implements Comparable<C9076Fy3> {
    public static final C9143FzC A02 = new C9143FzC();
    public static final Map<EnumC9090FyH, C9076Fy3> A03;
    public final double A00;
    public final EnumC9090FyH A01;

    public final boolean equals(Object obj) {
        double dA00;
        if (this != obj) {
            if (obj instanceof C9076Fy3) {
                EnumC9090FyH enumC9090FyH = this.A01;
                C9076Fy3 c9076Fy3 = (C9076Fy3) obj;
                EnumC9090FyH enumC9090FyH2 = c9076Fy3.A01;
                double dA002 = this.A00;
                if (enumC9090FyH == enumC9090FyH2) {
                    dA00 = c9076Fy3.A00;
                } else {
                    dA002 *= enumC9090FyH.A00();
                    dA00 = c9076Fy3.A00 * enumC9090FyH2.A00();
                }
                if (dA002 == dA00) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9090FyH[] enumC9090FyHArrValues = EnumC9090FyH.values();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AbstractC7610F5x.A0B(enumC9090FyHArrValues.length));
        for (EnumC9090FyH enumC9090FyH : enumC9090FyHArrValues) {
            linkedHashMapA15.put(enumC9090FyH, new C9076Fy3(enumC9090FyH, 0.0d));
        }
        A03 = linkedHashMapA15;
    }

    public final double A00() {
        EnumC9090FyH enumC9090FyH = EnumC9090FyH.A03;
        EnumC9090FyH enumC9090FyH2 = this.A01;
        double d = this.A00;
        return enumC9090FyH2 != enumC9090FyH ? (d * enumC9090FyH2.A00()) / enumC9090FyH.A00() : d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9076Fy3 c9076Fy3) {
        double dA00;
        C9076Fy3 c9076Fy32 = c9076Fy3;
        C7384Etj.A0Y(c9076Fy32, 0);
        EnumC9090FyH enumC9090FyH = this.A01;
        EnumC9090FyH enumC9090FyH2 = c9076Fy32.A01;
        double dA002 = this.A00;
        if (enumC9090FyH == enumC9090FyH2) {
            dA00 = c9076Fy32.A00;
        } else {
            dA002 *= enumC9090FyH.A00();
            dA00 = c9076Fy32.A00 * enumC9090FyH2.A00();
        }
        return Double.compare(dA002, dA00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(this.A00 * this.A01.A00()));
    }

    public C9076Fy3(EnumC9090FyH enumC9090FyH, double d) {
        this.A00 = d;
        this.A01 = enumC9090FyH;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1J(sbA0w, this.A00);
        EnumC9090FyH enumC9090FyH = this.A01;
        return AnonymousClass001.A0v(enumC9090FyH instanceof C9124Fyp ? ((C9124Fyp) enumC9090FyH).title : enumC9090FyH instanceof C9117Fyi ? ((C9117Fyi) enumC9090FyH).title : enumC9090FyH instanceof C9116Fyh ? ((C9116Fyh) enumC9090FyH).title : ((C9123Fyo) enumC9090FyH).title, sbA0w);
    }
}
