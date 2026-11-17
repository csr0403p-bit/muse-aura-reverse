package X;

import X.C3094By7;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.By7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3094By7 {
    public final WeakReference<Context> A00;
    public final List<Runnable> A01 = C3cG.A0h();
    public final Application.ActivityLifecycleCallbacks A02;
    public volatile boolean A03;

    public final void A00() {
        int i;
        Runnable[] runnableArr;
        List<Runnable> list = this.A01;
        synchronized (list) {
            this.A03 = true;
        }
        Context context = this.A00.get();
        if (context != null) {
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.A02);
        }
        synchronized (list) {
            runnableArr = (Runnable[]) list.toArray(new Runnable[0]);
        }
        for (Runnable runnable : runnableArr) {
            runnable.run();
        }
        synchronized (list) {
            list.removeAll(Arrays.asList(runnableArr));
        }
    }

    public final void A01(Runnable runnable) {
        if (runnable != null) {
            List<Runnable> list = this.A01;
            synchronized (list) {
                if (!this.A03) {
                    list.add(runnable);
                    runnable = null;
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C3094By7(Context context) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.instagram.common.bloks.BloksSubscriptionsManager$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                C3094By7 c3094By7 = this.A00;
                if (activity == c3094By7.A00.get()) {
                    c3094By7.A00();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }
        };
        this.A02 = activityLifecycleCallbacks;
        Context baseContext = context;
        while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof Activity) && !(baseContext instanceof Application) && !(baseContext instanceof Service)) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        this.A00 = BV4.A0q(baseContext);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
