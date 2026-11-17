package com.facebook.aura.composer.upload;

import X.FGI;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class AttachmentTooLargeException extends IOException {
    public final long maxSizeBytes;

    public AttachmentTooLargeException(long j) {
        super(FGI.A0J("Attachment exceeds ", j, " bytes"));
        this.maxSizeBytes = j;
    }

    public final long getMaxSizeBytes() {
        return this.maxSizeBytes;
    }
}
