package com.android.billingclient.api;

import X.AbstractC4103Cmd;
import X.AbstractC7610F5x;
import X.C9523GNa;
import X.C9524GNb;
import X.C9541GNx;
import X.EnumC8949FuO;
import X.EnumC9535GNn;
import X.EnumC9540GNw;
import X.G4i;
import X.GIG;
import X.GNK;
import X.GNM;
import X.GNN;
import X.GNO;
import X.GNT;
import X.GNV;
import X.GNY;
import X.GNr;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;

/* loaded from: classes6.dex */
public class ProxyBillingActivity extends Activity {
    public z A00;
    public GNK A01;
    public int A02;
    public long A03;
    public ResultReceiver A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    private Intent A00(EnumC9535GNn enumC9535GNn, long j, boolean z) {
        C9541GNx c9541GNxA00;
        z zVar;
        z zVar2;
        GNM gnm;
        Intent intentA0b = AbstractC7610F5x.A0b(this, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        if (!z || (zVar2 = this.A00) == null || (gnm = zVar2.A00) == null) {
            if (!z || (zVar = this.A00) == null || zVar.A01) {
                intentA0b.putExtra("RESPONSE_CODE", 6);
                intentA0b.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                GNO gno = new GNO();
                gno.A00 = 6;
                gno.A01 = "An internal error occurred.";
                c9541GNxA00 = GNr.A00(gno.A00(), EnumC9540GNw.A03, enumC9535GNn, G4i.A01, null);
            } else {
                intentA0b.putExtra("RESPONSE_CODE", 3);
                intentA0b.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                GNO gno2 = new GNO();
                gno2.A00 = 3;
                gno2.A01 = "Play Store is blocked.";
                c9541GNxA00 = GNr.A00(gno2.A00(), EnumC9540GNw.A03, EnumC9535GNn.A0d, G4i.A01, null);
            }
            intentA0b.putExtra("FAILURE_LOGGING_PAYLOAD", c9541GNxA00.A0C());
        } else {
            intentA0b.putExtra("RESPONSE_CODE", gnm.A00);
            intentA0b.putExtra("DEBUG_MESSAGE", gnm.A02);
        }
        intentA0b.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentA0b.putExtra("billingClientTransactionId", j);
        intentA0b.putExtra("wasServiceAutoReconnected", this.A07);
        return intentA0b;
    }

    public static EnumC9535GNn A01(Intent intent, int i) {
        return intent == null ? i != -1 ? i != 0 ? i != 3 ? i != 4 ? EnumC9535GNn.A1m : EnumC9535GNn.A1j : EnumC9535GNn.A1g : EnumC9535GNn.A1d : EnumC9535GNn.A1a : intent.getExtras() == null ? EnumC9535GNn.A2B : i == 5 ? EnumC9535GNn.A0U : EnumC9535GNn.A1A;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        int i;
        PendingIntent pendingIntent;
        int i2;
        super.onCreate(bundle);
        if (!(bundle == null ? getIntent() == null ? false : getIntent().hasExtra("IN_APP_MESSAGE_INTENT") : bundle.containsKey("in_app_message_result_receiver"))) {
            try {
                i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                GNN.A07("ProxyBillingActivity", "Failed to get package info for current package.", e);
                i = -1;
            }
            if (this.A01 == null) {
                Context applicationContext = getApplicationContext();
                int i3 = C9523GNa.c;
                C9524GNb c9524GNb = new C9524GNb();
                String packageName = getPackageName();
                C9523GNa c9523GNaA01 = GIG.A01(c9524GNb);
                c9523GNaA01.getClass();
                c9523GNaA01.bitField0_ |= 4;
                c9523GNaA01.callingPackage_ = packageName;
                C9523GNa c9523GNaA012 = GIG.A01(c9524GNb);
                c9523GNaA012.getClass();
                c9523GNaA012.bitField0_ |= 1;
                c9523GNaA012.playBillingLibraryVersion_ = "9.1.0-billing-eap01";
                C9523GNa c9523GNaA013 = GIG.A01(c9524GNb);
                c9523GNaA013.bitField0_ |= 256;
                c9523GNaA013.appVersionCode_ = i;
                int i4 = Build.VERSION.SDK_INT;
                C9523GNa c9523GNaA014 = GIG.A01(c9524GNb);
                c9523GNaA014.bitField0_ |= 128;
                c9523GNaA014.androidSdkVersion_ = i4;
                C9523GNa c9523GNaA015 = GIG.A01(c9524GNb);
                c9523GNaA015.bitField0_ |= 512;
                c9523GNaA015.buildChangelist_ = 926256734L;
                this.A01 = new GNT(applicationContext, (C9523GNa) c9524GNb.A03());
            }
            synchronized (this) {
                try {
                    this.A00 = new z(this.A01);
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                    intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                    AbstractC4103Cmd.A05(this.A00, this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", 2);
                } catch (NoSuchMethodError | RuntimeException e2) {
                    this.A00 = null;
                    boolean z = e2 instanceof NoSuchMethodError;
                    GNK gnk = this.A01;
                    if (z) {
                        int i5 = GNV.c;
                        GNY gny = new GNY();
                        EnumC8949FuO enumC8949FuO = EnumC8949FuO.A02;
                        GNV gnv = (GNV) GIG.A02(gny);
                        gnv.getClass();
                        gnv.reason_ = enumC8949FuO.a;
                        gnv.bitField0_ |= 1;
                        ((GNT) gnk).A09((GNV) gny.A03());
                    } else {
                        int i6 = GNV.c;
                        GNY gny2 = new GNY();
                        EnumC8949FuO enumC8949FuO2 = EnumC8949FuO.A01;
                        GNV gnv2 = (GNV) GIG.A02(gny2);
                        gnv2.getClass();
                        gnv2.reason_ = enumC8949FuO2.a;
                        gnv2.bitField0_ |= 1;
                        ((GNT) gnk).A09((GNV) gny2.A03());
                    }
                    GNN.A07("ProxyBillingActivity", "Failed to register receiver.", e2);
                }
            }
        }
        if (bundle != null) {
            GNN.A05("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.A06 = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.A04 = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.A05 = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.A02 = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.A03 = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.A07 = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        GNN.A05("ProxyBillingActivity", "Launching Play Store billing flow");
        this.A02 = 100;
        boolean zHasExtra = getIntent().hasExtra("BUY_INTENT");
        Intent intent = getIntent();
        if (zHasExtra) {
            pendingIntent = (PendingIntent) intent.getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.A05 = true;
                i2 = 110;
                this.A02 = i2;
            }
        } else if (intent.hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.A04 = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            i2 = FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE;
            this.A02 = i2;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.A03 = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.A07 = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.A06 = true;
            int i7 = Build.VERSION.SDK_INT;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.A02, new Intent(), 0, 0, 0, i7 >= 36 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle() : i7 >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null);
        } catch (IntentSender.SendIntentException e3) {
            GNN.A07("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e3);
            ResultReceiver resultReceiver = this.A04;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentA00 = A00(EnumC9535GNn.A0O, this.A03, false);
                if (this.A05) {
                    intentA00.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA00);
            }
            this.A06 = false;
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        GNM gnm;
        String str;
        super.onDestroy();
        z zVar = this.A00;
        if (zVar != null) {
            gnm = zVar.A00;
            try {
                unregisterReceiver(zVar);
            } catch (RuntimeException e) {
                GNN.A07("ProxyBillingActivity", "Failed to unregister receiver.", e);
            }
        } else {
            gnm = null;
        }
        if (isFinishing() && this.A06) {
            Intent intentA0b = AbstractC7610F5x.A0b(this, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
            if (gnm != null) {
                intentA0b.putExtra("RESPONSE_CODE", gnm.A00);
                str = gnm.A02;
            } else {
                intentA0b.putExtra("RESPONSE_CODE", 1);
                str = "Billing dialog closed.";
            }
            intentA0b.putExtra("DEBUG_MESSAGE", str);
            if (this.A05) {
                intentA0b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.A02;
            if (i == 110 || i == 100) {
                intentA0b.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentA0b.putExtra("billingClientTransactionId", this.A03);
            }
            sendBroadcast(intentA0b);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.A04;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.A06);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.A05);
        bundle.putInt("activity_code", this.A02);
        bundle.putLong("billingClientTransactionId", this.A03);
        bundle.putBoolean("wasServiceAutoReconnected", this.A07);
    }
}
