package com.facebook.aura.widgets;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import X.F0C;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;

/* loaded from: classes3.dex */
public abstract class ListWidgetReceiver extends GlanceAppWidgetReceiver {
    public final F0C glanceAppWidget$delegate = AbstractC5321DgF.A03(new ListWidgetReceiver$glanceAppWidget$2(this));
    public static final Companion Companion = new Companion();
    public static final int $stable = GlanceAppWidgetReceiver.$stable;

    public abstract ListWidget getListWidget$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets();

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

    public final class Companion {
        public final Intent refreshIntent(Context context, ListWidget listWidget) {
            AnonymousClass003.A0u(context, listWidget);
            Intent action = new Intent(context, listWidget.getReceiver()).setAction(ListWidgetReceiverKt.ACTION_REFRESH);
            C7384Etj.A0U(action);
            return action;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver
    public final GlanceAppWidget getGlanceAppWidget() {
        return (GlanceAppWidget) this.glanceAppWidget$delegate.getValue();
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int iHashCode;
        AnonymousClass003.A0u(context, intent);
        String action = intent.getAction();
        if (action == null || ((iHashCode = action.hashCode()) == 850777767 ? !action.equals(ListWidgetReceiverKt.ACTION_REFRESH) : !(iHashCode == 1737074039 && action.equals("android.intent.action.MY_PACKAGE_REPLACED")))) {
            super.onReceive(context, intent);
        } else {
            ListWidgetRefreshWorker.Companion.enqueue$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(context, getListWidget$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets());
        }
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        AnonymousClass005.A0x(context, appWidgetManager, iArr);
        super.onUpdate(context, appWidgetManager, iArr);
        ListWidgetRefreshWorker.Companion.enqueue$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(context, getListWidget$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets());
    }
}
