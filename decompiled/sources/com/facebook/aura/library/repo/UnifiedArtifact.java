package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.model.SpaceConstructionStatus;

/* loaded from: classes.dex */
public final class UnifiedArtifact extends C06G {
    public final String artifactRef;
    public final boolean canDelete;
    public final boolean canDownloadHtml;
    public final boolean canOpen;
    public final boolean canPin;
    public final boolean canRename;
    public final boolean canShare;
    public final SpaceConstructionStatus constructionStatus;
    public final String displayName;
    public final String format;
    public final String iconUrl;
    public final boolean isPinned;
    public final String itemKey;
    public final ArtifactOpenTarget openTarget;
    public final ArtifactPlacement placement;
    public final String publisherName;
    public final ArtifactSharingInfo sharing;
    public final long sortTimestampMs;
    public final ArtifactSource source;
    public final String spaceId;
    public final String thumbnailUrl;
    public final String viewUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnifiedArtifact) {
                UnifiedArtifact unifiedArtifact = (UnifiedArtifact) obj;
                if (!C7384Etj.areEqual(this.artifactRef, unifiedArtifact.artifactRef) || this.source != unifiedArtifact.source || !C7384Etj.areEqual(this.itemKey, unifiedArtifact.itemKey) || !C7384Etj.areEqual(this.displayName, unifiedArtifact.displayName) || !C7384Etj.areEqual(this.format, unifiedArtifact.format) || !C7384Etj.areEqual(this.openTarget, unifiedArtifact.openTarget) || !C7384Etj.areEqual(this.viewUrl, unifiedArtifact.viewUrl) || !C7384Etj.areEqual(this.iconUrl, unifiedArtifact.iconUrl) || this.isPinned != unifiedArtifact.isPinned || this.sortTimestampMs != unifiedArtifact.sortTimestampMs || this.canOpen != unifiedArtifact.canOpen || this.canShare != unifiedArtifact.canShare || this.canDownloadHtml != unifiedArtifact.canDownloadHtml || !C7384Etj.areEqual(this.spaceId, unifiedArtifact.spaceId) || this.placement != unifiedArtifact.placement || this.constructionStatus != unifiedArtifact.constructionStatus || !C7384Etj.areEqual(this.thumbnailUrl, unifiedArtifact.thumbnailUrl) || !C7384Etj.areEqual(this.sharing, unifiedArtifact.sharing) || !C7384Etj.areEqual(this.publisherName, unifiedArtifact.publisherName) || this.canRename != unifiedArtifact.canRename || this.canDelete != unifiedArtifact.canDelete || this.canPin != unifiedArtifact.canPin) {
                }
            }
            return false;
        }
        return true;
    }

    public final ArtifactPlacementRequest placementRequest(ArtifactPlacement artifactPlacement) {
        ArtifactPlacement artifactPlacement2;
        C7384Etj.A0Y(artifactPlacement, 0);
        String str = this.spaceId;
        if (str == null || !UnifiedArtifactKt.isValidUuid(str) || (artifactPlacement2 = this.placement) == null || artifactPlacement2 == artifactPlacement || !C7384Etj.areEqual(this.artifactRef, this.source.placementArtifactRef(this.itemKey))) {
            return null;
        }
        return new ArtifactPlacementRequest(this.artifactRef, str, artifactPlacement);
    }

    public final String component1() {
        return this.artifactRef;
    }

    public final long component10() {
        return this.sortTimestampMs;
    }

    public final boolean component11() {
        return this.canOpen;
    }

    public final boolean component12() {
        return this.canShare;
    }

    public final boolean component13() {
        return this.canDownloadHtml;
    }

    public final String component14() {
        return this.spaceId;
    }

    public final ArtifactPlacement component15() {
        return this.placement;
    }

    public final SpaceConstructionStatus component16() {
        return this.constructionStatus;
    }

    public final String component17() {
        return this.thumbnailUrl;
    }

    public final ArtifactSharingInfo component18() {
        return this.sharing;
    }

    public final String component19() {
        return this.publisherName;
    }

    public final ArtifactSource component2() {
        return this.source;
    }

    public final boolean component20() {
        return this.canRename;
    }

    public final boolean component21() {
        return this.canDelete;
    }

    public final boolean component22() {
        return this.canPin;
    }

    public final String component3() {
        return this.itemKey;
    }

    public final String component4() {
        return this.displayName;
    }

    public final String component5() {
        return this.format;
    }

    public final ArtifactOpenTarget component6() {
        return this.openTarget;
    }

    public final String component7() {
        return this.viewUrl;
    }

    public final String component8() {
        return this.iconUrl;
    }

    public final boolean component9() {
        return this.isPinned;
    }

    public final String getArtifactRef() {
        return this.artifactRef;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final boolean getCanDownloadHtml() {
        return this.canDownloadHtml;
    }

    public final boolean getCanOpen() {
        return this.canOpen;
    }

    public final boolean getCanPin() {
        return this.canPin;
    }

    public final boolean getCanRename() {
        return this.canRename;
    }

    public final boolean getCanShare() {
        return this.canShare;
    }

    public final SpaceConstructionStatus getConstructionStatus() {
        return this.constructionStatus;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getItemKey() {
        return this.itemKey;
    }

    public final ArtifactOpenTarget getOpenTarget() {
        return this.openTarget;
    }

    public final ArtifactPlacement getPlacement() {
        return this.placement;
    }

    public final String getPublisherName() {
        return this.publisherName;
    }

    public final ArtifactSharingInfo getSharing() {
        return this.sharing;
    }

    public final long getSortTimestampMs() {
        return this.sortTimestampMs;
    }

    public final ArtifactSource getSource() {
        return this.source;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getViewUrl() {
        return this.viewUrl;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01((((((((((((C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass006.A06(this.sortTimestampMs, C0KA.A01((((((((AnonymousClass005.A0I(this.displayName, AnonymousClass005.A0I(this.itemKey, AnonymousClass005.A0F(this.source, AnonymousClass001.A0G(this.artifactRef)))) + AnonymousClass006.A0G(this.format)) * 31) + AnonymousClass006.A0D(this.openTarget)) * 31) + AnonymousClass006.A0G(this.viewUrl)) * 31) + AnonymousClass006.A0G(this.iconUrl)) * 31, this.isPinned)), this.canOpen), this.canShare), this.canDownloadHtml) + AnonymousClass006.A0G(this.spaceId)) * 31) + AnonymousClass006.A0D(this.placement)) * 31) + AnonymousClass006.A0D(this.constructionStatus)) * 31) + AnonymousClass006.A0G(this.thumbnailUrl)) * 31) + AnonymousClass006.A0D(this.sharing)) * 31) + AnonymousClass005.A0H(this.publisherName)) * 31, this.canRename), this.canDelete), this.canPin);
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public UnifiedArtifact(String str, ArtifactSource artifactSource, String str2, String str3, String str4, ArtifactOpenTarget artifactOpenTarget, String str5, String str6, boolean z, long j, boolean z2, boolean z3, boolean z4, String str7, ArtifactPlacement artifactPlacement, SpaceConstructionStatus spaceConstructionStatus, String str8, ArtifactSharingInfo artifactSharingInfo, String str9, boolean z5, boolean z6, boolean z7) {
        AnonymousClass005.A14(str, artifactSource, str2, str3);
        this.artifactRef = str;
        this.source = artifactSource;
        this.itemKey = str2;
        this.displayName = str3;
        this.format = str4;
        this.openTarget = artifactOpenTarget;
        this.viewUrl = str5;
        this.iconUrl = str6;
        this.isPinned = z;
        this.sortTimestampMs = j;
        this.canOpen = z2;
        this.canShare = z3;
        this.canDownloadHtml = z4;
        this.spaceId = str7;
        this.placement = artifactPlacement;
        this.constructionStatus = spaceConstructionStatus;
        this.thumbnailUrl = str8;
        this.sharing = artifactSharingInfo;
        this.publisherName = str9;
        this.canRename = z5;
        this.canDelete = z6;
        this.canPin = z7;
    }

    public final UnifiedArtifact copy(String str, ArtifactSource artifactSource, String str2, String str3, String str4, ArtifactOpenTarget artifactOpenTarget, String str5, String str6, boolean z, long j, boolean z2, boolean z3, boolean z4, String str7, ArtifactPlacement artifactPlacement, SpaceConstructionStatus spaceConstructionStatus, String str8, ArtifactSharingInfo artifactSharingInfo, String str9, boolean z5, boolean z6, boolean z7) {
        AnonymousClass005.A14(str, artifactSource, str2, str3);
        return new UnifiedArtifact(str, artifactSource, str2, str3, str4, artifactOpenTarget, str5, str6, z, j, z2, z3, z4, str7, artifactPlacement, spaceConstructionStatus, str8, artifactSharingInfo, str9, z5, z6, z7);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ UnifiedArtifact copy$default(UnifiedArtifact unifiedArtifact, String str, ArtifactSource artifactSource, String str2, String str3, String str4, ArtifactOpenTarget artifactOpenTarget, String str5, String str6, boolean z, long j, boolean z2, boolean z3, boolean z4, String str7, ArtifactPlacement artifactPlacement, SpaceConstructionStatus spaceConstructionStatus, String str8, ArtifactSharingInfo artifactSharingInfo, String str9, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        String str10 = str;
        ArtifactSource artifactSource2 = artifactSource;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        ArtifactOpenTarget artifactOpenTarget2 = artifactOpenTarget;
        String str14 = str5;
        String str15 = str6;
        boolean z8 = z;
        long j2 = j;
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = z4;
        String str16 = str7;
        ArtifactPlacement artifactPlacement2 = artifactPlacement;
        SpaceConstructionStatus spaceConstructionStatus2 = spaceConstructionStatus;
        String str17 = str8;
        ArtifactSharingInfo artifactSharingInfo2 = artifactSharingInfo;
        String str18 = str9;
        boolean z12 = z5;
        boolean z13 = z6;
        boolean z14 = z7;
        if ((i & 1) != 0) {
            str10 = unifiedArtifact.artifactRef;
        }
        if ((i & 2) != 0) {
            artifactSource2 = unifiedArtifact.source;
        }
        if ((i & 4) != 0) {
            str11 = unifiedArtifact.itemKey;
        }
        if ((i & 8) != 0) {
            str12 = unifiedArtifact.displayName;
        }
        if ((i & 16) != 0) {
            str13 = unifiedArtifact.format;
        }
        if ((i & 32) != 0) {
            artifactOpenTarget2 = unifiedArtifact.openTarget;
        }
        if ((i & 64) != 0) {
            str14 = unifiedArtifact.viewUrl;
        }
        if ((i & 128) != 0) {
            str15 = unifiedArtifact.iconUrl;
        }
        if ((i & 256) != 0) {
            z8 = unifiedArtifact.isPinned;
        }
        if ((i & 512) != 0) {
            j2 = unifiedArtifact.sortTimestampMs;
        }
        if ((i & 1024) != 0) {
            z9 = unifiedArtifact.canOpen;
        }
        if ((i & 2048) != 0) {
            z10 = unifiedArtifact.canShare;
        }
        if ((i & 4096) != 0) {
            z11 = unifiedArtifact.canDownloadHtml;
        }
        if ((i & 8192) != 0) {
            str16 = unifiedArtifact.spaceId;
        }
        if ((i & 16384) != 0) {
            artifactPlacement2 = unifiedArtifact.placement;
        }
        if ((i & 32768) != 0) {
            spaceConstructionStatus2 = unifiedArtifact.constructionStatus;
        }
        if ((i & 65536) != 0) {
            str17 = unifiedArtifact.thumbnailUrl;
        }
        if ((i & 131072) != 0) {
            artifactSharingInfo2 = unifiedArtifact.sharing;
        }
        if ((i & 262144) != 0) {
            str18 = unifiedArtifact.publisherName;
        }
        if ((i & 524288) != 0) {
            z12 = unifiedArtifact.canRename;
        }
        if ((i & 1048576) != 0) {
            z13 = unifiedArtifact.canDelete;
        }
        if ((i & 2097152) != 0) {
            z14 = unifiedArtifact.canPin;
        }
        boolean z15 = z10;
        boolean z16 = z11;
        return unifiedArtifact.copy(str10, artifactSource2, str11, str12, str13, artifactOpenTarget2, str14, str15, z8, j2, z9, z15, z16, str16, artifactPlacement2, spaceConstructionStatus2, str17, artifactSharingInfo2, str18, z12, z13, z14);
    }

    public /* synthetic */ UnifiedArtifact(String str, ArtifactSource artifactSource, String str2, String str3, String str4, ArtifactOpenTarget artifactOpenTarget, String str5, String str6, boolean z, long j, boolean z2, boolean z3, boolean z4, String str7, ArtifactPlacement artifactPlacement, SpaceConstructionStatus spaceConstructionStatus, String str8, ArtifactSharingInfo artifactSharingInfo, String str9, boolean z5, boolean z6, boolean z7, int i, C06H c06h) {
        this(str, artifactSource, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : artifactOpenTarget, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? false : z, (i & 512) != 0 ? 0L : j, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? false : z4, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : artifactPlacement, (32768 & i) != 0 ? null : spaceConstructionStatus, (65536 & i) != 0 ? null : str8, (131072 & i) != 0 ? null : artifactSharingInfo, (262144 & i) != 0 ? null : str9, C06G.A0o(524288, i, z5), C06G.A0o(1048576, i, z6), C06G.A0o(i, 2097152, z7));
    }
}
