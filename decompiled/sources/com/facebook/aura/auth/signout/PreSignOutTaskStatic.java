package com.facebook.aura.auth.signout;

import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.localbrowser.LocalBrowserSignOut;
import com.facebook.aura.notifications.push.AuraPushTokenSignOutTask;

/* loaded from: classes3.dex */
public class PreSignOutTaskStatic {
    public static void execute(int i) throws Throwable {
        if (i == 0) {
            LocalBrowserSignOut.INSTANCE.execute();
        } else {
            if (i != 1) {
                throw AnonymousClass005.A0c(i);
            }
            AuraPushTokenSignOutTask.INSTANCE.execute();
        }
    }

    public static int[] getKeys() {
        return AnonymousClass003.A1a();
    }
}
