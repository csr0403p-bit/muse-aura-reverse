package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$3$1(HatchExploreViewModel hatchExploreViewModel) {
        super(0);
        this.$viewModel = hatchExploreViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.loadIdeasIfNeeded();
    }
}
