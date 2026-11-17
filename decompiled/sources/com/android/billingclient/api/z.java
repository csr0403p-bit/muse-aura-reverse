package com.android.billingclient.api;

import X.AbstractC7608F5v;
import X.C6xC;
import X.C9423GIm;
import X.C9424GIn;
import X.C9523GNa;
import X.EnumC8948FuN;
import X.FGI;
import X.G4i;
import X.GIF;
import X.GIG;
import X.GNK;
import X.GNM;
import X.GNN;
import X.GNT;
import X.GNU;
import X.GNX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public final class z extends BroadcastReceiver {
    public GNM A00;
    public boolean A01 = false;
    public final GNK A02;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String strA0M;
        if (intent == null) {
            strA0M = "Null intent!";
        } else {
            GNN.A05("ProxyBillingReceiver", FGI.A0M("Received intent action: ", intent.getAction()));
            if (C6xC.A00(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
                if (!intent.hasExtra("RESPONSE_CODE")) {
                    GNN.A06("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
                    GNK gnk = this.A02;
                    if (gnk != null) {
                        ((GNT) gnk).A02(null, intent.getLongExtra("billingClientTransactionId", 0L));
                        return;
                    }
                    return;
                }
                int intExtra = intent.getIntExtra("RESPONSE_CODE", 0);
                String stringExtra = intent.getStringExtra("DEBUG_MESSAGE");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                GNM gnmA00 = GNM.A00(stringExtra, intExtra, 0);
                this.A00 = gnmA00;
                GNK gnk2 = this.A02;
                if (gnk2 != null) {
                    ((GNT) gnk2).A02(gnmA00, intent.getLongExtra("billingClientTransactionId", 0L));
                    return;
                }
                return;
            }
            if (C6xC.A00(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
                this.A01 = true;
                GNK gnk3 = this.A02;
                if (gnk3 != null) {
                    long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
                    GNT gnt = (GNT) gnk3;
                    try {
                        int i = C9423GIm.c;
                        C9424GIn c9424GIn = new C9424GIn();
                        GIF.A09(c9424GIn, EnumC8948FuN.A02);
                        C9423GIm.A0A((C9423GIm) GIG.A02(c9424GIn), G4i.A06);
                        C9423GIm c9423GIm = (C9423GIm) c9424GIn.A03();
                        int i2 = GNU.c;
                        GNX gnx = new GNX();
                        GNU gnuA03 = GIF.A03(longExtra == 0 ? gnt.A00 : (C9523GNa) GIF.A05(gnt.A00, longExtra), gnx);
                        gnuA03.event_ = c9423GIm;
                        GIF.A07(gnuA03, gnt, gnx, 5);
                        return;
                    } catch (Throwable th) {
                        AbstractC7608F5v.A1U(th);
                        return;
                    }
                }
                return;
            }
            strA0M = FGI.A0M("Unexpected broadcast action: ", intent.getAction());
        }
        GNN.A06("ProxyBillingReceiver", strA0M);
    }

    public z(GNK gnk) {
        this.A02 = gnk;
    }
}
