package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FIe {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ FIe[] A01;
    public static final FIe A02;
    public static final FIe A03;
    public static final FIe A04;
    public static final FIe A05;
    public final String value;

    static {
        FIe fIe = new FIe("TOP", 0, "top");
        A05 = fIe;
        FIe fIe2 = new FIe("BOTTOM", 1, "bottom");
        A02 = fIe2;
        FIe fIe3 = new FIe("LEFT", 2, "left");
        A03 = fIe3;
        FIe fIe4 = new FIe("RIGHT", 3, "right");
        A04 = fIe4;
        FIe[] fIeArr = {fIe, fIe2, fIe3, fIe4};
        A01 = fIeArr;
        A00 = C3cG.A0w(fIeArr);
    }

    public static FIe valueOf(String str) {
        return (FIe) Enum.valueOf(FIe.class, str);
    }

    public static FIe[] values() {
        return (FIe[]) A01.clone();
    }

    public FIe(String str, int i, String str2) {
        this.value = str2;
    }
}
