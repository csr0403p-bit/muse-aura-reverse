package X;

import com.google.crypto.tink.internal.TinkBugException;

/* loaded from: classes6.dex */
public abstract class GLW {
    public static final GLV A00;
    public static final GLO A01;
    public static final GLO A02;
    public static final GLO A03;
    public static final GLO A04;

    static {
        try {
            C9484GLa c9484GLa = C9484GLa.A04;
            GLL gll = GLL.A03;
            A01 = GLM.A00(gll, c9484GLa, 32, 16);
            try {
                A02 = GLM.A00(gll, c9484GLa, 32, 32);
                try {
                    GLL gll2 = GLL.A05;
                    A03 = GLM.A00(gll2, c9484GLa, 64, 32);
                    try {
                        A04 = GLM.A00(gll2, c9484GLa, 64, 64);
                        try {
                            A00 = new GLV(GLZ.A04, 32, 16);
                        } catch (Exception e) {
                            throw new TinkBugException(e);
                        }
                    } catch (Exception e2) {
                        throw new TinkBugException(e2);
                    }
                } catch (Exception e3) {
                    throw new TinkBugException(e3);
                }
            } catch (Exception e4) {
                throw new TinkBugException(e4);
            }
        } catch (Exception e5) {
            throw new TinkBugException(e5);
        }
    }
}
