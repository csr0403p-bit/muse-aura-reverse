package com.facebook.aura.agentpermission;

/* loaded from: classes2.dex */
public final class PayWithLinkDetails {
    public static final int $stable = 0;
    public final String amount;
    public final String cardBrand;
    public final Long cardExpiresInMs;
    public final String cardLast4;
    public final String currency;
    public final String paymentMethod;
    public final String paymentMethodLabel;

    public final String getAmount() {
        return this.amount;
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final Long getCardExpiresInMs() {
        return this.cardExpiresInMs;
    }

    public final String getCardLast4() {
        return this.cardLast4;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentMethodLabel() {
        return this.paymentMethodLabel;
    }

    public PayWithLinkDetails(String str, String str2, String str3, String str4, String str5, Long l, String str6) {
        this.amount = str;
        this.currency = str2;
        this.paymentMethodLabel = str3;
        this.cardBrand = str4;
        this.cardLast4 = str5;
        this.cardExpiresInMs = l;
        this.paymentMethod = str6;
    }
}
