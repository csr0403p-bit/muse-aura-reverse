package com.facebook.aura.applock;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AppLockTimeout {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AppLockTimeout[] $VALUES;
    public static final Companion Companion;
    public static final AppLockTimeout DEFAULT;
    public static final AppLockTimeout FIFTEEN_MINUTES;
    public static final AppLockTimeout FIVE_MINUTES;
    public static final AppLockTimeout IMMEDIATE;
    public static final AppLockTimeout ONE_MINUTE;
    public final int seconds;

    public final class Companion {
        public Companion() {
        }

        public final AppLockTimeout fromSeconds(int i) {
            for (AppLockTimeout appLockTimeout : AppLockTimeout.values()) {
                if (appLockTimeout.getSeconds() == i) {
                    return appLockTimeout;
                }
            }
            return AppLockTimeout.DEFAULT;
        }

        public final AppLockTimeout getDEFAULT() {
            return AppLockTimeout.DEFAULT;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        AppLockTimeout appLockTimeout = new AppLockTimeout("IMMEDIATE", 0, 0);
        IMMEDIATE = appLockTimeout;
        AppLockTimeout appLockTimeout2 = new AppLockTimeout("ONE_MINUTE", 1, 60);
        ONE_MINUTE = appLockTimeout2;
        AppLockTimeout appLockTimeout3 = new AppLockTimeout("FIVE_MINUTES", 2, 300);
        FIVE_MINUTES = appLockTimeout3;
        AppLockTimeout appLockTimeout4 = new AppLockTimeout("FIFTEEN_MINUTES", 3, 900);
        FIFTEEN_MINUTES = appLockTimeout4;
        AppLockTimeout[] appLockTimeoutArr = {appLockTimeout, appLockTimeout2, appLockTimeout3, appLockTimeout4};
        $VALUES = appLockTimeoutArr;
        $ENTRIES = C3cG.A0w(appLockTimeoutArr);
        Companion = new Companion();
        DEFAULT = appLockTimeout4;
    }

    public static Ey9<AppLockTimeout> getEntries() {
        return $ENTRIES;
    }

    public static AppLockTimeout valueOf(String str) {
        return (AppLockTimeout) Enum.valueOf(AppLockTimeout.class, str);
    }

    public static AppLockTimeout[] values() {
        return (AppLockTimeout[]) $VALUES.clone();
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public AppLockTimeout(String str, int i, int i2) {
        this.seconds = i2;
    }
}
