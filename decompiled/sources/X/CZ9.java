package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CZ9 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ CZ9[] A01;
    public static final CZ9 A02;
    public static final CZ9 A03;
    public static final CZ9 A04;
    public static final CZ9 A05;

    static {
        CZ9 cz9 = new CZ9("LOGIN", 0);
        A04 = cz9;
        CZ9 cz92 = new CZ9("REGISTRATION", 1);
        A05 = cz92;
        CZ9 cz93 = new CZ9("CONFIRMATION", 2);
        CZ9 cz94 = new CZ9("EXISTING_SESSION_LOGIN", 3);
        A02 = cz94;
        CZ9 cz95 = new CZ9("RESURRECTION", 4);
        CZ9 cz96 = new CZ9("FIRST_APP_LAUNCH", 5);
        A03 = cz96;
        CZ9[] cz9Arr = {cz9, cz92, cz93, cz94, cz95, cz96, new CZ9("APP_OPEN", 6), new CZ9("D1_RETAINED", 7), new CZ9("D7_RETAINED", 8), new CZ9("D30_RETAINED", 9), new CZ9("WEEK_OF_D30_RETAINED", 10), new CZ9("D0_WORLD_ENTER", 11), new CZ9("D1_WORLD_ENTER", 12), new CZ9("D7_WORLD_ENTER", 13), new CZ9("SUBSCRIPTION_PURCHASE", 14)};
        A01 = cz9Arr;
        A00 = C3cG.A0w(cz9Arr);
    }

    public static CZ9 valueOf(String str) {
        return (CZ9) Enum.valueOf(CZ9.class, str);
    }

    public static CZ9[] values() {
        return (CZ9[]) A01.clone();
    }

    public CZ9(String str, int i) {
    }
}
