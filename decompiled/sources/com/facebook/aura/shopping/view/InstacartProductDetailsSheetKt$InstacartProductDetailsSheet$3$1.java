package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class InstacartProductDetailsSheetKt$InstacartProductDetailsSheet$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ InstacartProductDetailsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstacartProductDetailsSheetKt$InstacartProductDetailsSheet$3$1(InstacartProductDetailsViewModel instacartProductDetailsViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = instacartProductDetailsViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onCloseHandleTapped();
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
