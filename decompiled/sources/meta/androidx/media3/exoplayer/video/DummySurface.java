package meta.androidx.media3.exoplayer.video;

import X.BV5;
import X.CN8;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* loaded from: classes5.dex */
public final class DummySurface extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final CN8 A01;

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static meta.androidx.media3.exoplayer.video.DummySurface A00(boolean r5) throws java.lang.Throwable {
        /*
            r4 = 0
            if (r5 == 0) goto La
            boolean r1 = A01()
            r0 = 0
            if (r1 == 0) goto Lb
        La:
            r0 = 1
        Lb:
            X.C1G.A08(r0)
            X.CN8 r3 = new X.CN8
            r3.<init>()
            if (r5 == 0) goto L17
            int r4 = meta.androidx.media3.exoplayer.video.DummySurface.A02
        L17:
            r3.start()
            android.os.Looper r0 = r3.getLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0, r3)
            r3.A00 = r1
            X.BsH r0 = new X.BsH
            r0.<init>(r1)
            r3.A01 = r0
            monitor-enter(r3)
            android.os.Handler r2 = r3.A00     // Catch: java.lang.Throwable -> L5e
            r0 = 1
            r1 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r4, r1)     // Catch: java.lang.Throwable -> L5e
            r0.sendToTarget()     // Catch: java.lang.Throwable -> L5e
        L38:
            meta.androidx.media3.exoplayer.video.DummySurface r0 = r3.A04     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L4a
            java.lang.RuntimeException r0 = r3.A03     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L4a
            java.lang.Error r0 = r3.A02     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L4a
            r3.wait()     // Catch: java.lang.InterruptedException -> L48 java.lang.Throwable -> L5e
            goto L38
        L48:
            r1 = 1
            goto L38
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L50
            X.BV4.A1A()
        L50:
            java.lang.RuntimeException r0 = r3.A03
            if (r0 != 0) goto L60
            java.lang.Error r0 = r3.A02
            if (r0 != 0) goto L60
            meta.androidx.media3.exoplayer.video.DummySurface r0 = r3.A04
            r0.getClass()
            return r0
        L5e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
        L60:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: meta.androidx.media3.exoplayer.video.DummySurface.A00(boolean):meta.androidx.media3.exoplayer.video.DummySurface");
    }

    public static synchronized boolean A01() {
        if (!A03) {
            int iA01 = 0;
            String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            if (strEglQueryString != null && strEglQueryString.contains("EGL_EXT_protected_content")) {
                iA01 = BV5.A01(strEglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 0);
            }
            A02 = iA01;
            A03 = true;
        }
        return A02 != 0;
    }

    public DummySurface(SurfaceTexture surfaceTexture, CN8 cn8) {
        super(surfaceTexture);
        this.A01 = cn8;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        CN8 cn8 = this.A01;
        synchronized (cn8) {
            if (!this.A00) {
                cn8.A00.getClass();
                cn8.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
