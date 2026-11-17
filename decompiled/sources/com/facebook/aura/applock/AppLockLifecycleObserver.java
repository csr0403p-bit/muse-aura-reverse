package com.facebook.aura.applock;

import X.AbstractC3358CGz;
import X.AbstractC4103Cmd;
import X.AnonymousClass002;
import X.C7384Etj;
import X.CFK;
import android.app.Activity;
import android.app.Application;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.aura.auth.AuraSessionManager;

/* loaded from: classes3.dex */
public final class AppLockLifecycleObserver implements Application.ActivityLifecycleCallbacks {
    public static final int $stable = 0;
    public static final AppLockLifecycleObserver INSTANCE;
    public static boolean awaitingForegroundAfterSystemNavigation;
    public static final HomeAndRecentsReceiver homeAndRecentsReceiver;
    public static boolean initialized;
    public static int pendingConfigurationChangeStarts;
    public static int startedActivityCount;

    public final void init(Application application) {
        C7384Etj.A0Y(application, 0);
        if (initialized) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        initialized = true;
        try {
            AbstractC4103Cmd.A04(homeAndRecentsReceiver, application, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), 2);
        } catch (SecurityException e) {
            CFK.A0A(AppLockLifecycleObserverKt.TAG, "Home and Recents receiver refused", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        int i = startedActivityCount;
        if (i == 0) {
            CFK.A0H(AppLockLifecycleObserverKt.TAG, "ignoring unbalanced stop for %s", activity.getLocalClassName());
            return;
        }
        startedActivityCount = i - 1;
        if (activity.isChangingConfigurations()) {
            pendingConfigurationChangeStarts++;
        } else if (startedActivityCount == 0 && pendingConfigurationChangeStarts == 0 && !awaitingForegroundAfterSystemNavigation) {
            dispatch(false);
        }
    }

    static {
        AppLockLifecycleObserver appLockLifecycleObserver = new AppLockLifecycleObserver();
        INSTANCE = appLockLifecycleObserver;
        homeAndRecentsReceiver = new HomeAndRecentsReceiver(new AppLockLifecycleObserver$homeAndRecentsReceiver$1(appLockLifecycleObserver));
    }

    private final void dispatch(boolean z) {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession == null) {
            CFK.A03(Boolean.valueOf(z), AppLockLifecycleObserverKt.TAG, "transition to foreground=%b ignored, no session");
            return;
        }
        CFK.A03(Boolean.valueOf(z), AppLockLifecycleObserverKt.TAG, "transition to foreground=%b");
        AppLockRepository companion = AppLockRepository.Companion.getInstance(currentSession);
        if (z) {
            companion.onForeground();
        } else {
            companion.onBackground();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onHomeOrRecentsPressed(String str) {
        if (startedActivityCount == 0 || awaitingForegroundAfterSystemNavigation) {
            return;
        }
        awaitingForegroundAfterSystemNavigation = true;
        CFK.A03(str, AppLockLifecycleObserverKt.TAG, "backgrounding immediately for system navigation: %s");
        dispatch(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (awaitingForegroundAfterSystemNavigation) {
            awaitingForegroundAfterSystemNavigation = false;
            CFK.A05(AppLockLifecycleObserverKt.TAG, "foregrounding after Home/Recents before Activity stop");
            dispatch(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i = startedActivityCount;
        boolean zA1M = AnonymousClass002.A1M(i);
        startedActivityCount = i + 1;
        int i2 = pendingConfigurationChangeStarts;
        if (i2 > 0) {
            pendingConfigurationChangeStarts = i2 - 1;
        } else if (zA1M) {
            awaitingForegroundAfterSystemNavigation = false;
            dispatch(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
