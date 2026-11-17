package com.facebook.aura.assist;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AssistOverlayMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AssistOverlayMode[] $VALUES;
    public static final AssistOverlayMode KEYBOARD;
    public static final AssistOverlayMode VOICE;

    static {
        AssistOverlayMode assistOverlayMode = new AssistOverlayMode("VOICE", 0);
        VOICE = assistOverlayMode;
        AssistOverlayMode assistOverlayMode2 = new AssistOverlayMode("KEYBOARD", 1);
        KEYBOARD = assistOverlayMode2;
        AssistOverlayMode[] assistOverlayModeArr = {assistOverlayMode, assistOverlayMode2};
        $VALUES = assistOverlayModeArr;
        $ENTRIES = C3cG.A0w(assistOverlayModeArr);
    }

    public static Ey9<AssistOverlayMode> getEntries() {
        return $ENTRIES;
    }

    public static AssistOverlayMode valueOf(String str) {
        return (AssistOverlayMode) Enum.valueOf(AssistOverlayMode.class, str);
    }

    public static AssistOverlayMode[] values() {
        return (AssistOverlayMode[]) $VALUES.clone();
    }

    public AssistOverlayMode(String str, int i) {
    }
}
