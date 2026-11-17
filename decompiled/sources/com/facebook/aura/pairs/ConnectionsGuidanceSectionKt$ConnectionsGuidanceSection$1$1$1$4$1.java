package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0V<HatchComponent, HatchSubsurface, Unit> $logClick;
    public final /* synthetic */ ConnectionsSharingRule $rule;
    public final /* synthetic */ ConnectionsGuidanceViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$4$1(G0V<? super HatchComponent, ? super HatchSubsurface, Unit> g0v, ConnectionsGuidanceViewModel connectionsGuidanceViewModel, ConnectionsSharingRule connectionsSharingRule) {
        super(0);
        this.$logClick = g0v;
        this.$viewModel = connectionsGuidanceViewModel;
        this.$rule = connectionsSharingRule;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$logClick.invoke(HatchComponent.DELETE_BUTTON, HatchSubsurface.DOT_MENU);
        this.$viewModel.remove(this.$rule);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
