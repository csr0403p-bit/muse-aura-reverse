package androidx.work.impl.diagnostics;

import X.EK9;
import X.F1d;
import X.F3R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes5.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String A00 = EK9.A01("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            EK9 ek9A00 = EK9.A00();
            String str = A00;
            ek9A00.A02(str, "Requesting diagnostics");
            try {
                F3R.A02(context).A06(new F1d(DiagnosticsWorker.class).A01());
            } catch (IllegalStateException e) {
                EK9.A00();
                Log.e(str, "WorkManager is not initialized", e);
            }
        }
    }
}
