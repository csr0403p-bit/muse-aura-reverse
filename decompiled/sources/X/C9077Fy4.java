package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fy4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9077Fy4 implements Comparable<C9077Fy4> {
    public static final C9144FzD A02 = new C9144FzD();
    public static final Map<EnumC9091FyI, C9077Fy4> A03;
    public final double A00;
    public final EnumC9091FyI A01;

    public final boolean equals(Object obj) {
        double dA00;
        if (this != obj) {
            if (obj instanceof C9077Fy4) {
                EnumC9091FyI enumC9091FyI = this.A01;
                C9077Fy4 c9077Fy4 = (C9077Fy4) obj;
                EnumC9091FyI enumC9091FyI2 = c9077Fy4.A01;
                double dA002 = this.A00;
                if (enumC9091FyI == enumC9091FyI2) {
                    dA00 = c9077Fy4.A00;
                } else {
                    dA002 *= enumC9091FyI.A00();
                    dA00 = c9077Fy4.A00 * enumC9091FyI2.A00();
                }
                if (dA002 == dA00) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9091FyI[] enumC9091FyIArrValues = EnumC9091FyI.values();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AbstractC7610F5x.A0B(enumC9091FyIArrValues.length));
        for (EnumC9091FyI enumC9091FyI : enumC9091FyIArrValues) {
            linkedHashMapA15.put(enumC9091FyI, new C9077Fy4(enumC9091FyI, 0.0d));
        }
        A03 = linkedHashMapA15;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9077Fy4 c9077Fy4) {
        double dA00;
        C9077Fy4 c9077Fy42 = c9077Fy4;
        C7384Etj.A0Y(c9077Fy42, 0);
        EnumC9091FyI enumC9091FyI = this.A01;
        EnumC9091FyI enumC9091FyI2 = c9077Fy42.A01;
        double dA002 = this.A00;
        if (enumC9091FyI == enumC9091FyI2) {
            dA00 = c9077Fy42.A00;
        } else {
            dA002 *= enumC9091FyI.A00();
            dA00 = c9077Fy42.A00 * enumC9091FyI2.A00();
        }
        return Double.compare(dA002, dA00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(this.A00 * this.A01.A00()));
    }

    public C9077Fy4(EnumC9091FyI enumC9091FyI, double d) {
        this.A00 = d;
        this.A01 = enumC9091FyI;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1J(sbA0w, this.A00);
        EnumC9091FyI enumC9091FyI = this.A01;
        return AnonymousClass001.A0v(enumC9091FyI instanceof C9125Fyq ? ((C9125Fyq) enumC9091FyI).title : ((C9118Fyj) enumC9091FyI).title, sbA0w);
    }
}
