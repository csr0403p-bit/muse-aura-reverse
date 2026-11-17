package com.facebook.aura.assist.status;

import X.C7384Etj;
import android.app.role.RoleManager;
import android.content.Context;

/* loaded from: classes2.dex */
public final class HatchDefaultAssistantStatus {
    public static final HatchDefaultAssistantStatus INSTANCE = new HatchDefaultAssistantStatus();

    public final boolean isAssistantRoleAvailable(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            RoleManager roleManager = (RoleManager) context.getSystemService(RoleManager.class);
            if (roleManager != null) {
                return roleManager.isRoleAvailable("android.app.role.ASSISTANT");
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    public final boolean isDefaultAssistant(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            RoleManager roleManager = (RoleManager) context.getSystemService(RoleManager.class);
            if (roleManager != null) {
                return roleManager.isRoleHeld("android.app.role.ASSISTANT");
            }
        } catch (SecurityException unused) {
        }
        return false;
    }
}
