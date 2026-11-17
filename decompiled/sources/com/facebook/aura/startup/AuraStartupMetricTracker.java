package com.facebook.aura.startup;

import X.AbstractC07127nr;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3UX;
import X.C3cI;
import X.C4881DBa;
import X.C7384Etj;
import X.C7520Ez2;
import X.C78T;
import X.CCR;
import X.CCX;
import X.DAV;
import X.DAW;
import X.DAY;
import X.DAe;
import X.DB3;
import X.DB6;
import X.DBA;
import X.DBB;
import X.DBE;
import X.DBJ;
import X.DK9;
import X.EnumC10460Hji;
import X.F0C;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC4878DAv;
import X.InterfaceC7539F0o;
import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmOutcome;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.HatchStartupTracker;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.qpl.startup.signal.PointSignalResult;
import com.facebook.aura.settings.AgentResetLogging;
import com.facebook.aura.startup.readiness.BackgroundReadyState;
import com.facebook.common.classmarkers.ClassMarkerLoader;
import com.facebook.perf.background.BackgroundStartupDetector;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraStartupMetricTracker extends DAW<Unit> {
    public static final Companion Companion = new Companion();
    public static final long STARTUP_TIMEOUT_SECONDS = 60;
    public static final String TAG = "AuraStartupMetricTracker";
    public static final AuraStartupMetricTracker instance;
    public static final DK9 monotonicClock;
    public static final CCX startupListener;
    public static final InterfaceC4878DAv startupMarker;
    public final F0C asyncRecorder$delegate;
    public final DB3 backgroundCompleteSignalFactory;
    public final ExecutorService backgroundExecutorService;
    public final AuraStartupMetricTracker$gatewayConnectSignalFactory$1 gatewayConnectSignalFactory;
    public String lastSurface;
    public boolean logsClientCvmStartup;
    public final DK9 monotonicClock$1;
    public final C4881DBa<String, String> pointsWatchingSignalFactory;
    public final DBE startupActivityHelper;
    public final DBB startupDoneCallback;
    public final DAY startupDoneStrategyPicker;
    public final CCX startupListener$1;
    public final InterfaceC4878DAv startupMarker$1;
    public WeakReference<Runnable> startupTimeoutRunnable;

    @DebugMetadata(c = "com.facebook.aura.startup.AuraStartupMetricTracker$1", f = "AuraStartupMetricTracker.kt", l = {123}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.AuraStartupMetricTracker$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraStartupMetricTracker.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraStartupMetricTracker.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BackgroundReadyState backgroundReadyState = BackgroundReadyState.INSTANCE;
                this.label = 1;
                if (backgroundReadyState.awaitReady(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AuraStartupMetricTracker auraStartupMetricTracker = AuraStartupMetricTracker.this;
            Companion companion = AuraStartupMetricTracker.Companion;
            auraStartupMetricTracker.endBackgroundStart();
            return Unit.INSTANCE;
        }
    }

    public final class Companion {
        public final AuraStartupMetricTracker getInstance() {
            return AuraStartupMetricTracker.instance;
        }

        public final DK9 getMonotonicClock() {
            return AuraStartupMetricTracker.monotonicClock;
        }

        public final CCX getStartupListener() {
            return AuraStartupMetricTracker.startupListener;
        }

        public final InterfaceC4878DAv getStartupMarker() {
            return AuraStartupMetricTracker.startupMarker;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        /* renamed from: com.facebook.aura.startup.AuraStartupMetricTracker$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                C7384Etj.A0Y(str, 0);
                AuraStartupMetricTracker auraStartupMetricTracker = AuraStartupMetricTracker.instance;
                auraStartupMetricTracker.endStart((short) 4, str, auraStartupMetricTracker.monotonicClock$1.now(), null, null);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.startup.AuraStartupMetricTracker$createPointWatchingSignalFactory$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<String, String, String> {
        public final /* synthetic */ Map<String, String> $pointsPairs;

        @Override // X.G0V
        public final String invoke(String str, String str2) {
            PointSignalResult pointSignalResult;
            C7384Etj.A0Y(str, 0);
            if (this.$pointsPairs.values().contains(str) && (pointSignalResult = PointSignalResult.Companion.parse(str2)) != null && pointSignalResult.isFailure()) {
                return FGI.A0U(str, " failed. Reason: ", pointSignalResult.reason);
            }
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Map<String, String> map) {
            super(2);
            this.$pointsPairs = map;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.aura.startup.AuraStartupMetricTracker$gatewayConnectSignalFactory$1] */
    public AuraStartupMetricTracker(DK9 dk9, InterfaceC4878DAv interfaceC4878DAv, CCX ccx, ExecutorService executorService) {
        C7384Etj.A0Y(dk9, 0);
        AnonymousClass005.A11(interfaceC4878DAv, ccx, executorService, 1);
        this.monotonicClock$1 = dk9;
        this.startupMarker$1 = interfaceC4878DAv;
        this.startupListener$1 = ccx;
        this.backgroundExecutorService = executorService;
        this.backgroundCompleteSignalFactory = new DB3();
        AnonymousClass001.A1J(new AnonymousClass1(null), C78T.A01(AuraDispatchers.INSTANCE.m764default(), null));
        this.startupDoneCallback = new AuraStartupMetricTracker$startupDoneCallback$1(this);
        this.pointsWatchingSignalFactory = createPointWatchingSignalFactory(false, HatchStartupPoints.Pairs.pointsPairs);
        this.gatewayConnectSignalFactory = new DB6() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$gatewayConnectSignalFactory$1
            public final String name = "SessionAwareGateway";

            @Override // X.DB6
            public String getName() {
                return this.name;
            }

            @Override // X.DB6
            public DBA install(G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0) {
                AnonymousClass003.A0u(g0u, g0u2);
                final AuraStartupMetricTracker$gatewayConnectSignalFactory$1$install$listenerWrapper$1 auraStartupMetricTracker$gatewayConnectSignalFactory$1$install$listenerWrapper$1 = new AuraStartupMetricTracker$gatewayConnectSignalFactory$1$install$listenerWrapper$1(g0u2, g0u);
                HatchStartupQpl.startupQpl.addPointListener(auraStartupMetricTracker$gatewayConnectSignalFactory$1$install$listenerWrapper$1);
                HatchGatewayStartupRequirement.INSTANCE.begin(AuraSessionManager.state.getValue());
                return new DBA() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$gatewayConnectSignalFactory$1$install$1
                    @Override // X.DBA
                    public void uninstall() {
                        HatchStartupQpl.startupQpl.removePointListener(auraStartupMetricTracker$gatewayConnectSignalFactory$1$install$listenerWrapper$1);
                        HatchGatewayStartupRequirement.INSTANCE.stopTracking();
                    }

                    @Override // X.DBA
                    public void onActivityResumed(Activity activity) {
                    }

                    public /* bridge */ void onInitialNavigation(String str) {
                    }
                };
            }
        };
        this.startupDoneStrategyPicker = new AuraStartupMetricTracker$startupDoneStrategyPicker$1(this);
        this.asyncRecorder$delegate = AbstractC5321DgF.A03(AuraStartupMetricTracker$asyncRecorder$2.INSTANCE);
        this.startupActivityHelper = new AuraStartupMetricTracker$startupActivityHelper$1(this);
        this.logsClientCvmStartup = true;
    }

    @Override // X.DAW
    public int getMarkerForTemperature(int i) {
        if (i == -1 || i == 1) {
            return 734857510;
        }
        if (i != 2) {
            return i != 3 ? 0 : 734859171;
        }
        return 734861351;
    }

    @Override // X.DAW
    public void onBeginBackgroundStart() {
    }

    @Override // X.DAW
    public void scheduleStartupTimeoutRunnable(Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        this.startupTimeoutRunnable = BV4.A0q(runnable);
        F0C.A00().postDelayed(runnable, 60000L);
    }

    public final void startColdStartImmediate(Application application, boolean z) {
        boolean z2;
        C7384Etj.A0Y(application, 0);
        this.logsClientCvmStartup = z;
        try {
            CCR.A01();
            z2 = true;
        } catch (NoSuchMethodError unused) {
            z2 = false;
        }
        startColdStartImmediate(application, z2, false, null);
    }

    static {
        DAV dav = HatchStartupQpl.startupQpl.startupMarker;
        C7384Etj.A0Z(dav, "null cannot be cast to non-null type com.meta.common.startup.instrumentation.marker.control.StartupMarkerControl");
        InterfaceC4878DAv interfaceC4878DAv = (InterfaceC4878DAv) dav;
        startupMarker = interfaceC4878DAv;
        C7520Ez2 c7520Ez2 = new C7520Ez2(new InterfaceC7539F0o() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$Companion$monotonicClock$1
            @Override // X.InterfaceC7539F0o
            public final long now() {
                return SystemClock.uptimeMillis();
            }
        });
        monotonicClock = c7520Ez2;
        CCX ccx = new CCX() { // from class: com.facebook.aura.startup.AuraStartupMetricTracker$Companion$startupListener$1
            public void onAppStartEnd(int i, String str, short s) throws ClassNotFoundException {
                if (i == 1) {
                    ClassMarkerLoader.loadIsColdStartRunMarker();
                }
            }

            public /* bridge */ void onAppStartBegin(int i) {
            }
        };
        startupListener = ccx;
        instance = new AuraStartupMetricTracker(c7520Ez2, interfaceC4878DAv, ccx, (ExecutorService) AuraExecutors.backgroundThreadExecutor$delegate.getValue());
        HatchStartupTracker.INSTANCE.installCancelHandler(Companion.AnonymousClass1.INSTANCE);
    }

    private final C4881DBa<String, String> createPointWatchingSignalFactory(boolean z, Map<String, String> map) {
        return new C4881DBa<>(map, C139921.INSTANCE, new AnonymousClass2(map), z);
    }

    public static /* synthetic */ void startColdStartImmediate$default(AuraStartupMetricTracker auraStartupMetricTracker, Application application, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        auraStartupMetricTracker.startColdStartImmediate(application, z);
    }

    @Override // X.DAW
    public void cancelStartupTimeoutRunnable() {
        Runnable runnable;
        WeakReference<Runnable> weakReference = this.startupTimeoutRunnable;
        if (weakReference != null && (runnable = weakReference.get()) != null) {
            F0C.A00().removeCallbacks(runnable);
        }
        this.startupTimeoutRunnable = null;
    }

    @Override // X.DAW
    public DBJ<Unit> getAsyncRecorder() {
        return (DBJ) this.asyncRecorder$delegate.getValue();
    }

    @Override // X.DAW
    public ExecutorService getBackgroundExecutorService() {
        return this.backgroundExecutorService;
    }

    @Override // X.DAW
    public int getCurrentMarker() {
        return getMarkerForTemperature(DAe.A0A.A04);
    }

    @Override // X.DAW
    public DK9 getMonotonicClock() {
        return this.monotonicClock$1;
    }

    @Override // X.DAW
    public DBE getStartupActivityHelper() {
        return this.startupActivityHelper;
    }

    @Override // X.DAW
    public DAY getStartupDoneStrategyPicker() {
        return this.startupDoneStrategyPicker;
    }

    @Override // X.DAW
    public CCX getStartupListener() {
        return this.startupListener$1;
    }

    @Override // X.DAW
    public InterfaceC4878DAv getStartupMarker() {
        return this.startupMarker$1;
    }

    @Override // X.DAW
    public String getTentativeSurfaceFallback(Activity activity) {
        return FGI.A0M("unknown_", activity != null ? C3cI.A0Y(activity) : AgentResetLogging.NO_ACTIVITY);
    }

    @Override // X.DAW
    public boolean isSplashScreenCurrentlyRecreatingActivity() {
        return false;
    }

    @Override // X.DAW
    public void onEndBackgroundStart() {
        G0U<? super String, Unit> g0u = this.backgroundCompleteSignalFactory.A00;
        if (g0u != null) {
            g0u.invoke("OnBackgroundComplete");
        }
        BackgroundStartupDetector.backgroundedCount++;
    }

    public final void onNavigationEvent(String str) {
        this.lastSurface = str;
        if (str != null) {
            onNavigationForDestination(str, "");
        }
    }

    @Override // X.DAW
    public long timeSinceAppLaunchMs() {
        return this.monotonicClock$1.now() - CCR.A00();
    }

    @Override // X.DAW
    public void endStart(short s, String str, long j, String str2, String str3) {
        HatchClientCvmEventLogger hatchClientCvmEventLogger;
        HatchClientCvmOutcome hatchClientCvmOutcome;
        if (DAe.A02()) {
            if (this.logsClientCvmStartup) {
                if (s == 2) {
                    hatchClientCvmEventLogger = HatchClientCvmEventLogger.INSTANCE;
                    hatchClientCvmOutcome = HatchClientCvmOutcome.SUCCESS;
                } else {
                    if (s == 3) {
                        hatchClientCvmEventLogger = HatchClientCvmEventLogger.INSTANCE;
                        hatchClientCvmOutcome = HatchClientCvmOutcome.FAILURE;
                    }
                    if (s == 4) {
                        HatchStartupQpl.Companion.markerAnnotate("cancel_reason", str);
                    }
                }
                hatchClientCvmEventLogger.logAppStartup(hatchClientCvmOutcome);
            } else if (s == 4 && str != null) {
                HatchStartupQpl.Companion.markerAnnotate("cancel_reason", str);
            }
        }
        super.endStart(s, str, j, str2, str3);
    }

    /* renamed from: com.facebook.aura.startup.AuraStartupMetricTracker$createPointWatchingSignalFactory$1, reason: invalid class name and case insensitive filesystem */
    public final class C139921 extends AbstractC7559F3s implements G0U<G0V<? super String, ? super String, ? extends Unit>, Function0<? extends Unit>> {
        public static final C139921 INSTANCE = new C139921();

        /* renamed from: com.facebook.aura.startup.AuraStartupMetricTracker$createPointWatchingSignalFactory$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03871 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ G0V<String, String, Unit> $listenerWrapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03871(G0V<? super String, ? super String, Unit> g0v) {
                super(0);
                this.$listenerWrapper = g0v;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HatchStartupQpl.startupQpl.removePointListener(this.$listenerWrapper);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        public C139921() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Function0<Unit> invoke2(G0V<? super String, ? super String, Unit> g0v) {
            C7384Etj.A0Y(g0v, 0);
            AuraStartupMetricTracker$createPointWatchingSignalFactory$1$listenerWrapper$1 auraStartupMetricTracker$createPointWatchingSignalFactory$1$listenerWrapper$1 = new AuraStartupMetricTracker$createPointWatchingSignalFactory$1$listenerWrapper$1(g0v);
            HatchStartupQpl.startupQpl.addPointListener(auraStartupMetricTracker$createPointWatchingSignalFactory$1$listenerWrapper$1);
            return new C03871(auraStartupMetricTracker$createPointWatchingSignalFactory$1$listenerWrapper$1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Function0<? extends Unit> invoke(G0V<? super String, ? super String, ? extends Unit> g0v) {
            return invoke2((G0V<? super String, ? super String, Unit>) g0v);
        }
    }

    public /* synthetic */ AuraStartupMetricTracker(DK9 dk9, InterfaceC4878DAv interfaceC4878DAv, CCX ccx, ExecutorService executorService, int i, C06H c06h) {
        this(dk9, interfaceC4878DAv, ccx, (i & 8) != 0 ? (ExecutorService) AuraExecutors.backgroundThreadExecutor$delegate.getValue() : executorService);
    }
}
