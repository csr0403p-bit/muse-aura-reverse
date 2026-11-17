package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GPp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC9578GPp {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9578GPp[] A01;
    public static final EnumC9578GPp A02;
    public static final EnumC9578GPp A03;
    public static final EnumC9578GPp A04;
    public static final EnumC9578GPp A05;
    public final String eventName;

    static {
        EnumC9578GPp enumC9578GPp = new EnumC9578GPp("CLIENT_LOAD_IAP_STORE_PURCHASES_INIT", 0, "client_load_iap_store_purchases_init");
        A03 = enumC9578GPp;
        EnumC9578GPp enumC9578GPp2 = new EnumC9578GPp("CLIENT_LOAD_IAP_STORE_PURCHASES_SUCCESS", 1, "client_load_iap_store_purchases_success");
        A04 = enumC9578GPp2;
        EnumC9578GPp enumC9578GPp3 = new EnumC9578GPp("CLIENT_LOAD_IAP_STORE_PURCHASES_FAIL", 2, "client_load_iap_store_purchases_fail");
        A02 = enumC9578GPp3;
        EnumC9578GPp enumC9578GPp4 = new EnumC9578GPp("CLIENT_LOG_NULL_BILLING_CLIENT", 3, "client_log_null_billing_client");
        EnumC9578GPp enumC9578GPp5 = new EnumC9578GPp("CLIENT_RECEIVE_EMPTY_PURCHASE_LIST_FROM_GOOGLE", 4, "client_receive_empty_purchase_list_from_google");
        A05 = enumC9578GPp5;
        EnumC9578GPp[] enumC9578GPpArr = {enumC9578GPp, enumC9578GPp2, enumC9578GPp3, enumC9578GPp4, enumC9578GPp5, new EnumC9578GPp("CLIENT_SHOW_INAPPMESSAGE_INIT", 5, "client_show_inappmessage_init"), new EnumC9578GPp("CLIENT_SHOW_INAPPMESSAGE_SUCCESS", 6, "client_show_inappmessage_success"), new EnumC9578GPp("CLIENT_SHOW_INAPPMESSAGE_FAIL", 7, "client_show_inappmessage_fail")};
        A01 = enumC9578GPpArr;
        A00 = C3cG.A0w(enumC9578GPpArr);
    }

    public static EnumC9578GPp valueOf(String str) {
        return (EnumC9578GPp) Enum.valueOf(EnumC9578GPp.class, str);
    }

    public static EnumC9578GPp[] values() {
        return (EnumC9578GPp[]) A01.clone();
    }

    public EnumC9578GPp(String str, int i, String str2) {
        this.eventName = str2;
    }
}
