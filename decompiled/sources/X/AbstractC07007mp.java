package X;

import android.app.Activity;
import android.os.Build;

/* renamed from: X.7mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC07007mp {
    public static final String A00(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        if (Build.VERSION.SDK_INT >= 35) {
            try {
                return activity.getCurrentCaller().getPackage();
            } catch (IllegalStateException unused) {
            }
        }
        return activity.getLaunchedFromPackage();
    }
}
