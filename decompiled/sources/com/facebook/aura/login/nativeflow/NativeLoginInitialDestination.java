package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NativeLoginInitialDestination {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginInitialDestination[] $VALUES;
    public static final NativeLoginInitialDestination LANDING;
    public static final NativeLoginInitialDestination PHONE_ENTRY;

    static {
        NativeLoginInitialDestination nativeLoginInitialDestination = new NativeLoginInitialDestination("LANDING", 0);
        LANDING = nativeLoginInitialDestination;
        NativeLoginInitialDestination nativeLoginInitialDestination2 = new NativeLoginInitialDestination("PHONE_ENTRY", 1);
        PHONE_ENTRY = nativeLoginInitialDestination2;
        NativeLoginInitialDestination[] nativeLoginInitialDestinationArr = {nativeLoginInitialDestination, nativeLoginInitialDestination2};
        $VALUES = nativeLoginInitialDestinationArr;
        $ENTRIES = C3cG.A0w(nativeLoginInitialDestinationArr);
    }

    public static Ey9<NativeLoginInitialDestination> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginInitialDestination valueOf(String str) {
        return (NativeLoginInitialDestination) Enum.valueOf(NativeLoginInitialDestination.class, str);
    }

    public static NativeLoginInitialDestination[] values() {
        return (NativeLoginInitialDestination[]) $VALUES.clone();
    }

    public NativeLoginInitialDestination(String str, int i) {
    }
}
