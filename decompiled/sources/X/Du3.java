package X;

import androidx.media3.common.Timeline;

/* loaded from: classes5.dex */
public final class Du3 extends Du4 {
    public final C5998Dth A00;
    public final /* synthetic */ C6428E5g A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Du3(Timeline timeline, C6428E5g c6428E5g) {
        super(timeline);
        this.A01 = c6428E5g;
        this.A00 = new C5998Dth();
    }

    @Override // X.Du4, androidx.media3.common.Timeline
    public final E6B A0D(E6B e6b, int i, boolean z) {
        boolean z2;
        E6B e6bA0D = super.A0D(e6b, i, z);
        if (BV7.A0d(this.A00, this, e6bA0D.A00).A08 != null) {
            Object obj = e6b.A04;
            Object obj2 = e6b.A05;
            int i2 = e6b.A00;
            long j = e6b.A01;
            long j2 = e6b.A02;
            E6C e6c = E6C.A02;
            z2 = true;
            e6bA0D.A04 = obj;
            e6bA0D.A05 = obj2;
            e6bA0D.A00 = i2;
            e6bA0D.A01 = j;
            e6bA0D.A02 = j2;
            e6bA0D.A03 = e6c;
        } else {
            z2 = true;
        }
        e6bA0D.A06 = z2;
        return e6bA0D;
    }
}
