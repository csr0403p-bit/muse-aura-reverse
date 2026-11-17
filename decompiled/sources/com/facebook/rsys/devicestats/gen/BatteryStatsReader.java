package com.facebook.rsys.devicestats.gen;

import X.F60;

/* loaded from: classes6.dex */
public abstract class BatteryStatsReader {
    public abstract long getBatteryLevel();

    public abstract boolean isCharging();

    public BatteryStatsReader() {
        throw F60.createAndThrow();
    }
}
