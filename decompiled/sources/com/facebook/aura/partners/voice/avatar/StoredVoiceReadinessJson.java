package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07819iv;
import X.C07839ix;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class StoredVoiceReadinessJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String asset_id;
    public final String avatar_image_path;
    public final long avatar_image_updated_ms;
    public final String avatar_still_path;
    public final String avatar_still_sha1;
    public final int crop_bottom;
    public final int crop_top;
    public final boolean embodiment_compatible;
    public final boolean full_frame;
    public final String gateway_url;
    public final String idle_video_uri;
    public final Float reference_crop_size;
    public final Float reference_crop_x;
    public final Float reference_crop_y;
    public final Boolean reference_from_original;
    public final String reference_image_uri;
    public final String selection_kind;
    public final String source_sha1;
    public final String vm_id;
    public final long written_at_ms;

    public final class Companion {
        public final C9hr<StoredVoiceReadinessJson> serializer() {
            return StoredVoiceReadinessJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(StoredVoiceReadinessJson storedVoiceReadinessJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(storedVoiceReadinessJson.gateway_url)) {
            c9j5.AAV(storedVoiceReadinessJson.gateway_url, c9iZ, 0);
        }
        if (zAfR || storedVoiceReadinessJson.vm_id != null) {
            c9j5.AAP(storedVoiceReadinessJson.vm_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || storedVoiceReadinessJson.avatar_image_path != null) {
            c9j5.AAP(storedVoiceReadinessJson.avatar_image_path, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || storedVoiceReadinessJson.avatar_image_updated_ms != 0) {
            c9j5.AAN(c9iZ, 3, storedVoiceReadinessJson.avatar_image_updated_ms);
        }
        if (zAfR || !"".equals(storedVoiceReadinessJson.avatar_still_path)) {
            c9j5.AAV(storedVoiceReadinessJson.avatar_still_path, c9iZ, 4);
        }
        if (zAfR || !"".equals(storedVoiceReadinessJson.selection_kind)) {
            c9j5.AAV(storedVoiceReadinessJson.selection_kind, c9iZ, 5);
        }
        if (zAfR || storedVoiceReadinessJson.full_frame) {
            c9j5.AA7(c9iZ, 6, storedVoiceReadinessJson.full_frame);
        }
        if (zAfR || !"".equals(storedVoiceReadinessJson.asset_id)) {
            c9j5.AAV(storedVoiceReadinessJson.asset_id, c9iZ, 7);
        }
        if (zAfR || storedVoiceReadinessJson.crop_top != 0) {
            c9j5.AAK(c9iZ, 8, storedVoiceReadinessJson.crop_top);
        }
        if (zAfR || storedVoiceReadinessJson.crop_bottom != 0) {
            c9j5.AAK(c9iZ, 9, storedVoiceReadinessJson.crop_bottom);
        }
        if (zAfR || storedVoiceReadinessJson.source_sha1 != null) {
            c9j5.AAP(storedVoiceReadinessJson.source_sha1, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || storedVoiceReadinessJson.idle_video_uri != null) {
            c9j5.AAP(storedVoiceReadinessJson.idle_video_uri, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || storedVoiceReadinessJson.reference_image_uri != null) {
            c9j5.AAP(storedVoiceReadinessJson.reference_image_uri, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || storedVoiceReadinessJson.reference_crop_x != null) {
            c9j5.AAP(storedVoiceReadinessJson.reference_crop_x, C07819iv.A00, c9iZ, 13);
        }
        if (zAfR || storedVoiceReadinessJson.reference_crop_y != null) {
            c9j5.AAP(storedVoiceReadinessJson.reference_crop_y, C07819iv.A00, c9iZ, 14);
        }
        if (zAfR || storedVoiceReadinessJson.reference_crop_size != null) {
            c9j5.AAP(storedVoiceReadinessJson.reference_crop_size, C07819iv.A00, c9iZ, 15);
        }
        if (zAfR || !storedVoiceReadinessJson.embodiment_compatible) {
            c9j5.AA7(c9iZ, 16, storedVoiceReadinessJson.embodiment_compatible);
        }
        if (zAfR || storedVoiceReadinessJson.avatar_still_sha1 != null) {
            c9j5.AAP(storedVoiceReadinessJson.avatar_still_sha1, C07779iq.A01, c9iZ, 17);
        }
        if (zAfR || storedVoiceReadinessJson.reference_from_original != null) {
            c9j5.AAP(storedVoiceReadinessJson.reference_from_original, C07839ix.A00, c9iZ, 18);
        }
        if (zAfR || storedVoiceReadinessJson.written_at_ms != 0) {
            c9j5.AAN(c9iZ, 19, storedVoiceReadinessJson.written_at_ms);
        }
    }

    public final StoredVoiceReadinessJson copy(String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i, int i2, String str7, String str8, String str9, Float f, Float f2, Float f3, boolean z2, String str10, Boolean bool, long j2) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(str4, str5);
        C7384Etj.A0Y(str6, 7);
        return new StoredVoiceReadinessJson(str, str2, str3, j, str4, str5, z, str6, i, i2, str7, str8, str9, f, f2, f3, z2, str10, bool, j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoredVoiceReadinessJson) {
                StoredVoiceReadinessJson storedVoiceReadinessJson = (StoredVoiceReadinessJson) obj;
                if (!C7384Etj.areEqual(this.gateway_url, storedVoiceReadinessJson.gateway_url) || !C7384Etj.areEqual(this.vm_id, storedVoiceReadinessJson.vm_id) || !C7384Etj.areEqual(this.avatar_image_path, storedVoiceReadinessJson.avatar_image_path) || this.avatar_image_updated_ms != storedVoiceReadinessJson.avatar_image_updated_ms || !C7384Etj.areEqual(this.avatar_still_path, storedVoiceReadinessJson.avatar_still_path) || !C7384Etj.areEqual(this.selection_kind, storedVoiceReadinessJson.selection_kind) || this.full_frame != storedVoiceReadinessJson.full_frame || !C7384Etj.areEqual(this.asset_id, storedVoiceReadinessJson.asset_id) || this.crop_top != storedVoiceReadinessJson.crop_top || this.crop_bottom != storedVoiceReadinessJson.crop_bottom || !C7384Etj.areEqual(this.source_sha1, storedVoiceReadinessJson.source_sha1) || !C7384Etj.areEqual(this.idle_video_uri, storedVoiceReadinessJson.idle_video_uri) || !C7384Etj.areEqual(this.reference_image_uri, storedVoiceReadinessJson.reference_image_uri) || !C7384Etj.areEqual(this.reference_crop_x, storedVoiceReadinessJson.reference_crop_x) || !C7384Etj.areEqual(this.reference_crop_y, storedVoiceReadinessJson.reference_crop_y) || !C7384Etj.areEqual(this.reference_crop_size, storedVoiceReadinessJson.reference_crop_size) || this.embodiment_compatible != storedVoiceReadinessJson.embodiment_compatible || !C7384Etj.areEqual(this.avatar_still_sha1, storedVoiceReadinessJson.avatar_still_sha1) || !C7384Etj.areEqual(this.reference_from_original, storedVoiceReadinessJson.reference_from_original) || this.written_at_ms != storedVoiceReadinessJson.written_at_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.gateway_url;
    }

    public final int component10() {
        return this.crop_bottom;
    }

    public final String component11() {
        return this.source_sha1;
    }

    public final String component12() {
        return this.idle_video_uri;
    }

    public final String component13() {
        return this.reference_image_uri;
    }

    public final Float component14() {
        return this.reference_crop_x;
    }

    public final Float component15() {
        return this.reference_crop_y;
    }

    public final Float component16() {
        return this.reference_crop_size;
    }

    public final boolean component17() {
        return this.embodiment_compatible;
    }

    public final String component18() {
        return this.avatar_still_sha1;
    }

    public final Boolean component19() {
        return this.reference_from_original;
    }

    public final String component2() {
        return this.vm_id;
    }

    public final long component20() {
        return this.written_at_ms;
    }

    public final String component3() {
        return this.avatar_image_path;
    }

    public final long component4() {
        return this.avatar_image_updated_ms;
    }

    public final String component5() {
        return this.avatar_still_path;
    }

    public final String component6() {
        return this.selection_kind;
    }

    public final boolean component7() {
        return this.full_frame;
    }

    public final String component8() {
        return this.asset_id;
    }

    public final int component9() {
        return this.crop_top;
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    public final String getAvatar_image_path() {
        return this.avatar_image_path;
    }

    public final long getAvatar_image_updated_ms() {
        return this.avatar_image_updated_ms;
    }

    public final String getAvatar_still_path() {
        return this.avatar_still_path;
    }

    public final String getAvatar_still_sha1() {
        return this.avatar_still_sha1;
    }

    public final int getCrop_bottom() {
        return this.crop_bottom;
    }

    public final int getCrop_top() {
        return this.crop_top;
    }

    public final boolean getEmbodiment_compatible() {
        return this.embodiment_compatible;
    }

    public final boolean getFull_frame() {
        return this.full_frame;
    }

    public final String getGateway_url() {
        return this.gateway_url;
    }

    public final String getIdle_video_uri() {
        return this.idle_video_uri;
    }

    public final Float getReference_crop_size() {
        return this.reference_crop_size;
    }

    public final Float getReference_crop_x() {
        return this.reference_crop_x;
    }

    public final Float getReference_crop_y() {
        return this.reference_crop_y;
    }

    public final Boolean getReference_from_original() {
        return this.reference_from_original;
    }

    public final String getReference_image_uri() {
        return this.reference_image_uri;
    }

    public final String getSelection_kind() {
        return this.selection_kind;
    }

    public final String getSource_sha1() {
        return this.source_sha1;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public final long getWritten_at_ms() {
        return this.written_at_ms;
    }

    public int hashCode() {
        return ((((C0KA.A01((((((((((((((((AnonymousClass005.A0I(this.asset_id, C0KA.A01(AnonymousClass005.A0I(this.selection_kind, AnonymousClass005.A0I(this.avatar_still_path, AnonymousClass006.A06(this.avatar_image_updated_ms, (((AnonymousClass001.A0G(this.gateway_url) + AnonymousClass006.A0G(this.vm_id)) * 31) + AnonymousClass006.A0G(this.avatar_image_path)) * 31))), this.full_frame)) + this.crop_top) * 31) + this.crop_bottom) * 31) + AnonymousClass006.A0G(this.source_sha1)) * 31) + AnonymousClass006.A0G(this.idle_video_uri)) * 31) + AnonymousClass006.A0G(this.reference_image_uri)) * 31) + AnonymousClass006.A0D(this.reference_crop_x)) * 31) + AnonymousClass006.A0D(this.reference_crop_y)) * 31) + AnonymousClass006.A0D(this.reference_crop_size)) * 31, this.embodiment_compatible) + AnonymousClass006.A0G(this.avatar_still_sha1)) * 31) + C3cH.A02(this.reference_from_original)) * 31) + C3cG.A02(this.written_at_ms);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StoredVoiceReadinessJson(int i, String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i2, int i3, String str7, String str8, String str9, Float f, Float f2, Float f3, boolean z2, String str10, Boolean bool, long j2, C2hx c2hx) {
        boolean z3 = z2;
        if ((i & 1) == 0) {
            this.gateway_url = "";
        } else {
            this.gateway_url = str;
        }
        if ((i & 2) == 0) {
            this.vm_id = null;
        } else {
            this.vm_id = str2;
        }
        if ((i & 4) == 0) {
            this.avatar_image_path = null;
        } else {
            this.avatar_image_path = str3;
        }
        if ((i & 8) == 0) {
            this.avatar_image_updated_ms = 0L;
        } else {
            this.avatar_image_updated_ms = j;
        }
        if ((i & 16) == 0) {
            this.avatar_still_path = "";
        } else {
            this.avatar_still_path = str4;
        }
        if ((i & 32) == 0) {
            this.selection_kind = "";
        } else {
            this.selection_kind = str5;
        }
        if ((i & 64) == 0) {
            this.full_frame = false;
        } else {
            this.full_frame = z;
        }
        if ((i & 128) == 0) {
            this.asset_id = "";
        } else {
            this.asset_id = str6;
        }
        if ((i & 256) == 0) {
            this.crop_top = 0;
        } else {
            this.crop_top = i2;
        }
        if ((i & 512) == 0) {
            this.crop_bottom = 0;
        } else {
            this.crop_bottom = i3;
        }
        if ((i & 1024) == 0) {
            this.source_sha1 = null;
        } else {
            this.source_sha1 = str7;
        }
        if ((i & 2048) == 0) {
            this.idle_video_uri = null;
        } else {
            this.idle_video_uri = str8;
        }
        if ((i & 4096) == 0) {
            this.reference_image_uri = null;
        } else {
            this.reference_image_uri = str9;
        }
        if ((i & 8192) == 0) {
            this.reference_crop_x = null;
        } else {
            this.reference_crop_x = f;
        }
        if ((i & 16384) == 0) {
            this.reference_crop_y = null;
        } else {
            this.reference_crop_y = f2;
        }
        if ((32768 & i) == 0) {
            this.reference_crop_size = null;
        } else {
            this.reference_crop_size = f3;
        }
        this.embodiment_compatible = (65536 & i) == 0 ? true : z3;
        if ((131072 & i) == 0) {
            this.avatar_still_sha1 = null;
        } else {
            this.avatar_still_sha1 = str10;
        }
        if ((262144 & i) == 0) {
            this.reference_from_original = null;
        } else {
            this.reference_from_original = bool;
        }
        this.written_at_ms = (i & 524288) != 0 ? j2 : 0L;
    }

    public static /* synthetic */ StoredVoiceReadinessJson copy$default(StoredVoiceReadinessJson storedVoiceReadinessJson, String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i, int i2, String str7, String str8, String str9, Float f, Float f2, Float f3, boolean z2, String str10, Boolean bool, long j2, int i3, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        long j3 = j;
        String str14 = str4;
        String str15 = str5;
        boolean z3 = z;
        String str16 = str6;
        int i4 = i;
        int i5 = i2;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        Float f4 = f;
        Float f5 = f2;
        Float f6 = f3;
        boolean z4 = z2;
        String str20 = str10;
        Boolean bool2 = bool;
        long j4 = j2;
        if ((i3 & 1) != 0) {
            str11 = storedVoiceReadinessJson.gateway_url;
        }
        if ((i3 & 2) != 0) {
            str12 = storedVoiceReadinessJson.vm_id;
        }
        if ((i3 & 4) != 0) {
            str13 = storedVoiceReadinessJson.avatar_image_path;
        }
        if ((i3 & 8) != 0) {
            j3 = storedVoiceReadinessJson.avatar_image_updated_ms;
        }
        if ((i3 & 16) != 0) {
            str14 = storedVoiceReadinessJson.avatar_still_path;
        }
        if ((i3 & 32) != 0) {
            str15 = storedVoiceReadinessJson.selection_kind;
        }
        if ((i3 & 64) != 0) {
            z3 = storedVoiceReadinessJson.full_frame;
        }
        if ((i3 & 128) != 0) {
            str16 = storedVoiceReadinessJson.asset_id;
        }
        if ((i3 & 256) != 0) {
            i4 = storedVoiceReadinessJson.crop_top;
        }
        if ((i3 & 512) != 0) {
            i5 = storedVoiceReadinessJson.crop_bottom;
        }
        if ((i3 & 1024) != 0) {
            str17 = storedVoiceReadinessJson.source_sha1;
        }
        if ((i3 & 2048) != 0) {
            str18 = storedVoiceReadinessJson.idle_video_uri;
        }
        if ((i3 & 4096) != 0) {
            str19 = storedVoiceReadinessJson.reference_image_uri;
        }
        if ((i3 & 8192) != 0) {
            f4 = storedVoiceReadinessJson.reference_crop_x;
        }
        if ((i3 & 16384) != 0) {
            f5 = storedVoiceReadinessJson.reference_crop_y;
        }
        if ((i3 & 32768) != 0) {
            f6 = storedVoiceReadinessJson.reference_crop_size;
        }
        if ((i3 & 65536) != 0) {
            z4 = storedVoiceReadinessJson.embodiment_compatible;
        }
        if ((i3 & 131072) != 0) {
            str20 = storedVoiceReadinessJson.avatar_still_sha1;
        }
        if ((i3 & 262144) != 0) {
            bool2 = storedVoiceReadinessJson.reference_from_original;
        }
        if ((i3 & 524288) != 0) {
            j4 = storedVoiceReadinessJson.written_at_ms;
        }
        String str21 = str17;
        String str22 = str18;
        String str23 = str19;
        return storedVoiceReadinessJson.copy(str11, str12, str13, j3, str14, str15, z3, str16, i4, i5, str21, str22, str23, f4, f5, f6, z4, str20, bool2, j4);
    }

    public /* synthetic */ StoredVoiceReadinessJson(String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i, int i2, String str7, String str8, String str9, Float f, Float f2, Float f3, boolean z2, String str10, Boolean bool, long j2, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? "" : str, C3cG.A0e(str2, i3 & 2), C3cG.A0e(str3, i3 & 4), C3cH.A03(i3 & 8, j), (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, C3cG.A1K(i3 & 64, z), (i3 & 128) == 0 ? str6 : "", (i3 & 256) != 0 ? 0 : i, (i3 & 512) == 0 ? i2 : 0, C3cG.A0e(str7, i3 & 1024), C3cG.A0e(str8, i3 & 2048), C3cG.A0e(str9, i3 & 4096), (i3 & 8192) != 0 ? null : f, (i3 & 16384) != 0 ? null : f2, (i3 & 32768) != 0 ? null : f3, (i3 & 65536) != 0 ? true : z2, C3cI.A0V(i3, 131072, str10), (i3 & 262144) != 0 ? null : bool, C3cH.A03(i3 & 524288, j2));
    }

    public StoredVoiceReadinessJson(String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i, int i2, String str7, String str8, String str9, Float f, Float f2, Float f3, boolean z2, String str10, Boolean bool, long j2) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(str4, str5);
        C7384Etj.A0Y(str6, 7);
        this.gateway_url = str;
        this.vm_id = str2;
        this.avatar_image_path = str3;
        this.avatar_image_updated_ms = j;
        this.avatar_still_path = str4;
        this.selection_kind = str5;
        this.full_frame = z;
        this.asset_id = str6;
        this.crop_top = i;
        this.crop_bottom = i2;
        this.source_sha1 = str7;
        this.idle_video_uri = str8;
        this.reference_image_uri = str9;
        this.reference_crop_x = f;
        this.reference_crop_y = f2;
        this.reference_crop_size = f3;
        this.embodiment_compatible = z2;
        this.avatar_still_sha1 = str10;
        this.reference_from_original = bool;
        this.written_at_ms = j2;
    }

    public StoredVoiceReadinessJson() {
        this("", null, null, 0L, "", "", false, "", 0, 0, null, null, null, null, null, null, true, null, null, 0L);
    }
}
