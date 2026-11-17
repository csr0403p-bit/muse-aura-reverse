package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HiJ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HiJ[] A01;
    public static final HiJ A02;
    public static final HiJ A03;
    public static final HiJ A04;

    static {
        HiJ hiJ = new HiJ("DEFAULT", 0);
        A02 = hiJ;
        HiJ hiJ2 = new HiJ("DISABLED", 1);
        A03 = hiJ2;
        HiJ hiJ3 = new HiJ("ENABLED", 2);
        A04 = hiJ3;
        HiJ[] hiJArr = {hiJ, hiJ2, hiJ3};
        A01 = hiJArr;
        A00 = C3cG.A0w(hiJArr);
    }

    public static HiJ valueOf(String str) {
        return (HiJ) Enum.valueOf(HiJ.class, str);
    }

    public static HiJ[] values() {
        return (HiJ[]) A01.clone();
    }

    public HiJ(String str, int i) {
    }
}
