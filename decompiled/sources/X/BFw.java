package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BFw {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BFw[] A01;
    public static final BFw A02;
    public static final BFw A03;
    public static final BFw A04;
    public static final BFw A05;
    public static final BFw A06;
    public static final BFw A07;

    static {
        BFw bFw = new BFw("ShutDown", 0);
        A06 = bFw;
        BFw bFw2 = new BFw("ShuttingDown", 1);
        A07 = bFw2;
        BFw bFw3 = new BFw("Inactive", 2);
        A03 = bFw3;
        BFw bFw4 = new BFw("InactivePendingWork", 3);
        A04 = bFw4;
        BFw bFw5 = new BFw("Idle", 4);
        A02 = bFw5;
        BFw bFw6 = new BFw("PendingWork", 5);
        A05 = bFw6;
        BFw[] bFwArr = {bFw, bFw2, bFw3, bFw4, bFw5, bFw6};
        A01 = bFwArr;
        A00 = C3cG.A0w(bFwArr);
    }

    public static BFw valueOf(String str) {
        return (BFw) Enum.valueOf(BFw.class, str);
    }

    public static BFw[] values() {
        return (BFw[]) A01.clone();
    }

    public BFw(String str, int i) {
    }
}
