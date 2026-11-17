package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ChannelPairingEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ChannelPairingEntryPoint[] $VALUES;
    public static final ChannelPairingEntryPoint CONNECT_SHEET;
    public static final ChannelPairingEntryPoint SETTINGS;
    public final HatchSurface surface;
    public final String value;

    static {
        ChannelPairingEntryPoint channelPairingEntryPoint = new ChannelPairingEntryPoint("SETTINGS", 0, "settings", HatchSurface.SETTINGS);
        SETTINGS = channelPairingEntryPoint;
        ChannelPairingEntryPoint channelPairingEntryPoint2 = new ChannelPairingEntryPoint("CONNECT_SHEET", 1, "connect_sheet", HatchSurface.CHAT);
        CONNECT_SHEET = channelPairingEntryPoint2;
        ChannelPairingEntryPoint[] channelPairingEntryPointArr = {channelPairingEntryPoint, channelPairingEntryPoint2};
        $VALUES = channelPairingEntryPointArr;
        $ENTRIES = new F3w(channelPairingEntryPointArr);
    }

    public static Ey9<ChannelPairingEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static ChannelPairingEntryPoint valueOf(String str) {
        return (ChannelPairingEntryPoint) Enum.valueOf(ChannelPairingEntryPoint.class, str);
    }

    public static ChannelPairingEntryPoint[] values() {
        return (ChannelPairingEntryPoint[]) $VALUES.clone();
    }

    public final HatchSurface getSurface() {
        return this.surface;
    }

    public final String getValue() {
        return this.value;
    }

    public ChannelPairingEntryPoint(String str, int i, String str2, HatchSurface hatchSurface) {
        this.value = str2;
        this.surface = hatchSurface;
    }
}
