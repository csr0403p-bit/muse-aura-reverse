package X;

import java.util.Map;

/* renamed from: X.75T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75T {
    public final int A00;
    public final int A01;
    public final Map<Integer, Map<C063675s, Integer>> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C75T) {
                C75T c75t = (C75T) obj;
                if (this.A01 != c75t.A01 || this.A00 != c75t.A00 || !C7384Etj.areEqual(this.A02, c75t.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("InsertedViewInfo(mainViewId=");
        sbA0x.append(this.A01);
        sbA0x.append(", complexViewId=");
        sbA0x.append(this.A00);
        sbA0x.append(", children=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C75T(int i, int i2, Map<Integer, ? extends Map<C063675s, Integer>> map) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = map;
    }

    public C75T() {
        this(-1, -1, AGH.A0E());
    }
}
