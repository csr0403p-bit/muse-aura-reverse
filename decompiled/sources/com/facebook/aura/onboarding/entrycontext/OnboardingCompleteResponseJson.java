package com.facebook.aura.onboarding.entrycontext;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OnboardingCompleteResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Boolean entry_context_accepted;
    public final String entry_context_status;

    public final class Companion {
        public final C9hr<OnboardingCompleteResponseJson> serializer() {
            return OnboardingCompleteResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_entrycontext_entrycontext(OnboardingCompleteResponseJson onboardingCompleteResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || onboardingCompleteResponseJson.entry_context_accepted != null) {
            c9j5.AAP(onboardingCompleteResponseJson.entry_context_accepted, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || onboardingCompleteResponseJson.entry_context_status != null) {
            c9j5.AAP(onboardingCompleteResponseJson.entry_context_status, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingCompleteResponseJson) {
                OnboardingCompleteResponseJson onboardingCompleteResponseJson = (OnboardingCompleteResponseJson) obj;
                if (!C7384Etj.areEqual(this.entry_context_accepted, onboardingCompleteResponseJson.entry_context_accepted) || !C7384Etj.areEqual(this.entry_context_status, onboardingCompleteResponseJson.entry_context_status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingCompleteResponseJson copy$default(OnboardingCompleteResponseJson onboardingCompleteResponseJson, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = onboardingCompleteResponseJson.entry_context_accepted;
        }
        if ((i & 2) != 0) {
            str = onboardingCompleteResponseJson.entry_context_status;
        }
        return new OnboardingCompleteResponseJson(bool, str);
    }

    public final Boolean component1() {
        return this.entry_context_accepted;
    }

    public final String component2() {
        return this.entry_context_status;
    }

    public final OnboardingCompleteResponseJson copy(Boolean bool, String str) {
        return new OnboardingCompleteResponseJson(bool, str);
    }

    public final Boolean getEntry_context_accepted() {
        return this.entry_context_accepted;
    }

    public final String getEntry_context_status() {
        return this.entry_context_status;
    }

    public final HatchEntryContextStatus getResolvedEntryContextStatus() {
        HatchEntryContextStatus hatchEntryContextStatusFromServerValue;
        String str = this.entry_context_status;
        if (str != null && (hatchEntryContextStatusFromServerValue = HatchEntryContextStatus.Companion.fromServerValue(str)) != null) {
            return hatchEntryContextStatusFromServerValue;
        }
        Boolean bool = this.entry_context_accepted;
        if (bool != null) {
            return bool.booleanValue() ? HatchEntryContextStatus.RESOLVED : HatchEntryContextStatus.TERMINAL_MISS;
        }
        return null;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.entry_context_accepted) * 31) + AnonymousClass005.A0H(this.entry_context_status);
    }

    public OnboardingCompleteResponseJson(Boolean bool, String str) {
        this.entry_context_accepted = bool;
        this.entry_context_status = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingCompleteResponseJson(int i, Boolean bool, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.entry_context_accepted = null;
        } else {
            this.entry_context_accepted = bool;
        }
        if ((i & 2) == 0) {
            this.entry_context_status = null;
        } else {
            this.entry_context_status = str;
        }
    }

    public /* synthetic */ OnboardingCompleteResponseJson(Boolean bool, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
    }

    public OnboardingCompleteResponseJson() {
        this(null, null);
    }
}
