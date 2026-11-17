package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: X.Cmf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4105Cmf {
    public static void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, String str, int i) {
        context.registerReceiver(broadcastReceiver, intentFilter, str, null, i);
    }
}
