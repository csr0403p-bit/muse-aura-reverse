package com.facebook.aura.localbrowser;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C27k;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7qW;
import X.C8j2;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.avatarassets.AvatarMediaMapperKt;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.browsertask.presentation.BrowserTaskActions;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import com.facebook.aura.localbrowser.core.BrowserEngineControl;
import com.facebook.aura.localbrowser.core.BrowserEngineGroup;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.nodes.api.HatchNodeInvocation;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.pairs.ConnectionsResourceKt;
import com.hatch.browser.protocol.BindingId;
import com.hatch.browser.protocol.BrowserTaskBinding;
import com.hatch.browser.protocol.BrowserTaskId;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class LocalBrowserTask {
    public static final int $stable = 8;
    public static final long ABANDONED_AFTER_MS = 8100000;
    public static final Companion Companion = new Companion();
    public static final long DISCONNECT_GRACE_MS = 7200000;
    public static final long DISCONNECT_RECHECK_MS = 10000;
    public static final long NOTIFICATION_PREVIEW_INTERVAL_MS = 3000;
    public final AtomicReference<LocalBrowserTaskAuthority> authority;
    public final BackgroundWorkContentClaim backgroundWork;
    public final HoC backgroundWorkUpdates;
    public final String bindingId;
    public final Set<String> blockSignalSites;
    public final boolean centralBlackholeEnabled;
    public volatile boolean cleanupComplete;
    public volatile TaskConnection connection;
    public final HoC cpuHold;
    public Long disconnectedAtMs;
    public final LocalBrowserEndpoint endpoint;
    public final BrowserEngine engine;
    public boolean engineShutdown;
    public final BrowserEngineGroup group;
    public boolean groupRetired;
    public final HoC heldPopupRelease;
    public final String id;
    public volatile long lastContactMs;
    public final BLG<LocalBrowserSession> lastSessionState;
    public volatile boolean leftToJarvis;
    public final C3UX lifecycleScope;
    public final BLG<Bitmap> notificationPreview;
    public final HoC notificationPreviewCapture;
    public final LocalBrowserTaskRegistry registry;
    public final HoC retentionWatch;
    public volatile boolean retired;
    public C27k<Unit> retirement;
    public final LocalBrowserRuntime runtime;
    public final Function0<Unit> stopFromNotification;
    public final LocalBrowserTakeoverJournal takeoverJournal;
    public final LocalBrowserTask$takeoverSink$1 takeoverSink;
    public final AbstractC3358CGz userSession;
    public final LocalBrowserTaskControl viewer;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$interrupt$1", f = "LocalBrowserEndpoint.kt", l = {1002}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$interrupt$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserTask.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTask localBrowserTask = LocalBrowserTask.this;
                this.label = 1;
                if (localBrowserTask.retire(LocalBrowserTaskOutcome.STOPPED, this) == enumC10460Hji) {
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
            return LocalBrowserTask.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void acceptConnection(HatchNodeInvocation hatchNodeInvocation) {
        C7384Etj.A0Y(hatchNodeInvocation, 0);
        if (this.connection.generation != hatchNodeInvocation.connectionGeneration) {
            LocalBrowserSession session = getSession();
            if (session != null) {
                session.revokeAuthority();
            }
            if (this.retired) {
                return;
            }
            this.connection = new TaskConnection(hatchNodeInvocation.connectionGeneration, hatchNodeInvocation.isConnectionCurrent);
            this.disconnectedAtMs = null;
        }
    }

    public final void interrupt(LocalBrowserTaskOutcome localBrowserTaskOutcome) {
        C7384Etj.A0Y(localBrowserTaskOutcome, 0);
        this.registry.finish(this.id, this.bindingId, localBrowserTaskOutcome, !localBrowserTaskOutcome.getLeavesRunToJarvis());
        this.leftToJarvis = localBrowserTaskOutcome.getLeavesRunToJarvis();
        this.retired = true;
        discardTakeoverJournal();
        this.retentionWatch.A5w(null);
        this.cpuHold.A5w(null);
        this.heldPopupRelease.A5w(null);
        this.notificationPreviewCapture.A5w(null);
        this.backgroundWorkUpdates.A5w(null);
        this.backgroundWork.release();
        this.viewer.revokeInput();
        AnonymousClass001.A1J(new AnonymousClass1(null), this.lifecycleScope);
    }

    public final TakeoverJournalJson setControl(LocalBrowserControl localBrowserControl) throws LocalBrowserEndpointFailure {
        BrowserEngineControl browserEngineControl;
        LocalBrowserTarget localBrowserTarget;
        C7384Etj.A0Y(localBrowserControl, 0);
        LocalBrowserControl control = getControl();
        long controlEpoch = getControlEpoch() + 1;
        int iOrdinal = localBrowserControl.ordinal();
        if (iOrdinal == 0) {
            browserEngineControl = BrowserEngineControl.AUTOMATION;
        } else if (iOrdinal == 1) {
            browserEngineControl = BrowserEngineControl.HUMAN;
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            browserEngineControl = BrowserEngineControl.STOPPED;
        }
        boolean zUpdateControl = this.group.updateControl(controlEpoch, browserEngineControl);
        AtomicReference<LocalBrowserTaskAuthority> atomicReference = this.authority;
        if (!zUpdateControl) {
            atomicReference.set(new LocalBrowserTaskAuthority(controlEpoch, LocalBrowserControl.STOPPED));
            discardTakeoverJournal();
            interrupt(LocalBrowserTaskOutcome.BROWSER_LOST);
            C9jH c9jHA0E = AGH.A0E();
            throw new LocalBrowserEndpointFailure("control_unavailable", true, null, null, c9jHA0E, c9jHA0E);
        }
        atomicReference.set(new LocalBrowserTaskAuthority(controlEpoch, localBrowserControl));
        TakeoverJournalJson takeoverJournalJsonUpdateTakeoverJournal = updateTakeoverJournal(control, localBrowserControl);
        if (localBrowserControl != LocalBrowserControl.USER) {
            this.viewer.revokeInput();
            LocalBrowserSession session = getSession();
            if (session != null && (localBrowserTarget = session.target) != null) {
                localBrowserTarget.prepareAutomationViewport();
            }
        }
        LocalBrowserSession session2 = getSession();
        if (session2 != null) {
            session2.applyTaskControl(controlEpoch, localBrowserControl);
        }
        LocalBrowserTelemetry.INSTANCE.event("local_browser_control", "transition", AGH.A02(AnonymousClass007.A0d("result", AnonymousClass006.A0x(localBrowserControl), C3cG.A0r(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, this.id)), takeoverJournalJsonUpdateTakeoverJournal != null ? LocalBrowserTakeoverJournalKt.telemetry(takeoverJournalJsonUpdateTakeoverJournal) : AGH.A0E()), null);
        return takeoverJournalJsonUpdateTakeoverJournal;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalBrowserControl.values().length];
            try {
                AnonymousClass002.A13(LocalBrowserControl.AGENT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LocalBrowserControl.USER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LocalBrowserControl.STOPPED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final JsonObject bindingFields() {
        C2nw c2nw = new C2nw();
        Iterator<Map.Entry<String, JsonElement>> it = this.endpoint.identity().entrySet().iterator();
        while (it.hasNext()) {
            C3cJ.A0v(it, c2nw);
        }
        C3cJ.A0h(this, c2nw);
        C7qW.A06("storage_mode", "shared", c2nw);
        C7qW.A06("navigation_consent_mode", "enforced", c2nw);
        return c2nw.A00();
    }

    private final void discardTakeoverJournal() {
        LocalBrowserTarget localBrowserTarget;
        LocalBrowserTakeoverJournal localBrowserTakeoverJournal = this.takeoverJournal;
        if (AnonymousClass002.A1X(localBrowserTakeoverJournal.startedAtMs)) {
            localBrowserTakeoverJournal.discard();
            LocalBrowserSession session = getSession();
            if (session == null || (localBrowserTarget = session.target) == null) {
                return;
            }
            localBrowserTarget.broadcastTakeover(false);
        }
    }

    public static /* synthetic */ Object retire$default(LocalBrowserTask localBrowserTask, LocalBrowserTaskOutcome localBrowserTaskOutcome, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            localBrowserTaskOutcome = LocalBrowserTaskOutcome.STOPPED;
        }
        return localBrowserTask.retire(localBrowserTaskOutcome, htJ);
    }

    public static final Unit stopFromNotification$lambda$0(LocalBrowserTask localBrowserTask) {
        BrowserTaskPresentation browserTaskPresentationPresentation = BrowserTaskRepository.Companion.getInstance(localBrowserTask.userSession).presentation(C3cH.A0b(localBrowserTask));
        if (browserTaskPresentationPresentation != null) {
            BrowserTaskActions.Companion.getInstance(localBrowserTask.userSession).stopTask(browserTaskPresentationPresentation);
        }
        return Unit.INSTANCE;
    }

    private final TakeoverJournalJson updateTakeoverJournal(LocalBrowserControl localBrowserControl, LocalBrowserControl localBrowserControl2) {
        LocalBrowserTarget localBrowserTarget;
        LocalBrowserTarget localBrowserTarget2;
        LocalBrowserTarget localBrowserTarget3;
        LocalBrowserControl localBrowserControl3 = LocalBrowserControl.USER;
        if (localBrowserControl2 != localBrowserControl3) {
            if (localBrowserControl2 != LocalBrowserControl.AGENT || localBrowserControl != localBrowserControl3) {
                discardTakeoverJournal();
                return null;
            }
            LocalBrowserSession session = getSession();
            if (session != null && (localBrowserTarget = session.target) != null) {
                localBrowserTarget.broadcastTakeover(false);
            }
            return this.takeoverJournal.finish(System.currentTimeMillis());
        }
        if (localBrowserControl != localBrowserControl3) {
            this.takeoverJournal.begin(System.currentTimeMillis());
            LocalBrowserSession session2 = getSession();
            if (session2 == null || (localBrowserTarget3 = session2.target) == null || !localBrowserTarget3.activityBridge.isInstalled) {
                this.takeoverJournal.markIncomplete();
            }
            LocalBrowserSession session3 = getSession();
            if (session3 != null && (localBrowserTarget2 = session3.target) != null) {
                localBrowserTarget2.broadcastTakeover(true);
            }
        }
        return null;
    }

    public final JsonObject bindingJson(JsonObject jsonObject) {
        JsonElement jsonArray;
        JsonElement jsonArray2;
        JsonElement jsonArray3;
        C2nw c2nw = new C2nw();
        Iterator<Map.Entry<String, JsonElement>> it = bindingFields().entrySet().iterator();
        while (it.hasNext()) {
            C3cJ.A0v(it, c2nw);
        }
        C7qW.A06("state", this.retired ? "retired" : HatchOfflineConversationRepository.THREAD_STATUS_ACTIVE, c2nw);
        C7qW.A05(Long.valueOf(getControlEpoch()), C8j2.A00(5), c2nw);
        C7qW.A06("control_mode", getControl() == LocalBrowserControl.USER ? ConnectionsResourceKt.HUMAN_PARTICIPANT : "agent", c2nw);
        if (jsonObject == null || (jsonArray = (JsonElement) jsonObject.get("site_access")) == null) {
            jsonArray = new JsonArray(C0881AGi.A00);
        }
        c2nw.A01("site_access", jsonArray);
        if (jsonObject == null || (jsonArray2 = (JsonElement) jsonObject.get("pending_navigations")) == null) {
            jsonArray2 = new JsonArray(C0881AGi.A00);
        }
        c2nw.A01("pending_navigations", jsonArray2);
        if (jsonObject == null || (jsonArray3 = (JsonElement) jsonObject.get("navigation_outcomes")) == null) {
            jsonArray3 = new JsonArray(C0881AGi.A00);
        }
        c2nw.A01("navigation_outcomes", jsonArray3);
        return c2nw.A00();
    }

    public final LocalBrowserTaskAuthority getAuthoritySnapshot() {
        LocalBrowserTaskAuthority localBrowserTaskAuthority = this.authority.get();
        C7384Etj.A0U(localBrowserTaskAuthority);
        return localBrowserTaskAuthority;
    }

    public final BrowserTaskBinding getBinding() {
        return new BrowserTaskBinding(new BrowserTaskId(this.id), new BindingId(this.bindingId));
    }

    public final String getBindingId() {
        return this.bindingId;
    }

    public final Set<String> getBlockSignalSites() {
        return this.blockSignalSites;
    }

    public final boolean getCleanupComplete() {
        return this.cleanupComplete;
    }

    public final LocalBrowserControl getControl() {
        return this.authority.get().control;
    }

    public final long getControlEpoch() {
        return this.authority.get().revision;
    }

    public final BrowserEngine getEngine() {
        return this.engine;
    }

    public final long getGeneration() {
        return this.connection.generation;
    }

    public final BrowserEngineGroup getGroup() {
        return this.group;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastContactMs() {
        return this.lastContactMs;
    }

    public final LocalBrowserSession getLastSession() {
        return this.lastSessionState.getValue();
    }

    public final boolean getLeftToJarvis() {
        return this.leftToJarvis;
    }

    public final boolean getRetired() {
        return this.retired;
    }

    public final String getRuntimeId() {
        return this.endpoint.runtimeId;
    }

    public final LocalBrowserTaskControl getViewer() {
        return this.viewer;
    }

    public final boolean isAbandoned() {
        if (this.retired || getControl() == LocalBrowserControl.USER) {
            return false;
        }
        LocalBrowserSession session = getSession();
        return (session == null || !session.isViewed()) && SystemClock.elapsedRealtime() - this.lastContactMs >= ABANDONED_AFTER_MS;
    }

    public final boolean isAvailable() {
        return !this.retired && this.runtime.isEnabled() && AuraSessionManager.INSTANCE.isCurrentSession(this.userSession);
    }

    public final boolean isCurrent() {
        TaskConnection taskConnection = this.connection;
        return !this.retired && this.endpoint.isCurrent(taskConnection.generation) && AnonymousClass003.A1Y(taskConnection.isCurrent);
    }

    public final JsonObject registration() {
        C2nw c2nw = new C2nw();
        Iterator<Map.Entry<String, JsonElement>> it = bindingFields().entrySet().iterator();
        while (it.hasNext()) {
            C3cJ.A0v(it, c2nw);
        }
        if (this.centralBlackholeEnabled) {
            c2nw.A01("central_blackhole", LocalBrowserBlocklist.Companion.getInstance(this.userSession).registration(this.engine));
        }
        return c2nw.A00();
    }

    public final Object retire(LocalBrowserTaskOutcome localBrowserTaskOutcome, HtJ<? super Unit> htJ) {
        if (!this.cleanupComplete) {
            discardTakeoverJournal();
            this.retentionWatch.A5w(null);
            C27k c27kA01 = this.retirement;
            if (c27kA01 == null || c27kA01.AOG()) {
                C3UX c3ux = this.lifecycleScope;
                c27kA01 = GAo.A01(C79.A01, C6ys.A00, new LocalBrowserTask$retire$pending$2(this, localBrowserTaskOutcome, null), c3ux);
                this.retirement = c27kA01;
                c27kA01.Afv();
            }
            Object objA0W = C3cG.A0W(c27kA01, htJ);
            if (objA0W == EnumC10460Hji.A02) {
                return objA0W;
            }
        }
        return Unit.INSTANCE;
    }

    public final void setLastSession$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(LocalBrowserSession localBrowserSession) {
        LocalBrowserTarget localBrowserTarget;
        LocalBrowserTarget localBrowserTarget2;
        LocalBrowserTarget localBrowserTarget3;
        LocalBrowserSession value = this.lastSessionState.getValue();
        this.lastSessionState.Af8(localBrowserSession);
        if (localBrowserSession != value) {
            if (value != null && (localBrowserTarget3 = value.target) != null) {
                localBrowserTarget3.bindTakeoverSink(null);
            }
            if (localBrowserSession != null && (localBrowserTarget2 = localBrowserSession.target) != null) {
                localBrowserTarget2.bindTakeoverSink(this.takeoverSink);
            }
            LocalBrowserTakeoverJournal localBrowserTakeoverJournal = this.takeoverJournal;
            if (AnonymousClass002.A1X(localBrowserTakeoverJournal.startedAtMs)) {
                localBrowserTakeoverJournal.markIncomplete();
                if (localBrowserSession == null || (localBrowserTarget = localBrowserSession.target) == null) {
                    return;
                }
                localBrowserTarget.broadcastTakeover(true);
            }
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final String getBrowserTaskId() {
        return C3cH.A0b(this);
    }

    public final LocalBrowserSession getSession() {
        LocalBrowserSession lastSession = getLastSession();
        if (lastSession == null || this.runtime.session(lastSession.id) != lastSession) {
            return null;
        }
        return lastSession;
    }

    public final void recordContact() {
        this.lastContactMs = SystemClock.elapsedRealtime();
    }

    public final JsonObject targetJson() {
        LocalBrowserSession session;
        LocalBrowserConnection localBrowserConnection;
        String str;
        if (!isCurrent() || (session = getSession()) == null || (localBrowserConnection = session.connection) == null || (str = localBrowserConnection.targetId) == null) {
            return null;
        }
        C2nw c2nw = new C2nw();
        C7qW.A06("target_id", str, c2nw);
        C7qW.A06("kind", "page", c2nw);
        C7qW.A06("classification", "task_owned", c2nw);
        C3cJ.A0h(this, c2nw);
        C7qW.A06("storage_mode", "shared", c2nw);
        LocalBrowserConnection localBrowserConnection2 = session.connection;
        C7qW.A06("readiness", (localBrowserConnection2 == null || !localBrowserConnection2.isReady()) ? "bootstrapping" : AvatarMediaMapperKt.READY, c2nw);
        return c2nw.A00();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.facebook.aura.localbrowser.LocalBrowserTask$takeoverSink$1] */
    public LocalBrowserTask(LocalBrowserEndpoint localBrowserEndpoint, LocalBrowserRuntime localBrowserRuntime, AbstractC3358CGz abstractC3358CGz, C3UX c3ux, String str, String str2, long j, BrowserEngine browserEngine, BrowserEngineGroup browserEngineGroup, BackgroundWorkContentClaim backgroundWorkContentClaim, Function0<Boolean> function0, boolean z) {
        AnonymousClass005.A17(localBrowserEndpoint, localBrowserRuntime, abstractC3358CGz, c3ux, str);
        AnonymousClass005.A13(str2, browserEngine, browserEngineGroup, 5);
        C3cH.A18(backgroundWorkContentClaim, function0);
        this.endpoint = localBrowserEndpoint;
        this.runtime = localBrowserRuntime;
        this.userSession = abstractC3358CGz;
        this.lifecycleScope = c3ux;
        this.id = str;
        this.bindingId = str2;
        this.engine = browserEngine;
        this.group = browserEngineGroup;
        this.backgroundWork = backgroundWorkContentClaim;
        this.centralBlackholeEnabled = z;
        this.connection = new TaskConnection(j, function0);
        this.viewer = new LocalBrowserTaskControl(this, abstractC3358CGz);
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.blockSignalSites = keySetViewNewKeySet;
        this.registry = LocalBrowserTaskRegistry.Companion.getInstance(abstractC3358CGz);
        this.authority = new AtomicReference<>(new LocalBrowserTaskAuthority(1L, LocalBrowserControl.AGENT));
        HrH hrH = HwN.A01;
        this.lastSessionState = C3cG.A14(hrH);
        this.takeoverJournal = new LocalBrowserTakeoverJournal();
        this.takeoverSink = new LocalBrowserTakeoverSink() { // from class: com.facebook.aura.localbrowser.LocalBrowserTask$takeoverSink$1
            @Override // com.facebook.aura.localbrowser.LocalBrowserTakeoverSink
            public void record(Integer num, TakeoverActivityJson takeoverActivityJson) {
                LocalBrowserConnection localBrowserConnection;
                String strA0y;
                C7384Etj.A0Y(takeoverActivityJson, 1);
                LocalBrowserSession session = this.this$0.getSession();
                if (session == null || (localBrowserConnection = session.connection) == null || (strA0y = localBrowserConnection.targetId) == null) {
                    return;
                }
                LocalBrowserTakeoverJournal localBrowserTakeoverJournal = this.this$0.takeoverJournal;
                if (num != null) {
                    strA0y = AnonymousClass006.A0y(num, ":popup:", C3cG.A0g(strA0y));
                }
                localBrowserTakeoverJournal.record(strA0y, takeoverActivityJson, System.currentTimeMillis());
            }

            @Override // com.facebook.aura.localbrowser.LocalBrowserTakeoverSink
            public boolean isRecording() {
                return AnonymousClass002.A1X(this.this$0.takeoverJournal.startedAtMs);
            }

            @Override // com.facebook.aura.localbrowser.LocalBrowserTakeoverSink
            public void markIncomplete() {
                this.this$0.takeoverJournal.markIncomplete();
            }
        };
        this.notificationPreview = C3cG.A14(hrH);
        this.stopFromNotification = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTask$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserTask.stopFromNotification$lambda$0(this.f$0);
            }
        };
        LocalBrowserTask$backgroundWorkUpdates$1 localBrowserTask$backgroundWorkUpdates$1 = new LocalBrowserTask$backgroundWorkUpdates$1(this, null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        this.backgroundWorkUpdates = GAo.A02(num, c6ys, localBrowserTask$backgroundWorkUpdates$1, c3ux);
        this.cpuHold = GAo.A02(num, c6ys, new LocalBrowserTask$cpuHold$1(this, null), c3ux);
        this.heldPopupRelease = GAo.A02(num, c6ys, new LocalBrowserTask$heldPopupRelease$1(this, null), c3ux);
        this.notificationPreviewCapture = GAo.A02(num, c6ys, new LocalBrowserTask$notificationPreviewCapture$1(this, null), c3ux);
        this.lastContactMs = SystemClock.elapsedRealtime();
        this.retentionWatch = GAo.A02(num, c6ys, new LocalBrowserTask$retentionWatch$1(this, null), c3ux);
    }

    public /* synthetic */ LocalBrowserTask(LocalBrowserEndpoint localBrowserEndpoint, LocalBrowserRuntime localBrowserRuntime, AbstractC3358CGz abstractC3358CGz, C3UX c3ux, String str, String str2, long j, BrowserEngine browserEngine, BrowserEngineGroup browserEngineGroup, BackgroundWorkContentClaim backgroundWorkContentClaim, Function0 function0, boolean z, int i, C06H c06h) {
        this(localBrowserEndpoint, localBrowserRuntime, abstractC3358CGz, c3ux, str, str2, j, browserEngine, browserEngineGroup, backgroundWorkContentClaim, function0, C3cG.A1K(i & 2048, z));
    }
}
