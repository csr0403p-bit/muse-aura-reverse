package X;

import java.time.Instant;
import java.time.LocalDateTime;

/* renamed from: X.Fx3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9025Fx3 {
    public final Instant A00;
    public final Instant A01;
    public final LocalDateTime A02;
    public final LocalDateTime A03;

    public C9025Fx3() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9025Fx3) {
                C9025Fx3 c9025Fx3 = (C9025Fx3) obj;
                if (!C7384Etj.areEqual(this.A01, c9025Fx3.A01) || !C7384Etj.areEqual(this.A00, c9025Fx3.A00) || !C7384Etj.areEqual(this.A03, c9025Fx3.A03) || !C7384Etj.areEqual(this.A02, c9025Fx3.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((C60R.A01(this.A01) * 31) + C60R.A01(this.A00)) * 31) + C60R.A01(this.A03)) * 31) + C8j4.A0E(this.A02, 0);
    }

    public C9025Fx3(Instant instant, Instant instant2, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.A01 = instant;
        this.A00 = instant2;
        this.A03 = localDateTime;
        this.A02 = localDateTime2;
    }
}
