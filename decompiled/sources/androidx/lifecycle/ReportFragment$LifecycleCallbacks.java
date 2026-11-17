package androidx.lifecycle;

import X.C7384Etj;
import X.EnumC3085Bxl;
import X.FragmentC3090Bxy;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes5.dex */
public final class ReportFragment$LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static final void registerIn(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        activity.registerActivityLifecycleCallbacks(new ReportFragment$LifecycleCallbacks());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        C7384Etj.A0Y(activity, 0);
        FragmentC3090Bxy.A01(activity, EnumC3085Bxl.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        FragmentC3090Bxy.A01(activity, EnumC3085Bxl.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        FragmentC3090Bxy.A01(activity, EnumC3085Bxl.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        FragmentC3090Bxy.A01(activity, EnumC3085Bxl.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        FragmentC3090Bxy.A01(activity, EnumC3085Bxl.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        FragmentC3090Bxy.A01(activity, EnumC3085Bxl.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
