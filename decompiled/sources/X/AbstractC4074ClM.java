package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: X.ClM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4074ClM {
    public static final void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler) {
        if (context.getApplicationInfo().targetSdkVersion >= 34) {
            context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
        }
    }
}
