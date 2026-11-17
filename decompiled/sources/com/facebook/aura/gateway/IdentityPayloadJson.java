package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class IdentityPayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final AvatarJson avatar;
    public final String creature;
    public final String description;
    public final String emoji;
    public final String name;
    public final String tagline;
    public final String vibe;

    public final class Companion {
        public final C9hr<IdentityPayloadJson> serializer() {
            return IdentityPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdentityPayloadJson() {
        this("", "", "", "", "", "", null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(IdentityPayloadJson identityPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(identityPayloadJson.name)) {
            c9j5.AAV(identityPayloadJson.name, c9iZ, 0);
        }
        if (zAfR || !"".equals(identityPayloadJson.tagline)) {
            c9j5.AAV(identityPayloadJson.tagline, c9iZ, 1);
        }
        if (zAfR || !"".equals(identityPayloadJson.description)) {
            c9j5.AAV(identityPayloadJson.description, c9iZ, 2);
        }
        if (zAfR || !"".equals(identityPayloadJson.creature)) {
            c9j5.AAV(identityPayloadJson.creature, c9iZ, 3);
        }
        if (zAfR || !"".equals(identityPayloadJson.vibe)) {
            c9j5.AAV(identityPayloadJson.vibe, c9iZ, 4);
        }
        if (zAfR || !"".equals(identityPayloadJson.emoji)) {
            c9j5.AAV(identityPayloadJson.emoji, c9iZ, 5);
        }
        if (zAfR || identityPayloadJson.avatar != null) {
            c9j5.AAP(identityPayloadJson.avatar, AvatarJson$$serializer.INSTANCE, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdentityPayloadJson) {
                IdentityPayloadJson identityPayloadJson = (IdentityPayloadJson) obj;
                if (!C7384Etj.areEqual(this.name, identityPayloadJson.name) || !C7384Etj.areEqual(this.tagline, identityPayloadJson.tagline) || !C7384Etj.areEqual(this.description, identityPayloadJson.description) || !C7384Etj.areEqual(this.creature, identityPayloadJson.creature) || !C7384Etj.areEqual(this.vibe, identityPayloadJson.vibe) || !C7384Etj.areEqual(this.emoji, identityPayloadJson.emoji) || !C7384Etj.areEqual(this.avatar, identityPayloadJson.avatar)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdentityPayloadJson copy$default(IdentityPayloadJson identityPayloadJson, String str, String str2, String str3, String str4, String str5, String str6, AvatarJson avatarJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identityPayloadJson.name;
        }
        if ((i & 2) != 0) {
            str2 = identityPayloadJson.tagline;
        }
        if ((i & 4) != 0) {
            str3 = identityPayloadJson.description;
        }
        if ((i & 8) != 0) {
            str4 = identityPayloadJson.creature;
        }
        if ((i & 16) != 0) {
            str5 = identityPayloadJson.vibe;
        }
        if ((i & 32) != 0) {
            str6 = identityPayloadJson.emoji;
        }
        if ((i & 64) != 0) {
            avatarJson = identityPayloadJson.avatar;
        }
        return identityPayloadJson.copy(str, str2, str3, str4, str5, str6, avatarJson);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.tagline;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.creature;
    }

    public final String component5() {
        return this.vibe;
    }

    public final String component6() {
        return this.emoji;
    }

    public final AvatarJson component7() {
        return this.avatar;
    }

    public final AvatarJson getAvatar() {
        return this.avatar;
    }

    public final String getCreature() {
        return this.creature;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTagline() {
        return this.tagline;
    }

    public final String getVibe() {
        return this.vibe;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.emoji, AnonymousClass005.A0I(this.vibe, AnonymousClass005.A0I(this.creature, AnonymousClass005.A0I(this.description, AnonymousClass005.A0I(this.tagline, AnonymousClass001.A0G(this.name)))))) + AnonymousClass006.A0D(this.avatar);
    }

    public final IdentityPayloadJson copy(String str, String str2, String str3, String str4, String str5, String str6, AvatarJson avatarJson) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        return new IdentityPayloadJson(str, str2, str3, str4, str5, str6, avatarJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdentityPayloadJson(int i, String str, String str2, String str3, String str4, String str5, String str6, AvatarJson avatarJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.tagline = "";
        } else {
            this.tagline = str2;
        }
        if ((i & 4) == 0) {
            this.description = "";
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.creature = "";
        } else {
            this.creature = str4;
        }
        if ((i & 16) == 0) {
            this.vibe = "";
        } else {
            this.vibe = str5;
        }
        if ((i & 32) == 0) {
            this.emoji = "";
        } else {
            this.emoji = str6;
        }
        if ((i & 64) == 0) {
            this.avatar = null;
        } else {
            this.avatar = avatarJson;
        }
    }

    public IdentityPayloadJson(String str, String str2, String str3, String str4, String str5, String str6, AvatarJson avatarJson) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        this.name = str;
        this.tagline = str2;
        this.description = str3;
        this.creature = str4;
        this.vibe = str5;
        this.emoji = str6;
        this.avatar = avatarJson;
    }

    public /* synthetic */ IdentityPayloadJson(String str, String str2, String str3, String str4, String str5, String str6, AvatarJson avatarJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : avatarJson);
    }
}
