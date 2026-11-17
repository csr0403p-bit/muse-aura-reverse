package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Fy1 implements Comparable<Fy1> {
    public static final C9119Fyk A02 = new C9119Fyk();
    public static final Map<EnumC9152FzL, Fy1> A03;
    public final double A00;
    public final EnumC9152FzL A01;

    public final boolean equals(Object obj) {
        double dA00;
        if (this != obj) {
            if (obj instanceof Fy1) {
                EnumC9152FzL enumC9152FzL = this.A01;
                Fy1 fy1 = (Fy1) obj;
                EnumC9152FzL enumC9152FzL2 = fy1.A01;
                double dA002 = this.A00;
                if (enumC9152FzL == enumC9152FzL2) {
                    dA00 = fy1.A00;
                } else {
                    dA002 *= enumC9152FzL.A00();
                    dA00 = fy1.A00 * enumC9152FzL2.A00();
                }
                if (dA002 == dA00) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9152FzL[] enumC9152FzLArrValues = EnumC9152FzL.values();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AbstractC7610F5x.A0B(enumC9152FzLArrValues.length));
        for (EnumC9152FzL enumC9152FzL : enumC9152FzLArrValues) {
            linkedHashMapA15.put(enumC9152FzL, new Fy1(enumC9152FzL, 0.0d));
        }
        A03 = linkedHashMapA15;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Fy1 fy1) {
        double dA00;
        Fy1 fy12 = fy1;
        C7384Etj.A0Y(fy12, 0);
        EnumC9152FzL enumC9152FzL = this.A01;
        EnumC9152FzL enumC9152FzL2 = fy12.A01;
        double dA002 = this.A00;
        if (enumC9152FzL == enumC9152FzL2) {
            dA00 = fy12.A00;
        } else {
            dA002 *= enumC9152FzL.A00();
            dA00 = fy12.A00 * enumC9152FzL2.A00();
        }
        return Double.compare(dA002, dA00);
    }

    public Fy1(EnumC9152FzL enumC9152FzL, double d) {
        this.A00 = d;
        this.A01 = enumC9152FzL;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(AbstractC7609F5w.A01(this)));
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1J(sbA0w, this.A00);
        return AnonymousClass001.A0v(AnonymousClass006.A0x(this.A01), sbA0w);
    }
}
