package com.facebook.aura.navigation.key;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LoggedOutInternalSettingsPage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LoggedOutInternalSettingsPage[] $VALUES;
    public static final LoggedOutInternalSettingsPage DEBUG;
    public static final LoggedOutInternalSettingsPage LOGIN;
    public static final LoggedOutInternalSettingsPage MAIN;
    public static final LoggedOutInternalSettingsPage SANDBOX;

    static {
        LoggedOutInternalSettingsPage loggedOutInternalSettingsPage = new LoggedOutInternalSettingsPage("MAIN", 0);
        MAIN = loggedOutInternalSettingsPage;
        LoggedOutInternalSettingsPage loggedOutInternalSettingsPage2 = new LoggedOutInternalSettingsPage("SANDBOX", 1);
        SANDBOX = loggedOutInternalSettingsPage2;
        LoggedOutInternalSettingsPage loggedOutInternalSettingsPage3 = new LoggedOutInternalSettingsPage("DEBUG", 2);
        DEBUG = loggedOutInternalSettingsPage3;
        LoggedOutInternalSettingsPage loggedOutInternalSettingsPage4 = new LoggedOutInternalSettingsPage("LOGIN", 3);
        LOGIN = loggedOutInternalSettingsPage4;
        LoggedOutInternalSettingsPage[] loggedOutInternalSettingsPageArr = {loggedOutInternalSettingsPage, loggedOutInternalSettingsPage2, loggedOutInternalSettingsPage3, loggedOutInternalSettingsPage4};
        $VALUES = loggedOutInternalSettingsPageArr;
        $ENTRIES = C3cG.A0w(loggedOutInternalSettingsPageArr);
    }

    public static Ey9<LoggedOutInternalSettingsPage> getEntries() {
        return $ENTRIES;
    }

    public static LoggedOutInternalSettingsPage valueOf(String str) {
        return (LoggedOutInternalSettingsPage) Enum.valueOf(LoggedOutInternalSettingsPage.class, str);
    }

    public static LoggedOutInternalSettingsPage[] values() {
        return (LoggedOutInternalSettingsPage[]) $VALUES.clone();
    }

    public LoggedOutInternalSettingsPage(String str, int i) {
    }
}
