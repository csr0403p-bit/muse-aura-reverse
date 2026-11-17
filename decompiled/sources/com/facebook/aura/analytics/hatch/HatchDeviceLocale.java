package com.facebook.aura.analytics.hatch;

import X.C7384Etj;
import android.content.res.Resources;
import android.icu.util.ULocale;
import android.os.LocaleList;

/* loaded from: classes.dex */
public final class HatchDeviceLocale {
    public static final int $stable = 0;
    public static final HatchDeviceLocale INSTANCE = new HatchDeviceLocale();

    public final String getIdentifier() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        C7384Etj.A0U(locales);
        if (!locales.isEmpty()) {
            String baseName = ULocale.forLocale(locales.get(0)).getBaseName();
            C7384Etj.A0X(baseName);
            if (baseName.length() > 0) {
                return baseName;
            }
        }
        return null;
    }
}
