package com.facebook.aura.gateway.store;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PhoneNotificationsAccessMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PhoneNotificationsAccessMode[] $VALUES;
    public static final PhoneNotificationsAccessMode ALL;
    public static final PhoneNotificationsAccessMode SELECTED;

    static {
        PhoneNotificationsAccessMode phoneNotificationsAccessMode = new PhoneNotificationsAccessMode("ALL", 0);
        ALL = phoneNotificationsAccessMode;
        PhoneNotificationsAccessMode phoneNotificationsAccessMode2 = new PhoneNotificationsAccessMode("SELECTED", 1);
        SELECTED = phoneNotificationsAccessMode2;
        PhoneNotificationsAccessMode[] phoneNotificationsAccessModeArr = {phoneNotificationsAccessMode, phoneNotificationsAccessMode2};
        $VALUES = phoneNotificationsAccessModeArr;
        $ENTRIES = C3cG.A0w(phoneNotificationsAccessModeArr);
    }

    public static Ey9<PhoneNotificationsAccessMode> getEntries() {
        return $ENTRIES;
    }

    public static PhoneNotificationsAccessMode valueOf(String str) {
        return (PhoneNotificationsAccessMode) Enum.valueOf(PhoneNotificationsAccessMode.class, str);
    }

    public static PhoneNotificationsAccessMode[] values() {
        return (PhoneNotificationsAccessMode[]) $VALUES.clone();
    }

    public PhoneNotificationsAccessMode(String str, int i) {
    }
}
