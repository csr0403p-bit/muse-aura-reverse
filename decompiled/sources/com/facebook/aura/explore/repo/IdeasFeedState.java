package com.facebook.aura.explore.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class IdeasFeedState extends C06G {
    public final boolean hasBuiltIdea;
    public final boolean hasNextPage;
    public final ExploreLoadingState loadingState;
    public final String nextCursor;
    public final AHD<IdeaCardSection> sections;

    public IdeasFeedState(AHD<IdeaCardSection> ahd, boolean z, String str, boolean z2, ExploreLoadingState exploreLoadingState) {
        AnonymousClass002.A1C(ahd, 0, exploreLoadingState);
        this.sections = ahd;
        this.hasBuiltIdea = z;
        this.nextCursor = str;
        this.hasNextPage = z2;
        this.loadingState = exploreLoadingState;
    }

    public final IdeasFeedState copy(AHD<IdeaCardSection> ahd, boolean z, String str, boolean z2, ExploreLoadingState exploreLoadingState) {
        AnonymousClass002.A1C(ahd, 0, exploreLoadingState);
        return new IdeasFeedState(ahd, z, str, z2, exploreLoadingState);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeasFeedState) {
                IdeasFeedState ideasFeedState = (IdeasFeedState) obj;
                if (!C7384Etj.areEqual(this.sections, ideasFeedState.sections) || this.hasBuiltIdea != ideasFeedState.hasBuiltIdea || !C7384Etj.areEqual(this.nextCursor, ideasFeedState.nextCursor) || this.hasNextPage != ideasFeedState.hasNextPage || this.loadingState != ideasFeedState.loadingState) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdeasFeedState copy$default(IdeasFeedState ideasFeedState, AHD ahd, boolean z, String str, boolean z2, ExploreLoadingState exploreLoadingState, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = ideasFeedState.sections;
        }
        if ((i & 2) != 0) {
            z = ideasFeedState.hasBuiltIdea;
        }
        if ((i & 4) != 0) {
            str = ideasFeedState.nextCursor;
        }
        if ((i & 8) != 0) {
            z2 = ideasFeedState.hasNextPage;
        }
        if ((i & 16) != 0) {
            exploreLoadingState = ideasFeedState.loadingState;
        }
        return ideasFeedState.copy(ahd, z, str, z2, exploreLoadingState);
    }

    public final AHD<IdeaCardSection> component1() {
        return this.sections;
    }

    public final boolean component2() {
        return this.hasBuiltIdea;
    }

    public final String component3() {
        return this.nextCursor;
    }

    public final boolean component4() {
        return this.hasNextPage;
    }

    public final ExploreLoadingState component5() {
        return this.loadingState;
    }

    public final boolean getHasBuiltIdea() {
        return this.hasBuiltIdea;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final ExploreLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final AHD<IdeaCardSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.loadingState, C0KA.A01((C0KA.A01(AnonymousClass005.A0E(this.sections), this.hasBuiltIdea) + AnonymousClass006.A0G(this.nextCursor)) * 31, this.hasNextPage));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeasFeedState(AHD ahd, boolean z, String str, boolean z2, ExploreLoadingState exploreLoadingState, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, AnonymousClass001.A1Q(i, z), AnonymousClass006.A0t(i, str), AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? ExploreLoadingState.INITIAL : exploreLoadingState);
    }

    public IdeasFeedState() {
        this(AHI.A01, false, null, false, ExploreLoadingState.INITIAL);
    }
}
