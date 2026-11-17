package X;

/* renamed from: X.FuP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC8950FuP implements GIT {
    /* JADX INFO: Fake field, exist only in values array */
    EF21("FEATURE_TYPE_UNSPECIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF20("SUBSCRIPTIONS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("SUBSCRIPTIONS_UPDATE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("PRICE_CHANGE_CONFIRMATION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("IN_APP_MESSAGING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF16("CROSS_SELL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("PER_TRANSACTION_OFFER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("MULTI_ITEM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("PRODUCT_DETAILS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("BILLING_CONFIG"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("ALTERNATIVE_BILLING_ONLY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("EXTERNAL_OFFER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("MULTI_ITEM_WITH_SEASON_PASS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("AUTO_PAY"),
    A01("INCLUDE_SUSPENDED_SUBSCRIPTIONS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF184("GIFT_CODES_PURCHASE");

    public final int a;

    @Override // X.GIT
    public final int A2f() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("<");
        AbstractC7611F5y.A0o(EnumC8950FuP.class, this, sbA0x);
        AbstractC7611F5y.A0p(this, sbA0x, this.a);
        return sbA0x.toString();
    }

    EnumC8950FuP(String str) {
        this.a = i;
    }
}
