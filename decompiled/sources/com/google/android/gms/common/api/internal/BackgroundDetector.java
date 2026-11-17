package com.google.android.gms.common.api.internal;

import X.C3cG;
import X.InterfaceC3559CTz;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final BackgroundDetector A04 = new BackgroundDetector();
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final AtomicBoolean A03 = new AtomicBoolean();
    public final ArrayList A01 = C3cG.A0h();
    public boolean A00 = false;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public static void A00(Application application) {
        BackgroundDetector backgroundDetector = A04;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.A00) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.A00 = true;
            }
        }
    }

    private final void A01(boolean z) {
        synchronized (A04) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((InterfaceC3559CTz) it.next()).ARv(z);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.A03;
        boolean zCompareAndSet = this.A02.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            A01(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.A03;
        boolean zCompareAndSet = this.A02.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            A01(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.A02.compareAndSet(false, true)) {
            this.A03.set(true);
            A01(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
