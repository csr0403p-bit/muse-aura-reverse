package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.Dpw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5812Dpw implements InterfaceC5843DqZ {
    public final InterfaceC5843DqZ[] A00;

    public C5812Dpw(InterfaceC5843DqZ... interfaceC5843DqZArr) {
        C7384Etj.A0Y(interfaceC5843DqZArr, 0);
        this.A00 = interfaceC5843DqZArr;
    }

    @Override // X.InterfaceC5843DqZ
    public final void ATd(SurfaceTexture surfaceTexture, Surface surface) {
        C7384Etj.A0Y(surfaceTexture, 0);
        for (InterfaceC5843DqZ interfaceC5843DqZ : this.A00) {
            if (interfaceC5843DqZ != null) {
                interfaceC5843DqZ.ATd(surfaceTexture, surface);
            }
        }
    }

    @Override // X.InterfaceC5843DqZ
    public final void AWQ(Surface surface) {
        C7384Etj.A0Y(surface, 0);
        for (InterfaceC5843DqZ interfaceC5843DqZ : this.A00) {
            if (interfaceC5843DqZ != null) {
                interfaceC5843DqZ.AWQ(surface);
            }
        }
    }

    @Override // X.InterfaceC5843DqZ
    public final void AWT(SurfaceTexture surfaceTexture, Surface surface, int i, int i2) {
        C7384Etj.A0Y(surfaceTexture, 0);
        for (InterfaceC5843DqZ interfaceC5843DqZ : this.A00) {
            if (interfaceC5843DqZ != null) {
                interfaceC5843DqZ.AWT(surfaceTexture, surface, i, i2);
            }
        }
    }

    @Override // X.InterfaceC5843DqZ
    public final void AWU(SurfaceTexture surfaceTexture, Surface surface) {
        C7384Etj.A0Y(surfaceTexture, 0);
        for (InterfaceC5843DqZ interfaceC5843DqZ : this.A00) {
            if (interfaceC5843DqZ != null) {
                interfaceC5843DqZ.AWU(surfaceTexture, surface);
            }
        }
    }

    @Override // X.InterfaceC5843DqZ
    public final void AWV(SurfaceTexture surfaceTexture) {
        C7384Etj.A0Y(surfaceTexture, 0);
        for (InterfaceC5843DqZ interfaceC5843DqZ : this.A00) {
            if (interfaceC5843DqZ != null) {
                interfaceC5843DqZ.AWV(surfaceTexture);
            }
        }
    }

    @Override // X.InterfaceC5843DqZ
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C7384Etj.A0Y(surfaceTexture, 0);
        for (InterfaceC5843DqZ interfaceC5843DqZ : this.A00) {
            if (interfaceC5843DqZ != null) {
                interfaceC5843DqZ.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }
    }

    @Override // X.InterfaceC5843DqZ
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C7384Etj.A0Y(surfaceTexture, 0);
        for (InterfaceC5843DqZ interfaceC5843DqZ : this.A00) {
            if (interfaceC5843DqZ != null) {
                interfaceC5843DqZ.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }
}
