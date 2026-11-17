package com.facebook.aura.model;

import X.AnonymousClass002;
import X.AnonymousClass005;
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
public final class AvatarSharePresentationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String buttonText;
    public final String button_text;
    public final String fallbackText;
    public final String fallback_text;
    public final String subtitle;
    public final String title;
    public final String video_variant;

    public final class Companion {
        public final C9hr<AvatarSharePresentationJson> serializer() {
            return AvatarSharePresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AvatarSharePresentationJson() {
        this(null, null, null, null, null, null, AvatarSharePresentationJsonKt.VIDEO_VARIANT_NOT_SENT);
    }

    public static /* synthetic */ AvatarSharePresentationJson copy$default(AvatarSharePresentationJson avatarSharePresentationJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        if ((i & 1) != 0) {
            str8 = avatarSharePresentationJson.button_text;
        }
        if ((i & 2) != 0) {
            str9 = avatarSharePresentationJson.buttonText;
        }
        if ((i & 4) != 0) {
            str10 = avatarSharePresentationJson.title;
        }
        if ((i & 8) != 0) {
            str11 = avatarSharePresentationJson.subtitle;
        }
        if ((i & 16) != 0) {
            str12 = avatarSharePresentationJson.fallback_text;
        }
        if ((i & 32) != 0) {
            str13 = avatarSharePresentationJson.fallbackText;
        }
        if ((i & 64) != 0) {
            str14 = avatarSharePresentationJson.video_variant;
        }
        return new AvatarSharePresentationJson(str8, str9, str10, str11, str12, str13, str14);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(AvatarSharePresentationJson avatarSharePresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || avatarSharePresentationJson.button_text != null) {
            c9j5.AAP(avatarSharePresentationJson.button_text, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || avatarSharePresentationJson.buttonText != null) {
            c9j5.AAP(avatarSharePresentationJson.buttonText, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || avatarSharePresentationJson.title != null) {
            c9j5.AAP(avatarSharePresentationJson.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || avatarSharePresentationJson.subtitle != null) {
            c9j5.AAP(avatarSharePresentationJson.subtitle, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || avatarSharePresentationJson.fallback_text != null) {
            c9j5.AAP(avatarSharePresentationJson.fallback_text, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || avatarSharePresentationJson.fallbackText != null) {
            c9j5.AAP(avatarSharePresentationJson.fallbackText, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || !AvatarSharePresentationJsonKt.VIDEO_VARIANT_NOT_SENT.equals(avatarSharePresentationJson.video_variant)) {
            c9j5.AAP(avatarSharePresentationJson.video_variant, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarSharePresentationJson) {
                AvatarSharePresentationJson avatarSharePresentationJson = (AvatarSharePresentationJson) obj;
                if (!C7384Etj.areEqual(this.button_text, avatarSharePresentationJson.button_text) || !C7384Etj.areEqual(this.buttonText, avatarSharePresentationJson.buttonText) || !C7384Etj.areEqual(this.title, avatarSharePresentationJson.title) || !C7384Etj.areEqual(this.subtitle, avatarSharePresentationJson.subtitle) || !C7384Etj.areEqual(this.fallback_text, avatarSharePresentationJson.fallback_text) || !C7384Etj.areEqual(this.fallbackText, avatarSharePresentationJson.fallbackText) || !C7384Etj.areEqual(this.video_variant, avatarSharePresentationJson.video_variant)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.button_text;
    }

    public final String component2() {
        return this.buttonText;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.fallback_text;
    }

    public final String component6() {
        return this.fallbackText;
    }

    public final String component7() {
        return this.video_variant;
    }

    public final AvatarSharePresentationJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new AvatarSharePresentationJson(str, str2, str3, str4, str5, str6, str7);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getButton_text() {
        return this.button_text;
    }

    public final String getFallbackText() {
        return this.fallbackText;
    }

    public final String getFallback_text() {
        return this.fallback_text;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVideo_variant() {
        return this.video_variant;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass006.A0G(this.button_text) * 31) + AnonymousClass006.A0G(this.buttonText)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.fallback_text)) * 31) + AnonymousClass006.A0G(this.fallbackText)) * 31) + AnonymousClass005.A0H(this.video_variant);
    }

    public final AvatarSharePresentationData toDomain() {
        String strFirstNonBlank;
        AvatarVideoVariant avatarVideoVariantFromKey;
        String strFirstNonBlank2 = AvatarSharePresentationJsonKt.firstNonBlank(this.button_text, this.buttonText);
        if (strFirstNonBlank2 == null) {
            return null;
        }
        String strFirstNonBlank3 = AvatarSharePresentationJsonKt.firstNonBlank(this.title);
        String strFirstNonBlank4 = AvatarSharePresentationJsonKt.firstNonBlank(this.subtitle);
        if (strFirstNonBlank4 == null || (strFirstNonBlank = AvatarSharePresentationJsonKt.firstNonBlank(this.fallback_text, this.fallbackText)) == null) {
            return null;
        }
        String str = this.video_variant;
        if (str == null || str.equals(AvatarSharePresentationJsonKt.VIDEO_VARIANT_NOT_SENT) || (avatarVideoVariantFromKey = AvatarVideoVariant.Companion.fromKey(str)) == null) {
            avatarVideoVariantFromKey = AvatarVideoVariant.IDLE;
        }
        return new AvatarSharePresentationData(strFirstNonBlank2, strFirstNonBlank3, strFirstNonBlank4, strFirstNonBlank, avatarVideoVariantFromKey, AnonymousClass002.A1X(this.video_variant));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AvatarSharePresentationJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.button_text = null;
        } else {
            this.button_text = str;
        }
        if ((i & 2) == 0) {
            this.buttonText = null;
        } else {
            this.buttonText = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
        if ((i & 16) == 0) {
            this.fallback_text = null;
        } else {
            this.fallback_text = str5;
        }
        if ((i & 32) == 0) {
            this.fallbackText = null;
        } else {
            this.fallbackText = str6;
        }
        if ((i & 64) == 0) {
            this.video_variant = AvatarSharePresentationJsonKt.VIDEO_VARIANT_NOT_SENT;
        } else {
            this.video_variant = str7;
        }
    }

    public AvatarSharePresentationJson(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.button_text = str;
        this.buttonText = str2;
        this.title = str3;
        this.subtitle = str4;
        this.fallback_text = str5;
        this.fallbackText = str6;
        this.video_variant = str7;
    }

    public /* synthetic */ AvatarSharePresentationJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? AvatarSharePresentationJsonKt.VIDEO_VARIANT_NOT_SENT : str7);
    }
}
