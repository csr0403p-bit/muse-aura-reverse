package com.facebook.aura.startup.lifecycle;

import X.C1HY;
import X.C3089Bxt;
import X.Dg5;
import X.F0C;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;

/* loaded from: classes5.dex */
public final class AuraLifecycleObserver {
    public static final AuraLifecycleObserver INSTANCE = new AuraLifecycleObserver();

    public final void init() {
        C3089Bxt.A08.A05.A04(new Dg5() { // from class: com.facebook.aura.startup.lifecycle.AuraLifecycleObserver.init.1
            @Override // X.Dg5
            public void onStart(C1HY c1hy) {
                AuraAppLifecycleManager.INSTANCE.markAppInForegroundImmediate();
                F0C.A06(AuraExecutors.backgroundThreadExecutor$delegate).execute(new Runnable() { // from class: com.facebook.aura.startup.lifecycle.AuraLifecycleObserver$init$1$onStart$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuraAppLifecycleManager.INSTANCE.markAppInForegroundOnWorkerThread();
                    }
                });
            }

            @Override // X.Dg5
            public void onStop(C1HY c1hy) {
                AuraAppLifecycleManager.INSTANCE.markAppInBackground();
            }

            @Override // X.Dg5
            public /* bridge */ void onCreate(C1HY c1hy) {
            }

            @Override // X.Dg5
            public /* bridge */ void onDestroy(C1HY c1hy) {
            }

            @Override // X.Dg5
            public /* bridge */ void onPause(C1HY c1hy) {
            }

            @Override // X.Dg5
            public /* bridge */ void onResume(C1HY c1hy) {
            }
        });
    }
}
