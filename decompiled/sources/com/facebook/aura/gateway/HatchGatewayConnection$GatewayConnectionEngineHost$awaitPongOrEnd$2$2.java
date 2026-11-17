package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$2", f = "HatchGatewayConnection.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$2 extends AbstractC07127nr implements G0V<Unit, HtJ<? super Unit>, Object> {
    public int label;

    public HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$2(HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$2> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$2(htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, HtJ<? super Unit> htJ) {
        HtJ<? super Unit> htJ2 = htJ;
        if (htJ2 != null) {
            htJ2.getContext();
        }
        Unit unit2 = Unit.INSTANCE;
        Hwg.A00(unit2);
        return unit2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, HtJ<? super Unit> htJ) {
        if (htJ != null) {
            htJ.getContext();
        }
        Unit unit2 = Unit.INSTANCE;
        Hwg.A00(unit2);
        return unit2;
    }
}
