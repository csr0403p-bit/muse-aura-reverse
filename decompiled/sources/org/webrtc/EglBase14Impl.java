package org.webrtc;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BV4;
import X.BV8;
import X.C3cG;
import X.C60O;
import X.FGI;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.view.Surface;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;

/* loaded from: classes5.dex */
public class EglBase14Impl implements EglBase14 {
    public static final EglConnection EGL_NO_CONNECTION = new EglConnection();
    public static final String TAG = "EglBase14Impl";
    public EglConnection eglConnection;
    public EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    public class Context implements EglBase14.Context {
        public final EGLContext egl14Context;

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            return this.egl14Context.getNativeHandle();
        }

        @Override // org.webrtc.EglBase14.Context
        public EGLContext getRawContext() {
            return this.egl14Context;
        }

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }
    }

    public class EglConnection implements EglBase14.EglConnection {
        public EGLSurface currentSurface;
        public final EGLConfig eglConfig;
        public final EGLContext eglContext;
        public final EGLDisplay eglDisplay;
        public final RefCountDelegate refCountDelegate;

        public static /* synthetic */ void lambda$new$1() {
        }

        public void detachCurrent() {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    throw BV8.A0T("eglDetachCurrent failed: 0x", EGL14.eglGetError(), EGL14.eglGetError());
                }
            }
            this.currentSurface = EGL14.EGL_NO_SURFACE;
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public EGLConfig getConfig() {
            return this.eglConfig;
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public EGLContext getContext() {
            return this.eglContext;
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public EGLDisplay getDisplay() {
            return this.eglDisplay;
        }

        /* renamed from: lambda$new$0$org-webrtc-EglBase14Impl$EglConnection, reason: not valid java name */
        public /* synthetic */ void m3927lambda$new$0$orgwebrtcEglBase14Impl$EglConnection() {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.eglDisplay);
            this.currentSurface = EGL14.EGL_NO_SURFACE;
        }

        public void makeCurrent(EGLSurface eGLSurface) {
            if (EGL14.eglGetCurrentContext() == this.eglContext && this.currentSurface == eGLSurface) {
                return;
            }
            synchronized (EglBase.lock) {
                if (!EGL14.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw BV8.A0T("eglMakeCurrent failed: 0x", EGL14.eglGetError(), EGL14.eglGetError());
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
            this.currentSurface = EGL14.EGL_NO_SURFACE;
            EGLDisplay eglDisplay = EglBase14Impl.getEglDisplay();
            this.eglDisplay = eglDisplay;
            EGLConfig eglConfig = EglBase14Impl.getEglConfig(eglDisplay, iArr);
            this.eglConfig = eglConfig;
            int openGlesVersionFromConfig = EglBase.CC.getOpenGlesVersionFromConfig(iArr);
            Logging.d(EglBase14Impl.TAG, FGI.A0H("Using OpenGL ES version ", openGlesVersionFromConfig));
            this.eglContext = EglBase14Impl.createEglContext(eGLContext, eglDisplay, eglConfig, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.EglBase14Impl$EglConnection$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3927lambda$new$0$orgwebrtcEglBase14Impl$EglConnection();
                }
            });
        }

        public EglConnection() {
            this.currentSurface = EGL14.EGL_NO_SURFACE;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.EglBase14Impl$EglConnection$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            throw BV8.A0T("eglChooseConfig failed: 0x", EGL14.eglGetError(), EGL14.eglGetError());
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

    public static EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw BV8.A0T("Unable to get EGL14 display: 0x", EGL14.eglGetError(), EGL14.eglGetError());
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw BV8.A0T("Unable to initialize EGL14: 0x", EGL14.eglGetError(), EGL14.eglGetError());
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglConnection == EGL_NO_CONNECTION) {
            throw BV4.A0c("This object has been released");
        }
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eGLContextEglCreateContext;
        if (eGLContext != null && eGLContext == EGL14.EGL_NO_CONTEXT) {
            throw BV4.A0c("Invalid sharedContext");
        }
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eGLContextEglCreateContext;
        }
        throw BV8.A0T("Failed to create EGL context: 0x", EGL14.eglGetError(), EGL14.eglGetError());
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw C3cG.A0Q("Input must be either a Surface or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            throw BV4.A0c("Already has an EGLSurface");
        }
        EglConnection eglConnection = this.eglConnection;
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eglConnection.getDisplay(), eglConnection.getConfig(), obj, new int[]{12344}, 0);
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw BV8.A0T("Failed to create window surface: 0x", EGL14.eglGetError(), EGL14.eglGetError());
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        this.eglConnection.detachCurrent();
    }

    @Override // org.webrtc.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglConnection.getContext());
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        return AnonymousClass006.A1Z(this.eglSurface, EGL14.EGL_NO_SURFACE);
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglConnection.getDisplay(), eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public EglBase14Impl(EglConnection eglConnection) {
        this.eglConnection = eglConnection;
        eglConnection.retain();
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            throw BV4.A0c("Already has an EGLSurface");
        }
        EglConnection eglConnection = this.eglConnection;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglConnection.getDisplay(), eglConnection.getConfig(), new int[]{12375, i, 12374, i2, 12344}, 0);
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        int iEglGetError = EGL14.eglGetError();
        StringBuilder sbA0y = C60O.A0y("Failed to create pixel buffer surface with size ", i);
        sbA0y.append("x");
        sbA0y.append(i2);
        sbA0y.append(": 0x");
        throw new GLException(iEglGetError, AnonymousClass001.A0v(Integer.toHexString(EGL14.eglGetError()), sbA0y));
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
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
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw BV4.A0c("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            EGLExt.eglPresentationTimeANDROID(this.eglConnection.getDisplay(), this.eglSurface, j);
            EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
        }
    }

    public EglBase14Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw BV4.A0c("No EGLSurface - can't swap buffers");
    }
}
