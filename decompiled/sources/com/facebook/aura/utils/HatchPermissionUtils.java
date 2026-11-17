package com.facebook.aura.utils;

import X.AbstractC4103Cmd;
import X.AnonymousClass002;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class HatchPermissionUtils {
    public static final int $stable = 0;
    public static final HatchPermissionUtils INSTANCE = new HatchPermissionUtils();

    public final boolean hasPermission(Context context, String str) {
        boolean zA1a = AnonymousClass002.A1a(context, str);
        if (AbstractC4103Cmd.A02(context, str) == 0) {
            return zA1a;
        }
        return false;
    }

    public final boolean openAppSettings(Context context) {
        C7384Etj.A0Y(context, 0);
        return C60Q.A0S().A05(context, C60R.A09(context));
    }

    public final void openNotificationSettings(Context context) {
        C7384Etj.A0Y(context, 0);
        Intent intentPutExtra = C60P.A03("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        C7384Etj.A0U(intentPutExtra);
        try {
            C60Q.A0S().A05(context, intentPutExtra);
        } catch (ActivityNotFoundException unused) {
            openAppSettings(context);
        }
    }
}
