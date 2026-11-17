package com.facebook.aura.commands.notifications;

import X.C60Q;
import X.C60S;
import X.HtJ;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.R;
import com.facebook.aura.commands.core.NodePermissionActivity;
import com.facebook.aura.common.appname.HatchAppName;

/* loaded from: classes3.dex */
public final class NotificationPermissionHelper {
    public static final String EXTRA_FRAGMENT_ARGS_KEY = ":settings:fragment_args_key";
    public static final String EXTRA_SHOW_BUTTON_BAR = "EXTRA_PREFS_SHOW_BUTTON_BAR";
    public static final String EXTRA_SHOW_FRAGMENT_ARGS = ":settings:show_fragment_args";
    public static final NotificationPermissionHelper INSTANCE = new NotificationPermissionHelper();

    private final Intent buildNotificationSettingsIntent(Context context) {
        return C60S.A00(new ComponentName(context, (Class<?>) NodeNotificationListenerService.class));
    }

    public final Object requestAccess(Context context, HtJ<? super Boolean> htJ) {
        return NodePermissionActivity.Companion.requestSettingsPermission(context, buildNotificationSettingsIntent(context), context.getString(R.string._name_removed__res_0x7f120b87), C60Q.A0b(context, HatchAppName.value, R.string._name_removed__res_0x7f120b86), false, htJ);
    }
}
