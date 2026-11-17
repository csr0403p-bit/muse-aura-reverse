package com.facebook.aura.onboarding;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OnboardingTasksPayloadJson extends C06G {
    public final List<OnboardingTaskJson> tasks;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, OnboardingTasksPayloadJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<OnboardingTasksPayloadJson> serializer() {
            return OnboardingTasksPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final OnboardingTasksPayloadJson copy(List<OnboardingTaskJson> list) {
        C7384Etj.A0Y(list, 0);
        return new OnboardingTasksPayloadJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnboardingTasksPayloadJson) && C7384Etj.areEqual(this.tasks, ((OnboardingTasksPayloadJson) obj).tasks));
    }

    public static /* synthetic */ OnboardingTasksPayloadJson copy$default(OnboardingTasksPayloadJson onboardingTasksPayloadJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onboardingTasksPayloadJson.tasks;
        }
        C7384Etj.A0Y(list, 0);
        return new OnboardingTasksPayloadJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_onboarding(OnboardingTasksPayloadJson onboardingTasksPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(onboardingTasksPayloadJson.tasks)) {
            c9j5.AAQ(onboardingTasksPayloadJson.tasks, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<OnboardingTaskJson> component1() {
        return this.tasks;
    }

    public final List<OnboardingTaskJson> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return this.tasks.hashCode();
    }

    public final List<OnboardingTask> toDomain() {
        List<OnboardingTaskJson> list = this.tasks;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<OnboardingTaskJson> it = list.iterator();
        while (it.hasNext()) {
            OnboardingTask domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        return arrayListA0h;
    }

    public /* synthetic */ OnboardingTasksPayloadJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.tasks = C0881AGi.A00;
        } else {
            this.tasks = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public OnboardingTasksPayloadJson(List<OnboardingTaskJson> list) {
        C7384Etj.A0Y(list, 0);
        this.tasks = list;
    }

    public /* synthetic */ OnboardingTasksPayloadJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public OnboardingTasksPayloadJson() {
        this(C0881AGi.A00);
    }
}
