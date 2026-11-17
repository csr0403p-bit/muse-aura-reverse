package X;

import java.io.Serializable;

/* renamed from: X.Dzo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6292Dzo implements Serializable {
    public final boolean isStartupHeaderCostEnabled;
    public final long missingSegmentIndexSetupBytes;

    public C6292Dzo() {
        this(0L, false);
    }

    public C6292Dzo(long j, boolean z) {
        this.missingSegmentIndexSetupBytes = 0L;
        this.isStartupHeaderCostEnabled = false;
    }
}
