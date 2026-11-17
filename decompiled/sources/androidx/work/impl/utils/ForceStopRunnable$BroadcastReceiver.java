package androidx.work.impl.utils;

import X.EK9;
import X.RunnableC6609EJz;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes5.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        EK9.A01("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        EK9.A00();
        RunnableC6609EJz.A00(context);
    }
}
