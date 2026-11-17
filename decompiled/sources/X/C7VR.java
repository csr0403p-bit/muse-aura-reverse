package X;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.7VR, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7VR extends AbstractC4103Cmd {
    public static boolean A01(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
            if (i < 32) {
                return i == 31 ? C7AY.A00(activity, str) : activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return C7VS.A00(activity, str);
    }

    public static void A00(Activity activity, String[] strArr, int i) {
        HashSet hashSetA13 = C60O.A13();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                int size = hashSetA13.size();
                if (size > 0) {
                    if (size == length) {
                        return;
                    }
                    for (int i3 = 0; i3 < length; i3++) {
                        hashSetA13.contains(Integer.valueOf(i3));
                    }
                }
                activity.requestPermissions(strArr, i);
                return;
            }
            if (TextUtils.isEmpty(strArr[i2])) {
                throw C60Q.A0V("Permission request for permissions ", Arrays.toString(strArr), " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                C60Q.A1P(hashSetA13, i2);
            }
            i2++;
        }
    }
}
