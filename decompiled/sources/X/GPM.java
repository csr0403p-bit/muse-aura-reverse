package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class GPM {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ GPM[] A01;
    public static final GPM A02;
    public static final GPM A03;
    public static final GPM A04;
    public static final GPM A05;
    public final String value;

    static {
        GPM gpm = new GPM("BILLING_FLOW_PRODUCT_DETAILS_MISSING", 0, "4054022");
        A02 = gpm;
        GPM gpm2 = new GPM("INVALID_OFFER_TOKEN", 1, "4054031");
        A03 = gpm2;
        GPM gpm3 = new GPM("INVALID_QUOTE_RESPONSE", 2, "4054107");
        A04 = gpm3;
        GPM gpm4 = new GPM("PURCHASE_VERIFICATION_EMPTY_RESPONSE", 3, "4054100");
        A05 = gpm4;
        GPM[] gpmArr = {gpm, gpm2, gpm3, gpm4};
        A01 = gpmArr;
        A00 = C3cG.A0w(gpmArr);
    }

    public static GPM valueOf(String str) {
        return (GPM) Enum.valueOf(GPM.class, str);
    }

    public static GPM[] values() {
        return (GPM[]) A01.clone();
    }

    public GPM(String str, int i, String str2) {
        this.value = str2;
    }
}
