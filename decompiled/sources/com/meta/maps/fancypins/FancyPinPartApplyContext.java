package com.meta.maps.fancypins;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinPartApplyContext {
    public final FancyPinPartOcclusion occlusion;
    public final FancyPinResolvedPlacement resolvedPlacement;
    public final FancyPinRuntimeClusterContext runtimeCluster;
    public static final Companion Companion = new Companion();
    public static final FancyPinPartApplyContext CLEAR = new FancyPinPartApplyContext(FancyPinPartOcclusion.CLEAR, null, null);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPartApplyContext(FancyPinPartOcclusion fancyPinPartOcclusion) {
        this(fancyPinPartOcclusion, null, null);
        C7384Etj.A0Y(fancyPinPartOcclusion, 0);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FancyPinPartApplyContext) && C7384Etj.areEqual(this.occlusion, ((FancyPinPartApplyContext) obj).occlusion);
        }
        return true;
    }

    public final boolean getHasClearOcclusion() {
        return !(!this.occlusion.sources.isEmpty());
    }

    public final FancyPinPartOcclusion getOcclusion() {
        return this.occlusion;
    }

    public final String getPlacementKey() {
        FancyPinResolvedPlacement fancyPinResolvedPlacement = this.resolvedPlacement;
        if (fancyPinResolvedPlacement != null) {
            return fancyPinResolvedPlacement.key;
        }
        return null;
    }

    public final FancyPinResolvedPlacement getResolvedPlacement() {
        return this.resolvedPlacement;
    }

    public final FancyPinRuntimeClusterContext getRuntimeCluster() {
        return this.runtimeCluster;
    }

    public int hashCode() {
        return this.occlusion.hashCode();
    }

    public final boolean isOccluded() {
        return !this.occlusion.sources.isEmpty();
    }

    public FancyPinPartApplyContext(FancyPinPartOcclusion fancyPinPartOcclusion, FancyPinResolvedPlacement fancyPinResolvedPlacement, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext) {
        C7384Etj.A0Y(fancyPinPartOcclusion, 0);
        this.occlusion = fancyPinPartOcclusion;
        this.resolvedPlacement = fancyPinResolvedPlacement;
        this.runtimeCluster = fancyPinRuntimeClusterContext;
    }

    public /* synthetic */ FancyPinPartApplyContext(FancyPinPartOcclusion fancyPinPartOcclusion, FancyPinResolvedPlacement fancyPinResolvedPlacement, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, int i, C06H c06h) {
        this(fancyPinPartOcclusion, (i & 2) != 0 ? null : fancyPinResolvedPlacement, (i & 4) != 0 ? null : fancyPinRuntimeClusterContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPartApplyContext(FancyPinPartOcclusion fancyPinPartOcclusion, FancyPinResolvedPlacement fancyPinResolvedPlacement) {
        this(fancyPinPartOcclusion, fancyPinResolvedPlacement, null);
        C7384Etj.A0Y(fancyPinPartOcclusion, 0);
    }
}
