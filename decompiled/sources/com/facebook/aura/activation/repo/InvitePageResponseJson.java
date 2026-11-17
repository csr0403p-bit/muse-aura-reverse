package com.facebook.aura.activation.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.activation.data.HatchInviteGiftVideo;
import com.facebook.aura.activation.data.HatchInvitePage;
import com.facebook.aura.activation.data.HatchInviteReward;
import com.facebook.aura.activation.data.HatchInviteState;
import com.facebook.aura.activation.data.HatchRedeemInviteCodeCopy;
import com.facebook.aura.activation.data.HatchRedeemInviteCodeSuccessCopy;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class InvitePageResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String code;
    public final InviteGiftVideoJson gift_video;
    public final boolean has_redeemed_invite_code;
    public final String invite_link;
    public final String invite_state;
    public final RedeemInviteCodeScreenJson redeem_invite_code_screen;
    public final RedeemInviteCodeSuccessScreenJson redeem_invite_code_success_screen;
    public final InviteRewardJson reward;
    public final String share_text;
    public final boolean show_gift;
    public final boolean show_redeem_button;
    public final String story_share_text;
    public final String subtitle;
    public final String subtitle_link_text;
    public final String subtitle_link_url;
    public final String title;
    public final Integer uses_remaining;

    public final class Companion {
        public final C9hr<InvitePageResponseJson> serializer() {
            return InvitePageResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public InvitePageResponseJson() {
        this(null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(InvitePageResponseJson invitePageResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || invitePageResponseJson.invite_state != null) {
            c9j5.AAP(invitePageResponseJson.invite_state, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || invitePageResponseJson.title != null) {
            c9j5.AAP(invitePageResponseJson.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || invitePageResponseJson.subtitle != null) {
            c9j5.AAP(invitePageResponseJson.subtitle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || invitePageResponseJson.subtitle_link_text != null) {
            c9j5.AAP(invitePageResponseJson.subtitle_link_text, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || invitePageResponseJson.subtitle_link_url != null) {
            c9j5.AAP(invitePageResponseJson.subtitle_link_url, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || invitePageResponseJson.code != null) {
            c9j5.AAP(invitePageResponseJson.code, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || invitePageResponseJson.invite_link != null) {
            c9j5.AAP(invitePageResponseJson.invite_link, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || invitePageResponseJson.uses_remaining != null) {
            c9j5.AAP(invitePageResponseJson.uses_remaining, C07729ii.A00, c9iZ, 7);
        }
        if (zAfR || invitePageResponseJson.share_text != null) {
            c9j5.AAP(invitePageResponseJson.share_text, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || invitePageResponseJson.story_share_text != null) {
            c9j5.AAP(invitePageResponseJson.story_share_text, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || !invitePageResponseJson.show_gift) {
            c9j5.AA7(c9iZ, 10, invitePageResponseJson.show_gift);
        }
        if (zAfR || invitePageResponseJson.has_redeemed_invite_code) {
            c9j5.AA7(c9iZ, 11, invitePageResponseJson.has_redeemed_invite_code);
        }
        if (zAfR || invitePageResponseJson.show_redeem_button) {
            c9j5.AA7(c9iZ, 12, invitePageResponseJson.show_redeem_button);
        }
        if (zAfR || invitePageResponseJson.reward != null) {
            c9j5.AAP(invitePageResponseJson.reward, InviteRewardJson$$serializer.INSTANCE, c9iZ, 13);
        }
        if (zAfR || invitePageResponseJson.gift_video != null) {
            c9j5.AAP(invitePageResponseJson.gift_video, InviteGiftVideoJson$$serializer.INSTANCE, c9iZ, 14);
        }
        if (zAfR || invitePageResponseJson.redeem_invite_code_screen != null) {
            c9j5.AAP(invitePageResponseJson.redeem_invite_code_screen, RedeemInviteCodeScreenJson$$serializer.INSTANCE, c9iZ, 15);
        }
        if (zAfR || invitePageResponseJson.redeem_invite_code_success_screen != null) {
            c9j5.AAP(invitePageResponseJson.redeem_invite_code_success_screen, RedeemInviteCodeSuccessScreenJson$$serializer.INSTANCE, c9iZ, 16);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InvitePageResponseJson) {
                InvitePageResponseJson invitePageResponseJson = (InvitePageResponseJson) obj;
                if (!C7384Etj.areEqual(this.invite_state, invitePageResponseJson.invite_state) || !C7384Etj.areEqual(this.title, invitePageResponseJson.title) || !C7384Etj.areEqual(this.subtitle, invitePageResponseJson.subtitle) || !C7384Etj.areEqual(this.subtitle_link_text, invitePageResponseJson.subtitle_link_text) || !C7384Etj.areEqual(this.subtitle_link_url, invitePageResponseJson.subtitle_link_url) || !C7384Etj.areEqual(this.code, invitePageResponseJson.code) || !C7384Etj.areEqual(this.invite_link, invitePageResponseJson.invite_link) || !C7384Etj.areEqual(this.uses_remaining, invitePageResponseJson.uses_remaining) || !C7384Etj.areEqual(this.share_text, invitePageResponseJson.share_text) || !C7384Etj.areEqual(this.story_share_text, invitePageResponseJson.story_share_text) || this.show_gift != invitePageResponseJson.show_gift || this.has_redeemed_invite_code != invitePageResponseJson.has_redeemed_invite_code || this.show_redeem_button != invitePageResponseJson.show_redeem_button || !C7384Etj.areEqual(this.reward, invitePageResponseJson.reward) || !C7384Etj.areEqual(this.gift_video, invitePageResponseJson.gift_video) || !C7384Etj.areEqual(this.redeem_invite_code_screen, invitePageResponseJson.redeem_invite_code_screen) || !C7384Etj.areEqual(this.redeem_invite_code_success_screen, invitePageResponseJson.redeem_invite_code_success_screen)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ InvitePageResponseJson copy$default(InvitePageResponseJson invitePageResponseJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, boolean z, boolean z2, boolean z3, InviteRewardJson inviteRewardJson, InviteGiftVideoJson inviteGiftVideoJson, RedeemInviteCodeScreenJson redeemInviteCodeScreenJson, RedeemInviteCodeSuccessScreenJson redeemInviteCodeSuccessScreenJson, int i, Object obj) {
        String str10 = str5;
        String str11 = str6;
        String str12 = str7;
        Integer num2 = num;
        String str13 = str8;
        String str14 = str9;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        InviteRewardJson inviteRewardJson2 = inviteRewardJson;
        InviteGiftVideoJson inviteGiftVideoJson2 = inviteGiftVideoJson;
        RedeemInviteCodeScreenJson redeemInviteCodeScreenJson2 = redeemInviteCodeScreenJson;
        RedeemInviteCodeSuccessScreenJson redeemInviteCodeSuccessScreenJson2 = redeemInviteCodeSuccessScreenJson;
        if ((i & 1) != 0) {
            str = invitePageResponseJson.invite_state;
        }
        if ((i & 2) != 0) {
            str2 = invitePageResponseJson.title;
        }
        if ((i & 4) != 0) {
            str3 = invitePageResponseJson.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = invitePageResponseJson.subtitle_link_text;
        }
        if ((i & 16) != 0) {
            str10 = invitePageResponseJson.subtitle_link_url;
        }
        if ((i & 32) != 0) {
            str11 = invitePageResponseJson.code;
        }
        if ((i & 64) != 0) {
            str12 = invitePageResponseJson.invite_link;
        }
        if ((i & 128) != 0) {
            num2 = invitePageResponseJson.uses_remaining;
        }
        if ((i & 256) != 0) {
            str13 = invitePageResponseJson.share_text;
        }
        if ((i & 512) != 0) {
            str14 = invitePageResponseJson.story_share_text;
        }
        if ((i & 1024) != 0) {
            z4 = invitePageResponseJson.show_gift;
        }
        if ((i & 2048) != 0) {
            z5 = invitePageResponseJson.has_redeemed_invite_code;
        }
        if ((i & 4096) != 0) {
            z6 = invitePageResponseJson.show_redeem_button;
        }
        if ((i & 8192) != 0) {
            inviteRewardJson2 = invitePageResponseJson.reward;
        }
        if ((i & 16384) != 0) {
            inviteGiftVideoJson2 = invitePageResponseJson.gift_video;
        }
        if ((i & 32768) != 0) {
            redeemInviteCodeScreenJson2 = invitePageResponseJson.redeem_invite_code_screen;
        }
        if ((i & 65536) != 0) {
            redeemInviteCodeSuccessScreenJson2 = invitePageResponseJson.redeem_invite_code_success_screen;
        }
        return new InvitePageResponseJson(str, str2, str3, str4, str10, str11, str12, num2, str13, str14, z4, z5, z6, inviteRewardJson2, inviteGiftVideoJson2, redeemInviteCodeScreenJson2, redeemInviteCodeSuccessScreenJson2);
    }

    public final String component1() {
        return this.invite_state;
    }

    public final String component10() {
        return this.story_share_text;
    }

    public final boolean component11() {
        return this.show_gift;
    }

    public final boolean component12() {
        return this.has_redeemed_invite_code;
    }

    public final boolean component13() {
        return this.show_redeem_button;
    }

    public final InviteRewardJson component14() {
        return this.reward;
    }

    public final InviteGiftVideoJson component15() {
        return this.gift_video;
    }

    public final RedeemInviteCodeScreenJson component16() {
        return this.redeem_invite_code_screen;
    }

    public final RedeemInviteCodeSuccessScreenJson component17() {
        return this.redeem_invite_code_success_screen;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.subtitle_link_text;
    }

    public final String component5() {
        return this.subtitle_link_url;
    }

    public final String component6() {
        return this.code;
    }

    public final String component7() {
        return this.invite_link;
    }

    public final Integer component8() {
        return this.uses_remaining;
    }

    public final String component9() {
        return this.share_text;
    }

    public final InvitePageResponseJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, boolean z, boolean z2, boolean z3, InviteRewardJson inviteRewardJson, InviteGiftVideoJson inviteGiftVideoJson, RedeemInviteCodeScreenJson redeemInviteCodeScreenJson, RedeemInviteCodeSuccessScreenJson redeemInviteCodeSuccessScreenJson) {
        return new InvitePageResponseJson(str, str2, str3, str4, str5, str6, str7, num, str8, str9, z, z2, z3, inviteRewardJson, inviteGiftVideoJson, redeemInviteCodeScreenJson, redeemInviteCodeSuccessScreenJson);
    }

    public final String getCode() {
        return this.code;
    }

    public final InviteGiftVideoJson getGift_video() {
        return this.gift_video;
    }

    public final boolean getHas_redeemed_invite_code() {
        return this.has_redeemed_invite_code;
    }

    public final String getInvite_link() {
        return this.invite_link;
    }

    public final String getInvite_state() {
        return this.invite_state;
    }

    public final RedeemInviteCodeScreenJson getRedeem_invite_code_screen() {
        return this.redeem_invite_code_screen;
    }

    public final RedeemInviteCodeSuccessScreenJson getRedeem_invite_code_success_screen() {
        return this.redeem_invite_code_success_screen;
    }

    public final InviteRewardJson getReward() {
        return this.reward;
    }

    public final String getShare_text() {
        return this.share_text;
    }

    public final boolean getShow_gift() {
        return this.show_gift;
    }

    public final boolean getShow_redeem_button() {
        return this.show_redeem_button;
    }

    public final String getStory_share_text() {
        return this.story_share_text;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitle_link_text() {
        return this.subtitle_link_text;
    }

    public final String getSubtitle_link_url() {
        return this.subtitle_link_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getUses_remaining() {
        return this.uses_remaining;
    }

    public int hashCode() {
        return ((((((C0KA.A01(C0KA.A01(C0KA.A01(((((((((((((((((((AnonymousClass006.A0G(this.invite_state) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.subtitle_link_text)) * 31) + AnonymousClass006.A0G(this.subtitle_link_url)) * 31) + AnonymousClass006.A0G(this.code)) * 31) + AnonymousClass006.A0G(this.invite_link)) * 31) + AnonymousClass006.A0D(this.uses_remaining)) * 31) + AnonymousClass006.A0G(this.share_text)) * 31) + AnonymousClass006.A0G(this.story_share_text)) * 31, this.show_gift), this.has_redeemed_invite_code), this.show_redeem_button) + AnonymousClass006.A0D(this.reward)) * 31) + AnonymousClass006.A0D(this.gift_video)) * 31) + AnonymousClass006.A0D(this.redeem_invite_code_screen)) * 31) + C3cH.A02(this.redeem_invite_code_success_screen);
    }

    public final HatchInvitePage toDomain() {
        HatchRedeemInviteCodeCopy hatchRedeemInviteCodeCopy;
        int i;
        int i2;
        HatchInviteState inviteStateOrNull = AuraActivationRepositoryJsonKt.toInviteStateOrNull(this.invite_state);
        String str = this.subtitle;
        String str2 = this.subtitle_link_text;
        String str3 = this.subtitle_link_url;
        boolean z = this.has_redeemed_invite_code;
        boolean z2 = this.show_redeem_button;
        String str4 = this.code;
        String str5 = this.invite_link;
        String str6 = this.share_text;
        String str7 = this.story_share_text;
        boolean z3 = this.show_gift;
        InviteRewardJson inviteRewardJson = this.reward;
        HatchInviteReward hatchInviteReward = (inviteRewardJson == null || C7BY.A0j(inviteRewardJson.title) || C7BY.A0j(inviteRewardJson.body)) ? null : new HatchInviteReward(inviteRewardJson.title, inviteRewardJson.body);
        InviteGiftVideoJson inviteGiftVideoJson = this.gift_video;
        HatchInviteGiftVideo hatchInviteGiftVideo = (inviteGiftVideoJson == null || C7BY.A0j(inviteGiftVideoJson.url_light) || C7BY.A0j(inviteGiftVideoJson.url_dark) || (i = inviteGiftVideoJson.width) <= 0 || (i2 = inviteGiftVideoJson.height) <= 0) ? null : new HatchInviteGiftVideo(inviteGiftVideoJson.url_light, inviteGiftVideoJson.url_dark, i / i2);
        RedeemInviteCodeScreenJson redeemInviteCodeScreenJson = this.redeem_invite_code_screen;
        if (redeemInviteCodeScreenJson == null || C7BY.A0j(redeemInviteCodeScreenJson.subtitle)) {
            hatchRedeemInviteCodeCopy = null;
        } else {
            String str8 = redeemInviteCodeScreenJson.title;
            if (str8 == null || C7BY.A0j(str8)) {
                str8 = null;
            }
            hatchRedeemInviteCodeCopy = new HatchRedeemInviteCodeCopy(str8, redeemInviteCodeScreenJson.subtitle, redeemInviteCodeScreenJson.disclaimer);
        }
        RedeemInviteCodeSuccessScreenJson redeemInviteCodeSuccessScreenJson = this.redeem_invite_code_success_screen;
        return new HatchInvitePage(inviteStateOrNull, str, str2, str3, z, z2, str4, str5, str6, str7, z3, hatchInviteReward, hatchInviteGiftVideo, hatchRedeemInviteCodeCopy, (redeemInviteCodeSuccessScreenJson == null || C7BY.A0j(redeemInviteCodeSuccessScreenJson.title) || C7BY.A0j(redeemInviteCodeSuccessScreenJson.subtitle)) ? null : new HatchRedeemInviteCodeSuccessCopy(redeemInviteCodeSuccessScreenJson.title, redeemInviteCodeSuccessScreenJson.subtitle));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InvitePageResponseJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, boolean z, boolean z2, boolean z3, InviteRewardJson inviteRewardJson, InviteGiftVideoJson inviteGiftVideoJson, RedeemInviteCodeScreenJson redeemInviteCodeScreenJson, RedeemInviteCodeSuccessScreenJson redeemInviteCodeSuccessScreenJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.invite_state = null;
        } else {
            this.invite_state = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i & 8) == 0) {
            this.subtitle_link_text = null;
        } else {
            this.subtitle_link_text = str4;
        }
        if ((i & 16) == 0) {
            this.subtitle_link_url = null;
        } else {
            this.subtitle_link_url = str5;
        }
        if ((i & 32) == 0) {
            this.code = null;
        } else {
            this.code = str6;
        }
        if ((i & 64) == 0) {
            this.invite_link = null;
        } else {
            this.invite_link = str7;
        }
        if ((i & 128) == 0) {
            this.uses_remaining = null;
        } else {
            this.uses_remaining = num;
        }
        if ((i & 256) == 0) {
            this.share_text = null;
        } else {
            this.share_text = str8;
        }
        if ((i & 512) == 0) {
            this.story_share_text = null;
        } else {
            this.story_share_text = str9;
        }
        if ((i & 1024) == 0) {
            this.show_gift = true;
        } else {
            this.show_gift = z;
        }
        if ((i & 2048) == 0) {
            this.has_redeemed_invite_code = false;
        } else {
            this.has_redeemed_invite_code = z2;
        }
        if ((i & 4096) == 0) {
            this.show_redeem_button = false;
        } else {
            this.show_redeem_button = z3;
        }
        if ((i & 8192) == 0) {
            this.reward = null;
        } else {
            this.reward = inviteRewardJson;
        }
        if ((i & 16384) == 0) {
            this.gift_video = null;
        } else {
            this.gift_video = inviteGiftVideoJson;
        }
        if ((32768 & i) == 0) {
            this.redeem_invite_code_screen = null;
        } else {
            this.redeem_invite_code_screen = redeemInviteCodeScreenJson;
        }
        if ((i & 65536) == 0) {
            this.redeem_invite_code_success_screen = null;
        } else {
            this.redeem_invite_code_success_screen = redeemInviteCodeSuccessScreenJson;
        }
    }

    public /* synthetic */ InvitePageResponseJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, boolean z, boolean z2, boolean z3, InviteRewardJson inviteRewardJson, InviteGiftVideoJson inviteGiftVideoJson, RedeemInviteCodeScreenJson redeemInviteCodeScreenJson, RedeemInviteCodeSuccessScreenJson redeemInviteCodeSuccessScreenJson, int i, C06H c06h) {
        this(C3cG.A0e(str, i & 1), C3cG.A0e(str2, i & 2), C3cG.A0e(str3, i & 4), C3cG.A0e(str4, i & 8), C3cG.A0e(str5, i & 16), C3cG.A0e(str6, i & 32), C3cG.A0e(str7, i & 64), (i & 128) != 0 ? null : num, C3cG.A0e(str8, i & 256), C3cG.A0e(str9, i & 512), C60Q.A1Q(i & 1024, z), C3cG.A1K(i & 2048, z2), (i & 4096) == 0 ? z3 : false, (i & 8192) != 0 ? null : inviteRewardJson, (i & 16384) != 0 ? null : inviteGiftVideoJson, (i & 32768) != 0 ? null : redeemInviteCodeScreenJson, (i & 65536) != 0 ? null : redeemInviteCodeSuccessScreenJson);
    }

    public InvitePageResponseJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, boolean z, boolean z2, boolean z3, InviteRewardJson inviteRewardJson, InviteGiftVideoJson inviteGiftVideoJson, RedeemInviteCodeScreenJson redeemInviteCodeScreenJson, RedeemInviteCodeSuccessScreenJson redeemInviteCodeSuccessScreenJson) {
        this.invite_state = str;
        this.title = str2;
        this.subtitle = str3;
        this.subtitle_link_text = str4;
        this.subtitle_link_url = str5;
        this.code = str6;
        this.invite_link = str7;
        this.uses_remaining = num;
        this.share_text = str8;
        this.story_share_text = str9;
        this.show_gift = z;
        this.has_redeemed_invite_code = z2;
        this.show_redeem_button = z3;
        this.reward = inviteRewardJson;
        this.gift_video = inviteGiftVideoJson;
        this.redeem_invite_code_screen = redeemInviteCodeScreenJson;
        this.redeem_invite_code_success_screen = redeemInviteCodeSuccessScreenJson;
    }
}
