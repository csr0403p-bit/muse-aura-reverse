package com.facebook.aura.widgets;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;

/* loaded from: classes3.dex */
public final class SpaceWidgetReceiver extends GlanceAppWidgetReceiver {
    public final GlanceAppWidget glanceAppWidget = new SpaceWidget();
    public static final Companion Companion = new Companion();
    public static final int $stable = GlanceAppWidgetReceiver.$stable | GlanceAppWidget.$stable;

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

    private final Integer appWidgetId(Intent intent) {
        int intExtra = intent.getIntExtra("appWidgetId", 0);
        Integer numValueOf = Integer.valueOf(intExtra);
        if (intExtra == 0) {
            return null;
        }
        return numValueOf;
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver
    public GlanceAppWidget getGlanceAppWidget() {
        return this.glanceAppWidget;
    }

    public final class Companion {
        public final PendingIntent pinCallback(Context context, String str, String str2) {
            AnonymousClass005.A10(context, str, str2);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SpaceWidgetReceiver.class).setAction(SpaceWidgetReceiverKt.ACTION_PIN).setData(Uri.fromParts("aura-space-widget-pin", str, null)).putExtra(SpaceWidgetReceiverKt.EXTRA_SLUG, str).putExtra(SpaceWidgetReceiverKt.EXTRA_TITLE, str2), 167772160);
            C7384Etj.A0U(broadcast);
            return broadcast;
        }

        public final Intent refreshIntent(Context context, int i) {
            C7384Etj.A0Y(context, 0);
            Intent intentPutExtra = new Intent(context, (Class<?>) SpaceWidgetReceiver.class).setAction(SpaceWidgetReceiverKt.ACTION_REFRESH).setData(Uri.fromParts("aura-space-widget", String.valueOf(i), null)).putExtra("appWidgetId", i);
            C7384Etj.A0U(intentPutExtra);
            return intentPutExtra;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        AnonymousClass005.A0y(context, appWidgetManager, bundle);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        SpaceWidgetRefreshWorker.Companion.enqueueAfterResize(context, i);
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider
    public void onDeleted(final Context context, final int[] iArr) {
        AnonymousClass003.A0u(context, iArr);
        super.onDeleted(context, iArr);
        for (int i : iArr) {
            SpaceWidgetRefreshWorker.Companion.cancel(context, i);
        }
        C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.widgets.SpaceWidgetReceiver.onDeleted.2
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr2 = iArr;
                Context context2 = context;
                for (int i2 : iArr2) {
                    SpaceWidgetStore.INSTANCE.deleteSnapshot(context2, i2);
                }
            }
        });
    }

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        AnonymousClass003.A0u(context, intent);
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1374596467) {
                if (iHashCode != 730460115) {
                    if (iHashCode == 1737074039 && action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                        C7384Etj.A0X(appWidgetManager);
                        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) SpaceWidgetReceiver.class));
                        C7384Etj.A0U(appWidgetIds);
                        onUpdate(context, appWidgetManager, appWidgetIds);
                        return;
                    }
                } else if (action.equals(SpaceWidgetReceiverKt.ACTION_REFRESH)) {
                    Integer numAppWidgetId = appWidgetId(intent);
                    if (numAppWidgetId != null) {
                        SpaceWidgetRefreshWorker.Companion.enqueue(context, numAppWidgetId.intValue());
                        return;
                    }
                    return;
                }
            } else if (action.equals(SpaceWidgetReceiverKt.ACTION_PIN)) {
                Integer numAppWidgetId2 = appWidgetId(intent);
                if (numAppWidgetId2 != null) {
                    int iIntValue = numAppWidgetId2.intValue();
                    String stringExtra2 = intent.getStringExtra(SpaceWidgetReceiverKt.EXTRA_SLUG);
                    if (stringExtra2 == null || (stringExtra = intent.getStringExtra(SpaceWidgetReceiverKt.EXTRA_TITLE)) == null) {
                        return;
                    }
                    SpaceWidgetRefreshWorker.Companion.enqueueSelection(context, iIntValue, stringExtra2, stringExtra);
                    return;
                }
                return;
            }
        }
        super.onReceive(context, intent);
    }
}
