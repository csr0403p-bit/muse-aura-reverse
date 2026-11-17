package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.F2Q;
import android.app.IntentService;
import android.content.Intent;

/* loaded from: classes5.dex */
public class IsManagedAppCacheService extends IntentService {
    public IsManagedAppCacheService() {
        super("IsManagedAppCacheService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        F2Q.A00(intent, this);
    }
}
