package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsActivityItemsKt$ConnectionsActivityDetail$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchComponent, Unit> $logClick;
    public final /* synthetic */ PairsInboxRequest $request;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsActivityItemsKt$ConnectionsActivityDetail$1$1(G0U<? super HatchComponent, Unit> g0u, ConnectionsViewModel connectionsViewModel, PairsInboxRequest pairsInboxRequest) {
        super(0);
        this.$logClick = g0u;
        this.$viewModel = connectionsViewModel;
        this.$request = pairsInboxRequest;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$logClick.invoke(HatchComponent.ACCEPT_BUTTON);
        this.$viewModel.accept(this.$request);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
