package com.facebook.aura.feed.repo;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import com.facebook.aura.feed.repo.FeedAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class FeedUnitJson extends C06G {
    public static final int $stable = 0;
    public final FeedAttachmentJson attachment;
    public final String body_md;
    public final String category;
    public final String connector_attribution;
    public final int discuss_count;
    public final long edition_generated_at_ms;
    public final String edition_kind;
    public final String edition_local_date;
    public final String emoji;
    public final String icon_url;
    public final FeedIdeaActionJson idea_action;
    public final boolean is_reflective;
    public final String kicker;
    public final String origin;
    public final int position;
    public final String prompt_id;
    public final String reaction;
    public final String run_id;
    public final Long seen_at_ms;
    public final List<FeedStatJson> stats;
    public final String title;
    public final String unit_id;
    public final String why_did_i_see_this;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, FeedUnitJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null, null, null};

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C9hr<FeedUnitJson> serializer() {
            return FeedUnitJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FeedUnitJson() {
        this("", null, "", "", "", 0L, 0, "", null, "", null, "", null, false, C0881AGi.A00, null, 0, "", null, null, null, null, null);
    }

    public final FeedUnitJson copy(String str, String str2, String str3, String str4, String str5, long j, int i, String str6, String str7, String str8, FeedAttachmentJson feedAttachmentJson, String str9, String str10, boolean z, List<FeedStatJson> list, String str11, int i2, String str12, Long l, String str13, String str14, String str15, FeedIdeaActionJson feedIdeaActionJson) {
        AnonymousClass005.A11(str, str3, str4, 0);
        C7384Etj.A0Y(str5, 4);
        AnonymousClass002.A1F(str6, 7, str8);
        AnonymousClass002.A1H(str9, 11, list);
        C7384Etj.A0Y(str12, 17);
        return new FeedUnitJson(str, str2, str3, str4, str5, j, i, str6, str7, str8, feedAttachmentJson, str9, str10, z, list, str11, i2, str12, l, str13, str14, str15, feedIdeaActionJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedUnitJson) {
                FeedUnitJson feedUnitJson = (FeedUnitJson) obj;
                if (!C7384Etj.areEqual(this.unit_id, feedUnitJson.unit_id) || !C7384Etj.areEqual(this.prompt_id, feedUnitJson.prompt_id) || !C7384Etj.areEqual(this.run_id, feedUnitJson.run_id) || !C7384Etj.areEqual(this.edition_kind, feedUnitJson.edition_kind) || !C7384Etj.areEqual(this.edition_local_date, feedUnitJson.edition_local_date) || this.edition_generated_at_ms != feedUnitJson.edition_generated_at_ms || this.position != feedUnitJson.position || !C7384Etj.areEqual(this.kicker, feedUnitJson.kicker) || !C7384Etj.areEqual(this.title, feedUnitJson.title) || !C7384Etj.areEqual(this.body_md, feedUnitJson.body_md) || !C7384Etj.areEqual(this.attachment, feedUnitJson.attachment) || !C7384Etj.areEqual(this.category, feedUnitJson.category) || !C7384Etj.areEqual(this.connector_attribution, feedUnitJson.connector_attribution) || this.is_reflective != feedUnitJson.is_reflective || !C7384Etj.areEqual(this.stats, feedUnitJson.stats) || !C7384Etj.areEqual(this.reaction, feedUnitJson.reaction) || this.discuss_count != feedUnitJson.discuss_count || !C7384Etj.areEqual(this.origin, feedUnitJson.origin) || !C7384Etj.areEqual(this.seen_at_ms, feedUnitJson.seen_at_ms) || !C7384Etj.areEqual(this.why_did_i_see_this, feedUnitJson.why_did_i_see_this) || !C7384Etj.areEqual(this.emoji, feedUnitJson.emoji) || !C7384Etj.areEqual(this.icon_url, feedUnitJson.icon_url) || !C7384Etj.areEqual(this.idea_action, feedUnitJson.idea_action)) {
                }
            }
            return false;
        }
        return true;
    }

    public final FeedUnit toDomain(String str, Long l, boolean z) {
        String strA0l;
        String strA0l2;
        String strA0l3;
        FeedAttachment domain;
        FeedUnit feedWidgetUnit;
        C7384Etj.A0Y(str, 0);
        String str2 = this.unit_id;
        String str3 = this.prompt_id;
        if (str3 == null || str3.length() <= 0) {
            str3 = null;
        }
        String str4 = this.run_id;
        FeedEditionKind feedEditionKindFromWire = FeedEditionKind.Companion.fromWire(this.edition_kind);
        String str5 = this.edition_local_date;
        long j = this.edition_generated_at_ms;
        long jLongValue = 0;
        if (j > 0) {
            jLongValue = j;
        } else if (l != null) {
            jLongValue = l.longValue();
        }
        int i = this.position;
        String str6 = this.kicker;
        String str7 = this.title;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = this.body_md;
        String str9 = this.category;
        String str10 = this.connector_attribution;
        if (str10 == null || str10.length() <= 0) {
            str10 = null;
        }
        boolean z2 = this.is_reflective;
        List<FeedStatJson> list = this.stats;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<FeedStatJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        AHD ahdA07 = AGI.A07(arrayListA0i);
        FeedReaction reaction = FeedApiJsonKt.toReaction(this.reaction);
        int i2 = this.discuss_count;
        FeedUnitOrigin origin = FeedApiJsonKt.toOrigin(this.origin);
        Long l2 = this.seen_at_ms;
        FeedAttachmentJson feedAttachmentJson = this.attachment;
        FeedSocialEmbed socialEmbed = feedAttachmentJson != null ? feedAttachmentJson.toSocialEmbed() : null;
        FeedAttachmentJson feedAttachmentJson2 = this.attachment;
        FeedVideo video = feedAttachmentJson2 != null ? feedAttachmentJson2.toVideo() : null;
        String str11 = this.why_did_i_see_this;
        if (str11 == null || (strA0l = AnonymousClass002.A0l(str11)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        String str12 = this.emoji;
        if (str12 == null || (strA0l2 = AnonymousClass002.A0l(str12)) == null || strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        String str13 = this.icon_url;
        if (str13 == null || (strA0l3 = AnonymousClass002.A0l(str13)) == null || strA0l3.length() <= 0) {
            strA0l3 = null;
        }
        FeedIdeaActionJson feedIdeaActionJson = this.idea_action;
        FeedUnitContent feedUnitContent = new FeedUnitContent(str2, str3, str4, feedEditionKindFromWire, str5, jLongValue, i, str6, str7, str8, str9, str10, z2, ahdA07, reaction, i2, origin, l2, str, z, socialEmbed, video, strA0l, strA0l2, strA0l3, feedIdeaActionJson != null ? feedIdeaActionJson.toDomain() : null, null);
        FeedAttachmentJson feedAttachmentJson3 = this.attachment;
        if (feedAttachmentJson3 == null || (domain = feedAttachmentJson3.toDomain()) == null) {
            domain = FeedAttachment.None.INSTANCE;
        }
        if (C7384Etj.areEqual(domain, FeedAttachment.None.INSTANCE)) {
            return new FeedTextUnit(feedUnitContent);
        }
        if (domain instanceof FeedAttachment.HeroImage) {
            feedWidgetUnit = new FeedHeroImageUnit(feedUnitContent, (FeedAttachment.HeroImage) domain);
        } else if (domain instanceof FeedAttachment.Carousel) {
            feedWidgetUnit = new FeedCarouselUnit(feedUnitContent, (FeedAttachment.Carousel) domain);
        } else {
            if (!(domain instanceof FeedAttachment.Widget)) {
                throw new NoWhenBranchMatchedException();
            }
            feedWidgetUnit = new FeedWidgetUnit(feedUnitContent, (FeedAttachment.Widget) domain);
        }
        return feedWidgetUnit;
    }

    public static /* synthetic */ FeedUnit toDomain$default(FeedUnitJson feedUnitJson, String str, Long l, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            l = null;
        }
        return feedUnitJson.toDomain(str, l, AnonymousClass005.A1O(i, z));
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedUnitJson feedUnitJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(feedUnitJson.unit_id)) {
            c9j5.AAV(feedUnitJson.unit_id, c9iZ, 0);
        }
        if (zAfR || feedUnitJson.prompt_id != null) {
            c9j5.AAP(feedUnitJson.prompt_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"".equals(feedUnitJson.run_id)) {
            c9j5.AAV(feedUnitJson.run_id, c9iZ, 2);
        }
        if (zAfR || !"".equals(feedUnitJson.edition_kind)) {
            c9j5.AAV(feedUnitJson.edition_kind, c9iZ, 3);
        }
        if (zAfR || !"".equals(feedUnitJson.edition_local_date)) {
            c9j5.AAV(feedUnitJson.edition_local_date, c9iZ, 4);
        }
        if (zAfR || feedUnitJson.edition_generated_at_ms != 0) {
            c9j5.AAN(c9iZ, 5, feedUnitJson.edition_generated_at_ms);
        }
        if (zAfR || feedUnitJson.position != 0) {
            c9j5.AAK(c9iZ, 6, feedUnitJson.position);
        }
        if (zAfR || !"".equals(feedUnitJson.kicker)) {
            c9j5.AAV(feedUnitJson.kicker, c9iZ, 7);
        }
        if (zAfR || feedUnitJson.title != null) {
            c9j5.AAP(feedUnitJson.title, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || !"".equals(feedUnitJson.body_md)) {
            c9j5.AAV(feedUnitJson.body_md, c9iZ, 9);
        }
        if (zAfR || feedUnitJson.attachment != null) {
            c9j5.AAP(feedUnitJson.attachment, FeedAttachmentJson$$serializer.INSTANCE, c9iZ, 10);
        }
        if (zAfR || !"".equals(feedUnitJson.category)) {
            c9j5.AAV(feedUnitJson.category, c9iZ, 11);
        }
        if (zAfR || feedUnitJson.connector_attribution != null) {
            c9j5.AAP(feedUnitJson.connector_attribution, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || feedUnitJson.is_reflective) {
            c9j5.AA7(c9iZ, 13, feedUnitJson.is_reflective);
        }
        if (zAfR || !C7384Etj.areEqual(feedUnitJson.stats, C0881AGi.A00)) {
            c9j5.AAQ(feedUnitJson.stats, C06G.A0e(f0cArr, 14), c9iZ, 14);
        }
        if (zAfR || feedUnitJson.reaction != null) {
            c9j5.AAP(feedUnitJson.reaction, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || feedUnitJson.discuss_count != 0) {
            c9j5.AAK(c9iZ, 16, feedUnitJson.discuss_count);
        }
        if (zAfR || !"".equals(feedUnitJson.origin)) {
            c9j5.AAV(feedUnitJson.origin, c9iZ, 17);
        }
        if (zAfR || feedUnitJson.seen_at_ms != null) {
            c9j5.AAP(feedUnitJson.seen_at_ms, C9j1.A00, c9iZ, 18);
        }
        if (zAfR || feedUnitJson.why_did_i_see_this != null) {
            c9j5.AAP(feedUnitJson.why_did_i_see_this, C07779iq.A01, c9iZ, 19);
        }
        if (zAfR || feedUnitJson.emoji != null) {
            c9j5.AAP(feedUnitJson.emoji, C07779iq.A01, c9iZ, 20);
        }
        if (zAfR || feedUnitJson.icon_url != null) {
            c9j5.AAP(feedUnitJson.icon_url, C07779iq.A01, c9iZ, 21);
        }
        if (zAfR || feedUnitJson.idea_action != null) {
            c9j5.AAP(feedUnitJson.idea_action, FeedIdeaActionJson$$serializer.INSTANCE, c9iZ, 22);
        }
    }

    public final String component1() {
        return this.unit_id;
    }

    public final String component10() {
        return this.body_md;
    }

    public final FeedAttachmentJson component11() {
        return this.attachment;
    }

    public final String component12() {
        return this.category;
    }

    public final String component13() {
        return this.connector_attribution;
    }

    public final boolean component14() {
        return this.is_reflective;
    }

    public final List<FeedStatJson> component15() {
        return this.stats;
    }

    public final String component16() {
        return this.reaction;
    }

    public final int component17() {
        return this.discuss_count;
    }

    public final String component18() {
        return this.origin;
    }

    public final Long component19() {
        return this.seen_at_ms;
    }

    public final String component2() {
        return this.prompt_id;
    }

    public final String component20() {
        return this.why_did_i_see_this;
    }

    public final String component21() {
        return this.emoji;
    }

    public final String component22() {
        return this.icon_url;
    }

    public final FeedIdeaActionJson component23() {
        return this.idea_action;
    }

    public final String component3() {
        return this.run_id;
    }

    public final String component4() {
        return this.edition_kind;
    }

    public final String component5() {
        return this.edition_local_date;
    }

    public final long component6() {
        return this.edition_generated_at_ms;
    }

    public final int component7() {
        return this.position;
    }

    public final String component8() {
        return this.kicker;
    }

    public final String component9() {
        return this.title;
    }

    public final FeedAttachmentJson getAttachment() {
        return this.attachment;
    }

    public final String getBody_md() {
        return this.body_md;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getConnector_attribution() {
        return this.connector_attribution;
    }

    public final int getDiscuss_count() {
        return this.discuss_count;
    }

    public final long getEdition_generated_at_ms() {
        return this.edition_generated_at_ms;
    }

    public final String getEdition_kind() {
        return this.edition_kind;
    }

    public final String getEdition_local_date() {
        return this.edition_local_date;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final FeedIdeaActionJson getIdea_action() {
        return this.idea_action;
    }

    public final String getKicker() {
        return this.kicker;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getPrompt_id() {
        return this.prompt_id;
    }

    public final String getReaction() {
        return this.reaction;
    }

    public final String getRun_id() {
        return this.run_id;
    }

    public final Long getSeen_at_ms() {
        return this.seen_at_ms;
    }

    public final List<FeedStatJson> getStats() {
        return this.stats;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUnit_id() {
        return this.unit_id;
    }

    public final String getWhy_did_i_see_this() {
        return this.why_did_i_see_this;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.origin, (((AnonymousClass005.A0F(this.stats, C0KA.A01((AnonymousClass005.A0I(this.category, (AnonymousClass005.A0I(this.body_md, (AnonymousClass005.A0I(this.kicker, (AnonymousClass006.A06(this.edition_generated_at_ms, AnonymousClass005.A0I(this.edition_local_date, AnonymousClass005.A0I(this.edition_kind, AnonymousClass005.A0I(this.run_id, (AnonymousClass001.A0G(this.unit_id) + AnonymousClass006.A0G(this.prompt_id)) * 31)))) + this.position) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0D(this.attachment)) * 31) + AnonymousClass006.A0G(this.connector_attribution)) * 31, this.is_reflective)) + AnonymousClass006.A0G(this.reaction)) * 31) + this.discuss_count) * 31) + AnonymousClass006.A0D(this.seen_at_ms)) * 31) + AnonymousClass006.A0G(this.why_did_i_see_this)) * 31) + AnonymousClass006.A0G(this.emoji)) * 31) + AnonymousClass006.A0G(this.icon_url)) * 31) + C06G.A04(this.idea_action);
    }

    public final boolean is_reflective() {
        return this.is_reflective;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ FeedUnitJson copy$default(FeedUnitJson feedUnitJson, String str, String str2, String str3, String str4, String str5, long j, int i, String str6, String str7, String str8, FeedAttachmentJson feedAttachmentJson, String str9, String str10, boolean z, List list, String str11, int i2, String str12, Long l, String str13, String str14, String str15, FeedIdeaActionJson feedIdeaActionJson, int i3, Object obj) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        long j2 = j;
        int i4 = i;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        FeedAttachmentJson feedAttachmentJson2 = feedAttachmentJson;
        String str24 = str9;
        String str25 = str10;
        boolean z2 = z;
        List list2 = list;
        int i5 = i2;
        Long l2 = l;
        String str26 = str13;
        String str27 = str14;
        String str28 = str15;
        String str29 = str11;
        String str30 = str12;
        FeedIdeaActionJson feedIdeaActionJson2 = feedIdeaActionJson;
        if ((i3 & 1) != 0) {
            str16 = feedUnitJson.unit_id;
        }
        if ((i3 & 2) != 0) {
            str17 = feedUnitJson.prompt_id;
        }
        if ((i3 & 4) != 0) {
            str18 = feedUnitJson.run_id;
        }
        if ((i3 & 8) != 0) {
            str19 = feedUnitJson.edition_kind;
        }
        if ((i3 & 16) != 0) {
            str20 = feedUnitJson.edition_local_date;
        }
        if ((i3 & 32) != 0) {
            j2 = feedUnitJson.edition_generated_at_ms;
        }
        if ((i3 & 64) != 0) {
            i4 = feedUnitJson.position;
        }
        if ((i3 & 128) != 0) {
            str21 = feedUnitJson.kicker;
        }
        if ((i3 & 256) != 0) {
            str22 = feedUnitJson.title;
        }
        if ((i3 & 512) != 0) {
            str23 = feedUnitJson.body_md;
        }
        if ((i3 & 1024) != 0) {
            feedAttachmentJson2 = feedUnitJson.attachment;
        }
        if ((i3 & 2048) != 0) {
            str24 = feedUnitJson.category;
        }
        if ((i3 & 4096) != 0) {
            str25 = feedUnitJson.connector_attribution;
        }
        if ((i3 & 8192) != 0) {
            z2 = feedUnitJson.is_reflective;
        }
        if ((i3 & 16384) != 0) {
            list2 = feedUnitJson.stats;
        }
        if ((i3 & 32768) != 0) {
            str29 = feedUnitJson.reaction;
        }
        if ((i3 & 65536) != 0) {
            i5 = feedUnitJson.discuss_count;
        }
        if ((i3 & 131072) != 0) {
            str30 = feedUnitJson.origin;
        }
        if ((i3 & 262144) != 0) {
            l2 = feedUnitJson.seen_at_ms;
        }
        if ((i3 & 524288) != 0) {
            str26 = feedUnitJson.why_did_i_see_this;
        }
        if ((i3 & 1048576) != 0) {
            str27 = feedUnitJson.emoji;
        }
        if ((i3 & 2097152) != 0) {
            str28 = feedUnitJson.icon_url;
        }
        if ((i3 & 4194304) != 0) {
            feedIdeaActionJson2 = feedUnitJson.idea_action;
        }
        String str31 = str25;
        return feedUnitJson.copy(str16, str17, str18, str19, str20, j2, i4, str21, str22, str23, feedAttachmentJson2, str24, str31, z2, list2, str29, i5, str30, l2, str26, str27, str28, feedIdeaActionJson2);
    }

    public FeedUnitJson(String str, String str2, String str3, String str4, String str5, long j, int i, String str6, String str7, String str8, FeedAttachmentJson feedAttachmentJson, String str9, String str10, boolean z, List<FeedStatJson> list, String str11, int i2, String str12, Long l, String str13, String str14, String str15, FeedIdeaActionJson feedIdeaActionJson) {
        AnonymousClass005.A11(str, str3, str4, 0);
        C7384Etj.A0Y(str5, 4);
        AnonymousClass002.A1F(str6, 7, str8);
        AnonymousClass002.A1H(str9, 11, list);
        C7384Etj.A0Y(str12, 17);
        this.unit_id = str;
        this.prompt_id = str2;
        this.run_id = str3;
        this.edition_kind = str4;
        this.edition_local_date = str5;
        this.edition_generated_at_ms = j;
        this.position = i;
        this.kicker = str6;
        this.title = str7;
        this.body_md = str8;
        this.attachment = feedAttachmentJson;
        this.category = str9;
        this.connector_attribution = str10;
        this.is_reflective = z;
        this.stats = list;
        this.reaction = str11;
        this.discuss_count = i2;
        this.origin = str12;
        this.seen_at_ms = l;
        this.why_did_i_see_this = str13;
        this.emoji = str14;
        this.icon_url = str15;
        this.idea_action = feedIdeaActionJson;
    }

    public /* synthetic */ FeedUnitJson(int i, String str, String str2, String str3, String str4, String str5, long j, int i2, String str6, String str7, String str8, FeedAttachmentJson feedAttachmentJson, String str9, String str10, boolean z, List list, String str11, int i3, String str12, Long l, String str13, String str14, String str15, FeedIdeaActionJson feedIdeaActionJson, C2hx c2hx) {
        List list2 = list;
        if ((i & 1) == 0) {
            this.unit_id = "";
        } else {
            this.unit_id = str;
        }
        if ((i & 2) == 0) {
            this.prompt_id = null;
        } else {
            this.prompt_id = str2;
        }
        if ((i & 4) == 0) {
            this.run_id = "";
        } else {
            this.run_id = str3;
        }
        if ((i & 8) == 0) {
            this.edition_kind = "";
        } else {
            this.edition_kind = str4;
        }
        if ((i & 16) == 0) {
            this.edition_local_date = "";
        } else {
            this.edition_local_date = str5;
        }
        if ((i & 32) == 0) {
            this.edition_generated_at_ms = 0L;
        } else {
            this.edition_generated_at_ms = j;
        }
        if ((i & 64) == 0) {
            this.position = 0;
        } else {
            this.position = i2;
        }
        if ((i & 128) == 0) {
            this.kicker = "";
        } else {
            this.kicker = str6;
        }
        if ((i & 256) == 0) {
            this.title = null;
        } else {
            this.title = str7;
        }
        if ((i & 512) == 0) {
            this.body_md = "";
        } else {
            this.body_md = str8;
        }
        if ((i & 1024) == 0) {
            this.attachment = null;
        } else {
            this.attachment = feedAttachmentJson;
        }
        if ((i & 2048) == 0) {
            this.category = "";
        } else {
            this.category = str9;
        }
        if ((i & 4096) == 0) {
            this.connector_attribution = null;
        } else {
            this.connector_attribution = str10;
        }
        if ((i & 8192) == 0) {
            this.is_reflective = false;
        } else {
            this.is_reflective = z;
        }
        this.stats = (i & 16384) == 0 ? C0881AGi.A00 : list2;
        if ((32768 & i) == 0) {
            this.reaction = null;
        } else {
            this.reaction = str11;
        }
        if ((65536 & i) == 0) {
            this.discuss_count = 0;
        } else {
            this.discuss_count = i3;
        }
        if ((131072 & i) == 0) {
            this.origin = "";
        } else {
            this.origin = str12;
        }
        if ((262144 & i) == 0) {
            this.seen_at_ms = null;
        } else {
            this.seen_at_ms = l;
        }
        if ((524288 & i) == 0) {
            this.why_did_i_see_this = null;
        } else {
            this.why_did_i_see_this = str13;
        }
        if ((1048576 & i) == 0) {
            this.emoji = null;
        } else {
            this.emoji = str14;
        }
        if ((2097152 & i) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str15;
        }
        if ((i & 4194304) == 0) {
            this.idea_action = null;
        } else {
            this.idea_action = feedIdeaActionJson;
        }
    }

    public /* synthetic */ FeedUnitJson(String str, String str2, String str3, String str4, String str5, long j, int i, String str6, String str7, String str8, FeedAttachmentJson feedAttachmentJson, String str9, String str10, boolean z, List list, String str11, int i2, String str12, Long l, String str13, String str14, String str15, FeedIdeaActionJson feedIdeaActionJson, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? 0L : j, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? null : feedAttachmentJson, (i3 & 2048) != 0 ? "" : str9, (i3 & 4096) != 0 ? null : str10, (i3 & 8192) != 0 ? false : z, (i3 & 16384) != 0 ? C0881AGi.A00 : list, (i3 & 32768) != 0 ? null : str11, (i3 & 65536) != 0 ? 0 : i2, (i3 & 131072) == 0 ? str12 : "", (i3 & 262144) != 0 ? null : l, (i3 & 524288) != 0 ? null : str13, (i3 & 1048576) != 0 ? null : str14, (i3 & 2097152) != 0 ? null : str15, (i3 & 4194304) != 0 ? null : feedIdeaActionJson);
    }
}
