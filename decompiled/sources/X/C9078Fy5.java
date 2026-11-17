package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fy5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9078Fy5 implements Comparable<C9078Fy5> {
    public static final C9147FzG A02 = new C9147FzG();
    public static final Map<EnumC9094FyL, C9078Fy5> A03;
    public final double A00;
    public final EnumC9094FyL A01;

    public final boolean equals(Object obj) {
        double dA00;
        if (this != obj) {
            if (obj instanceof C9078Fy5) {
                EnumC9094FyL enumC9094FyL = this.A01;
                C9078Fy5 c9078Fy5 = (C9078Fy5) obj;
                EnumC9094FyL enumC9094FyL2 = c9078Fy5.A01;
                double dA002 = this.A00;
                if (enumC9094FyL == enumC9094FyL2) {
                    dA00 = c9078Fy5.A00;
                } else {
                    dA002 *= enumC9094FyL.A00();
                    dA00 = c9078Fy5.A00 * enumC9094FyL2.A00();
                }
                if (dA002 == dA00) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9094FyL[] enumC9094FyLArrValues = EnumC9094FyL.values();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AbstractC7610F5x.A0B(enumC9094FyLArrValues.length));
        for (EnumC9094FyL enumC9094FyL : enumC9094FyLArrValues) {
            linkedHashMapA15.put(enumC9094FyL, new C9078Fy5(enumC9094FyL, 0.0d));
        }
        A03 = linkedHashMapA15;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9078Fy5 c9078Fy5) {
        double dA00;
        C9078Fy5 c9078Fy52 = c9078Fy5;
        C7384Etj.A0Y(c9078Fy52, 0);
        EnumC9094FyL enumC9094FyL = this.A01;
        EnumC9094FyL enumC9094FyL2 = c9078Fy52.A01;
        double dA002 = this.A00;
        if (enumC9094FyL == enumC9094FyL2) {
            dA00 = c9078Fy52.A00;
        } else {
            dA002 *= enumC9094FyL.A00();
            dA00 = c9078Fy52.A00 * enumC9094FyL2.A00();
        }
        return Double.compare(dA002, dA00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(this.A00 * this.A01.A00()));
    }

    public C9078Fy5(EnumC9094FyL enumC9094FyL, double d) {
        this.A00 = d;
        this.A01 = enumC9094FyL;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1J(sbA0w, this.A00);
        EnumC9094FyL enumC9094FyL = this.A01;
        return AnonymousClass001.A0v(enumC9094FyL instanceof C9128Fyt ? ((C9128Fyt) enumC9094FyL).title : enumC9094FyL instanceof C9127Fys ? ((C9127Fys) enumC9094FyL).title : ((C9126Fyr) enumC9094FyL).title, sbA0w);
    }
}
