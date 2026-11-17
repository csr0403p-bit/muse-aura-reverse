package com.google.firebase.iid;

import X.CTC;
import X.CTD;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;

/* loaded from: classes5.dex */
public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {
    public static CTC A00;

    public static int A00(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        CTC ctc;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            ctc = A00;
            if (ctc == null) {
                ctc = new CTC(context);
                A00 = ctc;
            }
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = broadcastReceiver.goAsync();
        synchronized (ctc) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
            }
            ctc.A04.add(new CTD(pendingResultGoAsync, intent, ctc.A05));
            CTC.A00(ctc);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(android.content.Context r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A01(android.content.Context, android.content.Intent):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (!(parcelableExtra instanceof Intent) || (intent2 = (Intent) parcelableExtra) == null) {
                A01(context, intent);
            } else {
                A01(context, intent2);
            }
        }
    }
}
