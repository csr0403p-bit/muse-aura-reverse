package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.BYa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2385BYa {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC2385BYa[] A01;
    public static final EnumC2385BYa A02;
    public static final EnumC2385BYa A03;
    public static final EnumC2385BYa A04;
    public static final EnumC2385BYa A05;
    public static final EnumC2385BYa A06;

    static {
        EnumC2385BYa enumC2385BYa = new EnumC2385BYa("ON_CONFIGURE", 0);
        A02 = enumC2385BYa;
        EnumC2385BYa enumC2385BYa2 = new EnumC2385BYa("ON_CREATE", 1);
        A03 = enumC2385BYa2;
        EnumC2385BYa enumC2385BYa3 = new EnumC2385BYa("ON_UPGRADE", 2);
        A06 = enumC2385BYa3;
        EnumC2385BYa enumC2385BYa4 = new EnumC2385BYa("ON_DOWNGRADE", 3);
        A04 = enumC2385BYa4;
        EnumC2385BYa enumC2385BYa5 = new EnumC2385BYa("ON_OPEN", 4);
        A05 = enumC2385BYa5;
        EnumC2385BYa[] enumC2385BYaArr = {enumC2385BYa, enumC2385BYa2, enumC2385BYa3, enumC2385BYa4, enumC2385BYa5};
        A01 = enumC2385BYaArr;
        A00 = C3cG.A0w(enumC2385BYaArr);
    }

    public static EnumC2385BYa valueOf(String str) {
        return (EnumC2385BYa) Enum.valueOf(EnumC2385BYa.class, str);
    }

    public static EnumC2385BYa[] values() {
        return (EnumC2385BYa[]) A01.clone();
    }

    public EnumC2385BYa(String str, int i) {
    }
}
