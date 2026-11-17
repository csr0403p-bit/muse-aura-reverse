package com.facebook.aura.lifecycle;

import X.AnonymousClass801;
import X.C7384Etj;
import X.CFK;
import android.content.Context;

/* loaded from: classes2.dex */
public final class AppOpenedListeners {
    public static final AppOpenedListeners INSTANCE = new AppOpenedListeners();

    public final void notifyAppOpened(Context context) {
        int i = 0;
        C7384Etj.A0Y(context, 0);
        int[] iArr = {0, 1, 2, 3};
        do {
            try {
                AnonymousClass801.A0W(iArr[i], context);
            } catch (Exception e) {
                CFK.A08(AppOpenedListenersKt.TAG, "App opened listener failed", e);
            }
            i++;
        } while (i < 4);
    }
}
