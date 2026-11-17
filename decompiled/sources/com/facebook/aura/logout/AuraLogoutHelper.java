package com.facebook.aura.logout;

import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.C9X;
import X.CFK;
import X.F0C;
import android.content.Intent;
import android.webkit.CookieManager;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.common.restart.HatchAppRestarter;
import com.facebook.aura.localbrowser.LocalBrowserSignOut;
import com.facebook.aura.notifications.push.AuraPushTokenSignOutTask;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraLogoutHelper {
    public static final String LOGOUT_RESTART_REASON = "Logged out";
    public static final String LOGOUT_THREAD_NAME = "Aura-Logout";
    public static final String TAG = "AuraLogoutHelper";
    public static final BLG<Boolean> _isLoggingOut;
    public static final C1BN<Boolean> isLoggingOut;
    public static final F0C logoutExecutor$delegate;
    public static final AuraLogoutHelper INSTANCE = new AuraLogoutHelper();
    public static final AtomicInteger pendingLogouts = new AtomicInteger(0);

    /* renamed from: com.facebook.aura.logout.AuraLogoutHelper$performClaimedLogout$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraSessionManager.SignOutClaim $claim;
        public final /* synthetic */ boolean $relaunch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraSessionManager.SignOutClaim signOutClaim, boolean z) {
            super(0);
            this.$claim = signOutClaim;
            this.$relaunch = z;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                AuraLogoutHelper auraLogoutHelper = AuraLogoutHelper.INSTANCE;
                auraLogoutHelper.runPreSignOutTasks();
                auraLogoutHelper.clearWebCookies();
                AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
                if (auraSessionManager.completeClaimedSignOut(this.$claim, C9X.A04(), !C9X.A04()) && this.$relaunch) {
                    auraLogoutHelper.relaunchToLogin();
                }
                auraSessionManager.releaseSignOutClaim(this.$claim);
            } catch (Throwable th) {
                AuraSessionManager.INSTANCE.releaseSignOutClaim(this.$claim);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.logout.AuraLogoutHelper$performLogout$1, reason: invalid class name and case insensitive filesystem */
    public final class C126481 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C126481 INSTANCE = new C126481();

        public C126481() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() throws Throwable {
            AuraLogoutHelper auraLogoutHelper = AuraLogoutHelper.INSTANCE;
            auraLogoutHelper.runPreSignOutTasks();
            auraLogoutHelper.clearWebCookies();
            boolean zA04 = C9X.A04();
            AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
            if (zA04) {
                auraSessionManager.e2eLogout();
            } else {
                auraSessionManager.signOut();
            }
            auraLogoutHelper.relaunchToLogin();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final void performLogoutIfCurrent(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AuraSessionManager.SignOutClaim signOutClaimClaimSignOutIfCurrent = AuraSessionManager.INSTANCE.claimSignOutIfCurrent(abstractC3358CGz, str);
        if (signOutClaimClaimSignOutIfCurrent != null) {
            performClaimedLogout(signOutClaimClaimSignOutIfCurrent, true);
        }
    }

    static {
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        _isLoggingOut = c9286GCnA0v;
        isLoggingOut = C3Pi.A00(c9286GCnA0v);
        logoutExecutor$delegate = AbstractC5321DgF.A03(AuraLogoutHelper$logoutExecutor$2.INSTANCE);
    }

    private final ExecutorService getLogoutExecutor() {
        return (ExecutorService) logoutExecutor$delegate.getValue();
    }

    private final Intent loginIntent() {
        Intent intentAddFlags;
        Intent intentLaunchIntent = HatchAppRestarter.INSTANCE.launchIntent(null);
        if (intentLaunchIntent == null || (intentAddFlags = intentLaunchIntent.addFlags(32768)) == null) {
            return null;
        }
        return intentAddFlags.putExtra(HatchAppRestarter.EXTRA_REPLAY_SPLASH, true);
    }

    private final void performClaimedLogout(AuraSessionManager.SignOutClaim signOutClaim, boolean z) {
        runLogoutSequence(new AnonymousClass1(signOutClaim, z));
    }

    public static /* synthetic */ void performClaimedLogout$default(AuraLogoutHelper auraLogoutHelper, AuraSessionManager.SignOutClaim signOutClaim, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        auraLogoutHelper.performClaimedLogout(signOutClaim, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void relaunchToLogin() {
        HatchAppRestarter.INSTANCE.relaunchApp(LOGOUT_RESTART_REASON, null, loginIntent(), false);
    }

    private final void runLogoutSequence(final Function0<Unit> function0) {
        pendingLogouts.incrementAndGet();
        AnonymousClass004.A1D(true, _isLoggingOut);
        ((Executor) logoutExecutor$delegate.getValue()).execute(new Runnable() { // from class: com.facebook.aura.logout.AuraLogoutHelper.runLogoutSequence.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        function0.invoke();
                    } catch (Exception e) {
                        CFK.A08(AuraLogoutHelper.TAG, "Logout sequence failed", e);
                    }
                } finally {
                    if (AuraLogoutHelper.pendingLogouts.decrementAndGet() == 0) {
                        AnonymousClass004.A1D(false, AuraLogoutHelper._isLoggingOut);
                    }
                }
            }
        });
    }

    public final C1BN<Boolean> isLoggingOut() {
        return isLoggingOut;
    }

    public final void performLogout() {
        runLogoutSequence(C126481.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearWebCookies() {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to clear cookies during logout", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runPreSignOutTasks() throws Throwable {
        int[] iArrA1a = AnonymousClass003.A1a();
        int i = 0;
        do {
            int i2 = iArrA1a[i];
            if (i2 != 0) {
                if (i2 != 1) {
                    throw AnonymousClass005.A0c(i2);
                }
                try {
                    AuraPushTokenSignOutTask.INSTANCE.execute();
                } catch (Exception e) {
                    CFK.A08(TAG, "Pre-sign-out task failed during logout", e);
                }
                CFK.A08(TAG, "Pre-sign-out task failed during logout", e);
            } else {
                LocalBrowserSignOut.INSTANCE.execute();
            }
            i++;
        } while (i < 2);
    }

    public final void performLogoutIfCurrent(AbstractC3358CGz abstractC3358CGz, boolean z) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AuraSessionManager.SignOutClaim signOutClaimClaimSignOutIfCurrent = AuraSessionManager.INSTANCE.claimSignOutIfCurrent(abstractC3358CGz);
        if (signOutClaimClaimSignOutIfCurrent != null) {
            performClaimedLogout(signOutClaimClaimSignOutIfCurrent, z);
        }
    }
}
