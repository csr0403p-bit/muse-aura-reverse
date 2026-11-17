package org.webrtc;

import X.BV4;
import X.BV5;
import X.FGI;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes5.dex */
public class GlShader {
    public static final String TAG = "GlShader";
    public int program;

    public int getAttribLocation(String str) {
        int i = this.program;
        if (i == -1) {
            throw BV4.A0c("The program has been released");
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (iGlGetAttribLocation >= 0) {
            return iGlGetAttribLocation;
        }
        throw BV5.A0i("Could not locate '", str, "' in program");
    }

    public int getUniformLocation(String str) {
        int i = this.program;
        if (i == -1) {
            throw BV4.A0c("The program has been released");
        }
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (iGlGetUniformLocation >= 0) {
            return iGlGetUniformLocation;
        }
        throw BV5.A0i("Could not locate uniform '", str, "' in program");
    }

    public void release() {
        Logging.d(TAG, "Deleting shader.");
        int i = this.program;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.program = -1;
        }
    }

    public void setVertexAttribArray(String str, int i, int i2, FloatBuffer floatBuffer) {
        if (this.program == -1) {
            throw BV4.A0c("The program has been released");
        }
        int attribLocation = getAttribLocation(str);
        GLES20.glEnableVertexAttribArray(attribLocation);
        GLES20.glVertexAttribPointer(attribLocation, i, 5126, false, i2, (Buffer) floatBuffer);
        GlUtil.checkNoGLES2Error("setVertexAttribArray");
    }

    public void useProgram() {
        if (this.program == -1) {
            throw BV4.A0c("The program has been released");
        }
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(this.program);
        }
        GlUtil.checkNoGLES2Error("glUseProgram");
    }

    public GlShader(String str, String str2) {
        int iCompileShader = compileShader(35633, str);
        int iCompileShader2 = compileShader(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.program = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            throw BV5.A0g("glCreateProgram() failed. GLES20 error: ", GLES20.glGetError());
        }
        GLES20.glAttachShader(iGlCreateProgram, iCompileShader);
        GLES20.glAttachShader(this.program, iCompileShader2);
        GLES20.glLinkProgram(this.program);
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Logging.e(TAG, FGI.A0M("Could not link program: ", GLES20.glGetProgramInfoLog(this.program)));
            throw BV4.A0c(GLES20.glGetProgramInfoLog(this.program));
        }
        GLES20.glDeleteShader(iCompileShader);
        GLES20.glDeleteShader(iCompileShader2);
        GlUtil.checkNoGLES2Error("Creating GlShader");
    }

    public static int compileShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            throw BV5.A0g("glCreateShader() failed. GLES20 error: ", GLES20.glGetError());
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            GlUtil.checkNoGLES2Error("compileShader");
            return iGlCreateShader;
        }
        Logging.e(TAG, FGI.A0d("Compile error ", GLES20.glGetShaderInfoLog(iGlCreateShader), " in shader:\n", str));
        throw BV4.A0c(GLES20.glGetShaderInfoLog(iGlCreateShader));
    }

    public void setVertexAttribArray(String str, int i, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i, 0, floatBuffer);
    }
}
