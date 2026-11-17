package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.BVa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2351BVa {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC2351BVa[] A01;
    public static final EnumC2351BVa A02;
    public static final EnumC2351BVa A03;
    public static final EnumC2351BVa A04;
    public static final EnumC2351BVa A05;
    public static final EnumC2351BVa A06;
    public static final EnumC2351BVa A07;
    public static final EnumC2351BVa A08;
    public static final EnumC2351BVa A09;

    static {
        EnumC2351BVa enumC2351BVa = new EnumC2351BVa("HEALTHY", 0);
        A03 = enumC2351BVa;
        EnumC2351BVa enumC2351BVa2 = new EnumC2351BVa("THERMAL_CONSTRAINED", 1);
        A08 = enumC2351BVa2;
        EnumC2351BVa enumC2351BVa3 = new EnumC2351BVa("POWER_SAVE_MODE", 2);
        A07 = enumC2351BVa3;
        EnumC2351BVa enumC2351BVa4 = new EnumC2351BVa("LOW_BATTERY", 3);
        A05 = enumC2351BVa4;
        EnumC2351BVa enumC2351BVa5 = new EnumC2351BVa("LOW_AMBIENT_LIGHT", 4);
        A04 = enumC2351BVa5;
        EnumC2351BVa enumC2351BVa6 = new EnumC2351BVa("FAST_SCROLL", 5);
        A02 = enumC2351BVa6;
        EnumC2351BVa enumC2351BVa7 = new EnumC2351BVa("UNAVAILABLE", 6);
        A09 = enumC2351BVa7;
        EnumC2351BVa enumC2351BVa8 = new EnumC2351BVa("LOW_SCREEN_BRIGHTNESS", 7);
        A06 = enumC2351BVa8;
        EnumC2351BVa[] enumC2351BVaArr = {enumC2351BVa, enumC2351BVa2, enumC2351BVa3, enumC2351BVa4, enumC2351BVa5, enumC2351BVa6, enumC2351BVa7, enumC2351BVa8};
        A01 = enumC2351BVaArr;
        A00 = C3cG.A0w(enumC2351BVaArr);
    }

    public static EnumC2351BVa valueOf(String str) {
        return (EnumC2351BVa) Enum.valueOf(EnumC2351BVa.class, str);
    }

    public static EnumC2351BVa[] values() {
        return (EnumC2351BVa[]) A01.clone();
    }

    public EnumC2351BVa(String str, int i) {
    }
}
