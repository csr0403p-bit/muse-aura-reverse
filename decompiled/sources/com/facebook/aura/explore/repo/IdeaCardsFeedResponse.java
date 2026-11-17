package com.facebook.aura.explore.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class IdeaCardsFeedResponse extends C06G {
    public final boolean hasBuiltIdea;
    public final boolean hasNextPage;
    public final String nextCursor;
    public final AHD<IdeaCardSection> sections;

    public IdeaCardsFeedResponse(AHD<IdeaCardSection> ahd, boolean z, String str, boolean z2) {
        C7384Etj.A0Y(ahd, 0);
        this.sections = ahd;
        this.hasBuiltIdea = z;
        this.nextCursor = str;
        this.hasNextPage = z2;
    }

    public final IdeaCardsFeedResponse copy(AHD<IdeaCardSection> ahd, boolean z, String str, boolean z2) {
        C7384Etj.A0Y(ahd, 0);
        return new IdeaCardsFeedResponse(ahd, z, str, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardsFeedResponse) {
                IdeaCardsFeedResponse ideaCardsFeedResponse = (IdeaCardsFeedResponse) obj;
                if (!C7384Etj.areEqual(this.sections, ideaCardsFeedResponse.sections) || this.hasBuiltIdea != ideaCardsFeedResponse.hasBuiltIdea || !C7384Etj.areEqual(this.nextCursor, ideaCardsFeedResponse.nextCursor) || this.hasNextPage != ideaCardsFeedResponse.hasNextPage) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardsFeedResponse copy$default(IdeaCardsFeedResponse ideaCardsFeedResponse, AHD ahd, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = ideaCardsFeedResponse.sections;
        }
        if ((i & 2) != 0) {
            z = ideaCardsFeedResponse.hasBuiltIdea;
        }
        if ((i & 4) != 0) {
            str = ideaCardsFeedResponse.nextCursor;
        }
        if ((i & 8) != 0) {
            z2 = ideaCardsFeedResponse.hasNextPage;
        }
        C7384Etj.A0Y(ahd, 0);
        return new IdeaCardsFeedResponse(ahd, z, str, z2);
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

    public final boolean getHasBuiltIdea() {
        return this.hasBuiltIdea;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final AHD<IdeaCardSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return C0KA.A00((C0KA.A01(AnonymousClass005.A0E(this.sections), this.hasBuiltIdea) + AnonymousClass006.A0G(this.nextCursor)) * 31, this.hasNextPage);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardsFeedResponse(AHD ahd, boolean z, String str, boolean z2, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, AnonymousClass001.A1Q(i, z), AnonymousClass006.A0t(i, str), AnonymousClass005.A1P(i, z2));
    }

    public IdeaCardsFeedResponse() {
        this(AHI.A01, false, null, false);
    }
}
