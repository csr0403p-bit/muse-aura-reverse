package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BLv {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BLv[] A01;
    public static final BLv A02;
    public final String serverValue;

    static {
        BLv bLv = new BLv("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = bLv;
        BLv[] bLvArr = {bLv, new BLv("IMAGE", 1, "IMAGE"), new BLv("VIDEO", 2, "VIDEO")};
        A01 = bLvArr;
        A00 = C3cG.A0w(bLvArr);
    }

    public static BLv valueOf(String str) {
        return (BLv) Enum.valueOf(BLv.class, str);
    }

    public static BLv[] values() {
        return (BLv[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public BLv(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
