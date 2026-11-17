package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class E1S extends AbstractC3113Byd {
    public final long A00;
    public final long A01;
    public final List<E1W> A02;

    @Override // X.AbstractC3113Byd
    public final String toString() {
        return FGI.A0b("SCTE-35 SpliceInsertCommand { programSplicePts=", ", programSplicePlaybackPositionUs= ", " }", this.A01, this.A00);
    }

    public E1S(List list, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = Collections.unmodifiableList(list);
    }
}
