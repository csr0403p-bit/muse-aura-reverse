package androidx.glance.appwidget;

import X.C3cG;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Map;

/* loaded from: classes3.dex */
public class UnmanagedSessionReceiver extends BroadcastReceiver {
    public static final Companion A00 = new Companion();
    public static final Map A01 = C3cG.A0j();

    public final class Companion {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_TRIGGER_LAMBDA".equals(intent.getAction())) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            throw C3cG.A0Q("Intent is missing ActionKey extra");
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            throw C3cG.A0Q("Intent is missing AppWidgetId extra");
        }
        synchronized (A00) {
            A01.get(Integer.valueOf(intExtra));
        }
        Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
    }
}
