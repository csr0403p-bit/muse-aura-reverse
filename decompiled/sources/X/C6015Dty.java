package X;

import androidx.media3.common.Timeline;

/* renamed from: X.Dty, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6015Dty extends Timeline {
    public final C5704Dnm A00;

    @Override // androidx.media3.common.Timeline
    public final E6B A0D(E6B e6b, int i, boolean z) {
        Integer numA0V;
        Object obj = null;
        if (z) {
            numA0V = BV4.A0V();
            obj = C6007Dtq.A02;
        } else {
            numA0V = null;
        }
        E6C e6c = E6C.A02;
        e6b.A04 = numA0V;
        e6b.A05 = obj;
        e6b.A00 = 0;
        e6b.A01 = -9223372036854775807L;
        e6b.A02 = 0L;
        e6b.A03 = e6c;
        e6b.A06 = true;
        return e6b;
    }

    @Override // androidx.media3.common.Timeline
    public final C5998Dth A0E(C5998Dth c5998Dth, int i, long j) {
        c5998Dth.A00(null, this.A00, C5998Dth.A0G, null, 0, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, -9223372036854775807L, 0L, false, true);
        c5998Dth.A0E = true;
        return c5998Dth;
    }

    public C6015Dty(C5704Dnm c5704Dnm) {
        this.A00 = c5704Dnm;
    }
}
