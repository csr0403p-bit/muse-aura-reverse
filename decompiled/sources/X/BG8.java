package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BG8 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BG8[] A01;
    public static final BG8 A02;
    public static final BG8 A03;
    public static final BG8 A04;

    static {
        BG8 bg8 = new BG8("None", 0);
        A03 = bg8;
        BG8 bg82 = new BG8("Cursor", 1);
        A02 = bg82;
        BG8 bg83 = new BG8("Selection", 2);
        A04 = bg83;
        BG8[] bg8Arr = {bg8, bg82, bg83};
        A01 = bg8Arr;
        A00 = C3cG.A0w(bg8Arr);
    }

    public static BG8 valueOf(String str) {
        return (BG8) Enum.valueOf(BG8.class, str);
    }

    public static BG8[] values() {
        return (BG8[]) A01.clone();
    }

    public BG8(String str, int i) {
    }
}
