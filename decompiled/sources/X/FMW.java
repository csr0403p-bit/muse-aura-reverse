package X;

import android.animation.TimeInterpolator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FMW {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ FMW[] A01;
    public static final FMW A02;
    public final long activeDurationMs;
    public final TimeInterpolator interpolator;
    public final int orderedElementCount;
    public final long pauseDurationMs;
    public final long staggerIntervalMs;
    public final long totalDurationMs;
    public final String value;

    static {
        FMW fmw = new FMW(FMV.A07, "CURRENT", "current", 0, 10, 2000L, 0L, 200L);
        A02 = fmw;
        TimeInterpolator timeInterpolator = FMV.A08;
        FMW[] fmwArr = {fmw, new FMW(timeInterpolator, "PULSE_SLOW", "pulse_slow", 1, 20, 2000L, 200L, 75L), new FMW(timeInterpolator, "PULSE_FAST", "pulse_fast", 2, 20, 1500L, 200L, 50L)};
        A01 = fmwArr;
        A00 = C3cG.A0w(fmwArr);
    }

    public static FMW valueOf(String str) {
        return (FMW) Enum.valueOf(FMW.class, str);
    }

    public static FMW[] values() {
        return (FMW[]) A01.clone();
    }

    public FMW(TimeInterpolator timeInterpolator, String str, String str2, int i, int i2, long j, long j2, long j3) {
        this.value = str2;
        this.activeDurationMs = j;
        this.pauseDurationMs = j2;
        this.staggerIntervalMs = j3;
        this.orderedElementCount = i2;
        this.interpolator = timeInterpolator;
        this.totalDurationMs = j + j2;
    }
}
