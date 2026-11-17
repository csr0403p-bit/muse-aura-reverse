package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.CSw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3539CSw extends BroadcastReceiver {
    public RunnableC3537CSt A00;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo;
        RunnableC3537CSt runnableC3537CSt = this.A00;
        if (runnableC3537CSt != null) {
            C3554CTr c3554CTr = runnableC3537CSt.A00.A02;
            C3554CTr.A01(c3554CTr);
            ConnectivityManager connectivityManager = (ConnectivityManager) c3554CTr.A00.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return;
            }
            if (BV4.A1U("FirebaseInstanceId")) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.A04(this.A00, 0L);
            C3554CTr c3554CTr2 = this.A00.A00.A02;
            C3554CTr.A01(c3554CTr2);
            c3554CTr2.A00.unregisterReceiver(this);
            this.A00 = null;
        }
    }
}
