package org.webrtc;

import X.BV5;
import X.C3cG;
import X.C60O;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase10;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14;
import org.webrtc.EglBase14Impl;

/* loaded from: classes5.dex */
public interface EglBase {
    public static final int[] CONFIG_PIXEL_BUFFER;
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER;
    public static final int[] CONFIG_PLAIN;
    public static final int[] CONFIG_RECORDABLE;
    public static final int[] CONFIG_RECORDABLE_YUV_NV12;
    public static final int[] CONFIG_RGBA;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int EGL_YUV_BUFFER_EXT = 13056;
    public static final int EGL_YUV_NUMBER_OF_PLANES_EXT = 13073;
    public static final int EGL_YUV_ORDER_EXT = 13057;
    public static final int EGL_YUV_ORDER_YUV_EXT = 13058;
    public static final int EGL_YUV_PLANE_BPP_8_EXT = 13084;
    public static final int EGL_YUV_PLANE_BPP_EXT = 13082;
    public static final int EGL_YUV_SUBSAMPLE_4_2_0_EXT = 13075;
    public static final int EGL_YUV_SUBSAMPLE_EXT = 13074;
    public static final Object lock = C3cG.A0T();

    /* renamed from: org.webrtc.EglBase$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static final CC $redex_init_class = null;

        public static EglBase10 createEgl10(int[] iArr) {
            return new EglBase10Impl(null, iArr);
        }

        public static EglBase14 createEgl14(int[] iArr) {
            return new EglBase14Impl(null, iArr);
        }

        public static int getOpenGlesVersionFromConfig(int[] iArr) {
            int i = 0;
            while (i < iArr.length - 1) {
                int i2 = iArr[i];
                i++;
                if (i2 == 12352) {
                    int i3 = iArr[i];
                    if (i3 != 4) {
                        return i3 == 64 ? 3 : 1;
                    }
                    return 2;
                }
            }
            return 1;
        }

        static {
            int i = EglBase.EGL_OPENGL_ES2_BIT;
        }

        public static ConfigBuilder configBuilder() {
            return new ConfigBuilder();
        }

        public static EglBase create(EglConnection eglConnection) {
            if (eglConnection == null) {
                return create();
            }
            if (eglConnection instanceof EglBase14Impl.EglConnection) {
                return new EglBase14Impl((EglBase14Impl.EglConnection) eglConnection);
            }
            if (eglConnection instanceof EglBase10Impl.EglConnection) {
                return new EglBase10Impl((EglBase10Impl.EglConnection) eglConnection);
            }
            throw C60O.A0i("Unrecognized EglConnection");
        }

        public static EglBase create(Context context, int[] iArr) {
            if (context == null) {
                return new EglBase14Impl(null, iArr);
            }
            if (context instanceof EglBase14.Context) {
                return createEgl14((EglBase14.Context) context, iArr);
            }
            if (context instanceof EglBase10.Context) {
                return createEgl10((EglBase10.Context) context, iArr);
            }
            throw C60O.A0i("Unrecognized Context");
        }

        public static EglBase10 createEgl10(EglBase10.Context context, int[] iArr) {
            EGLContext rawContext;
            int i = EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION;
            if (context == null) {
                rawContext = null;
            } else {
                rawContext = context.getRawContext();
            }
            return new EglBase10Impl(rawContext, iArr);
        }

        public static EglBase14 createEgl14(EglBase14.Context context, int[] iArr) {
            android.opengl.EGLContext rawContext;
            if (context == null) {
                rawContext = null;
            } else {
                rawContext = context.getRawContext();
            }
            return new EglBase14Impl(rawContext, iArr);
        }

        public static EglBase create(Context context) {
            return create(context, EglBase.CONFIG_PLAIN);
        }

        public static EglBase10 createEgl10(EGLContext eGLContext, int[] iArr) {
            return new EglBase10Impl(eGLContext, iArr);
        }

        public static EglBase14 createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
            return new EglBase14Impl(eGLContext, iArr);
        }

        public static EglBase create() {
            return new EglBase14Impl(null, EglBase.CONFIG_PLAIN);
        }
    }

    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    public interface EglConnection extends RefCounted {

        /* renamed from: org.webrtc.EglBase$EglConnection$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static EglConnection createEgl10(int[] iArr) {
                return new EglBase10Impl.EglConnection(null, iArr);
            }

            public static EglConnection createEgl14(int[] iArr) {
                return new EglBase14Impl.EglConnection(null, iArr);
            }

            public static EglConnection create(Context context, int[] iArr) {
                if (context == null) {
                    return new EglBase14Impl.EglConnection(null, iArr);
                }
                if (context instanceof EglBase14.Context) {
                    return new EglBase14Impl.EglConnection(((EglBase14.Context) context).getRawContext(), iArr);
                }
                if (context instanceof EglBase10.Context) {
                    return new EglBase10Impl.EglConnection(((EglBase10.Context) context).getRawContext(), iArr);
                }
                throw C60O.A0i("Unrecognized Context");
            }
        }
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i, int i2);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);

    public class ConfigBuilder {
        public boolean hasAlphaChannel;
        public boolean isRecordable;
        public boolean isYuvNV12;
        public int openGlesVersion = 2;
        public boolean supportsPixelBuffer;

        public ConfigBuilder setOpenGlesVersion(int i) {
            if (i < 1 || i > 3) {
                throw BV5.A0S("OpenGL ES version ", " not supported", i);
            }
            this.openGlesVersion = i;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[LOOP:0: B:20:0x0077->B:22:0x007d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] createConfigAttributes() {
            /*
                r5 = this;
                java.util.ArrayList r3 = X.C3cG.A0h()
                boolean r0 = r5.isYuvNV12
                r4 = 2
                if (r0 == 0) goto L8a
                r0 = 12351(0x303f, float:1.7307E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 13056(0x3300, float:1.8295E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 13057(0x3301, float:1.8297E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 13058(0x3302, float:1.8298E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 13082(0x331a, float:1.8332E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 13084(0x331c, float:1.8335E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 13074(0x3312, float:1.832E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 13075(0x3313, float:1.8322E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 13073(0x3311, float:1.8319E-41)
                X.C60Q.A1P(r3, r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            L3a:
                r3.add(r1)
            L3d:
                int r2 = r5.openGlesVersion
                r1 = 3
                if (r2 == r4) goto L44
                if (r2 != r1) goto L51
            L44:
                r0 = 12352(0x3040, float:1.7309E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 4
                if (r2 != r1) goto L4e
                r0 = 64
            L4e:
                X.C60Q.A1P(r3, r0)
            L51:
                boolean r0 = r5.supportsPixelBuffer
                if (r0 == 0) goto L5e
                r0 = 12339(0x3033, float:1.729E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 5
                X.C60Q.A1P(r3, r0)
            L5e:
                boolean r0 = r5.isRecordable
                if (r0 == 0) goto L6b
                r0 = 12610(0x3142, float:1.767E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 1
                X.C60Q.A1P(r3, r0)
            L6b:
                r0 = 12344(0x3038, float:1.7298E-41)
                X.C60Q.A1P(r3, r0)
                int r0 = r3.size()
                int[] r2 = new int[r0]
                r1 = 0
            L77:
                int r0 = r3.size()
                if (r1 >= r0) goto Lb2
                java.lang.Object r0 = r3.get(r1)
                int r0 = X.AnonymousClass001.A0F(r0)
                r2[r1] = r0
                int r1 = r1 + 1
                goto L77
            L8a:
                r0 = 12324(0x3024, float:1.727E-41)
                X.C60Q.A1P(r3, r0)
                r0 = 8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r3.add(r1)
                r0 = 12323(0x3023, float:1.7268E-41)
                X.C60Q.A1P(r3, r0)
                r3.add(r1)
                r0 = 12322(0x3022, float:1.7267E-41)
                X.C60Q.A1P(r3, r0)
                r3.add(r1)
                boolean r0 = r5.hasAlphaChannel
                if (r0 == 0) goto L3d
                r0 = 12321(0x3021, float:1.7265E-41)
                X.C60Q.A1P(r3, r0)
                goto L3a
            Lb2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglBase.ConfigBuilder.createConfigAttributes():int[]");
        }

        public ConfigBuilder setHasAlphaChannel(boolean z) {
            this.hasAlphaChannel = z;
            return this;
        }

        public ConfigBuilder setIsRecordable(boolean z) {
            this.isRecordable = z;
            return this;
        }

        public ConfigBuilder setIsYuvNV12(boolean z) {
            this.isYuvNV12 = z;
            return this;
        }

        public ConfigBuilder setSupportsPixelBuffer(boolean z) {
            this.supportsPixelBuffer = z;
            return this;
        }
    }

    static {
        CC cc = CC.$redex_init_class;
        CONFIG_PLAIN = new ConfigBuilder().createConfigAttributes();
        ConfigBuilder configBuilder = new ConfigBuilder();
        configBuilder.hasAlphaChannel = true;
        CONFIG_RGBA = configBuilder.createConfigAttributes();
        ConfigBuilder configBuilder2 = new ConfigBuilder();
        configBuilder2.supportsPixelBuffer = true;
        CONFIG_PIXEL_BUFFER = configBuilder2.createConfigAttributes();
        ConfigBuilder configBuilder3 = new ConfigBuilder();
        configBuilder3.hasAlphaChannel = true;
        configBuilder3.supportsPixelBuffer = true;
        CONFIG_PIXEL_RGBA_BUFFER = configBuilder3.createConfigAttributes();
        ConfigBuilder configBuilder4 = new ConfigBuilder();
        configBuilder4.isRecordable = true;
        CONFIG_RECORDABLE = configBuilder4.createConfigAttributes();
        ConfigBuilder configBuilder5 = new ConfigBuilder();
        configBuilder5.isYuvNV12 = true;
        CONFIG_RECORDABLE_YUV_NV12 = configBuilder5.createConfigAttributes();
    }
}
