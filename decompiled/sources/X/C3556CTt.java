package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CTt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3556CTt extends BroadcastReceiver {
    public static AtomicReference<C3556CTt> A01 = BV4.A15();
    public final Context A00;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C3554CTr.A09) {
            Iterator itA10 = BV5.A10(C3554CTr.A0A);
            while (itA10.hasNext()) {
                C3554CTr.A02((C3554CTr) itA10.next());
            }
        }
        this.A00.unregisterReceiver(this);
    }

    public C3556CTt(Context context) {
        this.A00 = context;
    }
}
