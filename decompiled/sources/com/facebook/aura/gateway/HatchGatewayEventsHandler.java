package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BGK;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C22I;
import X.C2nw;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3pd;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C6tn;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7BY;
import X.C7qW;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.HzC;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC7549F2g;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.avatarassets.appearance.HatchAvatarAppearance;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.conversation.data.ChatHistoryFetchResult;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.gateway.HatchAiIdentityHandler;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.JarvisProtocol;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarMediaSelectionKt;
import com.facebook.aura.model.AvatarVideoVariant;
import com.facebook.aura.model.CanonicalEventEnvelope;
import com.facebook.aura.model.HatchAttachment;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchSubAgent;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.network.api.RpcMethod;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class HatchGatewayEventsHandler implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<Integer> _activeSubAgentCount;
    public final C3Em<ActivityUpdatedEvent> _activityUpdateEvents;
    public final C3Em<AgentStatusPayload> _agentStatusEvents;
    public final C3Em<JsonObject> _approvalsSnapshotEvents;
    public final C3Em<JsonObject> _artifactItemsRemoved;
    public final C3Em<JsonObject> _artifactItemsUpdated;
    public final C3Em<JsonObject> _artifactsSnapshotEvents;
    public final C3Em<HatchChatEvent> _chatEvents;
    public final C3Em<DeliveryAck> _deliveryAcks;
    public final C3Em<DeliveryError> _deliveryErrors;
    public final C3Em<FeedUpdateEvent> _feedUpdateEvents;
    public final BLG<FileUpdateEvent> _fileUpdateEvents;
    public final C3Em<JsonObject> _goalUpdatedEvents;
    public final BLG<HatchGatewayConnectionState> _identityConnectionState;
    public final BLG<String> _milestoneVideoUrl;
    public final C3Em<Unit> _navigationTabOrderUpdated;
    public final BLG<Integer> _pendingRequestCount;
    public final BLG<Map<String, String>> _rootAgentIdsBySession;
    public final C3Em<SessionUpdatedEvent> _sessionUpdatedEvents;
    public final C3Em<Unit> _tasksUpdateEvents;
    public final C3Em<ThemeUpdateEvent> _themeUpdateEvents;
    public final C3Em<TransportRejection> _transportRejections;
    public final C1BN<Integer> activeSubAgentCount;
    public final Set<String> activeSubAgentIds;
    public final C1BN<List<HatchSubAgent>> activeSubAgents;
    public final C22I<ActivityUpdatedEvent> activityUpdateEvents;
    public final AtomicLong agentStatusAdmissionFloor;
    public final C22I<AgentStatusPayload> agentStatusEvents;
    public final AtomicLong agentStatusSequence;
    public final C1BN<AiIdentity> aiIdentity;
    public final HatchAiIdentityHandler aiIdentityHandler;
    public final C22I<JsonObject> approvalsSnapshotEvents;
    public final C22I<JsonObject> artifactItemsRemoved;
    public final C22I<JsonObject> artifactItemsUpdated;
    public final C22I<JsonObject> artifactsSnapshotEvents;
    public final C22I<HatchChatEvent> chatEvents;
    public final HatchChatHandler chatHandler;
    public final C1BN<List<HatchSubAgent>> completedSubAgents;
    public final ConcurrentHashMap.KeySetView<String, Boolean> confirmedThreadSessions;
    public final HatchGatewayConnection connection;
    public final C22I<DeliveryAck> deliveryAcks;
    public final C22I<DeliveryError> deliveryErrors;
    public final HoC executionObserver;
    public final C22I<FeedUpdateEvent> feedUpdateEvents;
    public final C1BN<FileUpdateEvent> fileUpdateEvents;
    public final FlipperWebSocketReporter flipperReporter;
    public final C22I<JsonObject> goalUpdatedEvents;
    public final ConcurrentHashMap.KeySetView<String, Boolean> liveThreadSessions;
    public final C1BN<String> milestoneVideoUrl;
    public final AtomicReference<Object> navigationSubscription;
    public final C22I<Unit> navigationTabOrderUpdated;
    public final HatchGatewayNetworkLogRecorder networkLogRecorder;
    public G0U<? super JsonElement, Unit> onClientInvokeRequest;
    public G0V<? super String, ? super String, Unit> onHeartbeatNotification;
    public final C1BN<Integer> pendingRequestCount;
    public final ConcurrentHashMap<String, InterfaceC10560Hsz<JsonObject>> pendingRequests;
    public final JarvisProtocol protocol;
    public String rootAgentId;
    public final C1BN<Map<String, String>> rootAgentIdsBySession;
    public final C3UX scope;
    public final C22I<SessionUpdatedEvent> sessionUpdatedEvents;
    public final HatchDeltaAccumulator statusAccumulator;
    public final HatchSubAgentsHandler subAgentsHandler;
    public final ConcurrentHashMap.KeySetView<String, Boolean> subscribedOnConnection;
    public final C22I<Unit> tasksUpdateEvents;
    public final C22I<ThemeUpdateEvent> themeUpdateEvents;
    public final C22I<TransportRejection> transportRejections;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler$confirmThreadSession$1", f = "HatchGatewayEventsHandler.kt", l = {392}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$confirmThreadSession$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $sessionId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$sessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGatewayEventsHandler.this.new AnonymousClass1(this.$sessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayEventsHandler hatchGatewayEventsHandler = HatchGatewayEventsHandler.this;
                String str = this.$sessionId;
                this.label = 1;
                if (hatchGatewayEventsHandler.sendSessionSubscribe(str, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler", f = "HatchGatewayEventsHandler.kt", l = {455}, m = "fetchMessageSeq", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$fetchMessageSeq$1, reason: invalid class name and case insensitive filesystem */
    public final class C121151 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C121151(HtJ<? super C121151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayEventsHandler.this.fetchMessageSeq(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler", f = "HatchGatewayEventsHandler.kt", l = {992, 1028}, m = "handleEvent", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$handleEvent$1, reason: invalid class name and case insensitive filesystem */
    public final class C121161 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C121161(HtJ<? super C121161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayEventsHandler.this.handleEvent(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler", f = "HatchGatewayEventsHandler.kt", l = {877}, m = "handleResponse", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$handleResponse$1, reason: invalid class name and case insensitive filesystem */
    public final class C121171 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C121171(HtJ<? super C121171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayEventsHandler.this.handleResponse(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler", f = "HatchGatewayEventsHandler.kt", l = {491}, m = "searchChat", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$searchChat$1, reason: invalid class name and case insensitive filesystem */
    public final class C121181 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C121181(HtJ<? super C121181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayEventsHandler.this.searchChat(null, 0, false, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler", f = "HatchGatewayEventsHandler.kt", l = {606}, m = "sendRequestAndWaitJsonObject", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$1, reason: invalid class name and case insensitive filesystem */
    public final class C121191 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C121191(HtJ<? super C121191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayEventsHandler.this.sendRequestAndWaitJsonObject(null, null, 0L, false, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3", f = "HatchGatewayEventsHandler.kt", l = {611, 618}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonObject>, Object> {
        public final /* synthetic */ InterfaceC10560Hsz<JsonObject> $deferred;
        public final /* synthetic */ RpcMethod $method;
        public final /* synthetic */ JsonElement $params;
        public final /* synthetic */ G0U<HtJ<? super JsonElement>, Object> $prepareParams;
        public final /* synthetic */ String $requestId;
        public int label;
        public final /* synthetic */ HatchGatewayEventsHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0U<? super HtJ<? super JsonElement>, ? extends Object> g0u, String str, RpcMethod rpcMethod, JsonElement jsonElement, HatchGatewayEventsHandler hatchGatewayEventsHandler, InterfaceC10560Hsz<JsonObject> interfaceC10560Hsz, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$prepareParams = g0u;
            this.$requestId = str;
            this.$method = rpcMethod;
            this.$params = jsonElement;
            this.this$0 = hatchGatewayEventsHandler;
            this.$deferred = interfaceC10560Hsz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$prepareParams, this.$requestId, this.$method, this.$params, this.this$0, this.$deferred, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x000f A[PHI: r11
  0x000f: PHI (r11v5 java.lang.Object) = (r11v2 java.lang.Object), (r11v0 java.lang.Object) binds: [B:12:0x0036, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r2 = 2
                r1 = 1
                if (r0 == 0) goto L10
                if (r0 == r1) goto L50
                if (r0 != r2) goto L5b
                X.Hwg.A00(r11)
            Lf:
                return r11
            L10:
                X.Hwg.A00(r11)
                X.G0U<X.HtJ<? super kotlinx.serialization.json.JsonElement>, java.lang.Object> r7 = r10.$prepareParams
                if (r7 != 0) goto L39
                java.lang.String r4 = r10.$requestId
                com.facebook.aura.network.api.RpcMethod r1 = r10.$method
                kotlinx.serialization.json.JsonElement r0 = r10.$params
                java.lang.String r5 = com.facebook.aura.gateway.JarvisProtocolJsonKt.buildGatewayRequestBody(r4, r1, r0)
                com.facebook.aura.gateway.HatchGatewayEventsHandler r4 = r10.this$0
                java.lang.String r1 = r10.$requestId
                com.facebook.aura.network.api.RpcMethod r0 = r10.$method
                java.lang.String r0 = r0.getValue()
                com.facebook.aura.gateway.HatchGatewayEventsHandler.access$sendToGateway(r4, r5, r1, r0)
            L2e:
                X.Hsz<kotlinx.serialization.json.JsonObject> r0 = r10.$deferred
                r10.label = r2
                java.lang.Object r11 = X.C3cG.A0W(r0, r10)
                if (r11 != r3) goto Lf
                return r3
            L39:
                com.facebook.aura.gateway.HatchGatewayEventsHandler r8 = r10.this$0
                com.facebook.aura.gateway.HatchGatewayConnection r0 = r8.connection
                java.lang.String r5 = r10.$requestId
                com.facebook.aura.network.api.RpcMethod r6 = r10.$method
                r9 = 0
                com.facebook.aura.gateway.HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3$sent$1 r4 = new com.facebook.aura.gateway.HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3$sent$1
                r4.<init>(r5, r6, r7, r8, r9)
                r10.label = r1
                java.lang.Object r11 = r0.sendPrepared$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(r4, r10)
                if (r11 != r3) goto L53
                return r3
            L50:
                X.Hwg.A00(r11)
            L53:
                boolean r0 = X.AnonymousClass001.A1X(r11)
                if (r0 != 0) goto L2e
                r11 = 0
                return r11
            L5b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayEventsHandler.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super JsonObject> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler", f = "HatchGatewayEventsHandler.kt", l = {369}, m = "sendSessionSubscribe", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$sendSessionSubscribe$1, reason: invalid class name and case insensitive filesystem */
    public final class C121201 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C121201(HtJ<? super C121201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayEventsHandler.this.sendSessionSubscribe(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler$sendSubscriptions$1", f = "HatchGatewayEventsHandler.kt", l = {1270}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$sendSubscriptions$1, reason: invalid class name and case insensitive filesystem */
    public final class C121211 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C121211(HtJ<? super C121211> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGatewayEventsHandler.this.new C121211(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchGatewayEventsHandler.this.new C121211(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C2nw c2nwA1K = C60O.A1K();
                C7qW.A07("capabilities", HatchGatewayEventsHandler$sendSubscriptions$1$activityParams$1$1.INSTANCE, c2nwA1K);
                HatchGatewayEventsHandler.this.sendRequest(RpcMethod.ActivitySubscribe.INSTANCE, c2nwA1K.A00());
                C2nw c2nwA1K2 = C60O.A1K();
                C7qW.A07("add", HatchGatewayEventsHandler$sendSubscriptions$1$filesParams$1$1.INSTANCE, c2nwA1K2);
                C7qW.A0A("reset", c2nwA1K2, true);
                HatchGatewayEventsHandler.this.sendRequest(RpcMethod.FsSubscribe.INSTANCE, c2nwA1K2.A00());
                HatchGatewayEventsHandler.this.sendRequest(RpcMethod.IdentitySubscribe.INSTANCE, null);
                HatchGatewayEventsHandler.this.sendRequest(RpcMethod.SpacesSubscribe.INSTANCE, null);
                HatchGatewayEventsHandler.this.sendRequest(RpcMethod.ThemeSubscribe.INSTANCE, null);
                HatchGatewayEventsHandler hatchGatewayEventsHandler = HatchGatewayEventsHandler.this;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (hatchGatewayEventsHandler.subscribeArtifacts(this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler", f = "HatchGatewayEventsHandler.kt", l = {1290}, m = "subscribeArtifacts", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$subscribeArtifacts$1, reason: invalid class name and case insensitive filesystem */
    public final class C121221 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C121221(HtJ<? super C121221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayEventsHandler.this.subscribeArtifacts(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler$subscribeToSession$1", f = "HatchGatewayEventsHandler.kt", l = {345}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayEventsHandler$subscribeToSession$1, reason: invalid class name and case insensitive filesystem */
    public final class C121231 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $sessionId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121231(String str, HtJ<? super C121231> htJ) {
            super(2, htJ);
            this.$sessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGatewayEventsHandler.this.new C121231(this.$sessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayEventsHandler hatchGatewayEventsHandler = HatchGatewayEventsHandler.this;
                String str = this.$sessionId;
                this.label = 1;
                if (hatchGatewayEventsHandler.sendSessionSubscribe(str, this) == enumC10460Hji) {
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
            return ((C121231) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final String extractOptionalString(JsonObject jsonObject, String... strArr) {
        if (jsonObject != null) {
            for (String str : strArr) {
                String strOptString = JsonObjectExtensionsKt.optString(jsonObject, str, "");
                if (strOptString.length() > 0) {
                    return strOptString;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0 A[Catch: all -> 0x010e, TryCatch #5 {all -> 0x010e, blocks: (B:27:0x0099, B:28:0x009c, B:42:0x00c6, B:44:0x00d0, B:45:0x00d4, B:46:0x00e6, B:54:0x010d), top: B:63:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[Catch: all -> 0x010e, TRY_LEAVE, TryCatch #5 {all -> 0x010e, blocks: (B:27:0x0099, B:28:0x009c, B:42:0x00c6, B:44:0x00d0, B:45:0x00d4, B:46:0x00e6, B:54:0x010d), top: B:63:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendRequestAndWaitJsonObject(com.facebook.aura.network.api.RpcMethod r14, kotlinx.serialization.json.JsonElement r15, long r16, boolean r18, X.G0U<? super X.HtJ<? super kotlinx.serialization.json.JsonElement>, ? extends java.lang.Object> r19, X.HtJ<? super kotlinx.serialization.json.JsonObject> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayEventsHandler.sendRequestAndWaitJsonObject(com.facebook.aura.network.api.RpcMethod, kotlinx.serialization.json.JsonElement, long, boolean, X.G0U, X.HtJ):java.lang.Object");
    }

    public final void applyLocalAiIdentityName(String str) {
        C7384Etj.A0Y(str, 0);
        this.aiIdentityHandler.applyLocalName(str);
    }

    public final void confirmThreadSession(String str) {
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str)) {
            return;
        }
        boolean zAdd = this.confirmedThreadSessions.add(str);
        if (this.liveThreadSessions.contains(str) || executionOwnsSession(str)) {
            if (zAdd || !this.subscribedOnConnection.contains(str)) {
                CFK.A05(HatchGatewayEventsHandlerKt.TAG, FGI.A0M("Opening chat.subscribe for confirmed thread session ", C6tn.A02(str)));
                AnonymousClass001.A1J(new AnonymousClass1(str, null), this.scope);
            }
        }
    }

    public final void sendChatMessage(String str, List<HatchAttachment> list, Map<String, ? extends Object> map, String str2, String str3) {
        AnonymousClass002.A1C(str, 0, str3);
        this.chatHandler.sendChatMessage(str, list, map, str2, str3);
    }

    public final void sendRequest(RpcMethod rpcMethod, JsonObject jsonObject) {
        C7384Etj.A0Y(rpcMethod, 0);
        if (isConnected()) {
            String strA0k = AnonymousClass002.A0k();
            sendToGateway(JarvisProtocolJsonKt.buildGatewayRequestBody(strA0k, rpcMethod, jsonObject), strA0k, rpcMethod.getValue());
        }
    }

    public final Object sendRequestAndWaitDeferredForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(RpcMethod rpcMethod, G0U<? super HtJ<? super JsonElement>, ? extends Object> g0u, long j, HtJ<? super JsonElement> htJ) {
        return sendRequestAndWaitJsonObject(rpcMethod, null, j, true, g0u, htJ);
    }

    public final Object sendRequestAndWaitForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(RpcMethod rpcMethod, JsonElement jsonElement, long j, HtJ<? super JsonElement> htJ) {
        return sendRequestAndWaitJsonObject(rpcMethod, jsonElement, j, true, null, htJ);
    }

    public final void subscribeToSession(String str) {
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str)) {
            return;
        }
        this.liveThreadSessions.add(str);
        if (!this.confirmedThreadSessions.contains(str)) {
            CFK.A05(HatchGatewayEventsHandlerKt.TAG, FGI.A0M("Deferring chat.subscribe for unconfirmed thread session ", C6tn.A02(str)));
        } else {
            AnonymousClass001.A1J(new C121231(str, null), this.scope);
        }
    }

    public final void unsubscribeFromSession(String str) {
        C7384Etj.A0Y(str, 0);
        this.liveThreadSessions.remove(str);
        if (executionOwnsSession(str)) {
            return;
        }
        this.subscribedOnConnection.remove(str);
    }

    public final void updateConnectionState(HatchGatewayConnectionState hatchGatewayConnectionState) {
        C7384Etj.A0Y(hatchGatewayConnectionState, 0);
        AnonymousClass002.A1I(this._identityConnectionState, hatchGatewayConnectionState);
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarVideoVariant.values().length];
            try {
                AnonymousClass002.A13(AvatarVideoVariant.MILESTONE_ACHIEVEMENT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void bumpChatEventSeqForParsedEvent(HatchChatEvent hatchChatEvent) {
        JarvisProtocol jarvisProtocol = this.protocol;
        CanonicalEventEnvelope envelope = hatchChatEvent.getEnvelope();
        jarvisProtocol.bumpChatEventSeqIfNewer(envelope != null ? envelope.sessionId : null, chatEventCursorSeq(hatchChatEvent));
    }

    private final Long chatEventCursorSeq(HatchChatEvent hatchChatEvent) {
        HatchMessage hatchMessage;
        CanonicalEventEnvelope canonicalEventEnvelope;
        if ((hatchChatEvent instanceof HatchChatEvent.MessageStart) || (hatchChatEvent instanceof HatchChatEvent.DeltaText) || (hatchChatEvent instanceof HatchChatEvent.Thinking) || (hatchChatEvent instanceof HatchChatEvent.MessageDone)) {
            CanonicalEventEnvelope envelope = hatchChatEvent.getEnvelope();
            if (envelope != null) {
                return envelope.messageSeq;
            }
            return null;
        }
        if (hatchChatEvent instanceof HatchChatEvent.Presentation) {
            HatchChatEvent.Presentation presentation = (HatchChatEvent.Presentation) hatchChatEvent;
            Long l = presentation.presentation.chatEventSeq;
            if (l != null) {
                return l;
            }
            canonicalEventEnvelope = presentation.envelope;
        } else if (hatchChatEvent instanceof HatchChatEvent.ToolStart) {
            canonicalEventEnvelope = ((HatchChatEvent.ToolStart) hatchChatEvent).envelope;
        } else {
            if (!(hatchChatEvent instanceof HatchChatEvent.ToolDone)) {
                if (hatchChatEvent instanceof HatchChatEvent.MessageAssistant) {
                    hatchMessage = ((HatchChatEvent.MessageAssistant) hatchChatEvent).message;
                } else {
                    if (!(hatchChatEvent instanceof HatchChatEvent.MessageUser)) {
                        if ((hatchChatEvent instanceof HatchChatEvent.BlockDone) || (hatchChatEvent instanceof HatchChatEvent.ChatAborted) || (hatchChatEvent instanceof HatchChatEvent.Citation) || (hatchChatEvent instanceof HatchChatEvent.Marker) || (hatchChatEvent instanceof HatchChatEvent.MessagesRemoved) || (hatchChatEvent instanceof HatchChatEvent.ReactionsUpdated) || (hatchChatEvent instanceof HatchChatEvent.SubAgentTaskStatus) || (hatchChatEvent instanceof HatchChatEvent.ToolUpdate) || (hatchChatEvent instanceof HatchChatEvent.WidgetStateUpdated)) {
                            return null;
                        }
                        throw C3cG.A0q();
                    }
                    hatchMessage = ((HatchChatEvent.MessageUser) hatchChatEvent).message;
                }
                return hatchMessage.seq;
            }
            canonicalEventEnvelope = ((HatchChatEvent.ToolDone) hatchChatEvent).envelope;
        }
        if (canonicalEventEnvelope != null) {
            return canonicalEventEnvelope.chatEventSeq;
        }
        return null;
    }

    private final void emitArtifactsSnapshotIfPresent(JsonObject jsonObject) {
        if (jsonObject.containsKey(ConnectorOrderCheckoutKt.ITEMS_KEY)) {
            this._artifactsSnapshotEvents.AhV(jsonObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitChatEvent(HatchChatEvent hatchChatEvent, HtJ<? super Unit> htJ) {
        HatchAgentExecution.Companion.getInstance(this.userSession).onChatEvent(hatchChatEvent, this._rootAgentIdsBySession.getValue());
        return C3cG.A0U(this._chatEvents.emit(hatchChatEvent, htJ));
    }

    private final boolean executionOwnsSession(String str) {
        return HatchAgentExecution.Companion.getInstance(this.userSession).activeConversations.getValue().contains(str);
    }

    public static /* synthetic */ Object fetchChatHistory$default(HatchGatewayEventsHandler hatchGatewayEventsHandler, int i, Long l, String str, HtJ htJ, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 50;
        }
        if ((i2 & 2) != 0) {
            l = null;
        }
        return hatchGatewayEventsHandler.chatHandler.fetchChatHistory(i, l, str, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:73:0x018d, B:75:0x0199], limit reached: 163 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0152 -> B:12:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleEvent(kotlinx.serialization.json.JsonObject r19, X.HtJ<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayEventsHandler.handleEvent(kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }

    private final void handleInboundRequest(JsonObject jsonObject) {
        String strA0u = C60O.A0u(jsonObject, AgeCheckFunnelLogging.KEY_METHOD);
        if (!strA0u.equals(RpcMethod.ClientInvoke.INSTANCE.getValue())) {
            C60Q.A1J("inbound req method=", strA0u, " has no route", HatchGatewayEventsHandlerKt.TAG);
            return;
        }
        if (this.onClientInvokeRequest == null) {
            CFK.A06(HatchGatewayEventsHandlerKt.TAG, "inbound client.invoke arrived but onClientInvokeRequest is unwired");
        }
        G0U<? super JsonElement, Unit> g0u = this.onClientInvokeRequest;
        if (g0u != null) {
            g0u.invoke(jsonObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleResponse(kotlinx.serialization.json.JsonObject r23, X.HtJ<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayEventsHandler.handleResponse(kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }

    private final boolean isInvocationMethod(String str) {
        return C7384Etj.areEqual(str, RpcMethod.ClientInvoke.INSTANCE.getValue()) || C7384Etj.areEqual(str, RpcMethod.ClientInvokeResult.INSTANCE.getValue());
    }

    private final String manifestMilestoneVideoUrl(boolean z, String str) {
        if (z && HatchAvatarAppearance.INSTANCE.isDarkAvatarEnabled()) {
            return selectedAvatarVideoUrl(milestoneVariant(str));
        }
        return null;
    }

    private final AvatarVideoVariant milestoneVariant(String str) {
        return C7384Etj.areEqual(str, AvatarVideoVariant.MILESTONE_ACHIEVEMENT.getKey()) ? AvatarVideoVariant.MILESTONE_ACHIEVEMENT : AvatarVideoVariant.MILESTONE_LEVEL_UP;
    }

    private final String milestoneVideoUrlIfApplicable(boolean z, String str) {
        if (!z) {
            return null;
        }
        AvatarVideoVariant avatarVideoVariantMilestoneVariant = milestoneVariant(str);
        String strSelectedAvatarVideoUrl = selectedAvatarVideoUrl(avatarVideoVariantMilestoneVariant);
        if (strSelectedAvatarVideoUrl != null) {
            return strSelectedAvatarVideoUrl;
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        return WorkspaceUriResolver.INSTANCE.resolveRawFileSystemUrl("assets/avatar/reference/".concat(avatarVideoVariantMilestoneVariant.ordinal() == 5 ? "hatch_milestone_achievement.mp4" : "hatch_milestone_level_up.mp4"), this.userSession);
    }

    private final AgentStatusCta parseAgentStatusCta(JsonObject jsonObject) {
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "cta");
        if (jsonObjectOptJsonObject == null) {
            return null;
        }
        String strOptString = JsonObjectExtensionsKt.optString(jsonObjectOptJsonObject, "label", "");
        String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectOptJsonObject, "url", "");
        if (strOptString.length() == 0 || strOptString2.length() == 0) {
            return null;
        }
        return new AgentStatusCta(strOptString, strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordOutbound(String str, String str2, String str3) {
        String str4 = this.connection.currentEffectiveWsUrl;
        if (str4 == null && (str4 = this.connection.currentWsUrl) == null) {
            str4 = "";
        }
        if (isInvocationMethod(str3)) {
            C2nw c2nwA1K = C60O.A1K();
            C7qW.A06("type", "req", c2nwA1K);
            C7qW.A06("id", str2, c2nwA1K);
            str = invocationDiagnostic(C7qW.A01(AgeCheckFunnelLogging.KEY_METHOD, str3, c2nwA1K));
        }
        this.flipperReporter.reportSent(str4, str);
        this.networkLogRecorder.recordSent(str4, str2, str3);
        AnonymousClass003.A0u(this.userSession, str);
    }

    public static /* synthetic */ Object searchChat$default(HatchGatewayEventsHandler hatchGatewayEventsHandler, String str, int i, boolean z, Long l, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        boolean zA1K = C3cG.A1K(i2 & 4, z);
        if ((i2 & 8) != 0) {
            l = null;
        }
        return hatchGatewayEventsHandler.searchChat(str, i, zA1K, l, htJ);
    }

    private final String selectedAvatarVideoUrl(AvatarVideoVariant avatarVideoVariant) {
        AvatarMedia avatarMedia;
        AiIdentity value = this.aiIdentityHandler.aiIdentity.getValue();
        if (value == null || (avatarMedia = value.avatarMedia) == null) {
            return null;
        }
        return AvatarMediaUrlsKt.videoUrl(AvatarMediaSelectionKt.select(avatarMedia, HatchAvatarAppearance.INSTANCE.isDark()), avatarVideoVariant, this.userSession);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendChatMessage$default(HatchGatewayEventsHandler hatchGatewayEventsHandler, String str, List list, Map map, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        hatchGatewayEventsHandler.sendChatMessage(str, list, map, str2, str3);
    }

    public static /* synthetic */ void sendRequest$default(HatchGatewayEventsHandler hatchGatewayEventsHandler, RpcMethod rpcMethod, JsonObject jsonObject, int i, Object obj) {
        if ((i & 2) != 0) {
            jsonObject = null;
        }
        hatchGatewayEventsHandler.sendRequest(rpcMethod, jsonObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object sendRequestAndWaitJsonObject$default(HatchGatewayEventsHandler hatchGatewayEventsHandler, RpcMethod rpcMethod, JsonElement jsonElement, long j, boolean z, G0U g0u, HtJ htJ, int i, Object obj) {
        boolean zA1Q = C60Q.A1Q(i & 8, z);
        if ((i & 16) != 0) {
            g0u = null;
        }
        return hatchGatewayEventsHandler.sendRequestAndWaitJsonObject(rpcMethod, jsonElement, j, zA1Q, g0u, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendSessionSubscribe(java.lang.String r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.gateway.HatchGatewayEventsHandler.C121201
            r4 = r9
            if (r0 == 0) goto L7d
            r9 = r11
            com.facebook.aura.gateway.HatchGatewayEventsHandler$sendSessionSubscribe$1 r9 = (com.facebook.aura.gateway.HatchGatewayEventsHandler.C121201) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r9.label = r2
        L13:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L5d
            if (r0 != r1) goto L83
            java.lang.Object r0 = r9.L$0
            java.lang.String r10 = X.C3cG.A0d(r0, r3)
        L24:
            kotlinx.serialization.json.JsonElement r3 = (kotlinx.serialization.json.JsonElement) r3
            if (r3 == 0) goto L48
            kotlinx.serialization.json.JsonObject r3 = com.facebook.aura.json.JsonObjectExtensionsKt.asJsonObjectOrNull(r3)
            if (r3 == 0) goto L48
            r0 = 0
            java.lang.String r2 = "ok"
            boolean r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optBoolean(r3, r2, r0)
            if (r0 != 0) goto L45
            java.lang.String r1 = "status"
            java.lang.String r0 = "not_ok"
            java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r1, r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L48
        L45:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L48:
            java.util.concurrent.ConcurrentHashMap$KeySetView<java.lang.String, java.lang.Boolean> r0 = r4.subscribedOnConnection
            r0.remove(r10)
            java.lang.String r1 = X.C6tn.A02(r10)
            java.lang.String r0 = "chat.subscribe failed for confirmed thread session "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "HatchGatewayEventsHandler"
            X.CFK.A06(r0, r1)
            goto L45
        L5d:
            X.Hwg.A00(r3)
            java.util.concurrent.ConcurrentHashMap$KeySetView<java.lang.String, java.lang.Boolean> r0 = r4.subscribedOnConnection
            boolean r0 = r0.add(r10)
            if (r0 == 0) goto L45
            com.facebook.aura.network.api.RpcMethod$ChatSubscribe r5 = com.facebook.aura.network.api.RpcMethod.ChatSubscribe.INSTANCE
            com.facebook.aura.gateway.JarvisProtocol r0 = r4.protocol
            java.lang.String r6 = r0.buildSessionSubscribeParams(r10)
            r9.L$0 = r10
            r9.label = r1
            r7 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r3 = r4.sendRequestAndWaitInternal(r5, r6, r7, r9)
            if (r3 != r2) goto L24
            return r2
        L7d:
            com.facebook.aura.gateway.HatchGatewayEventsHandler$sendSessionSubscribe$1 r9 = new com.facebook.aura.gateway.HatchGatewayEventsHandler$sendSessionSubscribe$1
            r9.<init>(r11)
            goto L13
        L83:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayEventsHandler.sendSessionSubscribe(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void sendSubscriptions() {
        AnonymousClass001.A1J(new C121211(null), this.scope);
    }

    public final void cancelPendingRequests() {
        Iterator itA1R = C60P.A1R(this.pendingRequests);
        while (itA1R.hasNext()) {
            HoC hoC = (HoC) itA1R.next();
            C7384Etj.A0X(hoC);
            hoC.A5w(null);
        }
        this.pendingRequests.clear();
    }

    public final void clearMilestoneVideo() {
        this._milestoneVideoUrl.Af8(null);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.executionObserver.A5w(null);
        resetState();
        this._rootAgentIdsBySession.Af8(AGH.A0E());
        this.liveThreadSessions.clear();
        this.confirmedThreadSessions.clear();
        this._milestoneVideoUrl.Af8(null);
        cancelPendingRequests();
    }

    public final Object fetchChatHistory(int i, Long l, String str, HtJ<? super ChatHistoryFetchResult> htJ) {
        return this.chatHandler.fetchChatHistory(i, l, str, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchMessageSeq(java.lang.String r11, X.HtJ<? super java.lang.Long> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.facebook.aura.gateway.HatchGatewayEventsHandler.C121151
            r5 = r10
            if (r0 == 0) goto L77
            r10 = r12
            com.facebook.aura.gateway.HatchGatewayEventsHandler$fetchMessageSeq$1 r10 = (com.facebook.aura.gateway.HatchGatewayEventsHandler.C121151) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r10.label = r2
        L13:
            java.lang.Object r2 = r10.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r3 = 1
            if (r0 == 0) goto L50
            if (r0 != r3) goto L7d
            java.lang.Object r0 = r10.L$0
            java.lang.String r11 = X.C3cG.A0d(r0, r2)
        L24:
            kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
            r1 = 0
            if (r2 == 0) goto L4f
            kotlinx.serialization.json.JsonObject r2 = com.facebook.aura.json.JsonObjectExtensionsKt.asJsonObjectOrNull(r2)
            if (r2 == 0) goto L4f
            kotlinx.serialization.json.JsonObject r0 = X.C60O.A1J(r2)
            if (r0 == 0) goto L36
            r2 = r0
        L36:
            java.lang.String r0 = "chat_event"
            kotlinx.serialization.json.JsonObject r3 = com.facebook.aura.json.JsonObjectExtensionsKt.optJsonObject(r2, r0)
            if (r3 == 0) goto L4f
            java.lang.String r2 = "seq"
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L4a
            java.lang.Long r1 = X.C60P.A1H(r3, r2)
        L4a:
            r0 = 20
            X.BQG.A17(r11, r0)
        L4f:
            return r1
        L50:
            X.Hwg.A00(r2)
            X.2nw r1 = X.C60O.A1K()
            java.lang.String r0 = "message_id"
            kotlinx.serialization.json.JsonObject r2 = X.C7qW.A01(r0, r11, r1)
            com.facebook.aura.network.api.RpcMethod$ChatMessageGet r6 = com.facebook.aura.network.api.RpcMethod.ChatMessageGet.INSTANCE
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            kotlinx.serialization.json.JsonObjectSerializer r0 = kotlinx.serialization.json.JsonObjectSerializer.A01
            java.lang.String r7 = r1.A02(r2, r0)
            r10.L$0 = r11
            r0 = 0
            r10.L$1 = r0
            r10.label = r3
            r8 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r2 = r5.sendRequestAndWaitInternal(r6, r7, r8, r10)
            if (r2 != r4) goto L24
            return r4
        L77:
            com.facebook.aura.gateway.HatchGatewayEventsHandler$fetchMessageSeq$1 r10 = new com.facebook.aura.gateway.HatchGatewayEventsHandler$fetchMessageSeq$1
            r10.<init>(r12)
            goto L13
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayEventsHandler.fetchMessageSeq(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object fetchUnreadCount(String str, HtJ<? super Integer> htJ) {
        return this.chatHandler.fetchUnreadCount(str, htJ);
    }

    public final Object fetchUnreadState(String str, HtJ<? super ChatUnreadState> htJ) {
        return this.chatHandler.fetchUnreadState(str, htJ);
    }

    public final C1BN<Integer> getActiveSubAgentCount() {
        return this.activeSubAgentCount;
    }

    public final C1BN<List<HatchSubAgent>> getActiveSubAgents() {
        return this.activeSubAgents;
    }

    public final C22I<ActivityUpdatedEvent> getActivityUpdateEvents() {
        return this.activityUpdateEvents;
    }

    public final long getAgentStatusConnectionFloor() {
        return this.agentStatusAdmissionFloor.get();
    }

    public final C22I<AgentStatusPayload> getAgentStatusEvents() {
        return this.agentStatusEvents;
    }

    public final C1BN<AiIdentity> getAiIdentity() {
        return this.aiIdentity;
    }

    public final C22I<JsonObject> getApprovalsSnapshotEvents() {
        return this.approvalsSnapshotEvents;
    }

    public final C22I<JsonObject> getArtifactItemsRemoved() {
        return this.artifactItemsRemoved;
    }

    public final C22I<JsonObject> getArtifactItemsUpdated() {
        return this.artifactItemsUpdated;
    }

    public final C22I<JsonObject> getArtifactsSnapshotEvents() {
        return this.artifactsSnapshotEvents;
    }

    public final C22I<HatchChatEvent> getChatEvents() {
        return this.chatEvents;
    }

    public final HatchAiIdentityHandler.AvatarImageKey getCommittedAvatarImageKey() {
        return this.aiIdentityHandler.getCommittedAvatarImageKey();
    }

    public final C1BN<List<HatchSubAgent>> getCompletedSubAgents() {
        return this.completedSubAgents;
    }

    public final long getCurrentAgentStatusSequence() {
        return this.agentStatusSequence.get();
    }

    public final C22I<DeliveryAck> getDeliveryAcks() {
        return this.deliveryAcks;
    }

    public final C22I<DeliveryError> getDeliveryErrors() {
        return this.deliveryErrors;
    }

    public final C22I<FeedUpdateEvent> getFeedUpdateEvents() {
        return this.feedUpdateEvents;
    }

    public final C1BN<FileUpdateEvent> getFileUpdateEvents() {
        return this.fileUpdateEvents;
    }

    public final C22I<JsonObject> getGoalUpdatedEvents() {
        return this.goalUpdatedEvents;
    }

    public final C1BN<Long> getIdentityInvalidationGeneration() {
        return this.aiIdentityHandler.identityInvalidationGeneration;
    }

    public final C1BN<Long> getIdentityRefreshGeneration() {
        return this.aiIdentityHandler.identityRefreshGeneration;
    }

    public final C1BN<String> getMilestoneVideoUrl() {
        return this.milestoneVideoUrl;
    }

    public final C22I<Unit> getNavigationTabOrderUpdated() {
        return this.navigationTabOrderUpdated;
    }

    public final G0U<JsonElement, Unit> getOnClientInvokeRequest() {
        return this.onClientInvokeRequest;
    }

    public final G0V<String, String, Unit> getOnHeartbeatNotification() {
        return this.onHeartbeatNotification;
    }

    public final C1BN<Integer> getPendingRequestCount() {
        return this.pendingRequestCount;
    }

    public final C1BN<Map<String, String>> getRootAgentIdsBySession() {
        return this.rootAgentIdsBySession;
    }

    public final C22I<SessionUpdatedEvent> getSessionUpdatedEvents() {
        return this.sessionUpdatedEvents;
    }

    public final C22I<Unit> getTasksUpdateEvents() {
        return this.tasksUpdateEvents;
    }

    public final C22I<ThemeUpdateEvent> getThemeUpdateEvents() {
        return this.themeUpdateEvents;
    }

    public final C22I<TransportRejection> getTransportRejections() {
        return this.transportRejections;
    }

    public final boolean isConnected() {
        HatchGatewayConnectionState value = this.connection.connectionState.getValue();
        return (value instanceof HatchGatewayConnectionState.Connected) || (value instanceof HatchGatewayConnectionState.Resetting);
    }

    public final void markAgentStatusConnectionFloor() {
        this.agentStatusAdmissionFloor.set(this.agentStatusSequence.get());
    }

    public final Object markChatAsSeen(String str, HtJ<? super MarkChatAsSeenResult> htJ) {
        return this.chatHandler.markChatAsSeen(str, htJ);
    }

    public final void onConnected() {
        this.subscribedOnConnection.clear();
        this.navigationSubscription.set(null);
        sendSubscriptions();
        resubscribeLiveSessions();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onMessage(java.lang.String r11, X.HtJ<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r10.connection
            java.lang.String r1 = r0.currentEffectiveWsUrl
            if (r1 != 0) goto Le
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r10.connection
            java.lang.String r1 = r0.currentWsUrl
            if (r1 != 0) goto Le
            java.lang.String r1 = ""
        Le:
            X.9sU r0 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L19
            kotlinx.serialization.json.JsonElement r0 = r0.A04(r11)     // Catch: java.lang.Throwable -> L19
            kotlinx.serialization.json.JsonObject r4 = com.facebook.aura.json.JsonObjectExtensionsKt.asJsonObjectOrNull(r0)     // Catch: java.lang.Throwable -> L19
            goto L1f
        L19:
            r0 = move-exception
            X.Hud r4 = new X.Hud
            r4.<init>(r0)
        L1f:
            boolean r2 = r4 instanceof X.C10571Hud
            r0 = 0
            if (r2 == 0) goto L25
            r4 = r0
        L25:
            kotlinx.serialization.json.JsonObject r4 = (kotlinx.serialization.json.JsonObject) r4
            java.lang.String r9 = "HatchGatewayEventsHandler"
            if (r4 != 0) goto L33
            java.lang.String r0 = "Invalid message format"
        L2d:
            X.CFK.A06(r9, r0)
        L30:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L33:
            java.lang.String r0 = "type"
            java.lang.String r8 = ""
            java.lang.String r7 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r4, r0, r8)
            java.lang.String r6 = "res"
            java.lang.String r5 = "event"
            java.lang.String r3 = "evt"
            java.lang.String r2 = "req"
            java.lang.String[] r0 = new java.lang.String[]{r6, r5, r3, r2}
            java.util.Set r0 = X.BFI.A0H(r0)
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L54
            java.lang.String r0 = "Unrouted message type"
            goto L2d
        L54:
            java.lang.String r0 = "method"
            java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r4, r0, r8)
            boolean r0 = r10.isInvocationMethod(r0)
            if (r0 != 0) goto L6a
            java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r4, r5, r8)
            boolean r0 = r10.isInvocationMethod(r0)
            if (r0 == 0) goto L6e
        L6a:
            java.lang.String r11 = r10.invocationDiagnostic(r4)
        L6e:
            com.facebook.aura.gateway.FlipperWebSocketReporter r0 = r10.flipperReporter
            r0.reportReceived(r1, r11)
            com.facebook.aura.gateway.HatchGatewayNetworkLogRecorder r0 = r10.networkLogRecorder
            r0.recordReceived(r1, r4)
            com.facebook.aura.gateway.api.GatewayTrafficObservers r1 = com.facebook.aura.gateway.api.GatewayTrafficObservers.INSTANCE
            X.CGz r0 = r10.userSession
            r1.dispatchReceived(r0, r11)
            int r0 = r7.hashCode()
            switch(r0) {
                case 100835: goto L87;
                case 112798: goto L8c;
                case 112800: goto L96;
                case 96891546: goto La1;
                default: goto L86;
            }
        L86:
            goto L30
        L87:
            boolean r0 = r7.equals(r3)
            goto La5
        L8c:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L30
            r10.handleInboundRequest(r4)
            goto L30
        L96:
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L30
            java.lang.Object r1 = r10.handleResponse(r4, r12)
            goto Lab
        La1:
            boolean r0 = r7.equals(r5)
        La5:
            if (r0 == 0) goto L30
            java.lang.Object r1 = r10.handleEvent(r4, r12)
        Lab:
            X.Hji r0 = X.EnumC10460Hji.A02
            if (r1 != r0) goto L30
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayEventsHandler.onMessage(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void refreshIdentity() {
        this.aiIdentityHandler.onIdentityUpdated();
    }

    public final void resetState() {
        this.protocol.clearReplyElementSupport();
        this.statusAccumulator.reset();
        this.subscribedOnConnection.clear();
        this.navigationSubscription.set(null);
        this.rootAgentId = null;
        this.activeSubAgentIds.clear();
        AnonymousClass001.A1E(this._activeSubAgentCount, null, 0);
        this.subAgentsHandler.clearState();
        this.aiIdentityHandler.clearState();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133 A[PHI: r20 r21
  0x0133: PHI (r20v2 boolean) = (r20v5 boolean), (r20v6 boolean) binds: [B:58:0x0131, B:56:0x012d] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r21v1 java.lang.String) = (r21v4 java.lang.String), (r21v5 java.lang.String) binds: [B:58:0x0131, B:56:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f A[PHI: r20 r21
  0x013f: PHI (r20v4 boolean) = (r20v2 boolean), (r20v5 boolean) binds: [B:60:0x013d, B:58:0x0131] A[DONT_GENERATE, DONT_INLINE]
  0x013f: PHI (r21v3 java.lang.String) = (r21v1 java.lang.String), (r21v4 java.lang.String) binds: [B:60:0x013d, B:58:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object searchChat(java.lang.String r20, int r21, boolean r22, java.lang.Long r23, X.HtJ<? super com.facebook.aura.conversation.data.HatchSearchResult> r24) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayEventsHandler.searchChat(java.lang.String, int, boolean, java.lang.Long, X.HtJ):java.lang.Object");
    }

    public final Object sendKeepaliveRequest$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(JsonElement jsonElement, long j, HtJ<? super JsonElement> htJ) {
        return sendRequestAndWaitJsonObject(RpcMethod.ConnectionPing.INSTANCE, jsonElement, j, false, null, htJ);
    }

    public final Object sendRequestAndWaitInternal(RpcMethod rpcMethod, String str, long j, HtJ<? super JsonElement> htJ) {
        return sendRequestAndWaitJsonObject(rpcMethod, str != null ? HatchJsonKt.HatchJson.A04(str) : null, j, true, null, htJ);
    }

    public final void setAfterChatEventSeq(String str, long j) {
        this.protocol.bumpChatEventSeqIfNewer(str, Long.valueOf(j));
    }

    public final void setOnClientInvokeRequest(G0U<? super JsonElement, Unit> g0u) {
        this.onClientInvokeRequest = g0u;
    }

    public final void setOnHeartbeatNotification(G0V<? super String, ? super String, Unit> g0v) {
        this.onHeartbeatNotification = g0v;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object subscribeArtifacts(X.HtJ<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.facebook.aura.gateway.HatchGatewayEventsHandler.C121221
            r7 = r12
            if (r0 == 0) goto La3
            r12 = r13
            com.facebook.aura.gateway.HatchGatewayEventsHandler$subscribeArtifacts$1 r12 = (com.facebook.aura.gateway.HatchGatewayEventsHandler.C121221) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r12.label = r2
        L13:
            java.lang.Object r1 = r12.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L5e
            if (r0 != r6) goto Laa
            java.lang.Object r3 = r12.L$0
            X.Hwg.A00(r1)
        L24:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            if (r1 == 0) goto L51
            kotlinx.serialization.json.JsonObject r5 = com.facebook.aura.json.JsonObjectExtensionsKt.asJsonObjectOrNull(r1)
            if (r5 == 0) goto L51
            r0 = 0
            java.lang.String r2 = "ok"
            boolean r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optBoolean(r5, r2, r0)
            if (r0 != 0) goto L45
            java.lang.String r1 = "status"
            java.lang.String r0 = "not_ok"
            java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r1, r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L51
        L45:
            kotlinx.serialization.json.JsonObject r0 = X.C60O.A1J(r5)
            if (r0 == 0) goto L4e
            r7.emitArtifactsSnapshotIfPresent(r0)
        L4e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L51:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r7.navigationSubscription
            X.Bs8.A00(r3, r4, r0)
            java.lang.String r1 = "HatchGatewayEventsHandler"
            java.lang.String r0 = "navigation.subscribe failed"
            X.CFK.A06(r1, r0)
            goto L4e
        L5e:
            X.Hwg.A00(r1)
            boolean r0 = r7.isConnected()
            if (r0 == 0) goto L4e
            java.lang.Object r3 = X.C3cG.A0T()
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r7.navigationSubscription
            boolean r0 = X.Bs8.A00(r4, r3, r0)
            if (r0 == 0) goto L4e
            X.2nw r2 = X.C60O.A1K()
            com.facebook.aura.utils.HatchUtils r0 = com.facebook.aura.utils.HatchUtils.INSTANCE
            boolean r0 = r0.isSidePanelSpacesEnabled()
            if (r0 == 0) goto L86
            com.facebook.aura.gateway.HatchGatewayEventsHandler$subscribeArtifacts$params$1$1 r1 = com.facebook.aura.gateway.HatchGatewayEventsHandler$subscribeArtifacts$params$1$1.INSTANCE
            java.lang.String r0 = "capabilities"
            X.C7qW.A07(r0, r1, r2)
        L86:
            kotlinx.serialization.json.JsonObject r2 = r2.A00()
            com.facebook.aura.network.api.RpcMethod$ArtifactsSubscribe r8 = com.facebook.aura.network.api.RpcMethod.ArtifactsSubscribe.INSTANCE
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            kotlinx.serialization.json.JsonObjectSerializer r0 = kotlinx.serialization.json.JsonObjectSerializer.A01
            java.lang.String r9 = r1.A02(r2, r0)
            r12.L$0 = r3
            r12.L$1 = r4
            r12.label = r6
            r10 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r1 = r7.sendRequestAndWaitInternal(r8, r9, r10, r12)
            if (r1 != r5) goto L24
            return r5
        La3:
            com.facebook.aura.gateway.HatchGatewayEventsHandler$subscribeArtifacts$1 r12 = new com.facebook.aura.gateway.HatchGatewayEventsHandler$subscribeArtifacts$1
            r12.<init>(r13)
            goto L13
        Laa:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayEventsHandler.subscribeArtifacts(X.HtJ):java.lang.Object");
    }

    public final Object toggleReaction(String str, String str2, String str3, HtJ<? super List<String>> htJ) {
        return this.chatHandler.toggleReaction(str, str2, str3, htJ);
    }

    public final class Companion {
        public final HatchGatewayEventsHandler getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchGatewayEventsHandler) abstractC3358CGz.A03(HatchGatewayEventsHandler.class, new HatchGatewayEventsHandler$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchGatewayEventsHandler(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.connection = companion;
        JarvisProtocol jarvisProtocol = companion.protocol;
        this.protocol = jarvisProtocol;
        HzC hzCA01 = C78T.A01(AnonymousClass001.A0y(), null);
        this.scope = hzCA01;
        this.flipperReporter = new FlipperWebSocketReporter(hzCA01);
        this.networkLogRecorder = new HatchGatewayNetworkLogRecorder();
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 64);
        this._chatEvents = c9290GCrA12;
        this.chatEvents = C3pd.A00(c9290GCrA12);
        C9290GCr c9290GCrA122 = C3cG.A12(num, 0, 16);
        this._deliveryAcks = c9290GCrA122;
        this.deliveryAcks = C3pd.A00(c9290GCrA122);
        C9290GCr c9290GCrA123 = C3cG.A12(num, 0, 16);
        this._deliveryErrors = c9290GCrA123;
        this.deliveryErrors = C3pd.A00(c9290GCrA123);
        C9290GCr c9290GCrA124 = C3cG.A12(num, 0, 16);
        this._transportRejections = c9290GCrA124;
        this.transportRejections = C3pd.A00(c9290GCrA124);
        C9290GCr c9290GCrA125 = C3cG.A12(num, 0, 8);
        this._feedUpdateEvents = c9290GCrA125;
        this.feedUpdateEvents = C3pd.A00(c9290GCrA125);
        C9290GCr c9290GCrA126 = C3cG.A12(num, 0, 8);
        this._activityUpdateEvents = c9290GCrA126;
        this.activityUpdateEvents = C3pd.A00(c9290GCrA126);
        C9290GCr c9290GCrA127 = C3cG.A12(num, 0, 8);
        this._goalUpdatedEvents = c9290GCrA127;
        this.goalUpdatedEvents = C3pd.A00(c9290GCrA127);
        C9290GCr c9290GCrA128 = C3cG.A12(num, 0, 8);
        this._tasksUpdateEvents = c9290GCrA128;
        this.tasksUpdateEvents = C3pd.A00(c9290GCrA128);
        C9290GCr c9290GCrA129 = C3cG.A12(num, 0, 8);
        this._sessionUpdatedEvents = c9290GCrA129;
        this.sessionUpdatedEvents = C3pd.A00(c9290GCrA129);
        C9290GCr c9290GCrA1210 = C3cG.A12(num, 0, 8);
        this._themeUpdateEvents = c9290GCrA1210;
        this.themeUpdateEvents = C3pd.A00(c9290GCrA1210);
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this._fileUpdateEvents = c9286GCnA14;
        this.fileUpdateEvents = C3cG.A11(c9286GCnA14);
        Integer num2 = C79.A01;
        C9290GCr c9290GCrA1211 = C3cG.A12(num2, 1, 5);
        this._artifactsSnapshotEvents = c9290GCrA1211;
        this.artifactsSnapshotEvents = C3pd.A00(c9290GCrA1211);
        C9290GCr c9290GCrA1212 = C3cG.A12(num2, 0, 16);
        this._artifactItemsUpdated = c9290GCrA1212;
        this.artifactItemsUpdated = C3pd.A00(c9290GCrA1212);
        C9290GCr c9290GCrA1213 = C3cG.A12(num2, 0, 1);
        this._navigationTabOrderUpdated = c9290GCrA1213;
        this.navigationTabOrderUpdated = C3pd.A00(c9290GCrA1213);
        C9290GCr c9290GCrA1214 = C3cG.A12(num2, 0, 16);
        this._artifactItemsRemoved = c9290GCrA1214;
        this.artifactItemsRemoved = C3pd.A00(c9290GCrA1214);
        C9290GCr c9290GCrA1215 = C3cG.A12(num2, 1, 5);
        this._approvalsSnapshotEvents = c9290GCrA1215;
        this.approvalsSnapshotEvents = C3pd.A00(c9290GCrA1215);
        C9286GCn c9286GCnA01 = HnJ.A01(AGH.A0E());
        this._rootAgentIdsBySession = c9286GCnA01;
        this.rootAgentIdsBySession = C3cG.A11(c9286GCnA01);
        this.liveThreadSessions = ConcurrentHashMap.newKeySet();
        this.confirmedThreadSessions = ConcurrentHashMap.newKeySet();
        this.subscribedOnConnection = ConcurrentHashMap.newKeySet();
        this.navigationSubscription = new AtomicReference<>(null);
        this.activeSubAgentIds = C3cG.A0k();
        C9286GCn c9286GCnA142 = C3cG.A14(0);
        this._activeSubAgentCount = c9286GCnA142;
        this.activeSubAgentCount = C3cG.A11(c9286GCnA142);
        HatchSubAgentsHandler hatchSubAgentsHandler = new HatchSubAgentsHandler();
        this.subAgentsHandler = hatchSubAgentsHandler;
        this.activeSubAgents = hatchSubAgentsHandler.activeSubAgents;
        this.completedSubAgents = hatchSubAgentsHandler.completedSubAgents;
        this.statusAccumulator = new HatchDeltaAccumulator();
        C9286GCn c9286GCnA143 = C3cG.A14(new HatchGatewayConnectionState.Disconnected(HatchGatewayConnectionState.Reason.NONE));
        this._identityConnectionState = c9286GCnA143;
        HatchAiIdentityHandler hatchAiIdentityHandler = new HatchAiIdentityHandler(abstractC3358CGz, hzCA01, c9286GCnA143);
        this.aiIdentityHandler = hatchAiIdentityHandler;
        this.aiIdentity = hatchAiIdentityHandler.aiIdentity;
        this.pendingRequests = C60O.A1C();
        C9286GCn c9286GCnA144 = C3cG.A14(0);
        this._pendingRequestCount = c9286GCnA144;
        this.pendingRequestCount = C3cG.A11(c9286GCnA144);
        this.agentStatusSequence = new AtomicLong(0L);
        this.agentStatusAdmissionFloor = new AtomicLong(0L);
        C9290GCr c9290GCrA1216 = C3cG.A12(num2, 1, 17);
        this._agentStatusEvents = c9290GCrA1216;
        this.agentStatusEvents = C3pd.A00(c9290GCrA1216);
        C9286GCn c9286GCnA145 = C3cG.A14(hrH);
        this._milestoneVideoUrl = c9286GCnA145;
        this.milestoneVideoUrl = C3cG.A11(c9286GCnA145);
        this.chatHandler = new HatchChatHandler(new HatchGatewayEventsHandler$chatHandler$1(this), jarvisProtocol, abstractC3358CGz);
        this.executionObserver = GAo.A02(num, C6ys.A00, new HatchGatewayEventsHandler$executionObserver$1(this, null), hzCA01);
    }

    private final void handleActivityUpdatedEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            C7384Etj.A0Y(jsonObject, 0);
            this._activityUpdateEvents.AhV(new ActivityUpdatedEvent(jsonObjectA1J, jsonObject.containsKey(AgeCheckFunnelLogging.KEY_SEQ) ? C60P.A1I(jsonObject, AgeCheckFunnelLogging.KEY_SEQ) : null));
        }
    }

    private final void handleAgentStatusEvent(JsonObject jsonObject) {
        Object objA0s;
        String str;
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            AgentActivityStatus agentActivityStatusFromActivityCode = AgentActivityStatus.Companion.fromActivityCode(JsonObjectExtensionsKt.optString(jsonObjectA1J, "activity_code", "online"));
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "activity_text", "");
            String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "activity_emoji", "");
            String str2 = null;
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            try {
                objA0s = (AgentStatusDetailJson) HatchJsonKt.HatchJson.A01(AgentStatusDetailJson$$serializer.INSTANCE, jsonObjectA1J);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            AgentStatusDetailJson agentStatusDetailJson = (AgentStatusDetailJson) objA0s;
            if (agentStatusDetailJson == null || (str = agentStatusDetailJson.activity_detail) == null || str.length() == 0) {
                str = null;
            }
            if (JsonObjectExtensionsKt.optBoolean(jsonObjectA1J, "is_thread", false)) {
                String strOptString3 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "session_id", "");
                if (strOptString3.length() != 0) {
                    str2 = strOptString3;
                }
            }
            this._agentStatusEvents.AhV(new AgentStatusPayload(this.agentStatusSequence.incrementAndGet(), agentActivityStatusFromActivityCode, strOptString, strOptString2, str2, jsonObjectA1J.containsKey(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT) ? JsonObjectExtensionsKt.optInt(jsonObjectA1J, AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT, 0) : 0, parseAgentStatusCta(jsonObjectA1J), str));
        }
    }

    private final void handleApprovalsSnapshotEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            this._approvalsSnapshotEvents.AhV(jsonObjectA1J);
        }
    }

    private final void handleArtifactItemsRemovedEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            this._artifactItemsRemoved.AhV(jsonObjectA1J);
        }
    }

    private final void handleArtifactItemsSnapshotEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            emitArtifactsSnapshotIfPresent(jsonObjectA1J);
        }
    }

    private final void handleArtifactItemsUpdatedEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            this._artifactItemsUpdated.AhV(jsonObjectA1J);
        }
    }

    private final void handleFeedUpdatedEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            this._feedUpdateEvents.AhV(new FeedUpdateEvent(JsonObjectExtensionsKt.optBoolean(jsonObjectA1J, "is_generating", false)));
        }
    }

    private final void handleFileUpdatedEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            AnonymousClass002.A1I(this._fileUpdateEvents, new FileUpdateEvent(JsonObjectExtensionsKt.optString(jsonObjectA1J, "op", ""), JsonObjectExtensionsKt.optString(jsonObjectA1J, "path", "")));
        }
    }

    private final void handleGoalUpdatedEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            this._goalUpdatedEvents.AhV(jsonObjectA1J);
        }
    }

    private final void handleHeartbeatNotificationEvent(JsonObject jsonObject) {
        G0V<? super String, ? super String, Unit> g0v;
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "run_id", "");
            if (strOptString.length() == 0 || (g0v = this.onHeartbeatNotification) == null) {
                return;
            }
            g0v.invoke(strOptString, JsonObjectExtensionsKt.optString(jsonObjectA1J, "content", ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleReactionsUpdatedEvent(JsonObject jsonObject, HtJ<? super Unit> htJ) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null) {
            String strOptString = JsonObjectExtensionsKt.optString(jsonObjectA1J, "message_id", "");
            if (strOptString.length() != 0) {
                List<String> reactionEmojis = HatchChatHandlerKt.parseReactionEmojis(JsonObjectExtensionsKt.optJsonArray(jsonObjectA1J, "reactions"));
                boolean zOptBoolean = JsonObjectExtensionsKt.optBoolean(jsonObjectA1J, "is_thread", false);
                String str = null;
                if (zOptBoolean) {
                    String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectA1J, "session_id", "");
                    if (strOptString2.length() != 0) {
                        str = strOptString2;
                    }
                }
                Object objEmitChatEvent = emitChatEvent(new HatchChatEvent.ReactionsUpdated(strOptString, reactionEmojis, new CanonicalEventEnvelope(null, null, null, null, null, null, null, null, str, zOptBoolean, null, null)), htJ);
                if (objEmitChatEvent == EnumC10460Hji.A02) {
                    return objEmitChatEvent;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void handleServiceNoticeEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J == null || !jsonObjectA1J.containsKey(AuraDeeplinkRouteMapper.CODE_PARAM)) {
            return;
        }
        int iOptInt = JsonObjectExtensionsKt.optInt(jsonObjectA1J, AuraDeeplinkRouteMapper.CODE_PARAM, 0);
        String strA0u = C60O.A0u(jsonObjectA1J, ReplyAttributionSerializer.TYPE_MESSAGE);
        CFK.A05(HatchGatewayEventsHandlerKt.TAG, FGI.A0W("service.notice: code=", " message=", strA0u, iOptInt));
        this.connection.onServiceNotice$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(iOptInt, strA0u);
    }

    private final void handleSessionsUpdatedEvent(JsonObject jsonObject) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J != null || (jsonObjectA1J = JsonObjectExtensionsKt.optJsonObject(jsonObject, AuraBloksDataProps.PARAMS)) != null) {
            jsonObject = jsonObjectA1J;
        }
        String strOptString = JsonObjectExtensionsKt.optString(jsonObject, "session_id", "");
        if (strOptString.length() > 0) {
            String strOptString2 = JsonObjectExtensionsKt.optString(jsonObject, "change", "");
            C7384Etj.A0Y(jsonObject, 0);
            this._sessionUpdatedEvents.AhV(new SessionUpdatedEvent(strOptString, strOptString2, jsonObject.containsKey("updated_at_ms") ? C60P.A1I(jsonObject, "updated_at_ms") : null, HatchSessionUpdatedEventJsonKt.parseSessionUpdate(jsonObject)));
        }
    }

    private final void handleThemeUpdatedEvent(JsonObject jsonObject) {
        ThemeUpdateEvent themeUpdateEvent = ThemeUpdateEventKt.parseThemeUpdateEvent(jsonObject);
        if (themeUpdateEvent != null) {
            String str = themeUpdateEvent.selectedThemeId;
            if (str == null) {
                str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            }
            CFK.A05(HatchGatewayEventsHandlerKt.TAG, FGI.A0M("Handling theme.updated event selectedThemeId=", str));
            this._themeUpdateEvents.AhV(themeUpdateEvent);
        }
    }

    private final String invocationDiagnostic(JsonObject jsonObject) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        C2nw c2nwA1K = C60O.A1K();
        Iterator it = Arrays.asList("type", "id", AgeCheckFunnelLogging.KEY_METHOD, "event", PairsInviteMailboxKt.OUTCOME_OK, AuraDeeplinkRouteMapper.STATUS_ROUTE).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            Object obj = jsonObject.get(strA0j);
            if ((obj instanceof JsonPrimitive) && (jsonElement2 = (JsonElement) obj) != null) {
                c2nwA1K.A01(strA0j, jsonElement2);
            }
        }
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "payload");
        if (jsonObjectOptJsonObject != null || (jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, AuraBloksDataProps.PARAMS)) != null) {
            C2nw c2nwA1K2 = C60O.A1K();
            Iterator it2 = Arrays.asList("invoke_id", "request_id", "command_id", NodeCommandFallbackWorker.KEY_COMMAND, PairsInviteMailboxKt.OUTCOME_OK).iterator();
            while (it2.hasNext()) {
                String strA0j2 = AnonymousClass005.A0j(it2);
                Object obj2 = jsonObjectOptJsonObject.get(strA0j2);
                if ((obj2 instanceof JsonPrimitive) && (jsonElement = (JsonElement) obj2) != null) {
                    c2nwA1K2.A01(strA0j2, jsonElement);
                }
            }
            c2nwA1K.A01("payload", c2nwA1K2.A00());
        }
        C7qW.A0A("payload_redacted", c2nwA1K, true);
        return C60O.A0v(c2nwA1K);
    }

    private final void logSubscribeResponse(JarvisProtocol.PendingSubscribe pendingSubscribe, JsonObject jsonObject, boolean z) {
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        long jCurrentTimeMillis = System.currentTimeMillis() - pendingSubscribe.sentAtMs;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        if (z) {
            if (extractOptionalString(jsonObjectA1J, "agent_id", "agentId") == null) {
                extractOptionalString(jsonObject, "agent_id", "agentId");
            }
            if (extractOptionalString(jsonObjectA1J, "conn_id", "connId") == null) {
                extractOptionalString(jsonObject, "conn_id", "connId");
                return;
            }
            return;
        }
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "error");
        String strExtractOptionalString = extractOptionalString(jsonObjectOptJsonObject, AuraDeeplinkRouteMapper.CODE_PARAM);
        if (strExtractOptionalString == null) {
            strExtractOptionalString = JsonObjectExtensionsKt.optString(jsonObject, AuraDeeplinkRouteMapper.CODE_PARAM, "unknown");
        }
        String strExtractOptionalString2 = extractOptionalString(jsonObjectOptJsonObject, ReplyAttributionSerializer.TYPE_MESSAGE);
        if (strExtractOptionalString2 == null) {
            strExtractOptionalString2 = JsonObjectExtensionsKt.optString(jsonObject, ReplyAttributionSerializer.TYPE_MESSAGE, "Unknown error");
        }
        String str = pendingSubscribe.connectionAttemptId;
        String str2 = pendingSubscribe.requestId;
        StringBuilder sbA0x = C3cI.A0x("chat.subscribe response: connectionAttemptId=", str);
        sbA0x.append(" requestId=");
        sbA0x.append(str2);
        sbA0x.append(" status=err errorCode=");
        sbA0x.append(strExtractOptionalString);
        sbA0x.append(" errorMessage=");
        sbA0x.append(strExtractOptionalString2);
        sbA0x.append(" latencyMs=");
        sbA0x.append(jCurrentTimeMillis);
        CFK.A04(HatchGatewayEventsHandlerKt.TAG, sbA0x.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resubscribeLiveSessions() {
        if (isConnected()) {
            List listA0U = AbstractC0878AGe.A0U(HatchAgentExecution.Companion.getInstance(this.userSession).activeConversations.getValue());
            ConcurrentHashMap.KeySetView<String, Boolean> keySetView = this.liveThreadSessions;
            C7384Etj.A0T(keySetView);
            Iterator it = BGK.A01(listA0U, keySetView).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.confirmedThreadSessions.contains(str)) {
                    C3UX c3ux = this.scope;
                    HatchGatewayEventsHandler$resubscribeLiveSessions$1$1 hatchGatewayEventsHandler$resubscribeLiveSessions$1$1 = new HatchGatewayEventsHandler$resubscribeLiveSessions$1$1(this, str, null);
                    GAo.A02(C79.A00, C6ys.A00, hatchGatewayEventsHandler$resubscribeLiveSessions$1$1, c3ux);
                }
            }
        }
    }

    public static /* synthetic */ Object sendRequestAndWait$default(HatchGatewayEventsHandler hatchGatewayEventsHandler, RpcMethod rpcMethod, Object obj, long j, HtJ htJ, int i, Object obj2) {
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendToGateway(String str, String str2, String str3) {
        recordOutbound(str, str2, str3);
        this.connection.send(str);
    }

    public final Object sendChatCancel(String str, HtJ<? super JsonElement> htJ) {
        C2nw c2nwA1K = C60O.A1K();
        if (str != null) {
            C7qW.A06("session_id", str, c2nwA1K);
        }
        return sendRequestAndWaitInternal(RpcMethod.ChatCancel.INSTANCE, HatchJsonKt.HatchJson.A02(c2nwA1K.A00(), JsonObjectSerializer.A01), 15000L, htJ);
    }

    public final /* synthetic */ <P> Object sendRequestAndWait(RpcMethod rpcMethod, P p, long j, HtJ<? super JsonElement> htJ) {
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public /* synthetic */ HatchGatewayEventsHandler(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
