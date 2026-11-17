package X;

import android.content.Context;
import android.os.Build;

/* loaded from: classes5.dex */
public abstract class Bq3 {
    public static Context A00(Context context) {
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            if (i >= 30) {
            }
            return applicationContext;
        }
        int iA00 = Bq4.A00(context);
        if (iA00 != Bq4.A00(applicationContext)) {
            applicationContext = Bq4.A01(applicationContext, iA00);
        }
        String strA01 = AbstractC2962Bq5.A01(context);
        if (!C6xC.A00(strA01, AbstractC2962Bq5.A01(applicationContext))) {
            return AbstractC2962Bq5.A00(applicationContext, strA01);
        }
        return applicationContext;
    }
}
