package com.facebook.aura.login.nativeflow;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NativeLoginLandingStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginLandingStatus[] $VALUES;
    public static final NativeLoginLandingStatus IDLE;
    public static final NativeLoginLandingStatus REMOVING_PROFILE;
    public static final NativeLoginLandingStatus SIGNING_IN;

    static {
        NativeLoginLandingStatus nativeLoginLandingStatus = new NativeLoginLandingStatus("IDLE", 0);
        IDLE = nativeLoginLandingStatus;
        NativeLoginLandingStatus nativeLoginLandingStatus2 = new NativeLoginLandingStatus("SIGNING_IN", 1);
        SIGNING_IN = nativeLoginLandingStatus2;
        NativeLoginLandingStatus nativeLoginLandingStatus3 = new NativeLoginLandingStatus("REMOVING_PROFILE", 2);
        REMOVING_PROFILE = nativeLoginLandingStatus3;
        NativeLoginLandingStatus[] nativeLoginLandingStatusArr = {nativeLoginLandingStatus, nativeLoginLandingStatus2, nativeLoginLandingStatus3};
        $VALUES = nativeLoginLandingStatusArr;
        $ENTRIES = new F3w(nativeLoginLandingStatusArr);
    }

    public static Ey9<NativeLoginLandingStatus> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginLandingStatus valueOf(String str) {
        return (NativeLoginLandingStatus) Enum.valueOf(NativeLoginLandingStatus.class, str);
    }

    public static NativeLoginLandingStatus[] values() {
        return (NativeLoginLandingStatus[]) $VALUES.clone();
    }

    public NativeLoginLandingStatus(String str, int i) {
    }
}
