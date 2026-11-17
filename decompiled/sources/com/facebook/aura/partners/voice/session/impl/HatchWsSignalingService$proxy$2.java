package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C1BN;
import X.C3UX;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GAX;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.partners.voice.session.impl.VoiceRpcMethod;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes6.dex */
public final class HatchWsSignalingService$proxy$2 extends AbstractC7559F3s implements Function0<HatchWsSignalingTransportProxy> {
    public final /* synthetic */ HatchWsSignalingService this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$1", f = "HatchWsSignalingService.kt", l = {81}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<CallJoinParamsJson, HtJ<? super JsonElement>, Object> {
        public long J$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ HatchWsSignalingService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchWsSignalingService hatchWsSignalingService, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = hatchWsSignalingService;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection hatchGatewayConnection = this.this$0.gateway;
                VoiceRpcMethod.CallsJoin callsJoin = VoiceRpcMethod.CallsJoin.INSTANCE;
                String strA02 = HatchJsonKt.HatchJson.A02(obj2, CallJoinParamsJson$$serializer.INSTANCE);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.J$0 = 15000L;
                this.label = 1;
                obj = hatchGatewayConnection.sendRequestAndWaitFromJsonString(callsJoin, strA02, 15000L, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(CallJoinParamsJson callJoinParamsJson, HtJ<? super JsonElement> htJ) {
            return ((AnonymousClass1) create(callJoinParamsJson, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ HatchWsSignalingService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchWsSignalingService hatchWsSignalingService) {
            super(0);
            this.this$0 = hatchWsSignalingService;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.joinRequestsVideoMedia);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$3", f = "HatchWsSignalingService.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0W<Boolean, HatchGatewayConnectionState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(3, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r2 = r3.Z$0
                java.lang.Object r1 = r3.L$0
                int r0 = r3.label
                if (r0 != 0) goto L18
                X.Hwg.A00(r4)
                if (r2 == 0) goto L12
                boolean r1 = r1 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
                r0 = 1
                if (r1 == 0) goto L13
            L12:
                r0 = 0
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L18:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), hatchGatewayConnectionState, htJ);
        }

        public final Object invoke(boolean z, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.Z$0 = z;
            anonymousClass3.L$0 = hatchGatewayConnectionState;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$4", f = "HatchWsSignalingService.kt", l = {55}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;
        public final /* synthetic */ HatchWsSignalingService this$0;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$4$1", f = "HatchWsSignalingService.kt", l = {56}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchGatewayConnectionState>, Object> {
            public int label;
            public final /* synthetic */ HatchWsSignalingService this$0;

            @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$4$1$1", f = "HatchWsSignalingService.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingService$proxy$2$4$1$1, reason: invalid class name and collision with other inner class name */
            public final class C03091 extends AbstractC07127nr implements G0V<HatchGatewayConnectionState, HtJ<? super Boolean>, Object> {
                public /* synthetic */ Object L$0;
                public int label;

                public C03091(HtJ<? super C03091> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C03091 c03091 = new C03091(htJ);
                    c03091.L$0 = obj;
                    return c03091;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = this.L$0;
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Boolean.valueOf(obj2 instanceof HatchGatewayConnectionState.Connected);
                }

                @Override // X.G0V
                public final Object invoke(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
                    C03091 c03091 = new C03091(htJ);
                    c03091.L$0 = hatchGatewayConnectionState;
                    return c03091.invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchWsSignalingService hatchWsSignalingService, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = hatchWsSignalingService;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<HatchGatewayConnectionState> c1bn = this.this$0.gateway.connectionState;
                    C03091 c03091 = new C03091(null);
                    this.label = 1;
                    obj = AbstractC9777Gfy.A00(this, c03091, c1bn);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super HatchGatewayConnectionState> htJ) {
                return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchWsSignalingService hatchWsSignalingService, HtJ<? super AnonymousClass4> htJ) {
            super(1, htJ);
            this.this$0 = hatchWsSignalingService;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass4(this.this$0, htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return new AnonymousClass4(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (GAX.A01(this, anonymousClass1, 2000L) == enumC10460Hji) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWsSignalingService$proxy$2(HatchWsSignalingService hatchWsSignalingService) {
        super(0);
        this.this$0 = hatchWsSignalingService;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchWsSignalingTransportProxy invoke() {
        HatchWsSignalingService hatchWsSignalingService = this.this$0;
        C3UX c3ux = hatchWsSignalingService.scope;
        HatchCallJoinContext hatchCallJoinContext = hatchWsSignalingService.joinContext;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchWsSignalingService, null);
        HatchWsSignalingService hatchWsSignalingService2 = this.this$0;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(hatchWsSignalingService2);
        HatchGatewayConnection hatchGatewayConnection = hatchWsSignalingService2.gateway;
        return new HatchWsSignalingTransportProxy(c3ux, hatchCallJoinContext, anonymousClass1, anonymousClass2, C3rb.A03(new AnonymousClass3(null), hatchGatewayConnection.serviceRestartPending, hatchGatewayConnection.connectionState), new AnonymousClass4(this.this$0, null));
    }
}
