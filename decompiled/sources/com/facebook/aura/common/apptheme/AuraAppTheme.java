package com.facebook.aura.common.apptheme;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3cI;
import X.C4JM;
import X.C7384Etj;
import X.C9286GCn;
import X.EC9;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.aura.common.appcontext.AuraAppContext;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class AuraAppTheme {
    public static final String PREF_FILE = "slv_settings";
    public static final String PREF_KEY = "slv_app_appearance_settings_key";
    public static final int VALUE_AUTOMATIC = -1;
    public static final int VALUE_DARK = 2;
    public static final int VALUE_LIGHT = 1;
    public static final AuraAppTheme INSTANCE = new AuraAppTheme();
    public static final BLG<Boolean> dark = new C9286GCn(AnonymousClass001.A0h());
    public static final AtomicBoolean listening = new AtomicBoolean();

    public final synchronized void refresh() {
        dark.Af8(Boolean.valueOf(isDark()));
    }

    private final boolean isNight(Configuration configuration) {
        return AnonymousClass002.A1Q(configuration.uiMode & 48, 32);
    }

    private final void listen() {
        Application application = C4JM.A00;
        if (application == null || !C3cI.A1W(listening)) {
            return;
        }
        application.registerComponentCallbacks(new ComponentCallbacks() { // from class: com.facebook.aura.common.apptheme.AuraAppTheme.listen.1
            @Override // android.content.ComponentCallbacks
            @Deprecated(message = "Deprecated in Java")
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
                AuraAppTheme.INSTANCE.refresh();
            }
        });
        refresh();
    }

    public final boolean isDark() {
        int i;
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context == null || (i = EC9.A00) == 1) {
            return false;
        }
        if (i != 2) {
            int i2 = context.getSharedPreferences("slv_settings", 0).getInt("slv_app_appearance_settings_key", -1);
            if (i2 == 1) {
                return false;
            }
            if (i2 != 2) {
                Configuration configuration = context.getResources().getConfiguration();
                C7384Etj.A0U(configuration);
                return isNight(configuration);
            }
        }
        return true;
    }

    public final C1BN<Boolean> isDarkFlow() {
        listen();
        return C3Pi.A00(dark);
    }
}
