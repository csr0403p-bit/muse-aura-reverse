package com.facebook.aura.user.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
public final class OnboardingScreenCopyJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String disclaimer;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<OnboardingScreenCopyJson> serializer() {
            return OnboardingScreenCopyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_user_repo_repo(OnboardingScreenCopyJson onboardingScreenCopyJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(onboardingScreenCopyJson.title)) {
            c9j5.AAV(onboardingScreenCopyJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(onboardingScreenCopyJson.subtitle)) {
            c9j5.AAV(onboardingScreenCopyJson.subtitle, c9iZ, 1);
        }
        if (zAfR || onboardingScreenCopyJson.disclaimer != null) {
            c9j5.AAP(onboardingScreenCopyJson.disclaimer, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingScreenCopyJson) {
                OnboardingScreenCopyJson onboardingScreenCopyJson = (OnboardingScreenCopyJson) obj;
                if (!C7384Etj.areEqual(this.title, onboardingScreenCopyJson.title) || !C7384Etj.areEqual(this.subtitle, onboardingScreenCopyJson.subtitle) || !C7384Etj.areEqual(this.disclaimer, onboardingScreenCopyJson.disclaimer)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingScreenCopyJson copy$default(OnboardingScreenCopyJson onboardingScreenCopyJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingScreenCopyJson.title;
        }
        if ((i & 2) != 0) {
            str2 = onboardingScreenCopyJson.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = onboardingScreenCopyJson.disclaimer;
        }
        return onboardingScreenCopyJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.disclaimer;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.subtitle, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0G(this.disclaimer);
    }

    public OnboardingScreenCopyJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.subtitle = str2;
        this.disclaimer = str3;
    }

    public final OnboardingScreenCopyJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new OnboardingScreenCopyJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingScreenCopyJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = str3;
        }
    }

    public /* synthetic */ OnboardingScreenCopyJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public OnboardingScreenCopyJson() {
        this("", "", null);
    }
}
