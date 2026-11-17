package com.facebook.aura.spaces.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchSpacesData extends C06G {
    public final boolean isFromOfflineCache;
    public final Long lastRefreshed;
    public final LoadingState loadingState;
    public final AHD<SpaceCard> spaceCards;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSpacesData) {
                HatchSpacesData hatchSpacesData = (HatchSpacesData) obj;
                if (!C7384Etj.areEqual(this.spaceCards, hatchSpacesData.spaceCards) || this.loadingState != hatchSpacesData.loadingState || !C7384Etj.areEqual(this.lastRefreshed, hatchSpacesData.lastRefreshed) || this.isFromOfflineCache != hatchSpacesData.isFromOfflineCache) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchSpacesData(AHD ahd, LoadingState loadingState, Long l, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? LoadingState.INITIAL : loadingState, (i & 4) != 0 ? null : l, AnonymousClass005.A1P(i, z));
    }

    public static /* synthetic */ HatchSpacesData copy$default(HatchSpacesData hatchSpacesData, AHD ahd, LoadingState loadingState, Long l, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = hatchSpacesData.spaceCards;
        }
        if ((i & 2) != 0) {
            loadingState = hatchSpacesData.loadingState;
        }
        if ((i & 4) != 0) {
            l = hatchSpacesData.lastRefreshed;
        }
        if ((i & 8) != 0) {
            z = hatchSpacesData.isFromOfflineCache;
        }
        AnonymousClass003.A0u(ahd, loadingState);
        return new HatchSpacesData(ahd, loadingState, l, z);
    }

    public final AHD<SpaceCard> component1() {
        return this.spaceCards;
    }

    public final LoadingState component2() {
        return this.loadingState;
    }

    public final Long component3() {
        return this.lastRefreshed;
    }

    public final boolean component4() {
        return this.isFromOfflineCache;
    }

    public final Long getLastRefreshed() {
        return this.lastRefreshed;
    }

    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final AHD<SpaceCard> getSpaceCards() {
        return this.spaceCards;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.loadingState, AnonymousClass005.A0E(this.spaceCards)) + AnonymousClass006.A0D(this.lastRefreshed)) * 31, this.isFromOfflineCache);
    }

    public final boolean isFromOfflineCache() {
        return this.isFromOfflineCache;
    }

    public final HatchSpacesData copy(AHD<SpaceCard> ahd, LoadingState loadingState, Long l, boolean z) {
        AnonymousClass003.A0u(ahd, loadingState);
        return new HatchSpacesData(ahd, loadingState, l, z);
    }

    public String toString() {
        return super.toString();
    }

    public HatchSpacesData(AHD<SpaceCard> ahd, LoadingState loadingState, Long l, boolean z) {
        AnonymousClass003.A0u(ahd, loadingState);
        this.spaceCards = ahd;
        this.loadingState = loadingState;
        this.lastRefreshed = l;
        this.isFromOfflineCache = z;
    }

    public HatchSpacesData() {
        this(AHI.A01, LoadingState.INITIAL, null, false);
    }
}
