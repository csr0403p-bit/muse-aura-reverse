package com.facebook.aura.gateway.service;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.C7m8;
import X.C8fD;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.backgroundwork.api.BackgroundWork;
import com.facebook.secure.receiver.InternalStaticBroadcastReceiver;

/* loaded from: classes2.dex */
public final class HatchForegroundServiceDismissReceiver extends InternalStaticBroadcastReceiver {
    public static final Companion Companion = new Companion();

    @Override // com.facebook.secure.receiver.StaticBroadcastReceiverBase
    public void doReceive(Context context, Intent intent, C8fD c8fD) {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            BackgroundWork.INSTANCE.dismissActive(currentSession);
        }
    }

    public final class Companion {
        public final PendingIntent createPendingIntent(Context context, int i) {
            C7384Etj.A0Y(context, 0);
            C7m8 c7m8 = new C7m8();
            c7m8.A06(new Intent(context, (Class<?>) HatchForegroundServiceDismissReceiver.class), context.getClassLoader());
            c7m8.A01 = true;
            return c7m8.A02(context, i, 201326592);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
