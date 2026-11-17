package com.bloks.foa.screen.tracker;

import X.BV4;
import X.C3cG;
import X.C7384Etj;
import X.EnumC8596Fgy;
import X.G0U;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class ActivityLifecycleTracker implements Application.ActivityLifecycleCallbacks {
    public boolean A00;
    public final Activity A01;
    public final List<WeakReference<Activity>> A02 = C3cG.A0h();
    public final G0U<EnumC8596Fgy, Unit> A03;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C7384Etj.A0Y(activity, 0);
        List<WeakReference<Activity>> list = this.A02;
        if (list.isEmpty()) {
            this.A03.invoke(EnumC8596Fgy.A04);
        }
        list.add(BV4.A0q(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        Activity activity2 = this.A01;
        if (activity2.equals(activity)) {
            if (this.A00) {
                this.A00 = false;
                Application application = activity2.getApplication();
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(this);
                }
                this.A02.clear();
                return;
            }
            return;
        }
        List<WeakReference<Activity>> list = this.A02;
        if (list.isEmpty()) {
            return;
        }
        Iterator<WeakReference<Activity>> it = list.iterator();
        while (it.hasNext()) {
            Activity activity3 = it.next().get();
            if (activity3 == null || activity3.equals(activity)) {
                it.remove();
            }
        }
        if (list.isEmpty()) {
            this.A03.invoke(EnumC8596Fgy.A02);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        if (this.A01.equals(activity)) {
            this.A03.invoke(EnumC8596Fgy.A03);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        if (activity.equals(this.A01)) {
            List<WeakReference<Activity>> list = this.A02;
            if (list.isEmpty()) {
                return;
            }
            int taskId = activity.getTaskId();
            Iterator<WeakReference<Activity>> it = list.iterator();
            while (it.hasNext()) {
                Activity activity2 = it.next().get();
                if (activity2 == null || activity2.getTaskId() != taskId) {
                    it.remove();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityLifecycleTracker(Activity activity, G0U<? super EnumC8596Fgy, Unit> g0u) {
        this.A01 = activity;
        this.A03 = g0u;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
