package com.facebook.aura.widgets;

import X.AbstractC0878AGe;
import X.BzK;
import X.C3cG;
import X.C4oT;
import X.C60R;
import X.C7384Etj;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import com.facebook.aura.analytics.hatch.HatchWidgetTelemetry;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class WidgetInventory {
    public static final int $stable = 0;
    public static final WidgetInventory INSTANCE = new WidgetInventory();

    public final void log(Context context) {
        C7384Etj.A0Y(context, 0);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        List<HomeScreenWidget> list = HomeScreenWidgetKt.homeScreenWidgets;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HomeScreenWidget homeScreenWidget : list) {
            HomeScreenWidget homeScreenWidget2 = homeScreenWidget;
            if (WidgetsGate.INSTANCE.isComponentEnabled(context, homeScreenWidget2.getReceiver())) {
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, homeScreenWidget2.getReceiver()));
                C7384Etj.A0U(appWidgetIds);
                if (appWidgetIds.length != 0) {
                    arrayListA0h.add(homeScreenWidget);
                }
            }
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(((HomeScreenWidget) it.next()).getKind());
        }
        C4oT c4oT = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.HOME_SCREEN_WIDGETS);
        Set set = null;
        Set<String> stringSet = c4oT.getStringSet(WidgetInventoryKt.INVENTORY_KEY, null);
        if (stringSet != null) {
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (String str : stringSet) {
                Iterator<HatchWidgetKind> it2 = HatchWidgetKind.getEntries().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        HatchWidgetKind next = it2.next();
                        if (C7384Etj.areEqual(next.getValue(), str)) {
                            if (next != null) {
                                arrayListA0h2.add(next);
                            }
                        }
                    }
                }
            }
            Set setA0g = AbstractC0878AGe.A0g(arrayListA0h2);
            if (setA0g != null && setA0g.size() == stringSet.size()) {
                set = setA0g;
                ArrayList arrayListA0h3 = C3cG.A0h();
                Iterator it3 = linkedHashSetA0k.iterator();
                while (it3.hasNext()) {
                    C60R.A1P(arrayListA0h3, it3, setA0g);
                }
                HatchWidgetTelemetry hatchWidgetTelemetry = HatchWidgetTelemetry.INSTANCE;
                Iterator it4 = arrayListA0h3.iterator();
                while (it4.hasNext()) {
                    hatchWidgetTelemetry.logInstalled((HatchWidgetKind) it4.next());
                }
                ArrayList arrayListA0h4 = C3cG.A0h();
                Iterator it5 = setA0g.iterator();
                while (it5.hasNext()) {
                    C60R.A1P(arrayListA0h4, it5, linkedHashSetA0k);
                }
                Iterator it6 = arrayListA0h4.iterator();
                while (it6.hasNext()) {
                    hatchWidgetTelemetry.logUninstalled((HatchWidgetKind) it6.next());
                }
            }
        }
        long epochDay = LocalDate.now().toEpochDay();
        if (set == null || c4oT.getLong(WidgetInventoryKt.INVENTORY_LOGGED_DAY_KEY, -1L) != epochDay) {
            HatchWidgetTelemetry.INSTANCE.logInventory(linkedHashSetA0k);
        } else if (set.equals(linkedHashSetA0k)) {
            return;
        }
        BzK bzKA9q = c4oT.A9q();
        LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
        Iterator it7 = linkedHashSetA0k.iterator();
        while (it7.hasNext()) {
            linkedHashSetA0k2.add(((HatchWidgetKind) it7.next()).getValue());
        }
        bzKA9q.A09(WidgetInventoryKt.INVENTORY_KEY, linkedHashSetA0k2);
        bzKA9q.AYp(WidgetInventoryKt.INVENTORY_LOGGED_DAY_KEY, epochDay);
        bzKA9q.apply();
    }
}
