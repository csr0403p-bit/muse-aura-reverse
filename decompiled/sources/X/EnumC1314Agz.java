package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Agz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1314Agz {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC1314Agz[] A01;
    public static final EnumC1314Agz A02;
    public static final EnumC1314Agz A03;
    public static final EnumC1314Agz A04;

    static {
        EnumC1314Agz enumC1314Agz = new EnumC1314Agz("None", 0);
        A03 = enumC1314Agz;
        EnumC1314Agz enumC1314Agz2 = new EnumC1314Agz("Touch", 1);
        A04 = enumC1314Agz2;
        EnumC1314Agz enumC1314Agz3 = new EnumC1314Agz("Mouse", 2);
        A02 = enumC1314Agz3;
        EnumC1314Agz[] enumC1314AgzArr = {enumC1314Agz, enumC1314Agz2, enumC1314Agz3};
        A01 = enumC1314AgzArr;
        A00 = C3cG.A0w(enumC1314AgzArr);
    }

    public static EnumC1314Agz valueOf(String str) {
        return (EnumC1314Agz) Enum.valueOf(EnumC1314Agz.class, str);
    }

    public static EnumC1314Agz[] values() {
        return (EnumC1314Agz[]) A01.clone();
    }

    public EnumC1314Agz(String str, int i) {
    }
}
