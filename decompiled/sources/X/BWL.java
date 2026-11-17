package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWL {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWL[] A01;
    public static final BWL A02;
    public final int nativeCode;

    static {
        BWL bwl = new BWL("HTTP1_UPGRADE", 0, 0);
        A02 = bwl;
        BWL[] bwlArr = {bwl, new BWL("EXTENDED_CONNECT", 1, 1)};
        A01 = bwlArr;
        A00 = C3cG.A0w(bwlArr);
    }

    public static BWL valueOf(String str) {
        return (BWL) Enum.valueOf(BWL.class, str);
    }

    public static BWL[] values() {
        return (BWL[]) A01.clone();
    }

    public BWL(String str, int i, int i2) {
        this.nativeCode = i2;
    }
}
