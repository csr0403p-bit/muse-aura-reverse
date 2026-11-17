package com.facebook.aura.login.nativeflow;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NativeLoginResolveState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginResolveState[] $VALUES;
    public static final NativeLoginResolveState RESOLVED;
    public static final NativeLoginResolveState RESOLVING;

    static {
        NativeLoginResolveState nativeLoginResolveState = new NativeLoginResolveState("RESOLVING", 0);
        RESOLVING = nativeLoginResolveState;
        NativeLoginResolveState nativeLoginResolveState2 = new NativeLoginResolveState("RESOLVED", 1);
        RESOLVED = nativeLoginResolveState2;
        NativeLoginResolveState[] nativeLoginResolveStateArr = {nativeLoginResolveState, nativeLoginResolveState2};
        $VALUES = nativeLoginResolveStateArr;
        $ENTRIES = new F3w(nativeLoginResolveStateArr);
    }

    public static Ey9<NativeLoginResolveState> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginResolveState valueOf(String str) {
        return (NativeLoginResolveState) Enum.valueOf(NativeLoginResolveState.class, str);
    }

    public static NativeLoginResolveState[] values() {
        return (NativeLoginResolveState[]) $VALUES.clone();
    }

    public NativeLoginResolveState(String str, int i) {
    }
}
