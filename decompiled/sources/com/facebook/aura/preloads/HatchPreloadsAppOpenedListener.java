package com.facebook.aura.preloads;

import X.C7384Etj;
import X.EnumC7554F3f;
import android.content.Context;
import com.facebook.aura.lifecycle.AppOpenedListener;

/* loaded from: classes5.dex */
public final class HatchPreloadsAppOpenedListener implements AppOpenedListener {
    public static final HatchPreloadsAppOpenedListener INSTANCE = new HatchPreloadsAppOpenedListener();

    @Override // com.facebook.aura.lifecycle.AppOpenedListener
    public void onAppOpened(Context context) {
        C7384Etj.A0Y(context, 0);
        HatchPreloadsFoaEngagementEventReporter.INSTANCE.reportEvent(context, EnumC7554F3f.APP_OPEN);
    }
}
