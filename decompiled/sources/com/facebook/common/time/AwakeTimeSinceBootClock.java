package com.facebook.common.time;

import X.DK8;
import X.DK9;

/* loaded from: classes5.dex */
public class AwakeTimeSinceBootClock implements DK9 {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // X.DK9
    public /* synthetic */ long now() {
        return DK8.$default$now(this);
    }

    @Override // X.DK9
    public long nowNanos() {
        return System.nanoTime();
    }
}
