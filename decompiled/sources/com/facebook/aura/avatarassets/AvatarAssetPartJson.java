package com.facebook.aura.avatarassets;

import X.AGH;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AvatarAssetPartJson extends C06G {
    public final Map<String, AvatarAppearanceStateJson> appearances;
    public final String starts_from;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, AvatarAssetPartJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AvatarAssetPartJson> serializer() {
            return AvatarAssetPartJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AvatarAssetPartJson(Map<String, AvatarAppearanceStateJson> map, String str) {
        C7384Etj.A0Y(map, 0);
        this.appearances = map;
        this.starts_from = str;
    }

    public final AvatarAssetPartJson copy(Map<String, AvatarAppearanceStateJson> map, String str) {
        C7384Etj.A0Y(map, 0);
        return new AvatarAssetPartJson(map, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarAssetPartJson) {
                AvatarAssetPartJson avatarAssetPartJson = (AvatarAssetPartJson) obj;
                if (!C7384Etj.areEqual(this.appearances, avatarAssetPartJson.appearances) || !C7384Etj.areEqual(this.starts_from, avatarAssetPartJson.starts_from)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AvatarAssetPartJson copy$default(AvatarAssetPartJson avatarAssetPartJson, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = avatarAssetPartJson.appearances;
        }
        if ((i & 2) != 0) {
            str = avatarAssetPartJson.starts_from;
        }
        C7384Etj.A0Y(map, 0);
        return new AvatarAssetPartJson(map, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(AvatarAssetPartJson avatarAssetPartJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1M(avatarAssetPartJson.appearances)) {
            c9j5.AAQ(avatarAssetPartJson.appearances, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || avatarAssetPartJson.starts_from != null) {
            c9j5.AAP(avatarAssetPartJson.starts_from, C07779iq.A01, c9iZ, 1);
        }
    }

    public final Map<String, AvatarAppearanceStateJson> component1() {
        return this.appearances;
    }

    public final String component2() {
        return this.starts_from;
    }

    public final Map<String, AvatarAppearanceStateJson> getAppearances() {
        return this.appearances;
    }

    public final String getStarts_from() {
        return this.starts_from;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.appearances) + AnonymousClass006.A0G(this.starts_from);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AvatarAssetPartJson(int i, Map map, String str, C2hx c2hx) {
        this.appearances = (i & 1) == 0 ? AGH.A0E() : map;
        if ((i & 2) == 0) {
            this.starts_from = null;
        } else {
            this.starts_from = str;
        }
    }

    public /* synthetic */ AvatarAssetPartJson(Map map, String str, int i, C06H c06h) {
        this(C3cH.A0o(map, i & 1), AnonymousClass006.A0s(i, str));
    }

    public AvatarAssetPartJson() {
        this(AGH.A0E(), null);
    }
}
