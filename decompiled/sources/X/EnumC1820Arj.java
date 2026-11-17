package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Arj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1820Arj {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC1820Arj[] A01;
    public static final EnumC1820Arj A02;
    public static final EnumC1820Arj A03;

    static {
        EnumC1820Arj enumC1820Arj = new EnumC1820Arj("Ltr", 0);
        A02 = enumC1820Arj;
        EnumC1820Arj enumC1820Arj2 = new EnumC1820Arj("Rtl", 1);
        A03 = enumC1820Arj2;
        EnumC1820Arj[] enumC1820ArjArr = {enumC1820Arj, enumC1820Arj2};
        A01 = enumC1820ArjArr;
        A00 = C3cG.A0w(enumC1820ArjArr);
    }

    public static EnumC1820Arj valueOf(String str) {
        return (EnumC1820Arj) Enum.valueOf(EnumC1820Arj.class, str);
    }

    public static EnumC1820Arj[] values() {
        return (EnumC1820Arj[]) A01.clone();
    }

    public EnumC1820Arj(String str, int i) {
    }
}
