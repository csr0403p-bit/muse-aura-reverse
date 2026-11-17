package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GeI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC9704GeI {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9704GeI[] A01;
    public static final EnumC9704GeI A02;
    public static final EnumC9704GeI A03;
    public static final EnumC9704GeI A04;
    public static final EnumC9704GeI A05;
    public static final EnumC9704GeI A06;
    public static final EnumC9704GeI A07;
    public static final EnumC9704GeI A08;
    public static final EnumC9704GeI A09;
    public static final EnumC9704GeI A0A;
    public static final EnumC9704GeI A0B;
    public static final EnumC9704GeI A0C;
    public static final EnumC9704GeI A0D;
    public static final EnumC9704GeI A0E;
    public static final EnumC9704GeI A0F;
    public static final EnumC9704GeI A0G;
    public static final EnumC9704GeI A0H;
    public static final EnumC9704GeI A0I;
    public static final EnumC9704GeI A0J;
    public static final EnumC9704GeI A0K;
    public static final EnumC9704GeI A0L;
    public static final EnumC9704GeI A0M;
    public static final EnumC9704GeI A0N;
    public static final EnumC9704GeI A0O;
    public static final EnumC9704GeI A0P;
    public static final EnumC9704GeI A0Q;
    public static final EnumC9704GeI A0R;
    public final boolean isError;
    public final String resultMessage;

    static {
        EnumC9704GeI enumC9704GeIA00 = A00("BILLING_CLIENT_DISCONNECTED", "Google Billing client disconnected or unavailable", 0, true);
        A02 = enumC9704GeIA00;
        EnumC9704GeI enumC9704GeI = new EnumC9704GeI("BILLING_UNAVAILABLE", 1, "Billing API version is not supported for the type requested", true);
        A03 = enumC9704GeI;
        EnumC9704GeI enumC9704GeIA002 = A00("CONSUME_FAILURE", "Failed to consume Google purchase, refund will issue in 3 days", 2, true);
        A04 = enumC9704GeIA002;
        EnumC9704GeI enumC9704GeIA003 = A00("CONSUME_SKIPPED", "No purchases need to be consumed", 3, false);
        A05 = enumC9704GeIA003;
        EnumC9704GeI enumC9704GeIA004 = A00("DEVELOPER_ERROR", "Implementation error led to an incorrect state.", 4, true);
        A07 = enumC9704GeIA004;
        EnumC9704GeI enumC9704GeIA005 = A00("DCP_NOT_ENABLED", "DCP is not enabled for user", 5, true);
        A06 = enumC9704GeIA005;
        EnumC9704GeI enumC9704GeIA006 = A00("DCP_NOT_ENABLED_FOR_COUNTRY", "DCP is not enabled for the user country", 6, true);
        EnumC9704GeI enumC9704GeIA007 = A00("FB_SYNC_FAILED", "Sync with FB server failed", 7, true);
        A08 = enumC9704GeIA007;
        EnumC9704GeI enumC9704GeIA008 = A00("FETCH_INTERNAL_BILLING_INFO_FAILED", "Failed to fetch internal billing info", 8, true);
        A09 = enumC9704GeIA008;
        EnumC9704GeI enumC9704GeIA009 = A00("FI_CHECK_DECLINE", "FI check declined", 9, true);
        A0A = enumC9704GeIA009;
        EnumC9704GeI enumC9704GeIA0010 = A00("FI_CHECK_PENDING", "FI check pending", 10, true);
        A0B = enumC9704GeIA0010;
        EnumC9704GeI enumC9704GeIA0011 = A00("IAB_INIT_FAILED", "Error while initializing connection with Google", 11, true);
        A0C = enumC9704GeIA0011;
        EnumC9704GeI enumC9704GeIA0012 = A00("IAB_PRODUCT_FETCH_FAILED", "Unable to fetch product from Google", 12, true);
        A0D = enumC9704GeIA0012;
        EnumC9704GeI enumC9704GeIA0013 = A00("INIT_NOT_NEEDED", "No need for initializing the in app purchase controller", 13, false);
        A0E = enumC9704GeIA0013;
        EnumC9704GeI enumC9704GeIA0014 = A00("INVALID_OFFER_TOKEN", "No valid offer token to purchase subs products", 14, true);
        A0F = enumC9704GeIA0014;
        EnumC9704GeI enumC9704GeIA0015 = A00("MALFORMED_DATA", "Data didn't parse properly", 15, true);
        EnumC9704GeI enumC9704GeIA0016 = A00("NETWORK_FAILURE", "Network failure, failed to sync with fb", 16, true);
        A0G = enumC9704GeIA0016;
        EnumC9704GeI enumC9704GeIA0017 = A00("PENDING_PURCHASE", "Purchase pending on google play", 17, true);
        A0I = enumC9704GeIA0017;
        EnumC9704GeI enumC9704GeIA0018 = A00("PENDING_PURCHASE_ON_SKU", "Failure to purchase since item is already owned or active subscription on the same sku", 18, true);
        A0J = enumC9704GeIA0018;
        EnumC9704GeI enumC9704GeIA0019 = A00("SERVER_QUOTING_FAILED", "Failed to create quote", 19, true);
        A0L = enumC9704GeIA0019;
        EnumC9704GeI enumC9704GeIA0020 = A00("SERVER_VERIFICATION_FAILED", "Failed to verify purchase", 20, true);
        A0N = enumC9704GeIA0020;
        EnumC9704GeI enumC9704GeIA0021 = A00("SERVER_VERIFICATION_FAILED_MOCK", "Failed to verify mock purchase", 21, true);
        EnumC9704GeI enumC9704GeIA0022 = A00("SUCCESSFUL", "", 22, false);
        A0O = enumC9704GeIA0022;
        EnumC9704GeI enumC9704GeIA0023 = A00("SYNCHRONIZATION_FAILED", "Action to synchronize payments with Google completed unsuccessfully", 23, true);
        EnumC9704GeI enumC9704GeIA0024 = A00("SYNCHRONIZATION_SUCCESS", "Action to synchronize payments with Google completed successfully", 24, false);
        EnumC9704GeI enumC9704GeIA0025 = A00("UNKNOWN_FAILURE", "Got Unknown State from google", 25, true);
        A0P = enumC9704GeIA0025;
        EnumC9704GeI enumC9704GeIA0026 = A00("USER_CANCELLED_PAYMENT", "User cancelled the payment", 26, true);
        A0Q = enumC9704GeIA0026;
        EnumC9704GeI enumC9704GeIA0027 = A00("USER_CANNOT_ACCESS_PLAY_STORE", "User cannot access Play Store or has Play Store disabled", 27, true);
        EnumC9704GeI enumC9704GeIA0028 = A00("USER_PAYMENT_FAILED", "Purchase was unsuccessful in user flow", 28, true);
        A0R = enumC9704GeIA0028;
        EnumC9704GeI enumC9704GeIA0029 = A00("INLINE_INITIALIZATION_FAILURE", "Failed to initialize payments inline", 29, true);
        EnumC9704GeI enumC9704GeIA0030 = A00("UNKNOWN_PAYMENT_VERIFICATION_ERROR", "Unknown payment verification error", 30, true);
        EnumC9704GeI enumC9704GeIA0031 = A00("PURCHASE_ALREADY_IN_PROGRESS", "Purchase attempt blocked because another purchase is already in progress", 31, true);
        A0K = enumC9704GeIA0031;
        EnumC9704GeI enumC9704GeIA0032 = A00("SERVER_VERIFICATION_EMPTY_PURCHASES", "Server returned empty purchases", 32, true);
        A0M = enumC9704GeIA0032;
        EnumC9704GeI enumC9704GeIA0033 = A00("PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS", "This payment method does not have enough funds. Try another payment method.", 33, true);
        A0H = enumC9704GeIA0033;
        EnumC9704GeI[] enumC9704GeIArr = new EnumC9704GeI[34];
        System.arraycopy(new EnumC9704GeI[]{enumC9704GeIA00, enumC9704GeI, enumC9704GeIA002, enumC9704GeIA003, enumC9704GeIA004, enumC9704GeIA005, enumC9704GeIA006, enumC9704GeIA007, enumC9704GeIA008, enumC9704GeIA009, enumC9704GeIA0010, enumC9704GeIA0011, enumC9704GeIA0012, enumC9704GeIA0013, enumC9704GeIA0014, enumC9704GeIA0015, enumC9704GeIA0016, enumC9704GeIA0017, enumC9704GeIA0018, enumC9704GeIA0019, enumC9704GeIA0020, enumC9704GeIA0021, enumC9704GeIA0022, enumC9704GeIA0023, enumC9704GeIA0024, enumC9704GeIA0025, enumC9704GeIA0026}, 0, enumC9704GeIArr, 0, 27);
        System.arraycopy(new EnumC9704GeI[]{enumC9704GeIA0027, enumC9704GeIA0028, enumC9704GeIA0029, enumC9704GeIA0030, enumC9704GeIA0031, enumC9704GeIA0032, enumC9704GeIA0033}, 0, enumC9704GeIArr, 27, 7);
        A01 = enumC9704GeIArr;
        A00 = C3cG.A0w(enumC9704GeIArr);
    }

    public static EnumC9704GeI A00(String str, String str2, int i, boolean z) {
        return new EnumC9704GeI(str, i, str2, z);
    }

    public static EnumC9704GeI valueOf(String str) {
        return (EnumC9704GeI) Enum.valueOf(EnumC9704GeI.class, str);
    }

    public static EnumC9704GeI[] values() {
        return (EnumC9704GeI[]) A01.clone();
    }

    public EnumC9704GeI(String str, int i, String str2, boolean z) {
        this.resultMessage = str2;
        this.isError = z;
    }
}
