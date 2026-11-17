package com.meta.maps.display.routeline;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DottedRenderer {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DottedRenderer[] $VALUES;
    public static final DottedRenderer DASH;
    public static final DottedRenderer MARCHED;
    public static final DottedRenderer SYMBOLS;
    public final int value;

    static {
        DottedRenderer dottedRenderer = new DottedRenderer("DASH", 0, 0);
        DASH = dottedRenderer;
        DottedRenderer dottedRenderer2 = new DottedRenderer("SYMBOLS", 1, 1);
        SYMBOLS = dottedRenderer2;
        DottedRenderer dottedRenderer3 = new DottedRenderer("MARCHED", 2, 2);
        MARCHED = dottedRenderer3;
        DottedRenderer[] dottedRendererArr = {dottedRenderer, dottedRenderer2, dottedRenderer3};
        $VALUES = dottedRendererArr;
        $ENTRIES = C3cG.A0w(dottedRendererArr);
    }

    public static Ey9<DottedRenderer> getEntries() {
        return $ENTRIES;
    }

    public static DottedRenderer valueOf(String str) {
        return (DottedRenderer) Enum.valueOf(DottedRenderer.class, str);
    }

    public static DottedRenderer[] values() {
        return (DottedRenderer[]) $VALUES.clone();
    }

    public DottedRenderer(String str, int i, int i2) {
        this.value = i2;
    }
}
