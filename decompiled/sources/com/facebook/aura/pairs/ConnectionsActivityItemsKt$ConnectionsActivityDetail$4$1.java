package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsActivityItemsKt$ConnectionsActivityDetail$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PairsContact $confirmContact;
    public final /* synthetic */ G0U<HatchComponent, Unit> $logClick;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsActivityItemsKt$ConnectionsActivityDetail$4$1(G0U<? super HatchComponent, Unit> g0u, ConnectionsViewModel connectionsViewModel, PairsContact pairsContact) {
        super(0);
        this.$logClick = g0u;
        this.$viewModel = connectionsViewModel;
        this.$confirmContact = pairsContact;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$logClick.invoke(HatchComponent.NOT_THEM_BUTTON);
        this.$viewModel.remove(this.$confirmContact, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
