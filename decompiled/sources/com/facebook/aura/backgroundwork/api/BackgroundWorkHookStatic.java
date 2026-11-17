package com.facebook.aura.backgroundwork.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.gateway.service.BackgroundWorkDoneNotifier;

/* loaded from: classes2.dex */
public class BackgroundWorkHookStatic {
    public static void onAcknowledged(int i, AbstractC3358CGz abstractC3358CGz, String str) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        BackgroundWorkDoneNotifier.INSTANCE.onAcknowledged(abstractC3358CGz, str);
    }

    public static void onFinished(int i, AbstractC3358CGz abstractC3358CGz, BackgroundWorkContent backgroundWorkContent) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        BackgroundWorkDoneNotifier.INSTANCE.onFinished(abstractC3358CGz, backgroundWorkContent);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
