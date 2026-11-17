package X;

/* renamed from: X.FyS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9101FyS extends AbstractC9142FzB {
    public final C9078Fy5 A00;
    public final C9078Fy5 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9101FyS) {
                C9101FyS c9101FyS = (C9101FyS) obj;
                if (!C7384Etj.areEqual(this.A01, c9101FyS.A01) || !C7384Etj.areEqual(this.A00, c9101FyS.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SpeedTarget(minSpeed=");
        sbA0x.append(this.A01);
        sbA0x.append(", maxSpeed=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C9101FyS(C9078Fy5 c9078Fy5, C9078Fy5 c9078Fy52) {
        this.A01 = c9078Fy5;
        this.A00 = c9078Fy52;
    }
}
