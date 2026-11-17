package com.facebook.aura.localbrowser;

import X.AGH;
import X.AIW;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass602;
import X.BLG;
import X.C05573ua;
import X.C05663ul;
import X.C06H;
import X.C0924AIa;
import X.C10543Hqv;
import X.C1BN;
import X.C20Z;
import X.C27a;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C4JM;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C78W;
import X.C78p;
import X.C79;
import X.C8eO;
import X.C9258GBl;
import X.C9286GCn;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.F0C;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GAo;
import X.GBK;
import X.GBM;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.applock.AppLockRepository;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.backgroundwork.api.BackgroundWork;
import com.facebook.aura.backgroundwork.api.BackgroundWorkClaim;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import com.facebook.aura.devices.pairing.HatchDeviceBleManagerKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.BackgroundWorkDoneNotifier;
import com.facebook.aura.gateway.service.HatchForegroundService;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.localbrowser.LocalBrowserRuntimeResult;
import com.facebook.aura.localbrowser.config.LocalBrowserConfig;
import com.facebook.aura.localbrowser.core.BrowserEngine;
import com.facebook.aura.localbrowser.core.BrowserEngineAvailability;
import com.facebook.aura.model.BrowserTaskIdKt;
import com.facebook.aura.nodes.HatchNodeClient;
import com.facebook.aura.nodes.transport.HatchNodeServiceState;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.nudge.ConversationNudgeLogging;
import com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt;
import com.hatch.browser.protocol.PageCloseRequest;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class LocalBrowserRuntime implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long ENDPOINT_RECOVERY_HOLD_MS = 90000;
    public static final String ENDPOINT_RECOVERY_REASON = "local_browser_renderer_gone";
    public static final long ENDPOINT_RECOVERY_ROTATION_MS = 10000;
    public static final long ENDPOINT_RECOVERY_WINDOW_MS = 300000;
    public static final int MAX_CLOSED_SESSIONS = 8;
    public static final String TAG = "LocalBrowserRuntime";
    public static final long WAKE_HOLD_MS = 30000;
    public final C1BN<Map<String, LocalBrowserSession>> activeSessions;
    public final List<WeakReference<ComponentActivity>> activityHosts;
    public volatile boolean advertisesBrowser;
    public final F0C capacity$delegate;
    public final C27a cleanupJob;
    public volatile boolean cleared;
    public final LinkedHashMap<HxE<String, String>, LocalBrowserCloseAttempt> closeAttempts;
    public final LinkedHashMap<String, LocalBrowserCloseReason> closedSessions;
    public final LocalBrowserDeviceConditions deviceConditions;
    public volatile boolean enabled;
    public volatile LocalBrowserEndpoint endpoint;
    public final LocalBrowserEngineModule engineModule;
    public final AtomicBoolean engineUnavailable;
    public final InterfaceC2261BLa lifecycle;
    public final Handler mainHandler;
    public final BLG<Boolean> mutableRecoveringEndpoint;
    public final BLG<Map<String, LocalBrowserSession>> mutableSessions;
    public final Map<String, SessionSlot> ownedSessions;
    public int pendingOpens;
    public final LocalBrowserPendingTaskHold pendingTaskHold;
    public final Set<PendingWake> pendingWakes;
    public LocalBrowserProfile profile;
    public final C3UX reaper;
    public final Map<String, Long> recoveredTasks;
    public final C1BN<Boolean> recoveringEndpoint;
    public final LocalBrowserResourceUsage resourceUsage;
    public final C3UX serviceScope;
    public boolean signOutHandled;
    public BackgroundWorkClaim standby;
    public final AbstractC3358CGz userSession;
    public final LocalBrowserVmTaskHold vmTaskHold;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$1", f = "LocalBrowserRuntime.kt", l = {118}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserRuntime.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(HatchNodeServiceState.isForeground);
                final LocalBrowserRuntime localBrowserRuntime = LocalBrowserRuntime.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (!localBrowserRuntime.cleared && localBrowserRuntime.advertisesBrowser) {
                            C4JM.A01(localBrowserRuntime, HatchNodeClient.Companion);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
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
            return LocalBrowserRuntime.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$2", f = "LocalBrowserRuntime.kt", l = {124}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserRuntime.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(AuraAppLifecycleManager.isAppInForegroundImmediateFlow);
                final LocalBrowserRuntime localBrowserRuntime = LocalBrowserRuntime.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (!localBrowserRuntime.cleared && LocalBrowserConfig.INSTANCE.getExperiment().isEnabled && localBrowserRuntime.isEnabled() && localBrowserRuntime.engineModule.getNeedsDownload() && localBrowserRuntime.engineModule.isObtainable()) {
                            C4JM.A01(localBrowserRuntime, HatchNodeClient.Companion);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
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
            return LocalBrowserRuntime.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Companion {
        public final LocalBrowserRuntime getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (LocalBrowserRuntime) abstractC3358CGz.A03(LocalBrowserRuntime.class, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new LocalBrowserRuntime(abstractC3358CGz);
                }
            });
        }

        public static final LocalBrowserRuntime getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new LocalBrowserRuntime(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class PendingWake {
        public final String browserTaskId;
        public final long receivedAtMs;

        public final String getBrowserTaskId() {
            return this.browserTaskId;
        }

        public final long getReceivedAtMs() {
            return this.receivedAtMs;
        }

        public PendingWake(String str, long j) {
            this.browserTaskId = str;
            this.receivedAtMs = j;
        }
    }

    public final class SessionSlot {
        public LocalBrowserSession session;
        public final LocalBrowserTask task;

        public final LocalBrowserSession getSession() {
            return this.session;
        }

        public final LocalBrowserTask getTask() {
            return this.task;
        }

        public final void setSession(LocalBrowserSession localBrowserSession) {
            this.session = localBrowserSession;
        }

        public SessionSlot(LocalBrowserTask localBrowserTask) {
            this.task = localBrowserTask;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime", f = "LocalBrowserRuntime.kt", l = {640, 641}, m = "awaitTaskRegistered", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$awaitTaskRegistered$1, reason: invalid class name and case insensitive filesystem */
    public final class C124381 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C124381(HtJ<? super C124381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserRuntime.this.awaitTaskRegistered(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$awaitTaskRegistered$2", f = "LocalBrowserRuntime.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$awaitTaskRegistered$2, reason: invalid class name and case insensitive filesystem */
    public final class C124392 extends AbstractC07127nr implements G0V<List<? extends LocalBrowserTaskRecordJson>, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $browserTaskId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124392(String str, HtJ<? super C124392> htJ) {
            super(2, htJ);
            this.$browserTaskId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C124392 c124392 = new C124392(this.$browserTaskId, htJ);
            c124392.L$0 = obj;
            return c124392;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(List<? extends LocalBrowserTaskRecordJson> list, HtJ<? super Boolean> htJ) {
            return invoke2((List<LocalBrowserTaskRecordJson>) list, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            LocalBrowserTaskOutcome localBrowserTaskOutcome;
            List<LocalBrowserTaskRecordJson> list = (List) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            String str = this.$browserTaskId;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (LocalBrowserTaskRecordJson localBrowserTaskRecordJson : list) {
                    if (BrowserTaskIdKt.logicalBrowserTaskId(localBrowserTaskRecordJson.taskId).equals(str) && ((localBrowserTaskOutcome = localBrowserTaskRecordJson.outcome) == null || !localBrowserTaskOutcome.getLeavesRunToJarvis())) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<LocalBrowserTaskRecordJson> list, HtJ<? super Boolean> htJ) {
            return ((C124392) create(list, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$beginClose$3", f = "LocalBrowserRuntime.kt", l = {564}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$beginClose$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LocalBrowserCloseAttempt $attempt;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LocalBrowserCloseAttempt localBrowserCloseAttempt, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$attempt = localBrowserCloseAttempt;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$attempt, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserCloseAttempt localBrowserCloseAttempt = this.$attempt;
                this.label = 1;
                if (localBrowserCloseAttempt.settle(this) == enumC10460Hji) {
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
            return new AnonymousClass3(this.$attempt, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime", f = "LocalBrowserRuntime.kt", l = {191, 193}, m = "createPolicyEngine", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$1, reason: invalid class name and case insensitive filesystem */
    public final class C124401 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C124401(HtJ<? super C124401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserRuntime.this.createPolicyEngine(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$2", f = "LocalBrowserRuntime.kt", l = {199}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$2, reason: invalid class name and case insensitive filesystem */
    public final class C124412 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BrowserEngine $engine;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124412(BrowserEngine browserEngine, HtJ<? super C124412> htJ) {
            super(2, htJ);
            this.$engine = browserEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C124412(this.$engine, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserEngine browserEngine = this.$engine;
                this.label = 1;
                if (browserEngine.shutdown(this) == enumC10460Hji) {
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
            return new C124412(this.$engine, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime", f = "LocalBrowserRuntime.kt", l = {171, 174}, m = "createTaskEngine", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$createTaskEngine$1, reason: invalid class name and case insensitive filesystem */
    public final class C124421 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C124421(HtJ<? super C124421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserRuntime.this.createTaskEngine(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$createTaskEngine$2", f = "LocalBrowserRuntime.kt", l = {185}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$createTaskEngine$2, reason: invalid class name and case insensitive filesystem */
    public final class C124432 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BrowserEngine $engine;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124432(BrowserEngine browserEngine, HtJ<? super C124432> htJ) {
            super(2, htJ);
            this.$engine = browserEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C124432(this.$engine, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserEngine browserEngine = this.$engine;
                this.label = 1;
                if (browserEngine.shutdown(this) == enumC10460Hji) {
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
            return new C124432(this.$engine, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime", f = "LocalBrowserRuntime.kt", l = {239}, m = "downloadEngine", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$downloadEngine$1, reason: invalid class name and case insensitive filesystem */
    public final class C124441 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C124441(HtJ<? super C124441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserRuntime.this.downloadEngine(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime", f = "LocalBrowserRuntime.kt", l = {HatchDeviceBleManagerKt.REQUESTED_MTU}, m = "loadEngine", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$loadEngine$1, reason: invalid class name and case insensitive filesystem */
    public final class C124451 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C124451(HtJ<? super C124451> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserRuntime.this.loadEngine(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$openSession$2", f = "LocalBrowserRuntime.kt", l = {OggOpusStreamEncoder.PRE_SKIP_48K}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$openSession$2, reason: invalid class name and case insensitive filesystem */
    public final class C124462 extends AbstractC07127nr implements G0U<HtJ<? super LocalBrowserRuntimeResult>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ long $deadlineElapsedMs;
        public final /* synthetic */ String $id;
        public final /* synthetic */ LocalBrowserTask $task;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$openSession$2$1", f = "LocalBrowserRuntime.kt", l = {324}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$openSession$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LocalBrowserRuntimeResult>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ long $deadlineElapsedMs;
            public final /* synthetic */ String $id;
            public final /* synthetic */ LocalBrowserTask $task;
            public int label;
            public final /* synthetic */ LocalBrowserRuntime this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LocalBrowserRuntime localBrowserRuntime, LocalBrowserTask localBrowserTask, String str, Context context, long j, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = localBrowserRuntime;
                this.$task = localBrowserTask;
                this.$id = str;
                this.$context = context;
                this.$deadlineElapsedMs = j;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$task, this.$id, this.$context, this.$deadlineElapsedMs, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[DONT_GENERATE] */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    X.Hji r5 = X.EnumC10460Hji.A02
                    int r0 = r12.label
                    r4 = 1
                    if (r0 == 0) goto Lf
                    if (r0 != r4) goto La
                    goto L87
                La:
                    java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
                    throw r2
                Lf:
                    X.Hwg.A00(r13)
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    com.facebook.aura.localbrowser.LocalBrowserRuntime.access$checkMainThread(r0)
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    boolean r1 = r0.isEnabled()
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    if (r1 != 0) goto L29
                    com.facebook.aura.localbrowser.LocalBrowserRuntimeFailure r0 = com.facebook.aura.localbrowser.LocalBrowserRuntimeFailure.DISABLED
                L23:
                    com.facebook.aura.localbrowser.LocalBrowserRuntimeResult$Unavailable r13 = new com.facebook.aura.localbrowser.LocalBrowserRuntimeResult$Unavailable
                    r13.<init>(r0)
                    return r13
                L29:
                    java.util.Map<java.lang.String, com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot> r0 = r0.ownedSessions
                    int r1 = r0.size()
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    int r0 = r0.getCapacity()
                    if (r1 >= r0) goto L5b
                    com.facebook.aura.localbrowser.LocalBrowserTask r0 = r12.$task
                    if (r0 != 0) goto L4f
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    java.util.Map<java.lang.String, com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot> r0 = r0.ownedSessions
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L5b
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    com.facebook.aura.localbrowser.LocalBrowserEndpoint r0 = r0.endpoint
                    boolean r0 = r0.getHasActiveTasks()
                    if (r0 != 0) goto L5b
                L4f:
                    com.facebook.aura.localbrowser.LocalBrowserTask r0 = r12.$task
                    if (r0 == 0) goto L5e
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    boolean r0 = r0.getHasStandaloneSession()
                    if (r0 == 0) goto L5e
                L5b:
                    com.facebook.aura.localbrowser.LocalBrowserRuntimeFailure r0 = com.facebook.aura.localbrowser.LocalBrowserRuntimeFailure.SESSION_LIMIT
                    goto L23
                L5e:
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    java.util.Map<java.lang.String, com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot> r3 = r0.ownedSessions
                    java.lang.String r2 = r12.$id
                    com.facebook.aura.localbrowser.LocalBrowserTask r1 = r12.$task
                    com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot r0 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot
                    r0.<init>(r1)
                    r3.put(r2, r0)
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r6 = r12.this$0
                    int r0 = r6.pendingOpens
                    int r0 = r0 + 1
                    r6.pendingOpens = r0
                    java.lang.String r7 = r12.$id     // Catch: java.lang.Throwable -> Lb3
                    android.content.Context r8 = r12.$context     // Catch: java.lang.Throwable -> Lb3
                    long r9 = r12.$deadlineElapsedMs     // Catch: java.lang.Throwable -> Lb3
                    com.facebook.aura.localbrowser.LocalBrowserTask r11 = r12.$task     // Catch: java.lang.Throwable -> Lb3
                    r12.label = r4     // Catch: java.lang.Throwable -> Lb3
                    java.lang.Object r13 = com.facebook.aura.localbrowser.LocalBrowserRuntime.access$openSessionOnMain(r6, r7, r8, r9, r11, r12)     // Catch: java.lang.Throwable -> Lb3
                    if (r13 != r5) goto L8a
                    return r5
                L87:
                    X.Hwg.A00(r13)     // Catch: java.lang.Throwable -> Lb3
                L8a:
                    com.facebook.aura.localbrowser.LocalBrowserRuntimeResult r13 = (com.facebook.aura.localbrowser.LocalBrowserRuntimeResult) r13     // Catch: java.lang.Throwable -> Lb3
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    java.util.Map<java.lang.String, com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot> r1 = r0.ownedSessions
                    java.lang.String r0 = r12.$id
                    java.lang.Object r0 = r1.get(r0)
                    com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot r0 = (com.facebook.aura.localbrowser.LocalBrowserRuntime.SessionSlot) r0
                    if (r0 == 0) goto L9e
                    com.facebook.aura.localbrowser.LocalBrowserSession r0 = r0.session
                    if (r0 != 0) goto La7
                L9e:
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    java.util.Map<java.lang.String, com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot> r1 = r0.ownedSessions
                    java.lang.String r0 = r12.$id
                    r1.remove(r0)
                La7:
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r1 = r12.this$0
                    int r0 = r1.pendingOpens
                    int r0 = r0 + (-1)
                    r1.pendingOpens = r0
                    com.facebook.aura.localbrowser.LocalBrowserRuntime.access$finishCleanupIfCleared(r1)
                    return r13
                Lb3:
                    r2 = move-exception
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    java.util.Map<java.lang.String, com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot> r1 = r0.ownedSessions
                    java.lang.String r0 = r12.$id
                    java.lang.Object r0 = r1.get(r0)
                    com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot r0 = (com.facebook.aura.localbrowser.LocalBrowserRuntime.SessionSlot) r0
                    if (r0 == 0) goto Lc6
                    com.facebook.aura.localbrowser.LocalBrowserSession r0 = r0.session
                    if (r0 != 0) goto Lcf
                Lc6:
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = r12.this$0
                    java.util.Map<java.lang.String, com.facebook.aura.localbrowser.LocalBrowserRuntime$SessionSlot> r1 = r0.ownedSessions
                    java.lang.String r0 = r12.$id
                    r1.remove(r0)
                Lcf:
                    com.facebook.aura.localbrowser.LocalBrowserRuntime r1 = r12.this$0
                    int r0 = r1.pendingOpens
                    int r0 = r0 + (-1)
                    r1.pendingOpens = r0
                    com.facebook.aura.localbrowser.LocalBrowserRuntime.access$finishCleanupIfCleared(r1)
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.C124462.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super LocalBrowserRuntimeResult> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124462(LocalBrowserTask localBrowserTask, String str, Context context, long j, HtJ<? super C124462> htJ) {
            super(1, htJ);
            this.$task = localBrowserTask;
            this.$id = str;
            this.$context = context;
            this.$deadlineElapsedMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LocalBrowserRuntime.this.new C124462(this.$task, this.$id, this.$context, this.$deadlineElapsedMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                GBK gbk = AuraDispatchers.mainImmediate;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LocalBrowserRuntime.this, this.$task, this.$id, this.$context, this.$deadlineElapsedMs, null);
                this.label = 1;
                obj = GAo.A00(this, gbk, anonymousClass1);
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

        @Override // X.G0U
        public final Object invoke(HtJ<? super LocalBrowserRuntimeResult> htJ) {
            return ((C124462) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime", f = "LocalBrowserRuntime.kt", l = {342, 363, 374, 489}, m = "openSessionOnMain", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$openSessionOnMain$1, reason: invalid class name and case insensitive filesystem */
    public final class C124471 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
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
        public /* synthetic */ Object result;

        public C124471(HtJ<? super C124471> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserRuntime.this.openSessionOnMain(null, null, 0L, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$openSessionOnMain$2", f = "LocalBrowserRuntime.kt", l = {394}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$openSessionOnMain$2, reason: invalid class name and case insensitive filesystem */
    public final class C124482 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BrowserEngine $engine;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124482(BrowserEngine browserEngine, HtJ<? super C124482> htJ) {
            super(2, htJ);
            this.$engine = browserEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C124482(this.$engine, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserEngine browserEngine = this.$engine;
                this.label = 1;
                if (browserEngine.shutdown(this) == enumC10460Hji) {
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
            return new C124482(this.$engine, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$openSessionOnMain$3", f = "LocalBrowserRuntime.kt", l = {404}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$openSessionOnMain$3, reason: invalid class name and case insensitive filesystem */
    public final class C124493 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ BrowserEngine $engine;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124493(BrowserEngine browserEngine, HtJ<? super C124493> htJ) {
            super(2, htJ);
            this.$engine = browserEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C124493(this.$engine, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserEngine browserEngine = this.$engine;
                this.label = 1;
                if (browserEngine.shutdown(this) == enumC10460Hji) {
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
            return new C124493(this.$engine, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$openSessionOnMain$4", f = "LocalBrowserRuntime.kt", l = {502}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$openSessionOnMain$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AppLockRepository $appLock;
        public final /* synthetic */ LocalBrowserSession $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AppLockRepository appLockRepository, LocalBrowserSession localBrowserSession, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$appLock = appLockRepository;
            this.$session = localBrowserSession;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$appLock, this.$session, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<Boolean> c1bn = this.$appLock.shouldLock;
                final LocalBrowserSession localBrowserSession = this.$session;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime.openSessionOnMain.4.1
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        localBrowserSession.target.refreshAccess();
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        localBrowserSession.target.refreshAccess();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$postWakePrompt$1", f = "LocalBrowserRuntime.kt", l = {626, 635}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$postWakePrompt$1, reason: invalid class name and case insensitive filesystem */
    public final class C124501 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $browserTaskId;
        public final /* synthetic */ String $openUri;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$postWakePrompt$1$1", f = "LocalBrowserRuntime.kt", l = {633}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$postWakePrompt$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02091 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Object>, Object> {
            public final /* synthetic */ String $browserTaskId;
            public int label;
            public final /* synthetic */ LocalBrowserRuntime this$0;

            @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$postWakePrompt$1$1$1", f = "LocalBrowserRuntime.kt", l = {628, 628}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$postWakePrompt$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02101 extends AbstractC07127nr implements G0V<C20Z<? super Object>, HtJ<? super Unit>, Object> {
                public final /* synthetic */ String $browserTaskId;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public int label;
                public final /* synthetic */ LocalBrowserRuntime this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02101(LocalBrowserRuntime localBrowserRuntime, String str, HtJ<? super C02101> htJ) {
                    super(2, htJ);
                    this.this$0 = localBrowserRuntime;
                    this.$browserTaskId = str;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C02101 c02101 = new C02101(this.this$0, this.$browserTaskId, htJ);
                    c02101.L$0 = obj;
                    return c02101;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(C20Z<? super Object> c20z, HtJ<? super Unit> htJ) {
                    return invoke2((C20Z<Object>) c20z, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    C20Z c20z = (C20Z) this.L$0;
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        LocalBrowserRuntime localBrowserRuntime = this.this$0;
                        String str = this.$browserTaskId;
                        this.L$0 = null;
                        this.L$1 = c20z;
                        this.label = 1;
                        if (localBrowserRuntime.awaitTaskRegistered(str, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(obj);
                            return Unit.INSTANCE;
                        }
                        c20z = (C20Z) this.L$1;
                        Hwg.A00(obj);
                    }
                    Unit unit = Unit.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    if (c20z.emit(unit, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(C20Z<Object> c20z, HtJ<? super Unit> htJ) {
                    return ((C02101) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02091(LocalBrowserRuntime localBrowserRuntime, String str, HtJ<? super C02091> htJ) {
                super(2, htJ);
                this.this$0 = localBrowserRuntime;
                this.$browserTaskId = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02091(this.this$0, this.$browserTaskId, htJ);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Object> htJ) {
                return invoke2(c3ux, (HtJ<Object>) htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C05573ua c05573uaA01 = AbstractC05633ui.A01(new C05663ul(new C02101(this.this$0, this.$browserTaskId, null)), new LocalBrowserRuntime$postWakePrompt$1$1$invokeSuspend$$inlined$filter$1(BrowserTaskRepository.Companion.getInstance(this.this$0.userSession).presentationUpdates(this.$browserTaskId)));
                    this.label = 1;
                    obj = AbstractC9777Gfy.A02(c05573uaA01, this);
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

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(C3UX c3ux, HtJ<Object> htJ) {
                return ((C02091) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$postWakePrompt$1$2", f = "LocalBrowserRuntime.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$postWakePrompt$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $openUri;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$openUri = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$openUri, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                BackgroundWorkDoneNotifier.INSTANCE.cancelPrompt(this.$openUri);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass2(this.$openUri, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124501(String str, String str2, HtJ<? super C124501> htJ) {
            super(2, htJ);
            this.$browserTaskId = str;
            this.$openUri = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserRuntime.this.new C124501(this.$browserTaskId, this.$openUri, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C02091 c02091 = new C02091(LocalBrowserRuntime.this, this.$browserTaskId, null);
                this.label = 1;
                obj = GAX.A01(this, c02091, 30000L);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            if (obj != null) {
                C78T c78tA0y = AnonymousClass001.A0y();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$openUri, null);
                this.label = 2;
                if (GAo.A00(this, c78tA0y, anonymousClass2) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124501) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime", f = "LocalBrowserRuntime.kt", l = {HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "prepareEndpointEngine", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$prepareEndpointEngine$1, reason: invalid class name and case insensitive filesystem */
    public final class C124511 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C124511(HtJ<? super C124511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserRuntime.this.prepareEndpointEngine(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$prepareEndpointEngine$2", f = "LocalBrowserRuntime.kt", l = {209}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$prepareEndpointEngine$2, reason: invalid class name and case insensitive filesystem */
    public final class C124522 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C124522(HtJ<? super C124522> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserRuntime.this.new C124522(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserEngineModule localBrowserEngineModule = LocalBrowserRuntime.this.engineModule;
                this.label = 1;
                if (localBrowserEngineModule.prepare(this) == enumC10460Hji) {
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
            return LocalBrowserRuntime.this.new C124522(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$wakeForTask$1", f = "LocalBrowserRuntime.kt", l = {605}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$wakeForTask$1, reason: invalid class name and case insensitive filesystem */
    public final class C124531 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $browserTaskId;
        public final /* synthetic */ BackgroundWorkContentClaim $claim;
        public final /* synthetic */ PendingWake $wake;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124531(PendingWake pendingWake, String str, BackgroundWorkContentClaim backgroundWorkContentClaim, HtJ<? super C124531> htJ) {
            super(2, htJ);
            this.$wake = pendingWake;
            this.$browserTaskId = str;
            this.$claim = backgroundWorkContentClaim;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserRuntime.this.new C124531(this.$wake, this.$browserTaskId, this.$claim, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    LocalBrowserRuntime$wakeForTask$1$taskRegistered$1 localBrowserRuntime$wakeForTask$1$taskRegistered$1 = new LocalBrowserRuntime$wakeForTask$1$taskRegistered$1(LocalBrowserRuntime.this, this.$browserTaskId, null);
                    this.label = 1;
                    obj = GAX.A01(this, localBrowserRuntime$wakeForTask$1$taskRegistered$1, 30000L);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                boolean z = obj != null;
                if (LocalBrowserRuntime.this.pendingWakes.remove(this.$wake) && !z) {
                    LocalBrowserRuntimeKt.logLocalBrowserWake(this.$browserTaskId, "not_registered", null, null);
                }
                this.$claim.release();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.$claim.release();
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124531) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1", f = "LocalBrowserRuntime.kt", l = {277, 278, 279}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1, reason: invalid class name and case insensitive filesystem */
    public final class C124541 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchNodeClient $nodeClient;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1$1", f = "LocalBrowserRuntime.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02121 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public C02121(HtJ<? super C02121> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C02121 c02121 = new C02121(htJ);
                c02121.Z$0 = AnonymousClass001.A1X(obj);
                return c02121;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label == 0) {
                    return AnonymousClass001.A0k(obj, z);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((C02121) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1$2", f = "LocalBrowserRuntime.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1$2, reason: invalid class name */
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

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124541(HatchNodeClient hatchNodeClient, HtJ<? super C124541> htJ) {
            super(2, htJ);
            this.$nodeClient = hatchNodeClient;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalBrowserRuntime.this.new C124541(this.$nodeClient, htJ);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006e -> B:10:0x0018). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 0
                r4 = 3
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L15
                if (r0 == r2) goto L28
                if (r0 == r3) goto L42
                if (r0 == r4) goto L15
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L15:
                X.Hwg.A00(r8)
            L18:
                X.20Q<java.lang.Boolean> r1 = com.facebook.aura.lifecycle.AuraAppLifecycleManager.isAppInForegroundImmediateFlow
                com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1$1 r0 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1$1
                r0.<init>(r5)
                r7.label = r2
                java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
                if (r0 != r6) goto L2b
                return r6
            L28:
                X.Hwg.A00(r8)
            L2b:
                com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = com.facebook.aura.localbrowser.LocalBrowserRuntime.this
                com.facebook.aura.localbrowser.LocalBrowserEngineModule r0 = r0.engineModule
                boolean r0 = r0.isObtainable()
                if (r0 == 0) goto L61
                com.facebook.aura.localbrowser.LocalBrowserRuntime r1 = com.facebook.aura.localbrowser.LocalBrowserRuntime.this
                r7.label = r3
                java.lang.String r0 = "withdrawn_retry"
                java.lang.Object r8 = com.facebook.aura.localbrowser.LocalBrowserRuntime.access$loadEngine(r1, r0, r7)
                if (r8 != r6) goto L45
                return r6
            L42:
                X.Hwg.A00(r8)
            L45:
                boolean r0 = X.AnonymousClass001.A1X(r8)
                if (r0 == 0) goto L61
                com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = com.facebook.aura.localbrowser.LocalBrowserRuntime.this
                java.util.concurrent.atomic.AtomicBoolean r1 = r0.engineUnavailable
                r0 = 0
                r1.set(r0)
                com.facebook.aura.localbrowser.LocalBrowserRuntime r0 = com.facebook.aura.localbrowser.LocalBrowserRuntime.this
                boolean r0 = r0.cleared
                if (r0 != 0) goto L5e
                com.facebook.aura.nodes.HatchNodeClient r0 = r7.$nodeClient
                r0.reregister()
            L5e:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L61:
                X.20Q<java.lang.Boolean> r1 = com.facebook.aura.lifecycle.AuraAppLifecycleManager.isAppInForegroundImmediateFlow
                com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$withdrawUntilEngineLoads$1$2
                r0.<init>(r5)
                r7.label = r4
                java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
                if (r0 != r6) goto L18
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.C124541.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C124541) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Unit createTaskEngine$lambda$0(LocalBrowserRuntime localBrowserRuntime, LocalBrowserBlocklist localBrowserBlocklist, BrowserEngine browserEngine) {
        C7384Etj.A0Y(browserEngine, 2);
        localBrowserRuntime.endpoint.blockedPolicy.detach(browserEngine);
        localBrowserRuntime.endpoint.headerPolicy.detach(browserEngine);
        localBrowserBlocklist.release(browserEngine);
        return Unit.INSTANCE;
    }

    public static final boolean recoverEndpoint$lambda$0(long j, Map.Entry entry) {
        C7384Etj.A0Y(entry, 1);
        return j - C3cG.A05(entry.getValue()) >= 300000;
    }

    public static final void recoverEndpoint$release(BackgroundWorkClaim backgroundWorkClaim) {
        C7384Etj.A0Y(backgroundWorkClaim, 0);
        backgroundWorkClaim.release();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cleared = true;
        this.enabled = false;
        Hxb.A03(null, this.serviceScope);
        this.deviceConditions.close();
        setStandingBy(false);
        this.vmTaskHold.close();
        this.pendingTaskHold.close();
        if (C3cH.A1K()) {
            signOut();
        } else {
            this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.signOut();
                }
            });
        }
    }

    public final boolean closeSession(LocalBrowserSession localBrowserSession, LocalBrowserCloseReason localBrowserCloseReason) {
        C7384Etj.A0Y(localBrowserSession, 0);
        C7384Etj.A0Y(localBrowserCloseReason, 1);
        checkMainThread();
        if (this.mutableSessions.getValue().get(localBrowserSession.id) == localBrowserSession) {
            BLG<Map<String, LocalBrowserSession>> blg = this.mutableSessions;
            blg.Af8(AGH.A09(localBrowserSession.id, blg.getValue()));
            this.resourceUsage.sessionsChanged(this.mutableSessions.getValue().size(), localBrowserCloseReason);
        }
        if (!AnonymousClass002.A1Y(localBrowserSession.closeReason)) {
            return localBrowserSession.close(localBrowserCloseReason);
        }
        this.closedSessions.remove(localBrowserSession.id);
        this.closedSessions.put(localBrowserSession.id, localBrowserCloseReason);
        LinkedHashMap<String, LocalBrowserCloseReason> linkedHashMap = this.closedSessions;
        if (linkedHashMap.size() > 8) {
            Set<String> setKeySet = linkedHashMap.keySet();
            C7384Etj.A0U(setKeySet);
            linkedHashMap.remove(AbstractC0878AGe.A0B(setKeySet));
        }
        boolean zA1R = C3cH.A1R(localBrowserSession.agentActive);
        boolean zIsTaskFinished = localBrowserSession.isTaskFinished();
        boolean zClose = localBrowserSession.close(localBrowserCloseReason);
        LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("operation_id", localBrowserSession.id);
        C3cI.A1E(localBrowserSession, c0924AIaA0u);
        c0924AIaA0u.put("reason", AnonymousClass006.A0x(localBrowserCloseReason));
        LocalBrowserCloseReason localBrowserCloseReason2 = LocalBrowserCloseReason.RENDERER_GONE;
        if (localBrowserCloseReason == localBrowserCloseReason2) {
            c0924AIaA0u.put("terminated_by", localBrowserTelemetry.rendererTerminatedBy());
        }
        c0924AIaA0u.put("result", zClose ? "success" : "failure");
        localBrowserTelemetry.event("local_browser_session_close", "outcome", AIW.A0K(c0924AIaA0u), null);
        if (localBrowserCloseReason == localBrowserCloseReason2) {
            recoverEndpoint(localBrowserSession, zA1R, zIsTaskFinished);
        }
        switch (localBrowserCloseReason.ordinal()) {
            case 0:
            case 4:
                LocalBrowserTask localBrowserTask = localBrowserSession.task;
                if (localBrowserTask != null) {
                    localBrowserTask.interrupt(LocalBrowserTaskOutcome.STOPPED);
                    break;
                }
                break;
            case 1:
            case 8:
                break;
            case 2:
                LocalBrowserTask localBrowserTask2 = localBrowserSession.task;
                if (localBrowserTask2 != null) {
                    localBrowserTask2.interrupt(LocalBrowserTaskOutcome.IDLE);
                    break;
                }
                break;
            case 3:
            case 5:
            case 7:
                LocalBrowserTask localBrowserTask3 = localBrowserSession.task;
                if (localBrowserTask3 != null) {
                    localBrowserTask3.interrupt(LocalBrowserTaskOutcome.BROWSER_LOST);
                    break;
                }
                break;
            case 6:
                LocalBrowserTask localBrowserTask4 = localBrowserSession.task;
                if (localBrowserTask4 != null) {
                    localBrowserTask4.interrupt(LocalBrowserTaskOutcome.FAILED_TO_START);
                    break;
                }
                break;
            default:
                throw C3cG.A0q();
        }
        if (!zClose) {
            disableAfterCleanupFailure("native_not_retired", null);
            CFK.A06(TAG, "Browser native resources did not retire");
        }
        LocalBrowserConnection localBrowserConnection = localBrowserSession.connection;
        if (localBrowserConnection == null) {
            return zClose;
        }
        AnonymousClass001.A1J(new LocalBrowserRuntime$closeSession$2$1(localBrowserConnection, this, zClose, localBrowserSession, null), this.reaper);
        return zClose;
    }

    public final LocalBrowserCloseReason closedReason(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        return this.closedSessions.get(str);
    }

    public final void invalidatePolicy() {
        disableAfterCleanupFailure("policy_inconsistent", null);
    }

    public final AutoCloseable offerActivity(ComponentActivity componentActivity) {
        C7384Etj.A0Y(componentActivity, 0);
        checkMainThread();
        final WeakReference<ComponentActivity> weakReference = new WeakReference<>(componentActivity);
        this.activityHosts.add(weakReference);
        return new AutoCloseable() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda13
            @Override // java.lang.AutoCloseable
            public final void close() {
                LocalBrowserRuntime.offerActivity$lambda$0(this.f$0, weakReference);
            }
        };
    }

    public final boolean ownsSession(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        return this.ownedSessions.containsKey(str);
    }

    public final void recordActivity(LocalBrowserSession localBrowserSession) {
        C7384Etj.A0Y(localBrowserSession, 0);
        checkMainThread();
        if (this.mutableSessions.getValue().get(localBrowserSession.id) == localBrowserSession && AnonymousClass002.A1Y(localBrowserSession.closeReason)) {
            localBrowserSession.markAgentActivity();
            recordInteraction(localBrowserSession);
        }
    }

    public final void recordInteraction(LocalBrowserSession localBrowserSession) {
        C7384Etj.A0Y(localBrowserSession, 0);
        checkMainThread();
        if (this.mutableSessions.getValue().get(localBrowserSession.id) == localBrowserSession && AnonymousClass002.A1Y(localBrowserSession.closeReason)) {
            localBrowserSession.recordInteraction();
        }
    }

    public final LocalBrowserSession session(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread();
        LocalBrowserSession localBrowserSession = this.mutableSessions.getValue().get(str);
        if (localBrowserSession == null || !isEnabled()) {
            return null;
        }
        return localBrowserSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0004 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x0008, B:16:0x0021, B:17:0x0023, B:19:0x002a, B:22:0x0034, B:9:0x000d, B:11:0x0011, B:13:0x0015, B:15:0x0019), top: B:28:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void setStandingBy(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L4
            goto Ld
        L4:
            com.facebook.aura.backgroundwork.api.BackgroundWorkClaim r0 = r3.standby     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto Lb
            r0.release()     // Catch: java.lang.Throwable -> L39
        Lb:
            r0 = 0
            goto L21
        Ld:
            boolean r0 = r3.cleared     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L4
            boolean r0 = r3.enabled     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L4
            com.facebook.aura.backgroundwork.api.BackgroundWorkClaim r0 = r3.standby     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L23
            com.facebook.aura.backgroundwork.api.BackgroundWork r1 = com.facebook.aura.backgroundwork.api.BackgroundWork.INSTANCE     // Catch: java.lang.Throwable -> L39
            X.CGz r0 = r3.userSession     // Catch: java.lang.Throwable -> L39
            com.facebook.aura.backgroundwork.api.BackgroundWorkClaim r0 = r1.standBy(r0)     // Catch: java.lang.Throwable -> L39
        L21:
            r3.standby = r0     // Catch: java.lang.Throwable -> L39
        L23:
            com.facebook.aura.localbrowser.LocalBrowserVmTaskHold r1 = r3.vmTaskHold     // Catch: java.lang.Throwable -> L39
            r2 = 1
            boolean r0 = X.AnonymousClass002.A1X(r0)
            r1.setActive(r0)     // Catch: java.lang.Throwable -> L39
            com.facebook.aura.localbrowser.LocalBrowserPendingTaskHold r1 = r3.pendingTaskHold     // Catch: java.lang.Throwable -> L39
            com.facebook.aura.backgroundwork.api.BackgroundWorkClaim r0 = r3.standby     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L34
            r2 = 0
        L34:
            r1.setActive(r2)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)
            return
        L39:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.setStandingBy(boolean):void");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalBrowserCloseReason.values().length];
            try {
                AnonymousClass002.A13(LocalBrowserCloseReason.IDLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LocalBrowserCloseReason.INITIALIZATION_FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LocalBrowserCloseReason.RENDERER_GONE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(LocalBrowserCloseReason.DEVTOOLS_LOST, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(LocalBrowserCloseReason.CONNECTION_FAILED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(LocalBrowserCloseReason.USER, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(LocalBrowserCloseReason.DISABLED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(LocalBrowserCloseReason.AGENT, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(LocalBrowserCloseReason.SIGNED_OUT, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ LocalBrowserRuntimeResult access$unavailable(LocalBrowserRuntime localBrowserRuntime, LocalBrowserRuntimeFailure localBrowserRuntimeFailure) {
        return new LocalBrowserRuntimeResult.Unavailable(localBrowserRuntimeFailure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitTaskRegistered(java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.localbrowser.LocalBrowserRuntime.C124381
            if (r0 == 0) goto L52
            r5 = r8
            com.facebook.aura.localbrowser.LocalBrowserRuntime$awaitTaskRegistered$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserRuntime.C124381) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L5d
            if (r0 != r3) goto L58
            X.Hwg.A00(r2)
        L23:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L26:
            X.Hwg.A00(r2)
            if (r7 != 0) goto L37
            r0 = 0
            r5.L$0 = r0
            r5.label = r1
            X.Hji r0 = X.C7Bq.A02(r5)
            if (r0 != r4) goto L60
            return r4
        L37:
            com.facebook.aura.localbrowser.LocalBrowserTaskRegistry$Companion r1 = com.facebook.aura.localbrowser.LocalBrowserTaskRegistry.Companion
            X.CGz r0 = r6.userSession
            com.facebook.aura.localbrowser.LocalBrowserTaskRegistry r0 = r1.getInstance(r0)
            X.1BN<java.util.List<com.facebook.aura.localbrowser.LocalBrowserTaskRecordJson>> r2 = r0.records
            r1 = 0
            com.facebook.aura.localbrowser.LocalBrowserRuntime$awaitTaskRegistered$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$awaitTaskRegistered$2
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r5, r0, r2)
            if (r0 != r4) goto L23
            return r4
        L52:
            com.facebook.aura.localbrowser.LocalBrowserRuntime$awaitTaskRegistered$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$awaitTaskRegistered$1
            r5.<init>(r8)
            goto L12
        L58:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L5d:
            X.Hwg.A00(r2)
        L60:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.awaitTaskRegistered(java.lang.String, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ LocalBrowserCloseAttempt beginClose$default(LocalBrowserRuntime localBrowserRuntime, LocalBrowserSession localBrowserSession, String str, long j, PageCloseRequest pageCloseRequest, int i, Object obj) {
        if ((i & 8) != 0) {
            pageCloseRequest = null;
        }
        return localBrowserRuntime.beginClose(localBrowserSession, str, j, pageCloseRequest);
    }

    public static final Unit deviceConditions$lambda$0(LocalBrowserRuntime localBrowserRuntime) {
        if (!localBrowserRuntime.cleared) {
            C4JM.A01(localBrowserRuntime, HatchNodeClient.Companion);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableAfterCleanupFailure(String str, Throwable th) {
        if (this.enabled) {
            this.enabled = false;
            LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
            C0924AIa c0924AIaA0u = C3cG.A0u();
            c0924AIaA0u.put("runtime_id", this.endpoint.runtimeId);
            c0924AIaA0u.put("trigger", str);
            if (th != null) {
                c0924AIaA0u.put("error_class", localBrowserTelemetry.exceptionClass(th));
            }
            localBrowserTelemetry.event("local_browser_runtime_disabled", "error", AIW.A0K(c0924AIaA0u), null);
            setStandingBy(false);
            this.endpoint.stopOwnedTasks(LocalBrowserTaskOutcome.BROWSER_LOST);
            Iterator itA0k = C3cH.A0k(this);
            while (itA0k.hasNext()) {
                closeSession((LocalBrowserSession) itA0k.next(), LocalBrowserCloseReason.CONNECTION_FAILED);
            }
            retireProfile();
            if (this.cleared) {
                return;
            }
            C4JM.A01(this, HatchNodeClient.Companion);
        }
    }

    public static /* synthetic */ void disableAfterCleanupFailure$default(LocalBrowserRuntime localBrowserRuntime, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        localBrowserRuntime.disableAfterCleanupFailure(str, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishCleanupIfCleared() {
        if (this.signOutHandled && this.pendingOpens == 0) {
            ((GBM) this.cleanupJob).A0R(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadEngine(java.lang.String r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.localbrowser.LocalBrowserRuntime.C124451
            if (r0 == 0) goto L22
            r5 = r9
            com.facebook.aura.localbrowser.LocalBrowserRuntime$loadEngine$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserRuntime.C124451) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L2c
            java.lang.Object r8 = r5.L$0
            goto L28
        L22:
            com.facebook.aura.localbrowser.LocalBrowserRuntime$loadEngine$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$loadEngine$1
            r5.<init>(r9)
            goto L12
        L28:
            X.Hwg.A00(r4)     // Catch: java.util.concurrent.CancellationException -> L43 java.io.IOException -> L4b
            goto L41
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r4)
            com.facebook.aura.localbrowser.LocalBrowserEngineModule r0 = r7.engineModule     // Catch: java.util.concurrent.CancellationException -> L43 java.io.IOException -> L4b
            r5.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L43 java.io.IOException -> L4b
            r5.label = r1     // Catch: java.util.concurrent.CancellationException -> L43 java.io.IOException -> L4b
            java.lang.Object r0 = r0.prepare(r5)     // Catch: java.util.concurrent.CancellationException -> L43 java.io.IOException -> L4b
            if (r0 != r2) goto L41
            return r2
        L41:
            r5 = r3
            goto L53
        L43:
            X.C3cG.A1H(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L4b:
            r5 = move-exception
            java.lang.String r1 = "Browser engine load failed"
            java.lang.String r0 = "LocalBrowserRuntime"
            X.CFK.A0A(r0, r1, r5)
        L53:
            com.facebook.aura.localbrowser.LocalBrowserTelemetry r4 = com.facebook.aura.localbrowser.LocalBrowserTelemetry.INSTANCE
            X.AIa r2 = X.C3cG.A0u()
            java.lang.String r0 = "trigger"
            r2.put(r0, r8)
            if (r5 != 0) goto L90
            java.lang.String r1 = "success"
        L62:
            java.lang.String r0 = "result"
            r2.put(r0, r1)
            boolean r0 = r5 instanceof com.facebook.aura.localbrowser.LocalBrowserEngineUnavailable
            if (r0 == 0) goto L6e
            r3 = r5
            com.facebook.aura.localbrowser.LocalBrowserEngineUnavailable r3 = (com.facebook.aura.localbrowser.LocalBrowserEngineUnavailable) r3
        L6e:
            if (r3 == 0) goto L7c
            java.lang.String r1 = "failure_stage"
            java.lang.String r0 = r3.stage
            r2.put(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.details
            r2.putAll(r0)
        L7c:
            X.AIa r3 = X.AIW.A0K(r2)
            r2 = 0
            java.lang.String r1 = "local_browser_engine_load"
            java.lang.String r0 = "outcome"
            r4.event(r1, r0, r3, r2)
            if (r5 != 0) goto L8b
            r6 = 1
        L8b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            return r2
        L90:
            java.lang.String r1 = "failure"
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.loadEngine(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void logEndpointRecovery(String str, String str2, String str3, Boolean bool) {
        LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, str);
        c0924AIaA0u.put("result", str2);
        if (str3 != null) {
            c0924AIaA0u.put(ConversationNudgeLogging.KEY_SKIP_REASON, str3);
        }
        if (bool != null) {
            C3cI.A1K("gateway_rotated", c0924AIaA0u, bool.booleanValue());
        }
        c0924AIaA0u.put("app_state", localBrowserTelemetry.appState());
        localBrowserTelemetry.event("local_browser_endpoint_recovery", "outcome", AIW.A0K(c0924AIaA0u), null);
    }

    public static /* synthetic */ void logEndpointRecovery$default(LocalBrowserRuntime localBrowserRuntime, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        localBrowserRuntime.logEndpointRecovery(str, str2, str3, bool);
    }

    public static /* synthetic */ Object openSession$default(LocalBrowserRuntime localBrowserRuntime, Context context, long j, LocalBrowserTask localBrowserTask, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            localBrowserTask = null;
        }
        return localBrowserRuntime.openSession(context, j, localBrowserTask, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        if (r9 == null) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c A[Catch: IOException -> 0x038b, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x038b, blocks: (B:17:0x0060, B:46:0x010c), top: B:167:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Type inference failed for: r11v6, types: [T, com.facebook.aura.localbrowser.LocalBrowserSession, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object openSessionOnMain(java.lang.String r22, android.content.Context r23, long r24, com.facebook.aura.localbrowser.LocalBrowserTask r26, X.HtJ<? super com.facebook.aura.localbrowser.LocalBrowserRuntimeResult> r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.openSessionOnMain(java.lang.String, android.content.Context, long, com.facebook.aura.localbrowser.LocalBrowserTask, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit openSessionOnMain$lambda$5(C10543Hqv c10543Hqv, LocalBrowserRuntime localBrowserRuntime) {
        LocalBrowserSession localBrowserSession = (LocalBrowserSession) c10543Hqv.element;
        if (localBrowserSession != null) {
            localBrowserRuntime.closeSession(localBrowserSession, LocalBrowserCloseReason.RENDERER_GONE);
        }
        return Unit.INSTANCE;
    }

    public static final boolean openSessionOnMain$lambda$6(AppLockRepository appLockRepository, LocalBrowserRuntime localBrowserRuntime) {
        return !C3cH.A1R(appLockRepository.shouldLock) && AuraSessionManager.INSTANCE.isCurrentSession(localBrowserRuntime.userSession);
    }

    public static final Unit openSessionOnMain$lambda$8(LocalBrowserRuntime localBrowserRuntime, LocalBrowserSession localBrowserSession) {
        localBrowserRuntime.closeSession(localBrowserSession, LocalBrowserCloseReason.DEVTOOLS_LOST);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareEndpointEngine(long r14, X.HtJ<? super kotlin.Unit> r16) throws com.facebook.aura.localbrowser.LocalBrowserEndpointFailure {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.localbrowser.LocalBrowserRuntime.C124511
            if (r0 == 0) goto L21
            r5 = r3
            com.facebook.aura.localbrowser.LocalBrowserRuntime$prepareEndpointEngine$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserRuntime.C124511) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.label = r2
        L14:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            r6 = 0
            if (r0 == 0) goto L30
            if (r0 != r3) goto L2b
            goto L27
        L21:
            com.facebook.aura.localbrowser.LocalBrowserRuntime$prepareEndpointEngine$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$prepareEndpointEngine$1
            r5.<init>(r3)
            goto L14
        L27:
            X.Hwg.A00(r1)     // Catch: java.io.IOException -> L63
            goto L4f
        L2b:
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A0n()
            throw r3
        L30:
            X.Hwg.A00(r1)
            long r7 = X.C3cH.A04(r14)     // Catch: java.io.IOException -> L63
            r9 = 0
            r11 = 20000(0x4e20, double:9.8813E-320)
            long r1 = X.ATD.A07(r7, r9, r11)     // Catch: java.io.IOException -> L63
            com.facebook.aura.localbrowser.LocalBrowserRuntime$prepareEndpointEngine$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$prepareEndpointEngine$2     // Catch: java.io.IOException -> L63
            r0.<init>(r6)     // Catch: java.io.IOException -> L63
            r5.J$0 = r14     // Catch: java.io.IOException -> L63
            r5.label = r3     // Catch: java.io.IOException -> L63
            java.lang.Object r1 = X.GAX.A01(r5, r0, r1)     // Catch: java.io.IOException -> L63
            if (r1 != r4) goto L4f
            return r4
        L4f:
            if (r1 == 0) goto L54
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L54:
            java.lang.String r4 = "engine_preparation_timed_out"
            r5 = 0
            X.9jH r8 = X.AGH.A0E()     // Catch: java.io.IOException -> L63
            com.facebook.aura.localbrowser.LocalBrowserEndpointFailure r3 = new com.facebook.aura.localbrowser.LocalBrowserEndpointFailure     // Catch: java.io.IOException -> L63
            r7 = r6
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L63
            throw r3     // Catch: java.io.IOException -> L63
        L63:
            r2 = move-exception
            java.lang.String r1 = "Browser engine unavailable"
            java.lang.String r0 = "LocalBrowserRuntime"
            X.CFK.A0A(r0, r1, r2)
            r13.withdrawUntilEngineLoads()
            boolean r0 = r2 instanceof com.facebook.aura.localbrowser.LocalBrowserEngineUnavailable
            if (r0 == 0) goto L8d
            com.facebook.aura.localbrowser.LocalBrowserEngineUnavailable r2 = (com.facebook.aura.localbrowser.LocalBrowserEngineUnavailable) r2
            if (r2 == 0) goto L8d
            java.lang.String r7 = r2.stage
            java.util.Map<java.lang.String, java.lang.String> r9 = r2.details
            if (r9 != 0) goto L80
        L7c:
            X.9jH r9 = X.AGH.A0E()
        L80:
            java.lang.String r4 = "engine_unavailable"
            r5 = 0
            X.9jH r8 = X.AGH.A0E()
            com.facebook.aura.localbrowser.LocalBrowserEndpointFailure r3 = new com.facebook.aura.localbrowser.LocalBrowserEndpointFailure
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L8d:
            r7 = r6
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.prepareEndpointEngine(long, X.HtJ):java.lang.Object");
    }

    private final void recoverEndpoint(LocalBrowserSession localBrowserSession, boolean z, boolean z2) {
        String str;
        final LocalBrowserTask localBrowserTask = localBrowserSession.task;
        if (localBrowserTask != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            AbstractC0882AGj.A0t(this.recoveredTasks.entrySet(), new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda1
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(LocalBrowserRuntime.recoverEndpoint$lambda$0(jElapsedRealtime, (Map.Entry) obj));
                }
            });
            if (AnonymousClass003.A1Z(this.mutableRecoveringEndpoint)) {
                str = "in_progress";
            } else if (this.cleared || !isEnabled()) {
                str = "disabled";
            } else if (localBrowserSession.getControl() != LocalBrowserControl.AGENT) {
                str = "user_control";
            } else if (z2) {
                str = "task_finished";
            } else if (!z) {
                str = "agent_idle";
            } else if (!PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM.equals(LocalBrowserTelemetry.INSTANCE.rendererTerminatedBy())) {
                str = "app_terminated";
            } else {
                if (!this.recoveredTasks.containsKey(C3cH.A0b(localBrowserTask))) {
                    this.recoveredTasks.put(C3cH.A0b(localBrowserTask), Long.valueOf(jElapsedRealtime));
                    AnonymousClass004.A1D(true, this.mutableRecoveringEndpoint);
                    final BackgroundWorkClaim backgroundWorkClaimStandBy = BackgroundWork.INSTANCE.standBy(this.userSession);
                    this.mainHandler.postDelayed(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocalBrowserRuntime.recoverEndpoint$release(backgroundWorkClaimStandBy);
                        }
                    }, 90000L);
                    this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocalBrowserRuntime.recoverEndpoint$lambda$1(this.f$0, backgroundWorkClaimStandBy, localBrowserTask, jElapsedRealtime);
                        }
                    });
                    return;
                }
                str = "recently_recovered";
            }
            logEndpointRecovery(localBrowserTask.id, "skipped", str, null);
        }
    }

    public static final void recoverEndpoint$lambda$1(LocalBrowserRuntime localBrowserRuntime, BackgroundWorkClaim backgroundWorkClaim, LocalBrowserTask localBrowserTask, long j) {
        boolean z = localBrowserRuntime.cleared;
        Boolean boolA0h = AnonymousClass001.A0h();
        if (z || !localBrowserRuntime.isEnabled()) {
            C9286GCn.A00(null, boolA0h, (C9286GCn) localBrowserRuntime.mutableRecoveringEndpoint);
            backgroundWorkClaim.release();
            localBrowserRuntime.logEndpointRecovery(localBrowserTask.id, "skipped", "disabled", null);
            return;
        }
        LocalBrowserEndpoint localBrowserEndpoint = localBrowserRuntime.endpoint;
        Iterator<String> it = localBrowserEndpoint.browserTaskIds().iterator();
        while (it.hasNext()) {
            localBrowserRuntime.recoveredTasks.put(it.next(), Long.valueOf(j));
        }
        localBrowserEndpoint.stopOwnedTasks(LocalBrowserTaskOutcome.BROWSER_LOST);
        localBrowserRuntime.endpoint = new LocalBrowserEndpoint(localBrowserRuntime, localBrowserRuntime.userSession);
        localBrowserEndpoint.close();
        HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(localBrowserRuntime.userSession);
        boolean zRecoverFromSuspectedDeadConnection = gateway.recoverFromSuspectedDeadConnection(ENDPOINT_RECOVERY_REASON);
        localBrowserRuntime.logEndpointRecovery(localBrowserTask.id, "started", null, Boolean.valueOf(zRecoverFromSuspectedDeadConnection));
        if (!zRecoverFromSuspectedDeadConnection) {
            AnonymousClass001.A1E(localBrowserRuntime.mutableRecoveringEndpoint, null, boolA0h);
        } else {
            AnonymousClass001.A1J(new LocalBrowserRuntime$recoverEndpoint$3$2(localBrowserRuntime, gateway, null), localBrowserRuntime.reaper);
        }
    }

    public static final void setBrowserEnabled$lambda$0(boolean z, LocalBrowserRuntime localBrowserRuntime) {
        if (z) {
            return;
        }
        localBrowserRuntime.endpoint.stopOwnedTasks(LocalBrowserTaskOutcome.STOPPED);
        Iterator itA0k = C3cH.A0k(localBrowserRuntime);
        while (itA0k.hasNext()) {
            localBrowserRuntime.closeSession((LocalBrowserSession) itA0k.next(), LocalBrowserCloseReason.DISABLED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void signOut() {
        this.activityHosts.clear();
        this.endpoint.stopOwnedTasks(LocalBrowserTaskOutcome.STOPPED);
        this.endpoint.close();
        Iterator itA0k = C3cH.A0k(this);
        while (itA0k.hasNext()) {
            closeSession((LocalBrowserSession) itA0k.next(), LocalBrowserCloseReason.SIGNED_OUT);
        }
        retireProfile();
        this.signOutHandled = true;
        finishCleanupIfCleared();
    }

    private final LocalBrowserRuntimeResult unavailable(LocalBrowserRuntimeFailure localBrowserRuntimeFailure) {
        return new LocalBrowserRuntimeResult.Unavailable(localBrowserRuntimeFailure);
    }

    private final void withdrawUntilEngineLoads() {
        if (this.cleared || !C3cI.A1W(this.engineUnavailable)) {
            return;
        }
        HatchNodeClient companion = HatchNodeClient.Companion.getInstance(this.userSession, C4JM.A00());
        companion.reregister();
        AnonymousClass001.A1J(new C124541(companion, null), this.serviceScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createPolicyEngine(long r8, X.HtJ<? super com.facebook.aura.localbrowser.core.BrowserEngine> r10) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.localbrowser.LocalBrowserRuntime.C124401
            if (r0 == 0) goto L52
            r6 = r10
            com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$1 r6 = (com.facebook.aura.localbrowser.LocalBrowserRuntime.C124401) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L36
            if (r1 != r3) goto L77
            X.Hwg.A00(r5)
        L23:
            com.facebook.aura.localbrowser.core.BrowserEngine r5 = (com.facebook.aura.localbrowser.core.BrowserEngine) r5
            if (r5 == 0) goto L6d
            goto L58
        L28:
            X.Hwg.A00(r5)
            r6.J$0 = r8
            r6.label = r0
            java.lang.Object r0 = r7.prepareEndpointEngine(r8, r6)
            if (r0 != r4) goto L3b
            return r4
        L36:
            long r8 = r6.J$0
            X.Hwg.A00(r5)
        L3b:
            com.facebook.aura.localbrowser.core.BrowserEngine$Companion r2 = com.facebook.aura.localbrowser.core.BrowserEngine.Companion
            com.facebook.aura.localbrowser.LocalBrowserEndpoint r0 = r7.endpoint
            com.facebook.aura.localbrowser.LocalBrowserHeaderPolicy r0 = r0.headerPolicy
            com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$engine$1 r1 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$engine$1
            r1.<init>(r0)
            r6.J$0 = r8
            r6.label = r3
            r0 = 0
            java.lang.Object r5 = r2.create(r0, r1, r6)
            if (r5 != r4) goto L23
            return r4
        L52:
            com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$1
            r6.<init>(r10)
            goto L12
        L58:
            com.facebook.aura.localbrowser.LocalBrowserEndpoint r0 = r7.endpoint     // Catch: java.lang.Exception -> L60
            com.facebook.aura.localbrowser.LocalBrowserHeaderPolicy r0 = r0.headerPolicy     // Catch: java.lang.Exception -> L60
            r0.attach(r5)     // Catch: java.lang.Exception -> L60
            return r5
        L60:
            r3 = move-exception
            X.3UX r2 = r7.reaper
            r1 = 0
            com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$createPolicyEngine$2
            r0.<init>(r5, r1)
            X.AnonymousClass001.A1J(r0, r2)
            throw r3
        L6d:
            r2 = 0
            java.lang.String r1 = "engine_unavailable"
            java.lang.String r0 = "engine_create"
            com.facebook.aura.localbrowser.LocalBrowserEndpointFailure r0 = X.C3cI.A0F(r1, r2, r0)
            throw r0
        L77:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.createPolicyEngine(long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createTaskEngine(android.content.Context r9, long r10, X.HtJ<? super com.facebook.aura.localbrowser.core.BrowserEngine> r12) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.facebook.aura.localbrowser.LocalBrowserRuntime.C124421
            if (r0 == 0) goto L69
            r6 = r12
            com.facebook.aura.localbrowser.LocalBrowserRuntime$createTaskEngine$1 r6 = (com.facebook.aura.localbrowser.LocalBrowserRuntime.C124421) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 == r0) goto L40
            if (r1 != r4) goto L98
            java.lang.Object r3 = r6.L$1
            com.facebook.aura.localbrowser.LocalBrowserBlocklist r3 = (com.facebook.aura.localbrowser.LocalBrowserBlocklist) r3
            java.lang.Object r9 = r6.L$0
            android.content.Context r9 = (android.content.Context) r9
            X.Hwg.A00(r5)
        L2b:
            com.facebook.aura.localbrowser.core.BrowserEngine r5 = (com.facebook.aura.localbrowser.core.BrowserEngine) r5
            if (r5 == 0) goto L8e
            goto L6f
        L30:
            X.Hwg.A00(r5)
            r6.L$0 = r9
            r6.J$0 = r10
            r6.label = r0
            java.lang.Object r0 = r8.prepareEndpointEngine(r10, r6)
            if (r0 != r7) goto L49
            return r7
        L40:
            long r10 = r6.J$0
            java.lang.Object r9 = r6.L$0
            android.content.Context r9 = (android.content.Context) r9
            X.Hwg.A00(r5)
        L49:
            com.facebook.aura.localbrowser.LocalBrowserBlocklist$Companion r1 = com.facebook.aura.localbrowser.LocalBrowserBlocklist.Companion
            X.CGz r0 = r8.userSession
            com.facebook.aura.localbrowser.LocalBrowserBlocklist r3 = r1.getInstance(r0)
            com.facebook.aura.localbrowser.core.BrowserEngine$Companion r2 = com.facebook.aura.localbrowser.core.BrowserEngine.Companion
            com.hatch.browser.core.BrowserHostBlocklist r1 = r3.check
            com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda4 r0 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda4
            r0.<init>()
            r6.L$0 = r9
            r6.L$1 = r3
            r6.J$0 = r10
            r6.label = r4
            java.lang.Object r5 = r2.create(r1, r0, r6)
            if (r5 != r7) goto L2b
            return r7
        L69:
            com.facebook.aura.localbrowser.LocalBrowserRuntime$createTaskEngine$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$createTaskEngine$1
            r6.<init>(r12)
            goto L12
        L6f:
            com.facebook.aura.localbrowser.LocalBrowserEndpoint r0 = r8.endpoint     // Catch: java.lang.Exception -> L81
            com.facebook.aura.localbrowser.LocalBrowserBlockedPolicy r0 = r0.blockedPolicy     // Catch: java.lang.Exception -> L81
            r0.attach(r5)     // Catch: java.lang.Exception -> L81
            com.facebook.aura.localbrowser.LocalBrowserEndpoint r0 = r8.endpoint     // Catch: java.lang.Exception -> L81
            com.facebook.aura.localbrowser.LocalBrowserHeaderPolicy r0 = r0.headerPolicy     // Catch: java.lang.Exception -> L81
            r0.attach(r5)     // Catch: java.lang.Exception -> L81
            r3.install(r9, r5)     // Catch: java.lang.Exception -> L81
            return r5
        L81:
            r3 = move-exception
            X.3UX r2 = r8.reaper
            r1 = 0
            com.facebook.aura.localbrowser.LocalBrowserRuntime$createTaskEngine$2 r0 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$createTaskEngine$2
            r0.<init>(r5, r1)
            X.AnonymousClass001.A1J(r0, r2)
            throw r3
        L8e:
            r2 = 0
            java.lang.String r1 = "engine_unavailable"
            java.lang.String r0 = "engine_create"
            com.facebook.aura.localbrowser.LocalBrowserEndpointFailure r0 = X.C3cI.A0F(r1, r2, r0)
            throw r0
        L98:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.createTaskEngine(android.content.Context, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadEngine(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.localbrowser.LocalBrowserRuntime.C124441
            if (r0 == 0) goto L50
            r4 = r6
            com.facebook.aura.localbrowser.LocalBrowserRuntime$downloadEngine$1 r4 = (com.facebook.aura.localbrowser.LocalBrowserRuntime.C124441) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L56
            X.Hwg.A00(r3)
        L20:
            boolean r0 = X.AnonymousClass001.A1X(r3)
            if (r0 == 0) goto L2f
            boolean r0 = r5.cleared
            if (r0 != 0) goto L2f
            com.facebook.aura.nodes.HatchNodeClient$Companion r0 = com.facebook.aura.nodes.HatchNodeClient.Companion
            X.C4JM.A01(r5, r0)
        L2f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L32:
            X.Hwg.A00(r3)
            com.facebook.aura.localbrowser.LocalBrowserEngineModule r0 = r5.engineModule
            boolean r0 = r0.getNeedsDownload()
            if (r0 == 0) goto L2f
            com.facebook.aura.localbrowser.LocalBrowserEngineModule r0 = r5.engineModule
            boolean r0 = r0.isObtainable()
            if (r0 == 0) goto L2f
            r4.label = r1
            java.lang.String r0 = "startup_job"
            java.lang.Object r3 = r5.loadEngine(r0, r4)
            if (r3 != r2) goto L20
            return r2
        L50:
            com.facebook.aura.localbrowser.LocalBrowserRuntime$downloadEngine$1 r4 = new com.facebook.aura.localbrowser.LocalBrowserRuntime$downloadEngine$1
            r4.<init>(r6)
            goto L12
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserRuntime.downloadEngine(X.HtJ):java.lang.Object");
    }

    public final C1BN<Map<String, LocalBrowserSession>> getActiveSessions() {
        return this.activeSessions;
    }

    public final boolean getAdvertisesBrowser() {
        return this.advertisesBrowser;
    }

    public final boolean getAwaitsEngineDownload() {
        return this.engineModule.getNeedsDownload() && !AuraAppLifecycleManager.INSTANCE.isAppInForeground();
    }

    public final int getCapacity() {
        return AnonymousClass001.A0F(this.capacity$delegate.getValue());
    }

    public final LocalBrowserDeviceConditions getDeviceConditions() {
        return this.deviceConditions;
    }

    public final LocalBrowserEndpoint getEndpoint() {
        return this.endpoint;
    }

    public final String getEngineUnavailableState() {
        if (!this.engineModule.isObtainable()) {
            return "not_obtainable";
        }
        if (this.engineUnavailable.get()) {
            return "withdrawn";
        }
        return null;
    }

    public final boolean getHasStandaloneSession() {
        Collection<SessionSlot> collectionValues = this.ownedSessions.values();
        if (collectionValues == null || !collectionValues.isEmpty()) {
            Iterator<SessionSlot> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next().task == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final InterfaceC2261BLa getLifecycle() {
        return this.lifecycle;
    }

    public final C1BN<Boolean> getRecoveringEndpoint() {
        return this.recoveringEndpoint;
    }

    public final LocalBrowserResourceUsage getResourceUsage() {
        return this.resourceUsage;
    }

    public final boolean isEnabled() {
        return !this.cleared && this.enabled && C3cH.A1R(LocalBrowserPreferences.Companion.getInstance(this.userSession).browserEnabled) && BrowserEngineAvailability.INSTANCE.isSupported();
    }

    public final void setAdvertisesBrowser(boolean z) {
        this.advertisesBrowser = z;
    }

    public final void setBrowserEnabled(final boolean z) {
        this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LocalBrowserRuntime.setBrowserEnabled$lambda$0(z, this);
            }
        });
    }

    public LocalBrowserRuntime(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.capacity$delegate = AbstractC5321DgF.A03(new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(LocalBrowserCapacity.INSTANCE.read(C4JM.A00));
            }
        });
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.engineModule = new LocalBrowserEngineModule(abstractC3358CGz);
        this.engineUnavailable = new AtomicBoolean(false);
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.pendingWakes = keySetViewNewKeySet;
        this.enabled = true;
        this.activityHosts = C3cG.A0h();
        this.ownedSessions = C3cG.A0j();
        C9286GCn c9286GCnA01 = HnJ.A01(AGH.A0E());
        this.mutableSessions = c9286GCnA01;
        this.activeSessions = C3cG.A11(c9286GCnA01);
        this.closedSessions = C3cG.A0j();
        this.closeAttempts = C3cG.A0j();
        C8eO c8eO = new C8eO(null);
        this.cleanupJob = c8eO;
        GBK gbk = AuraDispatchers.mainImmediate;
        C78T c78tA02 = C78W.A02(c8eO, gbk);
        C78p c78p = CoroutineExceptionHandler.Key;
        HzC hzCA0y = C3cH.A0y(c78tA02, new LocalBrowserRuntime$special$$inlined$CoroutineExceptionHandler$1(c78p, this));
        this.reaper = hzCA0y;
        this.resourceUsage = new LocalBrowserResourceUsage(hzCA0y);
        this.vmTaskHold = new LocalBrowserVmTaskHold(abstractC3358CGz);
        this.pendingTaskHold = new LocalBrowserPendingTaskHold(abstractC3358CGz);
        this.lifecycle = new C9258GBl();
        this.endpoint = new LocalBrowserEndpoint(this, abstractC3358CGz);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this.mutableRecoveringEndpoint = c9286GCnA0v;
        this.recoveringEndpoint = C3cG.A11(c9286GCnA0v);
        this.recoveredTasks = C3cG.A0j();
        this.deviceConditions = new LocalBrowserDeviceConditions(new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserRuntime$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserRuntime.deviceConditions$lambda$0(this.f$0);
            }
        });
        HzC hzCA0y2 = C3cH.A0y(C78W.A02(new C8eO(null), gbk), new LocalBrowserRuntime$special$$inlined$CoroutineExceptionHandler$2(c78p));
        this.serviceScope = hzCA0y2;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, hzCA0y2);
        GAo.A02(num, c6ys, new AnonymousClass2(null), hzCA0y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkMainThread() {
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
    }

    public static final void offerActivity$lambda$0(LocalBrowserRuntime localBrowserRuntime, WeakReference weakReference) {
        localBrowserRuntime.checkMainThread();
        localBrowserRuntime.activityHosts.remove(weakReference);
    }

    private final void postWakePrompt(String str) {
        Context contextA06 = C3cG.A06();
        String strLocalBrowserTaskUri = str != null ? LocalBrowserBackgroundWorkKt.localBrowserTaskUri(str) : null;
        BackgroundWorkDoneNotifier.INSTANCE.postPrompt(contextA06.getString(R.string._name_removed__res_0x7f1201c8), contextA06.getString(R.string._name_removed__res_0x7f120cab), strLocalBrowserTaskUri, 30000L);
        if (strLocalBrowserTaskUri != null) {
            AnonymousClass001.A1J(new C124501(str, strLocalBrowserTaskUri, null), this.serviceScope);
        }
    }

    private final void retireProfile() {
        checkMainThread();
        LocalBrowserProfile localBrowserProfile = this.profile;
        this.profile = null;
        if (localBrowserProfile != null) {
            LocalBrowserProfiles.INSTANCE.forget(((CH0) this.userSession).A01, localBrowserProfile.name);
            localBrowserProfile.retire();
        }
    }

    public final LocalBrowserCloseAttempt beginClose(LocalBrowserSession localBrowserSession, String str, long j, PageCloseRequest pageCloseRequest) {
        HxE<String, String> key;
        LocalBrowserCloseAttempt localBrowserCloseAttemptBeginClose;
        Map.Entry<HxE<String, String>, LocalBrowserCloseAttempt> next;
        AnonymousClass003.A0u(localBrowserSession, str);
        checkMainThread();
        LocalBrowserCloseAttempt localBrowserCloseAttemptCloseAttempt = closeAttempt(localBrowserSession.id, str);
        if (localBrowserCloseAttemptCloseAttempt != null) {
            return localBrowserCloseAttemptCloseAttempt;
        }
        LinkedHashMap<HxE<String, String>, LocalBrowserCloseAttempt> linkedHashMap = this.closeAttempts;
        if (linkedHashMap.size() >= 8) {
            Set<Map.Entry<HxE<String, String>, LocalBrowserCloseAttempt>> setEntrySet = linkedHashMap.entrySet();
            C7384Etj.A0U(setEntrySet);
            Iterator<Map.Entry<HxE<String, String>, LocalBrowserCloseAttempt>> it = setEntrySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue().getCanEvict()) {
                    break;
                }
            }
            Map.Entry<HxE<String, String>, LocalBrowserCloseAttempt> entry = next;
            if (entry == null || (key = entry.getKey()) == null) {
                return null;
            }
        } else {
            key = null;
        }
        LocalBrowserConnection localBrowserConnection = localBrowserSession.connection;
        if (localBrowserConnection == null || (localBrowserCloseAttemptBeginClose = localBrowserConnection.beginClose(str, j, pageCloseRequest)) == null) {
            return null;
        }
        if (key != null) {
            this.closeAttempts.remove(key);
        }
        this.closeAttempts.put(C3cG.A0r(localBrowserSession.id, str), localBrowserCloseAttemptBeginClose);
        AnonymousClass001.A1J(new AnonymousClass3(localBrowserCloseAttemptBeginClose, null), this.reaper);
        return localBrowserCloseAttemptBeginClose;
    }

    public final LocalBrowserCloseAttempt closeAttempt(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        checkMainThread();
        return this.closeAttempts.get(C3cG.A0r(str, str2));
    }

    public final boolean isEngineUnavailable() {
        return AnonymousClass002.A1X(getEngineUnavailableState());
    }

    public final void onStartableRegistration() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (PendingWake pendingWake : AbstractC0878AGe.A0X(this.pendingWakes)) {
            if (this.pendingWakes.remove(pendingWake)) {
                LocalBrowserRuntimeKt.logLocalBrowserWake(pendingWake.browserTaskId, "registered", null, Long.valueOf(jElapsedRealtime - pendingWake.receivedAtMs));
            }
        }
    }

    public final Object openSession(Context context, long j, LocalBrowserTask localBrowserTask, HtJ<? super LocalBrowserRuntimeResult> htJ) {
        String strA0k = AnonymousClass002.A0k();
        return LocalBrowserTelemetry.INSTANCE.operation("session_open", strA0k, localBrowserTask != null ? localBrowserTask.id : null, new C124462(localBrowserTask, strA0k, context, j, null), htJ);
    }

    public final void wakeForTask(String str, String str2) {
        String strWakeIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (str2 != null && !AnonymousClass001.A0u(str2).equals(AuraDeviceId.INSTANCE.getNodeId())) {
            strWakeIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser = "other_device";
        } else if (this.cleared || !isEnabled()) {
            strWakeIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser = "disabled";
        } else if (AuraAppLifecycleManager.INSTANCE.isAppInForeground()) {
            strWakeIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser = "app_foreground";
        } else {
            LocalBrowserCapabilities localBrowserCapabilities = LocalBrowserCapabilities.INSTANCE;
            AuraAppContext auraAppContext = AuraAppContext.INSTANCE;
            strWakeIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser = localBrowserCapabilities.wakeIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(auraAppContext.requireContext());
            if (strWakeIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser == null) {
                BackgroundWorkContentClaim backgroundWorkContentClaimClaim = BackgroundWork.INSTANCE.claim(this.userSession, LocalBrowserBackgroundWorkKt.localBrowserBackgroundWorkContent(str, null, null, null, null, false, true));
                String str3 = C3cH.A1R(HatchNodeServiceState.isForeground) ? "service_running" : HatchForegroundService.Companion.startForBrowserWake(auraAppContext.requireContext()) ? "started" : "start_refused";
                LocalBrowserRuntimeKt.logLocalBrowserWake(str, str3, null, null);
                if (str3.equals("start_refused")) {
                    backgroundWorkContentClaimClaim.release();
                    postWakePrompt(str);
                    return;
                } else {
                    PendingWake pendingWake = new PendingWake(str, jElapsedRealtime);
                    this.pendingWakes.add(pendingWake);
                    AnonymousClass001.A1J(new C124531(pendingWake, str, backgroundWorkContentClaimClaim, null), this.serviceScope);
                    return;
                }
            }
        }
        LocalBrowserRuntimeKt.logLocalBrowserWake(str, "skipped", strWakeIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser, null);
    }

    public /* synthetic */ LocalBrowserRuntime(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
