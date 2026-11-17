package com.facebook.aura.onboarding;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.onboarding.entrycontext.HatchEntryContextStatus;

/* loaded from: classes3.dex */
public final class OnboardingIntroResponse extends C06G {
    public final HatchEntryContextStatus entryContextStatus;
    public final String mode;
    public final Boolean onboardingComplete;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingIntroResponse) {
                OnboardingIntroResponse onboardingIntroResponse = (OnboardingIntroResponse) obj;
                if (!C7384Etj.areEqual(this.mode, onboardingIntroResponse.mode) || this.entryContextStatus != onboardingIntroResponse.entryContextStatus || !C7384Etj.areEqual(this.onboardingComplete, onboardingIntroResponse.onboardingComplete)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingIntroResponse copy$default(OnboardingIntroResponse onboardingIntroResponse, String str, HatchEntryContextStatus hatchEntryContextStatus, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingIntroResponse.mode;
        }
        if ((i & 2) != 0) {
            hatchEntryContextStatus = onboardingIntroResponse.entryContextStatus;
        }
        if ((i & 4) != 0) {
            bool = onboardingIntroResponse.onboardingComplete;
        }
        return new OnboardingIntroResponse(str, hatchEntryContextStatus, bool);
    }

    public final String component1() {
        return this.mode;
    }

    public final HatchEntryContextStatus component2() {
        return this.entryContextStatus;
    }

    public final Boolean component3() {
        return this.onboardingComplete;
    }

    public final OnboardingIntroResponse copy(String str, HatchEntryContextStatus hatchEntryContextStatus, Boolean bool) {
        return new OnboardingIntroResponse(str, hatchEntryContextStatus, bool);
    }

    public final HatchEntryContextStatus getEntryContextStatus() {
        return this.entryContextStatus;
    }

    public final String getMode() {
        return this.mode;
    }

    public final boolean getNeedsUiFlow() {
        return OnboardingIntroPageKt.ONBOARDING_VARIANT_UI_DRIVEN.equals(this.mode) && !AnonymousClass002.A1b(this.onboardingComplete, true);
    }

    public final Boolean getOnboardingComplete() {
        return this.onboardingComplete;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.mode) * 31) + AnonymousClass006.A0D(this.entryContextStatus)) * 31) + C3cH.A02(this.onboardingComplete);
    }

    public OnboardingIntroResponse(String str, HatchEntryContextStatus hatchEntryContextStatus, Boolean bool) {
        this.mode = str;
        this.entryContextStatus = hatchEntryContextStatus;
        this.onboardingComplete = bool;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingIntroResponse(String str, HatchEntryContextStatus hatchEntryContextStatus, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : hatchEntryContextStatus, (i & 4) != 0 ? null : bool);
    }

    public OnboardingIntroResponse() {
        this(null, null, null);
    }
}
