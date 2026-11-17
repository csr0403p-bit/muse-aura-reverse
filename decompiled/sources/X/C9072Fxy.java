package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fxy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9072Fxy implements Comparable<C9072Fxy> {
    public static final C9120Fyl A02 = new C9120Fyl();
    public static final Map<EnumC9160FzT, C9072Fxy> A03;
    public final double A00;
    public final EnumC9160FzT A01;

    public final boolean equals(Object obj) {
        double dA00;
        if (this != obj) {
            if (obj instanceof C9072Fxy) {
                EnumC9160FzT enumC9160FzT = this.A01;
                C9072Fxy c9072Fxy = (C9072Fxy) obj;
                EnumC9160FzT enumC9160FzT2 = c9072Fxy.A01;
                double dA002 = this.A00;
                if (enumC9160FzT == enumC9160FzT2) {
                    dA00 = c9072Fxy.A00;
                } else {
                    dA002 *= enumC9160FzT.A00();
                    dA00 = c9072Fxy.A00 * enumC9160FzT2.A00();
                }
                if (dA002 == dA00) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9160FzT[] enumC9160FzTArrValues = EnumC9160FzT.values();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AbstractC7610F5x.A0B(enumC9160FzTArrValues.length));
        for (EnumC9160FzT enumC9160FzT : enumC9160FzTArrValues) {
            linkedHashMapA15.put(enumC9160FzT, new C9072Fxy(enumC9160FzT, 0.0d));
        }
        A03 = linkedHashMapA15;
    }

    public final double A00() {
        EnumC9160FzT enumC9160FzT = EnumC9160FzT.A03;
        EnumC9160FzT enumC9160FzT2 = this.A01;
        double d = this.A00;
        return enumC9160FzT2 != enumC9160FzT ? (d * enumC9160FzT2.A00()) / enumC9160FzT.A00() : d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9072Fxy c9072Fxy) {
        double dA00;
        C9072Fxy c9072Fxy2 = c9072Fxy;
        C7384Etj.A0Y(c9072Fxy2, 0);
        EnumC9160FzT enumC9160FzT = this.A01;
        EnumC9160FzT enumC9160FzT2 = c9072Fxy2.A01;
        double dA002 = this.A00;
        if (enumC9160FzT == enumC9160FzT2) {
            dA00 = c9072Fxy2.A00;
        } else {
            dA002 *= enumC9160FzT.A00();
            dA00 = c9072Fxy2.A00 * enumC9160FzT2.A00();
        }
        return Double.compare(dA002, dA00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(this.A00 * this.A01.A00()));
    }

    public C9072Fxy(EnumC9160FzT enumC9160FzT, double d) {
        this.A00 = d;
        this.A01 = enumC9160FzT;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1J(sbA0w, this.A00);
        return AnonymousClass001.A0v(AnonymousClass006.A0x(this.A01), sbA0w);
    }
}
