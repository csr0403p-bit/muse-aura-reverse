package com.facebook.aura.library.repo;

import X.Ey9;
import X.F3w;
import com.facebook.aura.library.model.HatchLibraryViewModelKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FilesSortMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FilesSortMode[] $VALUES;
    public static final FilesSortMode DATE;
    public static final FilesSortMode NAME;
    public static final FilesSortMode TYPE;
    public final String label;

    static {
        FilesSortMode filesSortMode = new FilesSortMode(HatchLibraryViewModelKt.LEGACY_SORT_NAME, 0, "Name");
        NAME = filesSortMode;
        FilesSortMode filesSortMode2 = new FilesSortMode("TYPE", 1, "Type");
        TYPE = filesSortMode2;
        FilesSortMode filesSortMode3 = new FilesSortMode("DATE", 2, "Date");
        DATE = filesSortMode3;
        FilesSortMode[] filesSortModeArr = {filesSortMode, filesSortMode2, filesSortMode3};
        $VALUES = filesSortModeArr;
        $ENTRIES = new F3w(filesSortModeArr);
    }

    public static Ey9<FilesSortMode> getEntries() {
        return $ENTRIES;
    }

    public static FilesSortMode valueOf(String str) {
        return (FilesSortMode) Enum.valueOf(FilesSortMode.class, str);
    }

    public static FilesSortMode[] values() {
        return (FilesSortMode[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }

    public FilesSortMode(String str, int i, String str2) {
        this.label = str2;
    }
}
