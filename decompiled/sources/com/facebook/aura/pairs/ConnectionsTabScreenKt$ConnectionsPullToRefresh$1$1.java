package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsTabScreenKt$ConnectionsPullToRefresh$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabScreenKt$ConnectionsPullToRefresh$1$1(ConnectionsViewModel connectionsViewModel) {
        super(0);
        this.$viewModel = connectionsViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PairsAnalytics.INSTANCE.pullToRefresh$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(HatchScreen.CONNECTIONS_HOME);
        this.$viewModel.onPullToRefresh();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
