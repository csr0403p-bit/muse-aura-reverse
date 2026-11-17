package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.AwJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2008AwJ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC2008AwJ[] A01;
    public static final EnumC2008AwJ A02;
    public static final EnumC2008AwJ A03;
    public static final EnumC2008AwJ A04;
    public static final EnumC2008AwJ A05;

    static {
        EnumC2008AwJ enumC2008AwJ = new EnumC2008AwJ("Up", 0);
        A05 = enumC2008AwJ;
        EnumC2008AwJ enumC2008AwJ2 = new EnumC2008AwJ("Drag", 1);
        A03 = enumC2008AwJ2;
        EnumC2008AwJ enumC2008AwJ3 = new EnumC2008AwJ("Timeout", 2);
        A04 = enumC2008AwJ3;
        EnumC2008AwJ enumC2008AwJ4 = new EnumC2008AwJ("Cancel", 3);
        A02 = enumC2008AwJ4;
        EnumC2008AwJ[] enumC2008AwJArr = {enumC2008AwJ, enumC2008AwJ2, enumC2008AwJ3, enumC2008AwJ4};
        A01 = enumC2008AwJArr;
        A00 = C3cG.A0w(enumC2008AwJArr);
    }

    public static EnumC2008AwJ valueOf(String str) {
        return (EnumC2008AwJ) Enum.valueOf(EnumC2008AwJ.class, str);
    }

    public static EnumC2008AwJ[] values() {
        return (EnumC2008AwJ[]) A01.clone();
    }

    public EnumC2008AwJ(String str, int i) {
    }
}
