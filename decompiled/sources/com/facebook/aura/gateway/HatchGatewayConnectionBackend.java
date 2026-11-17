package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C06H;
import X.C10650I0u;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.network.api.RpcMethod;
import com.facebook.aura.nodes.transport.HatchNodeTransport;
import com.facebook.aura.nodes.transport.NodeConnectionState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class HatchGatewayConnectionBackend implements HatchNodeTransport {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchGatewayConnectionBackend";
    public final BLG<NodeConnectionState> _connectionState;
    public long connectedGeneration;
    public final C1BN<NodeConnectionState> connectionState;
    public final HatchGatewayConnection gateway;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnectionBackend$1", f = "HatchGatewayConnectionBackend.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnectionBackend$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnectionBackend$1$1", f = "HatchGatewayConnectionBackend.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchGatewayConnectionBackend$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01701 extends AbstractC07127nr implements G0W<C20Z<? super HatchGatewayConnectionState>, Throwable, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public C01701(HtJ<? super C01701> htJ) {
                super(3, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Throwable th = (Throwable) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                CFK.A0A(HatchGatewayConnectionBackend.TAG, FGI.A0M("gateway.connectionState upstream failed: ", th.getMessage()), th);
                return Unit.INSTANCE;
            }

            @Override // X.G0W
            public final Object invoke(C20Z<? super HatchGatewayConnectionState> c20z, Throwable th, HtJ<? super Unit> htJ) {
                C01701 c01701 = new C01701(htJ);
                c01701.L$0 = th;
                return c01701.invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGatewayConnectionBackend.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<HatchGatewayConnectionState> c1bn = HatchGatewayConnectionBackend.this.gateway.connectionState;
                C01701 c01701 = new C01701(null);
                C7384Etj.A0Z(c1bn, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
                C10650I0u c10650I0u = new C10650I0u(2, c01701, c1bn);
                final HatchGatewayConnectionBackend hatchGatewayConnectionBackend = HatchGatewayConnectionBackend.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchGatewayConnectionBackend.1.2
                    public final Object emit(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Unit> htJ) {
                        NodeConnectionState error;
                        HatchGatewayConnectionBackend hatchGatewayConnectionBackend2 = hatchGatewayConnectionBackend;
                        BLG<NodeConnectionState> blg = hatchGatewayConnectionBackend2._connectionState;
                        if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected) {
                            long j = hatchGatewayConnectionBackend2.connectedGeneration + 1;
                            hatchGatewayConnectionBackend2.connectedGeneration = j;
                            error = new NodeConnectionState.Connected(j);
                        } else if ((hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Disconnected) || (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connecting) || (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Reconnecting) || (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Resetting) || (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Paused)) {
                            error = NodeConnectionState.Disconnected.INSTANCE;
                        } else {
                            if (!(hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Error)) {
                                throw C3cG.A0q();
                            }
                            error = new NodeConnectionState.Error(((HatchGatewayConnectionState.Error) hatchGatewayConnectionState).message);
                        }
                        blg.Af8(error);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchGatewayConnectionState) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c10650I0u.collect(c20z, this) == enumC10460Hji) {
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
            return HatchGatewayConnectionBackend.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.nodes.transport.HatchNodeTransport
    public C1BN<NodeConnectionState> getConnectionState() {
        return this.connectionState;
    }

    @Override // com.facebook.aura.nodes.transport.HatchNodeTransport
    public G0U<JsonElement, Unit> getOnClientInvokeRequest() {
        return this.gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().onClientInvokeRequest;
    }

    @Override // com.facebook.aura.nodes.transport.HatchNodeTransport
    public Object sendRequestAndWait(RpcMethod rpcMethod, JsonElement jsonElement, HtJ<? super JsonElement> htJ) {
        return this.gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sendRequestAndWaitForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(rpcMethod, jsonElement, 15000L, htJ);
    }

    @Override // com.facebook.aura.nodes.transport.HatchNodeTransport
    public Object sendRequestAndWaitDeferred(RpcMethod rpcMethod, G0U<? super HtJ<? super JsonElement>, ? extends Object> g0u, HtJ<? super JsonElement> htJ) {
        return this.gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sendRequestAndWaitDeferredForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(rpcMethod, g0u, 15000L, htJ);
    }

    @Override // com.facebook.aura.nodes.transport.HatchNodeTransport
    public void setOnClientInvokeRequest(G0U<? super JsonElement, Unit> g0u) {
        this.gateway.setOnClientInvokeRequest(g0u);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchGatewayConnectionBackend(HatchGatewayConnection hatchGatewayConnection, C3UX c3ux) {
        AnonymousClass003.A0u(hatchGatewayConnection, c3ux);
        this.gateway = hatchGatewayConnection;
        C9286GCn c9286GCnA01 = HnJ.A01(NodeConnectionState.Idle.INSTANCE);
        this._connectionState = c9286GCnA01;
        this.connectionState = c9286GCnA01;
        AnonymousClass001.A1J(new AnonymousClass1(null), c3ux);
    }
}
