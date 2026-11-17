package X;

import android.graphics.Matrix;
import android.util.Size;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BfL extends BfD {
    public static final BfL $redex_init_class = null;
    public InterfaceC2692Bhr A00;
    public BjC A01;
    public BgX A02;
    public C2625Bfs A03;
    public final BnR A04;
    public final Object A05;

    static {
        Size size = Bf2.A01;
    }

    public final String toString() {
        return FGI.A0M("ImageAnalysis:", A0I());
    }

    public BfL(Bf7 bf7) {
        BnR c2870Bnd;
        super(bf7);
        this.A05 = C3cG.A0T();
        Bf7 bf72 = (Bf7) super.A05;
        if (AnonymousClass001.A0F(bf72.A00.Abl(Bf7.A01, 0)) == 1) {
            c2870Bnd = new BnP();
        } else {
            Executor executorA00 = BpK.A00();
            c2870Bnd = new C2870Bnd((Executor) bf7.A00.Abl(InterfaceC2557Bdl.A00, executorA00));
        }
        this.A04 = c2870Bnd;
        Bf7 bf73 = (Bf7) super.A05;
        c2870Bnd.A0E = AnonymousClass001.A0F(bf73.A00.Abl(Bf7.A05, 1));
        BnR bnR = this.A04;
        Bf7 bf74 = (Bf7) super.A05;
        Boolean boolA0h = AnonymousClass001.A0h();
        bnR.A0H = AnonymousClass001.A1X(bf74.A00.Abl(Bf7.A06, boolA0h));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BgX A00(X.BfL r13, X.Bf7 r14, X.AbstractC2481Bc8 r15) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BfL.A00(X.BfL, X.Bf7, X.Bc8):X.BgX");
    }

    @Override // X.BfD
    public final void A0P(Matrix matrix) {
        super.A0P(matrix);
        BnR bnR = this.A04;
        synchronized (bnR.A0D) {
            bnR.A00 = matrix;
            bnR.A01 = new Matrix(matrix);
        }
    }
}
