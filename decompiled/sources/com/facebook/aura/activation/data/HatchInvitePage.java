package com.facebook.aura.activation.data;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchInvitePage extends C06G {
    public final String code;
    public final HatchInviteGiftVideo giftVideo;
    public final boolean hasRedeemedInviteCode;
    public final String inviteLink;
    public final HatchRedeemInviteCodeCopy redeemScreen;
    public final HatchRedeemInviteCodeSuccessCopy redeemSuccessScreen;
    public final HatchInviteReward reward;
    public final String shareText;
    public final boolean showRedeemButton;
    public final boolean showsGift;
    public final HatchInviteState state;
    public final String storyShareText;
    public final String subtitle;
    public final String subtitleLinkText;
    public final String subtitleLinkUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchInvitePage) {
                HatchInvitePage hatchInvitePage = (HatchInvitePage) obj;
                if (this.state != hatchInvitePage.state || !C7384Etj.areEqual(this.subtitle, hatchInvitePage.subtitle) || !C7384Etj.areEqual(this.subtitleLinkText, hatchInvitePage.subtitleLinkText) || !C7384Etj.areEqual(this.subtitleLinkUrl, hatchInvitePage.subtitleLinkUrl) || this.hasRedeemedInviteCode != hatchInvitePage.hasRedeemedInviteCode || this.showRedeemButton != hatchInvitePage.showRedeemButton || !C7384Etj.areEqual(this.code, hatchInvitePage.code) || !C7384Etj.areEqual(this.inviteLink, hatchInvitePage.inviteLink) || !C7384Etj.areEqual(this.shareText, hatchInvitePage.shareText) || !C7384Etj.areEqual(this.storyShareText, hatchInvitePage.storyShareText) || this.showsGift != hatchInvitePage.showsGift || !C7384Etj.areEqual(this.reward, hatchInvitePage.reward) || !C7384Etj.areEqual(this.giftVideo, hatchInvitePage.giftVideo) || !C7384Etj.areEqual(this.redeemScreen, hatchInvitePage.redeemScreen) || !C7384Etj.areEqual(this.redeemSuccessScreen, hatchInvitePage.redeemSuccessScreen)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchInvitePage copy$default(HatchInvitePage hatchInvitePage, HatchInviteState hatchInviteState, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, boolean z3, HatchInviteReward hatchInviteReward, HatchInviteGiftVideo hatchInviteGiftVideo, HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy, HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        boolean z4 = z;
        boolean z5 = z2;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        boolean z6 = z3;
        HatchInviteReward hatchInviteReward2 = hatchInviteReward;
        HatchInviteGiftVideo hatchInviteGiftVideo2 = hatchInviteGiftVideo;
        HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy2 = hatchRedeemInviteCodeCopy;
        HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy2 = hatchRedeemInviteCodeSuccessCopy;
        if ((i & 1) != 0) {
            hatchInviteState = hatchInvitePage.state;
        }
        if ((i & 2) != 0) {
            str8 = hatchInvitePage.subtitle;
        }
        if ((i & 4) != 0) {
            str9 = hatchInvitePage.subtitleLinkText;
        }
        if ((i & 8) != 0) {
            str10 = hatchInvitePage.subtitleLinkUrl;
        }
        if ((i & 16) != 0) {
            z4 = hatchInvitePage.hasRedeemedInviteCode;
        }
        if ((i & 32) != 0) {
            z5 = hatchInvitePage.showRedeemButton;
        }
        if ((i & 64) != 0) {
            str11 = hatchInvitePage.code;
        }
        if ((i & 128) != 0) {
            str12 = hatchInvitePage.inviteLink;
        }
        if ((i & 256) != 0) {
            str13 = hatchInvitePage.shareText;
        }
        if ((i & 512) != 0) {
            str14 = hatchInvitePage.storyShareText;
        }
        if ((i & 1024) != 0) {
            z6 = hatchInvitePage.showsGift;
        }
        if ((i & 2048) != 0) {
            hatchInviteReward2 = hatchInvitePage.reward;
        }
        if ((i & 4096) != 0) {
            hatchInviteGiftVideo2 = hatchInvitePage.giftVideo;
        }
        if ((i & 8192) != 0) {
            hatchRedeemInviteCodeCopy2 = hatchInvitePage.redeemScreen;
        }
        if ((i & 16384) != 0) {
            hatchRedeemInviteCodeSuccessCopy2 = hatchInvitePage.redeemSuccessScreen;
        }
        String str15 = str8;
        return new HatchInvitePage(hatchInviteState, str15, str9, str10, z4, z5, str11, str12, str13, str14, z6, hatchInviteReward2, hatchInviteGiftVideo2, hatchRedeemInviteCodeCopy2, hatchRedeemInviteCodeSuccessCopy2);
    }

    public final HatchInviteState component1() {
        return this.state;
    }

    public final String component10() {
        return this.storyShareText;
    }

    public final boolean component11() {
        return this.showsGift;
    }

    public final HatchInviteReward component12() {
        return this.reward;
    }

    public final HatchInviteGiftVideo component13() {
        return this.giftVideo;
    }

    public final HatchRedeemInviteCodeCopy component14() {
        return this.redeemScreen;
    }

    public final HatchRedeemInviteCodeSuccessCopy component15() {
        return this.redeemSuccessScreen;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.subtitleLinkText;
    }

    public final String component4() {
        return this.subtitleLinkUrl;
    }

    public final boolean component5() {
        return this.hasRedeemedInviteCode;
    }

    public final boolean component6() {
        return this.showRedeemButton;
    }

    public final String component7() {
        return this.code;
    }

    public final String component8() {
        return this.inviteLink;
    }

    public final String component9() {
        return this.shareText;
    }

    public final HatchInvitePage copy(HatchInviteState hatchInviteState, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, boolean z3, HatchInviteReward hatchInviteReward, HatchInviteGiftVideo hatchInviteGiftVideo, HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy, HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy) {
        return new HatchInvitePage(hatchInviteState, str, str2, str3, z, z2, str4, str5, str6, str7, z3, hatchInviteReward, hatchInviteGiftVideo, hatchRedeemInviteCodeCopy, hatchRedeemInviteCodeSuccessCopy);
    }

    public final String getCode() {
        return this.code;
    }

    public final HatchInviteGiftVideo getGiftVideo() {
        return this.giftVideo;
    }

    public final boolean getHasRedeemedInviteCode() {
        return this.hasRedeemedInviteCode;
    }

    public final String getInviteLink() {
        return this.inviteLink;
    }

    public final HatchRedeemInviteCodeCopy getRedeemScreen() {
        return this.redeemScreen;
    }

    public final HatchRedeemInviteCodeSuccessCopy getRedeemSuccessScreen() {
        return this.redeemSuccessScreen;
    }

    public final HatchInviteReward getReward() {
        return this.reward;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final boolean getShowRedeemButton() {
        return this.showRedeemButton;
    }

    public final boolean getShowsGift() {
        return this.showsGift;
    }

    public final HatchInviteState getState() {
        return this.state;
    }

    public final String getStoryShareText() {
        return this.storyShareText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleLinkText() {
        return this.subtitleLinkText;
    }

    public final String getSubtitleLinkUrl() {
        return this.subtitleLinkUrl;
    }

    public int hashCode() {
        return ((((((C0KA.A01((((((((C0KA.A01(C0KA.A01(((((((AnonymousClass006.A0D(this.state) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.subtitleLinkText)) * 31) + AnonymousClass006.A0G(this.subtitleLinkUrl)) * 31, this.hasRedeemedInviteCode), this.showRedeemButton) + AnonymousClass006.A0G(this.code)) * 31) + AnonymousClass006.A0G(this.inviteLink)) * 31) + AnonymousClass006.A0G(this.shareText)) * 31) + AnonymousClass006.A0G(this.storyShareText)) * 31, this.showsGift) + AnonymousClass006.A0D(this.reward)) * 31) + AnonymousClass006.A0D(this.giftVideo)) * 31) + AnonymousClass006.A0D(this.redeemScreen)) * 31) + C3cH.A02(this.redeemSuccessScreen);
    }

    public HatchInvitePage(HatchInviteState hatchInviteState, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, boolean z3, HatchInviteReward hatchInviteReward, HatchInviteGiftVideo hatchInviteGiftVideo, HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy, HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy) {
        this.state = hatchInviteState;
        this.subtitle = str;
        this.subtitleLinkText = str2;
        this.subtitleLinkUrl = str3;
        this.hasRedeemedInviteCode = z;
        this.showRedeemButton = z2;
        this.code = str4;
        this.inviteLink = str5;
        this.shareText = str6;
        this.storyShareText = str7;
        this.showsGift = z3;
        this.reward = hatchInviteReward;
        this.giftVideo = hatchInviteGiftVideo;
        this.redeemScreen = hatchRedeemInviteCodeCopy;
        this.redeemSuccessScreen = hatchRedeemInviteCodeSuccessCopy;
    }

    public String toString() {
        return super.toString();
    }
}
