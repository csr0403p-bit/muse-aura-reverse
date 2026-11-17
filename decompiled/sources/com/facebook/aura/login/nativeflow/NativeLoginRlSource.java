package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.common.appname.HatchAppName;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NativeLoginRlSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginRlSource[] $VALUES;
    public static final NativeLoginRlSource C50;
    public static final NativeLoginRlSource MUSE;
    public final String key;

    static {
        NativeLoginRlSource nativeLoginRlSource = new NativeLoginRlSource("C50", 0, "C50");
        C50 = nativeLoginRlSource;
        NativeLoginRlSource nativeLoginRlSource2 = new NativeLoginRlSource("MUSE", 1, HatchAppName.value);
        MUSE = nativeLoginRlSource2;
        NativeLoginRlSource[] nativeLoginRlSourceArr = {nativeLoginRlSource, nativeLoginRlSource2};
        $VALUES = nativeLoginRlSourceArr;
        $ENTRIES = C3cG.A0w(nativeLoginRlSourceArr);
    }

    public static Ey9<NativeLoginRlSource> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginRlSource valueOf(String str) {
        return (NativeLoginRlSource) Enum.valueOf(NativeLoginRlSource.class, str);
    }

    public static NativeLoginRlSource[] values() {
        return (NativeLoginRlSource[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    public NativeLoginRlSource(String str, int i, String str2) {
        this.key = str2;
    }
}
