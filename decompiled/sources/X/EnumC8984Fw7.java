package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Fw7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC8984Fw7 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC8984Fw7[] A01;
    public static final EnumC8984Fw7 A02;
    public static final EnumC8984Fw7 A03;
    public static final EnumC8984Fw7 A04;
    public static final EnumC8984Fw7 A05;
    public final String id;

    static {
        EnumC8984Fw7 enumC8984Fw7 = new EnumC8984Fw7("SUM", 0, "sum");
        A05 = enumC8984Fw7;
        EnumC8984Fw7 enumC8984Fw72 = new EnumC8984Fw7("AVERAGE", 1, "average");
        A02 = enumC8984Fw72;
        EnumC8984Fw7 enumC8984Fw73 = new EnumC8984Fw7("MIN", 2, "min");
        A04 = enumC8984Fw73;
        EnumC8984Fw7 enumC8984Fw74 = new EnumC8984Fw7("MAX", 3, "max");
        A03 = enumC8984Fw74;
        EnumC8984Fw7[] enumC8984Fw7Arr = {enumC8984Fw7, enumC8984Fw72, enumC8984Fw73, enumC8984Fw74};
        A01 = enumC8984Fw7Arr;
        A00 = C3cG.A0w(enumC8984Fw7Arr);
    }

    public static EnumC8984Fw7 valueOf(String str) {
        return (EnumC8984Fw7) Enum.valueOf(EnumC8984Fw7.class, str);
    }

    public static EnumC8984Fw7[] values() {
        return (EnumC8984Fw7[]) A01.clone();
    }

    public EnumC8984Fw7(String str, int i, String str2) {
        this.id = str2;
    }
}
