package X;

import java.io.Serializable;

/* renamed from: X.Duk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6049Duk implements Serializable {
    public final boolean shouldIncludeDecisionDetailsInCdnHeader;
    public final boolean shouldIncludeFeedPositionInCdnHeader;
    public final boolean shouldIncludeFeedPositionInDecisionTable;

    public C6049Duk() {
        this(true, false, false);
    }

    public C6049Duk(boolean z, boolean z2, boolean z3) {
        this.shouldIncludeDecisionDetailsInCdnHeader = true;
        this.shouldIncludeFeedPositionInDecisionTable = false;
        this.shouldIncludeFeedPositionInCdnHeader = false;
    }
}
