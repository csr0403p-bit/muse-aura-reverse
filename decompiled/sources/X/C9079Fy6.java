package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fy6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9079Fy6 implements Comparable<C9079Fy6> {
    public static final C9148FzH A02 = new C9148FzH();
    public static final Map<EnumC9092FyJ, C9079Fy6> A03;
    public final double A00;
    public final EnumC9092FyJ A01;

    public final boolean equals(Object obj) {
        double dA00;
        if (this != obj) {
            if (obj instanceof C9079Fy6) {
                EnumC9092FyJ enumC9092FyJ = this.A01;
                C9079Fy6 c9079Fy6 = (C9079Fy6) obj;
                EnumC9092FyJ enumC9092FyJ2 = c9079Fy6.A01;
                double dA002 = this.A00;
                if (enumC9092FyJ == enumC9092FyJ2) {
                    dA00 = c9079Fy6.A00;
                } else {
                    dA002 *= enumC9092FyJ.A00();
                    dA00 = c9079Fy6.A00 * enumC9092FyJ2.A00();
                }
                if (dA002 == dA00) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9092FyJ[] enumC9092FyJArrValues = EnumC9092FyJ.values();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AbstractC7610F5x.A0B(enumC9092FyJArrValues.length));
        for (EnumC9092FyJ enumC9092FyJ : enumC9092FyJArrValues) {
            linkedHashMapA15.put(enumC9092FyJ, new C9079Fy6(enumC9092FyJ, 0.0d));
        }
        A03 = linkedHashMapA15;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9079Fy6 c9079Fy6) {
        double dA00;
        C9079Fy6 c9079Fy62 = c9079Fy6;
        C7384Etj.A0Y(c9079Fy62, 0);
        EnumC9092FyJ enumC9092FyJ = this.A01;
        EnumC9092FyJ enumC9092FyJ2 = c9079Fy62.A01;
        double dA002 = this.A00;
        if (enumC9092FyJ == enumC9092FyJ2) {
            dA00 = c9079Fy62.A00;
        } else {
            dA002 *= enumC9092FyJ.A00();
            dA00 = c9079Fy62.A00 * enumC9092FyJ2.A00();
        }
        return Double.compare(dA002, dA00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(this.A00 * this.A01.A00()));
    }

    public C9079Fy6(EnumC9092FyJ enumC9092FyJ, double d) {
        this.A00 = d;
        this.A01 = enumC9092FyJ;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1J(sbA0w, this.A00);
        EnumC9092FyJ enumC9092FyJ = this.A01;
        return AnonymousClass001.A0v(enumC9092FyJ instanceof C9131Fyw ? ((C9131Fyw) enumC9092FyJ).title : enumC9092FyJ instanceof C9130Fyv ? ((C9130Fyv) enumC9092FyJ).title : ((C9129Fyu) enumC9092FyJ).title, sbA0w);
    }
}
