package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C60N;
import X.C6ys;
import X.C7384Etj;
import X.C7438Evz;
import X.C79;
import X.CFK;
import X.G0U;
import X.G0V;
import X.GAo;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.connection.ConnectionConfig;
import com.facebook.aura.gateway.connection.ConnectionEngine;
import com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot;
import com.facebook.aura.gateway.connection.ConnectionPhase;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGatewayConnection$engine$2 extends AbstractC7559F3s implements Function0<ConnectionEngine> {
    public final /* synthetic */ HatchGatewayConnection this$0;

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$engine$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0V<ConnectionPhase, Integer, Unit> {
        public AnonymousClass1(Object obj) {
            super(2, obj, HatchGatewayConnection.class, "onPhaseChanged", "onPhaseChanged(Lcom/facebook/aura/gateway/connection/ConnectionPhase;I)V", 0);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(ConnectionPhase connectionPhase, Integer num) {
            invoke(connectionPhase, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(ConnectionPhase connectionPhase, int i) {
            ((HatchGatewayConnection) AnonymousClass006.A0o(connectionPhase, this)).onPhaseChanged(connectionPhase, i);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$engine$2$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<ConnectionLifecycleSnapshot> {
        public final /* synthetic */ HatchGatewayConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchGatewayConnection hatchGatewayConnection) {
            super(0);
            this.this$0 = hatchGatewayConnection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ConnectionLifecycleSnapshot invoke() {
            return this.this$0.engineLifecycleSnapshot();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ ConnectionLifecycleSnapshot invoke() {
            return this.this$0.engineLifecycleSnapshot();
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$engine$2$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Long> {
        public final /* synthetic */ HatchGatewayConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchGatewayConnection hatchGatewayConnection) {
            super(0);
            this.this$0 = hatchGatewayConnection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return HatchGatewayPrefsStore.Companion.getInstance(this.this$0.userSession).getVmRetryAfterMs();
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$engine$2$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements Function0<Integer> {
        public final /* synthetic */ HatchGatewayConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(HatchGatewayConnection hatchGatewayConnection) {
            super(0);
            this.this$0 = hatchGatewayConnection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return HatchGatewayPrefsStore.Companion.getInstance(this.this$0.userSession).getVmMaxRetryCount();
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$engine$2$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return GatewayVmRetryPolicyKt.getGatewayVmRetryPolicy().clientDelayMs;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return GatewayVmRetryPolicyKt.getGatewayVmRetryPolicy().clientDelayMs;
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$engine$2$7, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass7 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(HatchGatewayConnectionKt.getGatewayServiceRestartReconnectDelayMs());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(HatchGatewayConnectionKt.getGatewayServiceRestartReconnectDelayMs());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$engine$2(HatchGatewayConnection hatchGatewayConnection) {
        super(0);
        this.this$0 = hatchGatewayConnection;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ConnectionEngine invoke() {
        HatchGatewayConnection hatchGatewayConnection = this.this$0;
        HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost = hatchGatewayConnection.engineHost;
        GatewayAppLifecycleSource gatewayAppLifecycleSource = new GatewayAppLifecycleSource(hatchGatewayConnection.scope);
        GatewayNetworkSource gatewayNetworkSource = new GatewayNetworkSource(this.this$0.scope);
        HatchGatewayConnection hatchGatewayConnection2 = this.this$0;
        C3UX c3ux = hatchGatewayConnection2.scope;
        ConnectionConfig connectionConfig = ConnectionConfig.DEFAULT;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchGatewayConnection2);
        ConnectionEngine connectionEngine = new ConnectionEngine(gatewayConnectionEngineHost, gatewayAppLifecycleSource, gatewayNetworkSource, c3ux, connectionConfig, ConnectionEngine.AnonymousClass1.INSTANCE, new AnonymousClass2(hatchGatewayConnection2), AnonymousClass3.INSTANCE, new AnonymousClass4(hatchGatewayConnection2), AnonymousClass5.INSTANCE, new AnonymousClass6(hatchGatewayConnection2), AnonymousClass7.INSTANCE, ConnectionEngine.AnonymousClass8.INSTANCE, anonymousClass1);
        HatchGatewayConnection hatchGatewayConnection3 = this.this$0;
        C3UX c3ux2 = hatchGatewayConnection3.scope;
        HatchGatewayConnection$engine$2$8$1 hatchGatewayConnection$engine$2$8$1 = new HatchGatewayConnection$engine$2$8$1(hatchGatewayConnection3, connectionEngine, null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, hatchGatewayConnection$engine$2$8$1, c3ux2);
        GAo.A02(num, c6ys, new HatchGatewayConnection$engine$2$8$2(connectionEngine, null), hatchGatewayConnection3.scope);
        GAo.A02(num, c6ys, new HatchGatewayConnection$engine$2$8$3(connectionEngine, null), hatchGatewayConnection3.scope);
        GAo.A02(num, c6ys, new HatchGatewayConnection$engine$2$8$4(hatchGatewayConnection3, connectionEngine, null), hatchGatewayConnection3.scope);
        GAo.A02(num, c6ys, new HatchGatewayConnection$engine$2$8$5(hatchGatewayConnection3, connectionEngine, null), hatchGatewayConnection3.scope);
        GAo.A02(num, c6ys, new HatchGatewayConnection$engine$2$8$6(hatchGatewayConnection3, connectionEngine, null), hatchGatewayConnection3.scope);
        return connectionEngine;
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$engine$2$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7384Etj.A0Y(th, 0);
            CFK.A08(C60N.A00(13), "Connection engine command failed", th);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }
}
