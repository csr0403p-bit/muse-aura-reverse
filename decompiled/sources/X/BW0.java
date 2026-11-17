package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BW0 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BW0[] A01;
    public static final BW0 A02;
    public static final BW0 A03;

    static {
        BW0 bw0 = new BW0("PREALLOCATE", 0);
        A02 = bw0;
        BW0 bw02 = new BW0("RENDERER", 1);
        A03 = bw02;
        BW0[] bw0Arr = {bw0, bw02};
        A01 = bw0Arr;
        A00 = C3cG.A0w(bw0Arr);
    }

    public static BW0 valueOf(String str) {
        return (BW0) Enum.valueOf(BW0.class, str);
    }

    public static BW0[] values() {
        return (BW0[]) A01.clone();
    }

    public BW0(String str, int i) {
    }
}
