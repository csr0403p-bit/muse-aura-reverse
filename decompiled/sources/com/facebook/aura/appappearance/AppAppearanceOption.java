package com.facebook.aura.appappearance;

import X.C06H;
import X.Ey9;
import X.F3w;
import com.facebook.aura.R;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AppAppearanceOption {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AppAppearanceOption[] $VALUES;
    public static final Companion Companion;
    public static final AppAppearanceOption DARK;
    public static final AppAppearanceOption LIGHT;
    public static final AppAppearanceOption SYSTEM;
    public final int titleRes;
    public final int value;

    static {
        AppAppearanceOption appAppearanceOption = new AppAppearanceOption("SYSTEM", 0, -1, R.string._name_removed__res_0x7f120161);
        SYSTEM = appAppearanceOption;
        AppAppearanceOption appAppearanceOption2 = new AppAppearanceOption("LIGHT", 1, 1, R.string._name_removed__res_0x7f12015f);
        LIGHT = appAppearanceOption2;
        AppAppearanceOption appAppearanceOption3 = new AppAppearanceOption("DARK", 2, 2, R.string._name_removed__res_0x7f12015e);
        DARK = appAppearanceOption3;
        AppAppearanceOption[] appAppearanceOptionArr = {appAppearanceOption, appAppearanceOption2, appAppearanceOption3};
        $VALUES = appAppearanceOptionArr;
        $ENTRIES = new F3w(appAppearanceOptionArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final AppAppearanceOption fromValue(int i) {
            AppAppearanceOption next;
            Iterator<AppAppearanceOption> it = AppAppearanceOption.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == i) {
                    break;
                }
            }
            AppAppearanceOption appAppearanceOption = next;
            return appAppearanceOption == null ? AppAppearanceOption.SYSTEM : appAppearanceOption;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<AppAppearanceOption> getEntries() {
        return $ENTRIES;
    }

    public static AppAppearanceOption valueOf(String str) {
        return (AppAppearanceOption) Enum.valueOf(AppAppearanceOption.class, str);
    }

    public static AppAppearanceOption[] values() {
        return (AppAppearanceOption[]) $VALUES.clone();
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getValue() {
        return this.value;
    }

    public AppAppearanceOption(String str, int i, int i2, int i3) {
        this.value = i2;
        this.titleRes = i3;
    }
}
