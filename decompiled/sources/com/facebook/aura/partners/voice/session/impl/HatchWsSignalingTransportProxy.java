package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C10550Hrx;
import X.C20Q;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9273GCa;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.util.Base64;
import com.facebook.aura.json.HatchEnvelopeError;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.partners.voice.api.CallMediaType;
import com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;
import com.facebook.rsys.transport.gen.SignalingMessage;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rsys.transport.gen.SignalingTransportSink;
import com.facebook.rsys.transport.gen.StatusUpdate;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public final class HatchWsSignalingTransportProxy extends SignalingTransportProxy {
    public static final String AUDIO_ONLY_REASON_SERVER_VIDEO_DISABLED = "server_video_disabled";
    public static final String AVATAR_APPEARANCE_DARK = "dark";
    public static final String COSMOS_JOIN_INVALID_RECEIPT = "invalid_call_receipt";
    public static final int MAX_COSMOS_JOIN_ATTEMPTS = 2;
    public static final String TAG = "HatchWsSignalingProxy";
    public final G0U<HtJ<? super Unit>, Object> awaitGatewayConnected;
    public CosmosJoin cosmosJoin;
    public final Object cosmosJoinLock;
    public final HatchCallJoinContext joinContext;
    public final C20Q<Boolean> plannedRestartOutage;
    public final Function0<Boolean> requestsGeneratedVideo;
    public final C3UX scope;
    public final G0V<CallJoinParamsJson, HtJ<? super JsonElement>, Object> sendJoinRequest;
    public final AtomicReference<SignalingTransportSink> sink;
    public static final Companion Companion = new Companion();
    public static final Set<String> RETRYABLE_JOIN_ERROR_CODES = C60O.A1A("rtc_media_bridge_unavailable", "rtc_media_bridge_invalid_response", "voice_profile_unavailable");

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$1", f = "HatchWsSignalingTransportProxy.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(htJ);
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

    public final class CosmosJoin {
        public final int attempt;
        public final String callId;
        public boolean delivered;
        public final long generation;
        public final C27k<JsonElement> response;
        public Boolean retrying;

        public final int getAttempt() {
            return this.attempt;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final boolean getDelivered() {
            return this.delivered;
        }

        public final long getGeneration() {
            return this.generation;
        }

        public final C27k<JsonElement> getResponse() {
            return this.response;
        }

        public final Boolean getRetrying() {
            return this.retrying;
        }

        public final void setDelivered(boolean z) {
            this.delivered = z;
        }

        public final void setRetrying(Boolean bool) {
            this.retrying = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CosmosJoin(String str, long j, int i, C27k<? extends JsonElement> c27k) {
            AnonymousClass003.A0w(str, c27k);
            this.callId = str;
            this.generation = j;
            this.attempt = i;
            this.response = c27k;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy", f = "HatchWsSignalingTransportProxy.kt", l = {221, 222}, m = "isCurrentAfterPlannedRestart", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$isCurrentAfterPlannedRestart$1, reason: invalid class name and case insensitive filesystem */
    public final class C132391 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C132391(HtJ<? super C132391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchWsSignalingTransportProxy.this.isCurrentAfterPlannedRestart(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$isCurrentAfterPlannedRestart$2", f = "HatchWsSignalingTransportProxy.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$isCurrentAfterPlannedRestart$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return C3cG.A0P(z);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy", f = "HatchWsSignalingTransportProxy.kt", l = {200, 200, 201}, m = "requestJoinAcrossPlannedRestart", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$1, reason: invalid class name and case insensitive filesystem */
    public final class C132401 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C132401(HtJ<? super C132401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchWsSignalingTransportProxy.this.requestJoinAcrossPlannedRestart(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2", f = "HatchWsSignalingTransportProxy.kt", l = {442}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2, reason: invalid class name and case insensitive filesystem */
    public final class C132412 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonElement>, Object> {
        public final /* synthetic */ Function0<CallJoinParamsJson> $buildParams;
        public final /* synthetic */ HatchCallJoinContext.JoinSendContext $sendContext;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132412(Function0<CallJoinParamsJson> function0, HatchCallJoinContext.JoinSendContext joinSendContext, HtJ<? super C132412> htJ) {
            super(2, htJ);
            this.$buildParams = function0;
            this.$sendContext = joinSendContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C132412 c132412 = HatchWsSignalingTransportProxy.this.new C132412(this.$buildParams, this.$sendContext, htJ);
            c132412.L$0 = obj;
            return c132412;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return obj;
            }
            Hwg.A00(obj);
            HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1 hatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1 = new HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1(HatchWsSignalingTransportProxy.this, this.$buildParams, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            C10550Hrx c10550HrxA01 = GAo.A01(num, c6ys, hatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$response$1, c3ux);
            C10550Hrx c10550HrxA012 = GAo.A01(num, c6ys, new HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$outage$1(HatchWsSignalingTransportProxy.this, null), c3ux);
            HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy = HatchWsSignalingTransportProxy.this;
            HatchCallJoinContext.JoinSendContext joinSendContext = this.$sendContext;
            Function0<CallJoinParamsJson> function0 = this.$buildParams;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C9273GCa.A05;
            C9273GCa c9273GCa = new C9273GCa(getContext());
            c9273GCa.A07(new HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$1(c10550HrxA012, null), c10550HrxA01.A0H());
            c9273GCa.A07(new HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2$1$2(c10550HrxA01, hatchWsSignalingTransportProxy, joinSendContext, function0, null), c10550HrxA012.A0H());
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            Object objA03 = C9273GCa.A03(this, c9273GCa);
            return objA03 == enumC10460Hji ? enumC10460Hji : objA03;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super JsonElement> htJ) {
            return ((C132412) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy", f = "HatchWsSignalingTransportProxy.kt", l = {228}, m = "requestJoinOrNull", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinOrNull$1, reason: invalid class name and case insensitive filesystem */
    public final class C132421 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C132421(HtJ<? super C132421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchWsSignalingTransportProxy.this.requestJoinOrNull(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$sendCosmosJoin$1", f = "HatchWsSignalingTransportProxy.kt", l = {133}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$sendCosmosJoin$1, reason: invalid class name and case insensitive filesystem */
    public final class C132431 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ CallMediaType $callMediaType;
        public final /* synthetic */ SignalingTransportCallback $callbacks;
        public final /* synthetic */ CosmosJoin $join;
        public final /* synthetic */ SignalingMessage $message;
        public final /* synthetic */ HatchCallJoinContext.JoinSendContext $sendContext;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ HatchWsSignalingTransportProxy this$0;

        /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$sendCosmosJoin$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03101 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ CallMediaType $callMediaType;
            public final /* synthetic */ SignalingTransportCallback $callbacks;
            public final /* synthetic */ String $errorCode;
            public final /* synthetic */ CosmosJoin $join;
            public final /* synthetic */ JsonElement $joined;
            public final /* synthetic */ SignalingMessage $message;
            public final /* synthetic */ HatchCallJoinContext.JoinSendContext $sendContext;
            public final /* synthetic */ HatchWsSignalingTransportProxy this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03101(JsonElement jsonElement, HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy, CosmosJoin cosmosJoin, String str, HatchCallJoinContext.JoinSendContext joinSendContext, SignalingTransportCallback signalingTransportCallback, SignalingMessage signalingMessage, CallMediaType callMediaType) {
                super(0);
                this.$joined = jsonElement;
                this.this$0 = hatchWsSignalingTransportProxy;
                this.$join = cosmosJoin;
                this.$errorCode = str;
                this.$sendContext = joinSendContext;
                this.$callbacks = signalingTransportCallback;
                this.$message = signalingMessage;
                this.$callMediaType = callMediaType;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.$joined == null) {
                    if (!this.this$0.retryOnNextResend(this.$join, this.$errorCode)) {
                        HatchCallJoinContext hatchCallJoinContext = this.this$0.joinContext;
                        HatchCallJoinContext.JoinSendContext joinSendContext = this.$sendContext;
                        hatchCallJoinContext.failJoin(joinSendContext.callId, joinSendContext.generation, this.$errorCode);
                    }
                    this.$callbacks.sendFailureCallback();
                    return;
                }
                this.$callbacks.sendSuccessCallback();
                CosmosJoin cosmosJoin = this.$join;
                if (cosmosJoin.delivered) {
                    return;
                }
                cosmosJoin.delivered = this.this$0.processJoinResponse(this.$joined, this.$message, this.$sendContext, this.$callMediaType);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132431(CosmosJoin cosmosJoin, HatchWsSignalingTransportProxy hatchWsSignalingTransportProxy, HatchCallJoinContext.JoinSendContext joinSendContext, SignalingTransportCallback signalingTransportCallback, SignalingMessage signalingMessage, CallMediaType callMediaType, HtJ<? super C132431> htJ) {
            super(2, htJ);
            this.$join = cosmosJoin;
            this.this$0 = hatchWsSignalingTransportProxy;
            this.$sendContext = joinSendContext;
            this.$callbacks = signalingTransportCallback;
            this.$message = signalingMessage;
            this.$callMediaType = callMediaType;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C132431 c132431 = new C132431(this.$join, this.this$0, this.$sendContext, this.$callbacks, this.$message, this.$callMediaType, htJ);
            c132431.L$0 = obj;
            return c132431;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r3 = r14.L$0
                X.3UX r3 = (X.C3UX) r3
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r14.label
                r1 = 1
                if (r0 == 0) goto L13
                if (r0 != r1) goto Le
                goto L25
            Le:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L13:
                X.Hwg.A00(r15)
                com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$CosmosJoin r0 = r14.$join     // Catch: java.util.concurrent.CancellationException -> La1
                X.27k<kotlinx.serialization.json.JsonElement> r0 = r0.response     // Catch: java.util.concurrent.CancellationException -> La1
                r14.L$0 = r3     // Catch: java.util.concurrent.CancellationException -> La1
                r14.label = r1     // Catch: java.util.concurrent.CancellationException -> La1
                java.lang.Object r15 = X.C3cG.A0W(r0, r14)     // Catch: java.util.concurrent.CancellationException -> La1
                if (r15 != r2) goto L28
                return r2
            L25:
                X.Hwg.A00(r15)     // Catch: java.util.concurrent.CancellationException -> La1
            L28:
                kotlinx.serialization.json.JsonElement r15 = (kotlinx.serialization.json.JsonElement) r15     // Catch: java.util.concurrent.CancellationException -> La1
                r8 = 0
                if (r15 == 0) goto L3a
                com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy r1 = r14.this$0
                kotlinx.serialization.json.JsonElement r0 = com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.access$callJoinResultElement(r1, r15)
                byte[] r0 = com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.access$decodeMediaPayload(r1, r0)
                r5 = r15
                if (r0 != 0) goto L3b
            L3a:
                r5 = r8
            L3b:
                r13 = 0
                if (r5 != 0) goto L5a
                java.lang.String r1 = java.lang.String.valueOf(r15)
                r0 = 200(0xc8, float:2.8E-43)
                java.lang.String r0 = X.BQG.A17(r1, r0)
                java.lang.Object[] r2 = new java.lang.Object[]{r0}
                java.lang.String r1 = "HatchWsSignalingProxy"
                java.lang.String r0 = "media-to-Cosmos voice.calls.join failed (resp=%s)"
                X.CFK.A0H(r1, r0, r2)
                if (r15 != 0) goto L9a
                r0 = 1
                java.lang.String r8 = X.C60N.A00(r0)
            L5a:
                com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy r6 = r14.this$0
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext r3 = r6.joinContext
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext r9 = r14.$sendContext
                java.lang.String r2 = r9.callId
                long r0 = r9.generation
                com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$CosmosJoin r7 = r14.$join
                com.facebook.rsys.transport.gen.SignalingTransportCallback r10 = r14.$callbacks
                com.facebook.rsys.transport.gen.SignalingMessage r11 = r14.$message
                com.facebook.aura.partners.voice.api.CallMediaType r12 = r14.$callMediaType
                com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$sendCosmosJoin$1$1 r4 = new com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$sendCosmosJoin$1$1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r0 = r3.withCurrentCall$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(r2, r0, r4)
                if (r0 != 0) goto L97
                com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy r2 = r14.this$0
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext r7 = r2.joinContext
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext r0 = r14.$sendContext
                java.lang.String r8 = r0.callId
                long r9 = r0.generation
                if (r5 == 0) goto L92
                kotlinx.serialization.json.JsonElement r1 = com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.access$callJoinResultElement(r2, r5)
                com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext r0 = r14.$sendContext
                java.lang.String r0 = r0.callId
                com.facebook.aura.partners.voice.session.impl.CallJoinReceiptJson r0 = com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.access$admittedReceipt(r2, r1, r0)
                r11 = 1
                if (r0 != 0) goto L93
            L92:
                r11 = 0
            L93:
                r12 = 0
                r7.settleBind(r8, r9, r11, r12, r13)
            L97:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            L9a:
                com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy r0 = r14.this$0
                java.lang.String r8 = com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.access$joinErrorCode(r0, r15)
                goto L5a
            La1:
                X.78T r0 = r3.AEA()
                X.HzS.A05(r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.C132431.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C132431) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallJoinReceiptJson admittedReceipt(JsonElement jsonElement, String str) {
        JsonObject jsonObjectOptJsonObject;
        try {
            JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(jsonElement);
            if (jsonObjectAsJsonObjectOrNull != null && (jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectAsJsonObjectOrNull, "call")) != null) {
                CallJoinReceiptJson callJoinReceiptJson = (CallJoinReceiptJson) HatchJsonKt.HatchJson.A01(CallJoinReceiptJson$$serializer.INSTANCE, jsonObjectOptJsonObject);
                if (callJoinReceiptJson != null && callJoinReceiptJson.ok && C7384Etj.areEqual(callJoinReceiptJson.call_id, str)) {
                    return callJoinReceiptJson;
                }
            }
            return null;
        } catch (Exception e) {
            CFK.A0A(TAG, "voice.calls.join receipt decode failed", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] decodeMediaPayload(JsonElement jsonElement) {
        byte[] bArrDecode;
        try {
            String str = ((CallJoinResultJson) HatchJsonKt.HatchJson.A01(CallJoinResultJson$$serializer.INSTANCE, jsonElement)).payload_b64;
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null && (bArrDecode = Base64.decode(str, 2)) != null) {
                if (!AnonymousClass002.A1M(bArrDecode.length)) {
                    return bArrDecode;
                }
            }
            return null;
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to decode voice.calls.join media payload", e);
            return null;
        }
    }

    private final boolean shouldRetry(CosmosJoin cosmosJoin, String str) {
        int i;
        if (str == null || !RETRYABLE_JOIN_ERROR_CODES.contains(str) || (i = cosmosJoin.attempt) >= 2) {
            return false;
        }
        CFK.A0H(TAG, "media-to-Cosmos voice.calls.join attempt %d rejected (%s); retrying on the next resend", Integer.valueOf(i), str);
        this.joinContext.recordJoinRetry$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(cosmosJoin.callId, cosmosJoin.generation, cosmosJoin.attempt, str);
        return true;
    }

    @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
    public void setSink(SignalingTransportSink signalingTransportSink) {
        C7384Etj.A0Y(signalingTransportSink, 0);
        this.sink.set(signalingTransportSink);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public /* synthetic */ HatchWsSignalingTransportProxy(C3UX c3ux, HatchCallJoinContext hatchCallJoinContext, G0V g0v, Function0 function0, C20Q c20q, G0U g0u, int i, C06H c06h) {
        this(c3ux, hatchCallJoinContext, g0v, function0, (i & 16) != 0 ? AnonymousClass002.A0v(false) : c20q, (i & 32) != 0 ? new AnonymousClass1(null) : g0u);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[PHI: r15
  0x0052: PHI (r15v3 java.lang.String) = (r15v1 java.lang.String), (r15v4 java.lang.String) binds: [B:20:0x0050, B:18:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.CallAdmission admission(com.facebook.aura.partners.voice.session.impl.CallJoinReceiptJson r16, boolean r17) {
        /*
            r15 = this;
            r6 = r16
            java.lang.String r1 = r6.call_media_type
            com.facebook.aura.partners.voice.api.CallMediaType r0 = com.facebook.aura.partners.voice.api.CallMediaType.AUDIO
            java.lang.String r0 = r0.getWireValue()
            boolean r8 = X.C7384Etj.areEqual(r1, r0)
            com.facebook.aura.partners.voice.session.impl.CallPortraitJson r0 = r6.call_portrait
            r1 = 0
            if (r0 == 0) goto L83
            com.facebook.aura.partners.voice.session.impl.CallPortraitDisplayCropJson r0 = r0.display_crop
            if (r0 == 0) goto L83
            if (r8 != 0) goto L83
            java.lang.Float r4 = r0.x
            java.lang.Float r3 = r0.y
            java.lang.Float r2 = r0.size
            r0 = 0
            com.facebook.aura.partners.voice.infra.HatchVideoCrop r4 = com.facebook.aura.partners.voice.infra.VideoConfigJsonKt.resolveHatchVoiceVideoCrop(r4, r3, r2, r0)
        L24:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$AvatarUpdatingStart r3 = r6.avatarUpdatingStart()
            java.lang.String r9 = r6.call_media_type
            java.lang.String r10 = r6.audio_only_reason
            com.facebook.aura.partners.voice.session.impl.CallPortraitJson r0 = r6.call_portrait
            if (r0 == 0) goto L81
            java.lang.String r11 = r0.appearance
        L32:
            if (r4 == 0) goto L7f
            int r0 = r4.top
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L3a:
            boolean r0 = r6.avatar_updating
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            java.lang.String r14 = r6.avatar_updating_presentation
            java.lang.String r16 = "none"
            if (r14 != 0) goto L48
            r14 = r16
        L48:
            if (r3 == 0) goto L4e
            java.lang.String r15 = r3.awaitedStem
            if (r15 != 0) goto L52
        L4e:
            r15 = r16
            if (r3 == 0) goto L58
        L52:
            java.lang.String r0 = r3.previousStem
            if (r0 == 0) goto L58
            r16 = r0
        L58:
            r2 = 0
            java.lang.Object[] r7 = new java.lang.Object[]{r9, r10, r11, r12, r13, r14, r15, r16}
            java.lang.String r5 = "HatchWsSignalingProxy"
            java.lang.String r0 = "voice.calls.join admitted call_media_type=%s audio_only_reason=%s portrait_appearance=%s portrait_crop_top=%s avatar_updating=%b presentation=%s avatar_updating_stem=%s previous_avatar_stem=%s"
            X.CFK.A0G(r5, r0, r7)
            boolean r5 = r6.avatar_updating
            if (r8 != 0) goto L79
            if (r17 == 0) goto L79
            com.facebook.aura.partners.voice.session.impl.CallPortraitJson r0 = r6.call_portrait
            if (r0 == 0) goto L70
            java.lang.String r1 = r0.appearance
        L70:
            java.lang.String r0 = "dark"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L79
            r2 = 1
        L79:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$CallAdmission r0 = new com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$CallAdmission
            r0.<init>(r4, r5, r3, r2)
            return r0
        L7f:
            r12 = r1
            goto L3a
        L81:
            r11 = r1
            goto L32
        L83:
            r4 = r1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.admission(com.facebook.aura.partners.voice.session.impl.CallJoinReceiptJson, boolean):com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$CallAdmission");
    }

    private final String avatarAppearance(HatchCallJoinContext.JoinSendContext joinSendContext, CallMediaType callMediaType) {
        if (joinSendContext.requestsDarkAvatar && callMediaType == CallMediaType.VIDEO) {
            return "dark";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallJoinParamsJson buildJoinParams(SignalingMessage signalingMessage, HatchCallJoinContext.JoinSendContext joinSendContext, CallMediaType callMediaType) {
        String wireValue;
        Double d;
        String strEncodeToString = Base64.encodeToString(signalingMessage.payload, 2);
        Double d2 = joinSendContext.latitude;
        CallJoinLocationJson callJoinLocationJson = (d2 == null || (d = joinSendContext.longitude) == null) ? null : new CallJoinLocationJson(d2.doubleValue(), d.doubleValue(), joinSendContext.locationFixTimestampMs, C60O.A0k());
        C7384Etj.A0X(strEncodeToString);
        String str = joinSendContext.rtcSessionId;
        String str2 = joinSendContext.callId;
        String str3 = joinSendContext.threadId;
        String str4 = joinSendContext.device;
        String str5 = joinSendContext.deviceId;
        String str6 = joinSendContext.timezone;
        String wireValue2 = callMediaType.getWireValue();
        Boolean boolA0i = AnonymousClass001.A0i();
        String str7 = joinSendContext.callServerInfoData;
        Boolean bool = null;
        if (joinSendContext.deferCompanionSetup) {
            bool = boolA0i;
        }
        Boolean bool2 = null;
        if (joinSendContext.spokenTiming) {
            bool2 = boolA0i;
        }
        VoiceAudioOnlyReason voiceAudioOnlyReason = joinSendContext.audioOnlyReason;
        if (voiceAudioOnlyReason == null || (wireValue = voiceAudioOnlyReason.getWireValue()) == null || callMediaType != CallMediaType.AUDIO) {
            wireValue = null;
        }
        VoiceCallEntryPoint voiceCallEntryPoint = joinSendContext.entryPoint;
        return new CallJoinParamsJson(strEncodeToString, str, str2, str3, str4, str5, str6, callJoinLocationJson, wireValue2, boolA0i, str7, bool, bool2, wireValue, voiceCallEntryPoint != null ? voiceCallEntryPoint.getValue() : null, avatarAppearance(joinSendContext, callMediaType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isCurrentAfterPlannedRestart(com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinSendContext r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.C132391
            if (r0 == 0) goto L60
            r6 = r9
            com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$isCurrentAfterPlannedRestart$1 r6 = (com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.C132391) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 == r3) goto L4c
            if (r0 != r4) goto L66
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext r8 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinSendContext) r8
            X.Hwg.A00(r1)
        L27:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext r3 = r7.joinContext
            java.lang.String r2 = r8.callId
            long r0 = r8.generation
            boolean r0 = r3.isCurrentCall$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L36:
            X.Hwg.A00(r1)
            X.20Q<java.lang.Boolean> r2 = r7.plannedRestartOutage
            r1 = 0
            com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$isCurrentAfterPlannedRestart$2 r0 = new com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$isCurrentAfterPlannedRestart$2
            r0.<init>(r1)
            r6.L$0 = r8
            r6.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r6, r0, r2)
            if (r0 != r5) goto L53
            return r5
        L4c:
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext r8 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinSendContext) r8
            X.Hwg.A00(r1)
        L53:
            X.G0U<X.HtJ<? super kotlin.Unit>, java.lang.Object> r0 = r7.awaitGatewayConnected
            r6.L$0 = r8
            r6.label = r4
            java.lang.Object r0 = r0.invoke(r6)
            if (r0 != r5) goto L27
            return r5
        L60:
            com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$isCurrentAfterPlannedRestart$1 r6 = new com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$isCurrentAfterPlannedRestart$1
            r6.<init>(r9)
            goto L12
        L66:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.isCurrentAfterPlannedRestart(com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext, X.HtJ):java.lang.Object");
    }

    private final boolean isServerVideoDisabled(CallJoinReceiptJson callJoinReceiptJson) {
        return C7384Etj.areEqual(callJoinReceiptJson.call_media_type, CallMediaType.AUDIO.getWireValue()) && AUDIO_ONLY_REASON_SERVER_VIDEO_DISABLED.equals(callJoinReceiptJson.audio_only_reason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String joinErrorCode(JsonElement jsonElement) {
        String str;
        try {
            CallJoinErrorJson callJoinErrorJson = (CallJoinErrorJson) HatchJsonKt.HatchJson.A01(CallJoinErrorJson$$serializer.INSTANCE, jsonElement);
            HatchEnvelopeError hatchEnvelopeError = callJoinErrorJson.error;
            return (hatchEnvelopeError == null || (str = hatchEnvelopeError.code) == null) ? callJoinErrorJson.code : str;
        } catch (Exception e) {
            CFK.A0A(TAG, "voice.calls.join error frame decode failed", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean processJoinResponse(kotlinx.serialization.json.JsonElement r21, com.facebook.rsys.transport.gen.SignalingMessage r22, com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinSendContext r23, com.facebook.aura.partners.voice.api.CallMediaType r24) {
        /*
            r20 = this;
            r5 = r20
            r4 = r21
            kotlinx.serialization.json.JsonElement r1 = r5.callJoinResultElement(r4)
            byte[] r11 = r5.decodeMediaPayload(r1)
            r2 = r23
            java.lang.String r0 = r2.callId
            com.facebook.aura.partners.voice.session.impl.CallJoinReceiptJson r7 = r5.admittedReceipt(r1, r0)
            r6 = 1
            r14 = 0
            if (r11 == 0) goto L1f
            int r0 = r11.length
            if (r0 == 0) goto L1f
            r19 = 1
            if (r7 != 0) goto L21
        L1f:
            r19 = 0
        L21:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext r15 = r5.joinContext
            java.lang.String r3 = r2.callId
            long r0 = r2.generation
            if (r19 != 0) goto L45
            java.lang.String r2 = "invalid_call_receipt"
            r15.failJoin(r3, r0, r2)
        L2e:
            java.lang.String r3 = "HatchWsSignalingProxy"
            if (r11 == 0) goto L96
            int r1 = r11.length
            if (r1 == 0) goto L96
            java.util.concurrent.atomic.AtomicReference<com.facebook.rsys.transport.gen.SignalingTransportSink> r0 = r5.sink
            java.lang.Object r2 = r0.get()
            com.facebook.rsys.transport.gen.SignalingTransportSink r2 = (com.facebook.rsys.transport.gen.SignalingTransportSink) r2
            if (r2 != 0) goto L69
            java.lang.String r0 = "Got voice.calls.join response but sink not registered yet; dropping"
            X.CFK.A06(r3, r0)
            return r14
        L45:
            r8 = r24
            java.lang.String r2 = r5.avatarAppearance(r2, r8)
            boolean r2 = X.AnonymousClass002.A1X(r2)
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$CallAdmission r20 = r5.admission(r7, r2)
            com.facebook.aura.partners.voice.api.CallMediaType r2 = com.facebook.aura.partners.voice.api.CallMediaType.VIDEO
            if (r8 != r2) goto L5f
            boolean r2 = r5.isServerVideoDisabled(r7)
            r21 = 1
            if (r2 != 0) goto L61
        L5f:
            r21 = 0
        L61:
            r17 = r0
            r16 = r3
            r15.settleBind(r16, r17, r19, r20, r21)
            goto L2e
        L69:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "voice.calls.join: feeding %d-byte join response to rsys"
            X.CFK.A03(r1, r3, r0)
            r0 = r22
            int r8 = r0.signalingProtocol
            r12 = 0
            com.facebook.rsys.transport.gen.MetricIdentifiers r10 = new com.facebook.rsys.transport.gen.MetricIdentifiers
            r15 = r10
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r9 = 20
            com.facebook.rsys.transport.gen.SignalingMessage r7 = new com.facebook.rsys.transport.gen.SignalingMessage
            r13 = r12
            r15 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.signalingMessageReceived(r7, r12)
            return r6
        L96:
            java.lang.String r1 = r4.toString()
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r0 = X.BQG.A17(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "voice.calls.join: no join response payload to feed rsys (resp=%s)"
            X.CFK.A0H(r3, r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.processJoinResponse(kotlinx.serialization.json.JsonElement, com.facebook.rsys.transport.gen.SignalingMessage, com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext, com.facebook.aura.partners.voice.api.CallMediaType):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[PHI: r0
  0x0027: PHI (r0v11 java.lang.Object) = (r0v8 java.lang.Object), (r0v1 java.lang.Object) binds: [B:28:0x0079, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestJoinAcrossPlannedRestart(com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinSendContext r9, kotlin.jvm.functions.Function0<com.facebook.aura.partners.voice.session.impl.CallJoinParamsJson> r10, X.HtJ<? super kotlinx.serialization.json.JsonElement> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.C132401
            if (r0 == 0) goto L7c
            r7 = r11
            com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$1 r7 = (com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.C132401) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r0 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r5 = r7.label
            r4 = 0
            r3 = 3
            r2 = 2
            r1 = 1
            if (r5 == 0) goto L28
            if (r5 == r1) goto L3a
            if (r5 == r2) goto L58
            if (r5 != r3) goto L82
            X.Hwg.A00(r0)
        L27:
            return r0
        L28:
            X.Hwg.A00(r0)
            X.20Q<java.lang.Boolean> r0 = r8.plannedRestartOutage
            r7.L$0 = r9
            r7.L$1 = r10
            r7.label = r1
            java.lang.Object r0 = X.AbstractC9777Gfy.A02(r0, r7)
            if (r0 != r6) goto L45
            return r6
        L3a:
            java.lang.Object r10 = r7.L$1
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            java.lang.Object r9 = r7.L$0
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext r9 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinSendContext) r9
            X.Hwg.A00(r0)
        L45:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto L6a
            r7.L$0 = r9
            r7.L$1 = r10
            r7.label = r2
            java.lang.Object r0 = r8.isCurrentAfterPlannedRestart(r9, r7)
            if (r0 != r6) goto L63
            return r6
        L58:
            java.lang.Object r10 = r7.L$1
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            java.lang.Object r9 = r7.L$0
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext r9 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinSendContext) r9
            X.Hwg.A00(r0)
        L63:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto L6a
            return r4
        L6a:
            com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2 r0 = new com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$2
            r0.<init>(r10, r9, r4)
            r7.L$0 = r4
            r7.L$1 = r4
            r7.label = r3
            java.lang.Object r0 = X.Hxb.A00(r0, r7)
            if (r0 != r6) goto L27
            return r6
        L7c:
            com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$1 r7 = new com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinAcrossPlannedRestart$1
            r7.<init>(r11)
            goto L12
        L82:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.requestJoinAcrossPlannedRestart(com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinSendContext, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestJoinOrNull(com.facebook.aura.partners.voice.session.impl.CallJoinParamsJson r6, X.HtJ<? super kotlinx.serialization.json.JsonElement> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.C132421
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinOrNull$1 r4 = (com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.C132421) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L24
            goto L3a
        L1e:
            com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinOrNull$1 r4 = new com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy$requestJoinOrNull$1
            r4.<init>(r7)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r1)
            X.G0V<com.facebook.aura.partners.voice.session.impl.CallJoinParamsJson, X.HtJ<? super kotlinx.serialization.json.JsonElement>, java.lang.Object> r1 = r5.sendJoinRequest     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4a
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4a
            r4.label = r2     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4a
            java.lang.Object r1 = r1.invoke(r6, r4)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4a
            if (r1 != r3) goto L3d
            return r3
        L3a:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4a
        L3d:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4a
            return r1
        L40:
            r2 = move-exception
            java.lang.String r1 = "voice.calls.join send failed"
            java.lang.String r0 = "HatchWsSignalingProxy"
            X.CFK.A08(r0, r1, r2)
            r0 = 0
            return r0
        L4a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchWsSignalingTransportProxy.requestJoinOrNull(com.facebook.aura.partners.voice.session.impl.CallJoinParamsJson, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean retryOnNextResend(CosmosJoin cosmosJoin, String str) {
        boolean zShouldRetry;
        synchronized (this.cosmosJoinLock) {
            Boolean bool = cosmosJoin.retrying;
            if (bool != null) {
                zShouldRetry = bool.booleanValue();
            } else {
                zShouldRetry = shouldRetry(cosmosJoin, str);
                cosmosJoin.retrying = Boolean.valueOf(zShouldRetry);
            }
        }
        return zShouldRetry;
    }

    private final void sendCosmosJoin(SignalingMessage signalingMessage, SignalingTransportCallback signalingTransportCallback, HatchCallJoinContext.JoinSendContext joinSendContext, CallMediaType callMediaType) {
        C27k<JsonElement> c27k;
        synchronized (this.cosmosJoinLock) {
            if (this.joinContext.isCurrentCall$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(joinSendContext.callId, joinSendContext.generation)) {
                CosmosJoin cosmosJoin = this.cosmosJoin;
                if (cosmosJoin != null && C7384Etj.areEqual(cosmosJoin.callId, joinSendContext.callId) && cosmosJoin.generation == joinSendContext.generation) {
                    if (!AnonymousClass002.A1b(cosmosJoin.retrying, true)) {
                    }
                    AnonymousClass001.A1J(new C132431(cosmosJoin, this, joinSendContext, signalingTransportCallback, signalingMessage, callMediaType, null), this.scope);
                }
                cosmosJoin = null;
                CosmosJoin cosmosJoin2 = this.cosmosJoin;
                if (cosmosJoin2 != null && C7384Etj.areEqual(cosmosJoin2.callId, joinSendContext.callId) && (c27k = cosmosJoin2.response) != null) {
                    c27k.A5w(null);
                }
                int i = (cosmosJoin != null ? cosmosJoin.attempt : 0) + 1;
                Integer numValueOf = Integer.valueOf(i);
                String wireValue = callMediaType.getWireValue();
                String strAvatarAppearance = avatarAppearance(joinSendContext, callMediaType);
                if (strAvatarAppearance == null) {
                    strAvatarAppearance = "none";
                }
                CFK.A01(numValueOf, wireValue, strAvatarAppearance, TAG, "\u2192 sending media-to-Cosmos voice.calls.join over gateway WS (attempt %d, call_media_type=%s, avatar_appearance=%s)");
                cosmosJoin = new CosmosJoin(joinSendContext.callId, joinSendContext.generation, i, AnonymousClass001.A10(new HatchWsSignalingTransportProxy$sendCosmosJoin$join$1$2$2(this, joinSendContext, signalingMessage, callMediaType, null), this.scope));
                this.cosmosJoin = cosmosJoin;
                AnonymousClass001.A1J(new C132431(cosmosJoin, this, joinSendContext, signalingTransportCallback, signalingMessage, callMediaType, null), this.scope);
            }
        }
    }

    @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
    public SignalingTransportSink getTransportSink() {
        return this.sink.get();
    }

    @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
    public void onStatusUpdate(StatusUpdate statusUpdate) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement callJoinResultElement(JsonElement jsonElement) {
        JsonObject jsonObjectOptJsonObject;
        JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(jsonElement);
        if (jsonObjectAsJsonObjectOrNull == null || (jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectAsJsonObjectOrNull, "payload")) == null) {
            return jsonElement;
        }
        JsonObject jsonObjectOptJsonObject2 = JsonObjectExtensionsKt.optJsonObject(jsonObjectOptJsonObject, "result");
        return jsonObjectOptJsonObject2 != null ? jsonObjectOptJsonObject2 : jsonObjectOptJsonObject;
    }

    @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
    public void sendSignalingMessage(SignalingMessage signalingMessage, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, int i) {
        AnonymousClass003.A0u(signalingMessage, signalingTransportCallback);
        CallMediaType callMediaType = AnonymousClass003.A1Y(this.requestsGeneratedVideo) ? CallMediaType.VIDEO : CallMediaType.AUDIO;
        HatchCallJoinContext.JoinSendContext joinSendContextConsumeSendContext = this.joinContext.consumeSendContext();
        if (joinSendContextConsumeSendContext != null) {
            sendCosmosJoin(signalingMessage, signalingTransportCallback, joinSendContextConsumeSendContext, callMediaType);
        } else {
            CFK.A06(TAG, "voice.calls.join: no armed call; dropping the rsys send");
            signalingTransportCallback.sendFailureCallback();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchWsSignalingTransportProxy(C3UX c3ux, HatchCallJoinContext hatchCallJoinContext, G0V<? super CallJoinParamsJson, ? super HtJ<? super JsonElement>, ? extends Object> g0v, Function0<Boolean> function0, C20Q<Boolean> c20q, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        AnonymousClass005.A17(c3ux, hatchCallJoinContext, g0v, function0, c20q);
        C7384Etj.A0Y(g0u, 5);
        this.scope = c3ux;
        this.joinContext = hatchCallJoinContext;
        this.sendJoinRequest = g0v;
        this.requestsGeneratedVideo = function0;
        this.plannedRestartOutage = c20q;
        this.awaitGatewayConnected = g0u;
        this.sink = BV4.A16(null);
        this.cosmosJoinLock = C3cG.A0T();
    }
}
