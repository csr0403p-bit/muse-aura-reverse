package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HiK {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HiK[] A01;
    public static final HiK A02;
    public static final HiK A03;
    public static final HiK A04;

    static {
        HiK hiK = new HiK("COVER", 0);
        A03 = hiK;
        HiK hiK2 = new HiK("CONTAIN", 1);
        A02 = hiK2;
        HiK hiK3 = new HiK("STRETCH", 2);
        A04 = hiK3;
        HiK[] hiKArr = {hiK, hiK2, hiK3};
        A01 = hiKArr;
        A00 = C3cG.A0w(hiKArr);
    }

    public static HiK valueOf(String str) {
        return (HiK) Enum.valueOf(HiK.class, str);
    }

    public static HiK[] values() {
        return (HiK[]) A01.clone();
    }

    public HiK(String str, int i) {
    }
}
