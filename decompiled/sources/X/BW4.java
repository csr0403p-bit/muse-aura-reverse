package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BW4 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BW4[] A01;
    public static final BW4 A02;

    static {
        BW4 bw4 = new BW4();
        A02 = bw4;
        BW4[] bw4Arr = {bw4};
        A01 = bw4Arr;
        A00 = C3cG.A0w(bw4Arr);
    }

    public static BW4 valueOf(String str) {
        return (BW4) Enum.valueOf(BW4.class, str);
    }

    public static BW4[] values() {
        return (BW4[]) A01.clone();
    }
}
