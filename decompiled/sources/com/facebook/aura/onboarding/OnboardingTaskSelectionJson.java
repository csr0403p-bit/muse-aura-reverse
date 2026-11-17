package com.facebook.aura.onboarding;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OnboardingTaskSelectionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String task_id;

    public final class Companion {
        public final C9hr<OnboardingTaskSelectionJson> serializer() {
            return OnboardingTaskSelectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final OnboardingTaskSelectionJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new OnboardingTaskSelectionJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnboardingTaskSelectionJson) && C7384Etj.areEqual(this.task_id, ((OnboardingTaskSelectionJson) obj).task_id));
    }

    public /* synthetic */ OnboardingTaskSelectionJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(OnboardingTaskSelectionJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.task_id = str;
    }

    public static /* synthetic */ OnboardingTaskSelectionJson copy$default(OnboardingTaskSelectionJson onboardingTaskSelectionJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingTaskSelectionJson.task_id;
        }
        C7384Etj.A0Y(str, 0);
        return new OnboardingTaskSelectionJson(str);
    }

    public final String component1() {
        return this.task_id;
    }

    public final String getTask_id() {
        return this.task_id;
    }

    public int hashCode() {
        return this.task_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public OnboardingTaskSelectionJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.task_id = str;
    }
}
