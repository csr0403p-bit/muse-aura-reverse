package X;

import androidx.media3.common.Timeline;

/* loaded from: classes5.dex */
public abstract class Du4 extends Timeline {
    public final Timeline A00;

    @Override // androidx.media3.common.Timeline
    public E6B A0D(E6B e6b, int i, boolean z) {
        return this.A00.A0D(e6b, i, z);
    }

    @Override // androidx.media3.common.Timeline
    public C5998Dth A0E(C5998Dth c5998Dth, int i, long j) {
        return this.A00.A0E(c5998Dth, i, j);
    }

    public Du4(Timeline timeline) {
        this.A00 = timeline;
    }
}
