package com.facebook.primitive.video;

import X.AbstractC8571FgQ;
import X.AbstractC8601Fh5;
import X.BV8;
import X.C3cG;
import X.C7384Etj;
import X.FKF;
import X.FRB;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class ViewOwnerTracker extends AbstractC8601Fh5 implements Application.ActivityLifecycleCallbacks {
    public final Fragment A00;
    public final Activity A01;
    public final FKF A02;

    public static final ViewOwnerTracker A00(View view, FKF fkf) {
        ContextWrapper contextWrapper;
        try {
            Fragment fragmentA01 = AbstractC8571FgQ.A01(view);
            if (fragmentA01 != null) {
                return new ViewOwnerTracker(null, fragmentA01, fkf);
            }
            throw BV8.A0m(" does not have a Fragment set", C3cG.A0f(view, "View "));
        } catch (IllegalStateException unused) {
            Context context = view.getContext();
            if (context != null) {
                while (true) {
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity != null) {
                            return new ViewOwnerTracker(activity, null, fkf);
                        }
                    } else if (!(context instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) context) == null || (context = contextWrapper.getBaseContext()) == null) {
                        break;
                    }
                }
            }
            return null;
        }
    }

    @Override // X.AbstractC8601Fh5
    public final void A01(Fragment fragment, AbstractC8571FgQ abstractC8571FgQ) {
        C7384Etj.A0Y(fragment, 1);
        if (fragment.equals(this.A00)) {
            A02();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        if (activity.equals(this.A01)) {
            A02();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        activity.equals(this.A01);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        activity.equals(this.A01);
    }

    public final void A02() {
        Application application;
        AbstractC8571FgQ parentFragmentManager;
        Fragment fragment = this.A00;
        if (fragment != null && (parentFragmentManager = fragment.getParentFragmentManager()) != null) {
            parentFragmentManager.A0o(this);
        }
        Activity activity = this.A01;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public ViewOwnerTracker(Activity activity, Fragment fragment, FKF fkf) {
        Application application;
        AbstractC8571FgQ parentFragmentManager;
        this.A00 = fragment;
        this.A01 = activity;
        this.A02 = fkf;
        if (fragment != null && (parentFragmentManager = fragment.getParentFragmentManager()) != null) {
            parentFragmentManager.A0T.A00.add(new FRB(this));
        }
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
