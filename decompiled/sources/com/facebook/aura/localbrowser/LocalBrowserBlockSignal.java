package com.facebook.aura.localbrowser;

import X.AnonymousClass003;

/* loaded from: classes2.dex */
public final class LocalBrowserBlockSignal {
    public static final int $stable = 0;
    public final int httpStatus;
    public final String site;
    public final String vendor;

    public final int getHttpStatus() {
        return this.httpStatus;
    }

    public final String getSite() {
        return this.site;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public LocalBrowserBlockSignal(String str, String str2, int i) {
        AnonymousClass003.A0u(str, str2);
        this.site = str;
        this.vendor = str2;
        this.httpStatus = i;
    }
}
