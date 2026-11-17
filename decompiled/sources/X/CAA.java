package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes5.dex */
public abstract class CAA {
    public static final CA9 A00 = new CA9("CommonUtils", "");

    public static String A00(Context context) {
        try {
            return String.valueOf(BV5.A0A(context).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            CA9 ca9 = A00;
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            if (!Log.isLoggable("CommonUtils", 6)) {
                return "";
            }
            String str = ca9.A01;
            if (str != null) {
                strConcat = str.concat(strConcat);
            }
            Log.e("CommonUtils", strConcat);
            return "";
        }
    }
}
