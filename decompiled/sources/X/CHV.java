package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: classes5.dex */
public abstract class CHV {
    public static void A00(ComponentName componentName, Context context, IllegalArgumentException illegalArgumentException) {
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting == 1 || componentEnabledSetting == 0) {
            throw illegalArgumentException;
        }
        Object[] objArr = {componentName};
        if (CFL.A00()) {
            CFK.A09("DisabledServiceWorkaround", StringFormatUtil.formatStrLocaleSafe("Service has been disabled; cannot schedule job for %s", objArr), illegalArgumentException);
        }
    }
}
