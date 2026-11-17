package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* renamed from: X.ClL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4073ClL {
    public static final void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler) {
        C7384Etj.A0Y(broadcastReceiver, 1);
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC4074ClM.A00(broadcastReceiver, context, intentFilter, handler);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
        }
    }
}
