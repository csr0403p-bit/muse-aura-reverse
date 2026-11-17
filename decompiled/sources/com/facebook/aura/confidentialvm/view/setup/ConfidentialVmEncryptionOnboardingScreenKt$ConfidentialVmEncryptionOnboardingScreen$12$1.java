package com.facebook.aura.confidentialvm.view.setup;

import X.C7438Evz;
import com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$12$1 extends C7438Evz implements Function0<Unit> {
    public ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$12$1(Object obj) {
        super(0, obj, ConfidentialVmEnrollmentChoiceViewModel.class, "onLearnMoreClick", "onLearnMoreClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfidentialVmEnrollmentChoiceViewModel) this.receiver).onLearnMoreClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
