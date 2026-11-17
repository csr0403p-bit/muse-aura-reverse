package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class OnboardingPersonality extends C06G {
    public final String id;
    public final boolean isPlaceholder;
    public final String label;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingPersonality) {
                OnboardingPersonality onboardingPersonality = (OnboardingPersonality) obj;
                if (!C7384Etj.areEqual(this.id, onboardingPersonality.id) || !C7384Etj.areEqual(this.label, onboardingPersonality.label) || this.isPlaceholder != onboardingPersonality.isPlaceholder) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingPersonality copy$default(OnboardingPersonality onboardingPersonality, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingPersonality.id;
        }
        if ((i & 2) != 0) {
            str2 = onboardingPersonality.label;
        }
        if ((i & 4) != 0) {
            z = onboardingPersonality.isPlaceholder;
        }
        return onboardingPersonality.copy(str, str2, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.label;
    }

    public final boolean component3() {
        return this.isPlaceholder;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.id)), this.isPlaceholder);
    }

    public final boolean isPlaceholder() {
        return this.isPlaceholder;
    }

    public OnboardingPersonality(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.label = str2;
        this.isPlaceholder = z;
    }

    public final OnboardingPersonality copy(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new OnboardingPersonality(str, str2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingPersonality(String str, String str2, boolean z, int i, C06H c06h) {
        this(str, str2, AnonymousClass005.A1O(i, z));
    }
}
