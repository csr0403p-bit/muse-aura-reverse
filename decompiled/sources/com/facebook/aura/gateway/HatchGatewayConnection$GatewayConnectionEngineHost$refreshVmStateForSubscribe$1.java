package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchVmRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$refreshVmStateForSubscribe$1", f = "HatchGatewayConnection.kt", l = {2176}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$refreshVmStateForSubscribe$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $connectionCycle;
    public final /* synthetic */ long $epoch;
    public final /* synthetic */ String $trigger;
    public int label;
    public final /* synthetic */ HatchGatewayConnection.GatewayConnectionEngineHost this$0;
    public final /* synthetic */ HatchGatewayConnection this$1;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$refreshVmStateForSubscribe$1$1", f = "HatchGatewayConnection.kt", l = {2187}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$refreshVmStateForSubscribe$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $connectionCycle;
        public final /* synthetic */ long $epoch;
        public final /* synthetic */ String $trigger;
        public int label;
        public final /* synthetic */ HatchGatewayConnection.GatewayConnectionEngineHost this$0;
        public final /* synthetic */ HatchGatewayConnection this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, int i, String str, long j, HatchGatewayConnection hatchGatewayConnection, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.this$0 = gatewayConnectionEngineHost;
            this.$connectionCycle = i;
            this.$trigger = str;
            this.$epoch = j;
            this.this$1 = hatchGatewayConnection;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$connectionCycle, this.$trigger, this.$epoch, this.this$1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchVmRepository.FetchAndCacheLeasedVmResult.Success success;
            Boolean bool;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                int i2 = this.this$0.lastVmStateRefreshConnectionCycle;
                int i3 = this.$connectionCycle;
                if (i2 != i3) {
                    this.this$0.lastVmStateRefreshConnectionCycle = i3;
                    CFK.A01(this.$trigger, C3cG.A0R(this.$connectionCycle), C3cG.A0S(this.$epoch), HatchGatewayConnectionKt.TAG, "Refreshing VM state while awaiting chat.subscribe (trigger=%s cycle=%d epoch=%d)");
                    HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
                    AbstractC3358CGz abstractC3358CGz = this.this$1.userSession;
                    VmFetchSource vmFetchSource = VmFetchSource.GATEWAY_SUBSCRIBE_STATUS;
                    this.label = 1;
                    obj = hatchVmRepository.fetchAndCacheExistingVm(abstractC3358CGz, vmFetchSource, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchVmRepository.FetchAndCacheLeasedVmResult fetchAndCacheLeasedVmResult = (HatchVmRepository.FetchAndCacheLeasedVmResult) obj;
            if ((fetchAndCacheLeasedVmResult instanceof HatchVmRepository.FetchAndCacheLeasedVmResult.Success) && (success = (HatchVmRepository.FetchAndCacheLeasedVmResult.Success) fetchAndCacheLeasedVmResult) != null && (bool = success.selectedVmStarting) != null) {
                boolean zBooleanValue = bool.booleanValue();
                if (this.this$0.isAwaitingSubscribe(this.$connectionCycle, this.$epoch)) {
                    HatchVmStateStore companion = HatchVmStateStore.Companion.getInstance(this.this$1.userSession);
                    this.this$1.getEngine().noteVmState(this.$epoch, zBooleanValue);
                    if (!this.this$0.isAwaitingSubscribe(this.$connectionCycle, this.$epoch) && this.this$0.lastVmStateRefreshConnectionCycle == this.$connectionCycle) {
                        companion.clearStarting$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway();
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$refreshVmStateForSubscribe$1(HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, int i, String str, long j, HatchGatewayConnection hatchGatewayConnection, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$refreshVmStateForSubscribe$1> htJ) {
        super(2, htJ);
        this.this$0 = gatewayConnectionEngineHost;
        this.$connectionCycle = i;
        this.$trigger = str;
        this.$epoch = j;
        this.this$1 = hatchGatewayConnection;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$refreshVmStateForSubscribe$1(this.this$0, this.$connectionCycle, this.$trigger, this.$epoch, this.this$1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost = this.this$0;
            SingleFlight singleFlight = gatewayConnectionEngineHost.vmStateRefreshSingleFlight;
            int i2 = this.$connectionCycle;
            Integer numA0R = C3cG.A0R(i2);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(gatewayConnectionEngineHost, i2, this.$trigger, this.$epoch, this.this$1, null);
            this.label = 1;
            if (singleFlight.invoke(numA0R, anonymousClass1, this) == enumC10460Hji) {
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

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$refreshVmStateForSubscribe$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
