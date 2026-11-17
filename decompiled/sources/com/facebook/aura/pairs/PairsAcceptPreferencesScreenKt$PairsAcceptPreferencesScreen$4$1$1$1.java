package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.pairs.PairsAcceptPreferencesUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$4$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ PairsAcceptPreferencesUiState.Ready $readyState;
    public final /* synthetic */ PairsAcceptPreferencesViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$4$1$1$1(ConnectionsLogContext connectionsLogContext, PairsAcceptPreferencesUiState.Ready ready, PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel) {
        super(0);
        this.$log = connectionsLogContext;
        this.$readyState = ready;
        this.$viewModel = pairsAcceptPreferencesViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        HatchScreen hatchScreen = this.$log.screen;
        HatchComponent hatchComponent = HatchComponent.ACCEPT_BUTTON;
        PairsLevel pairsLevel = this.$readyState.selectedLevel;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(hatchScreen, hatchComponent, null, pairsLevel != null ? pairsAnalytics.level$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(pairsLevel) : null);
        this.$viewModel.accept();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
