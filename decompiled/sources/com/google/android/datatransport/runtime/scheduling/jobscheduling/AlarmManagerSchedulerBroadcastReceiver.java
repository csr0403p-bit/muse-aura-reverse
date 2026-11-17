package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.AbstractC3873Cg4;
import X.BV4;
import X.BV5;
import X.C3847Cfc;
import X.C3856Cfl;
import X.Ce5;
import X.Ce7;
import X.RunnableC3840CfT;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* loaded from: classes5.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C3847Cfc.A01(context);
        if (queryParameter == null) {
            throw BV4.A0a("Null backendName");
        }
        Ce5 ce5 = Ce7.A00.get(iIntValue);
        if (ce5 == null) {
            throw BV5.A0Q("Unknown Priority for value ", iIntValue);
        }
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        C3856Cfl c3856Cfl = C3847Cfc.A00().A01;
        c3856Cfl.A08.execute(new RunnableC3840CfT(AbstractC3873Cg4.A00(ce5, queryParameter, bArrDecode), c3856Cfl, new Runnable() { // from class: X.Cgc
            public static final String __redex_internal_original_name = "AlarmManagerSchedulerBroadcastReceiver$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
            }
        }, i));
    }
}
