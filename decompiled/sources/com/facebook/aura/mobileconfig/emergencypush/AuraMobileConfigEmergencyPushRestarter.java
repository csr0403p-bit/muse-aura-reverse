package com.facebook.aura.mobileconfig.emergencypush;

import X.AnonymousClass002;
import X.AnonymousClass007;
import X.C2997BrQ;
import X.C5V;
import X.C60O;
import X.C6U;
import X.C7384Etj;
import X.CFK;
import android.os.Handler;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class AuraMobileConfigEmergencyPushRestarter {
    public static final AuraMobileConfigEmergencyPushRestarter INSTANCE = new AuraMobileConfigEmergencyPushRestarter();

    public final void scheduleRestart(int i, Set<Integer> set) {
        C7384Etj.A0Y(set, 1);
        long jMax = Math.max(TimeUnit.SECONDS.toMillis(i), 30000L);
        CFK.A02(Long.valueOf(jMax), set, AuraMobileConfigEmergencyPushRestarterKt.TAG, "Scheduling emergency push restart in %dms for configs %s");
        String strA0a = AnonymousClass007.A0a("MobileConfig emergency push: ", set);
        Callable callable = new Callable() { // from class: com.facebook.aura.mobileconfig.emergencypush.AuraMobileConfigEmergencyPushRestarter.scheduleRestart.1
            @Override // java.util.concurrent.Callable
            public final Boolean call() {
                return Boolean.valueOf(AuraMobileConfigEmergencyPushRestarter.INSTANCE.isKillBlocked());
            }
        };
        AnonymousClass2 anonymousClass2 = new Runnable() { // from class: com.facebook.aura.mobileconfig.emergencypush.AuraMobileConfigEmergencyPushRestarter.scheduleRestart.2
            @Override // java.lang.Runnable
            public final void run() {
                CFK.A05(AuraMobileConfigEmergencyPushRestarterKt.TAG, "Exiting for emergency push restart");
            }
        };
        AnonymousClass002.A1B(callable, 2, anonymousClass2);
        Handler handlerA02 = C60O.A02();
        C6U c6u = new C6U(anonymousClass2, strA0a, callable);
        if (C5V.A04 == null || !C5V.A04.A04) {
            handlerA02.postDelayed(c6u, jMax);
        }
        C2997BrQ c2997BrQ = new C2997BrQ(handlerA02, c6u, jMax);
        synchronized (C5V.class) {
            C5V.A02.add(c2997BrQ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isKillBlocked() {
        return AuraAppLifecycleManager.INSTANCE.canPresentInteractiveUi() || HatchNodeOperationLease.INSTANCE.isHeld();
    }
}
