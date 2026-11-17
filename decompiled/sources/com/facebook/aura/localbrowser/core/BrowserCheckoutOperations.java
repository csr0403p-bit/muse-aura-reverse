package com.facebook.aura.localbrowser.core;

import X.AnonymousClass005;
import com.hatch.browser.protocol.Command;
import com.hatch.browser.protocol.DocumentKey;
import com.hatch.browser.protocol.ReportImageFormat;

/* loaded from: classes6.dex */
public final class BrowserCheckoutOperations {
    public static final int $stable = 0;
    public static final BrowserCheckoutOperations INSTANCE = new BrowserCheckoutOperations();

    public final BrowserOperation shopPayApprove(DocumentKey documentKey, String str, String str2) {
        AnonymousClass005.A10(documentKey, str, str2);
        return new BrowserOperation(new Command.ShopPayApprove(documentKey, str, str2), false, null, ReportImageFormat.JPEG);
    }

    public final BrowserOperation shopifyCheckout() {
        return new BrowserOperation(Command.ShopifyCheckout.INSTANCE, false, null, ReportImageFormat.JPEG);
    }
}
