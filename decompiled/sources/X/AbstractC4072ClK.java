package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: X.ClK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4072ClK {
    public static void A00(BroadcastReceiver broadcastReceiver, Context context, Handler handler) {
        try {
            AbstractC4073ClL.A00(broadcastReceiver, context, new IntentFilter("com.facebook.analytics2.action.UPLOAD_JOB_RAN"), handler);
        } catch (RuntimeException e) {
            CFK.A0L("UploadServiceBus", e, "Registering receiver caused exception.");
        }
    }
}
