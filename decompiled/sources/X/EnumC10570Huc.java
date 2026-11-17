package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Huc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10570Huc {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC10570Huc[] A01;
    public static final EnumC10570Huc A02;
    public static final EnumC10570Huc A03;
    public static final EnumC10570Huc A04;

    static {
        EnumC10570Huc enumC10570Huc = new EnumC10570Huc("VERBOSE", 0);
        EnumC10570Huc enumC10570Huc2 = new EnumC10570Huc("WARNING", 1);
        A04 = enumC10570Huc2;
        EnumC10570Huc enumC10570Huc3 = new EnumC10570Huc("DEBUG", 2);
        A02 = enumC10570Huc3;
        EnumC10570Huc enumC10570Huc4 = new EnumC10570Huc("ERROR", 3);
        A03 = enumC10570Huc4;
        EnumC10570Huc[] enumC10570HucArr = {enumC10570Huc, enumC10570Huc2, enumC10570Huc3, enumC10570Huc4, new EnumC10570Huc("FATAL", 4)};
        A01 = enumC10570HucArr;
        A00 = C3cG.A0w(enumC10570HucArr);
    }

    public static EnumC10570Huc valueOf(String str) {
        return (EnumC10570Huc) Enum.valueOf(EnumC10570Huc.class, str);
    }

    public static EnumC10570Huc[] values() {
        return (EnumC10570Huc[]) A01.clone();
    }

    public EnumC10570Huc(String str, int i) {
    }
}
