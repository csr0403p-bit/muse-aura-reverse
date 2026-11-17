package com.facebook.aura.notifications.push;

import X.AnonymousClass003;
import X.C3cG;
import X.C60P;
import X.CFK;
import com.facebook.pushlite.common.RetryableGetTokenException;

/* loaded from: classes5.dex */
public final class AuraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1 {
    public void onSuccess() {
        CFK.A05(AuraPushManagerKt.TAG, "Token registration succeeded");
    }

    public void onFailure(String str, Throwable th) {
        RetryableGetTokenException retryableGetTokenException;
        AnonymousClass003.A0u(str, th);
        Integer numValueOf = null;
        if ((th instanceof RetryableGetTokenException) && (retryableGetTokenException = (RetryableGetTokenException) th) != null) {
            numValueOf = Integer.valueOf(retryableGetTokenException.attemptTimes);
        }
        CFK.A04(AuraPushManagerKt.TAG, C60P.A1M("): ", str, C3cG.A0f(numValueOf, "Token registration failed (attempt=")));
    }
}
