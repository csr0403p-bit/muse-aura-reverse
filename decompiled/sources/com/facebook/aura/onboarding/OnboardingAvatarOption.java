package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class OnboardingAvatarOption extends C06G {
    public final String id;
    public final String uri;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingAvatarOption) {
                OnboardingAvatarOption onboardingAvatarOption = (OnboardingAvatarOption) obj;
                if (!C7384Etj.areEqual(this.id, onboardingAvatarOption.id) || !C7384Etj.areEqual(this.uri, onboardingAvatarOption.uri)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingAvatarOption copy$default(OnboardingAvatarOption onboardingAvatarOption, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingAvatarOption.id;
        }
        if ((i & 2) != 0) {
            str2 = onboardingAvatarOption.uri;
        }
        AnonymousClass003.A0u(str, str2);
        return new OnboardingAvatarOption(str, str2);
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

    public OnboardingAvatarOption(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.uri = str2;
    }

    public final OnboardingAvatarOption copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new OnboardingAvatarOption(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
