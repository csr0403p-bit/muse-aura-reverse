package com.facebook.aura.appappearance;

import X.BV4;
import X.C7384Etj;
import X.EC9;
import X.LayoutInflaterFactory2C8250FaT;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.facebook.aura.common.apptheme.AuraAppTheme;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class HatchAppAppearanceManager {
    public static final int $stable = 0;
    public static final HatchAppAppearanceManager INSTANCE = new HatchAppAppearanceManager();

    private final int savedValueToNightMode(int i) {
        if (i != 1) {
            return i != 2 ? -1 : 2;
        }
        return 1;
    }

    public final void applySavedAppearance(Context context) {
        C7384Etj.A0Y(context, 0);
        applyNightMode(context, getSavedNightMode(context));
    }

    public final int getSavedNightMode(Context context) {
        C7384Etj.A0Y(context, 0);
        int i = context.getSharedPreferences("slv_settings", 0).getInt("slv_app_appearance_settings_key", -1);
        if (i != 1) {
            return i != 2 ? -1 : 2;
        }
        return 1;
    }

    public final int getSavedValue$fbandroid_express_aura_java_com_facebook_aura_appappearance_appappearance(Context context) {
        C7384Etj.A0Y(context, 0);
        return context.getSharedPreferences("slv_settings", 0).getInt("slv_app_appearance_settings_key", -1);
    }

    public final void setAppearance(Context context, int i) {
        C7384Etj.A0Y(context, 0);
        context.getSharedPreferences("slv_settings", 0).edit().putInt("slv_app_appearance_settings_key", i).apply();
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = -1;
            }
        }
        applyNightMode(context, i2);
    }

    private final void applyNightMode(Context context, int i) {
        boolean z = EC9.A05;
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (EC9.A00 != i) {
            EC9.A00 = i;
            synchronized (EC9.A07) {
                Iterator<WeakReference<EC9>> it = EC9.A06.iterator();
                while (it.hasNext()) {
                    EC9 ec9 = it.next().get();
                    if (ec9 != null) {
                        LayoutInflaterFactory2C8250FaT.A0G((LayoutInflaterFactory2C8250FaT) ec9, true, true);
                    }
                }
            }
        }
        applyPlatformApplicationNightMode(context, i);
        AuraAppTheme.INSTANCE.refresh();
    }

    private final void applyPlatformApplicationNightMode(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 0;
                }
            }
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
            if (uiModeManager != null) {
                try {
                    uiModeManager.setApplicationNightMode(i2);
                } catch (IllegalStateException | NoSuchMethodError unused) {
                }
            }
        }
    }

    private final SharedPreferences prefs(Context context) {
        return BV4.A07(context, "slv_settings");
    }
}
