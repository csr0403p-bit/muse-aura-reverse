package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3cI;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$onBack$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<NativeLoginUiState> $uiState$delegate;
    public final /* synthetic */ NativeLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginLinkingDisclosureRoute$onBack$1$1(NativeLoginViewModel nativeLoginViewModel, AuraNavigator auraNavigator, C1BO<NativeLoginUiState> c1bo) {
        super(0);
        this.$viewModel = nativeLoginViewModel;
        this.$navigator = auraNavigator;
        this.$uiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C3cI.A1T(this.$uiState$delegate)) {
            return;
        }
        this.$viewModel.onLinkingDisclosureBackClicked();
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
