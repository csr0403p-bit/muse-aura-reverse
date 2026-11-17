package X;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* loaded from: classes6.dex */
public final class HpR extends Hx6<Intent, ActivityResult> {
    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, Intent intent) {
        Intent intent2 = intent;
        C7384Etj.A0Y(intent2, 1);
        return intent2;
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ ActivityResult parseResult(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
