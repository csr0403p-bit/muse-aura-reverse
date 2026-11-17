package X;

import android.opengl.GLES20;
import java.nio.Buffer;

/* renamed from: X.BsL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3026BsL extends AbstractC3027BsM {
    public int A00;
    public int A01;
    public int A02;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3026BsL(C2507Bcd c2507Bcd, InterfaceC3048Bss interfaceC3048Bss) {
        String str = c2507Bcd.A00() ? AbstractC3025BsK.A05 : AbstractC3025BsK.A04;
        try {
            String strA7l = interfaceC3048Bss.A7l("sTexture", "vTextureCoord");
            if (strA7l == null || !strA7l.contains("vTextureCoord") || !strA7l.contains("sTexture")) {
                throw C60O.A0i("Invalid fragment shader");
            }
            super(str, strA7l);
            this.A00 = -1;
            this.A02 = -1;
            this.A01 = -1;
            AbstractC3027BsM.A00(this);
            int i = super.A01;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
            this.A00 = iGlGetUniformLocation;
            AbstractC3025BsK.A02(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
            this.A01 = iGlGetAttribLocation;
            AbstractC3025BsK.A02(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
            this.A02 = iGlGetUniformLocation2;
            AbstractC3025BsK.A02(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw BV4.A0Q("Unable retrieve fragment shader source", th);
            }
            throw th;
        }
    }

    @Override // X.AbstractC3027BsM
    public final void A01() {
        super.A01();
        GLES20.glUniform1i(this.A00, 0);
        int i = this.A01;
        GLES20.glEnableVertexAttribArray(i);
        AbstractC3025BsK.A04("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, (Buffer) AbstractC3025BsK.A06);
        AbstractC3025BsK.A04("glVertexAttribPointer");
    }
}
