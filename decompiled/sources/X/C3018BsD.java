package X;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BsD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3018BsD implements InterfaceC2626Bft, SurfaceTexture.OnFrameAvailableListener {
    public int A00;
    public boolean A01;
    public final Handler A02;
    public final HandlerThread A03;
    public final C3021BsG A04;
    public final List<AbstractC2979Bqh> A05;
    public final Map<InterfaceC2969BqO, Surface> A06;
    public final Executor A07;
    public final AtomicBoolean A08;
    public final float[] A09;
    public final float[] A0A;

    public C3018BsD(C2507Bcd c2507Bcd) throws Throwable {
        Map map = Collections.EMPTY_MAP;
        this.A08 = BV4.A12(false);
        this.A0A = new float[16];
        this.A09 = new float[16];
        this.A06 = C3cG.A0j();
        this.A00 = 0;
        this.A01 = false;
        this.A05 = C3cG.A0h();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.A03 = handlerThread;
        Handler handlerA0B = BV5.A0B(handlerThread);
        this.A02 = handlerA0B;
        this.A07 = new ScheduledExecutorServiceC2936BpL(handlerA0B);
        this.A04 = new C3021BsG();
        try {
            try {
                AbstractC2947Bpi.A03(c2507Bcd, this, map, 2).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw e;
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public static void A00(C3018BsD c3018BsD) {
        if (c3018BsD.A01 && c3018BsD.A00 == 0) {
            Map<InterfaceC2969BqO, Surface> map = c3018BsD.A06;
            Iterator itA11 = BV5.A11(map);
            while (itA11.hasNext()) {
                ((InterfaceC2969BqO) itA11.next()).close();
            }
            Iterator<AbstractC2979Bqh> it = c3018BsD.A05.iterator();
            while (it.hasNext()) {
                ((C2978Bqg) it.next()).A02.A04(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            map.clear();
            c3018BsD.A04.A04();
            c3018BsD.A03.quit();
        }
    }

    public static void A01(final C3018BsD c3018BsD, final Runnable runnable, final Runnable runnable2) {
        try {
            c3018BsD.A07.execute(new Runnable() { // from class: X.Bse
                public static final String __redex_internal_original_name = "DefaultSurfaceProcessor$$ExternalSyntheticLambda12";

                @Override // java.lang.Runnable
                public final void run() {
                    C3018BsD c3018BsD2 = this.A00;
                    Runnable runnable3 = runnable2;
                    Runnable runnable4 = runnable;
                    if (c3018BsD2.A01) {
                        runnable3.run();
                    } else {
                        runnable4.run();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            AbstractC2875Bni.A06("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    private void A02(Throwable th) {
        List<AbstractC2979Bqh> list = this.A05;
        Iterator<AbstractC2979Bqh> it = list.iterator();
        while (it.hasNext()) {
            ((C2978Bqg) it.next()).A02.A04(th);
        }
        list.clear();
    }

    @Override // X.BgA
    public final void ATf(final BmM bmM) {
        if (this.A08.get()) {
            bmM.A00();
        } else {
            A01(this, new Runnable() { // from class: X.BsJ
                public static final String __redex_internal_original_name = "DefaultSurfaceProcessor$$ExternalSyntheticLambda10";

                @Override // java.lang.Runnable
                public final void run() throws ExecutionException, InterruptedException {
                    final C3018BsD c3018BsD = this;
                    final BmM bmM2 = bmM;
                    c3018BsD.A00++;
                    C3021BsG c3021BsG = c3018BsD.A04;
                    C3021BsG.A02(c3021BsG);
                    final SurfaceTexture surfaceTexture = new SurfaceTexture(c3021BsG.A00);
                    Size size = bmM2.A04;
                    surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                    final Surface surface = new Surface(surfaceTexture);
                    Executor executor = c3018BsD.A07;
                    bmM2.A02(new BgP() { // from class: X.BsP
                        @Override // X.BgP
                        public final void AWn(BhO bhO) {
                            C3018BsD c3018BsD2 = c3018BsD;
                            BmM bmM3 = bmM2;
                            EnumC2460Bbn enumC2460Bbn = EnumC2460Bbn.DEFAULT;
                            if (bmM3.A05.A00() && ((BfX) bhO).A04) {
                                enumC2460Bbn = EnumC2460Bbn.YUV;
                            }
                            C3021BsG c3021BsG2 = c3018BsD2.A04;
                            C3021BsG.A02(c3021BsG2);
                            if (c3021BsG2.A06 != enumC2460Bbn) {
                                c3021BsG2.A06 = enumC2460Bbn;
                                c3021BsG2.A05(c3021BsG2.A00);
                            }
                        }
                    }, executor);
                    bmM2.A01(surface, new BeM() { // from class: X.Bp8
                        @Override // X.BeM
                        public final void accept(Object obj) {
                            C3018BsD c3018BsD2 = c3018BsD;
                            BmM bmM3 = bmM2;
                            SurfaceTexture surfaceTexture2 = surfaceTexture;
                            Surface surface2 = surface;
                            synchronized (bmM3.A0B) {
                                bmM3.A01 = null;
                                bmM3.A02 = null;
                            }
                            surfaceTexture2.setOnFrameAvailableListener(null);
                            surfaceTexture2.release();
                            surface2.release();
                            c3018BsD2.A00--;
                            C3018BsD.A00(c3018BsD2);
                        }
                    }, executor);
                    surfaceTexture.setOnFrameAvailableListener(c3018BsD, c3018BsD.A02);
                }
            }, new RunnableC3043Bsi(bmM));
        }
    }

    @Override // X.BgA
    public final void AUS(final InterfaceC2969BqO interfaceC2969BqO) {
        if (this.A08.get()) {
            interfaceC2969BqO.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.BsU
            public static final String __redex_internal_original_name = "DefaultSurfaceProcessor$$ExternalSyntheticLambda7";

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                C3018BsD c3018BsD = this;
                InterfaceC2969BqO interfaceC2969BqO2 = interfaceC2969BqO;
                Executor executor = c3018BsD.A07;
                C7578F4r c7578F4r = new C7578F4r(1, interfaceC2969BqO2, c3018BsD);
                BiU biU = (BiU) interfaceC2969BqO2;
                synchronized (biU.A0A) {
                    biU.A02 = executor;
                    biU.A01 = c7578F4r;
                    z = biU.A03;
                }
                if (z) {
                    biU.A00();
                }
                Surface surface = biU.A08;
                C3021BsG c3021BsG = c3018BsD.A04;
                AbstractC3025BsK.A06(c3021BsG.A0C, true);
                AbstractC3025BsK.A05(c3021BsG.A08);
                Map<Surface, AbstractC3050Bsv> map = c3021BsG.A0B;
                if (!map.containsKey(surface)) {
                    map.put(surface, AbstractC3025BsK.A03);
                }
                c3018BsD.A06.put(interfaceC2969BqO2, surface);
            }
        };
        interfaceC2969BqO.getClass();
        A01(this, runnable, new RunnableC3044Bsj(interfaceC2969BqO));
    }

    @Override // X.InterfaceC2626Bft
    public final ListenableFuture<Void> Afr(final int i, final int i2) {
        return AbstractC2942BpW.A01(AbstractC2947Bpi.A00(new InterfaceC2940BpU() { // from class: X.BrC
            @Override // X.InterfaceC2940BpU
            public final Object A4r(final C3010Brs c3010Brs) {
                final C3018BsD c3018BsD = this.A02;
                final C2978Bqg c2978Bqg = new C2978Bqg(c3010Brs, i, i2);
                C3018BsD.A01(c3018BsD, new Runnable() { // from class: X.BrD
                    public static final String __redex_internal_original_name = "DefaultSurfaceProcessor$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C3018BsD c3018BsD2 = c3018BsD;
                        c3018BsD2.A05.add(c2978Bqg);
                    }
                }, new Runnable() { // from class: X.BrB
                    public static final String __redex_internal_original_name = "DefaultSurfaceProcessor$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        c3010Brs.A04(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                    }
                });
                return "DefaultSurfaceProcessor#snapshot";
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (this.A08.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.A0A;
        surfaceTexture.getTransformMatrix(fArr);
        Iterator itA0n = AnonymousClass002.A0n(this.A06);
        HwV hwV = null;
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Surface surface = (Surface) entryA0l.getValue();
            InterfaceC2969BqO interfaceC2969BqO = (InterfaceC2969BqO) entryA0l.getKey();
            float[] fArr2 = this.A09;
            BiU biU = (BiU) interfaceC2969BqO;
            Matrix.multiplyMM(fArr2, 0, fArr, 0, biU.A0B, 0);
            int i = biU.A06;
            if (i == 34) {
                try {
                    C3021BsG c3021BsG = this.A04;
                    long timestamp = surfaceTexture.getTimestamp();
                    AbstractC3025BsK.A06(c3021BsG.A0C, true);
                    AbstractC3025BsK.A05(c3021BsG.A08);
                    Map<Surface, AbstractC3050Bsv> map = c3021BsG.A0B;
                    BeS.A07(map.containsKey(surface), "The surface is not registered.");
                    AbstractC3050Bsv c3029BsS = map.get(surface);
                    c3029BsS.getClass();
                    if (c3029BsS == AbstractC3025BsK.A03) {
                        try {
                            EGLDisplay eGLDisplay = c3021BsG.A03;
                            EGLConfig eGLConfig = c3021BsG.A01;
                            eGLConfig.getClass();
                            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, c3021BsG.A09, 0);
                            AbstractC3025BsK.A03("eglCreateWindowSurface");
                            if (eGLSurfaceEglCreateWindowSurface == null) {
                                throw C3cG.A0Q("surface was null");
                            }
                            EGLDisplay eGLDisplay2 = c3021BsG.A03;
                            int[] iArr = new int[1];
                            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceEglCreateWindowSurface, 12375, iArr, 0);
                            int i2 = iArr[0];
                            int[] iArr2 = new int[1];
                            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceEglCreateWindowSurface, 12374, iArr2, 0);
                            Size sizeA0P = BV6.A0P(i2, iArr2[0]);
                            c3029BsS = new C3029BsS(eGLSurfaceEglCreateWindowSurface, sizeA0P.getWidth(), sizeA0P.getHeight());
                            if (c3029BsS != null) {
                                map.put(surface, c3029BsS);
                            }
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            AbstractC2875Bni.A06("OpenGlRenderer", BV5.A0n("Failed to create EGL surface: ", e), e);
                        }
                    }
                    if (surface != c3021BsG.A05) {
                        C3029BsS c3029BsS2 = (C3029BsS) c3029BsS;
                        c3021BsG.A06(c3029BsS2.A02);
                        c3021BsG.A05 = surface;
                        int i3 = c3029BsS2.A01;
                        int i4 = c3029BsS2.A00;
                        GLES20.glViewport(0, 0, i3, i4);
                        GLES20.glScissor(0, 0, i3, i4);
                    }
                    AbstractC3027BsM abstractC3027BsM = c3021BsG.A07;
                    abstractC3027BsM.getClass();
                    if (abstractC3027BsM instanceof C3026BsL) {
                        GLES20.glUniformMatrix4fv(((C3026BsL) abstractC3027BsM).A02, 1, false, fArr2, 0);
                        AbstractC3025BsK.A04("glUniformMatrix4fv");
                    }
                    GLES20.glDrawArrays(5, 0, 4);
                    AbstractC3025BsK.A04("glDrawArrays");
                    EGLDisplay eGLDisplay3 = c3021BsG.A03;
                    EGLSurface eGLSurface = ((C3029BsS) c3029BsS).A02;
                    EGLExt.eglPresentationTimeANDROID(eGLDisplay3, eGLSurface, timestamp);
                    if (!EGL14.eglSwapBuffers(c3021BsG.A03, eGLSurface)) {
                        AbstractC2875Bni.A03("OpenGlRenderer", FGI.A0M("Failed to swap buffers with EGL error: 0x", Integer.toHexString(EGL14.eglGetError())));
                        c3021BsG.A07(surface, false);
                    }
                } catch (RuntimeException e2) {
                    AbstractC2875Bni.A05("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e2);
                }
            } else {
                BeS.A07(AnonymousClass002.A1Q(i, 256), FGI.A0H("Unsupported format: ", i));
                BeS.A07(hwV == null, "Only one JPEG output is supported.");
                hwV = new HwV(surface, biU.A07, fArr2.clone());
            }
        }
        try {
            List<AbstractC2979Bqh> list = this.A05;
            if (list.isEmpty()) {
                return;
            }
            if (hwV == null) {
                A02(new Exception("Failed to snapshot: no JPEG Surface."));
                return;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                try {
                    Iterator<AbstractC2979Bqh> it = list.iterator();
                    Bitmap bitmapCreateBitmap = null;
                    byte[] byteArray = null;
                    int i5 = -1;
                    int i6 = -1;
                    while (it.hasNext()) {
                        C2978Bqg c2978Bqg = (C2978Bqg) it.next();
                        int i7 = c2978Bqg.A01;
                        if (i5 != i7 || bitmapCreateBitmap == null) {
                            i5 = i7;
                            if (bitmapCreateBitmap != null) {
                                bitmapCreateBitmap.recycle();
                            }
                            Size size = (Size) hwV.second;
                            float[] fArr3 = (float[]) ((float[]) hwV.third).clone();
                            BiV.A01(fArr3, i7);
                            BiV.A00(fArr3);
                            Size sizeA01 = BfO.A01(size, i7);
                            C3021BsG c3021BsG2 = this.A04;
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(BV7.A0B(sizeA01) * 4);
                            BeS.A06(AnonymousClass002.A1Q(byteBufferAllocateDirect.capacity(), BV7.A0B(sizeA01) * 4), "ByteBuffer capacity is not equal to width * height * 4.");
                            BeS.A06(byteBufferAllocateDirect.isDirect(), "ByteBuffer is not direct.");
                            float[] fArr4 = AbstractC3025BsK.A09;
                            int[] iArr3 = new int[1];
                            GLES20.glGenTextures(1, iArr3, 0);
                            AbstractC3025BsK.A04("glGenTextures");
                            int i8 = iArr3[0];
                            GLES20.glActiveTexture(33985);
                            AbstractC3025BsK.A04("glActiveTexture");
                            GLES20.glBindTexture(3553, i8);
                            AbstractC3025BsK.A04("glBindTexture");
                            GLES20.glTexImage2D(3553, 0, 6407, sizeA01.getWidth(), sizeA01.getHeight(), 0, 6407, 5121, null);
                            AbstractC3025BsK.A04("glTexImage2D");
                            GLES20.glTexParameteri(3553, 10240, 9729);
                            GLES20.glTexParameteri(3553, 10241, 9729);
                            int[] iArr4 = new int[1];
                            GLES20.glGenFramebuffers(1, iArr4, 0);
                            AbstractC3025BsK.A04("glGenFramebuffers");
                            int i9 = iArr4[0];
                            GLES20.glBindFramebuffer(36160, i9);
                            AbstractC3025BsK.A04("glBindFramebuffer");
                            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i8, 0);
                            AbstractC3025BsK.A04("glFramebufferTexture2D");
                            GLES20.glActiveTexture(33984);
                            AbstractC3025BsK.A04("glActiveTexture");
                            GLES20.glBindTexture(36197, c3021BsG2.A00);
                            AbstractC3025BsK.A04("glBindTexture");
                            c3021BsG2.A05 = null;
                            GLES20.glViewport(0, 0, sizeA01.getWidth(), sizeA01.getHeight());
                            GLES20.glScissor(0, 0, sizeA01.getWidth(), sizeA01.getHeight());
                            AbstractC3027BsM abstractC3027BsM2 = c3021BsG2.A07;
                            abstractC3027BsM2.getClass();
                            if (abstractC3027BsM2 instanceof C3026BsL) {
                                GLES20.glUniformMatrix4fv(((C3026BsL) abstractC3027BsM2).A02, 1, false, fArr3, 0);
                                AbstractC3025BsK.A04("glUniformMatrix4fv");
                            }
                            GLES20.glDrawArrays(5, 0, 4);
                            AbstractC3025BsK.A04("glDrawArrays");
                            GLES20.glReadPixels(0, 0, sizeA01.getWidth(), sizeA01.getHeight(), 6408, 5121, byteBufferAllocateDirect);
                            AbstractC3025BsK.A04("glReadPixels");
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glDeleteTextures(1, new int[]{i8}, 0);
                            AbstractC3025BsK.A04("glDeleteTextures");
                            GLES20.glDeleteFramebuffers(1, new int[]{i9}, 0);
                            AbstractC3025BsK.A04("glDeleteFramebuffers");
                            int i10 = c3021BsG2.A00;
                            GLES20.glActiveTexture(33984);
                            AbstractC3025BsK.A04("glActiveTexture");
                            GLES20.glBindTexture(36197, i10);
                            AbstractC3025BsK.A04("glBindTexture");
                            bitmapCreateBitmap = Bitmap.createBitmap(sizeA01.getWidth(), sizeA01.getHeight(), Bitmap.Config.ARGB_8888);
                            byteBufferAllocateDirect.rewind();
                            int width = sizeA01.getWidth() * 4;
                            int i11 = ImageProcessingUtil.A00;
                            ImageProcessingUtil.nativeCopyBetweenByteBufferAndBitmap(bitmapCreateBitmap, byteBufferAllocateDirect, width, bitmapCreateBitmap.getRowBytes(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), true);
                            i6 = -1;
                        }
                        int i12 = c2978Bqg.A00;
                        if (i6 != i12) {
                            byteArrayOutputStreamA0F.reset();
                            i6 = i12;
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStreamA0F);
                            byteArray = byteArrayOutputStreamA0F.toByteArray();
                        }
                        Surface surface2 = (Surface) hwV.first;
                        byteArray.getClass();
                        int i13 = ImageProcessingUtil.A00;
                        surface2.getClass();
                        if (ImageProcessingUtil.nativeWriteJpegToSurface(byteArray, surface2) != 0) {
                            AbstractC2875Bni.A02("ImageProcessingUtil", "Failed to enqueue JPEG image.");
                        }
                        c2978Bqg.A02.A03(null);
                        it.remove();
                    }
                    byteArrayOutputStreamA0F.close();
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStreamA0F.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                A02(e3);
            }
        } catch (RuntimeException e4) {
            A02(e4);
        }
    }

    @Override // X.InterfaceC2626Bft
    public final void release() {
        if (this.A08.getAndSet(true)) {
            return;
        }
        A01(this, new Runnable() { // from class: X.Bsf
            public static final String __redex_internal_original_name = "DefaultSurfaceProcessor$$ExternalSyntheticLambda13";

            @Override // java.lang.Runnable
            public final void run() {
                C3018BsD c3018BsD = this.A00;
                c3018BsD.A01 = true;
                C3018BsD.A00(c3018BsD);
            }
        }, new RunnableC3046Bsp());
    }
}
