package org.webrtc;

import X.AnonymousClass001;
import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.FGI;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.view.Surface;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglThread;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;

/* loaded from: classes5.dex */
public class EglRenderer implements VideoSink {
    public static final UUID EMPTY_UUID = new UUID(0, 0);
    public static final long LOG_INTERVAL_SEC = 4;
    public static final String TAG = "EglRenderer";
    public final GlTextureFrameBuffer bitmapTextureFramebuffer;
    public final Matrix drawMatrix;
    public RendererCommon.GlDrawer drawer;
    public EglBase eglBase;
    public final Runnable eglExceptionCallback;
    public final EglSurfaceCreation eglSurfaceCreationRunnable;
    public EglThread eglThread;
    public final boolean enableSurfaceCreationErrorCallback;
    public volatile ErrorCallback errorCallback;
    public final Object fpsReductionLock;
    public final VideoFrameDrawer frameDrawer;
    public final ListenerManager<FrameDrawnListenerWithContext> frameDrawnListenersWithContext;
    public final ArrayList<FrameListenerAndParams> frameListeners;
    public final Object frameLock;
    public int framesDropped;
    public int framesReceived;
    public int framesRendered;
    public UUID id;
    public float layoutAspectRatio;
    public final Object layoutLock;
    public final Runnable logStatisticsRunnable;
    public long minRenderPeriodNs;
    public boolean mirrorHorizontally;
    public boolean mirrorVertically;
    public final String name;
    public long nextFrameTimeNs;
    public VideoFrame pendingFrame;
    public final ArrayList<RenderListener> renderListeners;
    public long renderSwapBufferTimeNs;
    public long renderTimeNs;
    public final Object statisticsLock;
    public long statisticsStartTimeNs;
    public final Object threadLock;
    public boolean usePresentationTimeStamp;

    public class EglSurfaceCreation implements Runnable {
        public Object surface;

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        public EglSurfaceCreation() {
        }

        private void handleEglSurfaceCreationFailure(Object obj, Exception exc) throws Exception {
            EglRenderer.this.logE("Failed to create EGL surface", exc);
            EglRenderer eglRenderer = EglRenderer.this;
            if (!eglRenderer.enableSurfaceCreationErrorCallback) {
                if (!(exc instanceof RuntimeException)) {
                    throw BV4.A0d("EGL surface creation failed", exc);
                }
                throw exc;
            }
            ErrorCallback errorCallback = eglRenderer.errorCallback;
            if (errorCallback != null) {
                errorCallback.onEglSurfaceCreationFailed(obj, exc);
            }
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            if (this.surface != null) {
                EglRenderer eglRenderer = EglRenderer.this;
                UUID uuid = EglRenderer.EMPTY_UUID;
                EglBase eglBase = eglRenderer.eglBase;
                if (eglBase != null && !eglBase.hasSurface()) {
                    try {
                        Object obj = this.surface;
                        if (obj instanceof Surface) {
                            EglRenderer.this.eglBase.createSurface((Surface) obj);
                        } else {
                            if (!(obj instanceof SurfaceTexture)) {
                                throw C3cG.A0Q(AnonymousClass007.A0a("Invalid surface: ", obj));
                            }
                            EglRenderer.this.eglBase.createSurface((SurfaceTexture) obj);
                        }
                        EglRenderer.this.eglBase.makeCurrent();
                        GLES20.glPixelStorei(3317, 1);
                    } catch (Exception e) {
                        handleEglSurfaceCreationFailure(this.surface, e);
                    }
                }
            }
        }
    }

