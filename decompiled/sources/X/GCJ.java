package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class GCJ extends GCK<GCJ> {
    public final /* synthetic */ AtomicReferenceArray A00;

    @Override // X.GCK
    public final int A04() {
        return GCQ.A01;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SemaphoreSegment[id=");
        sbA0x.append(super.A00);
        sbA0x.append(", hashCode=");
        sbA0x.append(hashCode());
        return BV5.A0o(sbA0x);
    }

    public GCJ(GCJ gcj, int i, long j) {
        super(gcj, i, j);
        this.A00 = new AtomicReferenceArray(GCQ.A01);
    }
}
