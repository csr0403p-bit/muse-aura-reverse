package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Hs1 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Hs1[] A01;
    public static final Hs1 A02;
    public static final Hs1 A03;
    public static final Hs1 A04;

    static {
        Hs1 hs1 = new Hs1("WARNING", 0);
        A04 = hs1;
        Hs1 hs12 = new Hs1("ERROR", 1);
        A02 = hs12;
        Hs1 hs13 = new Hs1("HIDDEN", 2);
        A03 = hs13;
        Hs1[] hs1Arr = {hs1, hs12, hs13};
        A01 = hs1Arr;
        A00 = C3cG.A0w(hs1Arr);
    }

    public static Hs1 valueOf(String str) {
        return (Hs1) Enum.valueOf(Hs1.class, str);
    }

    public static Hs1[] values() {
        return (Hs1[]) A01.clone();
    }

    public Hs1(String str, int i) {
    }
}
