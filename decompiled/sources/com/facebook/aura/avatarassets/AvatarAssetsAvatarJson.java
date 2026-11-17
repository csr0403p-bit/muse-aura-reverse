package com.facebook.aura.avatarassets;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AvatarAssetsAvatarJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String source;

    public final class Companion {
        public final C9hr<AvatarAssetsAvatarJson> serializer() {
            return AvatarAssetsAvatarJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(AvatarAssetsAvatarJson avatarAssetsAvatarJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || avatarAssetsAvatarJson.source != null) {
            c9j5.AAP(avatarAssetsAvatarJson.source, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AvatarAssetsAvatarJson) && C7384Etj.areEqual(this.source, ((AvatarAssetsAvatarJson) obj).source));
    }

    public static /* synthetic */ AvatarAssetsAvatarJson copy$default(AvatarAssetsAvatarJson avatarAssetsAvatarJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarAssetsAvatarJson.source;
        }
        return new AvatarAssetsAvatarJson(str);
    }

    public final String component1() {
        return this.source;
    }

    public final AvatarAssetsAvatarJson copy(String str) {
        return new AvatarAssetsAvatarJson(str);
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.source);
    }

    public /* synthetic */ AvatarAssetsAvatarJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.source = null;
        } else {
            this.source = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AvatarAssetsAvatarJson(String str) {
        this.source = str;
    }

    public /* synthetic */ AvatarAssetsAvatarJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public AvatarAssetsAvatarJson() {
        this(null);
    }
}
