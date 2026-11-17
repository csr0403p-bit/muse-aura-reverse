package com.facebook.aura.library.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LibraryViewMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LibraryViewMode[] $VALUES;
    public static final LibraryViewMode GRID;
    public static final LibraryViewMode LIST;

    static {
        LibraryViewMode libraryViewMode = new LibraryViewMode("GRID", 0);
        GRID = libraryViewMode;
        LibraryViewMode libraryViewMode2 = new LibraryViewMode("LIST", 1);
        LIST = libraryViewMode2;
        LibraryViewMode[] libraryViewModeArr = {libraryViewMode, libraryViewMode2};
        $VALUES = libraryViewModeArr;
        $ENTRIES = new F3w(libraryViewModeArr);
    }

    public static Ey9<LibraryViewMode> getEntries() {
        return $ENTRIES;
    }

    public static LibraryViewMode valueOf(String str) {
        return (LibraryViewMode) Enum.valueOf(LibraryViewMode.class, str);
    }

    public static LibraryViewMode[] values() {
        return (LibraryViewMode[]) $VALUES.clone();
    }

    public LibraryViewMode(String str, int i) {
    }
}
