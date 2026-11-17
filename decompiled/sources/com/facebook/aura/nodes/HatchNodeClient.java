package com.facebook.aura.nodes;

import X.AbstractC07127nr;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC6610EKa;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BzB;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C6tn;
import X.C6ys;
import X.C7384Etj;
import X.C7438Evz;
import X.C78T;
import X.C79;
import X.C7yC;
import X.C9286GCn;
import X.C9oY;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.F0C;
import X.F1F;
import X.F1d;
import X.F3R;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzC;
import X.HzP;
import X.InterfaceC7549F2g;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.assist.status.HatchDefaultAssistantStatus;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.commands.core.PermissionChangeNotifier;
import com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.devices.pairing.LinkPairingProtocolStrings;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.gateway.service.NodeCommandService;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.network.api.RpcMethod;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeHitlGate;
import com.facebook.aura.nodes.core.NodePinReminderPresenter;
import com.facebook.aura.nodes.core.NodeResultSender;
import com.facebook.aura.nodes.core.NodeWireJsonKt;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourcePublishSink;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.HatchProactiveTriggerManager;
import com.facebook.aura.nodes.datasource.ProactiveConnectionGate;
import com.facebook.aura.nodes.datasource.ProactiveSyncRunner;
import com.facebook.aura.nodes.json.ClientDataSourcePublishParamsJson;
import com.facebook.aura.nodes.json.ClientInvokeErrorJson;
import com.facebook.aura.nodes.json.ClientInvokeResultParamsJson;
import com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson;
import com.facebook.aura.nodes.json.NodePairingStatus;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistry;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.nodes.registry.HatchNodeCommandRegistry;
import com.facebook.aura.nodes.registry.NodeRegistrationInfo;
import com.facebook.aura.nodes.snapshot.DefaultHatchCommandDescriptionResolver;
import com.facebook.aura.nodes.snapshot.HatchCapabilitiesSnapshot;
import com.facebook.aura.nodes.snapshot.HatchClientCapabilitiesProtocol;
import com.facebook.aura.nodes.snapshot.HatchPermissionCatalogKt;
import com.facebook.aura.nodes.snapshot.PermissionEntry;
import com.facebook.aura.nodes.transport.HatchNodeHttpClient;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import com.facebook.aura.nodes.transport.HatchNodeTransport;
import com.facebook.aura.nodes.transport.NodeConnectionState;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import com.facebook.aura.pairs.PairsRepositoryKt;
import com.facebook.aura.perf.HatchNodeQplLogger;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.uicontrol.UiCommandRegistry;
import com.facebook.aura.uicontrol.UiControlDispatcher;
import com.facebook.aura.uicontrol.UiControlDispatcherKt;
import com.facebook.aura.utils.MC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class HatchNodeClient implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Long> _registrationEpoch;
    public final Context context;
    public final DataSourcePublishSink dataSourcePublishSink;
    public final HatchDataSourceRegistry dataSourceRegistry;
    public final F0C declaredPermissions$delegate;
    public final ConcurrentHashMap<String, HeldInvokeParams> fallbackInvokeParams;
    public NodeHitlGate hitlGate;
    public HatchNodeHttpClient httpClient;
    public final HatchNodeInvocationDispatcher invocationDispatcher;
    public final ConcurrentHashMap<String, Long> invokeReceivedAt;
    public final NodeOptionalPermissionDeclines optionalPermissionDeclines;
    public final NodePermissionGate permissionGate;
    public final NodePermissionPrompt permissionPrompt;
    public final NodePinReminderDispatcher pinReminderDispatcher;
    public final ProactiveConnectionGate proactiveConnectionGate;
    public ProactiveSyncDispatcher proactiveSyncDispatcher;
    public HatchClientCapabilitiesProtocol protocol;
    public HoC registerJob;
    public final AtomicLong registrationCount;
    public final C1BN<Long> registrationEpoch;
    public final HatchNodeCommandRegistry registry;
    public final NodeResultSender resultSender;
    public final C3UX scope;
    public final Set<String> serviceDispatches;
    public volatile boolean sessionEnded;
    public HatchCapabilitiesSnapshot snapshot;
    public HatchNodeTransport transport;
    public HatchProactiveTriggerManager triggerManager;
    public final UiCommandRegistry uiCommandRegistry;
    public final UiControlDispatcher uiControlDispatcher;
    public final AbstractC3358CGz userSession;

    public interface ProactiveSyncDispatcher {
        void cancelAll(Context context);

        void enqueueAll(Context context);
    }

    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$attach$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<JsonElement, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JsonElement jsonElement) {
            C7384Etj.A0Y(jsonElement, 0);
            HatchNodeClient.this.handleInvokeRequest(C9oY.A05(jsonElement));
        }

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(JsonElement jsonElement) {
            invoke2(jsonElement);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$attach$3", f = "HatchNodeClient.kt", l = {456}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$attach$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchNodeTransport $transport;
        public int label;
        public final /* synthetic */ HatchNodeClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchNodeTransport hatchNodeTransport, HatchNodeClient hatchNodeClient, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$transport = hatchNodeTransport;
            this.this$0 = hatchNodeClient;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$transport, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BN<NodeConnectionState> connectionState = this.$transport.getConnectionState();
                    final HatchNodeClient hatchNodeClient = this.this$0;
                    C20Z<? super NodeConnectionState> c20z = new C20Z() { // from class: com.facebook.aura.nodes.HatchNodeClient.attach.3.1
                        public final Object emit(NodeConnectionState nodeConnectionState, HtJ<? super Unit> htJ) {
                            boolean z = nodeConnectionState instanceof NodeConnectionState.Connected;
                            hatchNodeClient.invocationDispatcher.connectionChanged(z);
                            if (z) {
                                hatchNodeClient.pinReminderDispatcher.onConnected();
                                hatchNodeClient.launchRegister();
                            } else if ((nodeConnectionState instanceof NodeConnectionState.Disconnected) || (nodeConnectionState instanceof NodeConnectionState.Error)) {
                                HoC hoC = hatchNodeClient.registerJob;
                                if (hoC != null) {
                                    hoC.A5w(null);
                                }
                                hatchNodeClient._registrationEpoch.Af8(null);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((NodeConnectionState) obj2, (HtJ<? super Unit>) htJ);
                        }
                    };
                    this.label = 1;
                    if (connectionState.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw C3cG.A0p();
            } catch (Throwable th) {
                CFK.A06(HatchNodeClientKt.TAG, FGI.A0M("connection observer failed: ", th.getMessage()));
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$attach$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends C7438Evz implements G0U<String, Boolean> {
        public AnonymousClass4(Object obj) {
            super(1, obj, HatchDataSourceRegistry.class, "isUserEnabled", "isUserEnabled(Ljava/lang/String;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(String str) {
            return Boolean.valueOf(((HatchDataSourceRegistry) AnonymousClass006.A0o(str, this)).isUserEnabled(str));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$attach$5", f = "HatchNodeClient.kt", l = {498}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$attach$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass5(HtJ<? super AnonymousClass5> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchNodeClient.this.new AnonymousClass5(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchNodeClient.this.new AnonymousClass5(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundFlow;
                final HatchNodeClient hatchNodeClient = HatchNodeClient.this;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.nodes.HatchNodeClient.attach.5.1
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (z && hatchNodeClient.registry.hasNodeEnvironmentChanged()) {
                            CFK.A05(HatchNodeClientKt.TAG, "Node environment changed (foreground); re-snapshotting");
                            hatchNodeClient.resnapshot();
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$attach$6", f = "HatchNodeClient.kt", l = {507}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$attach$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass6(HtJ<? super AnonymousClass6> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchNodeClient.this.new AnonymousClass6(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchNodeClient.this.new AnonymousClass6(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<Unit> c22i = PermissionChangeNotifier.events;
                final HatchNodeClient hatchNodeClient = HatchNodeClient.this;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.nodes.HatchNodeClient.attach.6.1
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        if (hatchNodeClient.registry.hasNodeEnvironmentChanged()) {
                            CFK.A05(HatchNodeClientKt.TAG, "Node environment changed (in-app permission change); re-snapshotting");
                            hatchNodeClient.resnapshot();
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient", f = "HatchNodeClient.kt", l = {610}, m = "disconnect", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$disconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C127421 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C127421(HtJ<? super C127421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeClient.this.disconnect(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$dispatchExternalCommand$1", f = "HatchNodeClient.kt", l = {1227}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$dispatchExternalCommand$1, reason: invalid class name and case insensitive filesystem */
    public final class C127431 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $commandId;
        public final /* synthetic */ String $requestId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127431(String str, String str2, HtJ<? super C127431> htJ) {
            super(2, htJ);
            this.$requestId = str;
            this.$commandId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchNodeClient.this.new C127431(this.$requestId, this.$commandId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchNodeClient hatchNodeClient = HatchNodeClient.this;
                    String str = this.$requestId;
                    String strA0U = FGI.A0U("Could not dispatch ", this.$commandId, ": FGS blocked and WorkManager fallback failed");
                    this.label = 1;
                    if (HatchNodeClient.sendInvokeResultEnvelope$default(hatchNodeClient, str, false, null, "dispatch_failed", strA0U, this, 4, null) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Exception e) {
                CFK.A08(HatchNodeClientKt.TAG, "Failed to send dispatch-failed envelope", e);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C127431) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient", f = "HatchNodeClient.kt", l = {713, 730, 762, 767, 770, 796, 810, 821, 839, 850, 882, 892, 938, 943, 962}, m = "executeCommand", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$executeCommand$1, reason: invalid class name and case insensitive filesystem */
    public final class C127441 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$18;
        public Object L$19;
        public Object L$2;
        public Object L$20;
        public Object L$21;
        public Object L$22;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C127441(HtJ<? super C127441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeClient.this.executeCommand(null, null, null, null, null, null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$executeCommand$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C127452 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C127452 INSTANCE = new C127452();

        public C127452() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$executeCommand$5, reason: invalid class name and case insensitive filesystem */
    public final class C127465 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ HatchNodeCommandHandler $handler;
        public final /* synthetic */ String $paramsJson;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127465(HatchNodeCommandHandler hatchNodeCommandHandler, String str) {
            super(0);
            this.$handler = hatchNodeCommandHandler;
            this.$paramsJson = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AnonymousClass002.A1Y(HatchNodeClient.this.permissionGate.missingCommandDevicePermission(this.$handler, this.$paramsJson)));
        }
    }

    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$executeCommand$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ List<String> $promptableOptionalPermissions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(List<String> list) {
            super(0);
            this.$promptableOptionalPermissions = list;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AnonymousClass002.A1Y(HatchNodeClient.this.permissionGate.missingDevicePermissionEntry(this.$promptableOptionalPermissions)));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$1", f = "HatchNodeClient.kt", l = {HatchMessageShareDocumentRenderer.CONTENT_WIDTH_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$1, reason: invalid class name and case insensitive filesystem */
    public final class C127471 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $command;
        public final /* synthetic */ JsonObject $json;
        public final /* synthetic */ JsonObject $payload;
        public final /* synthetic */ long $receivedAtElapsedMs;
        public final /* synthetic */ String $requestId;
        public final /* synthetic */ Long $timeoutMs;
        public int label;
        public final /* synthetic */ HatchNodeClient this$0;

        @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$1$1", f = "HatchNodeClient.kt", l = {1074, 1087}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02481 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $command;
            public final /* synthetic */ JsonObject $json;
            public final /* synthetic */ JsonObject $payload;
            public final /* synthetic */ long $receivedAtElapsedMs;
            public final /* synthetic */ String $requestId;
            public final /* synthetic */ Long $timeoutMs;
            public Object L$0;
            public int label;
            public final /* synthetic */ HatchNodeClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02481(HatchNodeClient hatchNodeClient, String str, JsonObject jsonObject, JsonObject jsonObject2, Long l, long j, String str2, HtJ<? super C02481> htJ) {
                super(1, htJ);
                this.this$0 = hatchNodeClient;
                this.$requestId = str;
                this.$payload = jsonObject;
                this.$json = jsonObject2;
                this.$timeoutMs = l;
                this.$receivedAtElapsedMs = j;
                this.$command = str2;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C02481(this.this$0, this.$requestId, this.$payload, this.$json, this.$timeoutMs, this.$receivedAtElapsedMs, this.$command, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objSendInvokeResultEnvelope$default;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    try {
                    } catch (Throwable th) {
                        CFK.A06(HatchNodeClientKt.TAG, FGI.A0d("reserved command ", this.$command, " failed: ", th.getMessage()));
                        HatchNodeQplLogger.INSTANCE.backfillFailureIfActive(this.$requestId, PairsRepositoryKt.INTERNAL_ERROR, th);
                        HatchNodeClient hatchNodeClient = this.this$0;
                        String str = this.$requestId;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "internal error";
                        }
                        this.L$0 = null;
                        this.label = 2;
                        objSendInvokeResultEnvelope$default = HatchNodeClient.sendInvokeResultEnvelope$default(hatchNodeClient, str, false, null, PairsRepositoryKt.INTERNAL_ERROR, message, this, 4, null);
                    }
                } catch (Throwable unused) {
                }
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
                HatchNodeClient hatchNodeClient2 = this.this$0;
                String str2 = this.$requestId;
                JsonObject jsonObject = this.$payload;
                if (jsonObject == null) {
                    jsonObject = this.$json;
                }
                Long l = this.$timeoutMs;
                long j = this.$receivedAtElapsedMs;
                this.label = 1;
                objSendInvokeResultEnvelope$default = hatchNodeClient2.handleReservedDataSourceCommand(str2, jsonObject, l, j, this);
                if (objSendInvokeResultEnvelope$default == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C02481) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127471(String str, HatchNodeClient hatchNodeClient, String str2, JsonObject jsonObject, JsonObject jsonObject2, Long l, long j, HtJ<? super C127471> htJ) {
            super(2, htJ);
            this.$command = str;
            this.this$0 = hatchNodeClient;
            this.$requestId = str2;
            this.$payload = jsonObject;
            this.$json = jsonObject2;
            this.$timeoutMs = l;
            this.$receivedAtElapsedMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127471(this.$command, this.this$0, this.$requestId, this.$payload, this.$json, this.$timeoutMs, this.$receivedAtElapsedMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchNodeOperationLease hatchNodeOperationLease = HatchNodeOperationLease.INSTANCE;
                String str = this.$command;
                String strA0M = FGI.A0M("invoke:", str);
                C02481 c02481 = new C02481(this.this$0, this.$requestId, this.$payload, this.$json, this.$timeoutMs, this.$receivedAtElapsedMs, str, null);
                this.label = 1;
                if (hatchNodeOperationLease.withLease(strA0M, c02481, this) == enumC10460Hji) {
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
            return ((C127471) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$2", f = "HatchNodeClient.kt", l = {1102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$2, reason: invalid class name and case insensitive filesystem */
    public final class C127482 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $command;
        public final /* synthetic */ JsonObject $json;
        public final /* synthetic */ JsonObject $payload;
        public final /* synthetic */ String $requestId;
        public final /* synthetic */ Long $timeoutMs;
        public int label;
        public final /* synthetic */ HatchNodeClient this$0;

        @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$2$1", f = "HatchNodeClient.kt", l = {1104, 1112}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ JsonObject $json;
            public final /* synthetic */ JsonObject $payload;
            public final /* synthetic */ String $requestId;
            public final /* synthetic */ Long $timeoutMs;
            public Object L$0;
            public int label;
            public final /* synthetic */ HatchNodeClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchNodeClient hatchNodeClient, String str, JsonObject jsonObject, JsonObject jsonObject2, Long l, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = hatchNodeClient;
                this.$requestId = str;
                this.$payload = jsonObject;
                this.$json = jsonObject2;
                this.$timeoutMs = l;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$requestId, this.$payload, this.$json, this.$timeoutMs, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objSendInvokeResultEnvelope$default;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    try {
                    } catch (Throwable th) {
                        CFK.A06(HatchNodeClientKt.TAG, FGI.A0M("pin.reminder dispatch failed: ", th.getMessage()));
                        HatchNodeClient hatchNodeClient = this.this$0;
                        String str = this.$requestId;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "internal error";
                        }
                        this.L$0 = null;
                        this.label = 2;
                        objSendInvokeResultEnvelope$default = HatchNodeClient.sendInvokeResultEnvelope$default(hatchNodeClient, str, false, null, PairsRepositoryKt.INTERNAL_ERROR, message, this, 4, null);
                    }
                } catch (Throwable unused) {
                }
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
                HatchNodeClient hatchNodeClient2 = this.this$0;
                NodePinReminderDispatcher nodePinReminderDispatcher = hatchNodeClient2.pinReminderDispatcher;
                String str2 = this.$requestId;
                JsonObject jsonObject = this.$payload;
                if (jsonObject == null) {
                    jsonObject = this.$json;
                }
                JsonObject jsonObjectResolveCommandParamsObject = hatchNodeClient2.resolveCommandParamsObject(jsonObject);
                Long l = this.$timeoutMs;
                this.label = 1;
                objSendInvokeResultEnvelope$default = nodePinReminderDispatcher.dispatch(str2, jsonObjectResolveCommandParamsObject, l, this);
                if (objSendInvokeResultEnvelope$default == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127482(String str, HatchNodeClient hatchNodeClient, String str2, JsonObject jsonObject, JsonObject jsonObject2, Long l, HtJ<? super C127482> htJ) {
            super(2, htJ);
            this.$command = str;
            this.this$0 = hatchNodeClient;
            this.$requestId = str2;
            this.$payload = jsonObject;
            this.$json = jsonObject2;
            this.$timeoutMs = l;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127482(this.$command, this.this$0, this.$requestId, this.$payload, this.$json, this.$timeoutMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchNodeOperationLease hatchNodeOperationLease = HatchNodeOperationLease.INSTANCE;
                String strA0M = FGI.A0M("invoke:", this.$command);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$requestId, this.$payload, this.$json, this.$timeoutMs, null);
                this.label = 1;
                if (hatchNodeOperationLease.withLease(strA0M, anonymousClass1, this) == enumC10460Hji) {
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
            return ((C127482) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$3", f = "HatchNodeClient.kt", l = {1133}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$3, reason: invalid class name and case insensitive filesystem */
    public final class C127493 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $command;
        public final /* synthetic */ String $paramsJson;
        public final /* synthetic */ String $requestId;
        public final /* synthetic */ Long $timeoutMs;
        public int label;
        public final /* synthetic */ HatchNodeClient this$0;

        @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$3$1", f = "HatchNodeClient.kt", l = {1135, 1139}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $command;
            public final /* synthetic */ String $paramsJson;
            public final /* synthetic */ String $requestId;
            public final /* synthetic */ Long $timeoutMs;
            public Object L$0;
            public int label;
            public final /* synthetic */ HatchNodeClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchNodeClient hatchNodeClient, String str, String str2, String str3, Long l, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = hatchNodeClient;
                this.$command = str;
                this.$requestId = str2;
                this.$paramsJson = str3;
                this.$timeoutMs = l;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$command, this.$requestId, this.$paramsJson, this.$timeoutMs, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objSendInvokeResultEnvelope$default;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    try {
                    } catch (Throwable th) {
                        CFK.A06(HatchNodeClientKt.TAG, C60P.A1L("ui.* dispatch outer failure command=", this.$command, th.getMessage()));
                        HatchNodeClient hatchNodeClient = this.this$0;
                        String str = this.$requestId;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "internal error";
                        }
                        this.L$0 = null;
                        this.label = 2;
                        objSendInvokeResultEnvelope$default = HatchNodeClient.sendInvokeResultEnvelope$default(hatchNodeClient, str, false, null, UiControlDispatcherKt.ERROR_CODE_CLIENT_FAILED, message, this, 4, null);
                    }
                } catch (Throwable unused) {
                }
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
                UiControlDispatcher uiControlDispatcher = this.this$0.uiControlDispatcher;
                String str2 = this.$command;
                String str3 = this.$requestId;
                String str4 = this.$paramsJson;
                Long l = this.$timeoutMs;
                this.label = 1;
                objSendInvokeResultEnvelope$default = uiControlDispatcher.dispatch(str2, str3, str4, l, this);
                if (objSendInvokeResultEnvelope$default == enumC10460Hji) {
                    return enumC10460Hji;
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127493(String str, HatchNodeClient hatchNodeClient, String str2, String str3, Long l, HtJ<? super C127493> htJ) {
            super(2, htJ);
            this.$command = str;
            this.this$0 = hatchNodeClient;
            this.$requestId = str2;
            this.$paramsJson = str3;
            this.$timeoutMs = l;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C127493(this.$command, this.this$0, this.$requestId, this.$paramsJson, this.$timeoutMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchNodeOperationLease hatchNodeOperationLease = HatchNodeOperationLease.INSTANCE;
                String str = this.$command;
                String strA0M = FGI.A0M("invoke:", str);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, str, this.$requestId, this.$paramsJson, this.$timeoutMs, null);
                this.label = 1;
                if (hatchNodeOperationLease.withLease(strA0M, anonymousClass1, this) == enumC10460Hji) {
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
            return ((C127493) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$5", f = "HatchNodeClient.kt", l = {1173}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$handleInvokeRequest$5, reason: invalid class name and case insensitive filesystem */
    public final class C127505 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $requestId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127505(String str, HtJ<? super C127505> htJ) {
            super(2, htJ);
            this.$requestId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchNodeClient.this.new C127505(this.$requestId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchNodeClient hatchNodeClient = HatchNodeClient.this;
                    String str = this.$requestId;
                    this.label = 1;
                    if (HatchNodeClient.sendInvokeResultEnvelope$default(hatchNodeClient, str, false, null, PairsRepositoryKt.INTERNAL_ERROR, "internal error", this, 4, null) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C127505) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient", f = "HatchNodeClient.kt", l = {1292, 1304, 1325, 1344, 1365, 1369, 1441, 1456, 1482}, m = "handleReservedDataSourceCommand", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$1, reason: invalid class name and case insensitive filesystem */
    public final class C127511 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
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

        public C127511(HtJ<? super C127511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeClient.this.handleReservedDataSourceCommand(null, null, null, 0L, this);
        }
    }

    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$2, reason: invalid class name and case insensitive filesystem */
    public final class C127522 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ DataSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127522(DataSource dataSource) {
            super(0);
            this.$source = dataSource;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AnonymousClass002.A1Y(HatchNodeClient.this.missingSourcePermission(this.$source)));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$launchRegister$1", f = "HatchNodeClient.kt", l = {1528}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$launchRegister$1, reason: invalid class name and case insensitive filesystem */
    public final class C127531 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C127531(HtJ<? super C127531> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchNodeClient.this.new C127531(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchNodeClient.this.new C127531(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchNodeClient hatchNodeClient = HatchNodeClient.this;
                    this.label = 1;
                    if (hatchNodeClient.register(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Throwable th) {
                CFK.A06(HatchNodeClientKt.TAG, FGI.A0M("register failed: ", th.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient", f = "HatchNodeClient.kt", l = {562}, m = "listNodes", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$listNodes$1, reason: invalid class name and case insensitive filesystem */
    public final class C127541 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C127541(HtJ<? super C127541> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeClient.this.listNodes(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient", f = "HatchNodeClient.kt", l = {1574, 1588}, m = "register", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$register$1, reason: invalid class name and case insensitive filesystem */
    public final class C127551 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C127551(HtJ<? super C127551> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeClient.this.register(this);
        }
    }

    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$rememberInvokeReceivedAt$1, reason: invalid class name and case insensitive filesystem */
    public final class C127561 extends AbstractC7559F3s implements G0U<Long, Boolean> {
        public final /* synthetic */ long $receivedAtElapsedMs;

        @Override // X.G0U
        public final Boolean invoke(Long l) {
            C7384Etj.A0Y(l, 0);
            return Boolean.valueOf(AnonymousClass002.A1N(((this.$receivedAtElapsedMs - l.longValue()) > 600000L ? 1 : ((this.$receivedAtElapsedMs - l.longValue()) == 600000L ? 0 : -1))));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127561(long j) {
            super(1);
            this.$receivedAtElapsedMs = j;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient", f = "HatchNodeClient.kt", l = {VoyagerAsrClient.ABNORMAL_CLOSE_CODE}, m = "respondPermissionDenied", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$respondPermissionDenied$1, reason: invalid class name and case insensitive filesystem */
    public final class C127571 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C127571(HtJ<? super C127571> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeClient.this.respondPermissionDenied(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient", f = "HatchNodeClient.kt", l = {MC.hatch_activity_screen.__CONFIG__}, m = LinkPairingProtocolStrings.ACTION_UNPAIR, v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$unpair$1, reason: invalid class name and case insensitive filesystem */
    public final class C127581 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C127581(HtJ<? super C127581> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeClient.this.unpair(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient", f = "HatchNodeClient.kt", l = {598}, m = "unpairNode", v = 2)
    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$unpairNode$1, reason: invalid class name and case insensitive filesystem */
    public final class C127591 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C127591(HtJ<? super C127591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchNodeClient.this.unpairNode(null, null, this);
        }
    }

    private final boolean isOkResponse(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        if (jsonObject != null) {
            Object obj = jsonObject.get(PairsInviteMailboxKt.OUTCOME_OK);
            String strA04 = null;
            JsonPrimitive jsonPrimitive2 = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            if (jsonPrimitive2 == null || !AnonymousClass002.A1b(C9oY.A01(jsonPrimitive2), true)) {
                Object obj2 = jsonObject.get(AuraDeeplinkRouteMapper.STATUS_ROUTE);
                if ((obj2 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj2) != null) {
                    strA04 = C9oY.A04(jsonPrimitive);
                }
                if (PairsInviteMailboxKt.OUTCOME_OK.equals(strA04)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void endSession() {
        this.sessionEnded = true;
    }

    public final boolean isSourcePermissionGranted(DataSource dataSource) {
        C7384Etj.A0Y(dataSource, 0);
        return dataSource.getPermissionRequired().isEmpty() || this.permissionGate.missingDevicePermissionEntry(dataSource.getPermissionRequired()) == null;
    }

    public final HeldInvokeParams peekFallbackInvokeParams(String str) {
        C7384Etj.A0Y(str, 0);
        return this.fallbackInvokeParams.get(str);
    }

    public final HeldInvokeParams takeFallbackInvokeParams(String str) {
        C7384Etj.A0Y(str, 0);
        return this.fallbackInvokeParams.remove(str);
    }

    public final boolean takeServiceDispatch(String str) {
        C7384Etj.A0Y(str, 0);
        return this.serviceDispatches.remove(str);
    }

    public final class Companion {
        public final HatchNodeClient getInstanceIfExists(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchNodeClient) abstractC3358CGz.A02(HatchNodeClient.class);
        }

        public final HatchNodeClient getInstance(AbstractC3358CGz abstractC3358CGz, Context context) {
            AnonymousClass003.A0u(abstractC3358CGz, context);
            return (HatchNodeClient) abstractC3358CGz.A03(HatchNodeClient.class, new HatchNodeClient$Companion$getInstance$1(abstractC3358CGz, context));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.nodes.HatchNodeClient$attach$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void attach$default(HatchNodeClient hatchNodeClient, HatchNodeTransport hatchNodeTransport, HatchNodeHttpClient hatchNodeHttpClient, NodeHitlGate nodeHitlGate, NodePinReminderPresenter nodePinReminderPresenter, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            nodeHitlGate = NodeHitlGate.AllowAll.INSTANCE;
        }
        if ((i & 8) != 0) {
            nodePinReminderPresenter = null;
        }
        if ((i & 16) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        hatchNodeClient.attach(hatchNodeTransport, hatchNodeHttpClient, nodeHitlGate, nodePinReminderPresenter, function0);
    }

    private final String connectionStateValue() {
        C1BN<NodeConnectionState> connectionState;
        HatchNodeTransport hatchNodeTransport = this.transport;
        NodeConnectionState value = (hatchNodeTransport == null || (connectionState = hatchNodeTransport.getConnectionState()) == null) ? null : connectionState.getValue();
        return value instanceof NodeConnectionState.Connected ? "connected" : value instanceof NodeConnectionState.Disconnected ? "disconnected" : value instanceof NodeConnectionState.Error ? "error" : "idle";
    }

    private final JsonObject decodeCommandParams(JsonObject jsonObject) {
        Object objA0s;
        Object objA1F = C60O.A1F("params_json", jsonObject);
        if (!(objA1F instanceof JsonObject)) {
            if (objA1F instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) objA1F;
                if (jsonPrimitive.A01()) {
                    String strA00 = jsonPrimitive.A00();
                    if (strA00.length() > 0) {
                        try {
                            Object objA04 = NodeWireJsonKt.NodeJson.A04(strA00);
                            objA0s = objA04 instanceof JsonObject ? (JsonObject) objA04 : null;
                        } catch (Throwable th) {
                            objA0s = C3cG.A0s(th);
                        }
                        return (JsonObject) (objA0s instanceof C10571Hud ? null : objA0s);
                    }
                }
            }
            objA1F = jsonObject.get(AuraBloksDataProps.PARAMS);
            if (!(objA1F instanceof JsonObject)) {
                return null;
            }
        }
        return (JsonObject) objA1F;
    }

    private final void dispatchExternalCommand(String str, String str2, String str3, Long l) throws Exception {
        Intent intent = new Intent();
        intent.setClassName(this.context, "com.facebook.aura.gateway.service.NodeCommandService");
        intent.putExtra(NodeCommandService.EXTRA_COMMAND, str);
        intent.putExtra(NodeCommandService.EXTRA_REQUEST_ID, str2);
        intent.putExtra(NodeCommandService.EXTRA_PARAMS_JSON, str3);
        if (l != null) {
            intent.putExtra(NodeCommandService.EXTRA_TIMEOUT_MS, l.longValue());
        }
        this.serviceDispatches.add(str2);
        try {
            if (this.context.startForegroundService(intent) != null) {
                return;
            }
        } catch (ForegroundServiceStartNotAllowedException unused) {
        } catch (Exception e) {
            this.serviceDispatches.remove(str2);
            throw e;
        }
        this.serviceDispatches.remove(str2);
        CFK.A06(HatchNodeClientKt.TAG, FGI.A0M("FGS not started, falling back to WorkManager: command=", str));
        if (enqueueCommandWorker(str, str2, str3, l)) {
            return;
        }
        HatchNodeQplLogger.INSTANCE.logCommandDispatchFailed(str2, str);
        AnonymousClass001.A1J(new C127431(str2, str, null), this.scope);
    }

    private final boolean enqueueCommandWorker(String str, String str2, String str3, Long l) {
        Long lRemove = this.invokeReceivedAt.remove(str2);
        HeldInvokeParams heldInvokeParams = new HeldInvokeParams(str3, lRemove != null ? lRemove.longValue() : SystemClock.elapsedRealtime());
        this.fallbackInvokeParams.putIfAbsent(str2, heldInvokeParams);
        try {
            Class<? extends U> clsAsSubclass = Class.forName("com.facebook.aura.gateway.service.NodeCommandFallbackWorker").asSubclass(AbstractC6610EKa.class);
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            linkedHashMapA0j.put(NodeCommandFallbackWorker.KEY_COMMAND, str);
            linkedHashMapA0j.put("request_id", str2);
            linkedHashMapA0j.put(NodeCommandFallbackWorker.KEY_USER_ID, ((CH0) this.userSession).A01);
            BzB bzBA0J = C60R.A0J("timeout_ms", Long.valueOf(l != null ? l.longValue() : 0L), linkedHashMapA0j);
            C7384Etj.A0X(clsAsSubclass);
            F1d f1d = new F1d(clsAsSubclass);
            f1d.A03(bzBA0J);
            F3R.A02(this.context).A04(C7yC.A04, f1d.A01(), FGI.A0M("cmd_", str2));
            CFK.A05(HatchNodeClientKt.TAG, FGI.A0d("Enqueued via WorkManager: command=", str, ", requestId=", C6tn.A02(str2)));
            return true;
        } catch (Exception e) {
            this.fallbackInvokeParams.remove(str2, heldInvokeParams);
            C3cH.A1B("WorkManager fallback failed: ", e.getMessage(), HatchNodeClientKt.TAG, e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object executeCommand$default(HatchNodeClient hatchNodeClient, String str, String str2, String str3, Long l, NodeResultSender nodeResultSender, Long l2, Function0 function0, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            nodeResultSender = hatchNodeClient.resultSender;
        }
        if ((i & 32) != 0) {
            l2 = null;
        }
        if ((i & 64) != 0) {
            function0 = C127452.INSTANCE;
        }
        return hatchNodeClient.executeCommand(str, str2, str3, l, nodeResultSender, l2, function0, htJ);
    }

    public static final void executeCommand$endCancel(String str, F1F f1f) {
        if (str == null || f1f.element) {
            return;
        }
        f1f.element = true;
        HatchNodeQplLogger.INSTANCE.commandCancelled(str);
    }

    public static final void executeCommand$endFailure(String str, F1F f1f, String str2, Throwable th) {
        if (str == null || f1f.element) {
            return;
        }
        f1f.element = true;
        HatchNodeQplLogger.INSTANCE.commandFailure(str, str2, th);
    }

    public static /* synthetic */ void executeCommand$endFailure$default(String str, F1F f1f, String str2, Throwable th, int i, Object obj) {
        if ((i & 8) != 0) {
            th = null;
        }
        executeCommand$endFailure(str, f1f, str2, th);
    }

    public static final void executeCommand$endSuccess(String str, F1F f1f) {
        if (str == null || f1f.element) {
            return;
        }
        f1f.element = true;
        HatchNodeQplLogger.INSTANCE.commandSuccess(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object executeCommand$refuseIfStale(com.facebook.aura.nodes.HatchNodeClient r8, com.facebook.aura.nodes.NodeInvokeBudget r9, com.facebook.aura.nodes.core.NodeResultSender r10, java.lang.String r11, java.lang.String r12, X.F1F r13, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r14) {
        /*
            boolean r0 = r14 instanceof com.facebook.aura.nodes.HatchNodeClient$executeCommand$refuseIfStale$1
            if (r0 == 0) goto L77
            r6 = r14
            com.facebook.aura.nodes.HatchNodeClient$executeCommand$refuseIfStale$1 r6 = (com.facebook.aura.nodes.HatchNodeClient$executeCommand$refuseIfStale$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L2c
            if (r0 != r7) goto L7d
            X.Hwg.A00(r1)
        L20:
            r2 = 0
            java.lang.String r3 = "invoke_expired"
            r1 = 0
            com.facebook.aura.nodes.core.NodeCommandResponse r0 = new com.facebook.aura.nodes.core.NodeCommandResponse
            r4 = r2
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L2c:
            X.Hwg.A00(r1)
            boolean r0 = r8.sessionEnded
            if (r0 == 0) goto L46
            r2 = 0
            r0 = 9
            java.lang.String r3 = X.C3cF.A00(r0)
            executeCommand$endFailure(r12, r13, r3, r2)
            r1 = 0
            com.facebook.aura.nodes.core.NodeCommandResponse r0 = new com.facebook.aura.nodes.core.NodeCommandResponse
            r4 = r2
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L46:
            boolean r0 = r9.isExpired()
            if (r0 != 0) goto L4e
            r0 = 0
            return r0
        L4e:
            r4 = 0
            java.lang.String r3 = "invoke_expired"
            executeCommand$endFailure(r12, r13, r3, r4)
            java.lang.String r2 = X.C60O.A0l()
            java.lang.String r1 = "The command's time limit passed before it could run, so it did not run."
            X.9jH r0 = X.AGH.A0E()
            kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.nodes.core.NodeErrorsKt.nodeError(r3, r1, r0, r4)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.L$2 = r4
            r6.L$3 = r4
            r6.L$4 = r4
            r6.L$5 = r4
            r6.label = r7
            java.lang.Object r0 = r10.sendInvokeResult(r2, r11, r0, r6)
            if (r0 != r5) goto L20
            return r5
        L77:
            com.facebook.aura.nodes.HatchNodeClient$executeCommand$refuseIfStale$1 r6 = new com.facebook.aura.nodes.HatchNodeClient$executeCommand$refuseIfStale$1
            r6.<init>(r14)
            goto L12
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.executeCommand$refuseIfStale(com.facebook.aura.nodes.HatchNodeClient, com.facebook.aura.nodes.NodeInvokeBudget, com.facebook.aura.nodes.core.NodeResultSender, java.lang.String, java.lang.String, X.F1F, X.HtJ):java.lang.Object");
    }

    private final Set<String> getDeclaredPermissions() {
        return (Set) this.declaredPermissions$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleReservedDataSourceCommand(java.lang.String r22, kotlinx.serialization.json.JsonObject r23, java.lang.Long r24, long r25, X.HtJ<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.handleReservedDataSourceCommand(java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.Long, long, X.HtJ):java.lang.Object");
    }

    private final boolean hitlDenialShowsCard(NodeCommandId nodeCommandId) {
        return AnonymousClass002.A1Z(nodeCommandId, NodeCommandId.MESSAGE_SEND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchRegister() {
        HtJ htJA13 = AnonymousClass006.A13(this.registerJob);
        this.registerJob = AnonymousClass001.A11(new C127531(htJA13), this.scope);
    }

    private final void logRegistration(String str, int i, boolean z) {
        C1BN<NodeConnectionState> connectionState;
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        HxE hxEA0r = C3cG.A0r("result", str);
        HxE hxEA0r2 = C3cG.A0r(HatchCcvLoggingKt.EVENT_TYPE_ATTEMPT, String.valueOf(i));
        HatchNodeTransport hatchNodeTransport = this.transport;
        hatchAppEventLogger.logEvent(HatchNodeClientKt.REGISTER_EVENT_NAME, HatchNodeClientKt.REGISTER_SURFACE, null, HatchNodeClientKt.REGISTER_EVENT_TYPE, HatchNodeClientKt.REGISTER_EVENT_NAME, C3cH.A0n(HatchMetadataKey.IS_DEFAULT_ASSISTANT.getValue(), String.valueOf(z), hxEA0r, hxEA0r2, C3cG.A0r("connected", String.valueOf(((hatchNodeTransport == null || (connectionState = hatchNodeTransport.getConnectionState()) == null) ? null : connectionState.getValue()) instanceof NodeConnectionState.Connected))), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PermissionEntry missingSourcePermission(DataSource dataSource) {
        Object next;
        PermissionEntry permissionEntryMissingDevicePermissionEntry = this.permissionGate.missingDevicePermissionEntry(dataSource.getPermissionRequired());
        if (permissionEntryMissingDevicePermissionEntry != null) {
            return permissionEntryMissingDevicePermissionEntry;
        }
        List<String> permissionRequired = dataSource.getPermissionRequired();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = permissionRequired.iterator();
        while (it.hasNext()) {
            PermissionEntry permissionEntryPermissionEntryForTag = HatchPermissionCatalogKt.permissionEntryForTag(AnonymousClass005.A0j(it));
            if (permissionEntryPermissionEntryForTag != null) {
                arrayListA0h.add(permissionEntryPermissionEntryForTag);
            }
        }
        Iterator it2 = arrayListA0h.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!AnonymousClass003.A1X(this.context, ((PermissionEntry) next).isGranted)) {
                break;
            }
        }
        return (PermissionEntry) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x023d: INVOKE (r1v1 ?? I:com.facebook.aura.perf.HatchNodeQplLogger), (r5 I:int), (r0 I:java.lang.String), (r2 I:java.lang.Throwable) VIRTUAL call: com.facebook.aura.perf.HatchNodeQplLogger.registrationFailure(int, java.lang.String, java.lang.Throwable):void A[MD:(int, java.lang.String, java.lang.Throwable):void (m)] (LINE:573), block:B:87:0x0239 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0244: INVOKE (r0v3 ?? I:com.facebook.aura.perf.HatchNodeQplLogger), (r5 I:int) VIRTUAL call: com.facebook.aura.perf.HatchNodeQplLogger.registrationCancelled(int):void A[MD:(int):void (m)] (LINE:580), block:B:90:0x0242 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c0 A[Catch: all -> 0x0238, CancellationException -> 0x0241, TryCatch #2 {CancellationException -> 0x0241, all -> 0x0238, blocks: (B:67:0x01e5, B:68:0x01e8, B:70:0x01ec, B:72:0x01f0, B:54:0x0174, B:58:0x0192, B:77:0x01f9, B:61:0x01c0, B:79:0x0215, B:64:0x01c9, B:82:0x0224, B:57:0x018f, B:17:0x006a, B:20:0x007c, B:21:0x0084, B:23:0x008a, B:24:0x00a0, B:27:0x00ab, B:29:0x00af, B:31:0x00b5, B:32:0x00bb, B:34:0x00bf, B:36:0x00c8, B:38:0x0117, B:40:0x011b, B:41:0x011f, B:43:0x0125, B:45:0x0129, B:46:0x012d, B:48:0x0133, B:53:0x013e, B:52:0x013c, B:84:0x022f), top: B:92:0x0020 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01e2 -> B:68:0x01e8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object register(X.HtJ<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.register(X.HtJ):java.lang.Object");
    }

    private final void rememberInvokeReceivedAt(String str, long j) {
        Collection<Long> collectionValues = this.invokeReceivedAt.values();
        C7384Etj.A0U(collectionValues);
        AbstractC0882AGj.A0t(collectionValues, new C127561(j));
        this.invokeReceivedAt.put(str, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object respondPermissionDenied(java.lang.String r14, java.lang.String r15, com.facebook.aura.nodes.snapshot.PermissionEntry r16, com.facebook.aura.nodes.core.NodeResultSender r17, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r18) {
        /*
            r13 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.facebook.aura.nodes.HatchNodeClient.C127571
            if (r0 == 0) goto L75
            r6 = r3
            com.facebook.aura.nodes.HatchNodeClient$respondPermissionDenied$1 r6 = (com.facebook.aura.nodes.HatchNodeClient.C127571) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r6.label = r2
        L14:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L2a
            if (r0 != r7) goto L7b
            java.lang.Object r0 = r6.L$4
            java.lang.String r8 = X.C3cG.A0d(r0, r1)
        L25:
            com.facebook.aura.nodes.core.NodeCommandResponse r5 = X.C60R.A0P(r8)
            return r5
        L2a:
            X.Hwg.A00(r1)
            r2 = r16
            com.facebook.aura.navigation.key.DevicePermissionRowId r0 = r2.rowId
            java.lang.String r11 = r0.getWireValue()
            java.lang.String r13 = X.C6tn.A02(r14)
            java.lang.String r8 = "permission denied: command="
            java.lang.String r10 = " row="
            java.lang.String r12 = " requestId="
            r9 = r15
            java.lang.String r1 = X.FGI.A0j(r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "HatchNodeClient"
            X.CFK.A05(r0, r1)
            java.lang.String r0 = r2.userLabel
            java.lang.String r8 = com.facebook.aura.nodes.core.NodeErrorsKt.permissionDeniedMessage(r0)
            java.lang.String r4 = X.C60O.A0l()
            r3 = 0
            java.lang.String r2 = "permission_denied"
            java.lang.String r1 = "The device permission was not granted, so the command did not run."
            X.9jH r0 = X.AGH.A0E()
            kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.nodes.core.NodeErrorsKt.nodeError(r2, r8, r0, r1)
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r3
            r6.L$3 = r3
            r6.L$4 = r8
            r6.label = r7
            r1 = r17
            java.lang.Object r0 = r1.sendInvokeResult(r4, r14, r0, r6)
            if (r0 != r5) goto L25
            return r5
        L75:
            com.facebook.aura.nodes.HatchNodeClient$respondPermissionDenied$1 r6 = new com.facebook.aura.nodes.HatchNodeClient$respondPermissionDenied$1
            r6.<init>(r3)
            goto L14
        L7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.respondPermissionDenied(java.lang.String, java.lang.String, com.facebook.aura.nodes.snapshot.PermissionEntry, com.facebook.aura.nodes.core.NodeResultSender, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendInvokeResultEnvelope(String str, boolean z, JsonObject jsonObject, String str2, String str3, HtJ<? super Boolean> htJ) {
        ClientInvokeErrorJson clientInvokeErrorJson;
        HatchClientCapabilitiesProtocol hatchClientCapabilitiesProtocol = this.protocol;
        if (hatchClientCapabilitiesProtocol == null) {
            return AnonymousClass001.A0h();
        }
        if (z || str2 == null) {
            clientInvokeErrorJson = null;
        } else {
            if (str3 == null) {
                str3 = str2;
            }
            clientInvokeErrorJson = new ClientInvokeErrorJson(str2, str3);
        }
        return hatchClientCapabilitiesProtocol.sendInvokeResult(new ClientInvokeResultParamsJson(C60O.A0l(), str, z, jsonObject != null ? jsonObject.toString() : null, null, clientInvokeErrorJson, null, null), htJ);
    }

    public static /* synthetic */ Object sendInvokeResultEnvelope$default(HatchNodeClient hatchNodeClient, String str, boolean z, JsonObject jsonObject, String str2, String str3, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            jsonObject = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return hatchNodeClient.sendInvokeResultEnvelope(str, z, jsonObject, str2, str3, htJ);
    }

    private final void startProactiveSync() {
        ProactiveSyncDispatcher proactiveSyncDispatcher = this.proactiveSyncDispatcher;
        if (proactiveSyncDispatcher != null) {
            proactiveSyncDispatcher.enqueueAll(this.context);
        }
    }

    public static /* synthetic */ Object unpairNode$default(HatchNodeClient hatchNodeClient, String str, NodePairingStatus nodePairingStatus, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            nodePairingStatus = NodePairingStatus.REVOKED;
        }
        return hatchNodeClient.unpairNode(str, nodePairingStatus, htJ);
    }

    public final void attach(HatchNodeTransport hatchNodeTransport, HatchNodeHttpClient hatchNodeHttpClient, NodeHitlGate nodeHitlGate, NodePinReminderPresenter nodePinReminderPresenter, Function0<Boolean> function0) {
        AnonymousClass005.A0x(hatchNodeTransport, hatchNodeHttpClient, nodeHitlGate);
        C7384Etj.A0Y(function0, 4);
        boolean zA1Y = AnonymousClass002.A1Y(this.transport);
        this.transport = hatchNodeTransport;
        this.httpClient = hatchNodeHttpClient;
        this.hitlGate = nodeHitlGate;
        this.pinReminderDispatcher.presenter = nodePinReminderPresenter;
        if (zA1Y) {
            this.protocol = new HatchClientCapabilitiesProtocol(hatchNodeTransport);
            this.snapshot = new HatchCapabilitiesSnapshot(this.context, this.userSession, this.registry, this.dataSourceRegistry, this.uiCommandRegistry, function0, null, DefaultHatchCommandDescriptionResolver.INSTANCE, new HatchNodeClient$attach$snap$1(this));
            this.registry.seedEnvironmentBaseline();
            hatchNodeTransport.setOnClientInvokeRequest(new AnonymousClass2());
            C3UX c3ux = this.scope;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(hatchNodeTransport, this, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, anonymousClass3, c3ux);
            startProactiveSync();
            HatchProactiveTriggerManager hatchProactiveTriggerManager = new HatchProactiveTriggerManager(this.context, this.scope, this.dataSourcePublishSink, new HatchNodeClient$attach$manager$1(this), this.userSession, nodeHitlGate, this.proactiveConnectionGate);
            hatchProactiveTriggerManager.start(this.dataSourceRegistry.getEnabledSources(), new AnonymousClass4(this.dataSourceRegistry));
            this.triggerManager = hatchProactiveTriggerManager;
            GAo.A02(num, c6ys, new AnonymousClass5(null), this.scope);
            GAo.A02(num, c6ys, new AnonymousClass6(null), this.scope);
        }
    }

    public final ClientRegisterCapabilitiesParamsJson buildCapabilitiesSnapshot() {
        HatchCapabilitiesSnapshot hatchCapabilitiesSnapshot = this.snapshot;
        if (hatchCapabilitiesSnapshot != null) {
            return hatchCapabilitiesSnapshot.build(HatchDefaultAssistantStatus.INSTANCE.isDefaultAssistant(hatchCapabilitiesSnapshot.context));
        }
        return null;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.fallbackInvokeParams.clear();
        this.serviceDispatches.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object disconnect(X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.nodes.HatchNodeClient.C127421
            if (r0 == 0) goto L21
            r8 = r10
            com.facebook.aura.nodes.HatchNodeClient$disconnect$1 r8 = (com.facebook.aura.nodes.HatchNodeClient.C127421) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            java.lang.String r5 = "HatchNodeClient"
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 != r4) goto L27
            goto L55
        L21:
            com.facebook.aura.nodes.HatchNodeClient$disconnect$1 r8 = new com.facebook.aura.nodes.HatchNodeClient$disconnect$1
            r8.<init>(r10)
            goto L12
        L27:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            X.Hwg.A00(r1)
            X.2nw r2 = X.C60O.A1K()
            java.lang.String r1 = "node_id"
            java.lang.String r0 = X.C60O.A0l()
            kotlinx.serialization.json.JsonObject r0 = X.C7qW.A01(r1, r0, r2)
            com.facebook.aura.nodes.transport.HatchNodeHttpClient r3 = r9.httpClient
            if (r3 == 0) goto L76
            java.lang.String r2 = "api/nodes/disconnect"
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> L6c
            r0 = 0
            r8.L$0 = r0     // Catch: java.lang.Exception -> L6c
            r8.L$1 = r0     // Catch: java.lang.Exception -> L6c
            r8.label = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r1 = r3.sendHttpPost(r2, r1, r8)     // Catch: java.lang.Exception -> L6c
            if (r1 != r7) goto L58
            return r7
        L55:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L6c
        L58:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6c
            if (r1 != 0) goto L5d
            r4 = 0
        L5d:
            if (r4 == 0) goto L65
            java.lang.String r0 = "node.disconnect: success"
            X.CFK.A05(r5, r0)     // Catch: java.lang.Exception -> L6c
            goto L6a
        L65:
            java.lang.String r0 = "node.disconnect: HTTP failed"
            X.CFK.A06(r5, r0)     // Catch: java.lang.Exception -> L6c
        L6a:
            r6 = r4
            goto L76
        L6c:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "node.disconnect: error: "
            X.C3cH.A1B(r0, r1, r5, r2)
        L76:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.disconnect(X.HtJ):java.lang.Object");
    }

    public final Map<NodeCommandId, NodeCommandSpec> getAllCommandSpecs() {
        return this.registry.getAllCommandSpecs();
    }

    public final Context getContext$fbandroid_express_aura_java_com_facebook_aura_nodes_nodes() {
        return this.context;
    }

    public final DataSourcePublishSink getDataSourcePublishSink() {
        return this.dataSourcePublishSink;
    }

    public final HatchDataSourceRegistry getDataSourceRegistry() {
        return this.dataSourceRegistry;
    }

    public final ProactiveConnectionGate getProactiveConnectionGate() {
        return this.proactiveConnectionGate;
    }

    public final ProactiveSyncDispatcher getProactiveSyncDispatcher() {
        return this.proactiveSyncDispatcher;
    }

    public final C1BN<Long> getRegistrationEpoch() {
        return this.registrationEpoch;
    }

    public final NodeRegistrationInfo getRegistrationInfo() {
        String str = "unknown";
        try {
            String str2 = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
            if (str2 != null) {
                str = str2;
            }
        } catch (Exception unused) {
        }
        String strA0l = C60O.A0l();
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        String strA0U = FGI.A0U(str3, InviteCodeScratcherKt.CODE_SEPARATOR, str4);
        C7384Etj.A0V(str4);
        return new NodeRegistrationInfo(strA0l, strA0U, "android", str, str4, str4, this.registry.getEnabledCommandSpecs(), true, null);
    }

    public final HatchNodeCommandRegistry getRegistry() {
        return this.registry;
    }

    public final UiCommandRegistry getUiCommandRegistry() {
        return this.uiCommandRegistry;
    }

    public final boolean isRegistered() {
        return AnonymousClass002.A1X(this.registrationEpoch.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object listNodes(X.HtJ<? super java.util.List<com.facebook.aura.nodes.json.NodeListEntry>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.nodes.HatchNodeClient.C127541
            if (r0 == 0) goto L42
            r5 = r7
            com.facebook.aura.nodes.HatchNodeClient$listNodes$1 r5 = (com.facebook.aura.nodes.HatchNodeClient.C127541) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L48
            X.Hwg.A00(r1)
        L21:
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L4d
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            if (r1 == 0) goto L4d
            java.util.List r4 = com.facebook.aura.nodes.json.NodeListEntryJsonKt.parseNodeListEntries(r1)
            return r4
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.nodes.transport.HatchNodeTransport r1 = r6.transport
            if (r1 == 0) goto L4d
            com.facebook.aura.network.api.RpcMethod$NodeList r0 = com.facebook.aura.network.api.RpcMethod.NodeList.INSTANCE
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r1 = r1.sendRequestAndWait(r0, r3, r5)
            if (r1 != r4) goto L21
            return r4
        L42:
            com.facebook.aura.nodes.HatchNodeClient$listNodes$1 r5 = new com.facebook.aura.nodes.HatchNodeClient$listNodes$1
            r5.<init>(r7)
            goto L12
        L48:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L4d:
            X.AGi r4 = X.C0881AGi.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.listNodes(X.HtJ):java.lang.Object");
    }

    public final Object runProactiveSync(DataSource dataSource, HtJ<? super DataSourceResult> htJ) {
        return ProactiveSyncRunner.INSTANCE.run(dataSource, C60O.A0l(), this.userSession, this.dataSourcePublishSink, this.hitlGate, this.proactiveConnectionGate, htJ);
    }

    public final Object sendDataSourcePublish(ClientDataSourcePublishParamsJson clientDataSourcePublishParamsJson, HtJ<? super Boolean> htJ) {
        HatchClientCapabilitiesProtocol hatchClientCapabilitiesProtocol = this.protocol;
        if (hatchClientCapabilitiesProtocol != null) {
            return hatchClientCapabilitiesProtocol.sendDataSourcePublish(clientDataSourcePublishParamsJson, htJ);
        }
        CFK.A06(HatchNodeClientKt.TAG, FGI.A0M(RpcMethod.ClientDataSourcePublish.INSTANCE.getValue(), ": gateway not attached, dropping frame"));
        return AnonymousClass001.A0h();
    }

    public final Object sendInvokeResult(String str, JsonObject jsonObject, HtJ<? super Boolean> htJ) {
        return this.resultSender.sendInvokeResult(C60O.A0l(), str, jsonObject, htJ);
    }

    public final void setProactiveSyncDispatcher(ProactiveSyncDispatcher proactiveSyncDispatcher) {
        this.proactiveSyncDispatcher = proactiveSyncDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unpair(X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.nodes.HatchNodeClient.C127581
            if (r0 == 0) goto L6c
            r6 = r8
            com.facebook.aura.nodes.HatchNodeClient$unpair$1 r6 = (com.facebook.aura.nodes.HatchNodeClient.C127581) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L3a
            if (r0 != r4) goto L72
            X.Hwg.A00(r1)
        L20:
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L38
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
        L26:
            boolean r2 = r7.isOkResponse(r1)
        L2a:
            com.facebook.aura.nodes.HatchNodeClient$ProactiveSyncDispatcher r1 = r7.proactiveSyncDispatcher
            if (r1 == 0) goto L33
            android.content.Context r0 = r7.context
            r1.cancelAll(r0)
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L38:
            r1 = 0
            goto L26
        L3a:
            X.Hwg.A00(r1)
            com.facebook.aura.nodes.transport.HatchNodeTransport r3 = r7.transport
            if (r3 == 0) goto L6a
            X.2nw r2 = X.C60O.A1K()
            java.lang.String r1 = "node_id"
            java.lang.String r0 = X.C60O.A0l()
            X.C7qW.A06(r1, r0, r2)
            com.facebook.aura.nodes.json.NodePairingStatus r0 = com.facebook.aura.nodes.json.NodePairingStatus.REVOKED
            java.lang.String r1 = r0.getWireValue()
            java.lang.String r0 = "pairing_status"
            kotlinx.serialization.json.JsonObject r2 = X.C7qW.A01(r0, r1, r2)
            com.facebook.aura.network.api.RpcMethod$NodeUnpair r1 = com.facebook.aura.network.api.RpcMethod.NodeUnpair.INSTANCE
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r4
            java.lang.Object r1 = r3.sendRequestAndWait(r1, r2, r6)
            if (r1 != r5) goto L20
            return r5
        L6a:
            r2 = 0
            goto L2a
        L6c:
            com.facebook.aura.nodes.HatchNodeClient$unpair$1 r6 = new com.facebook.aura.nodes.HatchNodeClient$unpair$1
            r6.<init>(r8)
            goto L12
        L72:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.unpair(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unpairNode(java.lang.String r9, com.facebook.aura.nodes.json.NodePairingStatus r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.nodes.HatchNodeClient.C127591
            if (r0 == 0) goto L6c
            r7 = r11
            com.facebook.aura.nodes.HatchNodeClient$unpairNode$1 r7 = (com.facebook.aura.nodes.HatchNodeClient.C127591) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L72
            X.Hwg.A00(r1)
        L21:
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L28
            r5 = r1
            kotlinx.serialization.json.JsonObject r5 = (kotlinx.serialization.json.JsonObject) r5
        L28:
            boolean r0 = r8.isOkResponse(r5)
        L2c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L31:
            X.Hwg.A00(r1)
            java.lang.String r1 = X.AnonymousClass002.A0l(r9)
            int r0 = r1.length()
            if (r0 <= 0) goto L6a
            com.facebook.aura.nodes.transport.HatchNodeTransport r3 = r8.transport
            if (r3 == 0) goto L6a
            X.2nw r2 = X.C60O.A1K()
            java.lang.String r0 = "node_id"
            X.C7qW.A06(r0, r1, r2)
            java.lang.String r1 = "pairing_status"
            java.lang.String r0 = r10.getWireValue()
            kotlinx.serialization.json.JsonObject r1 = X.C7qW.A01(r1, r0, r2)
            com.facebook.aura.network.api.RpcMethod$NodeUnpair r0 = com.facebook.aura.network.api.RpcMethod.NodeUnpair.INSTANCE
            r7.L$0 = r5
            r7.L$1 = r5
            r7.L$2 = r5
            r7.L$3 = r5
            r7.L$4 = r5
            r7.label = r4
            java.lang.Object r1 = r3.sendRequestAndWait(r0, r1, r7)
            if (r1 != r6) goto L21
            return r6
        L6a:
            r0 = 0
            goto L2c
        L6c:
            com.facebook.aura.nodes.HatchNodeClient$unpairNode$1 r7 = new com.facebook.aura.nodes.HatchNodeClient$unpairNode$1
            r7.<init>(r11)
            goto L12
        L72:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.unpairNode(java.lang.String, com.facebook.aura.nodes.json.NodePairingStatus, X.HtJ):java.lang.Object");
    }

    private final String getClientId() {
        return C60O.A0l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f A[PHI: r0
  0x012f: PHI (r0v43 java.lang.String) = (r0v11 java.lang.String), (r0v44 java.lang.String) binds: [B:48:0x008d, B:40:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c A[PHI: r9
  0x013c: PHI (r9v4 kotlinx.serialization.json.JsonObject) = (r9v2 kotlinx.serialization.json.JsonObject), (r9v13 kotlinx.serialization.json.JsonObject) binds: [B:95:0x013b, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleInvokeRequest(kotlinx.serialization.json.JsonObject r15) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.handleInvokeRequest(kotlinx.serialization.json.JsonObject):void");
    }

    private final String resolveCommandParams(JsonObject jsonObject) {
        JsonObject jsonObjectResolveCommandParamsObject = resolveCommandParamsObject(jsonObject);
        if (jsonObjectResolveCommandParamsObject != null) {
            return jsonObjectResolveCommandParamsObject.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject resolveCommandParamsObject(JsonObject jsonObject) {
        JsonObject jsonObjectDecodeCommandParams = decodeCommandParams(jsonObject);
        JsonObject jsonObject2 = null;
        if (jsonObjectDecodeCommandParams != null) {
            Object obj = jsonObjectDecodeCommandParams.get(AuraBloksDataProps.PARAMS);
            if (!(obj instanceof JsonObject) || (jsonObject2 = (JsonObject) obj) == null) {
                return jsonObjectDecodeCommandParams;
            }
        }
        return jsonObject2;
    }

    public final String getNodeIdentifier() {
        return C60O.A0l();
    }

    public final void reregister() {
        launchRegister();
        startProactiveSync();
    }

    public final void resnapshot() {
        launchRegister();
    }

    private final long registerBackoffMs(int i) {
        return Math.min((long) (5000.0d * Math.pow(3.0d, i - 1)), 60000L);
    }

    public /* synthetic */ HatchNodeClient(AbstractC3358CGz abstractC3358CGz, Context context, C06H c06h) {
        this(abstractC3358CGz, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03fc A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, LOOP:0: B:105:0x03f6->B:107:0x03fc, LOOP_END, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x044a A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0587 A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0591 A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05ae A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05cb A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x068a A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0826 A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0894 A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8 A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021e A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024e A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0349 A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d8 A[Catch: Exception -> 0x08a5, all -> 0x092e, CancellationException -> 0x0936, TryCatch #4 {CancellationException -> 0x0936, Exception -> 0x08a5, all -> 0x092e, blocks: (B:21:0x0066, B:23:0x0070, B:46:0x0163, B:26:0x009f, B:28:0x00a5, B:49:0x018b, B:32:0x00e3, B:40:0x010b, B:41:0x010f, B:52:0x01c4, B:54:0x01c8, B:59:0x021a, B:61:0x021e, B:83:0x02fa, B:64:0x024e, B:70:0x0264, B:71:0x0266, B:75:0x026f, B:78:0x0293, B:86:0x033f, B:88:0x0349, B:100:0x03e1, B:101:0x03e6, B:103:0x03ec, B:104:0x03ee, B:105:0x03f6, B:107:0x03fc, B:111:0x0440, B:113:0x044a, B:118:0x045e, B:120:0x0464, B:123:0x046c, B:124:0x0470, B:126:0x0476, B:128:0x0485, B:131:0x0495, B:134:0x04e9, B:141:0x057a, B:143:0x0580, B:153:0x05a4, B:155:0x05ae, B:161:0x05c0, B:166:0x05cb, B:169:0x05d7, B:174:0x067e, B:176:0x068a, B:178:0x068e, B:199:0x0760, B:202:0x077c, B:208:0x07d2, B:179:0x0695, B:180:0x0699, B:188:0x06ad, B:189:0x06c2, B:192:0x06fb, B:196:0x070d, B:212:0x0822, B:214:0x0826, B:216:0x082b, B:217:0x0830, B:222:0x088e, B:224:0x0894, B:226:0x0898, B:228:0x089f, B:146:0x0587, B:147:0x058b, B:149:0x0591, B:108:0x040f, B:97:0x03d4, B:99:0x03d8, B:39:0x00fe, B:33:0x00e8, B:35:0x00f2, B:36:0x00f7, B:45:0x0160, B:48:0x0188, B:51:0x01c1, B:58:0x0217, B:82:0x02f6, B:85:0x033c, B:94:0x0396, B:96:0x03d1, B:140:0x0577, B:173:0x067b, B:207:0x07cf, B:211:0x081f, B:221:0x088b), top: B:274:0x002a, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeCommand(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.Long r31, com.facebook.aura.nodes.core.NodeResultSender r32, java.lang.Long r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, X.HtJ<? super com.facebook.aura.nodes.core.NodeCommandResponse> r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.HatchNodeClient.executeCommand(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, com.facebook.aura.nodes.core.NodeResultSender, java.lang.Long, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    public HatchNodeClient(AbstractC3358CGz abstractC3358CGz, Context context) {
        this.userSession = abstractC3358CGz;
        this.context = context;
        HzC hzCA01 = C78T.A01(AnonymousClass001.A0y(), null);
        this.scope = hzCA01;
        this.permissionGate = new NodePermissionGate(context);
        this.permissionPrompt = new NodePermissionPrompt(context, abstractC3358CGz);
        this.declaredPermissions$delegate = AbstractC5321DgF.A03(new HatchNodeClient$declaredPermissions$2(this));
        this.optionalPermissionDeclines = new NodeOptionalPermissionDeclines(context);
        this.invokeReceivedAt = C60O.A1C();
        this.fallbackInvokeParams = C60O.A1C();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.serviceDispatches = keySetViewNewKeySet;
        this.invocationDispatcher = new HatchNodeInvocationDispatcher(context, abstractC3358CGz, hzCA01, new HatchNodeClient$invocationDispatcher$1(this, null));
        this.pinReminderDispatcher = new NodePinReminderDispatcher(new HatchNodeClient$pinReminderDispatcher$1(this));
        this.registry = HatchNodeCommandRegistry.Companion.getInstance(abstractC3358CGz, context);
        this.dataSourceRegistry = HatchDataSourceRegistry.Companion.getInstance(abstractC3358CGz);
        this.uiCommandRegistry = UiCommandRegistry.Companion.getInstance(abstractC3358CGz);
        this.hitlGate = NodeHitlGate.AllowAll.INSTANCE;
        this.dataSourcePublishSink = new DataSourcePublishSink() { // from class: com.facebook.aura.nodes.HatchNodeClient$dataSourcePublishSink$1
            @Override // com.facebook.aura.nodes.datasource.DataSourcePublishSink
            public final Object publish(ClientDataSourcePublishParamsJson clientDataSourcePublishParamsJson, HtJ<? super Boolean> htJ) {
                return this.this$0.sendDataSourcePublish(clientDataSourcePublishParamsJson, htJ);
            }
        };
        this.proactiveConnectionGate = new HatchNodeClient$proactiveConnectionGate$1(this);
        this.registrationCount = new AtomicLong();
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._registrationEpoch = c9286GCnA13;
        this.registrationEpoch = C3cG.A11(c9286GCnA13);
        this.resultSender = new HatchNodeClient$resultSender$1(this);
        this.uiControlDispatcher = UiControlDispatcher.Companion.create(abstractC3358CGz, new HatchNodeClient$uiControlDispatcher$1(this, null), new HatchNodeClient$uiControlDispatcher$2(this), new HatchNodeClient$uiControlDispatcher$3(this), new HatchNodeClient$uiControlDispatcher$4(this), new HatchNodeClient$uiControlDispatcher$5(this), new HatchNodeClient$uiControlDispatcher$6(this), new HatchNodeClient$uiControlDispatcher$7(this));
    }
}
