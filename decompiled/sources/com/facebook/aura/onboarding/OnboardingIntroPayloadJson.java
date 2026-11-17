package com.facebook.aura.onboarding;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.onboarding.entrycontext.HatchEntryContextStatus;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OnboardingIntroPayloadJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String entry_context_status;
    public final String mode;
    public final Boolean onboarding_complete;
    public final String variant;

    public final class Companion {
        public final C9hr<OnboardingIntroPayloadJson> serializer() {
            return OnboardingIntroPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_onboarding(OnboardingIntroPayloadJson onboardingIntroPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || onboardingIntroPayloadJson.mode != null) {
            c9j5.AAP(onboardingIntroPayloadJson.mode, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || onboardingIntroPayloadJson.variant != null) {
            c9j5.AAP(onboardingIntroPayloadJson.variant, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || onboardingIntroPayloadJson.entry_context_status != null) {
            c9j5.AAP(onboardingIntroPayloadJson.entry_context_status, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || onboardingIntroPayloadJson.onboarding_complete != null) {
            c9j5.AAP(onboardingIntroPayloadJson.onboarding_complete, C07839ix.A00, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingIntroPayloadJson) {
                OnboardingIntroPayloadJson onboardingIntroPayloadJson = (OnboardingIntroPayloadJson) obj;
                if (!C7384Etj.areEqual(this.mode, onboardingIntroPayloadJson.mode) || !C7384Etj.areEqual(this.variant, onboardingIntroPayloadJson.variant) || !C7384Etj.areEqual(this.entry_context_status, onboardingIntroPayloadJson.entry_context_status) || !C7384Etj.areEqual(this.onboarding_complete, onboardingIntroPayloadJson.onboarding_complete)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingIntroPayloadJson copy$default(OnboardingIntroPayloadJson onboardingIntroPayloadJson, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingIntroPayloadJson.mode;
        }
        if ((i & 2) != 0) {
            str2 = onboardingIntroPayloadJson.variant;
        }
        if ((i & 4) != 0) {
            str3 = onboardingIntroPayloadJson.entry_context_status;
        }
        if ((i & 8) != 0) {
            bool = onboardingIntroPayloadJson.onboarding_complete;
        }
        return new OnboardingIntroPayloadJson(str, str2, str3, bool);
    }

    public final String component1() {
        return this.mode;
    }

    public final String component2() {
        return this.variant;
    }

    public final String component3() {
        return this.entry_context_status;
    }

    public final Boolean component4() {
        return this.onboarding_complete;
    }

    public final OnboardingIntroPayloadJson copy(String str, String str2, String str3, Boolean bool) {
        return new OnboardingIntroPayloadJson(str, str2, str3, bool);
    }

    public final String getEntry_context_status() {
        return this.entry_context_status;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Boolean getOnboarding_complete() {
        return this.onboarding_complete;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.mode) * 31) + AnonymousClass006.A0G(this.variant)) * 31) + AnonymousClass006.A0G(this.entry_context_status)) * 31) + C3cH.A02(this.onboarding_complete);
    }

    public final OnboardingIntroResponse toDomain() {
        String str = this.mode;
        if (str == null) {
            str = this.variant;
        }
        String str2 = this.entry_context_status;
        return new OnboardingIntroResponse(str, str2 != null ? HatchEntryContextStatus.Companion.fromServerValue(str2) : null, this.onboarding_complete);
    }

    public /* synthetic */ OnboardingIntroPayloadJson(int i, String str, String str2, String str3, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.mode = null;
        } else {
            this.mode = str;
        }
        if ((i & 2) == 0) {
            this.variant = null;
        } else {
            this.variant = str2;
        }
        if ((i & 4) == 0) {
            this.entry_context_status = null;
        } else {
            this.entry_context_status = str3;
        }
        if ((i & 8) == 0) {
            this.onboarding_complete = null;
        } else {
            this.onboarding_complete = bool;
        }
    }

    public String toString() {
        return super.toString();
    }

    public OnboardingIntroPayloadJson(String str, String str2, String str3, Boolean bool) {
        this.mode = str;
        this.variant = str2;
        this.entry_context_status = str3;
        this.onboarding_complete = bool;
    }

    public /* synthetic */ OnboardingIntroPayloadJson(String str, String str2, String str3, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }

    public OnboardingIntroPayloadJson() {
        this(null, null, null, null);
    }
}
