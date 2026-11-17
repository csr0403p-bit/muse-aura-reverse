package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsActivityItemsKt$ConnectionsActivityDetail$logClick$1$1 extends AbstractC7559F3s implements G0U<HatchComponent, Unit> {
    public final /* synthetic */ ConnectionsActivity $activity;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ int $position;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchComponent hatchComponent) {
        C7384Etj.A0Y(hatchComponent, 0);
        ConnectionsActivityItemsKt.logActivityClick(this.$log, this.$activity, this.$position, hatchComponent, HatchSubsurface.CONNECTIONS_ACTIVITY);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsActivityItemsKt$ConnectionsActivityDetail$logClick$1$1(ConnectionsLogContext connectionsLogContext, ConnectionsActivity connectionsActivity, int i) {
        super(1);
        this.$log = connectionsLogContext;
        this.$activity = connectionsActivity;
        this.$position = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchComponent hatchComponent) {
        invoke2(hatchComponent);
        return Unit.INSTANCE;
    }
}
