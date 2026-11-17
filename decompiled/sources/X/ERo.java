package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ERo {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ ERo[] A01;
    public static final ERo A02;
    public static final ERo A03;
    public static final ERo A04;
    public static final ERo A05;
    public static final ERo A06;
    public static final ERo A07;
    public final int nativeValue;

    static {
        ERo eRo = new ERo("OFFLINE", 0, 0);
        A04 = eRo;
        ERo eRo2 = new ERo("BACKGROUND", 1, 1);
        A02 = eRo2;
        ERo eRo3 = new ERo("PAUSED", 2, 2);
        A05 = eRo3;
        ERo eRo4 = new ERo("SESSION_ENDED", 3, 3);
        A07 = eRo4;
        ERo eRo5 = new ERo("RETRY_EXHAUSTED", 4, 4);
        A06 = eRo5;
        ERo eRo6 = new ERo("INTERNAL", 5, 5);
        A03 = eRo6;
        ERo[] eRoArr = {eRo, eRo2, eRo3, eRo4, eRo5, eRo6};
        A01 = eRoArr;
        A00 = C3cG.A0w(eRoArr);
    }

    public static ERo valueOf(String str) {
        return (ERo) Enum.valueOf(ERo.class, str);
    }

    public static ERo[] values() {
        return (ERo[]) A01.clone();
    }

    public ERo(String str, int i, int i2) {
        this.nativeValue = i2;
    }
}
