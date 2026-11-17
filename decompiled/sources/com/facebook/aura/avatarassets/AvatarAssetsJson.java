package com.facebook.aura.avatarassets;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class AvatarAssetsJson extends C06G {
    public final List<AvatarAssetJson> assets;
    public final AvatarAssetsAvatarJson avatar;
    public final String revision;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, AvatarAssetsJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AvatarAssetsJson> serializer() {
            return AvatarAssetsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AvatarAssetsJson(String str, AvatarAssetsAvatarJson avatarAssetsAvatarJson, List<AvatarAssetJson> list) {
        C7384Etj.A0Y(list, 2);
        this.revision = str;
        this.avatar = avatarAssetsAvatarJson;
        this.assets = list;
    }

    public final AvatarAssetsJson copy(String str, AvatarAssetsAvatarJson avatarAssetsAvatarJson, List<AvatarAssetJson> list) {
        C7384Etj.A0Y(list, 2);
        return new AvatarAssetsJson(str, avatarAssetsAvatarJson, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarAssetsJson) {
                AvatarAssetsJson avatarAssetsJson = (AvatarAssetsJson) obj;
                if (!C7384Etj.areEqual(this.revision, avatarAssetsJson.revision) || !C7384Etj.areEqual(this.avatar, avatarAssetsJson.avatar) || !C7384Etj.areEqual(this.assets, avatarAssetsJson.assets)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarAssetsJson copy$default(AvatarAssetsJson avatarAssetsJson, String str, AvatarAssetsAvatarJson avatarAssetsAvatarJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarAssetsJson.revision;
        }
        if ((i & 2) != 0) {
            avatarAssetsAvatarJson = avatarAssetsJson.avatar;
        }
        if ((i & 4) != 0) {
            list = avatarAssetsJson.assets;
        }
        return avatarAssetsJson.copy(str, avatarAssetsAvatarJson, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(AvatarAssetsJson avatarAssetsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || avatarAssetsJson.revision != null) {
            c9j5.AAP(avatarAssetsJson.revision, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || avatarAssetsJson.avatar != null) {
            c9j5.AAP(avatarAssetsJson.avatar, AvatarAssetsAvatarJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(avatarAssetsJson.assets)) {
            c9j5.AAQ(avatarAssetsJson.assets, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.revision;
    }

    public final AvatarAssetsAvatarJson component2() {
        return this.avatar;
    }

    public final List<AvatarAssetJson> component3() {
        return this.assets;
    }

    public final List<AvatarAssetJson> getAssets() {
        return this.assets;
    }

    public final AvatarAssetsAvatarJson getAvatar() {
        return this.avatar;
    }

    public final String getRevision() {
        return this.revision;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.assets, ((AnonymousClass006.A0G(this.revision) * 31) + C3cH.A02(this.avatar)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AvatarAssetsJson(int i, String str, AvatarAssetsAvatarJson avatarAssetsAvatarJson, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.revision = null;
        } else {
            this.revision = str;
        }
        if ((i & 2) == 0) {
            this.avatar = null;
        } else {
            this.avatar = avatarAssetsAvatarJson;
        }
        if ((i & 4) == 0) {
            this.assets = C0881AGi.A00;
        } else {
            this.assets = list;
        }
    }

    public /* synthetic */ AvatarAssetsJson(String str, AvatarAssetsAvatarJson avatarAssetsAvatarJson, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : avatarAssetsAvatarJson, C3cI.A12(list, i));
    }

    public AvatarAssetsJson() {
        this(null, null, C0881AGi.A00);
    }
}
