package com.facebook.aura.partners.voice.avatar;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CustomAvatarsDataJson extends C06G {
    public final List<CustomAvatarAssetJson> clawmagotchi_abra_custom_avatars;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, CustomAvatarsDataJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<CustomAvatarsDataJson> serializer() {
            return CustomAvatarsDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final CustomAvatarsDataJson copy(List<CustomAvatarAssetJson> list) {
        C7384Etj.A0Y(list, 0);
        return new CustomAvatarsDataJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CustomAvatarsDataJson) && C7384Etj.areEqual(this.clawmagotchi_abra_custom_avatars, ((CustomAvatarsDataJson) obj).clawmagotchi_abra_custom_avatars));
    }

    public static /* synthetic */ CustomAvatarsDataJson copy$default(CustomAvatarsDataJson customAvatarsDataJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = customAvatarsDataJson.clawmagotchi_abra_custom_avatars;
        }
        C7384Etj.A0Y(list, 0);
        return new CustomAvatarsDataJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(CustomAvatarsDataJson customAvatarsDataJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(customAvatarsDataJson.clawmagotchi_abra_custom_avatars)) {
            c9j5.AAQ(customAvatarsDataJson.clawmagotchi_abra_custom_avatars, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<CustomAvatarAssetJson> component1() {
        return this.clawmagotchi_abra_custom_avatars;
    }

    public final List<CustomAvatarAssetJson> getClawmagotchi_abra_custom_avatars() {
        return this.clawmagotchi_abra_custom_avatars;
    }

    public int hashCode() {
        return this.clawmagotchi_abra_custom_avatars.hashCode();
    }

    public /* synthetic */ CustomAvatarsDataJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.clawmagotchi_abra_custom_avatars = C0881AGi.A00;
        } else {
            this.clawmagotchi_abra_custom_avatars = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CustomAvatarsDataJson(List<CustomAvatarAssetJson> list) {
        C7384Etj.A0Y(list, 0);
        this.clawmagotchi_abra_custom_avatars = list;
    }

    public /* synthetic */ CustomAvatarsDataJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public CustomAvatarsDataJson() {
        this(C0881AGi.A00);
    }
}
