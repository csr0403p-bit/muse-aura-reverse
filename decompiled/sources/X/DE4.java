package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DE4 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ DE4[] A01;
    public static final DE4 A02;
    public static final DE4 A03;
    public static final DE4 A04;
    public static final DE4 A05;

    static {
        DE4 de4 = new DE4("NETWORK", 0);
        A02 = de4;
        DE4 de42 = new DE4("PREFETCH", 1);
        A04 = de42;
        DE4 de43 = new DE4("PREFETCH_IN_FLIGHT", 2);
        A05 = de43;
        DE4 de44 = new DE4("PLAYBACK_CACHE", 3);
        A03 = de44;
        DE4[] de4Arr = {de4, de42, de43, de44};
        A01 = de4Arr;
        A00 = C3cG.A0w(de4Arr);
    }

    public static DE4 valueOf(String str) {
        return (DE4) Enum.valueOf(DE4.class, str);
    }

    public static DE4[] values() {
        return (DE4[]) A01.clone();
    }

    public DE4(String str, int i) {
    }
}
