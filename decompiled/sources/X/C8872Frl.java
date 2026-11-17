package X;

import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Frl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8872Frl implements Fx5 {
    public final C9086FyD A00;
    public final Instant A01;
    public final ZoneOffset A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8872Frl) {
                C8872Frl c8872Frl = (C8872Frl) obj;
                if (!this.A01.equals(c8872Frl.A01) || !C7384Etj.areEqual(this.A02, c8872Frl.A02) || !this.A00.equals(c8872Frl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A00;
    }

    @Override // X.Fx5
    public final Instant ALd() {
        return this.A01;
    }

    @Override // X.Fx5
    public final ZoneOffset AMx() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0E(this.A01) + C60R.A01(this.A02)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("IntermenstrualBleedingRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A01);
        AbstractC7608F5v.A1Q(sbA0x, this.A02);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C8872Frl(C9086FyD c9086FyD, Instant instant, ZoneOffset zoneOffset) {
        this.A01 = instant;
        this.A02 = zoneOffset;
        this.A00 = c9086FyD;
    }
}
