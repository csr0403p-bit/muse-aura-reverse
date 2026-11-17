package X;

import X.GF8;

/* loaded from: classes6.dex */
public abstract class HoU<T extends GF8> {
    public abstract T A01();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !BV5.A1T(this, obj)) {
            return false;
        }
        return C7384Etj.areEqual(A01(), ((HoU) obj).A01());
    }

    public final int hashCode() {
        return A01().hashCode();
    }
}
