package com.facebook.perf.background;

import X.C3cI;
import X.C7384Etj;
import X.CIK;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes5.dex */
public final class BackgroundStartupDetector$activityLifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ BackgroundStartupDetector A00;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C7384Etj.A0Y(activity, 0);
        this.A00.activityCreateInternal(C3cI.A0Y(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        BackgroundStartupDetector backgroundStartupDetector = this.A00;
        backgroundStartupDetector.activityResumeCount--;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        this.A00.activityResumeCount++;
        BackgroundStartupDetector.isBackgroundedNotYetResumed = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        BackgroundStartupDetector backgroundStartupDetector = this.A00;
        backgroundStartupDetector.activityStartCount++;
        backgroundStartupDetector.activitiesStartedSinceLastColdStartQueueDrain++;
        BackgroundStartupDetector.backgroundStateReason = "ACTIVITY_STARTED";
        CIK.A01(false);
        backgroundStartupDetector.handler.removeMessages(BackgroundStartupDetector.ACTIVITY_CREATE_QUEUE_DRAINED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        BackgroundStartupDetector backgroundStartupDetector = this.A00;
        boolean zIsActivityRecreating = backgroundStartupDetector.isActivityRecreating(activity);
        int i = backgroundStartupDetector.activityStartCount - 1;
        int i2 = backgroundStartupDetector.activityResumeCount;
        backgroundStartupDetector.activityStartCount = i;
        if (i == 0 && i2 == 0 && !zIsActivityRecreating) {
            BackgroundStartupDetector.backgroundedCount++;
            if (!zIsChangingConfigurations) {
                BackgroundStartupDetector.lastActivityStoppedCount++;
            }
            BackgroundStartupDetector.isBackgroundedNotYetResumed = true;
            BackgroundStartupDetector.backgroundStateReason = "LAST_ACTIVITY_STOPPED";
            CIK.A01(true);
        }
    }

    public BackgroundStartupDetector$activityLifecycleCallbacks$1(BackgroundStartupDetector backgroundStartupDetector) {
        this.A00 = backgroundStartupDetector;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
