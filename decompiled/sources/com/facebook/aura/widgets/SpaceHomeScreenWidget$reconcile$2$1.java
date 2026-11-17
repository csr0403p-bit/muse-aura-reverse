package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.C6O2;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceHomeScreenWidget$reconcile$2$1 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
    public final /* synthetic */ boolean $isStale;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6O2 c6o2) {
        C7384Etj.A0Y(c6o2, 0);
        c6o2.A07(SpaceWidgetStore.SIGNED_OUT);
        c6o2.A07(SpaceWidgetStore.UPDATED_AT_MS);
        c6o2.A07(SpaceWidgetStore.SNAPSHOT_WIDTH_PX);
        c6o2.A07(SpaceWidgetStore.SNAPSHOT_HEIGHT_PX);
        c6o2.A07(SpaceWidgetStore.VM_URL);
        C6O2.A02(c6o2, SpaceWidgetStore.UNAVAILABLE, false);
        C6O2.A02(c6o2, SpaceWidgetStore.REFRESHING, this.$isStale);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceHomeScreenWidget$reconcile$2$1(boolean z) {
        super(1);
        this.$isStale = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
        invoke2(c6o2);
        return Unit.INSTANCE;
    }
}
