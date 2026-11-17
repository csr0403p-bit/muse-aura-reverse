package com.facebook.aura.commands.alarm;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ClockHandoffStop {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ClockHandoffStop[] $VALUES;
    public static final ClockHandoffStop LEFT_SCREEN;
    public static final ClockHandoffStop OUT_OF_TIME;
    public final String reason;

    static {
        ClockHandoffStop clockHandoffStop = new ClockHandoffStop("LEFT_SCREEN", 0, "because the app left the screen and Android only lets it open the Clock app while it's on screen. Ask the user to open the app on this device and ask again for those.");
        LEFT_SCREEN = clockHandoffStop;
        ClockHandoffStop clockHandoffStop2 = new ClockHandoffStop("OUT_OF_TIME", 1, "because setting them all takes longer than one request can run. Call alarm.set again with only those.");
        OUT_OF_TIME = clockHandoffStop2;
        ClockHandoffStop[] clockHandoffStopArr = {clockHandoffStop, clockHandoffStop2};
        $VALUES = clockHandoffStopArr;
        $ENTRIES = C3cG.A0w(clockHandoffStopArr);
    }

    public static Ey9<ClockHandoffStop> getEntries() {
        return $ENTRIES;
    }

    public static ClockHandoffStop valueOf(String str) {
        return (ClockHandoffStop) Enum.valueOf(ClockHandoffStop.class, str);
    }

    public static ClockHandoffStop[] values() {
        return (ClockHandoffStop[]) $VALUES.clone();
    }

    public final String getReason() {
        return this.reason;
    }

    public ClockHandoffStop(String str, int i, String str2) {
        this.reason = str2;
    }
}
