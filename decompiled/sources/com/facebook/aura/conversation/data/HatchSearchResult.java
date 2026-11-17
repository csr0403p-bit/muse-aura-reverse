package com.facebook.aura.conversation.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class HatchSearchResult extends C06G {
    public final boolean hasMore;
    public final List<HatchSearchHit> hits;
    public final Long nextBeforeRowId;

    public HatchSearchResult(List<HatchSearchHit> list, boolean z, Long l) {
        C7384Etj.A0Y(list, 0);
        this.hits = list;
        this.hasMore = z;
        this.nextBeforeRowId = l;
    }

    public final HatchSearchResult copy(List<HatchSearchHit> list, boolean z, Long l) {
        C7384Etj.A0Y(list, 0);
        return new HatchSearchResult(list, z, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSearchResult) {
                HatchSearchResult hatchSearchResult = (HatchSearchResult) obj;
                if (!C7384Etj.areEqual(this.hits, hatchSearchResult.hits) || this.hasMore != hatchSearchResult.hasMore || !C7384Etj.areEqual(this.nextBeforeRowId, hatchSearchResult.nextBeforeRowId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchSearchResult copy$default(HatchSearchResult hatchSearchResult, List list, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchSearchResult.hits;
        }
        if ((i & 2) != 0) {
            z = hatchSearchResult.hasMore;
        }
        if ((i & 4) != 0) {
            l = hatchSearchResult.nextBeforeRowId;
        }
        return hatchSearchResult.copy(list, z, l);
    }

    public final List<HatchSearchHit> component1() {
        return this.hits;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final Long component3() {
        return this.nextBeforeRowId;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<HatchSearchHit> getHits() {
        return this.hits;
    }

    public final Long getNextBeforeRowId() {
        return this.nextBeforeRowId;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0E(this.hits), this.hasMore) + AnonymousClass006.A0D(this.nextBeforeRowId);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSearchResult(List list, boolean z, Long l, int i, C06H c06h) {
        this(list, z, (i & 4) != 0 ? null : l);
    }
}
