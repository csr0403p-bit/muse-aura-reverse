package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FXc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC8160FXc {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC8160FXc[] A01;
    public static final EnumC8160FXc A02;
    public static final EnumC8160FXc A03;
    public final String serverValue;

    static {
        EnumC8160FXc enumC8160FXc = new EnumC8160FXc("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A03 = enumC8160FXc;
        EnumC8160FXc enumC8160FXc2 = new EnumC8160FXc("AUTO_RENEW_SUBSCRIPTION", 1, "AUTO_RENEW_SUBSCRIPTION");
        A02 = enumC8160FXc2;
        EnumC8160FXc[] enumC8160FXcArr = {enumC8160FXc, enumC8160FXc2, new EnumC8160FXc("CONSUMABLE", 2, "CONSUMABLE"), new EnumC8160FXc("NON_CONSUMABLE", 3, "NON_CONSUMABLE"), new EnumC8160FXc("NON_RENEW_SUBSCRIPTION", 4, "NON_RENEW_SUBSCRIPTION")};
        A01 = enumC8160FXcArr;
        A00 = C3cG.A0w(enumC8160FXcArr);
    }

    public static EnumC8160FXc valueOf(String str) {
        return (EnumC8160FXc) Enum.valueOf(EnumC8160FXc.class, str);
    }

    public static EnumC8160FXc[] values() {
        return (EnumC8160FXc[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public EnumC8160FXc(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
