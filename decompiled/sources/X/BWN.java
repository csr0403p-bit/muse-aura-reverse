package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWN {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWN[] A01;
    public static final BWN A02;
    public final int value;

    static {
        BWN bwn = new BWN("LEGACY_SEPARATE_READERS", 0, 0);
        A02 = bwn;
        BWN[] bwnArr = {bwn, new BWN("JAVA_OWNED_SHARED", 1, 1), new BWN("NATIVE_OWNED_SHARED", 2, 2)};
        A01 = bwnArr;
        A00 = C3cG.A0w(bwnArr);
    }

    public static BWN valueOf(String str) {
        return (BWN) Enum.valueOf(BWN.class, str);
    }

    public static BWN[] values() {
        return (BWN[]) A01.clone();
    }

    public BWN(String str, int i, int i2) {
        this.value = i2;
    }
}
