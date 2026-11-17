package X;

import android.os.Looper;
import androidx.media3.common.Timeline;

/* renamed from: X.E0x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6322E0x {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public Looper A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Timeline A08;
    public final Dv4 A09;
    public final E7C A0A;
    public final InterfaceC6323E0y A0B;

    public final synchronized void A03(boolean z) {
        this.A05 = z | this.A05;
        this.A06 = true;
        notifyAll();
    }

    public final void A01() {
        C1G.A08(!this.A07);
        this.A07 = true;
        this.A0B.AcX(this);
    }

    public final void A02(int i) {
        C1G.A08(!this.A07);
        this.A01 = i;
    }

    public C6322E0x(Looper looper, Timeline timeline, E7C e7c, InterfaceC6323E0y interfaceC6323E0y, Dv4 dv4, int i) {
        this.A0B = interfaceC6323E0y;
        this.A09 = dv4;
        this.A08 = timeline;
        this.A03 = looper;
        this.A0A = e7c;
        this.A00 = i;
    }

    public static void A00(C6322E0x c6322E0x, Object obj, int i) {
        c6322E0x.A02(i);
        C1G.A08(!c6322E0x.A07);
        c6322E0x.A04 = obj;
        c6322E0x.A01();
    }
}
