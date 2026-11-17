package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* loaded from: classes6.dex */
public final class FYD {

    @Deprecated
    public float A00;

    @Deprecated
    public float A01;

    @Deprecated
    public float A02;

    @Deprecated
    public float A03;

    @Deprecated
    public float A04;
    public final List<AbstractC8205FYw> A05 = C3cG.A0h();
    public final List<FXE> A06 = C3cG.A0h();

    public final void A02(float f, float f2, float f3) {
        this.A04 = f;
        this.A02 = 0.0f;
        this.A03 = f;
        this.A00 = f2;
        this.A01 = (f2 + f3) % 360.0f;
        this.A05.clear();
        this.A06.clear();
    }

    public static void A00(FYD fyd, float f) {
        float f2 = fyd.A00;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = fyd.A02;
                float f5 = fyd.A03;
                FYH fyh = new FYH();
                fyh.A01 = f4;
                fyh.A05 = f5;
                fyh.A02 = f4;
                fyh.A00 = f5;
                fyh.A03 = fyd.A00;
                fyh.A04 = f3;
                fyd.A06.add(new FYB(fyh));
                fyd.A00 = f;
            }
        }
    }

    public final void A01(float f, float f2) {
        FYW fyw = new FYW();
        fyw.A00 = f;
        fyw.A01 = f2;
        this.A05.add(fyw);
        FYC fyc = new FYC(fyw, this.A02, this.A03);
        FYW fyw2 = fyc.A02;
        float degrees = ((float) Math.toDegrees(Math.atan((fyw2.A01 - fyc.A01) / (fyw2.A00 - fyc.A00)))) + 270.0f;
        A00(this, degrees);
        this.A06.add(fyc);
        this.A00 = degrees;
        this.A02 = f;
        this.A03 = f2;
    }

    public final void A03(Matrix matrix, Path path) {
        List<AbstractC8205FYw> list = this.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC8205FYw abstractC8205FYw = list.get(i);
            if (abstractC8205FYw instanceof FYW) {
                FYW fyw = (FYW) abstractC8205FYw;
                Matrix matrix2 = ((AbstractC8205FYw) fyw).A00;
                matrix.invert(matrix2);
                path.transform(matrix2);
                path.lineTo(fyw.A00, fyw.A01);
            } else {
                FYH fyh = (FYH) abstractC8205FYw;
                Matrix matrix3 = ((AbstractC8205FYw) fyh).A00;
                matrix.invert(matrix3);
                path.transform(matrix3);
                RectF rectF = FYH.A06;
                rectF.set(fyh.A01, fyh.A05, fyh.A02, fyh.A00);
                path.arcTo(rectF, fyh.A03, fyh.A04, false);
            }
            path.transform(matrix);
        }
    }

    public FYD() {
        A02(0.0f, 270.0f, 0.0f);
    }
}
