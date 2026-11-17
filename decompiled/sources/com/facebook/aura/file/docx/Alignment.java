package com.facebook.aura.file.docx;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Alignment {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ Alignment[] $VALUES;
    public static final Alignment CENTER;
    public static final Alignment JUSTIFY;
    public static final Alignment LEFT;
    public static final Alignment RIGHT;

    static {
        Alignment alignment = new Alignment("LEFT", 0);
        LEFT = alignment;
        Alignment alignment2 = new Alignment("CENTER", 1);
        CENTER = alignment2;
        Alignment alignment3 = new Alignment("RIGHT", 2);
        RIGHT = alignment3;
        Alignment alignment4 = new Alignment("JUSTIFY", 3);
        JUSTIFY = alignment4;
        Alignment[] alignmentArr = {alignment, alignment2, alignment3, alignment4};
        $VALUES = alignmentArr;
        $ENTRIES = C3cG.A0w(alignmentArr);
    }

    public static Ey9<Alignment> getEntries() {
        return $ENTRIES;
    }

    public static Alignment valueOf(String str) {
        return (Alignment) Enum.valueOf(Alignment.class, str);
    }

    public static Alignment[] values() {
        return (Alignment[]) $VALUES.clone();
    }

    public Alignment(String str, int i) {
    }
}
