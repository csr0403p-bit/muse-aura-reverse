package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$6$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ HatchGoalsTabViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$2$6$1(HatchGoalsTabViewModel hatchGoalsTabViewModel) {
        super(1);
        this.$viewModel = hatchGoalsTabViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$viewModel.setShowGoalsFirst(z);
    }
}
