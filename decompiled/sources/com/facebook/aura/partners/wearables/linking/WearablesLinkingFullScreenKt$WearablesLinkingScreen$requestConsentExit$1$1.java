package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C60Q;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingFullScreenKt$WearablesLinkingScreen$requestConsentExit$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $showExitSetupDialog$delegate;
    public final /* synthetic */ C1BO<WearablesLinkingUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingFullScreenKt$WearablesLinkingScreen$requestConsentExit$1$1(C1BO<WearablesLinkingUiState> c1bo, MutableState<Boolean> mutableState) {
        super(0);
        this.$uiState$delegate = c1bo;
        this.$showExitSetupDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C60Q.A0N(this.$uiState$delegate).isLoading) {
            return;
        }
        MutableState.A09(true, this.$showExitSetupDialog$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
