package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$handleFailure$4$1", f = "HatchGatewayConnection.kt", l = {2107}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$handleFailure$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $connectionSessionId;
    public final /* synthetic */ GatewayConnectionCycleStart $cycleStart;
    public final /* synthetic */ int $retryCount;
    public final /* synthetic */ String $vmId;
    public int label;
    public final /* synthetic */ HatchGatewayConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$handleFailure$4$1(HatchGatewayConnection hatchGatewayConnection, String str, int i, String str2, GatewayConnectionCycleStart gatewayConnectionCycleStart, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$handleFailure$4$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGatewayConnection;
        this.$vmId = str;
        this.$retryCount = i;
        this.$connectionSessionId = str2;
        this.$cycleStart = gatewayConnectionCycleStart;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$handleFailure$4$1(this.this$0, this.$vmId, this.$retryCount, this.$connectionSessionId, this.$cycleStart, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Long lA0S;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.this$0.isVmDisabled()) {
                HatchVmWakeApi hatchVmWakeApi = HatchVmWakeApi.INSTANCE;
                String str = this.$vmId;
                int i2 = this.$retryCount;
                String str2 = this.$connectionSessionId;
                HatchVmWakeTrigger hatchVmWakeTrigger = HatchVmWakeTrigger.CONNECT_FAILURE;
                GatewayConnectionCycleStart gatewayConnectionCycleStart = this.$cycleStart;
                Long lA0S2 = null;
                if (gatewayConnectionCycleStart != null) {
                    lA0S = C3cG.A0S(gatewayConnectionCycleStart.monotonicTimestampNs);
                    lA0S2 = C3cG.A0S(gatewayConnectionCycleStart.wallTimeMs);
                } else {
                    lA0S = null;
                }
                this.label = 1;
                if (hatchVmWakeApi.wakeVm(str, i2, str2, hatchVmWakeTrigger, lA0S, lA0S2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$handleFailure$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
