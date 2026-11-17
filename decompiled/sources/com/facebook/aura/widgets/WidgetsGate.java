package com.facebook.aura.widgets;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C31u;
import X.C7384Etj;
import X.InterfaceC7359EnW;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.widgets.MC;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class WidgetsGate {
    public static final int $stable = 0;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(WidgetsGate.class, "isEnabled", "isEnabled()Z");
    public static final WidgetsGate INSTANCE = new WidgetsGate();
    public static final C31u isEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_widgets.enable_widgets);

    public final boolean areWidgetsEnabled(Context context) {
        C7384Etj.A0Y(context, 0);
        List<HomeScreenWidget> list = HomeScreenWidgetKt.homeScreenWidgets;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<HomeScreenWidget> it = list.iterator();
            while (it.hasNext()) {
                if (INSTANCE.isComponentEnabled(context, it.next().getReceiver())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isComponentEnabled(Context context, Class<?> cls) {
        boolean zA1a = AnonymousClass002.A1a(context, cls);
        if (context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls)) == zA1a) {
            return zA1a;
        }
        return false;
    }

    public final boolean isEnabled() {
        return C31u.A01(this, isEnabled$delegate, $$delegatedProperties, 0);
    }
}
