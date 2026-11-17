package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes.dex */
public final class AvatarSharePresentationData extends C06G implements HatchPresentationData {
    public static final int $stable = 0;
    public final String buttonText;
    public final String fallbackText;
    public final boolean showsAnimation;
    public final String subtitle;
    public final String title;
    public final AvatarVideoVariant videoVariant;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, AvatarSharePresentationData$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<AvatarSharePresentationData> serializer() {
            return AvatarSharePresentationData$$serializer.INSTANCE;
        }

        public final AvatarSharePresentationData fromJson(JsonElement jsonElement) {
            return AvatarSharePresentationJsonKt.parseAvatarSharePresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AvatarSharePresentationData(String str, String str2, String str3, String str4, AvatarVideoVariant avatarVideoVariant, boolean z) {
        AnonymousClass005.A11(str, str3, str4, 0);
        C7384Etj.A0Y(avatarVideoVariant, 4);
        this.buttonText = str;
        this.title = str2;
        this.subtitle = str3;
        this.fallbackText = str4;
        this.videoVariant = avatarVideoVariant;
        this.showsAnimation = z;
    }

    public final AvatarSharePresentationData copy(String str, String str2, String str3, String str4, AvatarVideoVariant avatarVideoVariant, boolean z) {
        AnonymousClass005.A11(str, str3, str4, 0);
        C7384Etj.A0Y(avatarVideoVariant, 4);
        return new AvatarSharePresentationData(str, str2, str3, str4, avatarVideoVariant, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarSharePresentationData) {
                AvatarSharePresentationData avatarSharePresentationData = (AvatarSharePresentationData) obj;
                if (!C7384Etj.areEqual(this.buttonText, avatarSharePresentationData.buttonText) || !C7384Etj.areEqual(this.title, avatarSharePresentationData.title) || !C7384Etj.areEqual(this.subtitle, avatarSharePresentationData.subtitle) || !C7384Etj.areEqual(this.fallbackText, avatarSharePresentationData.fallbackText) || this.videoVariant != avatarSharePresentationData.videoVariant || this.showsAnimation != avatarSharePresentationData.showsAnimation) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AvatarSharePresentationData copy$default(AvatarSharePresentationData avatarSharePresentationData, String str, String str2, String str3, String str4, AvatarVideoVariant avatarVideoVariant, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarSharePresentationData.buttonText;
        }
        if ((i & 2) != 0) {
            str2 = avatarSharePresentationData.title;
        }
        if ((i & 4) != 0) {
            str3 = avatarSharePresentationData.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = avatarSharePresentationData.fallbackText;
        }
        if ((i & 16) != 0) {
            avatarVideoVariant = avatarSharePresentationData.videoVariant;
        }
        if ((i & 32) != 0) {
            z = avatarSharePresentationData.showsAnimation;
        }
        return avatarSharePresentationData.copy(str, str2, str3, str4, avatarVideoVariant, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(AvatarSharePresentationData avatarSharePresentationData, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(avatarSharePresentationData.buttonText, c9iZ, 0);
        c9j5.AAP(avatarSharePresentationData.title, C07779iq.A01, c9iZ, 1);
        c9j5.AAV(avatarSharePresentationData.subtitle, c9iZ, 2);
        c9j5.AAV(avatarSharePresentationData.fallbackText, c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || avatarSharePresentationData.videoVariant != AvatarVideoVariant.IDLE) {
            c9j5.AAQ(avatarSharePresentationData.videoVariant, C06G.A0e(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || !avatarSharePresentationData.showsAnimation) {
            c9j5.AA7(c9iZ, 5, avatarSharePresentationData.showsAnimation);
        }
    }

    public final String component1() {
        return this.buttonText;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.fallbackText;
    }

    public final AvatarVideoVariant component5() {
        return this.videoVariant;
    }

    public final boolean component6() {
        return this.showsAnimation;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getFallbackText() {
        return this.fallbackText;
    }

    public final boolean getShowsAnimation() {
        return this.showsAnimation;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AvatarVideoVariant getVideoVariant() {
        return this.videoVariant;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.videoVariant, AnonymousClass005.A0I(this.fallbackText, AnonymousClass005.A0I(this.subtitle, (AnonymousClass001.A0G(this.buttonText) + AnonymousClass006.A0G(this.title)) * 31))), this.showsAnimation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AvatarSharePresentationData(String str, String str2, String str3, String str4, AvatarVideoVariant avatarVideoVariant, boolean z, int i, C06H c06h) {
        this(str, str2, str3, str4, (i & 16) != 0 ? AvatarVideoVariant.IDLE : avatarVideoVariant, (i & 32) != 0 ? true : z);
    }

    public /* synthetic */ AvatarSharePresentationData(int i, String str, String str2, String str3, String str4, AvatarVideoVariant avatarVideoVariant, boolean z, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(AvatarSharePresentationData$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.buttonText = str;
        this.title = str2;
        this.subtitle = str3;
        this.fallbackText = str4;
        this.videoVariant = (i & 16) == 0 ? AvatarVideoVariant.IDLE : avatarVideoVariant;
        if ((i & 32) == 0) {
            this.showsAnimation = true;
        } else {
            this.showsAnimation = z;
        }
    }
}
