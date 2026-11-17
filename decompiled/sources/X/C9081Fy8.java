package X;

import java.time.Instant;

/* renamed from: X.Fy8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9081Fy8 {
    public final C9077Fy4 A00;
    public final Instant A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9081Fy8) {
                C9081Fy8 c9081Fy8 = (C9081Fy8) obj;
                if (!this.A01.equals(c9081Fy8.A01) || !this.A00.equals(c9081Fy8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C9081Fy8(C9077Fy4 c9077Fy4, Instant instant) {
        this.A01 = instant;
        this.A00 = c9077Fy4;
        AbstractC8873Frm.A01(c9077Fy4, (C9077Fy4) AbstractC7610F5x.A0s(c9077Fy4.A01, C9077Fy4.A03), "power");
        AbstractC8873Frm.A02(c9077Fy4, C9062Fxk.A09, "power");
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Sample(time=");
        sbA0x.append(this.A01);
        sbA0x.append(", power=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}
