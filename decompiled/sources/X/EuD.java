package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EuD {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EuD[] A01;
    public static final EuD A02;
    public static final EuD A03;

    static {
        EuD euD = new EuD("INSERT", 0);
        A03 = euD;
        EuD euD2 = new EuD("DELETE", 1);
        A02 = euD2;
        EuD[] euDArr = {euD, euD2};
        A01 = euDArr;
        A00 = C3cG.A0w(euDArr);
    }

    public static EuD valueOf(String str) {
        return (EuD) Enum.valueOf(EuD.class, str);
    }

    public static EuD[] values() {
        return (EuD[]) A01.clone();
    }

    public EuD(String str, int i) {
    }
}
