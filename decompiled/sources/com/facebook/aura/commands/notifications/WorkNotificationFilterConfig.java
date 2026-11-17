package com.facebook.aura.commands.notifications;

import X.C60P;
import android.content.Context;
import com.facebook.aura.mdm.AuraManagedConfig;
import com.facebook.aura.mdm.AuraManagedKey;

/* loaded from: classes3.dex */
public final class WorkNotificationFilterConfig {
    public static final WorkNotificationFilterConfig INSTANCE = new WorkNotificationFilterConfig();

    public final boolean isBlocked(Context context, AuraManagedKey auraManagedKey) {
        boolean zA1Y = C60P.A1Y(context, auraManagedKey);
        Boolean boolManagedBoolean = AuraManagedConfig.INSTANCE.managedBoolean(context, auraManagedKey);
        return boolManagedBoolean != null ? boolManagedBoolean.booleanValue() : zA1Y;
    }
}
