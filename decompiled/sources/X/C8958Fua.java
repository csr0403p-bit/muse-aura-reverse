package X;

import java.time.Instant;
import java.util.List;

/* renamed from: X.Fua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8958Fua {
    public final Long A00;
    public final Instant A01;
    public final Instant A02;
    public final List<C8979Fve> A03;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Fve;>;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/Long;)V */
    public C8958Fua(Long l, Instant instant, Instant instant2, List list) {
        C7384Etj.A0Y(instant, 1);
        this.A03 = list;
        this.A02 = instant;
        this.A01 = instant2;
        this.A00 = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8958Fua) {
                C8958Fua c8958Fua = (C8958Fua) obj;
                if (!this.A03.equals(c8958Fua.A03) || !this.A02.equals(c8958Fua.A02) || !C7384Etj.areEqual(this.A01, c8958Fua.A01) || !this.A00.equals(c8958Fua.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A03)) + AnonymousClass006.A0D(this.A01)) * 31);
    }

    public final String toString() {
        List<C8979Fve> list = this.A03;
        Instant instant = this.A02;
        Instant instant2 = this.A01;
        Long l = this.A00;
        StringBuilder sbA0f = C3cG.A0f(list, "MetaHealthStatisticsQueryParams(metrics=");
        AbstractC7610F5x.A1K(instant, instant2, sbA0f);
        return C3cJ.A0L(l, ", intervalSeconds=", sbA0f);
    }
}
