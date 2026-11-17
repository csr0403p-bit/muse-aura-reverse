package X;

import java.time.Instant;

/* renamed from: X.Fwv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9018Fwv implements Fx6<Instant> {
    public final Instant A00;
    public final Instant A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9018Fwv) {
                C9018Fwv c9018Fwv = (C9018Fwv) obj;
                if (!this.A01.equals(c9018Fwv.A01) || !this.A00.equals(c9018Fwv.A00)) {
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
        StringBuilder sbA0x = C60O.A0x("InstantTimeRange(startTime=");
        AbstractC7608F5v.A1P(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C9018Fwv(Instant instant, Instant instant2) {
        this.A01 = instant;
        this.A00 = instant2;
    }
}
