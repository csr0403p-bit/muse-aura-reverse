package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class SetCustomAvatarDataJson extends C06G {
    public static final Companion Companion = new Companion();
    public final CustomAvatarAssetJson clawmagotchi_abra_set_custom_avatar;

    public final class Companion {
        public final C9hr<SetCustomAvatarDataJson> serializer() {
            return SetCustomAvatarDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(SetCustomAvatarDataJson setCustomAvatarDataJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || setCustomAvatarDataJson.clawmagotchi_abra_set_custom_avatar != null) {
            c9j5.AAP(setCustomAvatarDataJson.clawmagotchi_abra_set_custom_avatar, CustomAvatarAssetJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SetCustomAvatarDataJson) && C7384Etj.areEqual(this.clawmagotchi_abra_set_custom_avatar, ((SetCustomAvatarDataJson) obj).clawmagotchi_abra_set_custom_avatar));
    }

    public static /* synthetic */ SetCustomAvatarDataJson copy$default(SetCustomAvatarDataJson setCustomAvatarDataJson, CustomAvatarAssetJson customAvatarAssetJson, int i, Object obj) {
        if ((i & 1) != 0) {
            customAvatarAssetJson = setCustomAvatarDataJson.clawmagotchi_abra_set_custom_avatar;
        }
        return new SetCustomAvatarDataJson(customAvatarAssetJson);
    }

    public final CustomAvatarAssetJson component1() {
        return this.clawmagotchi_abra_set_custom_avatar;
    }

    public final SetCustomAvatarDataJson copy(CustomAvatarAssetJson customAvatarAssetJson) {
        return new SetCustomAvatarDataJson(customAvatarAssetJson);
    }

    public final CustomAvatarAssetJson getClawmagotchi_abra_set_custom_avatar() {
        return this.clawmagotchi_abra_set_custom_avatar;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.clawmagotchi_abra_set_custom_avatar);
    }

    public /* synthetic */ SetCustomAvatarDataJson(int i, CustomAvatarAssetJson customAvatarAssetJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.clawmagotchi_abra_set_custom_avatar = null;
        } else {
            this.clawmagotchi_abra_set_custom_avatar = customAvatarAssetJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SetCustomAvatarDataJson(CustomAvatarAssetJson customAvatarAssetJson) {
        this.clawmagotchi_abra_set_custom_avatar = customAvatarAssetJson;
    }

    public /* synthetic */ SetCustomAvatarDataJson(CustomAvatarAssetJson customAvatarAssetJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : customAvatarAssetJson);
    }

    public SetCustomAvatarDataJson() {
        this(null);
    }
}
