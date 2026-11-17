package X;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.facebook.debug.tracer.Tracer;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.DmG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class TextureViewSurfaceTextureListenerC5632DmG implements TextureView.SurfaceTextureListener {
    public Surface A00;
    public boolean A01;
    public final C5627DmA A02;
    public final DsJ A03;
    public final C5847Dqg A04;
    public final InterfaceC5843DqZ A05;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        boolean z;
        String strA0Y;
        String strA0Y2;
        DmR dmR;
        C7384Etj.A0Y(surfaceTexture, 0);
        Tracer.A01("GrootBaseTextureViewListenerImpl.onSurfaceTextureAvailable");
        try {
            Surface surface = new Surface(surfaceTexture);
            this.A00 = surface;
            this.A05.AWT(surfaceTexture, surface, i, i2);
            C5627DmA c5627DmA = (C5627DmA) this.A03;
            HeroPlayerSetting heroPlayerSetting = c5627DmA.A0Q;
            if (heroPlayerSetting.gen.eager_bind_player_set_surface && !AnonymousClass002.A1L((c5627DmA.A07.A0a > 0L ? 1 : (c5627DmA.A07.A0a == 0L ? 0 : -1))) && (dmR = c5627DmA.A08) != null) {
                c5627DmA.A07.A0E(dmR);
            }
            if (heroPlayerSetting.enableDav1dSurfaceControlCompat) {
                View view = c5627DmA.A02;
                if ((view instanceof SurfaceView) && ((SurfaceView) view) != null) {
                    try {
                        C5616Dlx c5616Dlx = c5627DmA.A0P.A00;
                        if (c5616Dlx == null) {
                            c5616Dlx = null;
                        }
                        if (c5616Dlx != null) {
                            strA0Y = C3cI.A0Y(c5616Dlx);
                            InterfaceC6085DvP interfaceC6085DvPDav1dSurfaceControlPresenterFactory = c5616Dlx.A0F.dav1dSurfaceControlPresenterFactory();
                            if (interfaceC6085DvPDav1dSurfaceControlPresenterFactory != null) {
                                strA0Y2 = C3cI.A0Y(interfaceC6085DvPDav1dSurfaceControlPresenterFactory);
                            }
                            CFK.A0H("GrootPlayer", "dav1d SCC enabled but presenter is null (manager=%s, factory=%s)", strA0Y, strA0Y2);
                        } else {
                            strA0Y = null;
                        }
                        strA0Y2 = null;
                        CFK.A0H("GrootPlayer", "dav1d SCC enabled but presenter is null (manager=%s, factory=%s)", strA0Y, strA0Y2);
                    } catch (Exception e) {
                        CFK.A0A("GrootPlayer", "Failed to create dav1d SCC presenter", e);
                    }
                }
            }
            C5625Dm8 c5625Dm8 = c5627DmA.A07;
            C5625Dm8.A0A(c5625Dm8, "setSurface %x", BV5.A0X(surface));
            Dlv dlv = c5625Dm8.A06.gen;
            if (dlv == null || !dlv.count_queued_surface_in_attach_guard) {
                z = false;
            } else {
                z = true;
                c5625Dm8.A0T.set(surface);
            }
            if (!C5625Dm8.A0B(c5625Dm8.A0F.obtainMessage(6, new Object[]{surface, -1, -1, null}), c5625Dm8) && z) {
                Bs8.A00(surface, null, c5625Dm8.A0T);
            }
            C5625Dm8.A0l.add(surface);
        } finally {
            Tracer.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    @Override // android.view.TextureView.SurfaceTextureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r23) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC5632DmG.onSurfaceTextureDestroyed(android.graphics.SurfaceTexture):boolean");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C7384Etj.A0Y(surfaceTexture, 0);
        Tracer.A01("GrootBaseTextureViewListenerImpl.onSurfaceTextureSizeChanged");
        try {
            this.A05.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        } finally {
            Tracer.A00();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C7384Etj.A0Y(surfaceTexture, 0);
        Tracer.A01("GrootBaseTextureViewListenerImpl.onSurfaceTextureUpdated");
        try {
            if (!this.A01) {
                this.A01 = true;
                this.A05.ATd(surfaceTexture, this.A00);
            }
            this.A05.onSurfaceTextureUpdated(surfaceTexture);
            C5720DoF c5720DoF = this.A02.A04;
            if (c5720DoF != null) {
                synchronized (c5720DoF) {
                    HeroPlayerSetting heroPlayerSetting = c5720DoF.A02;
                    if (heroPlayerSetting.enableBlackscreenDetector || heroPlayerSetting.gen.enable_blackscreen_detector) {
                        c5720DoF.A05 = SystemClock.elapsedRealtime();
                    }
                }
            }
        } finally {
            Tracer.A00();
        }
    }

    public TextureViewSurfaceTextureListenerC5632DmG(C5627DmA c5627DmA, DsJ dsJ, C5847Dqg c5847Dqg, InterfaceC5843DqZ interfaceC5843DqZ) {
        this.A03 = dsJ;
        this.A04 = c5847Dqg;
        this.A05 = interfaceC5843DqZ;
        this.A02 = c5627DmA;
    }
}
