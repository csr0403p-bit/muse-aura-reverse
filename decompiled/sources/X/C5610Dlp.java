package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Dlp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5610Dlp {
    public final long A00;
    public final long A01;
    public final long A02;
    public final VpsEventCallback A03;
    public final C5437DiY A04;
    public final C3159C0h A05;
    public final DF6 A06;
    public final EnumSet<EnumC5706Dno> A07 = EnumSet.of(EnumC5706Dno.MODERATE, EnumC5706Dno.GOOD, EnumC5706Dno.EXCELLENT);
    public final AtomicReference A08;
    public final boolean A09;

    public static final int A00(C5817Dq1 c5817Dq1, EnumC5706Dno enumC5706Dno) {
        if (c5817Dq1 == null) {
            return 0;
        }
        C5796Dpg c5796Dpg = new C5796Dpg(c5817Dq1);
        c5796Dpg.A00(enumC5706Dno);
        return c5796Dpg.A00;
    }

    public C5610Dlp(VpsEventCallback vpsEventCallback, C5437DiY c5437DiY, C3159C0h c3159C0h, DF6 df6, AtomicReference atomicReference, int i, int i2, int i3, boolean z) {
        this.A09 = z;
        this.A06 = df6;
        this.A04 = c5437DiY;
        this.A05 = c3159C0h;
        this.A03 = vpsEventCallback;
        this.A08 = atomicReference;
        this.A02 = i * 1000;
        this.A00 = i2 * 1000;
        this.A01 = i3 * 1000;
    }
}
