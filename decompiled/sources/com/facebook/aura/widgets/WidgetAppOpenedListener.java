package com.facebook.aura.widgets;

import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.lifecycle.AppOpenedListener;

/* loaded from: classes3.dex */
public final class WidgetAppOpenedListener implements AppOpenedListener {
    public static final int $stable = 0;
    public static final WidgetAppOpenedListener INSTANCE = new WidgetAppOpenedListener();

    @Override // com.facebook.aura.lifecycle.AppOpenedListener
    public void onAppOpened(Context context) {
        C7384Etj.A0Y(context, 0);
        if (WidgetsGate.INSTANCE.areWidgetsEnabled(context) && HomeScreenWidgetKt.hasHomeScreenWidgets(context)) {
            WidgetSessionReconcileWorker.Companion.enqueue(context);
            WidgetPeriodicRefreshWorker.Companion.schedule(context);
        }
    }
}
