package X;

import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.FxB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9030FxB {
    public final C8990FwS A00;
    public final Instant A01;
    public final Instant A02;
    public final ZoneOffset A03;

    public C9030FxB(C8990FwS c8990FwS, Instant instant, Instant instant2, ZoneOffset zoneOffset, boolean z) {
        C7384Etj.A0Y(c8990FwS, 0);
        this.A00 = c8990FwS;
        this.A02 = instant;
        this.A01 = instant2;
        this.A03 = zoneOffset;
        if (!z && !instant.isBefore(instant2)) {
            throw C60O.A0i("start time must be before end time");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration");
                C9030FxB c9030FxB = (C9030FxB) obj;
                if (!this.A00.equals(c9030FxB.A00) || !this.A02.equals(c9030FxB.A02) || !this.A01.equals(c9030FxB.A01) || !this.A03.equals(c9030FxB.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A00))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AggregationResultGroupedByDuration(result=");
        sbA0x.append(this.A00);
        sbA0x.append(", startTime=");
        AbstractC7608F5v.A1P(sbA0x, this.A02);
        AbstractC7608F5v.A1R(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }
}
