package com.facebook.aura.spaces.view;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.model.SpaceConstructionStatus;

/* loaded from: classes.dex */
public final class SpaceMenuState extends C06G {
    public static final int $stable = 8;
    public final Integer audienceCount;
    public final boolean available;
    public final boolean canDownloadHtml;
    public final boolean canShare;
    public final SpaceConstructionStatus constructionStatus;
    public final Integer error;
    public final String imageUrl;
    public final boolean isPinned;
    public final boolean isSaved;
    public final boolean isShared;
    public final boolean showPin;
    public final String spaceId;
    public final String title;
    public final ArtifactPlacementRequest toLibrary;
    public final ArtifactPlacementRequest toSpaces;

    public SpaceMenuState(String str, String str2, boolean z, boolean z2, boolean z3, Integer num, boolean z4, boolean z5, boolean z6, boolean z7, SpaceConstructionStatus spaceConstructionStatus, ArtifactPlacementRequest artifactPlacementRequest, ArtifactPlacementRequest artifactPlacementRequest2, Integer num2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.imageUrl = str2;
        this.available = z;
        this.isShared = z2;
        this.isSaved = z3;
        this.audienceCount = num;
        this.canShare = z4;
        this.canDownloadHtml = z5;
        this.showPin = z6;
        this.isPinned = z7;
        this.constructionStatus = spaceConstructionStatus;
        this.toLibrary = artifactPlacementRequest;
        this.toSpaces = artifactPlacementRequest2;
        this.error = num2;
        this.spaceId = str3;
    }

