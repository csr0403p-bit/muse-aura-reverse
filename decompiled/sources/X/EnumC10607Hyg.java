package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hyg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10607Hyg {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC10607Hyg[] A01;
    public static final EnumC10607Hyg A02;
    public static final EnumC10607Hyg A03;
    public final String serverValue;

    static {
        EnumC10607Hyg enumC10607Hyg = new EnumC10607Hyg("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        EnumC10607Hyg enumC10607Hyg2 = new EnumC10607Hyg("PBL_5_0_0", 1, "PBL_5_0_0");
        EnumC10607Hyg enumC10607Hyg3 = new EnumC10607Hyg("PBL_6_0_0", 2, "PBL_6_0_0");
        EnumC10607Hyg enumC10607Hyg4 = new EnumC10607Hyg("PBL_7_0_0", 3, "PBL_7_0_0");
        EnumC10607Hyg enumC10607Hyg5 = new EnumC10607Hyg("PBL_8_3_0", 4, "PBL_8_3_0");
        A02 = enumC10607Hyg5;
        EnumC10607Hyg enumC10607Hyg6 = new EnumC10607Hyg("PBL_9_1_0", 5, "PBL_9_1_0");
        A03 = enumC10607Hyg6;
        EnumC10607Hyg[] enumC10607HygArr = {enumC10607Hyg, enumC10607Hyg2, enumC10607Hyg3, enumC10607Hyg4, enumC10607Hyg5, enumC10607Hyg6};
        A01 = enumC10607HygArr;
        A00 = C3cG.A0w(enumC10607HygArr);
    }

    public static EnumC10607Hyg valueOf(String str) {
        return (EnumC10607Hyg) Enum.valueOf(EnumC10607Hyg.class, str);
    }

    public static EnumC10607Hyg[] values() {
        return (EnumC10607Hyg[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public EnumC10607Hyg(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
