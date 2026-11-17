package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;

/* renamed from: X.E5z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class SurfaceHolderCallbackC6446E5z implements InterfaceC6239Dyh, InterfaceC6243Dym, E7Z, InterfaceC5318DgC, InterfaceC5408Di1, E80, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, E85 {
    public final /* synthetic */ C6438E5q A00;

    public SurfaceHolderCallbackC6446E5z(C6438E5q c6438E5q) {
        this.A00 = c6438E5q;
    }

    @Override // X.E80
    public final void ARk() {
        C6438E5q.A0L(this.A00, 3, false);
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioCodecError(Exception exc) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.onAudioCodecError(exc);
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.ARm();
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioDecoderReleased(String str) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.ARn();
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioDisabled(C6173DxG c6173DxG) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.onAudioDisabled(c6173DxG);
        c6438E5q.A07 = null;
        c6438E5q.A0E = null;
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioEnabled(C6173DxG c6173DxG) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0E = c6173DxG;
        c6438E5q.A0p.onAudioEnabled(c6173DxG);
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A07 = c6154Dwx;
        c6438E5q.A0p.onAudioInputFormatChanged(c6154Dwx, c2461Bbo);
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioPositionAdvancing(long j) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.ARr();
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioSinkError(Exception exc) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.onAudioSinkError(exc);
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioTrackInitialized(C6518EAw c6518EAw) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.onAudioTrackInitialized(c6518EAw);
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioTrackReleased(C6518EAw c6518EAw) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.onAudioTrackReleased(c6518EAw);
    }

    @Override // X.InterfaceC6239Dyh
    public final void onAudioUnderrun(int i, long j, long j2) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.ARs();
    }

    @Override // X.InterfaceC5318DgC
    public final void onCues(DXD dxd) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0D = dxd;
        C6443E5w<E76> c6443E5w = c6438E5q.A0j;
        c6443E5w.A03(new C7585F4y(dxd, 12), 27);
        c6443E5w.A01();
    }

    @Override // X.InterfaceC6243Dym
    public final void onDroppedFrames(int i, long j) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.ASq(i);
    }

    @Override // X.InterfaceC5408Di1
    public final void onMetadata(C5402Dhv c5402Dhv) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        C10389Has c10389Has = new C10389Has(c6438E5q.A0A);
        int i = 0;
        while (true) {
            InterfaceC5403Dhw[] interfaceC5403DhwArr = c5402Dhv.A01;
            if (i >= interfaceC5403DhwArr.length) {
                break;
            }
            interfaceC5403DhwArr[i].AY7(c10389Has);
            i++;
        }
        c6438E5q.A0A = new C10388Har(c10389Has);
        C10388Har c10388HarA0B = C6438E5q.A0B(c6438E5q);
        if (!c10388HarA0B.equals(c6438E5q.A09)) {
            c6438E5q.A09 = c10388HarA0B;
            c6438E5q.A0j.A03(new C7585F4y(this, 13), 14);
        }
        C6443E5w<E76> c6443E5w = c6438E5q.A0j;
        c6443E5w.A03(new C7585F4y(c5402Dhv, 14), 28);
        c6443E5w.A01();
    }

    @Override // X.InterfaceC6243Dym
    public final void onRenderedFirstFrame(Object obj, long j) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.AVI(obj);
        if (c6438E5q.A0L == obj) {
            C6443E5w<E76> c6443E5w = c6438E5q.A0j;
            c6443E5w.A03(new C7583F4w(0), 26);
            c6443E5w.A01();
        }
    }

    @Override // X.InterfaceC6239Dyh
    public final void onSkipSilenceEnabledChanged(final boolean z) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        if (c6438E5q.A0P != z) {
            c6438E5q.A0P = z;
            C6443E5w<E76> c6443E5w = c6438E5q.A0j;
            c6443E5w.A03(new E7R() { // from class: X.E7L
                @Override // X.E7R
                public final void ANx(Object obj) {
                    ((E76) obj).onSkipSilenceEnabledChanged(z);
                }
            }, 23);
            c6443E5w.A01();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        Surface surface = new Surface(surfaceTexture);
        C6438E5q.A0N(c6438E5q, surface);
        c6438E5q.A05 = surface;
        C6438E5q.A0K(c6438E5q, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q.A0N(c6438E5q, null);
        C6438E5q.A0K(c6438E5q, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C6438E5q.A0K(this.A00, i, i2);
    }

    @Override // X.InterfaceC6243Dym
    public final void onVideoCodecError(Exception exc) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.onVideoCodecError(exc);
    }

    @Override // X.InterfaceC6243Dym
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.AX5();
    }

    @Override // X.InterfaceC6243Dym
    public final void onVideoDecoderReleased(String str) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.AX6();
    }

    @Override // X.InterfaceC6243Dym
    public final void onVideoDisabled(C6173DxG c6173DxG) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.onVideoDisabled(c6173DxG);
        c6438E5q.A08 = null;
        c6438E5q.A0F = null;
    }

    @Override // X.InterfaceC6243Dym
    public final void onVideoEnabled(C6173DxG c6173DxG) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0F = c6173DxG;
        c6438E5q.A0p.onVideoEnabled(c6173DxG);
    }

    @Override // X.InterfaceC6243Dym
    public final void onVideoFrameProcessingOffset(long j, int i) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0p.AXA();
    }

    @Override // X.InterfaceC6243Dym
    public final void onVideoInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A08 = c6154Dwx;
        c6438E5q.A0p.onVideoInputFormatChanged(c6154Dwx, c2461Bbo);
    }

    @Override // X.InterfaceC6243Dym
    public final void onVideoSizeChanged(C6232Dya c6232Dya) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        c6438E5q.A0C = c6232Dya;
        C6443E5w<E76> c6443E5w = c6438E5q.A0j;
        c6443E5w.A03(new C7585F4y(c6232Dya, 16), 25);
        c6443E5w.A01();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C6438E5q.A0K(this.A00, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C6438E5q.A0K(this.A00, 0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C6438E5q c6438E5q = C6438E5q.$redex_init_class;
    }

    @Override // X.InterfaceC5318DgC
    public final void onCues(List<E0J> list) {
        C6438E5q c6438E5q = this.A00;
        C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
        C6443E5w<E76> c6443E5w = c6438E5q.A0j;
        c6443E5w.A03(new C7585F4y(list, 15), 27);
        c6443E5w.A01();
    }
}
