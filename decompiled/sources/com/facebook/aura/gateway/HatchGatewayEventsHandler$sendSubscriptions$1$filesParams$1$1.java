package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7pd;
import X.C9oY;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchGatewayEventsHandler$sendSubscriptions$1$filesParams$1$1 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
    public static final HatchGatewayEventsHandler$sendSubscriptions$1$filesParams$1$1 INSTANCE = new HatchGatewayEventsHandler$sendSubscriptions$1$filesParams$1$1();

    public HatchGatewayEventsHandler$sendSubscriptions$1$filesParams$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C7pd c7pd) {
        C7384Etj.A0Y(c7pd, 0);
        c7pd.A06(C9oY.A07("workspace"));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
        invoke2(c7pd);
        return Unit.INSTANCE;
    }
}
