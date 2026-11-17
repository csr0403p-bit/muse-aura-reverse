package com.facebook.aura.feed.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C60R;
import X.C7384Etj;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;

/* loaded from: classes6.dex */
public final class FeedUnitContent extends C06G {
    public static final int $stable = 0;
    public final String bodyMarkdown;
    public final String category;
    public final String connectorAttribution;
    public final int discussCount;
    public final long editionGeneratedAtMs;
    public final FeedEditionKind editionKind;
    public final String editionLocalDate;
    public final String editionTitle;
    public final String emoji;
    public final String iconUrl;
    public final String id;
    public final FeedIdeaAction ideaAction;
    public final boolean isEditionStart;
    public final boolean isReflective;
    public final String kicker;
    public final FeedUnitOrigin origin;
    public final int position;
    public final FeedPostMetadata postMetadata;
    public final String promptId;
    public final FeedReaction reaction;
    public final String runId;
    public final Long seenAtMs;
    public final FeedSocialEmbed socialEmbed;
    public final AHD<FeedStat> stats;
    public final String title;
    public final FeedVideo video;
    public final String whyDidISeeThis;

    public final FeedUnitContent copy(String str, String str2, String str3, FeedEditionKind feedEditionKind, String str4, long j, int i, String str5, String str6, String str7, String str8, String str9, boolean z, AHD<FeedStat> ahd, FeedReaction feedReaction, int i2, FeedUnitOrigin feedUnitOrigin, Long l, String str10, boolean z2, FeedSocialEmbed feedSocialEmbed, FeedVideo feedVideo, String str11, String str12, String str13, FeedIdeaAction feedIdeaAction, FeedPostMetadata feedPostMetadata) {
        AnonymousClass005.A11(str, str3, feedEditionKind, 0);
        AnonymousClass005.A13(str4, str5, str6, 4);
        C3cH.A18(str7, str8);
        C7384Etj.A0Y(ahd, 13);
        C7384Etj.A0Y(feedUnitOrigin, 16);
        C7384Etj.A0Y(str10, 18);
        return new FeedUnitContent(str, str2, str3, feedEditionKind, str4, j, i, str5, str6, str7, str8, str9, z, ahd, feedReaction, i2, feedUnitOrigin, l, str10, z2, feedSocialEmbed, feedVideo, str11, str12, str13, feedIdeaAction, feedPostMetadata);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedUnitContent) {
                FeedUnitContent feedUnitContent = (FeedUnitContent) obj;
                if (!C7384Etj.areEqual(this.id, feedUnitContent.id) || !C7384Etj.areEqual(this.promptId, feedUnitContent.promptId) || !C7384Etj.areEqual(this.runId, feedUnitContent.runId) || this.editionKind != feedUnitContent.editionKind || !C7384Etj.areEqual(this.editionLocalDate, feedUnitContent.editionLocalDate) || this.editionGeneratedAtMs != feedUnitContent.editionGeneratedAtMs || this.position != feedUnitContent.position || !C7384Etj.areEqual(this.kicker, feedUnitContent.kicker) || !C7384Etj.areEqual(this.title, feedUnitContent.title) || !C7384Etj.areEqual(this.bodyMarkdown, feedUnitContent.bodyMarkdown) || !C7384Etj.areEqual(this.category, feedUnitContent.category) || !C7384Etj.areEqual(this.connectorAttribution, feedUnitContent.connectorAttribution) || this.isReflective != feedUnitContent.isReflective || !C7384Etj.areEqual(this.stats, feedUnitContent.stats) || this.reaction != feedUnitContent.reaction || this.discussCount != feedUnitContent.discussCount || this.origin != feedUnitContent.origin || !C7384Etj.areEqual(this.seenAtMs, feedUnitContent.seenAtMs) || !C7384Etj.areEqual(this.editionTitle, feedUnitContent.editionTitle) || this.isEditionStart != feedUnitContent.isEditionStart || !C7384Etj.areEqual(this.socialEmbed, feedUnitContent.socialEmbed) || !C7384Etj.areEqual(this.video, feedUnitContent.video) || !C7384Etj.areEqual(this.whyDidISeeThis, feedUnitContent.whyDidISeeThis) || !C7384Etj.areEqual(this.emoji, feedUnitContent.emoji) || !C7384Etj.areEqual(this.iconUrl, feedUnitContent.iconUrl) || !C7384Etj.areEqual(this.ideaAction, feedUnitContent.ideaAction) || !C7384Etj.areEqual(this.postMetadata, feedUnitContent.postMetadata)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.bodyMarkdown;
    }

    public final String component11() {
        return this.category;
    }

    public final String component12() {
        return this.connectorAttribution;
    }

    public final boolean component13() {
        return this.isReflective;
    }

    public final AHD<FeedStat> component14() {
        return this.stats;
    }

    public final FeedReaction component15() {
        return this.reaction;
    }

    public final int component16() {
        return this.discussCount;
    }

    public final FeedUnitOrigin component17() {
        return this.origin;
    }

    public final Long component18() {
        return this.seenAtMs;
    }

    public final String component19() {
        return this.editionTitle;
    }

    public final String component2() {
        return this.promptId;
    }

    public final boolean component20() {
        return this.isEditionStart;
    }

    public final FeedSocialEmbed component21() {
        return this.socialEmbed;
    }

    public final FeedVideo component22() {
        return this.video;
    }

    public final String component23() {
        return this.whyDidISeeThis;
    }

    public final String component24() {
        return this.emoji;
    }

    public final String component25() {
        return this.iconUrl;
    }

    public final FeedIdeaAction component26() {
        return this.ideaAction;
    }

    public final FeedPostMetadata component27() {
        return this.postMetadata;
    }

    public final String component3() {
        return this.runId;
    }

    public final FeedEditionKind component4() {
        return this.editionKind;
    }

    public final String component5() {
        return this.editionLocalDate;
    }

    public final long component6() {
        return this.editionGeneratedAtMs;
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

    public final String getBodyMarkdown() {
        return this.bodyMarkdown;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getConnectorAttribution() {
        return this.connectorAttribution;
    }

    public final int getDiscussCount() {
        return this.discussCount;
    }

    public final long getEditionGeneratedAtMs() {
        return this.editionGeneratedAtMs;
    }

    public final FeedEditionKind getEditionKind() {
        return this.editionKind;
    }

    public final String getEditionLocalDate() {
        return this.editionLocalDate;
    }

    public final String getEditionTitle() {
        return this.editionTitle;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final FeedIdeaAction getIdeaAction() {
        return this.ideaAction;
    }

    public final String getKicker() {
        return this.kicker;
    }

    public final FeedUnitOrigin getOrigin() {
        return this.origin;
    }

    public final int getPosition() {
        return this.position;
    }

    public final FeedPostMetadata getPostMetadata() {
        return this.postMetadata;
    }

    public final String getPromptId() {
        return this.promptId;
    }

    public final FeedReaction getReaction() {
        return this.reaction;
    }

    public final String getRunId() {
        return this.runId;
    }

    public final Long getSeenAtMs() {
        return this.seenAtMs;
    }

    public final FeedSocialEmbed getSocialEmbed() {
        return this.socialEmbed;
    }

    public final AHD<FeedStat> getStats() {
        return this.stats;
    }

    public final String getTitle() {
        return this.title;
    }

    public final FeedVideo getVideo() {
        return this.video;
    }

    public final String getWhyDidISeeThis() {
        return this.whyDidISeeThis;
    }

    public int hashCode() {
        return ((((((((((((C0KA.A01(AnonymousClass005.A0I(this.editionTitle, (AnonymousClass005.A0F(this.origin, (((AnonymousClass005.A0F(this.stats, C0KA.A01((AnonymousClass005.A0I(this.category, AnonymousClass005.A0I(this.bodyMarkdown, AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.kicker, (C60R.A00(this.editionGeneratedAtMs, AnonymousClass005.A0I(this.editionLocalDate, AnonymousClass005.A0F(this.editionKind, AnonymousClass005.A0I(this.runId, (AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.promptId)) * 31)))) + this.position) * 31)))) + AnonymousClass006.A0G(this.connectorAttribution)) * 31, this.isReflective)) + AnonymousClass006.A0D(this.reaction)) * 31) + this.discussCount) * 31) + AnonymousClass006.A0D(this.seenAtMs)) * 31), this.isEditionStart) + AnonymousClass006.A0D(this.socialEmbed)) * 31) + AnonymousClass006.A0D(this.video)) * 31) + AnonymousClass006.A0G(this.whyDidISeeThis)) * 31) + AnonymousClass006.A0G(this.emoji)) * 31) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0D(this.ideaAction)) * 31) + C3cH.A02(this.postMetadata);
    }

    public final boolean isEditionStart() {
        return this.isEditionStart;
    }

    public final boolean isReflective() {
        return this.isReflective;
    }

    public String toString() {
        return super.toString();
    }

    public FeedUnitContent(String str, String str2, String str3, FeedEditionKind feedEditionKind, String str4, long j, int i, String str5, String str6, String str7, String str8, String str9, boolean z, AHD<FeedStat> ahd, FeedReaction feedReaction, int i2, FeedUnitOrigin feedUnitOrigin, Long l, String str10, boolean z2, FeedSocialEmbed feedSocialEmbed, FeedVideo feedVideo, String str11, String str12, String str13, FeedIdeaAction feedIdeaAction, FeedPostMetadata feedPostMetadata) {
        AnonymousClass005.A11(str, str3, feedEditionKind, 0);
        AnonymousClass005.A13(str4, str5, str6, 4);
        C3cH.A18(str7, str8);
        C7384Etj.A0Y(ahd, 13);
        C7384Etj.A0Y(feedUnitOrigin, 16);
        C7384Etj.A0Y(str10, 18);
        this.id = str;
        this.promptId = str2;
        this.runId = str3;
        this.editionKind = feedEditionKind;
        this.editionLocalDate = str4;
        this.editionGeneratedAtMs = j;
        this.position = i;
        this.kicker = str5;
        this.title = str6;
        this.bodyMarkdown = str7;
        this.category = str8;
        this.connectorAttribution = str9;
        this.isReflective = z;
        this.stats = ahd;
        this.reaction = feedReaction;
        this.discussCount = i2;
        this.origin = feedUnitOrigin;
        this.seenAtMs = l;
        this.editionTitle = str10;
        this.isEditionStart = z2;
        this.socialEmbed = feedSocialEmbed;
        this.video = feedVideo;
        this.whyDidISeeThis = str11;
        this.emoji = str12;
        this.iconUrl = str13;
        this.ideaAction = feedIdeaAction;
        this.postMetadata = feedPostMetadata;
    }

    public static /* synthetic */ FeedUnitContent copy$default(FeedUnitContent feedUnitContent, String str, String str2, String str3, FeedEditionKind feedEditionKind, String str4, long j, int i, String str5, String str6, String str7, String str8, String str9, boolean z, AHD ahd, FeedReaction feedReaction, int i2, FeedUnitOrigin feedUnitOrigin, Long l, String str10, boolean z2, FeedSocialEmbed feedSocialEmbed, FeedVideo feedVideo, String str11, String str12, String str13, FeedIdeaAction feedIdeaAction, FeedPostMetadata feedPostMetadata, int i3, Object obj) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        FeedEditionKind feedEditionKind2 = feedEditionKind;
        String str17 = str4;
        long j2 = j;
        int i4 = i;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        boolean z3 = z;
        AHD ahd2 = ahd;
        FeedReaction feedReaction2 = feedReaction;
        int i5 = i2;
        boolean z4 = z2;
        String str23 = str11;
        String str24 = str12;
        String str25 = str13;
        FeedIdeaAction feedIdeaAction2 = feedIdeaAction;
        FeedUnitOrigin feedUnitOrigin2 = feedUnitOrigin;
        Long l2 = l;
        String str26 = str10;
        FeedSocialEmbed feedSocialEmbed2 = feedSocialEmbed;
        FeedVideo feedVideo2 = feedVideo;
        FeedPostMetadata feedPostMetadata2 = feedPostMetadata;
        if ((i3 & 1) != 0) {
            str14 = feedUnitContent.id;
        }
        if ((i3 & 2) != 0) {
            str15 = feedUnitContent.promptId;
        }
        if ((i3 & 4) != 0) {
            str16 = feedUnitContent.runId;
        }
        if ((i3 & 8) != 0) {
            feedEditionKind2 = feedUnitContent.editionKind;
        }
        if ((i3 & 16) != 0) {
            str17 = feedUnitContent.editionLocalDate;
        }
        if ((i3 & 32) != 0) {
            j2 = feedUnitContent.editionGeneratedAtMs;
        }
        if ((i3 & 64) != 0) {
            i4 = feedUnitContent.position;
        }
        if ((i3 & 128) != 0) {
            str18 = feedUnitContent.kicker;
        }
        if ((i3 & 256) != 0) {
            str19 = feedUnitContent.title;
        }
        if ((i3 & 512) != 0) {
            str20 = feedUnitContent.bodyMarkdown;
        }
        if ((i3 & 1024) != 0) {
            str21 = feedUnitContent.category;
        }
        if ((i3 & 2048) != 0) {
            str22 = feedUnitContent.connectorAttribution;
        }
        if ((i3 & 4096) != 0) {
            z3 = feedUnitContent.isReflective;
        }
        if ((i3 & 8192) != 0) {
            ahd2 = feedUnitContent.stats;
        }
        if ((i3 & 16384) != 0) {
            feedReaction2 = feedUnitContent.reaction;
        }
        if ((i3 & 32768) != 0) {
            i5 = feedUnitContent.discussCount;
        }
        if ((i3 & 65536) != 0) {
            feedUnitOrigin2 = feedUnitContent.origin;
        }
        if ((i3 & 131072) != 0) {
            l2 = feedUnitContent.seenAtMs;
        }
        if ((i3 & 262144) != 0) {
            str26 = feedUnitContent.editionTitle;
        }
        if ((i3 & 524288) != 0) {
            z4 = feedUnitContent.isEditionStart;
        }
        if ((i3 & 1048576) != 0) {
            feedSocialEmbed2 = feedUnitContent.socialEmbed;
        }
        if ((i3 & 2097152) != 0) {
            feedVideo2 = feedUnitContent.video;
        }
        if ((i3 & 4194304) != 0) {
            str23 = feedUnitContent.whyDidISeeThis;
        }
        if ((i3 & 8388608) != 0) {
            str24 = feedUnitContent.emoji;
        }
        if ((i3 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str25 = feedUnitContent.iconUrl;
        }
        if ((i3 & 33554432) != 0) {
            feedIdeaAction2 = feedUnitContent.ideaAction;
        }
        if ((i3 & 67108864) != 0) {
            feedPostMetadata2 = feedUnitContent.postMetadata;
        }
        return feedUnitContent.copy(str14, str15, str16, feedEditionKind2, str17, j2, i4, str18, str19, str20, str21, str22, z3, ahd2, feedReaction2, i5, feedUnitOrigin2, l2, str26, z4, feedSocialEmbed2, feedVideo2, str23, str24, str25, feedIdeaAction2, feedPostMetadata2);
    }

    public /* synthetic */ FeedUnitContent(String str, String str2, String str3, FeedEditionKind feedEditionKind, String str4, long j, int i, String str5, String str6, String str7, String str8, String str9, boolean z, AHD ahd, FeedReaction feedReaction, int i2, FeedUnitOrigin feedUnitOrigin, Long l, String str10, boolean z2, FeedSocialEmbed feedSocialEmbed, FeedVideo feedVideo, String str11, String str12, String str13, FeedIdeaAction feedIdeaAction, FeedPostMetadata feedPostMetadata, int i3, C06H c06h) {
        this(str, str2, str3, feedEditionKind, str4, j, i, str5, str6, str7, str8, str9, z, ahd, feedReaction, i2, feedUnitOrigin, (i3 & 131072) != 0 ? null : l, (i3 & 262144) != 0 ? "" : str10, C3cH.A1L(i3, 524288, z2), (i3 & 1048576) != 0 ? null : feedSocialEmbed, (i3 & 2097152) != 0 ? null : feedVideo, (i3 & 4194304) != 0 ? null : str11, (i3 & 8388608) != 0 ? null : str12, (i3 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? null : str13, (i3 & 33554432) != 0 ? null : feedIdeaAction, (i3 & 67108864) != 0 ? null : feedPostMetadata);
    }
}
