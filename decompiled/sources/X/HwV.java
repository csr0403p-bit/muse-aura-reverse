package X;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class HwV<A, B, C> implements Serializable {
    public final A first;
    public final B second;
    public final C third;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HwV) {
                HwV hwV = (HwV) obj;
                if (!C7384Etj.areEqual(this.first, hwV.first) || !C7384Etj.areEqual(this.second, hwV.second) || !C7384Etj.areEqual(this.third, hwV.third)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass006.A0D(this.first) * 31) + AnonymousClass006.A0D(this.second)) * 31) + C3cH.A02(this.third);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("(");
        sbA0x.append(this.first);
        sbA0x.append(", ");
        sbA0x.append(this.second);
        sbA0x.append(", ");
        return AnonymousClass007.A0Z(this.third, sbA0x);
    }

    public HwV(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }
}
