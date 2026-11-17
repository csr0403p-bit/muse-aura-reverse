package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EuF {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EuF[] A01;
    public final int intMode;

    static {
        EuF[] euFArr = {new EuF("ACTIVE", 0, 0), new EuF("PASSIVE", 1, 1), new EuF("STALE", 2, 2)};
        A01 = euFArr;
        A00 = C3cG.A0w(euFArr);
    }

    public static EuF valueOf(String str) {
        return (EuF) Enum.valueOf(EuF.class, str);
    }

    public static EuF[] values() {
        return (EuF[]) A01.clone();
    }

    public EuF(String str, int i, int i2) {
        this.intMode = i2;
    }
}
