package com.facebook.perf.background;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.CFK;
import X.CIK;
import X.CIN;
import X.CIP;
import X.CIQ;
import X.CIR;
import X.CIS;
import X.DAQ;
import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes5.dex */
public final class BackgroundStartupDetector {
    public static final int ACTIVITY_CREATE_QUEUE_DRAINED = 49182;
    public static final int ACTIVITY_REDIRECT_LAUNCH_TIMEOUT_MS = 200;
    public static final int COLDSTART_QUEUE_DRAINED = 49181;
    public static volatile int _coldStartMode = 0;
    public static volatile CIR abandonedActivityStartListener = null;
    public static volatile BackgroundStartupDetector backgroundStartupDetector = null;
    public static volatile String backgroundStateReason = "UNKNOWN";
    public static volatile int backgroundedCount = 0;
    public static volatile boolean deferredColdStartQueueDrainIdleHandlerStrategy = false;
    public static volatile boolean deferredColdStartQueueDrainPost = false;
    public static boolean isActivityStackStart = false;
    public static CIS isBackgroundListener = null;
    public static volatile Boolean isBackgroundState = null;
    public static volatile boolean isBackgroundedNotYetResumed = true;
    public static volatile int lastActivityStoppedCount;
    public static CIQ reliabilityListener;
    public static volatile boolean skipManualActivityOnCreate;
    public static String tag;
    public final boolean _skipBgOnActivityRecreate;
    public int activitiesStartedSinceLastColdStartQueueDrain;
    public boolean activityIsRecreating;
    public final BackgroundStartupDetector$activityLifecycleCallbacks$1 activityLifecycleCallbacks;
    public boolean activityQueueAlreadyDrained;
    public int activityResumeCount;
    public int activityStartCount;
    public boolean anyActivityCreated;
    public volatile boolean anyActivityInstantiated;
    public final int coldStartQueueDrainMessageCount;
    public final CIN handler;
    public boolean isColdStartQueueDrained;
    public int sentMessageCount;
    public boolean wasInconclusiveColdStart;
    public static final CIK Companion = new CIK();
    public static final CopyOnWriteArraySet<CIQ> listeners = new CopyOnWriteArraySet<>();
    public static ArrayList<CIP> getColdStartModeCallbacks = C3cG.A0h();

    public static final void addListener(CIQ ciq) {
        C7384Etj.A0Y(ciq, 0);
        listeners.add(ciq);
        ciq.ASH();
    }

    public static final void onActivityCreated(Activity activity) {
        BackgroundStartupDetector backgroundStartupDetector2;
        C7384Etj.A0Y(activity, 0);
        if (skipManualActivityOnCreate || (backgroundStartupDetector2 = backgroundStartupDetector) == null) {
            return;
        }
        backgroundStartupDetector2.activityLifecycleCallbacks.onActivityCreated(activity, null);
    }

    public static final void onBeforeActivityInstantiated(String str) {
        C7384Etj.A0Y(str, 0);
        BackgroundStartupDetector backgroundStartupDetector2 = backgroundStartupDetector;
        if (backgroundStartupDetector2 != null) {
            backgroundStartupDetector2.anyActivityInstantiated = true;
            backgroundStartupDetector2.activityCreateInternal(str);
        }
    }

    public static final void removeListener(CIQ ciq) {
        C7384Etj.A0Y(ciq, 0);
        listeners.remove(ciq);
    }

    public static final void resetReliabilityListener() {
        reliabilityListener = null;
    }

    public static final void setIsBackgroundListener(CIS cis) {
        C7384Etj.A0Y(cis, 0);
        isBackgroundListener = cis;
        throw BV4.A0a("onIsBackgroundChange");
    }

    public static final /* synthetic */ CIS access$isBackgroundListener$cp() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void activityCreateInternal(String str) {
        boolean z = this.anyActivityCreated;
        this.activityIsRecreating = false;
        if (!z) {
            this.anyActivityCreated = true;
            if (!this.isColdStartQueueDrained) {
                Companion.A03(4);
            }
        }
        if (this.activityStartCount == 0) {
            backgroundStateReason = "FIRST_ACTIVITY_CREATED";
            CIK.A01(false);
            this.activityQueueAlreadyDrained = false;
            this.handler.removeMessages(ACTIVITY_CREATE_QUEUE_DRAINED);
            this.handler.sendEmptyMessage(ACTIVITY_CREATE_QUEUE_DRAINED);
        }
    }

