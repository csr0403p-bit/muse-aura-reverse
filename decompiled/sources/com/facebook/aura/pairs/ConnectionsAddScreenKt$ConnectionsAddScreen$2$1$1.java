package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C60Q;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsAddScreenKt$ConnectionsAddScreen$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsAddScreenKt$ConnectionsAddScreen$2$1$1(ConnectionsLogContext connectionsLogContext, ConnectionsViewModel connectionsViewModel) {
        super(0);
        this.$log = connectionsLogContext;
        this.$viewModel = connectionsViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C60Q.A19(this.$log, PairsAnalytics.INSTANCE);
        this.$viewModel.retry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
