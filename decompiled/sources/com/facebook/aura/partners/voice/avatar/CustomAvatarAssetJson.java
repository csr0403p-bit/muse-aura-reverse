package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class CustomAvatarAssetJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String asset_id;
    public final String asset_kind;
    public final JsonElement attributes;
    public final String content_hash;
    public final DisplayCropJson display_crop;
    public final Long generated_at;
    public final GeneratedHatchIdleAnimationJson generated_hatch_idle_animation;
    public final Boolean is_avatar_embodiment_compatible;
    public final String uri;

    public final class Companion {
        public final C9hr<CustomAvatarAssetJson> serializer() {
            return CustomAvatarAssetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(CustomAvatarAssetJson customAvatarAssetJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(customAvatarAssetJson.asset_id)) {
            c9j5.AAV(customAvatarAssetJson.asset_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(customAvatarAssetJson.asset_kind)) {
            c9j5.AAV(customAvatarAssetJson.asset_kind, c9iZ, 1);
        }
        if (zAfR || customAvatarAssetJson.attributes != null) {
            c9j5.AAP(customAvatarAssetJson.attributes, JsonElementSerializer.A00, c9iZ, 2);
        }
        if (zAfR || !"".equals(customAvatarAssetJson.uri)) {
            c9j5.AAV(customAvatarAssetJson.uri, c9iZ, 3);
        }
        if (zAfR || !"".equals(customAvatarAssetJson.content_hash)) {
            c9j5.AAV(customAvatarAssetJson.content_hash, c9iZ, 4);
        }
        if (zAfR || customAvatarAssetJson.generated_at != null) {
            c9j5.AAP(customAvatarAssetJson.generated_at, C9j1.A00, c9iZ, 5);
        }
        if (zAfR || customAvatarAssetJson.display_crop != null) {
            c9j5.AAP(customAvatarAssetJson.display_crop, DisplayCropJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || customAvatarAssetJson.generated_hatch_idle_animation != null) {
            c9j5.AAP(customAvatarAssetJson.generated_hatch_idle_animation, GeneratedHatchIdleAnimationJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || customAvatarAssetJson.is_avatar_embodiment_compatible != null) {
            c9j5.AAP(customAvatarAssetJson.is_avatar_embodiment_compatible, C07839ix.A00, c9iZ, 8);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomAvatarAssetJson) {
                CustomAvatarAssetJson customAvatarAssetJson = (CustomAvatarAssetJson) obj;
                if (!C7384Etj.areEqual(this.asset_id, customAvatarAssetJson.asset_id) || !C7384Etj.areEqual(this.asset_kind, customAvatarAssetJson.asset_kind) || !C7384Etj.areEqual(this.attributes, customAvatarAssetJson.attributes) || !C7384Etj.areEqual(this.uri, customAvatarAssetJson.uri) || !C7384Etj.areEqual(this.content_hash, customAvatarAssetJson.content_hash) || !C7384Etj.areEqual(this.generated_at, customAvatarAssetJson.generated_at) || !C7384Etj.areEqual(this.display_crop, customAvatarAssetJson.display_crop) || !C7384Etj.areEqual(this.generated_hatch_idle_animation, customAvatarAssetJson.generated_hatch_idle_animation) || !C7384Etj.areEqual(this.is_avatar_embodiment_compatible, customAvatarAssetJson.is_avatar_embodiment_compatible)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CustomAvatarAssetJson(String str, String str2, JsonElement jsonElement, String str3, String str4, Long l, DisplayCropJson displayCropJson, GeneratedHatchIdleAnimationJson generatedHatchIdleAnimationJson, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : jsonElement, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : displayCropJson, (i & 128) != 0 ? null : generatedHatchIdleAnimationJson, (i & 256) != 0 ? null : bool);
    }

    public static /* synthetic */ CustomAvatarAssetJson copy$default(CustomAvatarAssetJson customAvatarAssetJson, String str, String str2, JsonElement jsonElement, String str3, String str4, Long l, DisplayCropJson displayCropJson, GeneratedHatchIdleAnimationJson generatedHatchIdleAnimationJson, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customAvatarAssetJson.asset_id;
        }
        if ((i & 2) != 0) {
            str2 = customAvatarAssetJson.asset_kind;
        }
        if ((i & 4) != 0) {
            jsonElement = customAvatarAssetJson.attributes;
        }
        if ((i & 8) != 0) {
            str3 = customAvatarAssetJson.uri;
        }
        if ((i & 16) != 0) {
            str4 = customAvatarAssetJson.content_hash;
        }
        if ((i & 32) != 0) {
            l = customAvatarAssetJson.generated_at;
        }
        if ((i & 64) != 0) {
            displayCropJson = customAvatarAssetJson.display_crop;
        }
        if ((i & 128) != 0) {
            generatedHatchIdleAnimationJson = customAvatarAssetJson.generated_hatch_idle_animation;
        }
        if ((i & 256) != 0) {
            bool = customAvatarAssetJson.is_avatar_embodiment_compatible;
        }
        return customAvatarAssetJson.copy(str, str2, jsonElement, str3, str4, l, displayCropJson, generatedHatchIdleAnimationJson, bool);
    }

    public final String component1() {
        return this.asset_id;
    }

    public final String component2() {
        return this.asset_kind;
    }

    public final JsonElement component3() {
        return this.attributes;
    }

    public final String component4() {
        return this.uri;
    }

    public final String component5() {
        return this.content_hash;
    }

    public final Long component6() {
        return this.generated_at;
    }

    public final DisplayCropJson component7() {
        return this.display_crop;
    }

    public final GeneratedHatchIdleAnimationJson component8() {
        return this.generated_hatch_idle_animation;
    }

    public final Boolean component9() {
        return this.is_avatar_embodiment_compatible;
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    public final String getAsset_kind() {
        return this.asset_kind;
    }

    public final JsonElement getAttributes() {
        return this.attributes;
    }

    public final String getContent_hash() {
        return this.content_hash;
    }

    public final DisplayCropJson getDisplay_crop() {
        return this.display_crop;
    }

    public final Long getGenerated_at() {
        return this.generated_at;
    }

    public final GeneratedHatchIdleAnimationJson getGenerated_hatch_idle_animation() {
        return this.generated_hatch_idle_animation;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.content_hash, AnonymousClass005.A0I(this.uri, (AnonymousClass005.A0I(this.asset_kind, AnonymousClass001.A0G(this.asset_id)) + AnonymousClass006.A0D(this.attributes)) * 31)) + AnonymousClass006.A0D(this.generated_at)) * 31) + AnonymousClass006.A0D(this.display_crop)) * 31) + AnonymousClass006.A0D(this.generated_hatch_idle_animation)) * 31) + C3cH.A02(this.is_avatar_embodiment_compatible);
    }

    public final Boolean is_avatar_embodiment_compatible() {
        return this.is_avatar_embodiment_compatible;
    }

    public final CustomAvatarAssetJson copy(String str, String str2, JsonElement jsonElement, String str3, String str4, Long l, DisplayCropJson displayCropJson, GeneratedHatchIdleAnimationJson generatedHatchIdleAnimationJson, Boolean bool) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        return new CustomAvatarAssetJson(str, str2, jsonElement, str3, str4, l, displayCropJson, generatedHatchIdleAnimationJson, bool);
    }

    public String toString() {
        return super.toString();
    }

    public CustomAvatarAssetJson(String str, String str2, JsonElement jsonElement, String str3, String str4, Long l, DisplayCropJson displayCropJson, GeneratedHatchIdleAnimationJson generatedHatchIdleAnimationJson, Boolean bool) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        this.asset_id = str;
        this.asset_kind = str2;
        this.attributes = jsonElement;
        this.uri = str3;
        this.content_hash = str4;
        this.generated_at = l;
        this.display_crop = displayCropJson;
        this.generated_hatch_idle_animation = generatedHatchIdleAnimationJson;
        this.is_avatar_embodiment_compatible = bool;
    }

    public /* synthetic */ CustomAvatarAssetJson(int i, String str, String str2, JsonElement jsonElement, String str3, String str4, Long l, DisplayCropJson displayCropJson, GeneratedHatchIdleAnimationJson generatedHatchIdleAnimationJson, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.asset_id = "";
        } else {
            this.asset_id = str;
        }
        if ((i & 2) == 0) {
            this.asset_kind = "";
        } else {
            this.asset_kind = str2;
        }
        if ((i & 4) == 0) {
            this.attributes = null;
        } else {
            this.attributes = jsonElement;
        }
        if ((i & 8) == 0) {
            this.uri = "";
        } else {
            this.uri = str3;
        }
        if ((i & 16) == 0) {
            this.content_hash = "";
        } else {
            this.content_hash = str4;
        }
        if ((i & 32) == 0) {
            this.generated_at = null;
        } else {
            this.generated_at = l;
        }
        if ((i & 64) == 0) {
            this.display_crop = null;
        } else {
            this.display_crop = displayCropJson;
        }
        if ((i & 128) == 0) {
            this.generated_hatch_idle_animation = null;
        } else {
            this.generated_hatch_idle_animation = generatedHatchIdleAnimationJson;
        }
        if ((i & 256) == 0) {
            this.is_avatar_embodiment_compatible = null;
        } else {
            this.is_avatar_embodiment_compatible = bool;
        }
    }

    public CustomAvatarAssetJson() {
        this("", "", null, "", "", null, null, null, null);
    }
}
