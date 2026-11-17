package com.facebook.aura.avatarassets;

import X.AbstractC5321DgF;
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
public final class AvatarAssetJson extends C06G {
    public final List<String> aliases;
    public final String id;
    public final AvatarAssetPartJson still;
    public final AvatarAssetPartJson video;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, AvatarAssetJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<AvatarAssetJson> serializer() {
            return AvatarAssetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AvatarAssetJson(String str, List<String> list, AvatarAssetPartJson avatarAssetPartJson, AvatarAssetPartJson avatarAssetPartJson2) {
        C7384Etj.A0Y(list, 1);
        this.id = str;
        this.aliases = list;
        this.still = avatarAssetPartJson;
        this.video = avatarAssetPartJson2;
    }

    public final AvatarAssetJson copy(String str, List<String> list, AvatarAssetPartJson avatarAssetPartJson, AvatarAssetPartJson avatarAssetPartJson2) {
        C7384Etj.A0Y(list, 1);
        return new AvatarAssetJson(str, list, avatarAssetPartJson, avatarAssetPartJson2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarAssetJson) {
                AvatarAssetJson avatarAssetJson = (AvatarAssetJson) obj;
                if (!C7384Etj.areEqual(this.id, avatarAssetJson.id) || !C7384Etj.areEqual(this.aliases, avatarAssetJson.aliases) || !C7384Etj.areEqual(this.still, avatarAssetJson.still) || !C7384Etj.areEqual(this.video, avatarAssetJson.video)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AvatarAssetJson copy$default(AvatarAssetJson avatarAssetJson, String str, List list, AvatarAssetPartJson avatarAssetPartJson, AvatarAssetPartJson avatarAssetPartJson2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarAssetJson.id;
        }
        if ((i & 2) != 0) {
            list = avatarAssetJson.aliases;
        }
        if ((i & 4) != 0) {
            avatarAssetPartJson = avatarAssetJson.still;
        }
        if ((i & 8) != 0) {
            avatarAssetPartJson2 = avatarAssetJson.video;
        }
        C7384Etj.A0Y(list, 1);
        return new AvatarAssetJson(str, list, avatarAssetPartJson, avatarAssetPartJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(AvatarAssetJson avatarAssetJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || avatarAssetJson.id != null) {
            c9j5.AAP(avatarAssetJson.id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(avatarAssetJson.aliases)) {
            c9j5.AAQ(avatarAssetJson.aliases, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || avatarAssetJson.still != null) {
            c9j5.AAP(avatarAssetJson.still, AvatarAssetPartJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || avatarAssetJson.video != null) {
            c9j5.AAP(avatarAssetJson.video, AvatarAssetPartJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final List<String> component2() {
        return this.aliases;
    }

    public final AvatarAssetPartJson component3() {
        return this.still;
    }

    public final AvatarAssetPartJson component4() {
        return this.video;
    }

    public final List<String> getAliases() {
        return this.aliases;
    }

    public final String getId() {
        return this.id;
    }

    public final AvatarAssetPartJson getStill() {
        return this.still;
    }

    public final AvatarAssetPartJson getVideo() {
        return this.video;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.aliases, AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0D(this.still)) * 31) + C3cH.A02(this.video);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AvatarAssetJson(int i, String str, List list, AvatarAssetPartJson avatarAssetPartJson, AvatarAssetPartJson avatarAssetPartJson2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.aliases = C0881AGi.A00;
        } else {
            this.aliases = list;
        }
        if ((i & 4) == 0) {
            this.still = null;
        } else {
            this.still = avatarAssetPartJson;
        }
        if ((i & 8) == 0) {
            this.video = null;
        } else {
            this.video = avatarAssetPartJson2;
        }
    }

    public /* synthetic */ AvatarAssetJson(String str, List list, AvatarAssetPartJson avatarAssetPartJson, AvatarAssetPartJson avatarAssetPartJson2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, C3cI.A11(list, i), (i & 4) != 0 ? null : avatarAssetPartJson, (i & 8) != 0 ? null : avatarAssetPartJson2);
    }

    public AvatarAssetJson() {
        this(null, C0881AGi.A00, null, null);
    }
}
