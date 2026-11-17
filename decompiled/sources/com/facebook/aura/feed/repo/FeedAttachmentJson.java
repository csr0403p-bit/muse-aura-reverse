package com.facebook.aura.feed.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07819iv;
import X.C07839ix;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class FeedAttachmentJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String hero_image_url;
    public final List<String> image_urls;
    public final String kind;
    public final List<FeedMediaItemJson> media_items;
    public final String social_attribution_text;
    public final String social_embed_url;
    public final Boolean social_is_carousel;
    public final List<FeedSocialMediaItemJson> social_media_items;
    public final String social_post_username;
    public final String social_source_icon_url;
    public final String social_source_name;
    public final Float social_thumbnail_aspect_ratio;
    public final String social_thumbnail_url;
    public final String video_url;
    public final String widget_html;

    public final class Companion {
        public final C9hr<FeedAttachmentJson> serializer() {
            return FeedAttachmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, AbstractC5321DgF.A02(num, FeedAttachmentJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, FeedAttachmentJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, FeedAttachmentJson$Companion$$childSerializers$3.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedAttachmentJson) {
                FeedAttachmentJson feedAttachmentJson = (FeedAttachmentJson) obj;
                if (!C7384Etj.areEqual(this.kind, feedAttachmentJson.kind) || !C7384Etj.areEqual(this.hero_image_url, feedAttachmentJson.hero_image_url) || !C7384Etj.areEqual(this.video_url, feedAttachmentJson.video_url) || !C7384Etj.areEqual(this.image_urls, feedAttachmentJson.image_urls) || !C7384Etj.areEqual(this.media_items, feedAttachmentJson.media_items) || !C7384Etj.areEqual(this.widget_html, feedAttachmentJson.widget_html) || !C7384Etj.areEqual(this.social_embed_url, feedAttachmentJson.social_embed_url) || !C7384Etj.areEqual(this.social_thumbnail_url, feedAttachmentJson.social_thumbnail_url) || !C7384Etj.areEqual(this.social_thumbnail_aspect_ratio, feedAttachmentJson.social_thumbnail_aspect_ratio) || !C7384Etj.areEqual(this.social_attribution_text, feedAttachmentJson.social_attribution_text) || !C7384Etj.areEqual(this.social_post_username, feedAttachmentJson.social_post_username) || !C7384Etj.areEqual(this.social_source_name, feedAttachmentJson.social_source_name) || !C7384Etj.areEqual(this.social_source_icon_url, feedAttachmentJson.social_source_icon_url) || !C7384Etj.areEqual(this.social_is_carousel, feedAttachmentJson.social_is_carousel) || !C7384Etj.areEqual(this.social_media_items, feedAttachmentJson.social_media_items)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedAttachmentJson copy$default(FeedAttachmentJson feedAttachmentJson, String str, String str2, String str3, List list, List list2, String str4, String str5, String str6, Float f, String str7, String str8, String str9, String str10, Boolean bool, List list3, int i, Object obj) {
        String str11 = str;
        String str12 = str3;
        List list4 = list;
        List list5 = list2;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        Float f2 = f;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        String str19 = str10;
        Boolean bool2 = bool;
        List list6 = list3;
        if ((i & 1) != 0) {
            str11 = feedAttachmentJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = feedAttachmentJson.hero_image_url;
        }
        if ((i & 4) != 0) {
            str12 = feedAttachmentJson.video_url;
        }
        if ((i & 8) != 0) {
            list4 = feedAttachmentJson.image_urls;
        }
        if ((i & 16) != 0) {
            list5 = feedAttachmentJson.media_items;
        }
        if ((i & 32) != 0) {
            str13 = feedAttachmentJson.widget_html;
        }
        if ((i & 64) != 0) {
            str14 = feedAttachmentJson.social_embed_url;
        }
        if ((i & 128) != 0) {
            str15 = feedAttachmentJson.social_thumbnail_url;
        }
        if ((i & 256) != 0) {
            f2 = feedAttachmentJson.social_thumbnail_aspect_ratio;
        }
        if ((i & 512) != 0) {
            str16 = feedAttachmentJson.social_attribution_text;
        }
        if ((i & 1024) != 0) {
            str17 = feedAttachmentJson.social_post_username;
        }
        if ((i & 2048) != 0) {
            str18 = feedAttachmentJson.social_source_name;
        }
        if ((i & 4096) != 0) {
            str19 = feedAttachmentJson.social_source_icon_url;
        }
        if ((i & 8192) != 0) {
            bool2 = feedAttachmentJson.social_is_carousel;
        }
        if ((i & 16384) != 0) {
            list6 = feedAttachmentJson.social_media_items;
        }
        AnonymousClass003.A0w(str11, list4);
        String str20 = str12;
        return new FeedAttachmentJson(str11, str2, str20, list4, list5, str13, str14, str15, f2, str16, str17, str18, str19, bool2, list6);
    }

    private final Float storedAspectRatio() {
        Float f = this.social_thumbnail_aspect_ratio;
        if (f == null || f.floatValue() <= 0.0f) {
            return null;
        }
        return f;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedAttachmentJson feedAttachmentJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"none".equals(feedAttachmentJson.kind)) {
            c9j5.AAV(feedAttachmentJson.kind, c9iZ, 0);
        }
        if (zAfR || feedAttachmentJson.hero_image_url != null) {
            c9j5.AAP(feedAttachmentJson.hero_image_url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || feedAttachmentJson.video_url != null) {
            c9j5.AAP(feedAttachmentJson.video_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C7384Etj.areEqual(feedAttachmentJson.image_urls, C0881AGi.A00)) {
            c9j5.AAQ(feedAttachmentJson.image_urls, C06G.A0e(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || feedAttachmentJson.media_items != null) {
            c9j5.AAP(feedAttachmentJson.media_items, C06G.A0e(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || feedAttachmentJson.widget_html != null) {
            c9j5.AAP(feedAttachmentJson.widget_html, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || feedAttachmentJson.social_embed_url != null) {
            c9j5.AAP(feedAttachmentJson.social_embed_url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || feedAttachmentJson.social_thumbnail_url != null) {
            c9j5.AAP(feedAttachmentJson.social_thumbnail_url, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || feedAttachmentJson.social_thumbnail_aspect_ratio != null) {
            c9j5.AAP(feedAttachmentJson.social_thumbnail_aspect_ratio, C07819iv.A00, c9iZ, 8);
        }
        if (zAfR || feedAttachmentJson.social_attribution_text != null) {
            c9j5.AAP(feedAttachmentJson.social_attribution_text, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || feedAttachmentJson.social_post_username != null) {
            c9j5.AAP(feedAttachmentJson.social_post_username, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || feedAttachmentJson.social_source_name != null) {
            c9j5.AAP(feedAttachmentJson.social_source_name, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || feedAttachmentJson.social_source_icon_url != null) {
            c9j5.AAP(feedAttachmentJson.social_source_icon_url, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || feedAttachmentJson.social_is_carousel != null) {
            c9j5.AAP(feedAttachmentJson.social_is_carousel, C07839ix.A00, c9iZ, 13);
        }
        if (zAfR || feedAttachmentJson.social_media_items != null) {
            c9j5.AAP(feedAttachmentJson.social_media_items, C06G.A0e(f0cArr, 14), c9iZ, 14);
        }
    }

    public final String component1() {
        return this.kind;
    }

    public final String component10() {
        return this.social_attribution_text;
    }

    public final String component11() {
        return this.social_post_username;
    }

    public final String component12() {
        return this.social_source_name;
    }

    public final String component13() {
        return this.social_source_icon_url;
    }

    public final Boolean component14() {
        return this.social_is_carousel;
    }

    public final List<FeedSocialMediaItemJson> component15() {
        return this.social_media_items;
    }

    public final String component2() {
        return this.hero_image_url;
    }

    public final String component3() {
        return this.video_url;
    }

    public final List<String> component4() {
        return this.image_urls;
    }

    public final List<FeedMediaItemJson> component5() {
        return this.media_items;
    }

    public final String component6() {
        return this.widget_html;
    }

    public final String component7() {
        return this.social_embed_url;
    }

    public final String component8() {
        return this.social_thumbnail_url;
    }

    public final Float component9() {
        return this.social_thumbnail_aspect_ratio;
    }

    public final String getHero_image_url() {
        return this.hero_image_url;
    }

    public final List<String> getImage_urls() {
        return this.image_urls;
    }

    public final String getKind() {
        return this.kind;
    }

    public final List<FeedMediaItemJson> getMedia_items() {
        return this.media_items;
    }

    public final String getSocial_attribution_text() {
        return this.social_attribution_text;
    }

    public final String getSocial_embed_url() {
        return this.social_embed_url;
    }

    public final Boolean getSocial_is_carousel() {
        return this.social_is_carousel;
    }

    public final List<FeedSocialMediaItemJson> getSocial_media_items() {
        return this.social_media_items;
    }

    public final String getSocial_post_username() {
        return this.social_post_username;
    }

    public final String getSocial_source_icon_url() {
        return this.social_source_icon_url;
    }

    public final String getSocial_source_name() {
        return this.social_source_name;
    }

    public final Float getSocial_thumbnail_aspect_ratio() {
        return this.social_thumbnail_aspect_ratio;
    }

    public final String getSocial_thumbnail_url() {
        return this.social_thumbnail_url;
    }

    public final String getVideo_url() {
        return this.video_url;
    }

    public final String getWidget_html() {
        return this.widget_html;
    }

    public int hashCode() {
        return ((((((((((((((((((((AnonymousClass005.A0F(this.image_urls, (((AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.hero_image_url)) * 31) + AnonymousClass006.A0G(this.video_url)) * 31) + AnonymousClass006.A0D(this.media_items)) * 31) + AnonymousClass006.A0G(this.widget_html)) * 31) + AnonymousClass006.A0G(this.social_embed_url)) * 31) + AnonymousClass006.A0G(this.social_thumbnail_url)) * 31) + AnonymousClass006.A0D(this.social_thumbnail_aspect_ratio)) * 31) + AnonymousClass006.A0G(this.social_attribution_text)) * 31) + AnonymousClass006.A0G(this.social_post_username)) * 31) + AnonymousClass006.A0G(this.social_source_name)) * 31) + AnonymousClass006.A0G(this.social_source_icon_url)) * 31) + AnonymousClass006.A0D(this.social_is_carousel)) * 31) + C06G.A04(this.social_media_items);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.feed.repo.FeedAttachment toDomain() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedAttachmentJson.toDomain():com.facebook.aura.feed.repo.FeedAttachment");
    }

    public final FeedSocialEmbed toSocialEmbed() {
        String str = this.social_embed_url;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        String str2 = this.social_post_username;
        if ((str2 == null || C7BY.A0j(str2)) && ((str2 = this.social_attribution_text) == null || C7BY.A0j(str2))) {
            str2 = null;
        }
        String str3 = this.social_source_name;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        String str4 = this.social_source_icon_url;
        if (str4 == null || C7BY.A0j(str4)) {
            str4 = null;
        }
        FeedSocialEmbed feedSocialEmbed = new FeedSocialEmbed(str, str2, str3, str4);
        if (feedSocialEmbed.destinationUrl == null && feedSocialEmbed.author == null && feedSocialEmbed.sourceName == null && feedSocialEmbed.sourceIconUrl == null) {
            return null;
        }
        return feedSocialEmbed;
    }

    public final FeedVideo toVideo() {
        String str = this.video_url;
        String str2 = null;
        if (str == null || str.length() <= 0) {
            return null;
        }
        String str3 = this.hero_image_url;
        if (str3 != null && str3.length() > 0) {
            str2 = str3;
        }
        return new FeedVideo(str, str2, storedAspectRatio());
    }

    public FeedAttachmentJson(String str, String str2, String str3, List<String> list, List<FeedMediaItemJson> list2, String str4, String str5, String str6, Float f, String str7, String str8, String str9, String str10, Boolean bool, List<FeedSocialMediaItemJson> list3) {
        AnonymousClass003.A0w(str, list);
        this.kind = str;
        this.hero_image_url = str2;
        this.video_url = str3;
        this.image_urls = list;
        this.media_items = list2;
        this.widget_html = str4;
        this.social_embed_url = str5;
        this.social_thumbnail_url = str6;
        this.social_thumbnail_aspect_ratio = f;
        this.social_attribution_text = str7;
        this.social_post_username = str8;
        this.social_source_name = str9;
        this.social_source_icon_url = str10;
        this.social_is_carousel = bool;
        this.social_media_items = list3;
    }

    public final FeedAttachmentJson copy(String str, String str2, String str3, List<String> list, List<FeedMediaItemJson> list2, String str4, String str5, String str6, Float f, String str7, String str8, String str9, String str10, Boolean bool, List<FeedSocialMediaItemJson> list3) {
        AnonymousClass003.A0w(str, list);
        return new FeedAttachmentJson(str, str2, str3, list, list2, str4, str5, str6, f, str7, str8, str9, str10, bool, list3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedAttachmentJson(String str, String str2, String str3, List list, List list2, String str4, String str5, String str6, Float f, String str7, String str8, String str9, String str10, Boolean bool, List list3, int i, C06H c06h) {
        this((i & 1) != 0 ? "none" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? null : list3);
    }

    public /* synthetic */ FeedAttachmentJson(int i, String str, String str2, String str3, List list, List list2, String str4, String str5, String str6, Float f, String str7, String str8, String str9, String str10, Boolean bool, List list3, C2hx c2hx) {
        this.kind = (i & 1) == 0 ? "none" : str;
        if ((i & 2) == 0) {
            this.hero_image_url = null;
        } else {
            this.hero_image_url = str2;
        }
        if ((i & 4) == 0) {
            this.video_url = null;
        } else {
            this.video_url = str3;
        }
        if ((i & 8) == 0) {
            this.image_urls = C0881AGi.A00;
        } else {
            this.image_urls = list;
        }
        if ((i & 16) == 0) {
            this.media_items = null;
        } else {
            this.media_items = list2;
        }
        if ((i & 32) == 0) {
            this.widget_html = null;
        } else {
            this.widget_html = str4;
        }
        if ((i & 64) == 0) {
            this.social_embed_url = null;
        } else {
            this.social_embed_url = str5;
        }
        if ((i & 128) == 0) {
            this.social_thumbnail_url = null;
        } else {
            this.social_thumbnail_url = str6;
        }
        if ((i & 256) == 0) {
            this.social_thumbnail_aspect_ratio = null;
        } else {
            this.social_thumbnail_aspect_ratio = f;
        }
        if ((i & 512) == 0) {
            this.social_attribution_text = null;
        } else {
            this.social_attribution_text = str7;
        }
        if ((i & 1024) == 0) {
            this.social_post_username = null;
        } else {
            this.social_post_username = str8;
        }
        if ((i & 2048) == 0) {
            this.social_source_name = null;
        } else {
            this.social_source_name = str9;
        }
        if ((i & 4096) == 0) {
            this.social_source_icon_url = null;
        } else {
            this.social_source_icon_url = str10;
        }
        if ((i & 8192) == 0) {
            this.social_is_carousel = null;
        } else {
            this.social_is_carousel = bool;
        }
        if ((i & 16384) == 0) {
            this.social_media_items = null;
        } else {
            this.social_media_items = list3;
        }
    }

    public FeedAttachmentJson() {
        this("none", null, null, C0881AGi.A00, null, null, null, null, null, null, null, null, null, null, null);
    }
}
