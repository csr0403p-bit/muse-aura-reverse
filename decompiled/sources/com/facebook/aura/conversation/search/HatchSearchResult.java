package com.facebook.aura.conversation.search;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchSearchResult extends C06G {
    public static final int $stable = 8;
    public final boolean hasMore;
    public final List<HatchSearchHit> hits;

    public HatchSearchResult(List<HatchSearchHit> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.hits = list;
        this.hasMore = z;
    }

    public final HatchSearchResult copy(List<HatchSearchHit> list, boolean z) {
        C7384Etj.A0Y(list, 0);
        return new HatchSearchResult(list, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSearchResult) {
                HatchSearchResult hatchSearchResult = (HatchSearchResult) obj;
                if (!C7384Etj.areEqual(this.hits, hatchSearchResult.hits) || this.hasMore != hatchSearchResult.hasMore) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSearchResult copy$default(HatchSearchResult hatchSearchResult, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchSearchResult.hits;
        }
        if ((i & 2) != 0) {
            z = hatchSearchResult.hasMore;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchSearchResult(list, z);
    }

    public final List<HatchSearchHit> component1() {
        return this.hits;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<HatchSearchHit> getHits() {
        return this.hits;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.hits), this.hasMore);
    }

    public String toString() {
        return super.toString();
    }
}
