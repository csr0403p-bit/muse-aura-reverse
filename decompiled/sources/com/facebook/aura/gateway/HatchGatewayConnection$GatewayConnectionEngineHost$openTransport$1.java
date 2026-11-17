package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.C10543Hqv;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.F1F;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import com.facebook.aura.gateway.HatchCvmAuthenticationState;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;
import com.facebook.aura.network.transport.HatchWebSocketConfig;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1", f = "HatchGatewayConnection.kt", l = {1267, 1272, 1468}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $connectionCycle;
    public final /* synthetic */ long $epoch;
    public final /* synthetic */ boolean $forceCredentialRefresh;
    public final /* synthetic */ String $forcedRefreshReason;
    public final /* synthetic */ G0V<Integer, String, Unit> $onClosed;
    public final /* synthetic */ Function0<Unit> $onConnecting;
    public final /* synthetic */ G0W<String, Integer, HatchNoiseHandshakeOutcome, Unit> $onFailed;
    public final /* synthetic */ G0U<String, Unit> $onOpened;
    public final /* synthetic */ Function0<Unit> $onSubscribing;
    public final /* synthetic */ G0V<String, String, Unit> $onUrlUnavailable;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ HatchGatewayConnection this$0;
    public final /* synthetic */ HatchGatewayConnection.GatewayConnectionEngineHost this$1;

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0U<HatchNoisePrivateAuth, Unit> {
        public final /* synthetic */ C10543Hqv<String> $authToken;
        public final /* synthetic */ HatchVmConfidentiality $confidentialityBeforeAttempt;
        public final /* synthetic */ int $connectionCycle;
        public final /* synthetic */ long $epoch;
        public final /* synthetic */ G0V<Integer, String, Unit> $onClosed;
        public final /* synthetic */ G0W<String, Integer, HatchNoiseHandshakeOutcome, Unit> $onFailed;
        public final /* synthetic */ G0U<String, Unit> $onOpened;
        public final /* synthetic */ Function0<Unit> $onSubscribing;
        public final /* synthetic */ HatchGatewayPrefsStore $prefsStore;
        public final /* synthetic */ NoisePrivateAuthAttempt $privateAuthAttempt;
        public final /* synthetic */ F1F $superseded;
        public final /* synthetic */ String $vmId;
        public final /* synthetic */ C10543Hqv<String> $wsUrl;
        public final /* synthetic */ HatchGatewayConnection this$0;
        public final /* synthetic */ HatchGatewayConnection.GatewayConnectionEngineHost this$1;

        /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1$10$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchGatewayStateSnapshot, HatchGatewayStateSnapshot> {
            public final /* synthetic */ HatchWebSocketConfig $config;

            @Override // X.G0U
            public final HatchGatewayStateSnapshot invoke(HatchGatewayStateSnapshot hatchGatewayStateSnapshot) {
                HatchCvmAuthenticationState hatchCvmAuthenticationState;
                C7384Etj.A0Y(hatchGatewayStateSnapshot, 0);
                HatchNoisePrivateAuth hatchNoisePrivateAuth = this.$config.noisePrivateAuth;
                if (hatchNoisePrivateAuth == null) {
                    hatchCvmAuthenticationState = HatchCvmAuthenticationState.Disabled.INSTANCE;
                } else {
                    if (!hatchNoisePrivateAuth.equals(HatchNoisePrivateAuth.Discover.INSTANCE) && !(hatchNoisePrivateAuth instanceof HatchNoisePrivateAuth.DiscoverPinned) && !(hatchNoisePrivateAuth instanceof HatchNoisePrivateAuth.Authenticate)) {
                        throw C3cG.A0q();
                    }
                    hatchCvmAuthenticationState = HatchCvmAuthenticationState.Verifying.INSTANCE;
                }
                return hatchGatewayStateSnapshot.copy(hatchGatewayStateSnapshot.connection, hatchCvmAuthenticationState, hatchGatewayStateSnapshot.connectionCycle);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchWebSocketConfig hatchWebSocketConfig) {
                super(1);
                this.$config = hatchWebSocketConfig;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(HatchGatewayConnection hatchGatewayConnection, HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, HatchGatewayPrefsStore hatchGatewayPrefsStore, String str, C10543Hqv<String> c10543Hqv, C10543Hqv<String> c10543Hqv2, long j, F1F f1f, NoisePrivateAuthAttempt noisePrivateAuthAttempt, HatchVmConfidentiality hatchVmConfidentiality, Function0<Unit> function0, G0U<? super String, Unit> g0u, G0V<? super Integer, ? super String, Unit> g0v, G0W<? super String, ? super Integer, ? super HatchNoiseHandshakeOutcome, Unit> g0w, int i) {
            super(1);
            this.this$0 = hatchGatewayConnection;
            this.this$1 = gatewayConnectionEngineHost;
            this.$prefsStore = hatchGatewayPrefsStore;
            this.$vmId = str;
            this.$wsUrl = c10543Hqv;
            this.$authToken = c10543Hqv2;
            this.$epoch = j;
            this.$superseded = f1f;
            this.$privateAuthAttempt = noisePrivateAuthAttempt;
            this.$confidentialityBeforeAttempt = hatchVmConfidentiality;
            this.$onSubscribing = function0;
            this.$onOpened = g0u;
            this.$onClosed = g0v;
            this.$onFailed = g0w;
            this.$connectionCycle = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2(com.facebook.aura.network.transport.HatchNoisePrivateAuth r24) {
            /*
                Method dump skipped, instructions count: 379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1.AnonymousClass10.invoke2(com.facebook.aura.network.transport.HatchNoisePrivateAuth):void");
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchNoisePrivateAuth hatchNoisePrivateAuth) {
            invoke2(hatchNoisePrivateAuth);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1(HatchGatewayConnection hatchGatewayConnection, G0V<? super String, ? super String, Unit> g0v, boolean z, HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, long j, int i, String str, G0W<? super String, ? super Integer, ? super HatchNoiseHandshakeOutcome, Unit> g0w, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u, G0V<? super Integer, ? super String, Unit> g0v2, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGatewayConnection;
        this.$onUrlUnavailable = g0v;
        this.$forceCredentialRefresh = z;
        this.this$1 = gatewayConnectionEngineHost;
        this.$epoch = j;
        this.$connectionCycle = i;
        this.$forcedRefreshReason = str;
        this.$onFailed = g0w;
        this.$onConnecting = function0;
        this.$onSubscribing = function02;
        this.$onOpened = g0u;
        this.$onClosed = g0v2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1 hatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1 = new HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1(this.this$0, this.$onUrlUnavailable, this.$forceCredentialRefresh, this.this$1, this.$epoch, this.$connectionCycle, this.$forcedRefreshReason, this.$onFailed, this.$onConnecting, this.$onSubscribing, this.$onOpened, this.$onClosed, htJ);
        hatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1.L$0 = obj;
        return hatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0159: IF  (r10 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:49:0x015d (LINE:345), block:B:47:0x0159 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0153: INVOKE 
  (r0v16 ?? I:com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost)
  (r13 I:java.lang.Long)
  (r7 I:java.lang.Long)
 STATIC call: com.facebook.aura.gateway.HatchGatewayConnection.GatewayConnectionEngineHost.access$logCredentialSubspan(com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost, java.lang.Long, java.lang.Long):void A[MD:(com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost, java.lang.Long, java.lang.Long):void (m)] (LINE:339), block:B:46:0x013f */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x044b A[Catch: all -> 0x04a0, TryCatch #0 {all -> 0x04a0, blocks: (B:160:0x0441, B:162:0x044b, B:163:0x044e, B:165:0x0495), top: B:182:0x0441 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x044e A[Catch: all -> 0x04a0, TryCatch #0 {all -> 0x04a0, blocks: (B:160:0x0441, B:162:0x044b, B:163:0x044e, B:165:0x0495), top: B:182:0x0441 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Type inference failed for: r0v90, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v91, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, java.lang.String] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
