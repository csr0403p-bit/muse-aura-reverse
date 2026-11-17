package com.facebook.aura.explore.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.model.IdeaSharing;
import com.facebook.aura.model.IdeaSharingKind;

/* loaded from: classes.dex */
public final class IdeaCardDetail extends C06G {
    public final String actionLabel;
    public final AHD<String> badges;
    public final String buildSummary;
    public final AHD<String> connectionIds;
    public final String detailDescription;
    public final String fitReason;
    public final String iconMimeType;
    public final String iconUrl;
    public final String ideaCardId;
    public final AHD<IdeaCardItem> items;
    public final String previewImageUrl;
    public final String primaryLabel;
    public final String secondaryLabel;
    public final IdeaSharing sharing;
    public final String summary;
    public final String title;

    public IdeaCardDetail() {
        int i = IdeaSharing.$stable;
        IdeaSharing ideaSharing = new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null);
        AHI ahi = AHI.A01;
        this("", ideaSharing, "", "", null, null, null, null, null, null, null, null, ahi, "", ahi, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardDetail) {
                IdeaCardDetail ideaCardDetail = (IdeaCardDetail) obj;
                if (!C7384Etj.areEqual(this.ideaCardId, ideaCardDetail.ideaCardId) || !C7384Etj.areEqual(this.sharing, ideaCardDetail.sharing) || !C7384Etj.areEqual(this.title, ideaCardDetail.title) || !C7384Etj.areEqual(this.summary, ideaCardDetail.summary) || !C7384Etj.areEqual(this.detailDescription, ideaCardDetail.detailDescription) || !C7384Etj.areEqual(this.fitReason, ideaCardDetail.fitReason) || !C7384Etj.areEqual(this.buildSummary, ideaCardDetail.buildSummary) || !C7384Etj.areEqual(this.previewImageUrl, ideaCardDetail.previewImageUrl) || !C7384Etj.areEqual(this.iconUrl, ideaCardDetail.iconUrl) || !C7384Etj.areEqual(this.iconMimeType, ideaCardDetail.iconMimeType) || !C7384Etj.areEqual(this.primaryLabel, ideaCardDetail.primaryLabel) || !C7384Etj.areEqual(this.secondaryLabel, ideaCardDetail.secondaryLabel) || !C7384Etj.areEqual(this.badges, ideaCardDetail.badges) || !C7384Etj.areEqual(this.actionLabel, ideaCardDetail.actionLabel) || !C7384Etj.areEqual(this.items, ideaCardDetail.items) || !C7384Etj.areEqual(this.connectionIds, ideaCardDetail.connectionIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardDetail copy$default(IdeaCardDetail ideaCardDetail, String str, IdeaSharing ideaSharing, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, AHD ahd, String str12, AHD ahd2, AHD ahd3, int i, Object obj) {
        String str13 = str;
        IdeaSharing ideaSharing2 = ideaSharing;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        String str23 = str11;
        AHD ahd4 = ahd;
        String str24 = str12;
        AHD ahd5 = ahd2;
        AHD ahd6 = ahd3;
        if ((i & 1) != 0) {
            str13 = ideaCardDetail.ideaCardId;
        }
        if ((i & 2) != 0) {
            ideaSharing2 = ideaCardDetail.sharing;
        }
        if ((i & 4) != 0) {
            str14 = ideaCardDetail.title;
        }
        if ((i & 8) != 0) {
            str15 = ideaCardDetail.summary;
        }
        if ((i & 16) != 0) {
            str16 = ideaCardDetail.detailDescription;
        }
        if ((i & 32) != 0) {
            str17 = ideaCardDetail.fitReason;
        }
        if ((i & 64) != 0) {
            str18 = ideaCardDetail.buildSummary;
        }
        if ((i & 128) != 0) {
            str19 = ideaCardDetail.previewImageUrl;
        }
        if ((i & 256) != 0) {
            str20 = ideaCardDetail.iconUrl;
        }
        if ((i & 512) != 0) {
            str21 = ideaCardDetail.iconMimeType;
        }
        if ((i & 1024) != 0) {
            str22 = ideaCardDetail.primaryLabel;
        }
        if ((i & 2048) != 0) {
            str23 = ideaCardDetail.secondaryLabel;
        }
        if ((i & 4096) != 0) {
            ahd4 = ideaCardDetail.badges;
        }
        if ((i & 8192) != 0) {
            str24 = ideaCardDetail.actionLabel;
        }
        if ((i & 16384) != 0) {
            ahd5 = ideaCardDetail.items;
        }
        if ((i & 32768) != 0) {
            ahd6 = ideaCardDetail.connectionIds;
        }
        String str25 = str15;
        return ideaCardDetail.copy(str13, ideaSharing2, str14, str25, str16, str17, str18, str19, str20, str21, str22, str23, ahd4, str24, ahd5, ahd6);
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

    public final AHD<String> component13() {
        return this.badges;
    }

    public final String component14() {
        return this.actionLabel;
    }

    public final AHD<IdeaCardItem> component15() {
        return this.items;
    }

    public final AHD<String> component16() {
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

    public final String getBuildSummary() {
        return this.buildSummary;
    }

    public final AHD<String> getConnectionIds() {
        return this.connectionIds;
    }

    public final String getDetailDescription() {
        return this.detailDescription;
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

    public final AHD<IdeaCardItem> getItems() {
        return this.items;
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
        return AnonymousClass005.A0F(this.items, AnonymousClass005.A0I(this.actionLabel, AnonymousClass005.A0F(this.badges, (((((((((((((((AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.title, AnonymousClass005.A0F(this.sharing, AnonymousClass001.A0G(this.ideaCardId)))) + AnonymousClass006.A0G(this.detailDescription)) * 31) + AnonymousClass006.A0G(this.fitReason)) * 31) + AnonymousClass006.A0G(this.buildSummary)) * 31) + AnonymousClass006.A0G(this.previewImageUrl)) * 31) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0G(this.iconMimeType)) * 31) + AnonymousClass006.A0G(this.primaryLabel)) * 31) + AnonymousClass006.A0G(this.secondaryLabel)) * 31))) + C06G.A04(this.connectionIds);
    }

    public final IdeaCardDetail copy(String str, IdeaSharing ideaSharing, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, AHD<String> ahd, String str12, AHD<IdeaCardItem> ahd2, AHD<String> ahd3) {
        AnonymousClass005.A14(str, ideaSharing, str2, str3);
        AnonymousClass003.A11(ahd, str12);
        C7384Etj.A0Y(ahd2, 14);
        return new IdeaCardDetail(str, ideaSharing, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, ahd, str12, ahd2, ahd3);
    }

    public String toString() {
        return super.toString();
    }

    public IdeaCardDetail(String str, IdeaSharing ideaSharing, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, AHD<String> ahd, String str12, AHD<IdeaCardItem> ahd2, AHD<String> ahd3) {
        AnonymousClass005.A14(str, ideaSharing, str2, str3);
        AnonymousClass003.A11(ahd, str12);
        C7384Etj.A0Y(ahd2, 14);
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
        this.badges = ahd;
        this.actionLabel = str12;
        this.items = ahd2;
        this.connectionIds = ahd3;
    }

    public /* synthetic */ IdeaCardDetail(String str, IdeaSharing ideaSharing, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, AHD ahd, String str12, AHD ahd2, AHD ahd3, int i, C06H c06h) {
        IdeaSharing ideaSharing2 = ideaSharing;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        String str22 = str11;
        AHD ahd4 = ahd3;
        AHD ahd5 = ahd;
        AHD ahd6 = ahd2;
        String str23 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = IdeaSharing.$stable;
            ideaSharing2 = new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null);
        }
        this(str23, ideaSharing2, (i & 4) != 0 ? "" : str13, (i & 8) != 0 ? "" : str14, (i & 16) != 0 ? null : str15, (i & 32) != 0 ? null : str16, (i & 64) != 0 ? null : str17, (i & 128) != 0 ? null : str18, (i & 256) != 0 ? null : str19, (i & 512) != 0 ? null : str20, (i & 1024) != 0 ? null : str21, (i & 2048) != 0 ? null : str22, (i & 4096) != 0 ? AHI.A01 : ahd5, (i & 8192) == 0 ? str12 : "", (i & 16384) != 0 ? AHI.A01 : ahd6, (i & 32768) != 0 ? null : ahd4);
    }
}
