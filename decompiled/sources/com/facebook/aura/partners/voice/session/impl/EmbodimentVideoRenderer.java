package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C7438Evz;
import X.CFK;
import X.InterfaceC10526Hou;
import android.view.Surface;
import com.facebook.rsys.rtc.RSVideoFrame;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceEglRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;

/* loaded from: classes5.dex */
public final class EmbodimentVideoRenderer {
    public static final Companion Companion = new Companion();
    public static final long FRAME_LOG_INTERVAL = 60;
    public static final String TAG = "EmbodimentVideoRenderer";
    public final Surface boundSurface;
    public final EglBase eglBase;
    public final AtomicLong frameCount;
    public final AtomicBoolean live;
    public final int markerKey;
    public volatile Function0<Unit> onFirstLiveFrame;
    public final CountDownLatch releaseCompleted;
    public final AtomicBoolean released;
    public final SurfaceEglRenderer renderer;
    public final InterfaceC10526Hou videoSink;

    public final class Companion {
        public final EmbodimentVideoRenderer create(Surface surface, int i, int i2, int i3, Function0<Float> function0, final Function0<Unit> function02) {
            SurfaceEglRenderer surfaceEglRenderer;
            C7384Etj.A0Y(surface, 0);
            AnonymousClass003.A0y(function0, function02);
            if (i <= 0 || i2 <= 0) {
                throw C60O.A0i("Embodiment surface must have a positive size");
            }
            try {
                EglBase eglBaseCreate = EglBase.CC.create();
                try {
                    UUID uuid = EglRenderer.EMPTY_UUID;
                    surfaceEglRenderer = new SurfaceEglRenderer(EmbodimentVideoRenderer.TAG, new VideoFrameDrawer(), true);
                } catch (RuntimeException e) {
                    e = e;
                }
                try {
                    surfaceEglRenderer.errorCallback = new EglRenderer.ErrorCallback() { // from class: com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer$Companion$create$4
                        @Override // org.webrtc.EglRenderer.ErrorCallback
                        public void onEglSurfaceCreationFailed(Object obj, Exception exc) {
                            CFK.A0K(EmbodimentVideoRenderer.TAG, exc, "Embodiment EGL surface creation failed; keeping the avatar");
                        }

                        @Override // org.webrtc.EglRenderer.ErrorCallback
                        public void onGlOutOfMemory() {
                            CFK.A06(EmbodimentVideoRenderer.TAG, "Embodiment video: GL out of memory");
                        }
                    };
                    surfaceEglRenderer.init(eglBaseCreate.getEglBaseContext(), new RendererCommon.RendererEvents() { // from class: com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer$Companion$create$5
                        @Override // org.webrtc.RendererCommon.RendererEvents
                        public void onFirstFrameRendered() {
                            function02.invoke();
                        }

                        @Override // org.webrtc.RendererCommon.RendererEvents
                        public void onFrameResolutionChanged(int i4, int i5, int i6) {
                        }
                    }, EglBase.CONFIG_RGBA, new EmbodimentFillDrawer(function0));
                    surfaceEglRenderer.setMirror(false);
                    surfaceEglRenderer.setLayoutAspectRatio(0.0f);
                    surfaceEglRenderer.createEglSurface(surface);
                    return new EmbodimentVideoRenderer(eglBaseCreate, surfaceEglRenderer, surface, i3);
                } catch (RuntimeException e2) {
                    e = e2;
                    EmbodimentVideoRenderer.Companion.releaseQuietly(new EmbodimentVideoRenderer$Companion$create$6$1(surfaceEglRenderer), "renderer");
                    EmbodimentVideoRenderer.Companion.releaseQuietly(new EmbodimentVideoRenderer$Companion$create$7$1(eglBaseCreate), "EGL base");
                    throw e;
                }
            } catch (RuntimeException e3) {
                throw e3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EmbodimentVideoRenderer create$default(Companion companion, Surface surface, int i, int i2, int i3, Function0 function0, Function0 function02, int i4, Object obj) {
            if ((i4 & 16) != 0) {
                function0 = EmbodimentVideoRenderer$Companion$create$1.INSTANCE;
            }
            if ((i4 & 32) != 0) {
                function02 = EmbodimentVideoRenderer$Companion$create$2.INSTANCE;
            }
            return companion.create(surface, i, i2, i3, function0, function02);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void releaseQuietly(Function0<Unit> function0, String str) {
            try {
                function0.invoke();
            } catch (RuntimeException e) {
                CFK.A0D(EmbodimentVideoRenderer.TAG, "Failed releasing the embodiment video %s", e, str);
            }
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer$release$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, SurfaceEglRenderer.class, "release", "release()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((EglRenderer) this.receiver).release();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer$release$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, EglBase.class, "release", "release()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((EglBase) this.receiver).release();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final synchronized void release() {
        if (C3cI.A1W(this.released)) {
            try {
                Companion companion = Companion;
                companion.releaseQuietly(new AnonymousClass1(this.renderer), "renderer");
                companion.releaseQuietly(new AnonymousClass2(this.eglBase), "EGL base");
                this.releaseCompleted.countDown();
            } catch (Throwable th) {
                this.releaseCompleted.countDown();
                throw th;
            }
        }
    }

    public final void renderIdle(VideoFrame videoFrame) {
        C7384Etj.A0Y(videoFrame, 0);
        if (this.live.get() || this.released.get()) {
            return;
        }
        this.renderer.onFrame(videoFrame);
    }

    public final boolean awaitReleaseCompletion(long j) {
        try {
            return this.releaseCompleted.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            BV4.A1A();
            return false;
        }
    }

    public final Surface getBoundSurface() {
        return this.boundSurface;
    }

    public final EglBase.Context getEglContext() {
        EglBase.Context eglBaseContext = this.eglBase.getEglBaseContext();
        C7384Etj.A0U(eglBaseContext);
        return eglBaseContext;
    }

    public final long getFramesReceived() {
        return this.frameCount.get();
    }

    public final int getMarkerKey() {
        return this.markerKey;
    }

    public final Function0<Unit> getOnFirstLiveFrame() {
        return this.onFirstLiveFrame;
    }

    public final InterfaceC10526Hou getVideoSink() {
        return this.videoSink;
    }

    public final void setOnFirstLiveFrame(Function0<Unit> function0) {
        this.onFirstLiveFrame = function0;
    }

    public /* synthetic */ EmbodimentVideoRenderer(EglBase eglBase, SurfaceEglRenderer surfaceEglRenderer, Surface surface, int i, C06H c06h) {
        this(eglBase, surfaceEglRenderer, surface, i);
    }

    public EmbodimentVideoRenderer(EglBase eglBase, SurfaceEglRenderer surfaceEglRenderer, Surface surface, int i) {
        this.eglBase = eglBase;
        this.renderer = surfaceEglRenderer;
        this.boundSurface = surface;
        this.markerKey = i;
        this.frameCount = BV5.A19();
        this.released = BV4.A12(false);
        this.live = BV4.A12(false);
        this.releaseCompleted = BV5.A16();
        this.videoSink = new InterfaceC10526Hou() { // from class: com.facebook.aura.partners.voice.session.impl.EmbodimentVideoRenderer$videoSink$1
            @Override // X.InterfaceC10526Hou
            public void onFrame(RSVideoFrame rSVideoFrame) {
                C7384Etj.A0Y(rSVideoFrame, 0);
                rSVideoFrame.onFrameReadyToRender();
                if (this.this$0.released.get()) {
                    return;
                }
                Function0<Unit> function0 = this.this$0.onFirstLiveFrame;
                if (function0 != null && BV4.A1V(this.this$0.live)) {
                    function0.invoke();
                }
                VideoFrame videoFrameAcquireVideoFrame = rSVideoFrame.acquireVideoFrame();
                if (videoFrameAcquireVideoFrame != null) {
                    try {
                        long jIncrementAndGet = this.this$0.frameCount.incrementAndGet();
                        if (jIncrementAndGet == 1 || jIncrementAndGet % 60 == 0) {
                            videoFrameAcquireVideoFrame.getRotatedWidth();
                            videoFrameAcquireVideoFrame.getRotatedHeight();
                        }
                        this.this$0.renderer.onFrame(videoFrameAcquireVideoFrame);
                    } finally {
                        videoFrameAcquireVideoFrame.release();
                    }
                }
            }
        };
    }
}
