package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$1", f = "HatchGatewayConnection.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public int label;

    public HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$1(HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$1> htJ) {
        super(1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$1(htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        if (htJ != null) {
            htJ.getContext();
        }
        Unit unit = Unit.INSTANCE;
        Hwg.A00(unit);
        return unit;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return Unit.INSTANCE;
    }
}
