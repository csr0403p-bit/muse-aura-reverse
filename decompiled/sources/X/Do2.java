package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Do2 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Do2[] A01;
    public static final Do2 A02;
    public static final Do2 A03;
    public static final Do2 A04;
    public static final Do2 A05;
    public static final Do2 A06;
    public static final Do2 A07;
    public static final Do2 A08;

    static {
        Do2 do2 = new Do2("UNSET", 0);
        A08 = do2;
        Do2 do22 = new Do2("ACQUIRE_FAILED", 1);
        A04 = do22;
        Do2 do23 = new Do2("ACQUIRE_DELAYED", 2);
        A03 = do23;
        Do2 do24 = new Do2("ACQUIRED", 3);
        A02 = do24;
        Do2 do25 = new Do2("LOST", 4);
        A05 = do25;
        Do2 do26 = new Do2("LOST_TRANSIENT", 5);
        A06 = do26;
        Do2 do27 = new Do2("LOST_TRANSIENT_CAN_DUCK", 6);
        A07 = do27;
        Do2[] do2Arr = {do2, do22, do23, do24, do25, do26, do27};
        A01 = do2Arr;
        A00 = C3cG.A0w(do2Arr);
    }

    public static Do2 valueOf(String str) {
        return (Do2) Enum.valueOf(Do2.class, str);
    }

    public static Do2[] values() {
        return (Do2[]) A01.clone();
    }

    public Do2(String str, int i) {
    }
}