    public static final int getActivityRedirectLaunchTimeoutMsForTest() {
        return 200;
    }

    public static final boolean getAnyActivityInstantiated() {
        BackgroundStartupDetector backgroundStartupDetector2 = backgroundStartupDetector;
        if (backgroundStartupDetector2 != null) {
            return backgroundStartupDetector2.anyActivityInstantiated;
        }
        return false;
    }

    public static final String getBackgroundStateReason() {
        return backgroundStateReason;
    }

    public static final int getBackgroundedCount() {
        return backgroundedCount;
    }

    public static final void getColdStartMode(CIP cip) {
        Companion.A04(cip);
    }

    public static final int getLastActivityStoppedCount() {
        return lastActivityStoppedCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActivityCreateQueueDrained() {
        if (!this.activityQueueAlreadyDrained) {
            this.activityQueueAlreadyDrained = true;
            CIN cin = this.handler;
            cin.sendMessageDelayed(Message.obtain(cin, ACTIVITY_CREATE_QUEUE_DRAINED), 200L);
        } else if (this.activityStartCount == 0 && this.activityResumeCount == 0 && !this.activityIsRecreating) {
            CFK.A06(tag, "ActivityCreateQueue drained. Activity likely self-finished or redirected to another process.");
            backgroundStateReason = "ABANDONED_ACTIVITY_START";
            CIK.A01(true);
            backgroundedCount++;
            CIR cir = abandonedActivityStartListener;
            if (cir != null) {
                ((DAQ) cir).A00.cancelStart("abandonedActivityStart");
                abandonedActivityStartListener = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleColdStartQueueDrained() {
        if (this.sentMessageCount < this.coldStartQueueDrainMessageCount && !this.anyActivityCreated) {
            this.handler.sendEmptyMessage(COLDSTART_QUEUE_DRAINED);
            this.sentMessageCount++;
            return;
        }
        if (!this.isColdStartQueueDrained) {
            this.isColdStartQueueDrained = true;
            isActivityStackStart = C8j4.A1V(this.activitiesStartedSinceLastColdStartQueueDrain, 1);
            this.activitiesStartedSinceLastColdStartQueueDrain = 0;
        }
        if (!this.anyActivityCreated) {
            Companion.A03(this.wasInconclusiveColdStart ? 2 : 1);
            backgroundStateReason = "COLD_START_QUEUE_DRAINED_NO_ACTIVITY";
            CIK.A01(true);
        } else {
            if (this.activityResumeCount > 0) {
                Companion.A03(this.wasInconclusiveColdStart ? 4 : 3);
                return;
            }
            this.anyActivityCreated = false;
            this.wasInconclusiveColdStart = true;
            CIN cin = this.handler;
            cin.sendMessageDelayed(Message.obtain(cin, COLDSTART_QUEUE_DRAINED), 200L);
        }
    }

    public static final void initializeForTest(BackgroundStartupDetector backgroundStartupDetector2) {
        backgroundStartupDetector = backgroundStartupDetector2;
        _coldStartMode = 0;
        backgroundedCount = 0;
        synchronized (BackgroundStartupDetector.class) {
            getColdStartModeCallbacks = C3cG.A0h();
        }
        listeners.clear();
    }

    public static final BackgroundStartupDetector installFromApplicationOnCreate(Application application) {
        CIK cik = Companion;
        C7384Etj.A0Y(application, 0);
        return cik.A02(application, false, false, false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isActivityRecreating(Activity activity) {
        if (this.activityIsRecreating) {
            return true;
        }
        return this._skipBgOnActivityRecreate && activity.isChangingConfigurations();
    }

    public static final boolean isActivityStackStart() {
        return isActivityStackStart;
    }

    public static final Boolean isBackgroundState() {
        return isBackgroundState;
    }

    public static final boolean isBackgroundedNotYetResumed() {
        return isBackgroundedNotYetResumed;
    }

    public static final boolean isColdStartWindowOpen() {
        if (backgroundStartupDetector != null) {
            return !r0.isColdStartQueueDrained;
        }
        return false;
    }

    public static final boolean isInstalled() {
        return AnonymousClass002.A1X(backgroundStartupDetector);
    }

    public static final void onApplicationCreate() {
        BackgroundStartupDetector backgroundStartupDetector2 = backgroundStartupDetector;
        if (backgroundStartupDetector2 == null || !deferredColdStartQueueDrainPost) {
            return;
        }
        deferredColdStartQueueDrainPost = false;
        CIK.A00(backgroundStartupDetector2, deferredColdStartQueueDrainIdleHandlerStrategy);
    }

    public static final void resolveFromApplicationStartInfo(Boolean bool) {
        BackgroundStartupDetector backgroundStartupDetector2;
        CIK cik = Companion;
        if (bool == null || (backgroundStartupDetector2 = backgroundStartupDetector) == null) {
            return;
        }
        backgroundStartupDetector2.handler.removeMessages(COLDSTART_QUEUE_DRAINED);
        backgroundStartupDetector2.isColdStartQueueDrained = true;
        deferredColdStartQueueDrainPost = false;
        backgroundedCount = 0;
        boolean zBooleanValue = bool.booleanValue();
        cik.A03(zBooleanValue ? 3 : 1);
        if (zBooleanValue) {
            return;
        }
        backgroundStateReason = "APP_START_INFO_BACKGROUND";
        CIK.A01(true);
    }

    public static final void setActivityIsRecreating() {
        BackgroundStartupDetector backgroundStartupDetector2 = backgroundStartupDetector;
        if (backgroundStartupDetector2 != null) {
            backgroundStartupDetector2.activityIsRecreating = true;
        }
    }

    public static final synchronized void setReliabilityListener(CIQ ciq) {
        synchronized (Companion) {
            C7384Etj.A0Y(ciq, 0);
            if (reliabilityListener != null) {
                throw C8j3.A18("Only one reliability listener is supported at this time.");
            }
            reliabilityListener = ciq;
            ciq.ASH();
        }
    }

    public static final boolean wasForegroundColdStart() {
        int i = _coldStartMode;
        return i == 3 || i == 4;
    }

    public static final boolean isBackground() {
        return AnonymousClass001.A0i().equals(isBackgroundState);
    }

    public static final void setAbandonedActivityStartListener(CIR cir) {
        abandonedActivityStartListener = cir;
    }

    public /* synthetic */ BackgroundStartupDetector(Looper looper, int i, boolean z, C06H c06h) {
        this(looper, i, z);
    }

    public BackgroundStartupDetector(Looper looper, int i, boolean z) {
        this.coldStartQueueDrainMessageCount = i;
        this._skipBgOnActivityRecreate = z;
        this.sentMessageCount = 1;
        this.handler = new CIN(looper, this);
        this.activityLifecycleCallbacks = new BackgroundStartupDetector$activityLifecycleCallbacks$1(this);
    }

    public static final int getColdStartMode() {
        return _coldStartMode;
    }

    public static final BackgroundStartupDetector installFromApplicationOnCreate(Application application, boolean z, boolean z2) {
        CIK cik = Companion;
        C7384Etj.A0Y(application, 0);
        return cik.A02(application, z, z2, false, false, false);
    }

    public static final BackgroundStartupDetector installFromApplicationOnCreate(Application application, boolean z, boolean z2, boolean z3) {
        CIK cik = Companion;
        C7384Etj.A0Y(application, 0);
        return cik.A02(application, z, z2, z3, false, false);
    }

    public static final BackgroundStartupDetector installFromApplicationOnCreate(Application application, boolean z, boolean z2, boolean z3, boolean z4) {
        CIK cik = Companion;
        C7384Etj.A0Y(application, 0);
        return cik.A02(application, z, z2, z3, z4, false);
    }

    public static final BackgroundStartupDetector installFromApplicationOnCreate(Application application, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return Companion.A02(application, z, z2, z3, z4, z5);
    }

    public static final BackgroundStartupDetector installFromApplicationOnCreate(Application application, boolean z) {
        CIK cik = Companion;
        C7384Etj.A0Y(application, 0);
        return cik.A02(application, z, false, false, false, false);
    }
}
