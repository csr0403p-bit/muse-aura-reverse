package X;

import androidx.media3.common.Timeline;

/* renamed from: X.Dtq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6007Dtq extends Du4 {
    public static final Object A02 = C3cG.A0T();
    public final Object A00;
    public final Object A01;

    @Override // X.Du4, androidx.media3.common.Timeline
    public final E6B A0D(E6B e6b, int i, boolean z) {
        super.A00.A0D(e6b, i, z);
        if (C6xC.A00(e6b.A05, this.A00) && z) {
            e6b.A05 = A02;
        }
        return e6b;
    }

    @Override // X.Du4, androidx.media3.common.Timeline
    public final C5998Dth A0E(C5998Dth c5998Dth, int i, long j) {
        super.A00.A0E(c5998Dth, i, j);
        if (C6xC.A00(c5998Dth.A0C, this.A01)) {
            c5998Dth.A0C = C5998Dth.A0G;
        }
        return c5998Dth;
    }

    public C6007Dtq(Timeline timeline, Object obj, Object obj2) {
        super(timeline);
        this.A01 = obj;
        this.A00 = obj2;
    }
}
