package X;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class F24 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ F24[] A01;
    public static final F24 A02;
    public static final F24 A03;
    public static final F24 A04;
    public static final F24 A05;
    public static final F24 A06;
    public static final F24 A07;
    public final TimeUnit timeUnit;

    static {
        F24 f24 = new F24("NANOSECONDS", TimeUnit.NANOSECONDS, 0);
        A06 = f24;
        F24 f242 = new F24("MICROSECONDS", TimeUnit.MICROSECONDS, 1);
        F24 f243 = new F24("MILLISECONDS", TimeUnit.MILLISECONDS, 2);
        A04 = f243;
        F24 f244 = new F24("SECONDS", TimeUnit.SECONDS, 3);
        A07 = f244;
        F24 f245 = new F24("MINUTES", TimeUnit.MINUTES, 4);
        A05 = f245;
        F24 f246 = new F24("HOURS", TimeUnit.HOURS, 5);
        A03 = f246;
        F24 f247 = new F24("DAYS", TimeUnit.DAYS, 6);
        A02 = f247;
        F24[] f24Arr = {f24, f242, f243, f244, f245, f246, f247};
        A01 = f24Arr;
        A00 = C3cG.A0w(f24Arr);
    }

    public static F24 valueOf(String str) {
        return (F24) Enum.valueOf(F24.class, str);
    }

    public static F24[] values() {
        return (F24[]) A01.clone();
    }

    public F24(String str, TimeUnit timeUnit, int i) {
        this.timeUnit = timeUnit;
    }
}
