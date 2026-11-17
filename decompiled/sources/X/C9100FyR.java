package X;

/* renamed from: X.FyR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9100FyR extends AbstractC9142FzB {
    public final C9077Fy4 A00;
    public final C9077Fy4 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9100FyR) {
                C9100FyR c9100FyR = (C9100FyR) obj;
                if (!C7384Etj.areEqual(this.A01, c9100FyR.A01) || !C7384Etj.areEqual(this.A00, c9100FyR.A00)) {
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
        StringBuilder sbA0x = C60O.A0x("PowerTarget(minPower=");
        sbA0x.append(this.A01);
        sbA0x.append(", maxPower=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C9100FyR(C9077Fy4 c9077Fy4, C9077Fy4 c9077Fy42) {
        this.A01 = c9077Fy4;
        this.A00 = c9077Fy42;
    }
}
