package com.meta.clocksync;

import X.C3cI;
import X.C60O;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class ClockSyncNatives {
    public static final ClockSyncNatives INSTANCE = new ClockSyncNatives();
    public static final AtomicBoolean claimed = C60O.A1E();
    public static volatile boolean registered;

    public static final native boolean nativeDeserialize(byte[] bArr, byte[] bArr2, long[] jArr);

    public static final native boolean nativeDurationMs(long j, long j2, long j3, long j4, long[] jArr);

    public static final native boolean nativeIsRunning();

    public static final native String nativeNowUtc(long[] jArr);

    public static final native String nativeResolve(long j, long j2, long[] jArr);

    public static final native byte[] nativeSerialize(long j, long j2, byte[] bArr);

    public static final native boolean nativeStamp(long[] jArr);

    public static final native String nativeWallClockSkew(long[] jArr);

    public static final void onNativesRegistered() {
        registered = true;
    }

    public static final boolean claimRegistration() {
        return C3cI.A1W(claimed);
    }

    public final boolean isRegistered() {
        return registered;
    }
}
