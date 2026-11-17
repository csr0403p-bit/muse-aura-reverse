package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OnboardingAvatarOptionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String id;
    public final String uri;

    public final class Companion {
        public final C9hr<OnboardingAvatarOptionJson> serializer() {
            return OnboardingAvatarOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_onboarding(OnboardingAvatarOptionJson onboardingAvatarOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(onboardingAvatarOptionJson.id)) {
            c9j5.AAV(onboardingAvatarOptionJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(onboardingAvatarOptionJson.uri)) {
            c9j5.AAV(onboardingAvatarOptionJson.uri, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingAvatarOptionJson) {
                OnboardingAvatarOptionJson onboardingAvatarOptionJson = (OnboardingAvatarOptionJson) obj;
                if (!C7384Etj.areEqual(this.id, onboardingAvatarOptionJson.id) || !C7384Etj.areEqual(this.uri, onboardingAvatarOptionJson.uri)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingAvatarOptionJson copy$default(OnboardingAvatarOptionJson onboardingAvatarOptionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingAvatarOptionJson.id;
        }
        if ((i & 2) != 0) {
            str2 = onboardingAvatarOptionJson.uri;
        }
        AnonymousClass003.A0u(str, str2);
        return new OnboardingAvatarOptionJson(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.uri;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.uri, AnonymousClass001.A0G(this.id));
    }

    public final OnboardingAvatarOption toDomain() {
        String str = this.id;
        if (str.length() == 0) {
            return null;
        }
        String str2 = this.uri;
        if (str2.length() != 0) {
            return new OnboardingAvatarOption(str, str2);
        }
        return null;
    }

    public OnboardingAvatarOptionJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.uri = str2;
    }

    public final OnboardingAvatarOptionJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new OnboardingAvatarOptionJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingAvatarOptionJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.uri = "";
        } else {
            this.uri = str2;
        }
    }

    public /* synthetic */ OnboardingAvatarOptionJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public OnboardingAvatarOptionJson() {
        this("", "");
    }
}
