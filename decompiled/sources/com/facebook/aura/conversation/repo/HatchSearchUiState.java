package com.facebook.aura.conversation.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.conversation.data.HatchSearchHit;

/* loaded from: classes.dex */
public final class HatchSearchUiState extends C06G {
    public final boolean hasMore;
    public final boolean isError;
    public final boolean isLoading;
    public final boolean isLoadingMore;
    public final Long nextBeforeRowId;
    public final String query;
    public final AHD<HatchSearchHit> results;

    public HatchSearchUiState() {
        this("", AHI.A01, false, false, false, false, null);
    }

    public static /* synthetic */ HatchSearchUiState copy$default(HatchSearchUiState hatchSearchUiState, String str, AHD ahd, boolean z, boolean z2, boolean z3, boolean z4, Long l, int i, Object obj) {
        String str2 = str;
        AHD ahd2 = ahd;
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        Long l2 = l;
        if ((i & 1) != 0) {
            str2 = hatchSearchUiState.query;
        }
        if ((i & 2) != 0) {
            ahd2 = hatchSearchUiState.results;
        }
        if ((i & 4) != 0) {
            z5 = hatchSearchUiState.isLoading;
        }
        if ((i & 8) != 0) {
            z6 = hatchSearchUiState.isError;
        }
        if ((i & 16) != 0) {
            z7 = hatchSearchUiState.hasMore;
        }
        if ((i & 32) != 0) {
            z8 = hatchSearchUiState.isLoadingMore;
        }
        if ((i & 64) != 0) {
            l2 = hatchSearchUiState.nextBeforeRowId;
        }
        AnonymousClass003.A0u(str2, ahd2);
        return new HatchSearchUiState(str2, ahd2, z5, z6, z7, z8, l2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSearchUiState) {
                HatchSearchUiState hatchSearchUiState = (HatchSearchUiState) obj;
                if (!C7384Etj.areEqual(this.query, hatchSearchUiState.query) || !C7384Etj.areEqual(this.results, hatchSearchUiState.results) || this.isLoading != hatchSearchUiState.isLoading || this.isError != hatchSearchUiState.isError || this.hasMore != hatchSearchUiState.hasMore || this.isLoadingMore != hatchSearchUiState.isLoadingMore || !C7384Etj.areEqual(this.nextBeforeRowId, hatchSearchUiState.nextBeforeRowId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.query;
    }

    public final AHD<HatchSearchHit> component2() {
        return this.results;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final boolean component4() {
        return this.isError;
    }

    public final boolean component5() {
        return this.hasMore;
    }

    public final boolean component6() {
        return this.isLoadingMore;
    }

    public final Long component7() {
        return this.nextBeforeRowId;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Long getNextBeforeRowId() {
        return this.nextBeforeRowId;
    }

    public final String getQuery() {
        return this.query;
    }

    public final AHD<HatchSearchHit> getResults() {
        return this.results;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.results, AnonymousClass001.A0G(this.query)), this.isLoading), this.isError), this.hasMore), this.isLoadingMore) + AnonymousClass006.A0D(this.nextBeforeRowId);
    }

    public final boolean isError() {
        return this.isError;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final HatchSearchUiState copy(String str, AHD<HatchSearchHit> ahd, boolean z, boolean z2, boolean z3, boolean z4, Long l) {
        AnonymousClass003.A0u(str, ahd);
        return new HatchSearchUiState(str, ahd, z, z2, z3, z4, l);
    }

    public String toString() {
        return super.toString();
    }

    public HatchSearchUiState(String str, AHD<HatchSearchHit> ahd, boolean z, boolean z2, boolean z3, boolean z4, Long l) {
        AnonymousClass003.A0u(str, ahd);
        this.query = str;
        this.results = ahd;
        this.isLoading = z;
        this.isError = z2;
        this.hasMore = z3;
        this.isLoadingMore = z4;
        this.nextBeforeRowId = l;
    }

    public /* synthetic */ HatchSearchUiState(String str, AHD ahd, boolean z, boolean z2, boolean z3, boolean z4, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AHI.A01 : ahd, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), AnonymousClass005.A1Q(i, z3), (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : l);
    }
}
