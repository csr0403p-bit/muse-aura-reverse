package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;

/* loaded from: classes2.dex */
public final class GoalsCompletedScreenKt$GoalsCompletedScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchGoalsTabViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalsCompletedScreenKt$GoalsCompletedScreen$1$1(HatchGoalsTabViewModel hatchGoalsTabViewModel) {
        super(1);
        this.$viewModel = hatchGoalsTabViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.loadCompleted();
        return new C78g() { // from class: com.facebook.aura.library.view.GoalsCompletedScreenKt$GoalsCompletedScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
