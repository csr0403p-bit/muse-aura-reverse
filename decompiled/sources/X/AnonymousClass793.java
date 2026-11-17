package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.793, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass793 extends Hx6<String[], Map<String, Boolean>> {
    /* JADX WARN: Incorrect types in method signature: (ILandroid/content/Intent;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Boolean;>; */
    public static final Map A01(Intent intent, int i) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayListA11 = C60O.A11(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayListA11.add(Boolean.valueOf(AnonymousClass002.A1M(i2)));
                }
                return AGH.A06(AbstractC0878AGe.A0O(BFI.A0F(stringArrayExtra), arrayListA11));
            }
        }
        return AGH.A0E();
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        C7384Etj.A0Y(strArr2, 1);
        Intent intentPutExtra = C60P.A03("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
        C7384Etj.A0U(intentPutExtra);
        return intentPutExtra;
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ AnonymousClass795<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        return A00(context, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.9jH] */
    public static final AnonymousClass795<Map<String, Boolean>> A00(Context context, String[] strArr) {
        Object objA15;
        boolean zA1Y = C60P.A1Y(context, strArr);
        int length = strArr.length;
        if (length != 0) {
            int i = 0;
            int i2 = 0;
            while (AbstractC4103Cmd.A02(context, strArr[i2]) == 0) {
                i2++;
                if (i2 >= length) {
                    int iA0H = AIW.A0H(length);
                    if (iA0H < 16) {
                        iA0H = 16;
                    }
                    objA15 = C60O.A15(iA0H);
                    do {
                        objA15.put(strArr[i], Boolean.valueOf(zA1Y));
                        i++;
                    } while (i < length);
                }
            }
            return null;
        }
        objA15 = AGH.A0E();
        return new AnonymousClass795<>(objA15);
    }

    @Override // X.Hx6
    public final /* bridge */ /* synthetic */ Map<String, Boolean> parseResult(int i, Intent intent) {
        return A01(intent, i);
    }
}
