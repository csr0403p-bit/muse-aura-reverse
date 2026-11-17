package X;

import com.instagram.common.bloks.payload.BloksComponentQueryResources;

/* loaded from: classes6.dex */
public final class FBZ extends FBm {
    public final BloksComponentQueryResources A00;
    public final long A01;
    public final long A02;
    public final HlX A03;
    public final Integer A04;

    public FBZ(HlX hlX, BloksComponentQueryResources bloksComponentQueryResources, Integer num, long j, long j2) {
        super(hlX, num, null, j, j2, false);
        this.A00 = bloksComponentQueryResources;
        this.A02 = j;
        this.A03 = hlX;
        this.A04 = num;
        this.A01 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBZ) {
                FBZ fbz = (FBZ) obj;
                if (!C7384Etj.areEqual(this.A00, fbz.A00) || this.A02 != fbz.A02 || this.A03 != fbz.A03 || this.A01 != fbz.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A01, ((AnonymousClass005.A0F(this.A03, AnonymousClass006.A06(this.A02, AnonymousClass006.A0D(this.A00) * 31)) * 31) + (this.A04.intValue() != 0 ? "UNKNOWN" : "NETWORK").hashCode() + 5) * 31);
    }

    public final String toString() {
        BloksComponentQueryResources bloksComponentQueryResources = this.A00;
        long j = this.A02;
        HlX hlX = this.A03;
        Integer num = this.A04;
        long j2 = this.A01;
        StringBuilder sbA0f = C3cG.A0f(bloksComponentQueryResources, "CachedComponentQueryResource(resources=");
        sbA0f.append(", responseTimestampMs=");
        sbA0f.append(j);
        sbA0f.append(", queryPurpose=");
        sbA0f.append(hlX);
        sbA0f.append(", cleanup=");
        sbA0f.append((Object) null);
        sbA0f.append(", cacheOrigin=");
        sbA0f.append(num.intValue() != 0 ? "UNKNOWN" : "NETWORK");
        sbA0f.append(", cacheTimestampMs=");
        sbA0f.append(j2);
        return BV7.A10(sbA0f);
    }
}
