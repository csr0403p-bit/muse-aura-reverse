package com.facebook.aura.skills.connect.config;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CustomConnectorMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CustomConnectorMode[] $VALUES;
    public static final CustomConnectorMode API_KEY;
    public static final CustomConnectorMode OAUTH;

    static {
        CustomConnectorMode customConnectorMode = new CustomConnectorMode("API_KEY", 0);
        API_KEY = customConnectorMode;
        CustomConnectorMode customConnectorMode2 = new CustomConnectorMode("OAUTH", 1);
        OAUTH = customConnectorMode2;
        CustomConnectorMode[] customConnectorModeArr = {customConnectorMode, customConnectorMode2};
        $VALUES = customConnectorModeArr;
        $ENTRIES = C3cG.A0w(customConnectorModeArr);
    }

    public static Ey9<CustomConnectorMode> getEntries() {
        return $ENTRIES;
    }

    public static CustomConnectorMode valueOf(String str) {
        return (CustomConnectorMode) Enum.valueOf(CustomConnectorMode.class, str);
    }

    public static CustomConnectorMode[] values() {
        return (CustomConnectorMode[]) $VALUES.clone();
    }

    public CustomConnectorMode(String str, int i) {
    }
}
