package com.facebook.aura.login.nativeflow;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NativeLoginTitleStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginTitleStyle[] $VALUES;
    public static final NativeLoginTitleStyle TEXT;
    public static final NativeLoginTitleStyle TEXT_MEDIUM;

    static {
        NativeLoginTitleStyle nativeLoginTitleStyle = new NativeLoginTitleStyle("TEXT", 0);
        TEXT = nativeLoginTitleStyle;
        NativeLoginTitleStyle nativeLoginTitleStyle2 = new NativeLoginTitleStyle("TEXT_MEDIUM", 1);
        TEXT_MEDIUM = nativeLoginTitleStyle2;
        NativeLoginTitleStyle[] nativeLoginTitleStyleArr = {nativeLoginTitleStyle, nativeLoginTitleStyle2};
        $VALUES = nativeLoginTitleStyleArr;
        $ENTRIES = new F3w(nativeLoginTitleStyleArr);
    }

    public static Ey9<NativeLoginTitleStyle> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginTitleStyle valueOf(String str) {
        return (NativeLoginTitleStyle) Enum.valueOf(NativeLoginTitleStyle.class, str);
    }

    public static NativeLoginTitleStyle[] values() {
        return (NativeLoginTitleStyle[]) $VALUES.clone();
    }

    public NativeLoginTitleStyle(String str, int i) {
    }
}
