package com.facebook.aura.onboarding;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OnboardingCompleteRequestJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends OnboardingTaskSelectionJson>>> {
    public static final OnboardingCompleteRequestJson$Companion$$childSerializers$1 INSTANCE = new OnboardingCompleteRequestJson$Companion$$childSerializers$1();

    public OnboardingCompleteRequestJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends OnboardingTaskSelectionJson>> invoke() {
        return C3cG.A19(OnboardingTaskSelectionJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends OnboardingTaskSelectionJson>> invoke() {
        return C3cG.A19(OnboardingTaskSelectionJson$$serializer.INSTANCE);
    }
}
