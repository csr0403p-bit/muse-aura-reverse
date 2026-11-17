package X;

import android.net.Uri;
import androidx.media3.common.Timeline;

/* renamed from: X.DlE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5587DlE extends Timeline {
    public static final Object A07 = C3cG.A0T();
    public static final C5704Dnm A08;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C5777DpJ A04;
    public final C5704Dnm A05;
    public final boolean A06;

    @Override // androidx.media3.common.Timeline
    public final E6B A0D(E6B e6b, int i, boolean z) {
        C1G.A03(i, 1);
        e6b.A04(null, z ? A07 : null, this.A00, 0L);
        return e6b;
    }

    @Override // androidx.media3.common.Timeline
    public final C5998Dth A0E(C5998Dth c5998Dth, int i, long j) {
        C1G.A03(i, 1);
        Object obj = C5998Dth.A0G;
        c5998Dth.A00(null, this.A05, obj, null, 0, this.A01, this.A03, -9223372036854775807L, 0L, this.A02, 0L, this.A06, false);
        return c5998Dth;
    }

    public C5587DlE(C5704Dnm c5704Dnm, long j, boolean z, boolean z2) {
        C5777DpJ c5777DpJ = z2 ? c5704Dnm.A02 : null;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = j;
        this.A02 = j;
        this.A06 = z;
        this.A05 = c5704Dnm;
        this.A04 = c5777DpJ;
    }

    static {
        C5608Dln c5608Dln = new C5608Dln();
        c5608Dln.A05 = "SinglePeriodTimeline";
        c5608Dln.A00 = Uri.EMPTY;
        A08 = c5608Dln.A00();
    }
}
