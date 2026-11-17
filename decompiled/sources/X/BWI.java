package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWI {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWI[] A01;
    public static final BWI A02;
    public static final BWI A03;
    public static final BWI A04;

    static {
        BWI bwi = new BWI("TIMER_STARTED", 0);
        A03 = bwi;
        BWI bwi2 = new BWI("EVENT_PUBLISHED", 1);
        A02 = bwi2;
        BWI bwi3 = new BWI("UNKNOWN_OR_UNSET", 2);
        A04 = bwi3;
        BWI[] bwiArr = {bwi, bwi2, bwi3};
        A01 = bwiArr;
        A00 = C3cG.A0w(bwiArr);
    }

    public static BWI valueOf(String str) {
        return (BWI) Enum.valueOf(BWI.class, str);
    }

    public static BWI[] values() {
        return (BWI[]) A01.clone();
    }

    public BWI(String str, int i) {
    }
}
