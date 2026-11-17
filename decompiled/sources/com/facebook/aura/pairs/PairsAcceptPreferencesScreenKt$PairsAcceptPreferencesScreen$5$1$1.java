package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$5$1$1 extends AbstractC7559F3s implements G0U<PairsLevel, Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ PairsAcceptPreferencesViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PairsLevel pairsLevel) {
        C7384Etj.A0Y(pairsLevel, 0);
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.CONNECTION_LEVEL_OPTION, null, pairsAnalytics.level$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(pairsLevel));
        this.$viewModel.onLevelSelected(pairsLevel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$5$1$1(ConnectionsLogContext connectionsLogContext, PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel) {
        super(1);
        this.$log = connectionsLogContext;
        this.$viewModel = pairsAcceptPreferencesViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PairsLevel pairsLevel) {
        invoke2(pairsLevel);
        return Unit.INSTANCE;
    }
}
