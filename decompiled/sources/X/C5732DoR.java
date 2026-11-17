package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.common.video.HatchVideoPlayerGrootListener;
import com.facebook.debug.tracer.Tracer;

/* renamed from: X.DoR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5732DoR implements InterfaceC5843DqZ, Handler.Callback {
    public final HatchVideoPlayerGrootListener A00;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        throw r0;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r4) {
        /*
            r3 = this;
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            java.lang.String r0 = "GrootBaseTextureViewGrootListenerImpl.handleMessage"
            com.facebook.debug.tracer.Tracer.A01(r0)
            int r2 = r4.what     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            if (r2 == r1) goto L21
            r0 = 2
            if (r2 != r0) goto L29
            java.lang.String r0 = "GrootBaseTextureViewGrootListenerImpl.onInitialTextureUpdateImpl"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> L2d
            com.facebook.aura.common.video.HatchVideoPlayerGrootListener r0 = r3.A00     // Catch: java.lang.Throwable -> L1c
            r0.onInitialTextureUpdate()     // Catch: java.lang.Throwable -> L1c
            goto L26
        L1c:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L2d
            throw r0     // Catch: java.lang.Throwable -> L2d
        L21:
            java.lang.String r0 = "GrootBaseTextureViewGrootListenerImpl.onSurfaceTextureUpdatedImpl"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> L2d
        L26:
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L2d
        L29:
            com.facebook.debug.tracer.Tracer.A00()
            return r1
        L2d:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5732DoR.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        throw r0;
     */
    @Override // X.InterfaceC5843DqZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATd(android.graphics.SurfaceTexture r2, android.view.Surface r3) {
        /*
            r1 = this;
            java.lang.String r0 = "GrootBaseTextureViewGrootListenerImpl.onInitialTextureUpdate"
            com.facebook.debug.tracer.Tracer.A01(r0)
            java.lang.String r0 = "GrootBaseTextureViewGrootListenerImpl.onInitialTextureUpdateImpl"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> L1b
            com.facebook.aura.common.video.HatchVideoPlayerGrootListener r0 = r1.A00     // Catch: java.lang.Throwable -> L16
            r0.onInitialTextureUpdate()     // Catch: java.lang.Throwable -> L16
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L1b
            com.facebook.debug.tracer.Tracer.A00()
            return
        L16:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L1b
            throw r0     // Catch: java.lang.Throwable -> L1b
        L1b:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5732DoR.ATd(android.graphics.SurfaceTexture, android.view.Surface):void");
    }

    @Override // X.InterfaceC5843DqZ
    public final void AWT(SurfaceTexture surfaceTexture, Surface surface, int i, int i2) {
        Tracer.A01("GrootBaseTextureViewGrootListenerImpl.onSurfaceTextureAvailable");
        String hexString = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        if (surface != null) {
            try {
                hexString = Integer.toHexString(surface.hashCode());
            } finally {
                Tracer.A00();
            }
        }
        C7384Etj.A0U(hexString);
    }

    @Override // X.InterfaceC5843DqZ
    public final void AWU(SurfaceTexture surfaceTexture, Surface surface) {
        Tracer.A01("GrootBaseTextureViewGrootListenerImpl.onSurfaceTextureDestroyed");
        Tracer.A00();
    }

    @Override // X.InterfaceC5843DqZ
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Tracer.A01("GrootBaseTextureViewGrootListenerImpl.onSurfaceTextureUpdated");
        try {
            Tracer.A01("GrootBaseTextureViewGrootListenerImpl.onSurfaceTextureUpdatedImpl");
            Tracer.A00();
        } finally {
            Tracer.A00();
        }
    }

    public C5732DoR(HatchVideoPlayerGrootListener hatchVideoPlayerGrootListener) {
        this.A00 = hatchVideoPlayerGrootListener;
    }

    @Override // X.InterfaceC5843DqZ
    public final /* synthetic */ void AWQ(Surface surface) {
    }

    @Override // X.InterfaceC5843DqZ
    public final /* synthetic */ void AWV(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC5843DqZ
    public final /* synthetic */ void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