    public final SpaceMenuState copy(String str, String str2, boolean z, boolean z2, boolean z3, Integer num, boolean z4, boolean z5, boolean z6, boolean z7, SpaceConstructionStatus spaceConstructionStatus, ArtifactPlacementRequest artifactPlacementRequest, ArtifactPlacementRequest artifactPlacementRequest2, Integer num2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new SpaceMenuState(str, str2, z, z2, z3, num, z4, z5, z6, z7, spaceConstructionStatus, artifactPlacementRequest, artifactPlacementRequest2, num2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceMenuState) {
                SpaceMenuState spaceMenuState = (SpaceMenuState) obj;
                if (!C7384Etj.areEqual(this.title, spaceMenuState.title) || !C7384Etj.areEqual(this.imageUrl, spaceMenuState.imageUrl) || this.available != spaceMenuState.available || this.isShared != spaceMenuState.isShared || this.isSaved != spaceMenuState.isSaved || !C7384Etj.areEqual(this.audienceCount, spaceMenuState.audienceCount) || this.canShare != spaceMenuState.canShare || this.canDownloadHtml != spaceMenuState.canDownloadHtml || this.showPin != spaceMenuState.showPin || this.isPinned != spaceMenuState.isPinned || this.constructionStatus != spaceMenuState.constructionStatus || !C7384Etj.areEqual(this.toLibrary, spaceMenuState.toLibrary) || !C7384Etj.areEqual(this.toSpaces, spaceMenuState.toSpaces) || !C7384Etj.areEqual(this.error, spaceMenuState.error) || !C7384Etj.areEqual(this.spaceId, spaceMenuState.spaceId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceMenuState copy$default(SpaceMenuState spaceMenuState, String str, String str2, boolean z, boolean z2, boolean z3, Integer num, boolean z4, boolean z5, boolean z6, boolean z7, SpaceConstructionStatus spaceConstructionStatus, ArtifactPlacementRequest artifactPlacementRequest, ArtifactPlacementRequest artifactPlacementRequest2, Integer num2, String str3, int i, Object obj) {
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        Integer num3 = num;
        boolean z11 = z4;
        boolean z12 = z5;
        boolean z13 = z6;
        boolean z14 = z7;
        SpaceConstructionStatus spaceConstructionStatus2 = spaceConstructionStatus;
        ArtifactPlacementRequest artifactPlacementRequest3 = artifactPlacementRequest;
        ArtifactPlacementRequest artifactPlacementRequest4 = artifactPlacementRequest2;
        Integer num4 = num2;
        String str4 = str3;
        if ((i & 1) != 0) {
            str = spaceMenuState.title;
        }
        if ((i & 2) != 0) {
            str2 = spaceMenuState.imageUrl;
        }
        if ((i & 4) != 0) {
            z8 = spaceMenuState.available;
        }
        if ((i & 8) != 0) {
            z9 = spaceMenuState.isShared;
        }
        if ((i & 16) != 0) {
            z10 = spaceMenuState.isSaved;
        }
        if ((i & 32) != 0) {
            num3 = spaceMenuState.audienceCount;
        }
        if ((i & 64) != 0) {
            z11 = spaceMenuState.canShare;
        }
        if ((i & 128) != 0) {
            z12 = spaceMenuState.canDownloadHtml;
        }
        if ((i & 256) != 0) {
            z13 = spaceMenuState.showPin;
        }
        if ((i & 512) != 0) {
            z14 = spaceMenuState.isPinned;
        }
        if ((i & 1024) != 0) {
            spaceConstructionStatus2 = spaceMenuState.constructionStatus;
        }
        if ((i & 2048) != 0) {
            artifactPlacementRequest3 = spaceMenuState.toLibrary;
        }
        if ((i & 4096) != 0) {
            artifactPlacementRequest4 = spaceMenuState.toSpaces;
        }
        if ((i & 8192) != 0) {
            num4 = spaceMenuState.error;
        }
        if ((i & 16384) != 0) {
            str4 = spaceMenuState.spaceId;
        }
        return spaceMenuState.copy(str, str2, z8, z9, z10, num3, z11, z12, z13, z14, spaceConstructionStatus2, artifactPlacementRequest3, artifactPlacementRequest4, num4, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final boolean component10() {
        return this.isPinned;
    }

    public final SpaceConstructionStatus component11() {
        return this.constructionStatus;
    }

    public final ArtifactPlacementRequest component12() {
        return this.toLibrary;
    }

    public final ArtifactPlacementRequest component13() {
        return this.toSpaces;
    }

    public final Integer component14() {
        return this.error;
    }

    public final String component15() {
        return this.spaceId;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final boolean component3() {
        return this.available;
    }

    public final boolean component4() {
        return this.isShared;
    }

    public final boolean component5() {
        return this.isSaved;
    }

    public final Integer component6() {
        return this.audienceCount;
    }

    public final boolean component7() {
        return this.canShare;
    }

    public final boolean component8() {
        return this.canDownloadHtml;
    }

    public final boolean component9() {
        return this.showPin;
    }

    public final Integer getAudienceCount() {
        return this.audienceCount;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final boolean getCanDownloadHtml() {
        return this.canDownloadHtml;
    }

    public final boolean getCanShare() {
        return this.canShare;
    }

    public final SpaceConstructionStatus getConstructionStatus() {
        return this.constructionStatus;
    }

    public final Integer getError() {
        return this.error;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getShowPin() {
        return this.showPin;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ArtifactPlacementRequest getToLibrary() {
        return this.toLibrary;
    }

    public final ArtifactPlacementRequest getToSpaces() {
        return this.toSpaces;
    }

    public int hashCode() {
        return ((((((((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.imageUrl)) * 31, this.available), this.isShared), this.isSaved) + AnonymousClass006.A0D(this.audienceCount)) * 31, this.canShare), this.canDownloadHtml), this.showPin), this.isPinned) + AnonymousClass006.A0D(this.constructionStatus)) * 31) + AnonymousClass006.A0D(this.toLibrary)) * 31) + AnonymousClass006.A0D(this.toSpaces)) * 31) + AnonymousClass006.A0D(this.error)) * 31) + AnonymousClass005.A0H(this.spaceId);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isSaved() {
        return this.isSaved;
    }

    public final boolean isShared() {
        return this.isShared;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceMenuState(String str, String str2, boolean z, boolean z2, boolean z3, Integer num, boolean z4, boolean z5, boolean z6, boolean z7, SpaceConstructionStatus spaceConstructionStatus, ArtifactPlacementRequest artifactPlacementRequest, ArtifactPlacementRequest artifactPlacementRequest2, Integer num2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6, (i & 512) == 0 ? z7 : false, (i & 1024) != 0 ? null : spaceConstructionStatus, (i & 2048) != 0 ? null : artifactPlacementRequest, (i & 4096) != 0 ? null : artifactPlacementRequest2, (i & 8192) != 0 ? null : num2, (i & 16384) != 0 ? null : str3);
    }
}
