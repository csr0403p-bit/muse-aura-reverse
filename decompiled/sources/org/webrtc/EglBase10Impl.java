package org.webrtc;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BV4;
import X.BV8;
import X.C3cG;
import X.C60O;
import X.FGI;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLException;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;

/* loaded from: classes5.dex */
public class EglBase10Impl implements EglBase10 {
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    public static final EglConnection EGL_NO_CONNECTION = new EglConnection();
    public static final String TAG = "EglBase10Impl";
    public EglConnection eglConnection;
    public EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    public class Context implements EglBase10.Context {
        public final EGL10 egl;
        public final EGLContext eglContext;
        public final EGLConfig eglContextConfig;

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            EGLContext eGLContextEglGetCurrentContext = this.egl.eglGetCurrentContext();
            EGLDisplay eGLDisplayEglGetCurrentDisplay = this.egl.eglGetCurrentDisplay();
            EGLSurface eGLSurfaceEglGetCurrentSurface = this.egl.eglGetCurrentSurface(12377);
            EGLSurface eGLSurfaceEglGetCurrentSurface2 = this.egl.eglGetCurrentSurface(12378);
            if (eGLDisplayEglGetCurrentDisplay == EGL10.EGL_NO_DISPLAY) {
                eGLDisplayEglGetCurrentDisplay = this.egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            }
            EGLSurface eGLSurfaceEglCreatePbufferSurface = null;
            try {
                if (eGLContextEglGetCurrentContext != this.eglContext) {
                    eGLSurfaceEglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(eGLDisplayEglGetCurrentDisplay, this.eglContextConfig, new int[]{12375, 1, 12374, 1, 12344});
                    if (!this.egl.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, this.eglContext)) {
                        throw new GLException(this.egl.eglGetError(), FGI.A0H("Failed to make temporary EGL surface active: ", this.egl.eglGetError()));
                    }
                }
                return EglBase10ImplJni.get().getCurrentNativeEGLContext();
            } finally {
                if (0 != 0) {
                    this.egl.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, eGLSurfaceEglGetCurrentSurface2, eGLContextEglGetCurrentContext);
                    this.egl.eglDestroySurface(eGLDisplayEglGetCurrentDisplay, null);
                }
            }
        }

        @Override // org.webrtc.EglBase10.Context
        public EGLContext getRawContext() {
            return this.eglContext;
        }

        public Context(EGL10 egl10, EGLContext eGLContext, EGLConfig eGLConfig) {
            this.egl = egl10;
            this.eglContext = eGLContext;
            this.eglContextConfig = eGLConfig;
        }
    }

    public class EglConnection implements EglBase10.EglConnection {
        public EGLSurface currentSurface;
        public final EGL10 egl;
        public final EGLConfig eglConfig;
        public final EGLContext eglContext;
        public final EGLDisplay eglDisplay;
        public final RefCountDelegate refCountDelegate;

        public static /* synthetic */ void lambda$new$1() {
        }

        public void detachCurrent() {
            EGLSurface eGLSurface;
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                eGLSurface = EGL10.EGL_NO_SURFACE;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                    throw BV8.A0T("eglDetachCurrent failed: 0x", this.egl.eglGetError(), this.egl.eglGetError());
                }
            }
            this.currentSurface = eGLSurface;
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public EGLConfig getConfig() {
            return this.eglConfig;
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public EGLContext getContext() {
            return this.eglContext;
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public EGLDisplay getDisplay() {
            return this.eglDisplay;
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public EGL10 getEgl() {
            return this.egl;
        }

        /* renamed from: lambda$new$0$org-webrtc-EglBase10Impl$EglConnection, reason: not valid java name */
        public /* synthetic */ void m3923lambda$new$0$orgwebrtcEglBase10Impl$EglConnection() {
            EGLSurface eGLSurface;
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
            this.egl.eglTerminate(this.eglDisplay);
            this.currentSurface = eGLSurface;
        }

        public void makeCurrent(EGLSurface eGLSurface) {
            if (this.egl.eglGetCurrentContext() == this.eglContext && this.currentSurface == eGLSurface) {
                return;
            }
            synchronized (EglBase.lock) {
                if (!this.egl.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw BV8.A0T("eglMakeCurrent failed: 0x", this.egl.eglGetError(), this.egl.eglGetError());
                }
            }
            this.currentSurface = eGLSurface;
        }

        @Override // org.webrtc.RefCounted
        public void release() {
            this.refCountDelegate.release();
        }

        @Override // org.webrtc.RefCounted
        public void retain() {
            this.refCountDelegate.retain();
        }

        public EglConnection(EGLContext eGLContext, int[] iArr) {
            this.currentSurface = EGL10.EGL_NO_SURFACE;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eglDisplay = EglBase10Impl.getEglDisplay(egl10);
            this.eglDisplay = eglDisplay;
            EGLConfig eglConfig = EglBase10Impl.getEglConfig(egl10, eglDisplay, iArr);
            this.eglConfig = eglConfig;
            int openGlesVersionFromConfig = EglBase.CC.getOpenGlesVersionFromConfig(iArr);
            Logging.d(EglBase10Impl.TAG, FGI.A0H("Using OpenGL ES version ", openGlesVersionFromConfig));
            this.eglContext = EglBase10Impl.createEglContext(egl10, eGLContext, eglDisplay, eglConfig, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.EglBase10Impl$EglConnection$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3923lambda$new$0$orgwebrtcEglBase10Impl$EglConnection();
                }
            });
        }

        public EglConnection() {
            this.currentSurface = EGL10.EGL_NO_SURFACE;
            this.egl = (EGL10) EGLContext.getEGL();
            this.eglContext = EGL10.EGL_NO_CONTEXT;
            this.eglDisplay = EGL10.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.EglBase10Impl$EglConnection$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public interface Natives {
        long getCurrentNativeEGLContext();
    }

    public static EGLConfig getEglConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            throw BV8.A0T("eglChooseConfig failed: 0x", egl10.eglGetError(), egl10.eglGetError());
        }
        if (iArr2[0] <= 0) {
            throw BV4.A0c("Unable to find any matching EGL config");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw BV4.A0c("eglChooseConfig returned null");
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EglConnection eglConnection = this.eglConnection;
        eglConnection.getEgl().eglQuerySurface(eglConnection.getDisplay(), this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EglConnection eglConnection = this.eglConnection;
        eglConnection.getEgl().eglQuerySurface(eglConnection.getDisplay(), this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglConnection == EGL_NO_CONNECTION) {
            throw BV4.A0c("This object has been released");
        }
    }

    public static EGLContext createEglContext(EGL10 egl10, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eGLContextEglCreateContext;
        if (eGLContext != null && eGLContext == EGL10.EGL_NO_CONTEXT) {
            throw BV4.A0c("Invalid sharedContext");
        }
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eGLContextEglCreateContext != EGL10.EGL_NO_CONTEXT) {
            return eGLContextEglCreateContext;
        }
        throw BV8.A0T("Failed to create EGL context: 0x", egl10.eglGetError(), egl10.eglGetError());
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            throw C3cG.A0Q("Input must be either a SurfaceHolder or SurfaceTexture");
        }
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            throw BV4.A0c("Already has an EGLSurface");
        }
        EglConnection eglConnection = this.eglConnection;
        EGL10 egl = eglConnection.getEgl();
        EGLSurface eGLSurfaceEglCreateWindowSurface = egl.eglCreateWindowSurface(eglConnection.getDisplay(), eglConnection.getConfig(), obj, new int[]{12344});
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != eGLSurface2) {
            return;
        }
        throw BV8.A0T("Failed to create window surface: 0x", egl.eglGetError(), egl.eglGetError());
    }

    public static EGLDisplay getEglDisplay(EGL10 egl10) {
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw BV8.A0T("Unable to get EGL10 display: 0x", egl10.eglGetError(), egl10.eglGetError());
        }
        if (egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            return eGLDisplayEglGetDisplay;
        }
        throw BV8.A0T("Unable to initialize EGL10: 0x", egl10.eglGetError(), egl10.eglGetError());
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) { // from class: org.webrtc.EglBase10Impl.1FakeSurfaceHolder
            public final Surface surface;

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            {
                this.surface = surface;
            }

            @Override // android.view.SurfaceHolder
            public Surface getSurface() {
                return this.surface;
            }

            @Override // android.view.SurfaceHolder
            public Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            public void addCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas(Rect rect) {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean z) {
            }

            @Override // android.view.SurfaceHolder
            @Deprecated
            public void setType(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(Canvas canvas) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i, int i2) {
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas() {
                return null;
            }
        });
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        this.eglConnection.detachCurrent();
    }

    @Override // org.webrtc.EglBase
    public EglBase.Context getEglBaseContext() {
        EglConnection eglConnection = this.eglConnection;
        return new Context(eglConnection.getEgl(), eglConnection.getContext(), eglConnection.getConfig());
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        return AnonymousClass006.A1Z(this.eglSurface, EGL10.EGL_NO_SURFACE);
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            EglConnection eglConnection = this.eglConnection;
            eglConnection.getEgl().eglDestroySurface(eglConnection.getDisplay(), eGLSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    public EglBase10Impl(EglConnection eglConnection) {
        this.eglConnection = eglConnection;
        eglConnection.retain();
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            throw BV4.A0c("Already has an EGLSurface");
        }
        EglConnection eglConnection = this.eglConnection;
        EGL10 egl = eglConnection.getEgl();
        EGLSurface eGLSurfaceEglCreatePbufferSurface = egl.eglCreatePbufferSurface(eglConnection.getDisplay(), eglConnection.getConfig(), new int[]{12375, i, 12374, i2, 12344});
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != eGLSurface2) {
            return;
        }
        int iEglGetError = egl.eglGetError();
        StringBuilder sbA0y = C60O.A0y("Failed to create pixel buffer surface with size ", i);
        sbA0y.append("x");
        sbA0y.append(i2);
        sbA0y.append(": 0x");
        throw new GLException(iEglGetError, AnonymousClass001.A0v(Integer.toHexString(egl.eglGetError()), sbA0y));
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            throw BV4.A0c("No EGLSurface - can't make current");
        }
        this.eglConnection.makeCurrent(eGLSurface);
    }

    @Override // org.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        this.eglConnection.release();
        this.eglConnection = EGL_NO_CONNECTION;
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j) {
        swapBuffers();
    }

    public EglBase10Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EglConnection eglConnection = this.eglConnection;
                eglConnection.getEgl().eglSwapBuffers(eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw BV4.A0c("No EGLSurface - can't swap buffers");
    }
}
