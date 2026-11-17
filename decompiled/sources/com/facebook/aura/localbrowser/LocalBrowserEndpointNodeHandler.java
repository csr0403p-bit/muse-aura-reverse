package com.facebook.aura.localbrowser;

import X.AGH;
import X.AIW;
import X.AbstractC0885AGm;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFI;
import X.C06H;
import X.C0924AIa;
import X.C2nw;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C7qW;
import X.C9oY;
import X.FGI;
import X.GAo;
import X.HtJ;
import X.HzP;
import android.os.SystemClock;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import com.facebook.aura.nodes.api.HatchNodeInvocationHandler;
import com.facebook.aura.nodes.api.HatchNodeInvocationResult;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.pairs.ConnectionsResourceKt;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.hatch.browser.core.CommandReport;
import com.hatch.browser.core.Hatch_browser_core_uniffiKt;
import com.hatch.browser.protocol.ApiException;
import com.hatch.browser.protocol.Budget;
import com.hatch.browser.protocol.EffectDisposition;
import com.hatch.browser.protocol.PageReference;
import com.hatch.browser.protocol.ReleaseReason;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class LocalBrowserEndpointNodeHandler implements HatchNodeInvocationHandler {
    public static final int $stable = 8;
    public static final String NATIVE_PICKER_MESSAGE = "A native picker was blocked. The browser is still under agent control. Observe the page; the picker field is focused when possible. Use Select for dropdowns or Fill for date/time fields without clicking them. Fill uses canonical values: YYYY-MM-DD, HH:MM, YYYY-MM, YYYY-Www, or YYYY-MM-DDTHH:MM. Use replace mode with no explicit typing/paste method and submit separately. Verify the retained value. Do not repeat the picker-opening action. If the field is inaccessible or rejects filling, explain the limitation and ask for user help.";
    public static final long RECOVERY_REPLY_WAIT_MS = 10000;
    public static final int REPLY_ALLOWANCE = 16384;
    public static final long REPLY_MARGIN_MS = 1500;
    public static final String USER_ACTION_MESSAGE = "This browser needs user input. Ask the user to unlock the phone, open this browser task and take over, complete the website control, then hand back to the agent. Do not retry the action automatically.";
    public final Set<String> commands;
    public final int maxArgumentBytes;
    public final int maxResultBytes;
    public final long maxTimeoutMs;
    public final boolean preservesArgumentEnvelope;
    public final boolean requiresAuthenticatedReply;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final Set<String> NAVIGATION_SIDEBAND_FIELDS = BFI.A0H(new String[]{"navigation_pending", "navigation_outcomes", "navigation_transition", "input_dispatched", "navigation_started"});

    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1, reason: invalid class name */
    public final class AnonymousClass1 extends HatchNodeInvocationResult.Deferred {
        public final /* synthetic */ byte[] $centralBlackholeBytes;
        public final /* synthetic */ String $commandName;
        public final /* synthetic */ long $deadline;
        public final /* synthetic */ Map<String, String> $hostState;
        public final /* synthetic */ String $id;
        public final /* synthetic */ HatchNodeInvocation $invocation;
        public final /* synthetic */ AtomicBoolean $logged;
        public final /* synthetic */ byte[] $navigationBytes;
        public final /* synthetic */ PageReference $prepared;
        public final /* synthetic */ int $reportMaxBytes;
        public final /* synthetic */ AtomicReference<CommandReport> $retained;
        public final /* synthetic */ LocalBrowserTask $task;
        public String dropEffect;
        public final /* synthetic */ LocalBrowserEndpointNodeHandler this$0;

        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$WhenMappings */
        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EffectDisposition.values().length];
                try {
                    AnonymousClass002.A13(EffectDisposition.NOT_STARTED, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(EffectDisposition.COMPLETED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(EffectDisposition.PARTIALLY_COMPLETED, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(EffectDisposition.UNKNOWN, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1(HatchNodeInvocation hatchNodeInvocation, LocalBrowserTask localBrowserTask, LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler, long j, String str, int i, Map<String, String> map, String str2, AtomicReference<CommandReport> atomicReference, byte[] bArr, byte[] bArr2, AtomicBoolean atomicBoolean, PageReference pageReference) {
            this.$invocation = hatchNodeInvocation;
            this.$task = localBrowserTask;
            this.this$0 = localBrowserEndpointNodeHandler;
            this.$deadline = j;
            this.$id = str;
            this.$reportMaxBytes = i;
            this.$hostState = map;
            this.$commandName = str2;
            this.$retained = atomicReference;
            this.$navigationBytes = bArr;
            this.$centralBlackholeBytes = bArr2;
            this.$logged = atomicBoolean;
            this.$prepared = pageReference;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String dropReason() {
            if (!AnonymousClass003.A1Y(this.$invocation.isConnectionCurrent)) {
                return "connection_changed";
            }
            if (this.$task.connection.generation != LocalBrowserRuntime.Companion.getInstance(this.this$0.userSession).endpoint.generation) {
                return "generation_changed";
            }
            if (SystemClock.elapsedRealtime() >= this.$deadline) {
                return "deadline_exceeded";
            }
            if (this.$task.isCurrent()) {
                return null;
            }
            return "task_unavailable";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object dropped(com.hatch.browser.core.CommandReport r9, java.lang.String r10, X.HtJ<? super kotlinx.serialization.json.JsonObject> r11) {
            /*
                r8 = this;
                boolean r0 = r11 instanceof com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$dropped$1
                if (r0 == 0) goto L80
                r6 = r11
                com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$dropped$1 r6 = (com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$dropped$1) r6
                int r2 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L80
                int r2 = r2 - r1
                r6.label = r2
            L12:
                java.lang.Object r1 = r6.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r2 = 0
                r7 = 1
                if (r0 == 0) goto L34
                if (r0 != r7) goto L9d
                java.lang.Object r5 = r6.L$3
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r4 = r6.L$2
                java.lang.Object r10 = r6.L$1
                X.Hwg.A00(r1)
            L29:
                com.facebook.aura.nodes.api.HatchNodeInvocation r0 = r8.$invocation
                kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r0.isConnectionCurrent
                boolean r0 = X.AnonymousClass003.A1Y(r0)
                if (r0 != 0) goto L86
                return r2
            L34:
                X.Hwg.A00(r1)
                java.lang.String r4 = r8.recordDrop(r9, r10)
                com.facebook.aura.localbrowser.LocalBrowserTask r0 = r8.$task
                boolean r0 = r0.leftToJarvis
                if (r0 == 0) goto L61
                java.lang.String r5 = "engine_unavailable"
            L43:
                com.facebook.aura.localbrowser.LocalBrowserTask r0 = r8.$task
                boolean r0 = r0.leftToJarvis
                if (r0 == 0) goto L29
                com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler r1 = r8.this$0
                com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$dropped$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$dropped$2
                r0.<init>(r1, r2)
                r6.L$0 = r2
                r6.L$1 = r10
                r6.L$2 = r4
                r6.L$3 = r5
                r6.label = r7
                java.lang.Object r0 = X.C3cI.A0S(r0, r6)
                if (r0 != r3) goto L29
                return r3
            L61:
                java.lang.String r0 = "task_unavailable"
                boolean r0 = r0.equals(r10)
                if (r0 == 0) goto L6c
                java.lang.String r5 = "stale_task"
                goto L43
            L6c:
                java.lang.String r0 = "generation_changed"
                boolean r0 = r0.equals(r10)
                if (r0 == 0) goto L77
                java.lang.String r5 = "stale_connection"
                goto L43
            L77:
                java.lang.String r5 = "deadline_exceeded"
                boolean r0 = r5.equals(r10)
                if (r0 != 0) goto L43
                return r2
            L80:
                com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$dropped$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$deferred$1$dropped$1
                r6.<init>(r8, r11)
                goto L12
            L86:
                com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler r3 = r8.this$0
                java.lang.String r2 = r8.$id
                java.lang.String r0 = "notStarted"
                boolean r0 = r0.equals(r4)
                r1 = r0 ^ 1
                java.lang.String r0 = "drop_reason"
                java.util.Map r0 = X.AnonymousClass006.A10(r0, r10)
                kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler.access$error(r3, r2, r5, r1, r0)
                return r0
            L9d:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler.AnonymousClass1.dropped(com.hatch.browser.core.CommandReport, java.lang.String, X.HtJ):java.lang.Object");
        }

        private final String recordDrop(CommandReport commandReport, String str) {
            String str2;
            int i = this.$reportMaxBytes;
            Map<String, String> map = this.$hostState;
            String str3 = this.$id;
            LocalBrowserTask localBrowserTask = this.$task;
            String str4 = this.$commandName;
            synchronized (this) {
                str2 = this.dropEffect;
                if (str2 == null) {
                    try {
                        int iOrdinal = Hatch_browser_core_uniffiKt.decodeReport(commandReport.mo3227encodeNativeFactsQn1smSk("deadline_exceeded".equals(str) ? ReleaseReason.TIMED_OUT : "encoding_failed".equals(str) ? ReleaseReason.EXECUTION_FAILED : ReleaseReason.AUTHORITY_UNAVAILABLE, i)).effect.ordinal();
                        if (iOrdinal == 0) {
                            str2 = "notStarted";
                        } else if (iOrdinal == 1) {
                            str2 = "completed";
                        } else if (iOrdinal == 2) {
                            str2 = "partiallyCompleted";
                        } else {
                            if (iOrdinal != 3) {
                                throw C3cG.A0q();
                            }
                            str2 = "unknown";
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception unused) {
                        str2 = "unavailable";
                    }
                    this.dropEffect = str2;
                    LocalBrowserTelemetry.INSTANCE.event("local_browser_result_dropped", "error", AGH.A02(map, AGH.A0D(C3cG.A0r("operation_id", str3), C3cG.A0r(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, localBrowserTask.id), C3cG.A0r("sdk_command", str4), C3cG.A0r("sdk_effect", str2), C3cG.A0r(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str))), null);
                }
            }
            return str2;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            CommandReport andSet = this.$retained.getAndSet(null);
            if (andSet != null) {
                andSet.destroy();
            }
        }

        @Override // com.facebook.aura.nodes.api.HatchNodeInvocationResult.Deferred
        public Object encode(HtJ<? super JsonObject> htJ) {
            return GAo.A00(htJ, C3cG.A0v(), new LocalBrowserEndpointNodeHandler$deferred$1$encode$2(this.$retained, this, this.$navigationBytes, this.this$0, this.$centralBlackholeBytes, this.$reportMaxBytes, this.$deadline, this.$logged, this.$task, this.$hostState, this.$id, this.$commandName, this.$prepared, null));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler", f = "LocalBrowserEndpointNodeHandler.kt", l = {186, 225, 258, 266, 282, 307, 338, 345, 369, 370, 391, 412, 418}, m = "dispatch", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$dispatch$1, reason: invalid class name and case insensitive filesystem */
    public final class C124271 extends HzP {
        public int I$0;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
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

        public C124271(HtJ<? super C124271> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserEndpointNodeHandler.this.dispatch(null, null, null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler", f = "LocalBrowserEndpointNodeHandler.kt", l = {60, 90}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C124281 extends HzP {
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
        public long J$4;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C124281(HtJ<? super C124281> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserEndpointNodeHandler.this.execute(null, this);
        }
    }

    public LocalBrowserEndpointNodeHandler(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.commands = Collections.singleton(LocalBrowserEndpoint.COMMAND);
        this.maxArgumentBytes = 2097152;
        this.maxResultBytes = 8388608;
        this.maxTimeoutMs = 120000L;
        this.preservesArgumentEnvelope = true;
        this.requiresAuthenticatedReply = true;
    }

    public static /* synthetic */ Budget budget$default(LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler, long j, Budget budget, int i, Object obj) {
        if ((i & 2) != 0) {
            budget = null;
        }
        return localBrowserEndpointNodeHandler.budget(j, budget);
    }

    private final HatchNodeInvocationResult deferred(HatchNodeInvocation hatchNodeInvocation, String str, LocalBrowserTask localBrowserTask, CommandReport commandReport, long j, String str2, PageReference pageReference) throws ApiException.LimitExceeded {
        Map<String, String> mapA0E;
        LocalBrowserSession session = localBrowserTask.getSession();
        if (session == null || (mapA0E = session.diagnostics()) == null) {
            mapA0E = AGH.A0E();
        }
        byte[] bArrNavigationSideband = commandReport.navigationSideband();
        byte[] bArrCentralBlackholeSideband = commandReport.centralBlackholeSideband();
        int maxResultBytes = ((getMaxResultBytes() - 16384) - (bArrNavigationSideband != null ? bArrNavigationSideband.length : 0)) - (bArrCentralBlackholeSideband != null ? bArrCentralBlackholeSideband.length : 0);
        if (maxResultBytes > 0) {
            return new AnonymousClass1(hatchNodeInvocation, localBrowserTask, this, j, str, maxResultBytes, mapA0E, str2, new AtomicReference(commandReport), bArrNavigationSideband, bArrCentralBlackholeSideband, new AtomicBoolean(false), pageReference);
        }
        throw new ApiException.LimitExceeded();
    }

    public static /* synthetic */ HatchNodeInvocationResult deferred$default(LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler, HatchNodeInvocation hatchNodeInvocation, String str, LocalBrowserTask localBrowserTask, CommandReport commandReport, long j, String str2, PageReference pageReference, int i, Object obj) {
        if ((i & 64) != 0) {
            pageReference = null;
        }
        return localBrowserEndpointNodeHandler.deferred(hatchNodeInvocation, str, localBrowserTask, commandReport, j, str2, pageReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject error(String str, String str2, boolean z, Map<String, String> map) {
        C2nw c2nw = new C2nw();
        C7qW.A06("id", str, c2nw);
        C2nw c2nw2 = new C2nw();
        C7qW.A06(AuraDeeplinkRouteMapper.CODE_PARAM, str2, c2nw2);
        C7qW.A06(ReplyAttributionSerializer.TYPE_MESSAGE, "user_action_required".equals(str2) ? USER_ACTION_MESSAGE : "native_picker_blocked".equals(str2) ? NATIVE_PICKER_MESSAGE : FGI.A0M("Browser endpoint refused: ", str2), c2nw2);
        C7qW.A04(Boolean.valueOf(z), "ambiguous_mutation", c2nw2);
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(map.size()));
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                linkedHashMap.put(entryA0l.getKey(), C9oY.A07((String) entryA0l.getValue()));
            }
            c2nw2.A01("details", new JsonObject(linkedHashMap));
        }
        c2nw.A01("error", c2nw2.A00());
        return c2nw.A00();
    }

    private final JsonObject listing(LocalBrowserTask localBrowserTask, List<JsonObject> list) {
        C2nw c2nw = new C2nw();
        C7qW.A06("browser_instance_id", localBrowserTask.endpoint.runtimeId, c2nw);
        C7qW.A05(Long.valueOf(localBrowserTask.connection.generation), "websocket_generation", c2nw);
        C3cJ.A0h(localBrowserTask, c2nw);
        c2nw.A01("targets", new JsonArray(list));
        return c2nw.A00();
    }

    private final JsonObject nativeTarget(LocalBrowserTask localBrowserTask, String str) {
        C2nw c2nw = new C2nw();
        C7qW.A06("kind", "cdpTarget", c2nw);
        C7qW.A06("browserInstanceId", localBrowserTask.endpoint.runtimeId, c2nw);
        C7qW.A06("targetId", str, c2nw);
        return c2nw.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject owner(LocalBrowserTask localBrowserTask, LocalBrowserTaskAuthority localBrowserTaskAuthority, LocalBrowserSession localBrowserSession, String str, boolean z) {
        LocalBrowserConnection localBrowserConnection;
        C2nw c2nw = new C2nw();
        C7qW.A06("browserInstanceId", localBrowserTask.endpoint.runtimeId, c2nw);
        C7qW.A05(Long.valueOf(localBrowserTask.connection.generation), "generation", c2nw);
        C2nw c2nw2 = new C2nw();
        C7qW.A06("browserTaskId", localBrowserTask.id, c2nw2);
        C7qW.A06("bindingId", localBrowserTask.bindingId, c2nw2);
        c2nw.A01(AuraDeeplinkRouteMapper.TASK_ROUTE, c2nw2.A00());
        C7qW.A06("storageMode", "shared", c2nw);
        JsonNull jsonNull = JsonNull.A00;
        c2nw.A01("browserContextId", jsonNull);
        C7qW.A06(LocalBrowserNodeHandler.CONTROL, z ? "stopped" : localBrowserTaskAuthority.control == LocalBrowserControl.USER ? ConnectionsResourceKt.HUMAN_PARTICIPANT : "automation", c2nw);
        C7qW.A05(Long.valueOf(localBrowserTaskAuthority.revision), "controlRevision", c2nw);
        JsonObject jsonObject = null;
        JsonObject jsonObjectNativeTarget = str != null ? nativeTarget(localBrowserTask, str) : null;
        c2nw.A01("ownedTargets", new JsonArray(AbstractC0885AGm.A0z(jsonObjectNativeTarget)));
        if (jsonObjectNativeTarget != null && localBrowserSession != null && (localBrowserConnection = localBrowserSession.connection) != null && localBrowserConnection.isReady()) {
            jsonObject = jsonObjectNativeTarget;
        }
        c2nw.A01("readyTargets", new JsonArray(AbstractC0885AGm.A0z(jsonObject)));
        c2nw.A01("selectedTarget", jsonNull);
        return c2nw.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject parse(byte[] bArr) {
        JsonElement jsonElementA04 = HatchJsonKt.HatchJson.A04(AbstractC2159Azp.A10(bArr, bArr.length));
        C7384Etj.A0Z(jsonElementA04, "null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
        return (JsonObject) jsonElementA04;
    }

    private final HatchNodeInvocationResult refused(String str, String str2, boolean z, String str3, String str4, Map<String, String> map, Map<String, String> map2) {
        LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.putAll(map);
        c0924AIaA0u.putAll(map2);
        c0924AIaA0u.put("operation_id", str);
        c0924AIaA0u.put("outcome_scope", "command_attempt");
        c0924AIaA0u.put("failure_source", ErrorReportingConstants.ENDPOINT);
        c0924AIaA0u.put(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str2);
        if (str3 != null) {
            c0924AIaA0u.put(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, str3);
        }
        if (str4 != null) {
            c0924AIaA0u.put("failure_stage", str4);
        }
        if (z) {
            c0924AIaA0u.put("outcome_unknown", "true");
        }
        localBrowserTelemetry.event("local_browser_command_failure", "error", AIW.A0K(c0924AIaA0u), null);
        return new HatchNodeInvocationResult.Success(error(str, str2, z, map2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchNodeInvocationResult refused$default(LocalBrowserEndpointNodeHandler localBrowserEndpointNodeHandler, String str, String str2, boolean z, String str3, String str4, Map map, Map map2, int i, Object obj) {
        boolean zA1K = C3cG.A1K(i & 4, z);
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        Map mapA0o = C3cH.A0o(map, i & 32);
        if ((i & 64) != 0) {
            map2 = AGH.A0E();
        }
        return localBrowserEndpointNodeHandler.refused(str, str2, zA1K, str3, str4, mapA0o, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject success(String str, JsonElement jsonElement) {
        C2nw c2nw = new C2nw();
        C7qW.A06("id", str, c2nw);
        c2nw.A01("result", jsonElement);
        return c2nw.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(com.facebook.aura.nodes.api.HatchNodeInvocation r28, X.HtJ<? super com.facebook.aura.nodes.api.HatchNodeInvocationResult> r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler.execute(com.facebook.aura.nodes.api.HatchNodeInvocation, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public Set<String> getCommands() {
        return this.commands;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public int getMaxArgumentBytes() {
        return this.maxArgumentBytes;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public int getMaxResultBytes() {
        return this.maxResultBytes;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public long getMaxTimeoutMs() {
        return this.maxTimeoutMs;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public boolean getPreservesArgumentEnvelope() {
        return this.preservesArgumentEnvelope;
    }

    @Override // com.facebook.aura.nodes.api.HatchNodeInvocationHandler
    public boolean getRequiresAuthenticatedReply() {
        return this.requiresAuthenticatedReply;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Budget budget(long j, Budget budget) {
        long jA04 = C3cH.A04(j);
        if (jA04 < 0) {
            jA04 = 0;
        }
        return new Budget((int) Math.min(jA04, budget != null ? budget.remainingMs & 4294967295L : LinkEncryptedPairingKt.LINK_COUNTER_MAX), budget != null ? budget.expiresAtUnixMs : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0320 A[PHI: r10
  0x0320: PHI (r10v14 java.lang.String) = (r10v13 java.lang.String), (r10v18 java.lang.String) binds: [B:135:0x031c, B:92:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0325 A[PHI: r8 r10
  0x0325: PHI (r8v28 java.lang.String) = (r8v27 java.lang.String), (r8v30 java.lang.String) binds: [B:138:0x0321, B:95:0x028f] A[DONT_GENERATE, DONT_INLINE]
  0x0325: PHI (r10v15 java.lang.String) = (r10v14 java.lang.String), (r10v17 java.lang.String) binds: [B:138:0x0321, B:95:0x028f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0291  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v26, types: [com.facebook.aura.localbrowser.LocalBrowserSession] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v32, types: [com.facebook.aura.localbrowser.LocalBrowserSession] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dispatch(com.facebook.aura.nodes.api.HatchNodeInvocation r29, java.lang.String r30, kotlinx.serialization.json.JsonObject r31, long r32, X.HtJ<? super com.facebook.aura.nodes.api.HatchNodeInvocationResult> r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserEndpointNodeHandler.dispatch(com.facebook.aura.nodes.api.HatchNodeInvocation, java.lang.String, kotlinx.serialization.json.JsonObject, long, X.HtJ):java.lang.Object");
    }
}
