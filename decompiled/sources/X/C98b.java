package X;

/* renamed from: X.98b, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C98b implements InterfaceC2571Be0<String> {
    CLICK("CLICK"),
    CLIENT_PURCHASE_ERROR("CLIENT_PURCHASE_ERROR"),
    CLIENT_PURCHASE_SUCCESSFUL("CLIENT_PURCHASE_SUCCESSFUL"),
    CONSUMABLE_PURCHASE_CANCELLED("CONSUMABLE_PURCHASE_CANCELLED"),
    CONSUMABLE_PURCHASE_ERROR("CONSUMABLE_PURCHASE_ERROR"),
    CONSUMABLE_PURCHASE_INITIATE("CONSUMABLE_PURCHASE_INITIATE"),
    CONSUMABLE_PURCHASE_NOT_SUPPORTED_ERROR("CONSUMABLE_PURCHASE_NOT_SUPPORTED_ERROR"),
    CONSUMABLE_PURCHASE_SUCCESSFUL("CONSUMABLE_PURCHASE_SUCCESSFUL"),
    IMPRESSION("IMPRESSION"),
    PRICE_IMPRESSION("PRICE_IMPRESSION"),
    XGRADE_PURCHASE_ERROR("xgrade_purchase_error"),
    XGRADE_PURCHASE_SUCCESSFUL("xgrade_purchase_successful");

    public final String mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    C98b(String str) {
        this.mValue = str;
    }
}
