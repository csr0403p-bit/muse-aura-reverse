package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9jH;
import X.F0C;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AvatarJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String assets_revision;
    public final CallIdleVideosJson call_idle_videos;
    public final String canonical_path;
    public final String darkmode_image_path;
    public final String darkmode_video_path;
    public final Map<String, String> darkmode_video_variants;
    public final boolean image_exists;
    public final String image_path;
    public final long image_updated_ms;
    public final boolean video_exists;
    public final String video_path;
    public final Map<String, String> video_start_frames;
    public final Map<String, String> video_variants;

    public final class Companion {
        public final C9hr<AvatarJson> serializer() {
            return AvatarJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, AbstractC5321DgF.A02(num, AvatarJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, AvatarJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AvatarJson() {
        C9jH c9jHA0E = AGH.A0E();
        this("", false, false, "", 0L, "", c9jHA0E, c9jHA0E, null, null, null, c9jHA0E, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarJson) {
                AvatarJson avatarJson = (AvatarJson) obj;
                if (!C7384Etj.areEqual(this.canonical_path, avatarJson.canonical_path) || this.image_exists != avatarJson.image_exists || this.video_exists != avatarJson.video_exists || !C7384Etj.areEqual(this.image_path, avatarJson.image_path) || this.image_updated_ms != avatarJson.image_updated_ms || !C7384Etj.areEqual(this.video_path, avatarJson.video_path) || !C7384Etj.areEqual(this.video_start_frames, avatarJson.video_start_frames) || !C7384Etj.areEqual(this.video_variants, avatarJson.video_variants) || !C7384Etj.areEqual(this.call_idle_videos, avatarJson.call_idle_videos) || !C7384Etj.areEqual(this.darkmode_image_path, avatarJson.darkmode_image_path) || !C7384Etj.areEqual(this.darkmode_video_path, avatarJson.darkmode_video_path) || !C7384Etj.areEqual(this.darkmode_video_variants, avatarJson.darkmode_video_variants) || !C7384Etj.areEqual(this.assets_revision, avatarJson.assets_revision)) {
                }
            }
            return false;
        }
        return true;
    }

    @Serializable(with = LenientStringSerializer.class)
    public static /* synthetic */ void getAssets_revision$annotations() {
    }

    @Serializable(with = LenientStringSerializer.class)
    public static /* synthetic */ void getDarkmode_image_path$annotations() {
    }

    @Serializable(with = LenientStringSerializer.class)
    public static /* synthetic */ void getDarkmode_video_path$annotations() {
    }

    @Serializable(with = LenientStringMapSerializer.class)
    public static /* synthetic */ void getDarkmode_video_variants$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(AvatarJson avatarJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(avatarJson.canonical_path)) {
            c9j5.AAV(avatarJson.canonical_path, c9iZ, 0);
        }
        if (zAfR || avatarJson.image_exists) {
            c9j5.AA7(c9iZ, 1, avatarJson.image_exists);
        }
        if (zAfR || avatarJson.video_exists) {
            c9j5.AA7(c9iZ, 2, avatarJson.video_exists);
        }
        if (zAfR || !"".equals(avatarJson.image_path)) {
            c9j5.AAV(avatarJson.image_path, c9iZ, 3);
        }
        if (zAfR || avatarJson.image_updated_ms != 0) {
            c9j5.AAN(c9iZ, 4, avatarJson.image_updated_ms);
        }
        if (zAfR || !"".equals(avatarJson.video_path)) {
            c9j5.AAV(avatarJson.video_path, c9iZ, 5);
        }
        if (zAfR || !C3cG.A1M(avatarJson.video_start_frames)) {
            c9j5.AAQ(avatarJson.video_start_frames, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || !C3cG.A1M(avatarJson.video_variants)) {
            c9j5.AAQ(avatarJson.video_variants, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || avatarJson.call_idle_videos != null) {
            c9j5.AAP(avatarJson.call_idle_videos, CallIdleVideosJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || avatarJson.darkmode_image_path != null) {
            c9j5.AAP(avatarJson.darkmode_image_path, LenientStringSerializer.INSTANCE, c9iZ, 9);
        }
        if (zAfR || avatarJson.darkmode_video_path != null) {
            c9j5.AAP(avatarJson.darkmode_video_path, LenientStringSerializer.INSTANCE, c9iZ, 10);
        }
        if (zAfR || !C3cG.A1M(avatarJson.darkmode_video_variants)) {
            c9j5.AAQ(avatarJson.darkmode_video_variants, LenientStringMapSerializer.INSTANCE, c9iZ, 11);
        }
        if (zAfR || avatarJson.assets_revision != null) {
            c9j5.AAP(avatarJson.assets_revision, LenientStringSerializer.INSTANCE, c9iZ, 12);
        }
    }

    public final String component1() {
        return this.canonical_path;
    }

    public final String component10() {
        return this.darkmode_image_path;
    }

    public final String component11() {
        return this.darkmode_video_path;
    }

    public final Map<String, String> component12() {
        return this.darkmode_video_variants;
    }

    public final String component13() {
        return this.assets_revision;
    }

    public final boolean component2() {
        return this.image_exists;
    }

    public final boolean component3() {
        return this.video_exists;
    }

    public final String component4() {
        return this.image_path;
    }

    public final long component5() {
        return this.image_updated_ms;
    }

    public final String component6() {
        return this.video_path;
    }

    public final Map<String, String> component7() {
        return this.video_start_frames;
    }

    public final Map<String, String> component8() {
        return this.video_variants;
    }

    public final CallIdleVideosJson component9() {
        return this.call_idle_videos;
    }

    public final String getAssets_revision() {
        return this.assets_revision;
    }

    public final CallIdleVideosJson getCall_idle_videos() {
        return this.call_idle_videos;
    }

    public final String getCanonical_path() {
        return this.canonical_path;
    }

    public final String getDarkmode_image_path() {
        return this.darkmode_image_path;
    }

    public final String getDarkmode_video_path() {
        return this.darkmode_video_path;
    }

    public final Map<String, String> getDarkmode_video_variants() {
        return this.darkmode_video_variants;
    }

    public final boolean getImage_exists() {
        return this.image_exists;
    }

    public final String getImage_path() {
        return this.image_path;
    }

    public final long getImage_updated_ms() {
        return this.image_updated_ms;
    }

    public final boolean getVideo_exists() {
        return this.video_exists;
    }

    public final String getVideo_path() {
        return this.video_path;
    }

    public final Map<String, String> getVideo_start_frames() {
        return this.video_start_frames;
    }

    public final Map<String, String> getVideo_variants() {
        return this.video_variants;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.darkmode_video_variants, (((((AnonymousClass005.A0F(this.video_variants, AnonymousClass005.A0F(this.video_start_frames, AnonymousClass005.A0I(this.video_path, AnonymousClass006.A05(this.image_updated_ms, AnonymousClass005.A0I(this.image_path, C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.canonical_path), this.image_exists), this.video_exists))) * 31))) + AnonymousClass006.A0D(this.call_idle_videos)) * 31) + AnonymousClass006.A0G(this.darkmode_image_path)) * 31) + AnonymousClass006.A0G(this.darkmode_video_path)) * 31) + AnonymousClass005.A0H(this.assets_revision);
    }

    public final AvatarJson copy(String str, boolean z, boolean z2, String str2, long j, String str3, Map<String, String> map, Map<String, String> map2, CallIdleVideosJson callIdleVideosJson, String str4, String str5, Map<String, String> map3, String str6) {
        AnonymousClass003.A0w(str, str2);
        AnonymousClass005.A0z(str3, map, map2);
        C7384Etj.A0Y(map3, 11);
        return new AvatarJson(str, z, z2, str2, j, str3, map, map2, callIdleVideosJson, str4, str5, map3, str6);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ AvatarJson copy$default(AvatarJson avatarJson, String str, boolean z, boolean z2, String str2, long j, String str3, Map map, Map map2, CallIdleVideosJson callIdleVideosJson, String str4, String str5, Map map3, String str6, int i, Object obj) {
        String str7 = str3;
        Map map4 = map;
        Map map5 = map2;
        CallIdleVideosJson callIdleVideosJson2 = callIdleVideosJson;
        String str8 = str4;
        String str9 = str5;
        Map map6 = map3;
        String str10 = str6;
        if ((i & 1) != 0) {
            str = avatarJson.canonical_path;
        }
        if ((i & 2) != 0) {
            z = avatarJson.image_exists;
        }
        if ((i & 4) != 0) {
            z2 = avatarJson.video_exists;
        }
        if ((i & 8) != 0) {
            str2 = avatarJson.image_path;
        }
        if ((i & 16) != 0) {
            j = avatarJson.image_updated_ms;
        }
        if ((i & 32) != 0) {
            str7 = avatarJson.video_path;
        }
        if ((i & 64) != 0) {
            map4 = avatarJson.video_start_frames;
        }
        if ((i & 128) != 0) {
            map5 = avatarJson.video_variants;
        }
        if ((i & 256) != 0) {
            callIdleVideosJson2 = avatarJson.call_idle_videos;
        }
        if ((i & 512) != 0) {
            str8 = avatarJson.darkmode_image_path;
        }
        if ((i & 1024) != 0) {
            str9 = avatarJson.darkmode_video_path;
        }
        if ((i & 2048) != 0) {
            map6 = avatarJson.darkmode_video_variants;
        }
        if ((i & 4096) != 0) {
            str10 = avatarJson.assets_revision;
        }
        return avatarJson.copy(str, z, z2, str2, j, str7, map4, map5, callIdleVideosJson2, str8, str9, map6, str10);
    }

    public AvatarJson(String str, boolean z, boolean z2, String str2, long j, String str3, Map<String, String> map, Map<String, String> map2, CallIdleVideosJson callIdleVideosJson, String str4, String str5, Map<String, String> map3, String str6) {
        AnonymousClass003.A0w(str, str2);
        AnonymousClass005.A0z(str3, map, map2);
        C7384Etj.A0Y(map3, 11);
        this.canonical_path = str;
        this.image_exists = z;
        this.video_exists = z2;
        this.image_path = str2;
        this.image_updated_ms = j;
        this.video_path = str3;
        this.video_start_frames = map;
        this.video_variants = map2;
        this.call_idle_videos = callIdleVideosJson;
        this.darkmode_image_path = str4;
        this.darkmode_video_path = str5;
        this.darkmode_video_variants = map3;
        this.assets_revision = str6;
    }

    public /* synthetic */ AvatarJson(int i, String str, boolean z, boolean z2, String str2, long j, String str3, Map map, Map map2, CallIdleVideosJson callIdleVideosJson, String str4, String str5, Map map3, String str6, C2hx c2hx) {
        Map map4 = map3;
        if ((i & 1) == 0) {
            this.canonical_path = "";
        } else {
            this.canonical_path = str;
        }
        if ((i & 2) == 0) {
            this.image_exists = false;
        } else {
            this.image_exists = z;
        }
        if ((i & 4) == 0) {
            this.video_exists = false;
        } else {
            this.video_exists = z2;
        }
        if ((i & 8) == 0) {
            this.image_path = "";
        } else {
            this.image_path = str2;
        }
        if ((i & 16) == 0) {
            this.image_updated_ms = 0L;
        } else {
            this.image_updated_ms = j;
        }
        if ((i & 32) == 0) {
            this.video_path = "";
        } else {
            this.video_path = str3;
        }
        if ((i & 64) == 0) {
            this.video_start_frames = AGH.A0E();
        } else {
            this.video_start_frames = map;
        }
        if ((i & 128) == 0) {
            this.video_variants = AGH.A0E();
        } else {
            this.video_variants = map2;
        }
        if ((i & 256) == 0) {
            this.call_idle_videos = null;
        } else {
            this.call_idle_videos = callIdleVideosJson;
        }
        if ((i & 512) == 0) {
            this.darkmode_image_path = null;
        } else {
            this.darkmode_image_path = str4;
        }
        if ((i & 1024) == 0) {
            this.darkmode_video_path = null;
        } else {
            this.darkmode_video_path = str5;
        }
        this.darkmode_video_variants = (i & 2048) == 0 ? AGH.A0E() : map4;
        if ((i & 4096) == 0) {
            this.assets_revision = null;
        } else {
            this.assets_revision = str6;
        }
    }

    public /* synthetic */ AvatarJson(String str, boolean z, boolean z2, String str2, long j, String str3, Map map, Map map2, CallIdleVideosJson callIdleVideosJson, String str4, String str5, Map map3, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, C3cG.A1K(i & 2, z), (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? "" : str2, C3cH.A03(i & 16, j), (i & 32) == 0 ? str3 : "", (i & 64) != 0 ? AGH.A0E() : map, (i & 128) != 0 ? AGH.A0E() : map2, (i & 256) != 0 ? null : callIdleVideosJson, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? AGH.A0E() : map3, (i & 4096) != 0 ? null : str6);
    }
}