    public interface FrameDrawnListenerWithContext {
        void onFrameDrawn(VideoFrame videoFrame);
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public class ListenerManager<T> {
        public final ArrayList<T> listenerList;

        public ListenerManager() {
            this.listenerList = C3cG.A0h();
        }

        public void addListener(final T t) {
            EglRenderer.this.postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$ListenerManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3946lambda$addListener$0$orgwebrtcEglRenderer$ListenerManager(t);
                }
            });
        }

        public void clear() {
            this.listenerList.clear();
        }

        /* renamed from: lambda$addListener$0$org-webrtc-EglRenderer$ListenerManager, reason: not valid java name */
        public /* synthetic */ void m3946lambda$addListener$0$orgwebrtcEglRenderer$ListenerManager(Object obj) {
            this.listenerList.add(obj);
        }

        /* renamed from: lambda$removeListener$0$org-webrtc-EglRenderer$ListenerManager, reason: not valid java name */
        public /* synthetic */ void m3947lambda$removeListener$0$orgwebrtcEglRenderer$ListenerManager(CountDownLatch countDownLatch, Object obj) {
            countDownLatch.countDown();
            Iterator<T> it = this.listenerList.iterator();
            while (it.hasNext()) {
                if (it.next() == obj) {
                    it.remove();
                }
            }
        }

        public void removeListener(final T t) {
            final CountDownLatch countDownLatchA16 = BV5.A16();
            EglRenderer eglRenderer = EglRenderer.this;
            UUID uuid = EglRenderer.EMPTY_UUID;
            synchronized (eglRenderer.threadLock) {
                EglThread eglThread = EglRenderer.this.eglThread;
                if (eglThread == null) {
                    return;
                }
                if (Thread.currentThread() == BV7.A13(eglThread.handler)) {
                    throw BV4.A0c("removeListener must not be called on the render thread.");
                }
                EglRenderer.this.postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$ListenerManager$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3947lambda$removeListener$0$orgwebrtcEglRenderer$ListenerManager(countDownLatchA16, t);
                    }
                });
                ThreadUtils.awaitUninterruptibly(countDownLatchA16);
            }
        }
    }

    public interface RenderListener {
        void onRender(long j);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z, RenderSynchronizer renderSynchronizer) {
        init(EglThread.create(null, context, iArr, renderSynchronizer), glDrawer, z);
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer(), false);
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(BV4.A04(j / i));
        return AnonymousClass001.A0v(" us", sbA0w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void m3939lambda$clearImage$0$orgwebrtcEglRenderer(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        this.eglBase.makeCurrent();
        GLES20.glClearColor(f, f2, f3, f4);
        GLES20.glClear(16384);
        this.eglBase.swapBuffers();
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    private void logD(String str) {
        Logging.d(TAG, FGI.A0M(this.name, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logE(String str, Throwable th) {
        Logging.e(TAG, FGI.A0M(this.name, str), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long jNanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j = jNanoTime - this.statisticsStartTimeNs;
            if (j > 0 && (this.minRenderPeriodNs != LinkEncryptedPairingKt.LINK_COUNTER_MAX || this.framesReceived != 0)) {
                int i = this.framesRendered;
                StringBuilder sbA0x = C60O.A0x("Duration: ");
                sbA0x.append(BV4.A05(j));
                sbA0x.append(" ms. Frames received: ");
                sbA0x.append(this.framesReceived);
                sbA0x.append(". Dropped: ");
                sbA0x.append(this.framesDropped);
                sbA0x.append(". Rendered: ");
                sbA0x.append(i);
                sbA0x.append(". Render fps: ");
                BV6.A1O(sbA0x, decimalFormat, (i * 1000000000) / j);
                sbA0x.append(". Average render time: ");
                long j2 = this.renderTimeNs;
                int i2 = this.framesRendered;
                sbA0x.append(averageTimeAsString(j2, i2));
                sbA0x.append(". Average swapBuffer time: ");
                sbA0x.append(averageTimeAsString(this.renderSwapBufferTimeNs, i2));
                logD(AnonymousClass001.A0v(".", sbA0x));
                resetStatistics(jNanoTime);
            }
        }
    }

    private void logW(String str) {
        Logging.w(TAG, FGI.A0M(this.name, str));
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.frameBufferId);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.textureId, 0);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, byteBufferAllocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                    next.listener.onFrame(bitmapCreateBitmap);
                }
            }
        }
    }

    private void notifyFrameDrawnListeners(VideoFrame videoFrame) {
        Iterator<FrameDrawnListenerWithContext> it = this.frameDrawnListenersWithContext.listenerList.iterator();
        while (it.hasNext()) {
            it.next().onFrameDrawn(videoFrame);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postToRenderThread(Runnable runnable) {
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null) {
                eglThread.handler.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread() {
        boolean z;
        float f;
        float f2;
        float f3;
        synchronized (this.frameLock) {
            VideoFrame videoFrame = this.pendingFrame;
            if (videoFrame == null) {
                return;
            }
            this.pendingFrame = null;
            EglBase eglBase = this.eglBase;
            if (eglBase == null || !eglBase.hasSurface()) {
                logD("Dropping frame - No surface");
            } else {
                try {
                    this.eglBase.makeCurrent();
                    synchronized (this.fpsReductionLock) {
                        long j = this.minRenderPeriodNs;
                        z = false;
                        if (j != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                            if (j > 0) {
                                long jNanoTime = System.nanoTime();
                                long j2 = this.nextFrameTimeNs;
                                if (jNanoTime < j2) {
                                    logD("Skipping frame rendering - fps reduction is active.");
                                } else {
                                    long j3 = j2 + j;
                                    this.nextFrameTimeNs = j3;
                                    this.nextFrameTimeNs = Math.max(j3, jNanoTime);
                                }
                            }
                            z = true;
                        }
                    }
                    long jNanoTime2 = System.nanoTime();
                    float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                    synchronized (this.layoutLock) {
                        f = this.layoutAspectRatio;
                        if (f == 0.0f) {
                            f = rotatedWidth;
                        }
                    }
                    if (rotatedWidth > f) {
                        f3 = f / rotatedWidth;
                        f2 = 1.0f;
                    } else {
                        f2 = rotatedWidth / f;
                        f3 = 1.0f;
                    }
                    this.drawMatrix.reset();
                    this.drawMatrix.preTranslate(0.5f, 0.5f);
                    this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
                    this.drawMatrix.preScale(f3, f2);
                    this.drawMatrix.preTranslate(-0.5f, -0.5f);
                    try {
                        if (z) {
                            try {
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                GLES20.glClear(16384);
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                                long jNanoTime3 = System.nanoTime();
                                swapBuffersOnRenderThread(videoFrame, jNanoTime3);
                                synchronized (this.statisticsLock) {
                                    this.framesRendered++;
                                    this.renderTimeNs += jNanoTime3 - jNanoTime2;
                                }
                                notifyCallbacks(videoFrame, z);
                            } catch (GlUtil.GlOutOfMemoryException e) {
                                logE("Error while drawing frame", e);
                                ErrorCallback errorCallback = this.errorCallback;
                                if (errorCallback != null) {
                                    errorCallback.onGlOutOfMemory();
                                }
                                this.drawer.release();
                                this.frameDrawer.release();
                                this.bitmapTextureFramebuffer.release();
                            }
                        } else {
                            notifyCallbacks(videoFrame, z);
                        }
                    } finally {
                        videoFrame.release();
                    }
                } catch (GLException e2) {
                    logE("Error while eglMakeCurrent", e2);
                }
            }
        }
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    private void swapBuffersOnRenderThread(final VideoFrame videoFrame, final long j) {
        synchronized (this.threadLock) {
            if (this.eglThread != null) {
                EglThread.RenderUpdate renderUpdate = new EglThread.RenderUpdate() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda3
                    @Override // org.webrtc.EglThread.RenderUpdate
                    public final void update(boolean z) {
                        this.f$0.m3944lambda$swapBuffersOnRenderThread$0$orgwebrtcEglRenderer(videoFrame, j, z);
                    }
                };
                boolean zEquals = this.id.equals(EMPTY_UUID);
                EglThread eglThread = this.eglThread;
                if (zEquals) {
                    eglThread.scheduleRenderUpdate(renderUpdate);
                } else {
                    eglThread.scheduleRenderUpdate(this.id, renderUpdate);
                }
            }
        }
    }

    public void addFrameDrawnListener(FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.frameDrawnListenersWithContext.addListener(frameDrawnListenerWithContext);
    }

    public void addRenderListener(RenderListener renderListener) {
        this.renderListeners.add(renderListener);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    /* renamed from: lambda$addFrameListener$0$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m3938lambda$addFrameListener$0$orgwebrtcEglRenderer(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    /* renamed from: lambda$release$0$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m3940lambda$release$0$orgwebrtcEglRenderer(CountDownLatch countDownLatch) {
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.renderListeners.clear();
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    /* renamed from: lambda$releaseEglSurface$0$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m3941lambda$releaseEglSurface$0$orgwebrtcEglRenderer(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* renamed from: lambda$swapBuffersOnRenderThread$0$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m3944lambda$swapBuffersOnRenderThread$0$orgwebrtcEglRenderer(VideoFrame videoFrame, long j, boolean z) {
        if (!z) {
            EglBase eglBase = this.eglBase;
            if (eglBase == null || !eglBase.hasSurface()) {
                return;
            } else {
                this.eglBase.makeCurrent();
            }
        }
        boolean z2 = this.usePresentationTimeStamp;
        EglBase eglBase2 = this.eglBase;
        if (z2) {
            eglBase2.swapBuffers(videoFrame.timestampNs);
        } else {
            eglBase2.swapBuffers();
        }
        Iterator<RenderListener> it = this.renderListeners.iterator();
        while (it.hasNext()) {
            it.next().onRender(System.nanoTime());
        }
        notifyFrameDrawnListeners(videoFrame);
        synchronized (this.statisticsLock) {
            this.renderSwapBufferTimeNs += System.nanoTime() - j;
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                logD("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.frameLock) {
                VideoFrame videoFrame2 = this.pendingFrame;
                z = false;
                if (videoFrame2 != null) {
                    z = true;
                    videoFrame2.release();
                }
                this.pendingFrame = videoFrame;
                videoFrame.retain();
                this.eglThread.handler.post(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.renderFrameOnRenderThread();
                    }
                });
            }
            if (z) {
                synchronized (this.statisticsLock) {
                    this.framesDropped++;
                }
            }
        }
    }

    public void printStackTrace() {
        Thread threadA13;
        StackTraceElement[] stackTrace;
        int length;
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null && (threadA13 = BV7.A13(eglThread.handler)) != null && (length = (stackTrace = threadA13.getStackTrace()).length) > 0) {
                logW("EglRenderer stack trace:");
                int i = 0;
                do {
                    logW(stackTrace[i].toString());
                    i++;
                } while (i < length);
            }
        }
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch countDownLatchA16 = BV5.A16();
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                logD("Already released");
                return;
            }
            eglThread.handler.removeCallbacks(this.logStatisticsRunnable);
            this.eglThread.removeExceptionCallback(this.eglExceptionCallback);
            this.eglThread.handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3940lambda$release$0$orgwebrtcEglRenderer(countDownLatchA16);
                }
            });
            this.eglThread.release();
            this.eglThread = null;
            ThreadUtils.awaitUninterruptibly(countDownLatchA16);
            synchronized (this.frameLock) {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame != null) {
                    videoFrame.release();
                    this.pendingFrame = null;
                }
            }
            logD("Releasing done.");
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                runnable.run();
            } else {
                eglThread.handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.eglThread.handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3941lambda$releaseEglSurface$0$orgwebrtcEglRenderer(runnable);
                    }
                });
            }
        }
    }

    public void removeFrameDrawnListener(FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.frameDrawnListenersWithContext.removeListener(frameDrawnListenerWithContext);
    }

    public void setFpsReduction(float f) {
        synchronized (this.fpsReductionLock) {
            long j = this.minRenderPeriodNs;
            long j2 = f <= 0.0f ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : (long) (1.0E9f / f);
            this.minRenderPeriodNs = j2;
            if (j2 != j) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    /* renamed from: lambda$removeFrameListener$0$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m3942lambda$removeFrameListener$0$orgwebrtcEglRenderer(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    /* renamed from: lambda$removeRenderListener$0$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m3943lambda$removeRenderListener$0$orgwebrtcEglRenderer(CountDownLatch countDownLatch, RenderListener renderListener) {
        countDownLatch.countDown();
        Iterator<RenderListener> it = this.renderListeners.iterator();
        while (it.hasNext()) {
            if (it.next() == renderListener) {
                it.remove();
            }
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch countDownLatchA16 = BV5.A16();
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                return;
            }
            if (Thread.currentThread() == BV7.A13(eglThread.handler)) {
                throw BV4.A0c("removeFrameListener must not be called on the render thread.");
            }
            postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3942lambda$removeFrameListener$0$orgwebrtcEglRenderer(countDownLatchA16, frameListener);
                }
            });
            ThreadUtils.awaitUninterruptibly(countDownLatchA16);
        }
    }

    public void removeRenderListener(final RenderListener renderListener) {
        final CountDownLatch countDownLatchA16 = BV5.A16();
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                return;
            }
            if (Thread.currentThread() == BV7.A13(eglThread.handler)) {
                throw BV4.A0c("removeRenderListener must not be called on the render thread.");
            }
            postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3943lambda$removeRenderListener$0$orgwebrtcEglRenderer(countDownLatchA16, renderListener);
                }
            });
            ThreadUtils.awaitUninterruptibly(countDownLatchA16);
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public interface ErrorCallback {
        void onEglSurfaceCreationFailed(Object obj, Exception exc);

        void onGlOutOfMemory();

        /* renamed from: org.webrtc.EglRenderer$ErrorCallback$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static void $default$onEglSurfaceCreationFailed(ErrorCallback errorCallback, Object obj, Exception exc) {
            }
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer, boolean z) {
        this.id = EMPTY_UUID;
        this.threadLock = C3cG.A0T();
        this.eglExceptionCallback = new Runnable() { // from class: org.webrtc.EglRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                EglRenderer eglRenderer = EglRenderer.this;
                UUID uuid = EglRenderer.EMPTY_UUID;
                synchronized (eglRenderer.threadLock) {
                    EglRenderer.this.eglThread = null;
                }
            }
        };
        this.frameListeners = C3cG.A0h();
        this.renderListeners = C3cG.A0h();
        this.frameDrawnListenersWithContext = new ListenerManager<>();
        this.fpsReductionLock = C3cG.A0T();
        this.drawMatrix = BV4.A08();
        this.frameLock = C3cG.A0T();
        this.layoutLock = C3cG.A0T();
        this.statisticsLock = C3cG.A0T();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() { // from class: org.webrtc.EglRenderer.2
            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer eglRenderer = EglRenderer.this;
                    EglThread eglThread = eglRenderer.eglThread;
                    if (eglThread != null) {
                        eglThread.handler.removeCallbacks(eglRenderer.logStatisticsRunnable);
                        EglRenderer eglRenderer2 = EglRenderer.this;
                        eglRenderer2.eglThread.handler.postDelayed(eglRenderer2.logStatisticsRunnable, 4000L);
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation();
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
        this.enableSurfaceCreationErrorCallback = z;
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null) {
                eglThread.handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3939lambda$clearImage$0$orgwebrtcEglRenderer(f, f2, f3, f4);
                    }
                });
            }
        }
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                logD("Initializing EglRenderer");
                this.eglThread = eglThread;
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                eglThread.addExceptionCallback(this.eglExceptionCallback);
                this.eglBase = EglBase.CC.create(eglThread.eglConnection);
                eglThread.handler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                eglThread.handler.postDelayed(this.logStatisticsRunnable, 4000L);
            } else {
                throw BV5.A0U(this.name, "Already initialized");
            }
        }
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this(str, videoFrameDrawer, false);
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3938lambda$addFrameListener$0$orgwebrtcEglRenderer(glDrawer, frameListener, f, z);
            }
        });
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z, boolean z2) {
        if (z2) {
            this.id = UUID.randomUUID();
        }
        init(eglThread, glDrawer, z);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        init(EglThread.create(null, context, iArr, null), glDrawer, z);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        init(context, iArr, glDrawer, false, renderSynchronizer);
    }
}
