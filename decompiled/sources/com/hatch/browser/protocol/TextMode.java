package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TextMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TextMode[] $VALUES;
    public static final TextMode APPEND;
    public static final Companion Companion;
    public static final TextMode REPLACE;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        TextMode textMode = new TextMode("REPLACE", 0);
        REPLACE = textMode;
        TextMode textMode2 = new TextMode("APPEND", 1);
        APPEND = textMode2;
        TextMode[] textModeArr = {textMode, textMode2};
        $VALUES = textModeArr;
        $ENTRIES = C3cG.A0w(textModeArr);
        Companion = new Companion();
    }

    public static Ey9<TextMode> getEntries() {
        return $ENTRIES;
    }

    public static TextMode valueOf(String str) {
        return (TextMode) Enum.valueOf(TextMode.class, str);
    }

    public static TextMode[] values() {
        return (TextMode[]) $VALUES.clone();
    }

    public TextMode(String str, int i) {
    }
}
