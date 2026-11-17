package com.facebook.aura.library.repo;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.model.SpaceConstructionStatus;

/* loaded from: classes.dex */
public final class ArtifactItem extends C06G {
    public final Long accessedAtMs;
    public final String artifactRef;
    public final SpaceConstructionStatus constructionStatus;
    public final String displayName;
    public final Double favoriteOrder;
    public final Double frequencyScore;
    public final Boolean hasServerActions;
    public final String icon;
    public final boolean isFavorite;
    public final String itemKey;
    public final ArtifactPlacement placement;
    public final ArtifactSharingInfo sharing;
    public final ArtifactSource source;
    public final String sourceUrl;
    public final String spaceId;
    public final String viewUrl;
    public final String xmdsIcon;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactItem) {
                ArtifactItem artifactItem = (ArtifactItem) obj;
                if (this.source != artifactItem.source || !C7384Etj.areEqual(this.itemKey, artifactItem.itemKey) || !C7384Etj.areEqual(this.displayName, artifactItem.displayName) || !C7384Etj.areEqual(this.icon, artifactItem.icon) || !C7384Etj.areEqual(this.xmdsIcon, artifactItem.xmdsIcon) || this.isFavorite != artifactItem.isFavorite || !C7384Etj.areEqual(this.favoriteOrder, artifactItem.favoriteOrder) || !C7384Etj.areEqual(this.accessedAtMs, artifactItem.accessedAtMs) || !C7384Etj.areEqual(this.frequencyScore, artifactItem.frequencyScore) || !C7384Etj.areEqual(this.sourceUrl, artifactItem.sourceUrl) || !C7384Etj.areEqual(this.hasServerActions, artifactItem.hasServerActions) || !C7384Etj.areEqual(this.spaceId, artifactItem.spaceId) || !C7384Etj.areEqual(this.artifactRef, artifactItem.artifactRef) || this.placement != artifactItem.placement || this.constructionStatus != artifactItem.constructionStatus || !C7384Etj.areEqual(this.sharing, artifactItem.sharing) || !C7384Etj.areEqual(this.viewUrl, artifactItem.viewUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ArtifactItem(ArtifactSource artifactSource, String str, String str2, String str3, String str4, boolean z, Double d, Long l, Double d2, String str5, Boolean bool, String str6, String str7, ArtifactPlacement artifactPlacement, SpaceConstructionStatus spaceConstructionStatus, ArtifactSharingInfo artifactSharingInfo, String str8, int i, C06H c06h) {
        this(artifactSource, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, AnonymousClass002.A1R(i, z), (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : d2, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : artifactPlacement, (i & 16384) != 0 ? null : spaceConstructionStatus, (32768 & i) != 0 ? null : artifactSharingInfo, (i & 65536) != 0 ? null : str8);
    }

    public static /* synthetic */ ArtifactItem copy$default(ArtifactItem artifactItem, ArtifactSource artifactSource, String str, String str2, String str3, String str4, boolean z, Double d, Long l, Double d2, String str5, Boolean bool, String str6, String str7, ArtifactPlacement artifactPlacement, SpaceConstructionStatus spaceConstructionStatus, ArtifactSharingInfo artifactSharingInfo, String str8, int i, Object obj) {
        ArtifactSource artifactSource2 = artifactSource;
        String str9 = str;
        String str10 = str2;
        boolean z2 = z;
        Double d3 = d;
        Long l2 = l;
        Double d4 = d2;
        String str11 = str5;
        Boolean bool2 = bool;
        String str12 = str6;
        String str13 = str7;
        ArtifactPlacement artifactPlacement2 = artifactPlacement;
        SpaceConstructionStatus spaceConstructionStatus2 = spaceConstructionStatus;
        ArtifactSharingInfo artifactSharingInfo2 = artifactSharingInfo;
        String str14 = str8;
        if ((i & 1) != 0) {
            artifactSource2 = artifactItem.source;
        }
        if ((i & 2) != 0) {
            str9 = artifactItem.itemKey;
        }
        if ((i & 4) != 0) {
            str10 = artifactItem.displayName;
        }
        if ((i & 8) != 0) {
            str3 = artifactItem.icon;
        }
        if ((i & 16) != 0) {
            str4 = artifactItem.xmdsIcon;
        }
        if ((i & 32) != 0) {
            z2 = artifactItem.isFavorite;
        }
        if ((i & 64) != 0) {
            d3 = artifactItem.favoriteOrder;
        }
        if ((i & 128) != 0) {
            l2 = artifactItem.accessedAtMs;
        }
        if ((i & 256) != 0) {
            d4 = artifactItem.frequencyScore;
        }
        if ((i & 512) != 0) {
            str11 = artifactItem.sourceUrl;
        }
        if ((i & 1024) != 0) {
            bool2 = artifactItem.hasServerActions;
        }
        if ((i & 2048) != 0) {
            str12 = artifactItem.spaceId;
        }
        if ((i & 4096) != 0) {
            str13 = artifactItem.artifactRef;
        }
        if ((i & 8192) != 0) {
            artifactPlacement2 = artifactItem.placement;
        }
        if ((i & 16384) != 0) {
            spaceConstructionStatus2 = artifactItem.constructionStatus;
        }
        if ((i & 32768) != 0) {
            artifactSharingInfo2 = artifactItem.sharing;
        }
        if ((i & 65536) != 0) {
            str14 = artifactItem.viewUrl;
        }
        AnonymousClass005.A0x(artifactSource2, str9, str10);
        boolean z3 = z2;
        Double d5 = d3;
        return new ArtifactItem(artifactSource2, str9, str10, str3, str4, z3, d5, l2, d4, str11, bool2, str12, str13, artifactPlacement2, spaceConstructionStatus2, artifactSharingInfo2, str14);
    }

    public final ArtifactSource component1() {
        return this.source;
    }

    public final String component10() {
        return this.sourceUrl;
    }

    public final Boolean component11() {
        return this.hasServerActions;
    }

    public final String component12() {
        return this.spaceId;
    }

    public final String component13() {
        return this.artifactRef;
    }

    public final ArtifactPlacement component14() {
        return this.placement;
    }

    public final SpaceConstructionStatus component15() {
        return this.constructionStatus;
    }

    public final ArtifactSharingInfo component16() {
        return this.sharing;
    }

    public final String component17() {
        return this.viewUrl;
    }

    public final String component2() {
        return this.itemKey;
    }

    public final String component3() {
        return this.displayName;
    }

    public final String component4() {
        return this.icon;
    }

    public final String component5() {
        return this.xmdsIcon;
    }

    public final boolean component6() {
        return this.isFavorite;
    }

    public final Double component7() {
        return this.favoriteOrder;
    }

    public final Long component8() {
        return this.accessedAtMs;
    }

    public final Double component9() {
        return this.frequencyScore;
    }

    public final Long getAccessedAtMs() {
        return this.accessedAtMs;
    }

    public final String getArtifactRef() {
        return this.artifactRef;
    }

    public final SpaceConstructionStatus getConstructionStatus() {
        return this.constructionStatus;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Double getFavoriteOrder() {
        return this.favoriteOrder;
    }

    public final Double getFrequencyScore() {
        return this.frequencyScore;
    }

    public final Boolean getHasServerActions() {
        return this.hasServerActions;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getItemKey() {
        return this.itemKey;
    }

    public final ArtifactPlacement getPlacement() {
        return this.placement;
    }

    public final ArtifactSharingInfo getSharing() {
        return this.sharing;
    }

    public final ArtifactSource getSource() {
        return this.source;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final String getSpaceId() {
        return this.spaceId;
    }

    public final String getViewUrl() {
        return this.viewUrl;
    }

    public final String getXmdsIcon() {
        return this.xmdsIcon;
    }

    public int hashCode() {
        return ((((((((((((((((((((C0KA.A01((((AnonymousClass005.A0I(this.displayName, AnonymousClass005.A0I(this.itemKey, AnonymousClass005.A0E(this.source))) + AnonymousClass006.A0G(this.icon)) * 31) + AnonymousClass006.A0G(this.xmdsIcon)) * 31, this.isFavorite) + AnonymousClass006.A0D(this.favoriteOrder)) * 31) + AnonymousClass006.A0D(this.accessedAtMs)) * 31) + AnonymousClass006.A0D(this.frequencyScore)) * 31) + AnonymousClass006.A0G(this.sourceUrl)) * 31) + AnonymousClass006.A0D(this.hasServerActions)) * 31) + AnonymousClass006.A0G(this.spaceId)) * 31) + AnonymousClass006.A0G(this.artifactRef)) * 31) + AnonymousClass006.A0D(this.placement)) * 31) + AnonymousClass006.A0D(this.constructionStatus)) * 31) + AnonymousClass006.A0D(this.sharing)) * 31) + AnonymousClass005.A0H(this.viewUrl);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final ArtifactPlacementRequest moveToLibraryRequest() {
        String strPlacementArtifactRef;
        String str = this.spaceId;
        if (str == null || !UnifiedArtifactKt.isValidUuid(str) || this.placement == ArtifactPlacement.LIBRARY || (strPlacementArtifactRef = this.source.placementArtifactRef(this.itemKey)) == null) {
            return null;
        }
        String str2 = this.artifactRef;
        if (str2 != null && str2.equals(strPlacementArtifactRef)) {
            strPlacementArtifactRef = str2;
        } else if (this.placement != null || this.source != ArtifactSource.SPACE) {
            return null;
        }
        return new ArtifactPlacementRequest(strPlacementArtifactRef, str, ArtifactPlacement.LIBRARY);
    }

    public final ArtifactItem copy(ArtifactSource artifactSource, String str, String str2, String str3, String str4, boolean z, Double d, Long l, Double d2, String str5, Boolean bool, String str6, String str7, ArtifactPlacement artifactPlacement, SpaceConstructionStatus spaceConstructionStatus, ArtifactSharingInfo artifactSharingInfo, String str8) {
        AnonymousClass005.A0x(artifactSource, str, str2);
        return new ArtifactItem(artifactSource, str, str2, str3, str4, z, d, l, d2, str5, bool, str6, str7, artifactPlacement, spaceConstructionStatus, artifactSharingInfo, str8);
    }

    public String toString() {
        return super.toString();
    }

    public ArtifactItem(ArtifactSource artifactSource, String str, String str2, String str3, String str4, boolean z, Double d, Long l, Double d2, String str5, Boolean bool, String str6, String str7, ArtifactPlacement artifactPlacement, SpaceConstructionStatus spaceConstructionStatus, ArtifactSharingInfo artifactSharingInfo, String str8) {
        AnonymousClass005.A0x(artifactSource, str, str2);
        this.source = artifactSource;
        this.itemKey = str;
        this.displayName = str2;
        this.icon = str3;
        this.xmdsIcon = str4;
        this.isFavorite = z;
        this.favoriteOrder = d;
        this.accessedAtMs = l;
        this.frequencyScore = d2;
        this.sourceUrl = str5;
        this.hasServerActions = bool;
        this.spaceId = str6;
        this.artifactRef = str7;
        this.placement = artifactPlacement;
        this.constructionStatus = spaceConstructionStatus;
        this.sharing = artifactSharingInfo;
        this.viewUrl = str8;
    }
}
