package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsActivityItemsKt$ConnectionsActivityItem$logClick$1$1 extends AbstractC7559F3s implements G0V<HatchComponent, HatchSubsurface, Unit> {
    public final /* synthetic */ ConnectionsActivity $activity;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ int $position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsActivityItemsKt$ConnectionsActivityItem$logClick$1$1(ConnectionsLogContext connectionsLogContext, ConnectionsActivity connectionsActivity, int i) {
        super(2);
        this.$log = connectionsLogContext;
        this.$activity = connectionsActivity;
        this.$position = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchComponent hatchComponent, HatchSubsurface hatchSubsurface) {
        AnonymousClass003.A0u(hatchComponent, hatchSubsurface);
        ConnectionsActivityItemsKt.logActivityClick(this.$log, this.$activity, this.$position, hatchComponent, hatchSubsurface);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(HatchComponent hatchComponent, HatchSubsurface hatchSubsurface) {
        invoke2(hatchComponent, hatchSubsurface);
        return Unit.INSTANCE;
    }
}
