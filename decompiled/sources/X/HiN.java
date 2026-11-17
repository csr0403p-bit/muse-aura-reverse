package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HiN {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HiN[] A01;
    public static final HiN A02;
    public static final HiN A03;
    public static final HiN A04;
    public static final HiN A05;

    static {
        HiN hiN = new HiN("UNOPENED", 0);
        A05 = hiN;
        HiN hiN2 = new HiN("OPENED", 1);
        A04 = hiN2;
        HiN hiN3 = new HiN("ENDED_UNOPENED", 2);
        A03 = hiN3;
        HiN hiN4 = new HiN("CLOSED", 3);
        A02 = hiN4;
        HiN[] hiNArr = {hiN, hiN2, hiN3, hiN4};
        A01 = hiNArr;
        A00 = C3cG.A0w(hiNArr);
    }

    public static HiN valueOf(String str) {
        return (HiN) Enum.valueOf(HiN.class, str);
    }

    public static HiN[] values() {
        return (HiN[]) A01.clone();
    }

    public HiN(String str, int i) {
    }
}
