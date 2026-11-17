package X;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class HxE<A, B> implements Serializable {
    public final A first;
    public final B second;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HxE) {
                HxE hxE = (HxE) obj;
                if (!C7384Etj.areEqual(this.first, hxE.first) || !C7384Etj.areEqual(this.second, hxE.second)) {
                }
            }
            return false;
        }
        return true;
    }

    public static HxE A00(Object obj) {
        return new HxE(obj, obj);
    }

    public static HxE[] A01(Object obj, Object obj2, HxE hxE, HxE hxE2) {
        return new HxE[]{hxE, hxE2, new HxE(obj, obj2)};
    }

    public final int hashCode() {
        return (AnonymousClass006.A0D(this.first) * 31) + C3cH.A02(this.second);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("(");
        AbstractC7608F5v.A1O(sbA0x, this.first);
        return AnonymousClass007.A0Z(this.second, sbA0x);
    }

    public HxE(A a, B b) {
        this.first = a;
        this.second = b;
    }
}
