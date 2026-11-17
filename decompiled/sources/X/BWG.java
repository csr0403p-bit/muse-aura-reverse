package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWG {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWG[] A01;
    public static final BWG A02;
    public static final BWG A03;
    public static final BWG A04;

    static {
        BWG bwg = new BWG("LOADED", 0);
        A02 = bwg;
        BWG bwg2 = new BWG("LOCAL", 1);
        A03 = bwg2;
        BWG bwg3 = new BWG("REMOTE", 2);
        A04 = bwg3;
        BWG[] bwgArr = {bwg, bwg2, bwg3};
        A01 = bwgArr;
        A00 = C3cG.A0w(bwgArr);
    }

    public static BWG valueOf(String str) {
        return (BWG) Enum.valueOf(BWG.class, str);
    }

    public static BWG[] values() {
        return (BWG[]) A01.clone();
    }

    public BWG(String str, int i) {
    }
}
