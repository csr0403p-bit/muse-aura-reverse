package com.facebook.aura.onboarding;

import X.A3q;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class PrefetchState extends C06G {
    public final Map<String, String> cachedPublicUrls;
    public final boolean hasFetchedFullAssetCatalog;
    public final Set<String> inFlightAssetNames;
    public final boolean isFullAssetFetchInFlight;
    public final Set<String> prefetchedUrls;

    public PrefetchState(Map<String, String> map, boolean z, boolean z2, Set<String> set, Set<String> set2) {
        AnonymousClass002.A1C(set, 3, set2);
        this.cachedPublicUrls = map;
        this.isFullAssetFetchInFlight = z;
        this.hasFetchedFullAssetCatalog = z2;
        this.inFlightAssetNames = set;
        this.prefetchedUrls = set2;
    }

    public final PrefetchState copy(Map<String, String> map, boolean z, boolean z2, Set<String> set, Set<String> set2) {
        AnonymousClass002.A1C(set, 3, set2);
        return new PrefetchState(map, z, z2, set, set2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PrefetchState) {
                PrefetchState prefetchState = (PrefetchState) obj;
                if (!C7384Etj.areEqual(this.cachedPublicUrls, prefetchState.cachedPublicUrls) || this.isFullAssetFetchInFlight != prefetchState.isFullAssetFetchInFlight || this.hasFetchedFullAssetCatalog != prefetchState.hasFetchedFullAssetCatalog || !C7384Etj.areEqual(this.inFlightAssetNames, prefetchState.inFlightAssetNames) || !C7384Etj.areEqual(this.prefetchedUrls, prefetchState.prefetchedUrls)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrefetchState copy$default(PrefetchState prefetchState, Map map, boolean z, boolean z2, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = prefetchState.cachedPublicUrls;
        }
        if ((i & 2) != 0) {
            z = prefetchState.isFullAssetFetchInFlight;
        }
        if ((i & 4) != 0) {
            z2 = prefetchState.hasFetchedFullAssetCatalog;
        }
        if ((i & 8) != 0) {
            set = prefetchState.inFlightAssetNames;
        }
        if ((i & 16) != 0) {
            set2 = prefetchState.prefetchedUrls;
        }
        return prefetchState.copy(map, z, z2, set, set2);
    }

    public final Map<String, String> component1() {
        return this.cachedPublicUrls;
    }

    public final boolean component2() {
        return this.isFullAssetFetchInFlight;
    }

    public final boolean component3() {
        return this.hasFetchedFullAssetCatalog;
    }

    public final Set<String> component4() {
        return this.inFlightAssetNames;
    }

    public final Set<String> component5() {
        return this.prefetchedUrls;
    }

    public final Map<String, String> getCachedPublicUrls() {
        return this.cachedPublicUrls;
    }

    public final boolean getHasFetchedFullAssetCatalog() {
        return this.hasFetchedFullAssetCatalog;
    }

    public final Set<String> getInFlightAssetNames() {
        return this.inFlightAssetNames;
    }

    public final Set<String> getPrefetchedUrls() {
        return this.prefetchedUrls;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.prefetchedUrls, AnonymousClass005.A0F(this.inFlightAssetNames, C0KA.A01(C0KA.A01(AnonymousClass006.A0D(this.cachedPublicUrls) * 31, this.isFullAssetFetchInFlight), this.hasFetchedFullAssetCatalog)));
    }

    public final boolean isFullAssetFetchInFlight() {
        return this.isFullAssetFetchInFlight;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PrefetchState(Map map, boolean z, boolean z2, Set set, Set set2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : map, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), (i & 8) != 0 ? A3q.A00 : set, (i & 16) != 0 ? A3q.A00 : set2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PrefetchState() {
        A3q a3q = A3q.A00;
        this(null, false, false, a3q, a3q);
    }
}
