package com.facebook.aura.explore.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.model.IdeaSharing;
import com.facebook.aura.model.IdeaSharingKind;

/* loaded from: classes.dex */
public final class IdeaCard extends C06G {
    public final String actionLabel;
    public final AHD<String> badges;
    public final String buildStatus;
    public final String buildSummary;
    public final AHD<String> connectionIds;
    public final String detailDescription;
    public final String displayBadgeText;
    public final String fitReason;
    public final String iconMimeType;
    public final String iconUrl;
    public final String ideaCardId;
    public final String previewImageUrl;
    public final String primaryLabel;
    public final String secondaryLabel;
    public final IdeaSharing sharing;
    public final String summary;
    public final String title;

    public IdeaCard() {
        int i = IdeaSharing.$stable;
        IdeaSharing ideaSharing = new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null);
        AHI ahi = AHI.A01;
        this("", ideaSharing, "", "", null, null, null, null, null, null, null, null, null, ahi, "", "", ahi);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCard) {
                IdeaCard ideaCard = (IdeaCard) obj;
                if (!C7384Etj.areEqual(this.ideaCardId, ideaCard.ideaCardId) || !C7384Etj.areEqual(this.sharing, ideaCard.sharing) || !C7384Etj.areEqual(this.title, ideaCard.title) || !C7384Etj.areEqual(this.summary, ideaCard.summary) || !C7384Etj.areEqual(this.detailDescription, ideaCard.detailDescription) || !C7384Etj.areEqual(this.fitReason, ideaCard.fitReason) || !C7384Etj.areEqual(this.buildSummary, ideaCard.buildSummary) || !C7384Etj.areEqual(this.previewImageUrl, ideaCard.previewImageUrl) || !C7384Etj.areEqual(this.iconUrl, ideaCard.iconUrl) || !C7384Etj.areEqual(this.iconMimeType, ideaCard.iconMimeType) || !C7384Etj.areEqual(this.primaryLabel, ideaCard.primaryLabel) || !C7384Etj.areEqual(this.secondaryLabel, ideaCard.secondaryLabel) || !C7384Etj.areEqual(this.displayBadgeText, ideaCard.displayBadgeText) || !C7384Etj.areEqual(this.badges, ideaCard.badges) || !C7384Etj.areEqual(this.actionLabel, ideaCard.actionLabel) || !C7384Etj.areEqual(this.buildStatus, ideaCard.buildStatus) || !C7384Etj.areEqual(this.connectionIds, ideaCard.connectionIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCard copy$default(IdeaCard ideaCard, String str, IdeaSharing ideaSharing, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AHD ahd, String str13, String str14, AHD ahd2, int i, Object obj) {
        String str15 = str;
        IdeaSharing ideaSharing2 = ideaSharing;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        AHD ahd3 = ahd;
        String str27 = str13;
        String str28 = str14;
        AHD ahd4 = ahd2;
        if ((i & 1) != 0) {
            str15 = ideaCard.ideaCardId;
        }
        if ((i & 2) != 0) {
            ideaSharing2 = ideaCard.sharing;
        }
        if ((i & 4) != 0) {
            str16 = ideaCard.title;
        }
        if ((i & 8) != 0) {
            str17 = ideaCard.summary;
        }
        if ((i & 16) != 0) {
            str18 = ideaCard.detailDescription;
        }
        if ((i & 32) != 0) {
            str19 = ideaCard.fitReason;
        }
        if ((i & 64) != 0) {
            str20 = ideaCard.buildSummary;
        }
        if ((i & 128) != 0) {
            str21 = ideaCard.previewImageUrl;
        }
        if ((i & 256) != 0) {
            str22 = ideaCard.iconUrl;
        }
        if ((i & 512) != 0) {
            str23 = ideaCard.iconMimeType;
        }
        if ((i & 1024) != 0) {
            str24 = ideaCard.primaryLabel;
        }
        if ((i & 2048) != 0) {
            str25 = ideaCard.secondaryLabel;
        }
        if ((i & 4096) != 0) {
            str26 = ideaCard.displayBadgeText;
        }
        if ((i & 8192) != 0) {
            ahd3 = ideaCard.badges;
        }
        if ((i & 16384) != 0) {
            str27 = ideaCard.actionLabel;
        }
        if ((i & 32768) != 0) {
            str28 = ideaCard.buildStatus;
        }
        if ((i & 65536) != 0) {
            ahd4 = ideaCard.connectionIds;
        }
        String str29 = str18;
        return ideaCard.copy(str15, ideaSharing2, str16, str17, str29, str19, str20, str21, str22, str23, str24, str25, str26, ahd3, str27, str28, ahd4);
    }

    public final String component1() {
        return this.ideaCardId;
    }

    public final String component10() {
        return this.iconMimeType;
    }

    public final String component11() {
        return this.primaryLabel;
    }

    public final String component12() {
        return this.secondaryLabel;
    }

    public final String component13() {
        return this.displayBadgeText;
    }

    public final AHD<String> component14() {
        return this.badges;
    }

    public final String component15() {
        return this.actionLabel;
    }

    public final String component16() {
        return this.buildStatus;
    }

    public final AHD<String> component17() {
        return this.connectionIds;
    }

    public final IdeaSharing component2() {
        return this.sharing;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.summary;
    }

    public final String component5() {
        return this.detailDescription;
    }

    public final String component6() {
        return this.fitReason;
    }

    public final String component7() {
        return this.buildSummary;
    }

    public final String component8() {
        return this.previewImageUrl;
    }

    public final String component9() {
        return this.iconUrl;
    }

    public final String getActionLabel() {
        return this.actionLabel;
    }

    public final AHD<String> getBadges() {
        return this.badges;
    }

    public final String getBuildStatus() {
        return this.buildStatus;
    }

    public final String getBuildSummary() {
        return this.buildSummary;
    }

    public final AHD<String> getConnectionIds() {
        return this.connectionIds;
    }

    public final String getDetailDescription() {
        return this.detailDescription;
    }

    public final String getDisplayBadgeText() {
        return this.displayBadgeText;
    }

    public final String getFitReason() {
        return this.fitReason;
    }

    public final String getIconMimeType() {
        return this.iconMimeType;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getIdeaCardId() {
        return this.ideaCardId;
    }

    public final String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public final String getPrimaryLabel() {
        return this.primaryLabel;
    }

    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    public final IdeaCardExecutionState getServerExecutionState() {
        return IdeaCardExecutionState.Companion.fromBuildStatus(this.buildStatus);
    }

    public final IdeaSharing getSharing() {
        return this.sharing;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.connectionIds, AnonymousClass005.A0I(this.buildStatus, AnonymousClass005.A0I(this.actionLabel, AnonymousClass005.A0F(this.badges, (((((((((((((((((AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.title, AnonymousClass005.A0F(this.sharing, AnonymousClass001.A0G(this.ideaCardId)))) + AnonymousClass006.A0G(this.detailDescription)) * 31) + AnonymousClass006.A0G(this.fitReason)) * 31) + AnonymousClass006.A0G(this.buildSummary)) * 31) + AnonymousClass006.A0G(this.previewImageUrl)) * 31) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0G(this.iconMimeType)) * 31) + AnonymousClass006.A0G(this.primaryLabel)) * 31) + AnonymousClass006.A0G(this.secondaryLabel)) * 31) + AnonymousClass005.A0H(this.displayBadgeText)) * 31))));
    }

    public final IdeaCard copy(String str, IdeaSharing ideaSharing, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AHD<String> ahd, String str13, String str14, AHD<String> ahd2) {
        AnonymousClass005.A14(str, ideaSharing, str2, str3);
        AnonymousClass002.A1H(ahd, 13, str13);
        AnonymousClass003.A12(str14, ahd2);
        return new IdeaCard(str, ideaSharing, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, ahd, str13, str14, ahd2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCard(String str, IdeaSharing ideaSharing, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AHD ahd, String str13, String str14, AHD ahd2, int i, C06H c06h) {
        IdeaSharing ideaSharing2 = ideaSharing;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str13;
        AHD ahd3 = ahd;
        AHD ahd4 = ahd2;
        String str26 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = IdeaSharing.$stable;
            ideaSharing2 = new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null);
        }
        this(str26, ideaSharing2, (i & 4) != 0 ? "" : str15, (i & 8) != 0 ? "" : str16, (i & 16) != 0 ? null : str17, (i & 32) != 0 ? null : str18, (i & 64) != 0 ? null : str19, (i & 128) != 0 ? null : str20, (i & 256) != 0 ? null : str21, (i & 512) != 0 ? null : str22, (i & 1024) != 0 ? null : str23, (i & 2048) != 0 ? null : str24, (i & 4096) == 0 ? str12 : null, (i & 8192) != 0 ? AHI.A01 : ahd3, (i & 16384) != 0 ? "" : str25, (i & 32768) == 0 ? str14 : "", (i & 65536) != 0 ? AHI.A01 : ahd4);
    }

    public IdeaCard(String str, IdeaSharing ideaSharing, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, AHD<String> ahd, String str13, String str14, AHD<String> ahd2) {
        AnonymousClass005.A14(str, ideaSharing, str2, str3);
        AnonymousClass002.A1H(ahd, 13, str13);
        AnonymousClass003.A12(str14, ahd2);
        this.ideaCardId = str;
        this.sharing = ideaSharing;
        this.title = str2;
        this.summary = str3;
        this.detailDescription = str4;
        this.fitReason = str5;
        this.buildSummary = str6;
        this.previewImageUrl = str7;
        this.iconUrl = str8;
        this.iconMimeType = str9;
        this.primaryLabel = str10;
        this.secondaryLabel = str11;
        this.displayBadgeText = str12;
        this.badges = ahd;
        this.actionLabel = str13;
        this.buildStatus = str14;
        this.connectionIds = ahd2;
    }
}
