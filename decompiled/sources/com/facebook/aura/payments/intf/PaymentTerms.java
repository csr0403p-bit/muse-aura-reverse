package com.facebook.aura.payments.intf;

import X.AnonymousClass005;

/* loaded from: classes.dex */
public final class PaymentTerms {
    public static final int $stable = 0;
    public final String linkLabel;
    public final String linkUrl;
    public final String text;

    public final String getLinkLabel() {
        return this.linkLabel;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getText() {
        return this.text;
    }

    public PaymentTerms(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.text = str;
        this.linkLabel = str2;
        this.linkUrl = str3;
    }
}
