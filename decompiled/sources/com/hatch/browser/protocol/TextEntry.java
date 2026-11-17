package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TextEntry {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TextEntry[] $VALUES;
    public static final Companion Companion;
    public static final TextEntry PASTE;
    public static final TextEntry TYPING;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        TextEntry textEntry = new TextEntry("TYPING", 0);
        TYPING = textEntry;
        TextEntry textEntry2 = new TextEntry("PASTE", 1);
        PASTE = textEntry2;
        TextEntry[] textEntryArr = {textEntry, textEntry2};
        $VALUES = textEntryArr;
        $ENTRIES = C3cG.A0w(textEntryArr);
        Companion = new Companion();
    }

    public static Ey9<TextEntry> getEntries() {
        return $ENTRIES;
    }

    public static TextEntry valueOf(String str) {
        return (TextEntry) Enum.valueOf(TextEntry.class, str);
    }

    public static TextEntry[] values() {
        return (TextEntry[]) $VALUES.clone();
    }

    public TextEntry(String str, int i) {
    }
}
