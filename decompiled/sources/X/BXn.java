package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BXn {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BXn[] A01;
    public static final BXn A02;
    public final int value;

    static {
        BXn bXn = new BXn("FXAccountItemEligibilityEligible", 0, 0);
        BXn bXn2 = new BXn("FXAccountItemEligibilityIneligible", 1, 1);
        BXn bXn3 = new BXn("FXAccountItemEligibilityNoData", 2, 2);
        A02 = bXn3;
        BXn[] bXnArr = {bXn, bXn2, bXn3};
        A01 = bXnArr;
        A00 = C3cG.A0w(bXnArr);
    }

    public static BXn valueOf(String str) {
        return (BXn) Enum.valueOf(BXn.class, str);
    }

    public static BXn[] values() {
        return (BXn[]) A01.clone();
    }

    public BXn(String str, int i, int i2) {
        this.value = i2;
    }
}
