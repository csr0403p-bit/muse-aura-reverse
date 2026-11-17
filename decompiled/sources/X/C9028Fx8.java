package X;

import java.time.Instant;

/* renamed from: X.Fx8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9028Fx8 {
    public final C9078Fy5 A00;
    public final Instant A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9028Fx8) {
                C9028Fx8 c9028Fx8 = (C9028Fx8) obj;
                if (!this.A01.equals(c9028Fx8.A01) || !this.A00.equals(c9028Fx8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C9028Fx8(C9078Fy5 c9078Fy5, Instant instant) {
        this.A01 = instant;
        this.A00 = c9078Fy5;
        AbstractC8873Frm.A01(c9078Fy5, (C9078Fy5) AbstractC7610F5x.A0s(c9078Fy5.A01, C9078Fy5.A03), "speed");
        AbstractC8873Frm.A02(c9078Fy5, C9060Fxi.A09, "speed");
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Sample(time=");
        sbA0x.append(this.A01);
        sbA0x.append(", speed=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}
