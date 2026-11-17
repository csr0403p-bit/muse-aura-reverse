package com.facebook.aura.iap;

import X.C7384Etj;
import android.content.Context;

/* loaded from: classes6.dex */
public final class HatchIapStartupService {
    public static final HatchIapStartupService INSTANCE = new HatchIapStartupService();

    public void onLogin(Context context) {
        C7384Etj.A0Y(context, 0);
        HatchIapUserSession scoped = HatchIapUserSession.Companion.getScoped(context);
        if (scoped != null) {
            scoped.onUserLogin();
        }
    }
}
