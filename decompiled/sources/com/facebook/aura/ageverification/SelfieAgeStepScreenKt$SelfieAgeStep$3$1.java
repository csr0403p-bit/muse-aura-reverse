package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes3.dex */
public final class SelfieAgeStepScreenKt$SelfieAgeStep$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ int $failedRefreshes;
    public final /* synthetic */ SelfieAgeStepViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieAgeStepScreenKt$SelfieAgeStep$3$1(SelfieAgeStepViewModel selfieAgeStepViewModel, int i) {
        super(1);
        this.$viewModel = selfieAgeStepViewModel;
        this.$failedRefreshes = i;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onFailedRefreshes(this.$failedRefreshes);
        return new C78g() { // from class: com.facebook.aura.ageverification.SelfieAgeStepScreenKt$SelfieAgeStep$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
