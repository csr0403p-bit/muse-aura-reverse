package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hzf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10621Hzf {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC10621Hzf[] A01;
    public static final EnumC10621Hzf A02;
    public static final EnumC10621Hzf A03;
    public final String value;

    static {
        EnumC10621Hzf enumC10621Hzf = new EnumC10621Hzf("EXTERNAL_PRODUCT_ID", 0, "EXTERNAL_PRODUCT_ID");
        A02 = enumC10621Hzf;
        EnumC10621Hzf enumC10621Hzf2 = new EnumC10621Hzf("TIER_ID", 1, "TIER_ID");
        A03 = enumC10621Hzf2;
        EnumC10621Hzf[] enumC10621HzfArr = {enumC10621Hzf, enumC10621Hzf2};
        A01 = enumC10621HzfArr;
        A00 = C3cG.A0w(enumC10621HzfArr);
    }

    public static EnumC10621Hzf valueOf(String str) {
        return (EnumC10621Hzf) Enum.valueOf(EnumC10621Hzf.class, str);
    }

    public static EnumC10621Hzf[] values() {
        return (EnumC10621Hzf[]) A01.clone();
    }

    public EnumC10621Hzf(String str, int i, String str2) {
        this.value = str2;
    }
}
