package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsActivityItemsKt$ConnectionsActivityItem$1$2$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0V<HatchComponent, HatchSubsurface, Unit> $logClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsActivityItemsKt$ConnectionsActivityItem$1$2$2$1$1(G0V<? super HatchComponent, ? super HatchSubsurface, Unit> g0v) {
        super(0);
        this.$logClick = g0v;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$logClick.invoke(HatchComponent.THREE_DOTS_MENU, HatchSubsurface.CONNECTIONS_ACTIVITY);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
