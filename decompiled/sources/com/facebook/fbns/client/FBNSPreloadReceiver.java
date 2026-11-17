package com.facebook.fbns.client;

import X.BV4;
import X.C3971CiJ;
import X.CFK;
import X.RunnableC3969CiH;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class FBNSPreloadReceiver extends BroadcastReceiver {
    public QuickPerformanceLogger A00 = QuickPerformanceLoggerProvider.getQPLInstance();

    public static int A00(Intent intent) throws JSONException {
        String stringExtra;
        String string;
        String strOptString;
        int iHashCode = 1;
        if (intent == null) {
            return 1;
        }
        if (!intent.hasExtra("pim")) {
            if (intent.hasExtra("data") && (stringExtra = intent.getStringExtra("data")) != null) {
                JSONObject jSONObjectA19 = BV4.A19(stringExtra);
                if (jSONObjectA19.has("pim")) {
                    string = jSONObjectA19.getString("pim");
                }
            }
            return iHashCode;
        }
        string = intent.getStringExtra("pim");
        if (string != null && (strOptString = BV4.A19(string).optString("pjid", null)) != null) {
            iHashCode = UUID.fromString(strOptString).hashCode();
            return iHashCode;
        }
        return iHashCode;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) throws JSONException {
        PowerManager.WakeLock wakeLockNewWakeLock;
        int iA00 = A00(intent);
        if (intent == null) {
            QuickPerformanceLogger quickPerformanceLogger = this.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, iA00, "intent_empty", true);
                quickPerformanceLogger.markerEnd(875309620, iA00, (short) 3);
                return;
            }
            return;
        }
        C3971CiJ c3971CiJ = C3971CiJ.A02;
        if (c3971CiJ == null) {
            c3971CiJ = new C3971CiJ(context);
            C3971CiJ.A02 = c3971CiJ;
        }
        Runnable runnable = new Runnable() { // from class: X.CiE
            public static final String __redex_internal_original_name = "FBNSPreloadReceiver$$ExternalSyntheticLambda0";

            /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws org.json.JSONException {
                /*
                    Method dump skipped, instructions count: 563
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CiE.run():void");
            }
        };
        PowerManager powerManager = c3971CiJ.A00;
        if (powerManager == null) {
            wakeLockNewWakeLock = null;
        } else {
            wakeLockNewWakeLock = powerManager.newWakeLock(1, "FBNSPreloadWakefulExecutor");
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
            }
        }
        try {
            c3971CiJ.A01.execute(new RunnableC3969CiH(wakeLockNewWakeLock, c3971CiJ, runnable));
        } catch (RejectedExecutionException e) {
            CFK.A08("FBNSPreloadWakefulExecutor", "Notification skipped", e);
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.release();
            }
        }
    }
}
