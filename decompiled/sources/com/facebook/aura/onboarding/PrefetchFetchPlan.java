package com.facebook.aura.onboarding;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes3.dex */
public final class PrefetchFetchPlan extends C06G {
    public final Set<String> assetNamesToFetch;
    public final boolean shouldFetchAllAssets;
    public final boolean shouldStartFullAssetFetch;

    public PrefetchFetchPlan(boolean z, boolean z2, Set<String> set) {
        C7384Etj.A0Y(set, 2);
        this.shouldFetchAllAssets = z;
        this.shouldStartFullAssetFetch = z2;
        this.assetNamesToFetch = set;
    }

    public final PrefetchFetchPlan copy(boolean z, boolean z2, Set<String> set) {
        C7384Etj.A0Y(set, 2);
        return new PrefetchFetchPlan(z, z2, set);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PrefetchFetchPlan) {
                PrefetchFetchPlan prefetchFetchPlan = (PrefetchFetchPlan) obj;
                if (this.shouldFetchAllAssets != prefetchFetchPlan.shouldFetchAllAssets || this.shouldStartFullAssetFetch != prefetchFetchPlan.shouldStartFullAssetFetch || !C7384Etj.areEqual(this.assetNamesToFetch, prefetchFetchPlan.assetNamesToFetch)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrefetchFetchPlan copy$default(PrefetchFetchPlan prefetchFetchPlan, boolean z, boolean z2, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            z = prefetchFetchPlan.shouldFetchAllAssets;
        }
        if ((i & 2) != 0) {
            z2 = prefetchFetchPlan.shouldStartFullAssetFetch;
        }
        if ((i & 4) != 0) {
            set = prefetchFetchPlan.assetNamesToFetch;
        }
        return prefetchFetchPlan.copy(z, z2, set);
    }

    public final boolean component1() {
        return this.shouldFetchAllAssets;
    }

    public final boolean component2() {
        return this.shouldStartFullAssetFetch;
    }

    public final Set<String> component3() {
        return this.assetNamesToFetch;
    }

    public final Set<String> getAssetNamesToFetch() {
        return this.assetNamesToFetch;
    }

    public final boolean getShouldFetchAllAssets() {
        return this.shouldFetchAllAssets;
    }

    public final boolean getShouldStartFullAssetFetch() {
        return this.shouldStartFullAssetFetch;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.assetNamesToFetch, C0KA.A01(C0KA.A02(this.shouldFetchAllAssets), this.shouldStartFullAssetFetch));
    }

    public String toString() {
        return super.toString();
    }
}
