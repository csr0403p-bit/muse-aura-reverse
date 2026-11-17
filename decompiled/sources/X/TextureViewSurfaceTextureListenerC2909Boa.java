package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.Boa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class TextureViewSurfaceTextureListenerC2909Boa implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C2910Bob A00;

    public TextureViewSurfaceTextureListenerC2909Boa(C2910Bob c2910Bob) {
        this.A00 = c2910Bob;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC2875Bni.A01("TextureViewImpl", FGI.A0T("SurfaceTexture available. Size: ", "x", i, i2));
        C2910Bob c2910Bob = this.A00;
        c2910Bob.A01 = surfaceTexture;
        if (c2910Bob.A06 == null) {
            c2910Bob.A01();
            return;
        }
        c2910Bob.A03.getClass();
        AbstractC2875Bni.A01("TextureViewImpl", C8j3.A14(c2910Bob.A03, C60O.A0x("Surface invalidated ")));
        c2910Bob.A03.A07.A02();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2910Bob c2910Bob = this.A00;
        c2910Bob.A01 = null;
        ListenableFuture<Bn0> listenableFuture = c2910Bob.A06;
        if (listenableFuture == null) {
            AbstractC2875Bni.A01("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        AbstractC2942BpW.A03(new F58(14, surfaceTexture, this), listenableFuture, c2910Bob.A02.getContext().getMainExecutor());
        c2910Bob.A00 = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC2875Bni.A01("TextureViewImpl", FGI.A0T("SurfaceTexture size changed: ", "x", i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C3010Brs<Void> andSet = this.A00.A08.getAndSet(null);
        if (andSet != null) {
            andSet.A03(null);
        }
    }
}
