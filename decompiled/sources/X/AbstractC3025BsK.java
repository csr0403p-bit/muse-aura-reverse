package X;

import android.opengl.EGL14;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BsK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3025BsK {
    public static final InterfaceC3048Bss A00;
    public static final InterfaceC3048Bss A01;
    public static final InterfaceC3048Bss A02;
    public static final AbstractC3050Bsv A03;
    public static final String A04;
    public static final String A05;
    public static final FloatBuffer A06;
    public static final FloatBuffer A07;
    public static final float[] A08;
    public static final float[] A09;
    public static final int[] A0A = {12344};
    public static final int[] A0B = {12445, 13632, 12344};

    public static int A00() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        A04("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        A04(FGI.A0H("glBindTexture ", i));
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        A04("glTexParameter");
        return i;
    }

    static {
        Locale locale = Locale.US;
        A04 = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        A05 = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        A00 = new C3036Bsb();
        A01 = new C3037Bsc();
        A02 = new C3038Bsd();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A09 = fArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        A07 = floatBufferAsFloatBuffer;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A08 = fArr2;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        A06 = floatBufferAsFloatBuffer2;
        A03 = new C3029BsS(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void A02(int i, String str) {
        if (i < 0) {
            throw BV5.A0V("Unable to locate '", str, "' in program");
        }
    }

    public static int A01(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        A04(FGI.A0H("glCreateShader type=", i));
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        AbstractC2875Bni.A03("GLUtils", FGI.A0M("Could not compile shader: ", str));
        GLES20.glDeleteShader(iGlCreateShader);
        throw C3cG.A0Q(FGI.A0W("Could not compile shader type ", ":", GLES20.glGetShaderInfoLog(iGlCreateShader), i));
    }

    public static void A03(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw BV5.A0V(str, ": EGL error: 0x", Integer.toHexString(iEglGetError));
        }
    }

    public static void A04(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw BV5.A0V(str, ": GL error 0x", Integer.toHexString(iGlGetError));
        }
    }

    public static void A05(Thread thread) {
        BeS.A07(AnonymousClass002.A1Z(thread, Thread.currentThread()), "Method call must be called on the GL thread.");
    }

    public static void A06(AtomicBoolean atomicBoolean, boolean z) {
        BeS.A07(AnonymousClass002.A1Q(z ? 1 : 0, atomicBoolean.get() ? 1 : 0), z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }
}
