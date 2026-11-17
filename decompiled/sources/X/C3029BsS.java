package X;

import android.opengl.EGLSurface;

/* renamed from: X.BsS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3029BsS extends AbstractC3050Bsv {
    public final int A00;
    public final int A01;
    public final EGLSurface A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3050Bsv) {
                C3029BsS c3029BsS = (C3029BsS) ((AbstractC3050Bsv) obj);
                if (!this.A02.equals(c3029BsS.A02) || this.A01 != c3029BsS.A01 || this.A00 != c3029BsS.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A02.hashCode() ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("OutputSurface{eglSurface=");
        sbA0x.append(this.A02);
        sbA0x.append(", width=");
        sbA0x.append(this.A01);
        sbA0x.append(", height=");
        return BV8.A0z(sbA0x, this.A00);
    }

    public C3029BsS(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw BV4.A0a("Null eglSurface");
        }
        this.A02 = eGLSurface;
        this.A01 = i;
        this.A00 = i2;
    }
}
