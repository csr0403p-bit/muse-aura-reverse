package com.facebook.aura.applock;

import X.C7384Etj;
import X.G0U;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HomeAndRecentsReceiver extends BroadcastReceiver {
    public final G0U<String, Unit> onHomeOrRecentsPressed;

    /* JADX WARN: Multi-variable type inference failed */
    public HomeAndRecentsReceiver(G0U<? super String, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onHomeOrRecentsPressed = g0u;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        C7384Etj.A0Y(intent, 1);
        if (!"android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction()) || (stringExtra = intent.getStringExtra("reason")) == null) {
            return;
        }
        if (stringExtra.equals(AppLockLifecycleObserverKt.SYSTEM_DIALOG_REASON_HOME_KEY) || stringExtra.equals(AppLockLifecycleObserverKt.SYSTEM_DIALOG_REASON_RECENT_APPS)) {
            this.onHomeOrRecentsPressed.invoke(stringExtra);
        }
    }
}
