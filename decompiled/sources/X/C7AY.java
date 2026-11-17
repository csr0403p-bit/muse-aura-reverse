package X;

import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7AY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7AY {
    public static boolean A00(Activity activity, String str) {
        try {
            return AnonymousClass001.A1X(PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
