package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EPi {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EPi[] A01;
    public static final EPi A02;
    public static final EPi A03;
    public static final EPi A04;
    public static final EPi A05;
    public final String prefPrefix;

    static {
        EPi ePi = new EPi("ACTIVE_ACCOUNT", 0, "active_account/");
        A02 = ePi;
        EPi ePi2 = new EPi("INACTIVE_LOGGED_IN_ACCOUNTS", 1, "inactive_logged_in_accounts/");
        A04 = ePi2;
        EPi ePi3 = new EPi("SAVED_ACCOUNTS", 2, "saved_accounts/");
        A05 = ePi3;
        EPi ePi4 = new EPi("ALL_ACCOUNTS", 3, "all_accounts/");
        A03 = ePi4;
        EPi[] ePiArr = {ePi, ePi2, ePi3, ePi4};
        A01 = ePiArr;
        A00 = C3cG.A0w(ePiArr);
    }

    public static EPi valueOf(String str) {
        return (EPi) Enum.valueOf(EPi.class, str);
    }

    public static EPi[] values() {
        return (EPi[]) A01.clone();
    }

    public EPi(String str, int i, String str2) {
        this.prefPrefix = str2;
    }
}
