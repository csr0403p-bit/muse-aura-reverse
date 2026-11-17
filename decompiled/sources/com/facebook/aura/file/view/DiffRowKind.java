package com.facebook.aura.file.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DiffRowKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DiffRowKind[] $VALUES;
    public static final DiffRowKind ADDED;
    public static final DiffRowKind CONTEXT;
    public static final DiffRowKind HUNK;
    public static final DiffRowKind REMOVED;

    static {
        DiffRowKind diffRowKind = new DiffRowKind("CONTEXT", 0);
        CONTEXT = diffRowKind;
        DiffRowKind diffRowKind2 = new DiffRowKind("ADDED", 1);
        ADDED = diffRowKind2;
        DiffRowKind diffRowKind3 = new DiffRowKind("REMOVED", 2);
        REMOVED = diffRowKind3;
        DiffRowKind diffRowKind4 = new DiffRowKind("HUNK", 3);
        HUNK = diffRowKind4;
        DiffRowKind[] diffRowKindArr = {diffRowKind, diffRowKind2, diffRowKind3, diffRowKind4};
        $VALUES = diffRowKindArr;
        $ENTRIES = new F3w(diffRowKindArr);
    }

    public static Ey9<DiffRowKind> getEntries() {
        return $ENTRIES;
    }

    public static DiffRowKind valueOf(String str) {
        return (DiffRowKind) Enum.valueOf(DiffRowKind.class, str);
    }

    public static DiffRowKind[] values() {
        return (DiffRowKind[]) $VALUES.clone();
    }

    public DiffRowKind(String str, int i) {
    }
}
