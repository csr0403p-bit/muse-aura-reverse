package X;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: X.Hlv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10491Hlv {
    public static int A00(Context context) {
        Configuration configurationA0Z = C8j3.A0Z(context);
        int i = configurationA0Z.screenWidthDp;
        int i2 = configurationA0Z.screenHeightDp;
        if (configurationA0Z.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i < 500) {
            if (i <= 480) {
                return i >= 360 ? 3 : 2;
            }
            if (i2 <= 640) {
                return 3;
            }
        }
        return 4;
    }
}
