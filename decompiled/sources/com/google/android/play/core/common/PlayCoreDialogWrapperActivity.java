package com.google.android.play.core.common;

import X.BV6;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes5.dex */
public class PlayCoreDialogWrapperActivity extends Activity {
    public ResultReceiver A00;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        ResultReceiver resultReceiver;
        PendingIntent pendingIntent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        Intent intent = null;
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.A00 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null || (pendingIntent = (PendingIntent) extras.get("confirmation_intent")) == null) {
            resultReceiver = this.A00;
            if (resultReceiver != null) {
                resultReceiver.send(3, BV6.A0N());
            }
        } else {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException unused) {
                resultReceiver = this.A00;
                if (resultReceiver != null) {
                }
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.A00);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundleA0N;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.A00) != null) {
            if (i2 == -1) {
                bundleA0N = BV6.A0N();
                i3 = 1;
            } else if (i2 == 0) {
                bundleA0N = BV6.A0N();
                i3 = 2;
            }
            resultReceiver.send(i3, bundleA0N);
        }
        finish();
    }
}
