package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BXZ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BXZ[] A01;
    public static final BXZ A02;
    public static final BXZ A03;
    public final int nativeCode;

    static {
        BXZ bxz = new BXZ("MIGRATION", 0, 1);
        A02 = bxz;
        BXZ bxz2 = new BXZ("REQUIRED", 1, 2);
        A03 = bxz2;
        BXZ[] bxzArr = {bxz, bxz2};
        A01 = bxzArr;
        A00 = C3cG.A0w(bxzArr);
    }

    public static BXZ valueOf(String str) {
        return (BXZ) Enum.valueOf(BXZ.class, str);
    }

    public static BXZ[] values() {
        return (BXZ[]) A01.clone();
    }

    public BXZ(String str, int i, int i2) {
        this.nativeCode = i2;
    }
}
