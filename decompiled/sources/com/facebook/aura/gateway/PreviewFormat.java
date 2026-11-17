package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PreviewFormat {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PreviewFormat[] $VALUES;
    public static final PreviewFormat INSTANT;
    public static final PreviewFormat TEXT;
    public static final PreviewFormat WINDOW_DATE;

    static {
        PreviewFormat previewFormat = new PreviewFormat("TEXT", 0);
        TEXT = previewFormat;
        PreviewFormat previewFormat2 = new PreviewFormat("WINDOW_DATE", 1);
        WINDOW_DATE = previewFormat2;
        PreviewFormat previewFormat3 = new PreviewFormat("INSTANT", 2);
        INSTANT = previewFormat3;
        PreviewFormat[] previewFormatArr = {previewFormat, previewFormat2, previewFormat3};
        $VALUES = previewFormatArr;
        $ENTRIES = C3cG.A0w(previewFormatArr);
    }

    public static Ey9<PreviewFormat> getEntries() {
        return $ENTRIES;
    }

    public static PreviewFormat valueOf(String str) {
        return (PreviewFormat) Enum.valueOf(PreviewFormat.class, str);
    }

    public static PreviewFormat[] values() {
        return (PreviewFormat[]) $VALUES.clone();
    }

    public PreviewFormat(String str, int i) {
    }
}
