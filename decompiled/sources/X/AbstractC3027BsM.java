package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* renamed from: X.BsM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3027BsM {
    public int A01;
    public int A02 = -1;
    public int A00 = -1;
    public int A03 = -1;

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC3027BsM(java.lang.String r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r1 = "glAttachShader"
            java.lang.String r8 = "Could not link program: "
            r9.<init>()
            r6 = -1
            r9.A02 = r6
            r9.A00 = r6
            r9.A03 = r6
            r0 = 35633(0x8b31, float:4.9932E-41)
            int r7 = X.AbstractC3025BsK.A01(r0, r10)     // Catch: java.lang.Throwable -> L68
            r0 = 35632(0x8b30, float:4.9931E-41)
            int r5 = X.AbstractC3025BsK.A01(r0, r11)     // Catch: java.lang.Throwable -> L55
            int r4 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "glCreateProgram"
            X.AbstractC3025BsK.A04(r0)     // Catch: java.lang.Throwable -> L51
            android.opengl.GLES20.glAttachShader(r4, r7)     // Catch: java.lang.Throwable -> L51
            X.AbstractC3025BsK.A04(r1)     // Catch: java.lang.Throwable -> L51
            android.opengl.GLES20.glAttachShader(r4, r5)     // Catch: java.lang.Throwable -> L51
            X.AbstractC3025BsK.A04(r1)     // Catch: java.lang.Throwable -> L51
            android.opengl.GLES20.glLinkProgram(r4)     // Catch: java.lang.Throwable -> L51
            r3 = 1
            int[] r2 = new int[r3]     // Catch: java.lang.Throwable -> L51
            r1 = 35714(0x8b82, float:5.0046E-41)
            r0 = 0
            android.opengl.GLES20.glGetProgramiv(r4, r1, r2, r0)     // Catch: java.lang.Throwable -> L51
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L51
            if (r0 != r3) goto L48
            r9.A01 = r4     // Catch: java.lang.Throwable -> L51
            A00(r9)
            return
        L48:
            java.lang.String r0 = android.opengl.GLES20.glGetProgramInfoLog(r4)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L51
            java.lang.IllegalStateException r0 = X.BV5.A0U(r8, r0)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L51
        L51:
            r0 = move-exception
            goto L58
        L53:
            r0 = move-exception
            goto L57
        L55:
            r0 = move-exception
            r5 = -1
        L57:
            r4 = -1
        L58:
            if (r7 == r6) goto L5d
            android.opengl.GLES20.glDeleteShader(r7)
        L5d:
            if (r5 == r6) goto L62
            android.opengl.GLES20.glDeleteShader(r5)
        L62:
            if (r4 == r6) goto L67
            android.opengl.GLES20.glDeleteProgram(r4)
        L67:
            throw r0
        L68:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3027BsM.<init>(java.lang.String, java.lang.String):void");
    }

    public static void A00(AbstractC3027BsM abstractC3027BsM) {
        int i = abstractC3027BsM.A01;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        abstractC3027BsM.A03 = iGlGetAttribLocation;
        AbstractC3025BsK.A02(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        abstractC3027BsM.A02 = iGlGetUniformLocation;
        AbstractC3025BsK.A02(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        abstractC3027BsM.A00 = iGlGetUniformLocation2;
        AbstractC3025BsK.A02(iGlGetUniformLocation2, "uAlphaScale");
    }

    public void A01() {
        GLES20.glUseProgram(this.A01);
        AbstractC3025BsK.A04("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.A03);
        AbstractC3025BsK.A04("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.A03, 2, 5126, false, 0, (Buffer) AbstractC3025BsK.A07);
        AbstractC3025BsK.A04("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.A02, 1, false, fArr, 0);
        AbstractC3025BsK.A04("glUniformMatrix4fv");
        GLES20.glUniform1f(this.A00, 1.0f);
        AbstractC3025BsK.A04("glUniform1f");
    }
}
