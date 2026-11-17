package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.F4r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7578F4r implements BeM {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C7578F4r(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.BeM
    public final void accept(Object obj) {
        Surface surfaceRemove;
        C3021BsG c3021BsG;
        switch (this.$t) {
            case 0:
                Surface surface = (Surface) this.A00;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.A01;
                surface.release();
                surfaceTexture.release();
                return;
            case 1:
                C3018BsD c3018BsD = (C3018BsD) this.A00;
                InterfaceC2969BqO interfaceC2969BqO = (InterfaceC2969BqO) this.A01;
                interfaceC2969BqO.close();
                surfaceRemove = c3018BsD.A06.remove(interfaceC2969BqO);
                if (surfaceRemove != null) {
                    c3021BsG = c3018BsD.A04;
                    break;
                } else {
                    return;
                }
            case 2:
                C3019BsE c3019BsE = (C3019BsE) this.A00;
                InterfaceC2969BqO interfaceC2969BqO2 = (InterfaceC2969BqO) this.A01;
                interfaceC2969BqO2.close();
                surfaceRemove = c3019BsE.A06.remove(interfaceC2969BqO2);
                if (surfaceRemove != null) {
                    c3021BsG = c3019BsE.A05;
                    break;
                } else {
                    return;
                }
            default:
                ((GOX) this.A00).A00((GNM) obj);
                return;
        }
        AbstractC3025BsK.A06(c3021BsG.A0C, true);
        AbstractC3025BsK.A05(c3021BsG.A08);
        c3021BsG.A07(surfaceRemove, true);
    }
}
