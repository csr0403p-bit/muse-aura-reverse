package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Fy7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9080Fy7 implements Comparable<C9080Fy7> {
    public static final Map<EnumC9093FyK, C9080Fy7> A02;
    public final double A00;
    public final EnumC9093FyK A01;

    public final boolean equals(Object obj) {
        double dA00;
        if (this != obj) {
            if (obj instanceof C9080Fy7) {
                EnumC9093FyK enumC9093FyK = this.A01;
                C9080Fy7 c9080Fy7 = (C9080Fy7) obj;
                EnumC9093FyK enumC9093FyK2 = c9080Fy7.A01;
                double dA002 = this.A00;
                if (enumC9093FyK == enumC9093FyK2) {
                    dA00 = c9080Fy7.A00;
                } else {
                    dA002 *= enumC9093FyK.A00();
                    dA00 = c9080Fy7.A00 * enumC9093FyK2.A00();
                }
                if (dA002 == dA00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9080Fy7 c9080Fy7) {
        double dA00;
        C9080Fy7 c9080Fy72 = c9080Fy7;
        C7384Etj.A0Y(c9080Fy72, 0);
        EnumC9093FyK enumC9093FyK = this.A01;
        EnumC9093FyK enumC9093FyK2 = c9080Fy72.A01;
        double dA002 = this.A00;
        if (enumC9093FyK == enumC9093FyK2) {
            dA00 = c9080Fy72.A00;
        } else {
            dA002 *= enumC9093FyK.A00();
            dA00 = c9080Fy72.A00 * enumC9093FyK2.A00();
        }
        return Double.compare(dA002, dA00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(Double.doubleToLongBits(this.A00 * this.A01.A00()));
    }

    static {
        EnumC9093FyK[] enumC9093FyKArrValues = EnumC9093FyK.values();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AbstractC7610F5x.A0B(enumC9093FyKArrValues.length));
        for (EnumC9093FyK enumC9093FyK : enumC9093FyKArrValues) {
            linkedHashMapA15.put(enumC9093FyK, new C9080Fy7(enumC9093FyK, 0.0d));
        }
        A02 = linkedHashMapA15;
    }

    public C9080Fy7(EnumC9093FyK enumC9093FyK, double d) {
        this.A00 = d;
        this.A01 = enumC9093FyK;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1J(sbA0w, this.A00);
        EnumC9093FyK enumC9093FyK = this.A01;
        return AnonymousClass001.A0v(enumC9093FyK instanceof C9122Fyn ? "mmol/L" : ((C9121Fym) enumC9093FyK).title, sbA0w);
    }
}
