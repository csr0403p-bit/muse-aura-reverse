package com.facebook.aura.partners.wearables.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class OnboardingIdentityUpdateJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String assistant_name;

    public final class Companion {
        public final C9hr<OnboardingIdentityUpdateJson> serializer() {
            return OnboardingIdentityUpdateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final OnboardingIdentityUpdateJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new OnboardingIdentityUpdateJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnboardingIdentityUpdateJson) && C7384Etj.areEqual(this.assistant_name, ((OnboardingIdentityUpdateJson) obj).assistant_name));
    }

    public /* synthetic */ OnboardingIdentityUpdateJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(OnboardingIdentityUpdateJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.assistant_name = str;
    }

    public static /* synthetic */ OnboardingIdentityUpdateJson copy$default(OnboardingIdentityUpdateJson onboardingIdentityUpdateJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingIdentityUpdateJson.assistant_name;
        }
        C7384Etj.A0Y(str, 0);
        return new OnboardingIdentityUpdateJson(str);
    }

    public final String component1() {
        return this.assistant_name;
    }

    public final String getAssistant_name() {
        return this.assistant_name;
    }

    public int hashCode() {
        return this.assistant_name.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public OnboardingIdentityUpdateJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.assistant_name = str;
    }
}
