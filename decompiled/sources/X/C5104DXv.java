package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.DXv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5104DXv extends BroadcastReceiver {
    public final /* synthetic */ C5103DXu A00;

    public C5104DXv(C5103DXu c5103DXu) {
        this.A00 = c5103DXu;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.A00.A04.execute(new Runnable() { // from class: X.DXw
            public static final String __redex_internal_original_name = "NetworkTypeObserver$Receiver$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C5103DXu.A01(context, this.A00);
            }
        });
    }
}
