package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BXh {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BXh[] A01;
    public static final BXh A02;
    public static final BXh A03;
    public static final BXh A04;

    static {
        BXh bXh = new BXh("ALWAYS", 0);
        A02 = bXh;
        BXh bXh2 = new BXh("AUTO", 1);
        A03 = bXh2;
        BXh bXh3 = new BXh("NEVER", 2);
        A04 = bXh3;
        BXh[] bXhArr = {bXh, bXh2, bXh3};
        A01 = bXhArr;
        A00 = C3cG.A0w(bXhArr);
    }

    public static BXh valueOf(String str) {
        return (BXh) Enum.valueOf(BXh.class, str);
    }

    public static BXh[] values() {
        return (BXh[]) A01.clone();
    }

    public BXh(String str, int i) {
    }
}
