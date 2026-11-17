package X;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fwd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9000Fwd implements InterfaceC9020Fwx {
    public static final Duration A05 = Duration.ofDays(31);
    public final C9086FyD A00;
    public final Instant A01;
    public final Instant A02;
    public final ZoneOffset A03;
    public final ZoneOffset A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9000Fwd) {
                C9000Fwd c9000Fwd = (C9000Fwd) obj;
                if (!this.A02.equals(c9000Fwd.A02) || !C7384Etj.areEqual(this.A04, c9000Fwd.A04) || !this.A01.equals(c9000Fwd.A01) || !C7384Etj.areEqual(this.A03, c9000Fwd.A03) || !this.A00.equals(c9000Fwd.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AFC() {
        return this.A01;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AFE() {
        return this.A03;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A00;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AKy() {
        return this.A02;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AKz() {
        return this.A04;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0F(this.A01, (AnonymousClass005.A0E(this.A02) + C60R.A01(this.A04)) * 31) + C8j4.A0E(this.A03, 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MenstruationPeriodRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A02);
        AbstractC7608F5v.A1P(sbA0x, this.A04);
        AbstractC7608F5v.A1S(sbA0x, this.A01);
        AbstractC7608F5v.A1Q(sbA0x, this.A03);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C9000Fwd(C9086FyD c9086FyD, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.A02 = instant;
        this.A04 = zoneOffset;
        this.A01 = instant2;
        this.A03 = zoneOffset2;
        this.A00 = c9086FyD;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
        if (Duration.between(this.A02, this.A01).compareTo(A05) > 0) {
            throw C60O.A0i("Period must not exceed 31 days");
        }
    }
}
