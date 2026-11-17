package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BsG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3021BsG {
    public EGLConfig A01;
    public Surface A05;
    public Thread A08;
    public final AtomicBoolean A0C = C60O.A1E();
    public final Map<Surface, AbstractC3050Bsv> A0B = BV4.A0u();
    public EGLDisplay A03 = EGL14.EGL_NO_DISPLAY;
    public EGLContext A02 = EGL14.EGL_NO_CONTEXT;
    public int[] A09 = AbstractC3025BsK.A0A;
    public EGLSurface A04 = EGL14.EGL_NO_SURFACE;
    public Map<EnumC2460Bbn, AbstractC3027BsM> A0A = Collections.EMPTY_MAP;
    public AbstractC3027BsM A07 = null;
    public EnumC2460Bbn A06 = EnumC2460Bbn.UNKNOWN;
    public int A00 = -1;

    private void A00() {
        EGLDisplay eGLDisplay = this.A03;
        EGLConfig eGLConfig = this.A01;
        eGLConfig.getClass();
        float[] fArr = AbstractC3025BsK.A09;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        AbstractC3025BsK.A03("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw C3cG.A0Q("surface was null");
        }
        this.A04 = eGLSurfaceEglCreatePbufferSurface;
    }

    private void A01() {
        Iterator itA10 = BV5.A10(this.A0A);
        while (itA10.hasNext()) {
            GLES20.glDeleteProgram(((AbstractC3027BsM) itA10.next()).A01);
        }
        this.A0A = Collections.EMPTY_MAP;
        this.A07 = null;
        if (!C6xC.A00(this.A03, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.A03;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            Map<Surface, AbstractC3050Bsv> map = this.A0B;
            Iterator itA102 = BV5.A10(map);
            while (itA102.hasNext()) {
                EGLSurface eGLSurface2 = ((C3029BsS) ((AbstractC3050Bsv) itA102.next())).A02;
                if (!C6xC.A00(eGLSurface2, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.A03, eGLSurface2)) {
                    try {
                        AbstractC3025BsK.A03("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        AbstractC2875Bni.A05("GLUtils", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!C6xC.A00(this.A04, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A03, this.A04);
                this.A04 = EGL14.EGL_NO_SURFACE;
            }
            if (!C6xC.A00(this.A02, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.A03, this.A02);
                this.A02 = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.A03);
            this.A03 = EGL14.EGL_NO_DISPLAY;
        }
        this.A01 = null;
        this.A00 = -1;
        this.A06 = EnumC2460Bbn.UNKNOWN;
        this.A05 = null;
        this.A08 = null;
    }

    public static void A02(C3021BsG c3021BsG) {
        AbstractC3025BsK.A06(c3021BsG.A0C, true);
        AbstractC3025BsK.A05(c3021BsG.A08);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0261 A[Catch: IllegalArgumentException | IllegalStateException -> 0x02d2, IllegalArgumentException | IllegalStateException -> 0x02d2, PHI: r2
  0x0261: PHI (r2v12 X.Bss) = (r2v11 X.Bss), (r2v26 X.Bss) binds: [B:55:0x0224, B:75:0x026d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {IllegalArgumentException | IllegalStateException -> 0x02d2, blocks: (B:3:0x000f, B:5:0x0015, B:24:0x00f1, B:24:0x00f1, B:26:0x010a, B:26:0x010a, B:27:0x0111, B:27:0x0111, B:29:0x0118, B:29:0x0118, B:31:0x0120, B:31:0x0120, B:33:0x0125, B:33:0x0125, B:32:0x0122, B:32:0x0122, B:35:0x012f, B:35:0x012f, B:90:0x02d1, B:90:0x02d1, B:89:0x02ce, B:89:0x02ce, B:36:0x0137, B:36:0x0137, B:38:0x0145, B:38:0x0145, B:40:0x0151, B:40:0x0151, B:43:0x0171, B:43:0x0171, B:45:0x01af, B:45:0x01af, B:48:0x01b4, B:48:0x01b4, B:50:0x01fd, B:50:0x01fd, B:51:0x020a, B:51:0x020a, B:54:0x021a, B:54:0x021a, B:56:0x0226, B:56:0x0226, B:58:0x022a, B:58:0x022a, B:60:0x022e, B:60:0x022e, B:62:0x0234, B:62:0x0234, B:64:0x023f, B:64:0x023f, B:77:0x0276, B:77:0x0276, B:74:0x0267, B:74:0x0267, B:76:0x026f, B:76:0x026f, B:66:0x0247, B:66:0x0247, B:71:0x0259, B:71:0x0259, B:72:0x025b, B:72:0x025b, B:69:0x0253, B:69:0x0253, B:70:0x0256, B:70:0x0256, B:73:0x0261, B:73:0x0261, B:78:0x028d, B:78:0x028d, B:85:0x02b4, B:85:0x02b4, B:86:0x02bb, B:86:0x02bb, B:87:0x02c6, B:87:0x02c6), top: B:96:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.AbstractC3049Bsu A03(X.C2507Bcd r37, java.util.Map<X.EnumC2460Bbn, X.InterfaceC3048Bss> r38) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3021BsG.A03(X.Bcd, java.util.Map):X.Bsu");
    }

    public void A04() {
        if (this.A0C.getAndSet(false)) {
            AbstractC3025BsK.A05(this.A08);
            A01();
        }
    }

    public final void A05(int i) {
        AbstractC3027BsM abstractC3027BsM = this.A0A.get(this.A06);
        if (abstractC3027BsM == null) {
            throw C3cG.A0Q(C8j3.A14(this.A06, C60O.A0x("Unable to configure program for input format: ")));
        }
        if (this.A07 != abstractC3027BsM) {
            this.A07 = abstractC3027BsM;
            abstractC3027BsM.A01();
            StringBuilder sbA0x = C60O.A0x("Using program for input format ");
            sbA0x.append(this.A06);
            sbA0x.append(": ");
            Log.d("OpenGlRenderer", C8j3.A14(this.A07, sbA0x));
        }
        GLES20.glActiveTexture(33984);
        AbstractC3025BsK.A04("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        AbstractC3025BsK.A04("glBindTexture");
    }

    public final void A06(EGLSurface eGLSurface) {
        this.A03.getClass();
        this.A02.getClass();
        if (!EGL14.eglMakeCurrent(this.A03, eGLSurface, eGLSurface, this.A02)) {
            throw C3cG.A0Q("eglMakeCurrent failed");
        }
    }

    public final void A07(Surface surface, boolean z) {
        if (this.A05 == surface) {
            this.A05 = null;
            A06(this.A04);
        }
        Map<Surface, AbstractC3050Bsv> map = this.A0B;
        AbstractC3050Bsv abstractC3050BsvRemove = z ? map.remove(surface) : map.put(surface, AbstractC3025BsK.A03);
        if (abstractC3050BsvRemove == null || abstractC3050BsvRemove == AbstractC3025BsK.A03) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.A03, ((C3029BsS) abstractC3050BsvRemove).A02);
        } catch (RuntimeException e) {
            AbstractC2875Bni.A06("OpenGlRenderer", BV5.A0n("Failed to destroy EGL surface: ", e), e);
        }
    }
}
