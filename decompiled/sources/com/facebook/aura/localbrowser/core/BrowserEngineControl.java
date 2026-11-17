package com.facebook.aura.localbrowser.core;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrowserEngineControl {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserEngineControl[] $VALUES;
    public static final BrowserEngineControl AUTOMATION;
    public static final BrowserEngineControl HUMAN;
    public static final BrowserEngineControl STOPPED;

    static {
        BrowserEngineControl browserEngineControl = new BrowserEngineControl("AUTOMATION", 0);
        AUTOMATION = browserEngineControl;
        BrowserEngineControl browserEngineControl2 = new BrowserEngineControl("HUMAN", 1);
        HUMAN = browserEngineControl2;
        BrowserEngineControl browserEngineControl3 = new BrowserEngineControl("STOPPED", 2);
        STOPPED = browserEngineControl3;
        BrowserEngineControl[] browserEngineControlArr = {browserEngineControl, browserEngineControl2, browserEngineControl3};
        $VALUES = browserEngineControlArr;
        $ENTRIES = C3cG.A0w(browserEngineControlArr);
    }

    public static Ey9<BrowserEngineControl> getEntries() {
        return $ENTRIES;
    }

    public static BrowserEngineControl valueOf(String str) {
        return (BrowserEngineControl) Enum.valueOf(BrowserEngineControl.class, str);
    }

    public static BrowserEngineControl[] values() {
        return (BrowserEngineControl[]) $VALUES.clone();
    }

    public BrowserEngineControl(String str, int i) {
    }
}
