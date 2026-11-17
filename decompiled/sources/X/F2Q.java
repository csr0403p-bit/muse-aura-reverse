package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes5.dex */
public abstract class F2Q {
    public static void A00(Intent intent, Context context) {
        if (intent == null || !"com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED".equals(intent.getAction())) {
            return;
        }
        try {
            C07197og.A00(context).A01();
        } catch (IllegalStateException | SecurityException e) {
            CFK.A08("IsManagedAppCacheService", "onHandleIntent() isManagedForceQuery failed", e);
        }
    }
}
