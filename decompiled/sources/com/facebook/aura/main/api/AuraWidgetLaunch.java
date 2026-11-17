package com.facebook.aura.main.api;

import X.C7384Etj;
import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class AuraWidgetLaunch {
    public static final int $stable = 0;
    public static final String ACTIVITY_CLASS = "com.facebook.aura.main.AuraWidgetLaunchActivity";
    public static final AuraWidgetLaunch INSTANCE = new AuraWidgetLaunch();

    public final boolean isWidgetLaunch(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        ComponentName component = intent.getComponent();
        return ACTIVITY_CLASS.equals(component != null ? component.getClassName() : null);
    }
}
