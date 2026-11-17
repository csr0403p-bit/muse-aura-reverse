package X;

import X.C3412CLd;
import X.C7384Etj;
import X.CLc;
import X.DAQ;
import X.DAW;
import X.DAe;
import X.DK9;
import X.InterfaceC4878DAv;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.aura.startup.AuraStartupMetricTracker;
import com.facebook.aura.startup.AuraStartupMetricTracker$startupActivityHelper$1;
import com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneCallback$1;
import com.facebook.aura.startup.AuraStartupMetricTracker$startupDoneStrategyPicker$1;
import com.facebook.debug.tracer.Tracer;
import com.facebook.perf.background.BackgroundStartupDetector;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class DAW<ColdInfo> {
    public static final String BACKGROUNDING_METHOD = "backgroundingMethod";
    public static final String BACK_BUTTON_SOURCE = "backButtonSource";
    public static final String EARLY_NAV_CANCEL = "earlyNavCancel";
    public static final String EARLY_NAV_CANCEL_RUN = "earlyNavCancelRun";
    public static final String NAV_DESTINATION_TAG = "navDestination";
    public static final String SURFACE_POINT = "surface_marked";
    public static final String TAG = "StartupMetricTracker";
    public WeakReference<Activity> activityForSurfaceReference;
    public final boolean attributeCancelReasonToTentativeOutcome;
    public DAu doneStrategy;
    public boolean firstForeground;
    public boolean hasFinalTentativeSurface;
    public final boolean logActivityStack;
    public int priorStartType;
    public String startSurface;
    public final boolean synchronizeNavCancels;
    public String tentativeSurface;
    public boolean wasStartCompletedWithTentativeSurface;
    public boolean wasStartedImmediate;
    public boolean wereDexesGenerated;
    public int status = -1;
    public int lastBackgroundCount = -1;
    public long lastNavigationEventTime = -1;
    public final AtomicInteger startCount = BV4.A13(-1);
    public final AtomicBoolean trackingBackgroundStart = new AtomicBoolean();
    public volatile long lastActivityPaused = -1;
    public volatile long lastActivityLifecycleReturnTime = -1;
    public final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks(this) { // from class: com.meta.common.startup.instrumentation.StartupMetricTracker$activityLifecycleCallbacks$1
        public final /* synthetic */ DAW<ColdInfo> A00;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C7384Etj.A0Y(activity, 0);
            DAW<ColdInfo> daw = this.A00;
            daw.maybeStartWarmStart(activity, null);
            daw.onLifecycleEvent(1, activity);
            daw.captureTentativeSurface(activity, 1);
            BackgroundStartupDetector.abandonedActivityStartListener = new DAQ(daw);
            daw.lastActivityLifecycleReturnTime = DK9.A00(daw);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C7384Etj.A0Y(activity, 0);
            this.A00.onLifecycleEvent(2, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C7384Etj.A0Y(activity, 0);
            DAW<ColdInfo> daw = this.A00;
            daw.lastActivityPaused = DK9.A00(daw);
            daw.onLifecycleEvent(6, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreCreated(Activity activity, Bundle bundle) {
            C7384Etj.A0Y(activity, 0);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPreResumed(Activity activity) {
            C7384Etj.A0Y(activity, 0);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C7384Etj.A0Y(activity, 0);
            DAW<ColdInfo> daw = this.A00;
            AuraStartupMetricTracker auraStartupMetricTracker = (AuraStartupMetricTracker) daw;
            daw.onLifecycleEvent(5, activity);
            daw.captureTentativeSurface(activity, 5);
            daw.maybeSetDoneStrategyForActivityResume(activity);
            if (DAe.A0A.A04 != 1) {
                long j = daw.lastActivityPaused;
                InterfaceC4878DAv interfaceC4878DAv = auraStartupMetricTracker.startupMarker$1;
                long jNow = j != -1 ? auraStartupMetricTracker.monotonicClock$1.now() - j : -1L;
                CLc cLc = ((C3412CLd) interfaceC4878DAv).A00.get();
                if (cLc != null) {
                    cLc.A01.markerAnnotate(cLc.A00, "sinceLastPause", jNow);
                }
            }
            auraStartupMetricTracker.startupDoneStrategyPicker.onActivityResumed(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C7384Etj.A0Y(activity, 0);
            BackgroundStartupDetector.abandonedActivityStartListener = null;
            DAW<ColdInfo> daw = this.A00;
            daw.maybeStartHotStart(activity);
            daw.onLifecycleEvent(3, activity);
            daw.captureTentativeSurface(activity, 3);
            daw.lastActivityLifecycleReturnTime = ((AuraStartupMetricTracker) daw).monotonicClock$1.now();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C7384Etj.A0Y(activity, 0);
            DAW<ColdInfo> daw = this.A00;
            daw.onLifecycleEvent(4, activity);
            if (BackgroundStartupDetector.isBackgroundedNotYetResumed) {
                ((AuraStartupMetricTracker) daw).startupMarker$1.AQF(DAW.BACKGROUNDING_METHOD, "bgStop");
                daw.cancelStart("backgrounded");
            }
        }

        {
            this.A00 = this;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    };

    private final void applyTentativeDoneStrategyOutcome(String str, Long l, Short sh) {
        DAt dAt;
        DAt dAt2;
        if (isTrackingStart()) {
            if (this.doneStrategy == null) {
                AuraStartupMetricTracker auraStartupMetricTracker = (AuraStartupMetricTracker) this;
                CLc cLc = ((C3412CLd) auraStartupMetricTracker.startupMarker$1).A00.get();
                if (cLc != null) {
                    cLc.A01.markerAnnotate(cLc.A00, "strategyChosenWithTentativeSurface", true);
                }
                setDoneStrategy(((AuraStartupMetricTracker$startupDoneStrategyPicker$1) auraStartupMetricTracker.startupDoneStrategyPicker).foregroundStartupDoneStrategy, "tentative", str, l, sh != null ? sh.shortValue() : (short) 4);
                if (!isTrackingStart()) {
                    return;
                }
            }
            if (l == null || str == null || sh == null) {
                DAu dAu = this.doneStrategy;
                if (dAu == null) {
                    return;
                }
                DAZ daz = (DAZ) dAu;
                synchronized (daz.A03) {
                    dAt = daz.A00;
                }
                if (dAt != null && !dAt.A04) {
                    daz.A02().AMN().endStart(dAt.A03, dAt.A02, dAt.A00, FGI.A0M("StartupDoneStrategy|", daz.getName()), dAt.A01);
                }
            } else {
                DAu dAu2 = this.doneStrategy;
                if (dAu2 == null) {
                    return;
                }
                long jLongValue = l.longValue();
                short sShortValue = sh.shortValue();
                DAZ daz2 = (DAZ) dAu2;
                synchronized (daz2.A03) {
                    dAt2 = daz2.A00;
                }
                if (dAt2 != null) {
                    daz2.A02().AMN().endStart(sShortValue, str, jLongValue, FGI.A0M("StartupDoneStrategy|", daz2.getName()), dAt2.A01);
                }
            }
        }
    }

    public static /* synthetic */ void getPriorStartType$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeSetDoneStrategyForActivityResume(Activity activity) {
        DB0 db0;
        if (getCurrentMarker() == 0 || activity == null) {
            return;
        }
        AuraStartupMetricTracker auraStartupMetricTracker = (AuraStartupMetricTracker) this;
        synchronized (this) {
            if (this.doneStrategy == null && (db0 = ((AuraStartupMetricTracker$startupDoneStrategyPicker$1) auraStartupMetricTracker.startupDoneStrategyPicker).foregroundStartupDoneStrategy) != null) {
                setDoneStrategy(db0, "resume", null, null, (short) 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void maybeStartHotStart(Activity activity) {
        Tracer.A01("StartupMetricTracker.maybeStartHotStart");
        try {
            if (!isTrackingStart() && isTrackableStart()) {
                CFK.A0H(TAG, "Begin HOT start%s", DAe.A01() ? " (FFHS)" : "");
                long jA00 = DK9.A00(this);
                onAppStartBegin(3, jA00);
                getAsyncRecorder().onTrackHotStart(activity, jA00);
                syncBackgroundCount();
                this.firstForeground = DAe.A01();
            }
        } finally {
            Tracer.A00();
        }
    }

    private final void onAppStartBegin(int i, long j) {
        this.status = i;
        boolean zA01 = DAe.A01();
        DAe dAe = DAe.A0A;
        DAe.A0A = new DAe(dAe.A07, dAe.A01, dAe.A00, dAe.A03, dAe.A02, dAe.A08, i, i, j, zA01);
        this.startCount.incrementAndGet();
        int markerForTemperature = getMarkerForTemperature(i);
        if (i != 1) {
            ((AuraStartupMetricTracker) this).startupMarker$1.A9w(markerForTemperature);
        }
        scheduleStartupTimeoutRunnable(new DAR(this));
        ((AuraStartupMetricTracker) this).startupDoneStrategyPicker.onAppStartBegin(markerForTemperature, i);
    }

    private final void reset() {
        ((AuraStartupMetricTracker) this).startupMarker$1.A8z();
        this.startSurface = null;
        this.tentativeSurface = null;
        this.activityForSurfaceReference = null;
        this.hasFinalTentativeSurface = false;
        this.firstForeground = false;
        this.doneStrategy = null;
        this.lastActivityLifecycleReturnTime = -1L;
        cancelStartupTimeoutRunnable();
    }

    private final void setDoneStrategy(DAu dAu, String str, String str2, Long l, short s) {
        String name = dAu.getName();
        CFK.A0H(TAG, "doneStrategy (via %s) = %s", str, name);
        this.doneStrategy = dAu;
        DAe.A0A.A00 = name;
        AuraStartupMetricTracker auraStartupMetricTracker = (AuraStartupMetricTracker) this;
        auraStartupMetricTracker.startupMarker$1.AQF("doneStrategy", name);
        if (str2 == null || l == null) {
            auraStartupMetricTracker.startupDoneStrategyPicker.setStrategyPicked(dAu);
        } else {
            auraStartupMetricTracker.startupDoneStrategyPicker.setStrategyPicked(dAu, str2, l.longValue(), s);
        }
    }

    public final synchronized void cancelStart(String str) {
        C7384Etj.A0Y(str, 0);
        cancelStart(str, DK9.A00(this), null);
    }

    public abstract void cancelStartupTimeoutRunnable();

    public void captureActivityForSurfaceReference(Activity activity, int i) {
        C7384Etj.A0Y(activity, 0);
        this.activityForSurfaceReference = BV4.A0q(activity);
    }

    public abstract DBJ<ColdInfo> getAsyncRecorder();

    public abstract ExecutorService getBackgroundExecutorService();

    public abstract int getCurrentMarker();

    public abstract int getMarkerForTemperature(int i);

    public abstract DK9 getMonotonicClock();

    public abstract DBE getStartupActivityHelper();

    public abstract DAY getStartupDoneStrategyPicker();

    public abstract CCX getStartupListener();

    public abstract InterfaceC4878DAv getStartupMarker();

    public abstract String getTentativeSurfaceFallback(Activity activity);

    public abstract boolean isSplashScreenCurrentlyRecreatingActivity();

    public final void maybeStartWarmStart(Activity activity) {
        maybeStartWarmStart(activity, null);
    }

    public final void navCancelStartAsync(String str) {
        C7384Etj.A0Y(str, 0);
        int i = this.startCount.get();
        AuraStartupMetricTracker auraStartupMetricTracker = (AuraStartupMetricTracker) this;
        auraStartupMetricTracker.startupMarker$1.markerPoint(EARLY_NAV_CANCEL);
        if (this.synchronizeNavCancels) {
            handleCancel(str, i);
        } else {
            auraStartupMetricTracker.backgroundExecutorService.execute(new RunnableC4877DAr(this, str, i));
        }
    }

    public final void onActivityFinished(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        onLifecycleEvent(7, activity);
    }

    public final void onBackPressedBackgrounding(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        onLifecycleEvent(8, activity);
        cancelStart("back_button_backgrounding");
    }

    public final void onBackgroundStartupDetectorInstalled(Application application, Function0<Unit> function0) {
        C7384Etj.A0Y(application, 0);
        BackgroundStartupDetector.Companion.A04(new C4874DAa(application, this, function0));
        if (BackgroundStartupDetector.backgroundStartupDetector == null) {
            throw BV4.A0S();
        }
        application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
    }

    public abstract void onBeginBackgroundStart();

    public abstract void onEndBackgroundStart();

    public final void onIntentLaunched(String str) {
        C7384Etj.A0Y(str, 0);
        int currentMarker = getCurrentMarker();
        if (currentMarker != 0) {
            getAsyncRecorder().onIntentLaunched(currentMarker, DK9.A00(this), str);
        }
    }

    public final synchronized void onNavigationForDestination(String str, String str2) {
        DAu dAu;
        C7384Etj.A0Y(str2, 1);
        if (isTrackingStart() && str != null) {
            long jA00 = DK9.A00(this);
            String str3 = this.startSurface;
            if (str3 == null) {
                setStartSurface(str, str2);
            } else if (!str3.equals(str) && (dAu = this.doneStrategy) != null && (dAu instanceof DB0)) {
                ((AuraStartupMetricTracker$startupDoneCallback$1) ((DB0) dAu).A04.AMN()).this$0.navCancelStartAsync(str);
            }
            this.lastNavigationEventTime = jA00;
        }
    }

    public abstract void scheduleStartupTimeoutRunnable(Runnable runnable);

    public final synchronized void startColdStart(Application application, boolean z, boolean z2, ColdInfo coldinfo) {
        C7384Etj.A0Y(application, 0);
        Tracer.A01("StartupMetricTracker.startColdStart");
        try {
            this.wereDexesGenerated = z2;
            CFK.A06(TAG, "Waiting for foreground/background determination...");
            onBackgroundStartupDetectorInstalled(application, new DAs(this, z, coldinfo));
        } finally {
            Tracer.A00();
        }
    }

    public final synchronized void startColdStartImmediate(Application application, boolean z, boolean z2, ColdInfo coldinfo) {
        Tracer.A01("StartupMetricTracker.startColdStartImmediate");
        try {
            this.wasStartedImmediate = true;
            this.wereDexesGenerated = z2;
            CFK.A06(TAG, "Begin UNKNOWN COLD start");
            trackColdStart(z, coldinfo);
        } finally {
            Tracer.A00();
        }
    }

    public abstract long timeSinceAppLaunchMs();

    public final void trackWarmStartImmediate(String str, Long l) {
        C7384Etj.A0Y(str, 0);
        maybeStartWarmStart(null, l);
    }

    public static /* synthetic */ void applyTentativeDoneStrategyOutcome$default(DAW daw, String str, Long l, Short sh, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: applyTentativeDoneStrategyOutcome");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            sh = null;
        }
        daw.applyTentativeDoneStrategyOutcome(str, l, sh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginBackgroundStart() {
        this.trackingBackgroundStart.set(true);
    }

    public static /* synthetic */ void cancelStart$default(DAW daw, String str, long j, String str2, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: cancelStart");
        }
        if ((i & 2) != 0) {
            j = DK9.A00(daw);
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        daw.cancelStart(str, j, str2);
    }

    public static /* synthetic */ void endStart$default(DAW daw, short s, String str, long j, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: endStart");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            j = DK9.A00(daw);
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        daw.endStart(s, str, j, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void handleCancel(String str, int i) {
        if (isTrackingStart() && i == this.startCount.get()) {
            AuraStartupMetricTracker auraStartupMetricTracker = (AuraStartupMetricTracker) this;
            auraStartupMetricTracker.startupMarker$1.markerPoint(EARLY_NAV_CANCEL_RUN);
            auraStartupMetricTracker.startupMarker$1.AQF(NAV_DESTINATION_TAG, str);
            cancelStart(FGI.A0M("nav:", str));
        }
    }

    private final boolean isTrackableStart() {
        return AnonymousClass002.A1P(this.lastBackgroundCount, BackgroundStartupDetector.backgroundedCount);
    }

    private final boolean isTrackingStart() {
        int i = this.status;
        return i == 1 || i == 2 || i == 3;
    }

    public static /* synthetic */ void maybeStartWarmStart$default(DAW daw, Activity activity, Long l, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: maybeStartWarmStart");
        }
        if ((i & 2) != 0) {
            l = null;
        }
        daw.maybeStartWarmStart(activity, l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onBackgroundStartupDetectorInstalled$default(DAW daw, Application application, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: onBackgroundStartupDetectorInstalled");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        daw.onBackgroundStartupDetectorInstalled(application, function0);
    }

    public static /* synthetic */ void setDoneStrategy$default(DAW daw, DAu dAu, String str, String str2, Long l, short s, int i, Object obj) {
        if (obj != null) {
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: setDoneStrategy");
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            s = 4;
        }
        daw.setDoneStrategy(dAu, str, str2, l, s);
    }

    private final void syncBackgroundCount() {
        this.lastBackgroundCount = BackgroundStartupDetector.backgroundedCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackColdStart(boolean z, ColdInfo coldinfo) {
        long jA01 = z ? CCR.A01() : CCR.A00();
        onAppStartBegin(1, jA01);
        getAsyncRecorder().onTrackColdStart(jA01, coldinfo, this.wasStartedImmediate);
        this.lastBackgroundCount = 0;
        if (BackgroundStartupDetector.backgroundedCount > 0) {
            ((AuraStartupMetricTracker) this).startupMarker$1.AQF(BACKGROUNDING_METHOD, "backgroundedWhileStarting");
            cancelStart("backgrounded");
        }
    }

    public final boolean endBackgroundStart() {
        if (!this.trackingBackgroundStart.getAndSet(false)) {
            return false;
        }
        onEndBackgroundStart();
        ((AuraStartupMetricTracker) this).startupDoneStrategyPicker.onBackgroundStartComplete();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4 A[Catch: all -> 0x0160, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001e, B:9:0x0025, B:31:0x0092, B:32:0x009a, B:33:0x009f, B:35:0x00a4, B:36:0x00aa, B:38:0x00b0, B:40:0x00b4, B:41:0x00b8, B:48:0x00cd, B:51:0x00dc, B:52:0x00df, B:55:0x00e8, B:56:0x00eb, B:58:0x00f5, B:59:0x00fd, B:67:0x0156, B:68:0x0158, B:64:0x014e, B:66:0x0153, B:28:0x007e, B:30:0x0089), top: B:75:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[Catch: all -> 0x0160, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001e, B:9:0x0025, B:31:0x0092, B:32:0x009a, B:33:0x009f, B:35:0x00a4, B:36:0x00aa, B:38:0x00b0, B:40:0x00b4, B:41:0x00b8, B:48:0x00cd, B:51:0x00dc, B:52:0x00df, B:55:0x00e8, B:56:0x00eb, B:58:0x00f5, B:59:0x00fd, B:67:0x0156, B:68:0x0158, B:64:0x014e, B:66:0x0153, B:28:0x007e, B:30:0x0089), top: B:75:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc A[Catch: all -> 0x0160, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001e, B:9:0x0025, B:31:0x0092, B:32:0x009a, B:33:0x009f, B:35:0x00a4, B:36:0x00aa, B:38:0x00b0, B:40:0x00b4, B:41:0x00b8, B:48:0x00cd, B:51:0x00dc, B:52:0x00df, B:55:0x00e8, B:56:0x00eb, B:58:0x00f5, B:59:0x00fd, B:67:0x0156, B:68:0x0158, B:64:0x014e, B:66:0x0153, B:28:0x007e, B:30:0x0089), top: B:75:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5 A[Catch: all -> 0x0160, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001e, B:9:0x0025, B:31:0x0092, B:32:0x009a, B:33:0x009f, B:35:0x00a4, B:36:0x00aa, B:38:0x00b0, B:40:0x00b4, B:41:0x00b8, B:48:0x00cd, B:51:0x00dc, B:52:0x00df, B:55:0x00e8, B:56:0x00eb, B:58:0x00f5, B:59:0x00fd, B:67:0x0156, B:68:0x0158, B:64:0x014e, B:66:0x0153, B:28:0x007e, B:30:0x0089), top: B:75:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void endStart(short r25, java.lang.String r26, long r27, java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAW.endStart(short, java.lang.String, long, java.lang.String, java.lang.String):void");
    }

    public final WeakReference<Activity> getActivityForSurfaceReference() {
        return this.activityForSurfaceReference;
    }

    public final Application.ActivityLifecycleCallbacks getActivityLifecycleCallbacks() {
        return this.activityLifecycleCallbacks;
    }

    public boolean getAttributeCancelReasonToTentativeOutcome() {
        return this.attributeCancelReasonToTentativeOutcome;
    }

    public final long getLastActivityLifecycleReturnTime() {
        return this.lastActivityLifecycleReturnTime;
    }

    public boolean getLogActivityStack() {
        return this.logActivityStack;
    }

    public final String getStartSurface() {
        return this.startSurface;
    }

    public boolean getSynchronizeNavCancels() {
        return this.synchronizeNavCancels;
    }

    public final String getTentativeSurface() {
        return this.tentativeSurface;
    }

    public final boolean getWasStartCompletedWithTentativeSurface() {
        return this.wasStartCompletedWithTentativeSurface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void captureTentativeSurface(Activity activity, int i) {
        String surfaceFromActivity;
        String str;
        if (getCurrentMarker() == 0 || activity == null) {
            return;
        }
        getAsyncRecorder();
        AuraStartupMetricTracker auraStartupMetricTracker = (AuraStartupMetricTracker) this;
        synchronized (this) {
            if (!this.hasFinalTentativeSurface) {
                captureActivityForSurfaceReference(activity, i);
                if (this.logActivityStack) {
                    surfaceFromActivity = ((AuraStartupMetricTracker$startupActivityHelper$1) auraStartupMetricTracker.startupActivityHelper).getSurfaceFromActivity(activity);
                    this.tentativeSurface = surfaceFromActivity;
                } else {
                    surfaceFromActivity = auraStartupMetricTracker.startupActivityHelper.getSurfaceFromActivity(activity);
                    this.tentativeSurface = surfaceFromActivity;
                }
                DAe.A0A.A03 = surfaceFromActivity;
                switch (i) {
                    case 1:
                        str = "ON_CREATE";
                        break;
                    case 2:
                        str = "ON_DESTROY";
                        break;
                    case 3:
                        str = "ON_START";
                        break;
                    case 4:
                        str = "ON_STOP";
                        break;
                    case 5:
                        str = "ON_RESUME";
                        break;
                    case 6:
                        str = "ON_PAUSE";
                        break;
                    case 7:
                        str = "ON_FINISH";
                        break;
                    case 8:
                        str = "ON_BACK";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                CFK.A0H(TAG, "Surface (tentative, via activity %s) = %s (%s)", str, this.tentativeSurface, C60Q.A0e(activity));
                if (i == 5) {
                    this.hasFinalTentativeSurface = true;
                }
            }
        }
    }

    private final void logBeginStartForAI(int i, long j) {
        C60R.A0k("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(new Date(System.currentTimeMillis() - (SystemClock.uptimeMillis() - j)));
    }

    private final void logEndStartForAI(String str, long j, String str2, String str3) {
        C60R.A0k("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(new Date(System.currentTimeMillis() - (SystemClock.uptimeMillis() - j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLifecycleEvent(int i, Activity activity) {
        int currentMarker = getCurrentMarker();
        if (currentMarker == 0 || activity == null) {
            return;
        }
        getAsyncRecorder().onLifecycleEvent(currentMarker, ((AuraStartupMetricTracker) this).monotonicClock$1.now(), i, activity);
    }

    public final long getTimeNow() {
        return DK9.A00(this);
    }

    public void installLifecycleEventObserver(Activity activity) {
    }

    public void onAnyActivityPreCreated(Activity activity) {
    }

    public void onAnyActivityPreResumed(Activity activity) {
    }

    public void onAnyActivityResumed(Activity activity) {
    }

    public final void onBackPressedNav(Activity activity, String str) {
        AnonymousClass003.A0u(activity, str);
        onLifecycleEvent(8, activity);
        ((AuraStartupMetricTracker) this).startupMarker$1.AQF(BACK_BUTTON_SOURCE, str);
        cancelStart("back_button_nav");
    }

    public final void setActivityForSurfaceReference(WeakReference<Activity> weakReference) {
        this.activityForSurfaceReference = weakReference;
    }

    public final void setLastActivityLifecycleReturnTime(long j) {
        this.lastActivityLifecycleReturnTime = j;
    }

    public final void setStartSurface(String str) {
        this.startSurface = str;
    }

    public final void setTentativeSurface(String str) {
        this.tentativeSurface = str;
    }

    public final void setWasStartCompletedWithTentativeSurface(boolean z) {
        this.wasStartCompletedWithTentativeSurface = z;
    }

    public final synchronized void cancelStart(String str, long j, String str2) {
        C7384Etj.A0Y(str, 0);
        Tracer.A01("StartupMetricTracker.cancelStart");
        try {
            if (this.attributeCancelReasonToTentativeOutcome) {
                applyTentativeDoneStrategyOutcome(str, Long.valueOf(j), (short) 4);
            } else {
                applyTentativeDoneStrategyOutcome(null, null, null);
            }
            endStart((short) 4, str, j, null, str2);
        } finally {
            Tracer.A00();
        }
    }

    public final synchronized void maybeStartWarmStart(Activity activity, Long l) {
        String str;
        long jA00;
        Tracer.A01("StartupMetricTracker.maybeStartWarmStart");
        try {
            boolean zEndBackgroundStart = endBackgroundStart();
            if (!isTrackingStart() && isTrackableStart()) {
                if (DAe.A01()) {
                    str = " (FFWS)";
                } else {
                    str = "";
                }
                CFK.A0H(TAG, "Begin WARM start%s", str);
                if (l == null) {
                    jA00 = DK9.A00(this);
                } else {
                    jA00 = l.longValue();
                }
                onAppStartBegin(2, jA00);
                getAsyncRecorder().onTrackWarmStart(activity, jA00, timeSinceAppLaunchMs(), zEndBackgroundStart);
                syncBackgroundCount();
                this.firstForeground = DAe.A01();
            }
        } finally {
            Tracer.A00();
        }
    }

    public void navCancelStartAsync(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        navCancelStartAsync(str);
    }

    public synchronized void setStartSurface(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.startSurface = str;
        DAe.A0A.A02 = str;
        AuraStartupMetricTracker auraStartupMetricTracker = (AuraStartupMetricTracker) this;
        CLc cLc = ((C3412CLd) auraStartupMetricTracker.startupMarker$1).A00.get();
        if (cLc != null) {
            cLc.A01.markerPoint(cLc.A00, SURFACE_POINT, str);
        }
        auraStartupMetricTracker.startupDoneStrategyPicker.onInitialNavigation(str);
        if (this.doneStrategy == null) {
            setDoneStrategy(((AuraStartupMetricTracker$startupDoneStrategyPicker$1) auraStartupMetricTracker.startupDoneStrategyPicker).foregroundStartupDoneStrategy, str2, null, null, (short) 4);
        }
    }
}
