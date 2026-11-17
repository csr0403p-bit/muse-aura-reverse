package X;

import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.util.List;

/* loaded from: classes6.dex */
public final class FBV extends FBm {
    public final C7631F7o A00;
    public final BloksComponentQueryResources A01;
    public final List<F9A> A02;
    public final long A03;
    public final long A04;
    public final HlX A05;
    public final Integer A06;
    public final Runnable A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBV(C7631F7o c7631F7o, HlX hlX, BloksComponentQueryResources bloksComponentQueryResources, Integer num, Runnable runnable, List list, long j, long j2) {
        super(hlX, num, runnable, j, j2, true);
        C7384Etj.A0Y(hlX, 4);
        this.A00 = c7631F7o;
        this.A01 = bloksComponentQueryResources;
        this.A02 = list;
        this.A04 = j;
        this.A05 = hlX;
        this.A07 = runnable;
        this.A06 = num;
        this.A03 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBV) {
                FBV fbv = (FBV) obj;
                if (!this.A00.equals(fbv.A00) || !C7384Etj.areEqual(this.A01, fbv.A01) || !C7384Etj.areEqual(this.A02, fbv.A02) || this.A04 != fbv.A04 || this.A05 != fbv.A05 || !C7384Etj.areEqual(this.A07, fbv.A07) || this.A06 != fbv.A06 || this.A03 != fbv.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0F = (((AnonymousClass005.A0F(this.A05, AnonymousClass006.A06(this.A04, (((AnonymousClass005.A0E(this.A00) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0D(this.A02)) * 31)) + C3cH.A02(this.A07)) * 31) + 1231) * 31;
        Integer num = this.A06;
        return C8j4.A0B(this.A03, (iA0F + BV5.A03(num, num.intValue() != 0 ? "UNKNOWN" : "NETWORK")) * 31);
    }

    public final String toString() {
        C7631F7o c7631F7o = this.A00;
        BloksComponentQueryResources bloksComponentQueryResources = this.A01;
        List<F9A> list = this.A02;
        long j = this.A04;
        HlX hlX = this.A05;
        Runnable runnable = this.A07;
        Integer num = this.A06;
        long j2 = this.A03;
        StringBuilder sbA0f = C3cG.A0f(c7631F7o, "CachedComponentQueryResponse(initialResponse=");
        sbA0f.append(", resources=");
        sbA0f.append(bloksComponentQueryResources);
        sbA0f.append(", extensions=");
        sbA0f.append(list);
        sbA0f.append(", responseTimestampMs=");
        sbA0f.append(j);
        sbA0f.append(", queryPurpose=");
        sbA0f.append(hlX);
        sbA0f.append(", cleanup=");
        sbA0f.append(runnable);
        sbA0f.append(", isComplete=");
        sbA0f.append(true);
        sbA0f.append(", cacheOrigin=");
        sbA0f.append(num.intValue() != 0 ? "UNKNOWN" : "NETWORK");
        sbA0f.append(", cacheTimestampMs=");
        sbA0f.append(j2);
        return BV7.A10(sbA0f);
    }
}
