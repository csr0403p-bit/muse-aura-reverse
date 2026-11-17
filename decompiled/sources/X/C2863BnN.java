package X;

import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: X.BnN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2863BnN implements InterfaceC2864BnO {
    public InterfaceC2889Bnx A01;
    public final InterfaceC2864BnO A04;
    public final Surface A06;
    public final Object A05 = C3cG.A0T();
    public int A00 = 0;
    public boolean A02 = false;
    public final InterfaceC2889Bnx A03 = new F4V(this, 1);

    public final void A01() {
        synchronized (this.A05) {
            this.A02 = true;
            this.A04.A6K();
            if (this.A00 == 0) {
                close();
            }
        }
    }

    @Override // X.InterfaceC2864BnO
    public final InterfaceC2873Bng A30() {
        C2876Bnj c2876Bnj;
        synchronized (this.A05) {
            InterfaceC2873Bng interfaceC2873BngA30 = this.A04.A30();
            if (interfaceC2873BngA30 != null) {
                this.A00++;
                c2876Bnj = new C2876Bnj(interfaceC2873BngA30);
                c2876Bnj.A00(this.A03);
            } else {
                c2876Bnj = null;
            }
        }
        return c2876Bnj;
    }

    @Override // X.InterfaceC2864BnO
    public final InterfaceC2873Bng A31() {
        C2876Bnj c2876Bnj;
        synchronized (this.A05) {
            InterfaceC2873Bng interfaceC2873BngA31 = this.A04.A31();
            if (interfaceC2873BngA31 != null) {
                this.A00++;
                c2876Bnj = new C2876Bnj(interfaceC2873BngA31);
                c2876Bnj.A00(this.A03);
            } else {
                c2876Bnj = null;
            }
        }
        return c2876Bnj;
    }

    @Override // X.InterfaceC2864BnO
    public final void A6K() {
        synchronized (this.A05) {
            this.A04.A6K();
        }
    }

    @Override // X.InterfaceC2864BnO
    public final int AGJ() {
        int iAGJ;
        synchronized (this.A05) {
            iAGJ = this.A04.AGJ();
        }
        return iAGJ;
    }

    @Override // X.InterfaceC2864BnO
    public final int AHQ() {
        int iAHQ;
        synchronized (this.A05) {
            iAHQ = this.A04.AHQ();
        }
        return iAHQ;
    }

    @Override // X.InterfaceC2864BnO
    public final void Adw(InterfaceC2888Bnw interfaceC2888Bnw, Executor executor) {
        synchronized (this.A05) {
            this.A04.Adw(new F4P(0, this, interfaceC2888Bnw), executor);
        }
    }

    @Override // X.InterfaceC2864BnO
    public final void close() {
        synchronized (this.A05) {
            Surface surface = this.A06;
            if (surface != null) {
                surface.release();
            }
            this.A04.close();
        }
    }

    @Override // X.InterfaceC2864BnO
    public final int getHeight() {
        int height;
        synchronized (this.A05) {
            height = this.A04.getHeight();
        }
        return height;
    }

    @Override // X.InterfaceC2864BnO
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.A05) {
            surface = this.A04.getSurface();
        }
        return surface;
    }

    @Override // X.InterfaceC2864BnO
    public final int getWidth() {
        int width;
        synchronized (this.A05) {
            width = this.A04.getWidth();
        }
        return width;
    }

    public C2863BnN(InterfaceC2864BnO interfaceC2864BnO) {
        this.A04 = interfaceC2864BnO;
        this.A06 = interfaceC2864BnO.getSurface();
    }

    public static C2863BnN A00(int i, int i2, int i3, int i4) {
        return new C2863BnN(new C2884Bnr(ImageReader.newInstance(i, i2, i3, i4)));
    }
}
