package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.app.Activity;

/* loaded from: classes3.dex */
public final class SelfieAgeStepScreenKt$SelfieAgeStep$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ SelfieAgeStepViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieAgeStepScreenKt$SelfieAgeStep$2$1(SelfieAgeStepViewModel selfieAgeStepViewModel, Activity activity) {
        super(1);
        this.$viewModel = selfieAgeStepViewModel;
        this.$activity = activity;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onShown();
        final Activity activity = this.$activity;
        final SelfieAgeStepViewModel selfieAgeStepViewModel = this.$viewModel;
        return new C78g() { // from class: com.facebook.aura.ageverification.SelfieAgeStepScreenKt$SelfieAgeStep$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Activity activity2 = activity;
                if (activity2 == null || !activity2.isChangingConfigurations()) {
                    selfieAgeStepViewModel.onHidden();
                }
            }
        };
    }
}
