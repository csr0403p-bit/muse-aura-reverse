package X;

import java.time.Instant;

/* renamed from: X.FyF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9088FyF {
    public final Fy1 A00;
    public final Instant A01;
    public final Instant A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9088FyF) {
                C9088FyF c9088FyF = (C9088FyF) obj;
                if (!this.A02.equals(c9088FyF.A02) || !this.A01.equals(c9088FyF.A01) || !C7384Etj.areEqual(this.A00, c9088FyF.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02)) + C60R.A01(this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ExerciseLap(startTime=");
        AbstractC7608F5v.A1P(sbA0x, this.A02);
        sbA0x.append(this.A01);
        sbA0x.append(", length=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C9088FyF(Fy1 fy1, Instant instant, Instant instant2) {
        this.A02 = instant;
        this.A01 = instant2;
        this.A00 = fy1;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
        if (fy1 != null) {
            double dA01 = AbstractC7609F5w.A01(fy1);
            if (0.0d > dA01 || dA01 > 1000000.0d) {
                throw C60O.A0i("length valid range: 0-1000000.");
            }
        }
    }
}
