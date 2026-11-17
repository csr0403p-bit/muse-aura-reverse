package X;

import com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord;

/* loaded from: classes6.dex */
public final class Hly {
    public final Hr8 A00;
    public final ComponentQueryDiskCacheRecord A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hly) {
                Hly hly = (Hly) obj;
                if (!C7384Etj.areEqual(this.A01, hly.A01) || !this.A00.equals(hly.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass006.A0D(this.A01) * 31);
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", summary=", C3cG.A0f(this.A01, "ComponentQueryDiskCacheResponse(cacheRecord="));
    }

    public Hly(Hr8 hr8, ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord) {
        this.A01 = componentQueryDiskCacheRecord;
        this.A00 = hr8;
    }
}
