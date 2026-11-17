package com.facebook.aura.notifications.push;

import X.AbstractC5321DgF;
import X.BV4;
import X.BV6;
import X.C3528CSh;
import X.C3554CTr;
import X.C7384Etj;
import X.CFK;
import X.CSB;
import X.CSD;
import X.CT5;
import X.F0C;
import android.os.Bundle;
import android.os.Looper;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.pushlite.PushTokenManager;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class AuraFcmTokenSignOutCleanup implements SignOutCleanupHandler {
    public static final String TAG = "AuraFcmTokenSignOutCleanup";
    public static final String THREAD_NAME = "AuraFcmTokenRotation";
    public static final AuraFcmTokenSignOutCleanup INSTANCE = new AuraFcmTokenSignOutCleanup();
    public static final F0C executor$delegate = AbstractC5321DgF.A03(AuraFcmTokenSignOutCleanup$executor$2.INSTANCE);

    private final ExecutorService getExecutor() {
        return (ExecutorService) executor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rotateToken() throws Throwable {
        String str;
        try {
            FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(C3554CTr.A00());
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw BV4.A0K("MAIN_THREAD");
            }
            String strA02 = FirebaseInstanceId.A02();
            C3528CSh c3528CSh = firebaseInstanceId.A00;
            Bundle bundleA0N = BV6.A0N();
            bundleA0N.putString("iid-operation", "delete");
            bundleA0N.putString("delete", "1");
            FirebaseInstanceId.A01(C3528CSh.A00(bundleA0N, c3528CSh, strA02, "*", "*").A04(new CSD(c3528CSh), c3528CSh.A04).A04(new CSB(), CT5.A00), firebaseInstanceId);
            firebaseInstanceId.A05();
            try {
                ((PushTokenManager) C7384Etj.A0G(AuraPushManager.instance.A07)).A01("FCM");
                CFK.A05(TAG, "Rotated FCM token");
            } catch (RuntimeException e) {
                e = e;
                str = "Failed to schedule the FCM token refresh";
                CFK.A0A(TAG, str, e);
            }
        } catch (Exception e2) {
            e = e2;
            str = "Failed to delete FCM instance id";
        }
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        F0C.A06(executor$delegate).execute(new Runnable() { // from class: com.facebook.aura.notifications.push.AuraFcmTokenSignOutCleanup.cleanup.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                AuraFcmTokenSignOutCleanup.INSTANCE.rotateToken();
            }
        });
    }
}
