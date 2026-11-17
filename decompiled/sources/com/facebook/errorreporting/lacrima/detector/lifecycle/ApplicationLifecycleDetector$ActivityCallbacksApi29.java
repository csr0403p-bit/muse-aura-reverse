package com.facebook.errorreporting.lacrima.detector.lifecycle;

import X.C60Q;
import X.C75;
import X.C79;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.perf.background.BackgroundStartupDetector;

/* loaded from: classes5.dex */
public final class ApplicationLifecycleDetector$ActivityCallbacksApi29 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C75 A00;
    public final /* synthetic */ C75 A01;

    public ApplicationLifecycleDetector$ActivityCallbacksApi29(C75 c75) {
        this.A01 = c75;
        this.A00 = c75;
    }

    private final void A00(Activity activity, Integer num) {
        C75 c75 = this.A00;
        synchronized (c75.A0K) {
            if (num.equals(C79.A01)) {
                C75.A00(activity, c75);
                c75.A09.A01(C79.A0P, activity);
            }
            Intent intent = activity.getIntent();
            c75.A05(activity, num, intent == null ? "Null intent" : intent.toString(), activity.isFinishing());
        }
        synchronized (C75.A0S) {
        }
    }

    private final void A01(Activity activity, Integer num) {
        C75 c75 = this.A00;
        synchronized (c75.A0K) {
            if (num.equals(C79.A01)) {
                C75.A00(null, c75);
                c75.A09.A01(C79.A0Y, activity);
            }
            C75.A01(activity, c75, num);
        }
        if (c75.A0A == null || (!BackgroundStartupDetector.isBackground())) {
            return;
        }
        synchronized (C75.A0S) {
        }
    }

    private final void A02(Activity activity, Integer num) {
        C75 c75 = this.A00;
        synchronized (c75.A0K) {
            if (num.equals(C79.A01)) {
                C75.A00(null, c75);
                c75.A09.A01(C79.A0T, activity);
            }
            C75.A01(activity, c75, num);
        }
    }

    private final void A03(Activity activity, Integer num) {
        C75 c75 = this.A00;
        synchronized (c75.A0K) {
            if (num.equals(C79.A01)) {
                C75.A00(null, c75);
                c75.A09.A01(C79.A00, activity);
            }
            C75.A01(activity, c75, num);
        }
    }

    private final void A04(Activity activity, Integer num) {
        C75 c75 = this.A00;
        synchronized (c75.A0K) {
            if (num.equals(C79.A01)) {
                C75.A00(null, c75);
                c75.A09.A01(C79.A0C, activity);
            }
            C75.A01(activity, c75, num);
        }
    }

    private final void A05(Activity activity, Integer num) {
        C75 c75 = this.A00;
        synchronized (c75.A0K) {
            if (num.equals(C79.A01)) {
                C75.A00(null, c75);
                c75.A09.A01(C79.A0W, activity);
            }
            C75.A01(activity, c75, num);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A00(activity, C79.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A01(activity, C79.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A02(activity, C79.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A00(activity, C79.A0K);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A01(activity, C79.A0K);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A02(activity, C79.A0K);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A03(activity, C79.A0K);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A04(activity, C79.A0K);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A05(activity, C79.A0K);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A00(activity, C79.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A01(activity, C79.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A02(activity, C79.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A03(activity, C79.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A04(activity, C79.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A05(activity, C79.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A03(activity, C79.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A04(activity, C79.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (C60Q.A0e(activity).equals(null)) {
            return;
        }
        A05(activity, C79.A0C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
