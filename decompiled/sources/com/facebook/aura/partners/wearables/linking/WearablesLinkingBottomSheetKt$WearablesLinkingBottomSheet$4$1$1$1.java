package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$4$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ WearablesLinkingViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$4$1$1$1(WearablesLinkingViewModel wearablesLinkingViewModel) {
        super(0);
        this.$viewModel = wearablesLinkingViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.enableHatch();
    }
}
