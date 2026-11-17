package com.facebook.aura.composer.upload;

import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BV4;
import X.C06H;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class UploadLogAttachment {
    public final String id;
    public final int manualRetryCount;
    public final String mimeType;
    public final AtomicBoolean uploadStarted;

    public /* synthetic */ UploadLogAttachment(String str, String str2, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? AnonymousClass002.A0k() : str, str2, (i2 & 4) != 0 ? 0 : i);
    }

    public final String getId() {
        return this.id;
    }

    public final int getManualRetryCount() {
        return this.manualRetryCount;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final AtomicBoolean getUploadStarted() {
        return this.uploadStarted;
    }

    public UploadLogAttachment(String str, String str2, int i) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        this.id = str;
        this.mimeType = str2;
        this.manualRetryCount = i;
        this.uploadStarted = BV4.A12(zA1b);
    }
}
