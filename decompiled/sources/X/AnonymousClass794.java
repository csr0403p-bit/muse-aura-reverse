package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.794, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass794 extends Hx6<String, Boolean> {
    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, String str) {
        C7384Etj.A0Y(str, 1);
        Intent intentPutExtra = C60P.A03("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        C7384Etj.A0U(intentPutExtra);
        return intentPutExtra;
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Boolean parseResult(int i, Intent intent) {
        int[] intArrayExtra;
        boolean z = false;
        if (intent != null && i == -1 && (intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS")) != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ AnonymousClass795<Boolean> getSynchronousResult(Context context, String str) {
        String str2 = str;
        boolean zA1Y = C60P.A1Y(context, str2);
        if (AbstractC4103Cmd.A02(context, str2) == 0) {
            return new AnonymousClass795<>(Boolean.valueOf(zA1Y));
        }
        return null;
    }
}
