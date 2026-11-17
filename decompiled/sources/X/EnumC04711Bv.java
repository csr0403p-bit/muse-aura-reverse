package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1Bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC04711Bv {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC04711Bv[] A01;
    public static final EnumC04711Bv A02;
    public static final EnumC04711Bv A03;
    public static final EnumC04711Bv A04;

    static {
        EnumC04711Bv enumC04711Bv = new EnumC04711Bv("PreEnter", 0);
        A03 = enumC04711Bv;
        EnumC04711Bv enumC04711Bv2 = new EnumC04711Bv("Visible", 1);
        A04 = enumC04711Bv2;
        EnumC04711Bv enumC04711Bv3 = new EnumC04711Bv("PostExit", 2);
        A02 = enumC04711Bv3;
        EnumC04711Bv[] enumC04711BvArr = {enumC04711Bv, enumC04711Bv2, enumC04711Bv3};
        A01 = enumC04711BvArr;
        A00 = new F3w(enumC04711BvArr);
    }

    public static EnumC04711Bv valueOf(String str) {
        return (EnumC04711Bv) Enum.valueOf(EnumC04711Bv.class, str);
    }

    public static EnumC04711Bv[] values() {
        return (EnumC04711Bv[]) A01.clone();
    }

    public EnumC04711Bv(String str, int i) {
    }
}
