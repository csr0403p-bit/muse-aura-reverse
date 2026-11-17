package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* renamed from: X.Fgh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8582Fgh extends Hx6<IntentSenderRequest, ActivityResult> {
    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest2.A02;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                intentSenderRequest2 = new IntentSenderRequest(null, intentSenderRequest2.A03, intentSenderRequest2.A00, intentSenderRequest2.A01);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
        if (AbstractC8571FgQ.A0L()) {
            AbstractC7607F5u.A1N(AnonymousClass007.A0a("CreateIntent created the following intent: ", intent));
        }
        return intent;
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ ActivityResult parseResult(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
