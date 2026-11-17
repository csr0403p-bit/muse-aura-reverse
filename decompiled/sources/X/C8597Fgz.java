package X;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* renamed from: X.Fgz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8597Fgz extends Hx6<IntentSenderRequest, ActivityResult> {
    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
        IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
        C7384Etj.A0Y(intentSenderRequest2, 1);
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
        C7384Etj.A0U(intentPutExtra);
        return intentPutExtra;
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ ActivityResult parseResult(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
