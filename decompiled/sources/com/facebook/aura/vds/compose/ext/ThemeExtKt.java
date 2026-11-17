package com.facebook.aura.vds.compose.ext;

import X.C7384Etj;
import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes6.dex */
public abstract class ThemeExtKt {
    public static final boolean isLightMode(Context context) {
        C7384Etj.A0Y(context, 0);
        Object systemService = context.getSystemService("uimode");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        return ((UiModeManager) systemService).getNightMode() == 1;
    }
}
