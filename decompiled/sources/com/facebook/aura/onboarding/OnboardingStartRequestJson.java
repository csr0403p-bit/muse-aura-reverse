package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class OnboardingStartRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String entry_context_token;
    public final String timezone;
    public final String variant;

    public final class Companion {
        public final C9hr<OnboardingStartRequestJson> serializer() {
            return OnboardingStartRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public OnboardingStartRequestJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.timezone = str;
        this.variant = str2;
        this.entry_context_token = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_onboarding(OnboardingStartRequestJson onboardingStartRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(onboardingStartRequestJson.timezone, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || onboardingStartRequestJson.variant != null) {
            c9j5.AAP(onboardingStartRequestJson.variant, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || onboardingStartRequestJson.entry_context_token != null) {
            c9j5.AAP(onboardingStartRequestJson.entry_context_token, C07779iq.A01, c9iZ, 2);
        }
    }

    public final OnboardingStartRequestJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new OnboardingStartRequestJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingStartRequestJson) {
                OnboardingStartRequestJson onboardingStartRequestJson = (OnboardingStartRequestJson) obj;
                if (!C7384Etj.areEqual(this.timezone, onboardingStartRequestJson.timezone) || !C7384Etj.areEqual(this.variant, onboardingStartRequestJson.variant) || !C7384Etj.areEqual(this.entry_context_token, onboardingStartRequestJson.entry_context_token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingStartRequestJson copy$default(OnboardingStartRequestJson onboardingStartRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingStartRequestJson.timezone;
        }
        if ((i & 2) != 0) {
            str2 = onboardingStartRequestJson.variant;
        }
        if ((i & 4) != 0) {
            str3 = onboardingStartRequestJson.entry_context_token;
        }
        return onboardingStartRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.timezone;
    }

    public final String component2() {
        return this.variant;
    }

    public final String component3() {
        return this.entry_context_token;
    }

    public final String getEntry_context_token() {
        return this.entry_context_token;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.timezone) + AnonymousClass006.A0G(this.variant)) * 31) + AnonymousClass005.A0H(this.entry_context_token);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingStartRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(OnboardingStartRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.timezone = str;
        if ((i & 2) == 0) {
            this.variant = null;
        } else {
            this.variant = str2;
        }
        if ((i & 4) == 0) {
            this.entry_context_token = null;
        } else {
            this.entry_context_token = str3;
        }
    }

    public /* synthetic */ OnboardingStartRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
