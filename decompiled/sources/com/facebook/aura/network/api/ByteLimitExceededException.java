package com.facebook.aura.network.api;

import X.AnonymousClass001;
import X.C60O;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class ByteLimitExceededException extends IOException {
    public final long maxBytes;
    public final long observedBytes;
    public final boolean rejectedFromSizeHint;

    /* JADX WARN: Illegal instructions before constructor call */
    public ByteLimitExceededException(long j, long j2, boolean z) {
        StringBuilder sbA0x;
        if (z) {
            sbA0x = C60O.A0z("Stream advertises ", j2);
            sbA0x.append(" bytes, above the ");
        } else {
            sbA0x = C60O.A0x("Stream exceeds the ");
        }
        sbA0x.append(j);
        super(AnonymousClass001.A0v("-byte limit", sbA0x));
        this.maxBytes = j;
        this.observedBytes = j2;
        this.rejectedFromSizeHint = z;
    }

    public final long getMaxBytes() {
        return this.maxBytes;
    }

    public final long getObservedBytes() {
        return this.observedBytes;
    }

    public final boolean getRejectedFromSizeHint() {
        return this.rejectedFromSizeHint;
    }
}
