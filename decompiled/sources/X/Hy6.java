package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Hy6 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Hy6[] A01;
    public static final Hy6 A02;
    public final int major;
    public final EnumC10607Hyg serverEnum;

    static {
        Hy6 hy6 = new Hy6(EnumC10607Hyg.A02, "V8", 0, 8);
        Hy6 hy62 = new Hy6(EnumC10607Hyg.A03, "V9", 1, 9);
        A02 = hy62;
        Hy6[] hy6Arr = {hy6, hy62};
        A01 = hy6Arr;
        A00 = C3cG.A0w(hy6Arr);
    }

    public static Hy6 valueOf(String str) {
        return (Hy6) Enum.valueOf(Hy6.class, str);
    }

    public static Hy6[] values() {
        return (Hy6[]) A01.clone();
    }

    public Hy6(EnumC10607Hyg enumC10607Hyg, String str, int i, int i2) {
        this.major = i2;
        this.serverEnum = enumC10607Hyg;
    }
}
