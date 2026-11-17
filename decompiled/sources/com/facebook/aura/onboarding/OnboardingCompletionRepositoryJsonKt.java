package com.facebook.aura.onboarding;

import X.AnonymousClass003;
import X.C7384Etj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class OnboardingCompletionRepositoryJsonKt {
    public static final List<OnboardingTaskSelectionJson> buildTaskSelections(List<OnboardingTask> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<OnboardingTask> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(new OnboardingTaskSelectionJson(it.next().id));
        }
        return arrayListA0i;
    }
}
