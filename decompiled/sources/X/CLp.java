package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class CLp {
    public int A00;
    public int A01;
    public int A02;
    public CLr A03;
    public ByteBuffer A04;

    public static int A00(CLp cLp) {
        int iA02 = cLp.A02(4);
        if (iA02 != 0) {
            return cLp.A04.getInt(iA02 + cLp.A00);
        }
        return 0;
    }

    public final int A02(int i) {
        if (i < this.A01) {
            return this.A04.getShort(this.A02 + i);
        }
        return 0;
    }

    public CLp() {
        CLr cLr = CLr.A00;
        if (cLr == null) {
            cLr = new CLr();
            CLr.A00 = cLr;
        }
        this.A03 = cLr;
    }

    public static int A01(CLp cLp, int i) {
        int iA02 = cLp.A02(i);
        if (iA02 == 0) {
            return 0;
        }
        int i2 = iA02 + cLp.A00;
        return cLp.A04.getInt(i2 + cLp.A04.getInt(i2));
    }
}
