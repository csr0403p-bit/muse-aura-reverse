package X;

import java.io.Serializable;

/* renamed from: X.Dzn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6291Dzn implements Serializable {
    public final String allowanceCurve;
    public final long endIndex;
    public final boolean isEnabled;
    public final long startIndex;

    public C6291Dzn() {
        this(3L, "3,200; 4,600; 5,1200", false, 5L);
    }

    public C6291Dzn(long j, String str, boolean z, long j2) {
        this.isEnabled = false;
        this.startIndex = 3L;
        this.endIndex = 5L;
        this.allowanceCurve = "3,200; 4,600; 5,1200";
    }
}
