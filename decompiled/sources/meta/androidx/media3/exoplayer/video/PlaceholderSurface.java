package meta.androidx.media3.exoplayer.video;

import X.CN7;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes5.dex */
public final class PlaceholderSurface extends Surface {
    public static int A03;
    public static boolean A04;
    public boolean A00;
    public final boolean A01;
    public final CN7 A02;

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static meta.androidx.media3.exoplayer.video.PlaceholderSurface A00(boolean r5) {
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
            X.CN7 r3 = new X.CN7
            r3.<init>()
            if (r5 == 0) goto L17
            int r4 = meta.androidx.media3.exoplayer.video.PlaceholderSurface.A03
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
            meta.androidx.media3.exoplayer.video.PlaceholderSurface r0 = r3.A04     // Catch: java.lang.Throwable -> L5e
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
            meta.androidx.media3.exoplayer.video.PlaceholderSurface r0 = r3.A04
            r0.getClass()
            return r0
        L5e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5e
        L60:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: meta.androidx.media3.exoplayer.video.PlaceholderSurface.A00(boolean):meta.androidx.media3.exoplayer.video.PlaceholderSurface");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean A01() {
        /*
            java.lang.Class<meta.androidx.media3.exoplayer.video.PlaceholderSurface> r5 = meta.androidx.media3.exoplayer.video.PlaceholderSurface.class
            monitor-enter(r5)
            boolean r0 = meta.androidx.media3.exoplayer.video.PlaceholderSurface.A04     // Catch: java.lang.Throwable -> L3e
            r4 = 1
            if (r0 != 0) goto L37
            java.lang.String r1 = "EGL_EXT_protected_content"
            r3 = 0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.eglGetDisplay(r3)     // Catch: java.lang.Throwable -> L3e
            r2 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r0 = android.opengl.EGL14.eglQueryString(r0, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L32
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L32
            java.lang.String r1 = "EGL_KHR_surfaceless_context"
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.eglGetDisplay(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = android.opengl.EGL14.eglQueryString(r0, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L30
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3e
            r0 = 1
            if (r1 != 0) goto L33
        L30:
            r0 = 2
            goto L33
        L32:
            r0 = 0
        L33:
            meta.androidx.media3.exoplayer.video.PlaceholderSurface.A03 = r0     // Catch: java.lang.Throwable -> L3e
            meta.androidx.media3.exoplayer.video.PlaceholderSurface.A04 = r4     // Catch: java.lang.Throwable -> L3e
        L37:
            int r0 = meta.androidx.media3.exoplayer.video.PlaceholderSurface.A03     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L3c
            r4 = 0
        L3c:
            monitor-exit(r5)
            return r4
        L3e:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: meta.androidx.media3.exoplayer.video.PlaceholderSurface.A01():boolean");
    }

    public PlaceholderSurface(SurfaceTexture surfaceTexture, CN7 cn7, boolean z) {
        super(surfaceTexture);
        this.A02 = cn7;
        this.A01 = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        CN7 cn7 = this.A02;
        synchronized (cn7) {
            if (!this.A00) {
                cn7.A00.getClass();
                cn7.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
