package com.facebook.aura.assist;

import X.C7384Etj;
import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.assist.status.HatchDefaultAssistantSettings;
import com.facebook.aura.assist.status.HatchDefaultAssistantStatus;

/* loaded from: classes2.dex */
public final class HatchAssistantRoleManager {
    public static final int $stable = 0;
    public static final HatchAssistantRoleManager INSTANCE = new HatchAssistantRoleManager();

    public final Intent createManageDefaultAppsIntent(Context context) {
        C7384Etj.A0Y(context, 0);
        return HatchDefaultAssistantSettings.INSTANCE.createManageDefaultAppsIntent(context);
    }

    public final Intent createRequestRoleIntent(Context context) {
        RoleManager roleManager;
        C7384Etj.A0Y(context, 0);
        if (!HatchDefaultAssistantStatus.INSTANCE.isAssistantRoleAvailable(context) || (roleManager = (RoleManager) context.getSystemService(RoleManager.class)) == null) {
            return null;
        }
        return roleManager.createRequestRoleIntent("android.app.role.ASSISTANT");
    }

    public final Intent createVoiceInputSettingsIntent(Context context) {
        C7384Etj.A0Y(context, 0);
        return HatchDefaultAssistantSettings.INSTANCE.createVoiceInputSettingsIntent(context);
    }

    public final boolean isDefaultAssistant(Context context) {
        C7384Etj.A0Y(context, 0);
        return HatchDefaultAssistantStatus.INSTANCE.isDefaultAssistant(context);
    }
}
