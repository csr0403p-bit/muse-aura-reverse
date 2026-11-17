package com.facebook.aura.widgets;

import X.AnonymousClass005;
import X.C7384Etj;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.aura.widgets.intf.SpaceWidgetPinning;
import com.facebook.aura.widgets.intf.SpaceWidgetPinningProvider;

/* loaded from: classes3.dex */
public final class SpaceWidgetPinner implements SpaceWidgetPinning, SpaceWidgetPinningProvider {
    public static final int $stable = 0;
    public static final SpaceWidgetPinner INSTANCE = new SpaceWidgetPinner();

    @Override // com.facebook.aura.widgets.intf.SpaceWidgetPinning
    public boolean isSupported(Context context) {
        C7384Etj.A0Y(context, 0);
        return WidgetsGate.INSTANCE.isEnabled() && context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, (Class<?>) SpaceWidgetReceiver.class)) == 1 && AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported();
    }

    @Override // com.facebook.aura.widgets.intf.SpaceWidgetPinning
    public boolean requestPin(Context context, String str, String str2) {
        boolean zA1Z = AnonymousClass005.A1Z(context, str, str2);
        if (WidgetsGate.INSTANCE.isEnabled() && AppWidgetManager.getInstance(context).requestPinAppWidget(new ComponentName(context, (Class<?>) SpaceWidgetReceiver.class), null, SpaceWidgetReceiver.Companion.pinCallback(context, str, str2))) {
            return zA1Z;
        }
        return false;
    }

    private final ComponentName provider(Context context) {
        return new ComponentName(context, (Class<?>) SpaceWidgetReceiver.class);
    }

    @Override // com.facebook.aura.widgets.intf.SpaceWidgetPinningProvider
    public SpaceWidgetPinning pinning() {
        return this;
    }
}
