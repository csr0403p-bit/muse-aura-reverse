package com.facebook.aura.login.nativeflow;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NativeLoginPasswordSubtitleArgs {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginPasswordSubtitleArgs[] $VALUES;
    public static final NativeLoginPasswordSubtitleArgs APP;
    public static final NativeLoginPasswordSubtitleArgs APP_DESTINATION;
    public static final NativeLoginPasswordSubtitleArgs DESTINATION;

    static {
        NativeLoginPasswordSubtitleArgs nativeLoginPasswordSubtitleArgs = new NativeLoginPasswordSubtitleArgs("DESTINATION", 0);
        DESTINATION = nativeLoginPasswordSubtitleArgs;
        NativeLoginPasswordSubtitleArgs nativeLoginPasswordSubtitleArgs2 = new NativeLoginPasswordSubtitleArgs("APP", 1);
        APP = nativeLoginPasswordSubtitleArgs2;
        NativeLoginPasswordSubtitleArgs nativeLoginPasswordSubtitleArgs3 = new NativeLoginPasswordSubtitleArgs("APP_DESTINATION", 2);
        APP_DESTINATION = nativeLoginPasswordSubtitleArgs3;
        NativeLoginPasswordSubtitleArgs[] nativeLoginPasswordSubtitleArgsArr = {nativeLoginPasswordSubtitleArgs, nativeLoginPasswordSubtitleArgs2, nativeLoginPasswordSubtitleArgs3};
        $VALUES = nativeLoginPasswordSubtitleArgsArr;
        $ENTRIES = new F3w(nativeLoginPasswordSubtitleArgsArr);
    }

    public static Ey9<NativeLoginPasswordSubtitleArgs> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginPasswordSubtitleArgs valueOf(String str) {
        return (NativeLoginPasswordSubtitleArgs) Enum.valueOf(NativeLoginPasswordSubtitleArgs.class, str);
    }

    public static NativeLoginPasswordSubtitleArgs[] values() {
        return (NativeLoginPasswordSubtitleArgs[]) $VALUES.clone();
    }

    public NativeLoginPasswordSubtitleArgs(String str, int i) {
    }
}
