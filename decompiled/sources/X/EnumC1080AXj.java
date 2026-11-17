package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.AXj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1080AXj {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC1080AXj[] A01;
    public static final EnumC1080AXj A02;
    public static final EnumC1080AXj A03;
    public static final EnumC1080AXj A04;

    static {
        EnumC1080AXj enumC1080AXj = new EnumC1080AXj("Initial", 0);
        A03 = enumC1080AXj;
        EnumC1080AXj enumC1080AXj2 = new EnumC1080AXj("Main", 1);
        A04 = enumC1080AXj2;
        EnumC1080AXj enumC1080AXj3 = new EnumC1080AXj("Final", 2);
        A02 = enumC1080AXj3;
        EnumC1080AXj[] enumC1080AXjArr = {enumC1080AXj, enumC1080AXj2, enumC1080AXj3};
        A01 = enumC1080AXjArr;
        A00 = C3cG.A0w(enumC1080AXjArr);
    }

    public static EnumC1080AXj valueOf(String str) {
        return (EnumC1080AXj) Enum.valueOf(EnumC1080AXj.class, str);
    }

    public static EnumC1080AXj[] values() {
        return (EnumC1080AXj[]) A01.clone();
    }

    public EnumC1080AXj(String str, int i) {
    }
}
