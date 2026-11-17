package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ET9 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ ET9[] A01;
    public static final ET9 A02;
    public static final ET9 A03;
    public static final ET9 A04;
    public static final ET9 A05;
    public static final ET9 A06;
    public final int nativeCode;

    static {
        ET9 et9 = new ET9("LEGACY_PEER_VERIFIED", 0, 1);
        A04 = et9;
        ET9 et92 = new ET9("PRIVATE_AUTH_PEER_VERIFIED", 1, 2);
        A05 = et92;
        ET9 et93 = new ET9("ENROLLMENT_REQUIRED", 2, 3);
        A02 = et93;
        ET9 et94 = new ET9("KEY_REQUIRED", 3, 4);
        A03 = et94;
        ET9 et95 = new ET9("VERIFICATION_FAILED", 4, 5);
        A06 = et95;
        ET9[] et9Arr = {et9, et92, et93, et94, et95};
        A01 = et9Arr;
        A00 = C3cG.A0w(et9Arr);
    }

    public static ET9 valueOf(String str) {
        return (ET9) Enum.valueOf(ET9.class, str);
    }

    public static ET9[] values() {
        return (ET9[]) A01.clone();
    }

    public ET9(String str, int i, int i2) {
        this.nativeCode = i2;
    }
}
