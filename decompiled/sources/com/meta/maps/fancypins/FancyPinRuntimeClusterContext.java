package com.meta.maps.fancypins;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterContext {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final long MAX_RUNTIME_CLUSTER_MEMBER_COUNT = 4294967295L;
    public final long memberCount;
    public final String pinId;

    public FancyPinRuntimeClusterContext(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.pinId = str;
        this.memberCount = j;
        if (!str.startsWith(FancyPinRuntimeClusterId.PREFIX)) {
            throw C60O.A0i("Runtime cluster context requires an engine-created FancyPin id");
        }
        if (0 > j || j >= LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            throw C60O.A0i("Runtime cluster member count must fit an unsigned 32-bit integer");
        }
    }

    public final FancyPinRuntimeClusterContext copy(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return new FancyPinRuntimeClusterContext(str, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinRuntimeClusterContext) {
                FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext = (FancyPinRuntimeClusterContext) obj;
                if (!C7384Etj.areEqual(this.pinId, fancyPinRuntimeClusterContext.pinId) || this.memberCount != fancyPinRuntimeClusterContext.memberCount) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ FancyPinRuntimeClusterContext copy$default(FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fancyPinRuntimeClusterContext.pinId;
        }
        if ((i & 2) != 0) {
            j = fancyPinRuntimeClusterContext.memberCount;
        }
        C7384Etj.A0Y(str, 0);
        return new FancyPinRuntimeClusterContext(str, j);
    }

    public final String component1() {
        return this.pinId;
    }

    public final long component2() {
        return this.memberCount;
    }

    public final long getMemberCount() {
        return this.memberCount;
    }

    public final String getPinId() {
        return this.pinId;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.memberCount, AnonymousClass001.A0G(this.pinId));
    }

    public String toString() {
        return FGI.A0g("FancyPinRuntimeClusterContext(pinId=", this.pinId, ", memberCount=", ")", this.memberCount);
    }
}
