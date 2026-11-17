package com.facebook.aura.widgets;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.F0C;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;

/* loaded from: classes3.dex */
public abstract class AgentWidgetReceiver extends GlanceAppWidgetReceiver {
    public static final int $stable = GlanceAppWidgetReceiver.$stable;
    public final F0C glanceAppWidget$delegate = AbstractC5321DgF.A03(new AgentWidgetReceiver$glanceAppWidget$2(this));

    public abstract AgentWidget getAgentWidget$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets();

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        C7384Etj.A0Y(context, 0);
        super.onDisabled(context);
        if (HomeScreenWidgetKt.hasHomeScreenWidgets(context)) {
            return;
        }
        WidgetPeriodicRefreshWorker.Companion.cancel(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        C7384Etj.A0Y(context, 0);
        super.onEnabled(context);
        WidgetPeriodicRefreshWorker.Companion.schedule(context);
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver
    public final GlanceAppWidget getGlanceAppWidget() {
        return (GlanceAppWidget) this.glanceAppWidget$delegate.getValue();
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AnonymousClass003.A0u(context, intent);
        if (!"android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            super.onReceive(context, intent);
            return;
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        C7384Etj.A0X(appWidgetManager);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, getClass()));
        C7384Etj.A0U(appWidgetIds);
        onUpdate(context, appWidgetManager, appWidgetIds);
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        AnonymousClass005.A0x(context, appWidgetManager, iArr);
        super.onUpdate(context, appWidgetManager, iArr);
        AgentWidgetRefreshWorker.Companion.enqueue$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(context, getAgentWidget$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets());
    }
}
