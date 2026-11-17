package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.EtL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7377EtL {
    public Paint A00;
    public Paint A01;
    public Paint A02;
    public HwF A03;
    public EtQ A04;
    public C10438Hhk A05;
    public final C7523EzA A06;
    public final C3111Bya<Matrix> A07;

    public C7377EtL() {
        this(5, 10);
    }

    public final Path A00(C7376EtK c7376EtK) {
        C7384Etj.A0Y(c7376EtK, 0);
        C7523EzA c7523EzA = this.A06;
        Path path = (Path) c7523EzA.A02(c7376EtK);
        if (path == null) {
            path = new Path();
            Path.FillType fillType = c7376EtK.A00 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
            if (path.getFillType() != fillType) {
                path.setFillType(fillType);
            }
            List<InterfaceC7430Evn> list = c7376EtK.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).A4c(path, this);
            }
            c7523EzA.A05(c7376EtK, path);
        }
        return path;
    }

    public final void A01(C3054BtW c3054BtW, G0U g0u) {
        C7384Etj.A0Y(c3054BtW, 0);
        C3111Bya<Matrix> c3111Bya = this.A07;
        Matrix matrixA2t = c3111Bya.A2t();
        if (matrixA2t == null) {
            matrixA2t = BV4.A08();
        }
        c3054BtW.A4b(matrixA2t);
        g0u.invoke(matrixA2t);
        matrixA2t.reset();
        c3111Bya.AaC(matrixA2t);
    }

    public C7377EtL(int i, int i2) {
        this.A07 = new C3111Bya<>(5);
        this.A06 = new C7523EzA(10);
    }
}
