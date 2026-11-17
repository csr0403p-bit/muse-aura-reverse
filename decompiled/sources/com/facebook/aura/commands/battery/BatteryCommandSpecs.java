package com.facebook.aura.commands.battery;

import com.facebook.aura.nodes.core.NodeCommandSpec;

/* loaded from: classes3.dex */
public final class BatteryCommandSpecs {
    public static final BatteryCommandSpecs INSTANCE = new BatteryCommandSpecs();
    public static final NodeCommandSpec BATTERY_GET = new NodeCommandSpec("Reports the device's current battery state \u2014 charge level percent, whether it's charging, the charging source, whether the battery is low, and battery health. Use when battery context is needed.", null, null, null, null, "The current battery state of the device.", 0, 94, null);

    public final NodeCommandSpec getBATTERY_GET() {
        return BATTERY_GET;
    }
}
