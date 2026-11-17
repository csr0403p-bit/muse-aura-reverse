package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HkU {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HkU[] A01;
    public static final HkU A02;
    public static final HkU A03;
    public static final HkU A04;

    static {
        HkU hkU = new HkU("DINING_OFFERINGS", 0);
        A03 = hkU;
        HkU hkU2 = new HkU("SERVICE_OPTIONS", 1);
        A04 = hkU2;
        HkU hkU3 = new HkU("AMENITIES", 2);
        A02 = hkU3;
        HkU[] hkUArr = {hkU, hkU2, hkU3};
        A01 = hkUArr;
        A00 = C3cG.A0w(hkUArr);
    }

    public static HkU valueOf(String str) {
        return (HkU) Enum.valueOf(HkU.class, str);
    }

    public static HkU[] values() {
        return (HkU[]) A01.clone();
    }

    public HkU(String str, int i) {
    }
}
