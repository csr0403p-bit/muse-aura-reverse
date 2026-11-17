package X;

import java.time.Instant;
import java.util.List;

/* renamed from: X.FuZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8957FuZ {
    public final int A00;
    public final Instant A01;
    public final Instant A02;
    public final List<Fw6> A03;

    public C8957FuZ(Instant instant, Instant instant2, List list, int i) {
        C7384Etj.A0Y(instant, 1);
        this.A03 = list;
        this.A02 = instant;
        this.A01 = instant2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8957FuZ) {
                C8957FuZ c8957FuZ = (C8957FuZ) obj;
                if (!C7384Etj.areEqual(this.A03, c8957FuZ.A03) || !this.A02.equals(c8957FuZ.A02) || !C7384Etj.areEqual(this.A01, c8957FuZ.A01) || this.A00 != c8957FuZ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A03)) + AnonymousClass006.A0D(this.A01)) * 31) + this.A00) * 31) + 1231;
    }

    public final String toString() {
        List<Fw6> list = this.A03;
        Instant instant = this.A02;
        Instant instant2 = this.A01;
        int i = this.A00;
        StringBuilder sbA0f = C3cG.A0f(list, "MetaHealthSampleQueryParams(dataTypes=");
        AbstractC7610F5x.A1K(instant, instant2, sbA0f);
        sbA0f.append(", limit=");
        sbA0f.append(i);
        return C8j5.A0W(", requireCompleteResult=", sbA0f, true);
    }
}
