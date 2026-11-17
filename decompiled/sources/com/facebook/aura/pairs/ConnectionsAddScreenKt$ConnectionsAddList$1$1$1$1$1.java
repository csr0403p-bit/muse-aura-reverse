package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsAddScreenKt$ConnectionsAddList$1$1$1$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasTyped$delegate;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        if (!MutableState.A0A((MutableState) this.$hasTyped$delegate)) {
            MutableState.A09(true, this.$hasTyped$delegate);
            PairsAnalytics.INSTANCE.type$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(this.$log.screen, HatchComponent.SEARCH_BAR, HatchSubsurface.CONNECTIONS_SUGGESTIONS);
        }
        this.$viewModel.onAddQueryChange(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsAddScreenKt$ConnectionsAddList$1$1$1$1$1(ConnectionsLogContext connectionsLogContext, ConnectionsViewModel connectionsViewModel, MutableState<Boolean> mutableState) {
        super(1);
        this.$log = connectionsLogContext;
        this.$viewModel = connectionsViewModel;
        this.$hasTyped$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
