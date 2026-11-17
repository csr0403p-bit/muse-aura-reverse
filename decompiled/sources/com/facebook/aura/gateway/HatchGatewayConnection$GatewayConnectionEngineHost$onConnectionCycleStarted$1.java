package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BV5;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$onConnectionCycleStarted$1", f = "HatchGatewayConnection.kt", l = {2246}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$onConnectionCycleStarted$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $vmId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$onConnectionCycleStarted$1(String str, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$onConnectionCycleStarted$1> htJ) {
        super(2, htJ);
        this.$vmId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$onConnectionCycleStarted$1(this.$vmId, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$onConnectionCycleStarted$1(this.$vmId, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchVmWakeApi hatchVmWakeApi = HatchVmWakeApi.INSTANCE;
            String str = this.$vmId;
            String strA0j = BV5.A0j();
            HatchVmWakeTrigger hatchVmWakeTrigger = HatchVmWakeTrigger.BACKGROUND_CYCLE;
            this.label = 1;
            if (hatchVmWakeApi.wakeVm(str, -2, strA0j, hatchVmWakeTrigger, null, null, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
