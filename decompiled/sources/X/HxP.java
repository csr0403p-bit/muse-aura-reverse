package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HxP {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HxP[] A01;
    public static final HxP A02;
    public final String serverValue;

    static {
        HxP hxP = new HxP("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = hxP;
        HxP[] hxPArr = {hxP, new HxP("APPLE_ACA", 1, "APPLE_ACA"), new HxP("APPLE_PB", 2, "APPLE_PB"), new HxP("GOOGLE_GDC", 3, "GOOGLE_GDC"), new HxP("STANDARD_IAP", 4, "STANDARD_IAP")};
        A01 = hxPArr;
        A00 = C3cG.A0w(hxPArr);
    }

    public static HxP valueOf(String str) {
        return (HxP) Enum.valueOf(HxP.class, str);
    }

    public static HxP[] values() {
        return (HxP[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public HxP(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
