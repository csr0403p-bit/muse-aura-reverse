package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes5.dex */
public final class CJ7 extends BroadcastReceiver {
    public final /* synthetic */ CJ6 A00;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CJ6 cj6 = this.A00;
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            C3381CIn c3381CInA00 = CJN.A00(bundleExtra);
            cj6.A03.A01("ListenerRegistryBroadcastReceiver.onReceive: %s", c3381CInA00);
            cj6.A01(c3381CInA00);
        }
    }
}
