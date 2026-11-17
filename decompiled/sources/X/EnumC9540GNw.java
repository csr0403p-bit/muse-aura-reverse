package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GNw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC9540GNw implements GIT {
    public static final /* synthetic */ EnumC9540GNw[] A00;
    public static final EnumC9540GNw A01;
    public static final EnumC9540GNw A02;
    public static final EnumC9540GNw A03;
    public static final EnumC9540GNw A04;
    public static final EnumC9540GNw A05;
    public static final EnumC9540GNw A06;
    public static final EnumC9540GNw A07;
    public static final EnumC9540GNw A08;
    public static final EnumC9540GNw A09;
    public static final EnumC9540GNw A0A;
    public static final EnumC9540GNw A0B;
    public static final EnumC9540GNw A0C;
    public static final EnumC9540GNw A0D;
    public static final EnumC9540GNw A0E;
    public static final EnumC9540GNw A0F;
    public final int a;

    static {
        EnumC9540GNw enumC9540GNw = new EnumC9540GNw(0, 0, "API_METHOD_UNSPECIFIED");
        A02 = enumC9540GNw;
        EnumC9540GNw enumC9540GNw2 = new EnumC9540GNw(1, 1, "LAUNCH_BILLING_FLOW");
        A03 = enumC9540GNw2;
        EnumC9540GNw enumC9540GNw3 = new EnumC9540GNw(2, 2, "ACKNOWLEDGE_PURCHASE");
        A04 = enumC9540GNw3;
        EnumC9540GNw enumC9540GNw4 = new EnumC9540GNw(3, 3, "CONSUME_ASYNC");
        A05 = enumC9540GNw4;
        EnumC9540GNw enumC9540GNw5 = new EnumC9540GNw(4, 4, "IS_FEATURE_SUPPORTED");
        A06 = enumC9540GNw5;
        EnumC9540GNw enumC9540GNw6 = new EnumC9540GNw(5, 5, "START_CONNECTION");
        A07 = enumC9540GNw6;
        EnumC9540GNw enumC9540GNw7 = new EnumC9540GNw(6, 6, "QUERY_PRODUCT_DETAILS_ASYNC");
        A08 = enumC9540GNw7;
        EnumC9540GNw enumC9540GNw8 = new EnumC9540GNw(7, 7, "QUERY_SKU_DETAILS_ASYNC");
        EnumC9540GNw enumC9540GNw9 = new EnumC9540GNw(8, 8, "QUERY_PURCHASES_ASYNC");
        A09 = enumC9540GNw9;
        EnumC9540GNw enumC9540GNw10 = new EnumC9540GNw(9, 9, "QUERY_PURCHASES");
        EnumC9540GNw enumC9540GNw11 = new EnumC9540GNw(10, 10, "QUERY_PURCHASE_HISTORY_ASYNC");
        EnumC9540GNw enumC9540GNw12 = new EnumC9540GNw(11, 11, "END_CONNECTION");
        A0A = enumC9540GNw12;
        EnumC9540GNw enumC9540GNw13 = new EnumC9540GNw(12, 12, "GET_BILLING_CONFIG_ASYNC");
        A0B = enumC9540GNw13;
        EnumC9540GNw enumC9540GNw14 = new EnumC9540GNw(13, 13, "IS_ALTERNATIVE_BILLING_ONLY_AVAILABLE_ASYNC");
        EnumC9540GNw enumC9540GNw15 = new EnumC9540GNw(14, 14, "CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS_ASYNC");
        EnumC9540GNw enumC9540GNw16 = new EnumC9540GNw(15, 15, "SHOW_ALTERNATIVE_BILLING_ONLY_INFORMATION_DIALOG");
        EnumC9540GNw enumC9540GNw17 = new EnumC9540GNw(16, 22, "IS_EXTERNAL_OFFER_AVAILABLE_ASYNC");
        EnumC9540GNw enumC9540GNw18 = new EnumC9540GNw(17, 23, "CREATE_EXTERNAL_OFFER_REPORTING_DETAILS_ASYNC");
        EnumC9540GNw enumC9540GNw19 = new EnumC9540GNw(18, 24, "SHOW_EXTERNAL_OFFER_INFORMATION_DIALOG");
        EnumC9540GNw enumC9540GNw20 = new EnumC9540GNw(19, 25, "START_BILLING_OVERRIDE_SERVICE_CONNECTION");
        A0C = enumC9540GNw20;
        EnumC9540GNw enumC9540GNw21 = new EnumC9540GNw(20, 26, "END_BILLING_OVERRIDE_SERVICE_CONNECTION");
        A0D = enumC9540GNw21;
        EnumC9540GNw enumC9540GNw22 = new EnumC9540GNw(21, 27, "GET_BILLING_OVERRIDE");
        A0E = enumC9540GNw22;
        EnumC9540GNw enumC9540GNw23 = new EnumC9540GNw(22, 28, "GET_BILLING_CONFIG_DELEGATION_ASYNC");
        A0F = enumC9540GNw23;
        EnumC9540GNw enumC9540GNw24 = new EnumC9540GNw(23, 29, "SHOW_IN_APP_MESSAGES");
        EnumC9540GNw enumC9540GNw25 = new EnumC9540GNw(24, 30, "LAUNCH_REDEEM_CODE_FLOW");
        EnumC9540GNw enumC9540GNw26 = new EnumC9540GNw(25, 31, "PURCHASES_UPDATED_BROADCAST");
        A01 = enumC9540GNw26;
        EnumC9540GNw enumC9540GNw27 = new EnumC9540GNw(26, 32, "IS_BILLING_PROGRAM_AVAILABLE_ASYNC");
        EnumC9540GNw[] enumC9540GNwArr = new EnumC9540GNw[34];
        System.arraycopy(new EnumC9540GNw[]{new EnumC9540GNw(27, 33, "LAUNCH_EXTERNAL_OFFER_FLOW"), new EnumC9540GNw(28, 34, "CREATE_BILLING_PROGRAM_REPORTING_DETAILS_ASYNC"), new EnumC9540GNw(29, 35, "INITIALIZE"), new EnumC9540GNw(30, 36, "LAUNCH_EXTERNAL_LINK"), new EnumC9540GNw(31, 37, "LAUNCH_SUBSCRIPTION_MANAGEMENT_ACTION_FLOW"), new EnumC9540GNw(32, 38, "SHOW_BILLING_PROGRAM_INFORMATION_DIALOG"), new EnumC9540GNw(33, 39, "GET_BILLING_CHOICE_INFO_ASYNC")}, BV5.A1U(new EnumC9540GNw[]{enumC9540GNw, enumC9540GNw2, enumC9540GNw3, enumC9540GNw4, enumC9540GNw5, enumC9540GNw6, enumC9540GNw7, enumC9540GNw8, enumC9540GNw9, enumC9540GNw10, enumC9540GNw11, enumC9540GNw12, enumC9540GNw13, enumC9540GNw14, enumC9540GNw15, enumC9540GNw16, enumC9540GNw17, enumC9540GNw18, enumC9540GNw19, enumC9540GNw20, enumC9540GNw21, enumC9540GNw22, enumC9540GNw23, enumC9540GNw24, enumC9540GNw25, enumC9540GNw26, enumC9540GNw27}, enumC9540GNwArr) ? 1 : 0, enumC9540GNwArr, 27, 7);
        A00 = enumC9540GNwArr;
    }

    public static EnumC9540GNw[] values() {
        return (EnumC9540GNw[]) A00.clone();
    }

    @Override // X.GIT
    public final int A2f() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("<");
        AbstractC7611F5y.A0o(EnumC9540GNw.class, this, sbA0x);
        AbstractC7611F5y.A0p(this, sbA0x, this.a);
        return sbA0x.toString();
    }

    public EnumC9540GNw(int i, int i2, String str) {
        this.a = i2;
    }
}
