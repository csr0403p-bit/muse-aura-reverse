package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.os.Bundle;

/* renamed from: X.Hjh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10459Hjh {
    public static String A00(ComponentName componentName, Context context) {
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String string = activityInfo.parentActivityName;
        if (string == null) {
            Bundle bundle = ((PackageItemInfo) activityInfo).metaData;
            if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
                return null;
            }
            if (AbstractC7607F5u.A00(string) == '.') {
                return FGI.A0M(context.getPackageName(), string);
            }
        }
        return string;
    }
}
