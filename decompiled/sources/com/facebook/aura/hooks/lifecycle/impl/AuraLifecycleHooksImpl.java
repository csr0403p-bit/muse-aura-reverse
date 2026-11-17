package com.facebook.aura.hooks.lifecycle.impl;

import X.AnonymousClass003;
import X.C06H;
import X.C1HY;
import X.C3089Bxt;
import X.C3626Ca9;
import X.C60O;
import X.C7384Etj;
import X.Dg5;
import X.F0f;
import X.InterfaceC7359EnW;
import android.os.Handler;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.hooks.lifecycle.AuraLifecycleHooks;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class AuraLifecycleHooksImpl {
    public static final Companion Companion = new Companion();
    public static final long LONG_DELAY_MS = 5000;
    public final Handler handler = C60O.A02();

    /* renamed from: com.facebook.aura.hooks.lifecycle.impl.AuraLifecycleHooksImpl$init$1, reason: invalid class name */
    public final class AnonymousClass1 implements Dg5 {
        public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AnonymousClass1.class, "lifecycleHooks", "getLifecycleHooks()Lcom/facebook/aura/hooks/lifecycle/AuraLifecycleHooks;");
        public final C3626Ca9 lifecycleHooks$delegate = new C3626Ca9(new F0f(65542));

        @Override // X.Dg5
        public void onStart(C1HY c1hy) {
            C7384Etj.A0Y(c1hy, 0);
            getLifecycleHooks().onAppForegroundedOnUiThread();
            ((ExecutorService) AuraExecutors.backgroundThreadExecutor$delegate.getValue()).submit(new Runnable() { // from class: com.facebook.aura.hooks.lifecycle.impl.AuraLifecycleHooksImpl$init$1$onStart$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.getLifecycleHooks();
                    AuraAppLifecycleManager.INSTANCE.markAppInForegroundOnWorkerThread();
                }
            });
            AuraLifecycleHooksImpl.this.handler.removeCallbacksAndMessages(null);
        }

        @Override // X.Dg5
        public void onStop(C1HY c1hy) {
            C7384Etj.A0Y(c1hy, 0);
            getLifecycleHooks().onAppBackgroundedOnUiThreadShortDelay();
            AuraLifecycleHooksImpl.this.handler.postDelayed(new Runnable() { // from class: com.facebook.aura.hooks.lifecycle.impl.AuraLifecycleHooksImpl$init$1$onStop$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.getLifecycleHooks().onAppBackgroundedOnUiThreadLongDelay();
                }
            }, 5000L);
        }

        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AuraLifecycleHooks getLifecycleHooks() {
            return (AuraLifecycleHooks) this.lifecycleHooks$delegate.A00.AMN();
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
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void init() {
        C3089Bxt.A08.A05.A04(new AnonymousClass1());
    }
}
