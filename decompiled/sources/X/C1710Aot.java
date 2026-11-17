package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Aot, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1710Aot implements InterfaceC1068ATy {
    public RectF A00;
    public Matrix A01;
    public float[] A02;
    public final Path A03;

    @Override // X.InterfaceC1068ATy
    public final void AXR(InterfaceC1068ATy interfaceC1068ATy, InterfaceC1068ATy interfaceC1068ATy2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.A03;
        if (!(interfaceC1068ATy instanceof C1710Aot)) {
            throw C8j3.A18("Unable to obtain android.graphics.Path");
        }
        Path path2 = ((C1710Aot) interfaceC1068ATy).A03;
        if (!(interfaceC1068ATy2 instanceof C1710Aot)) {
            throw C8j3.A18("Unable to obtain android.graphics.Path");
        }
        path.op(path2, ((C1710Aot) interfaceC1068ATy2).A03, op);
    }

    public final void A00(AaC aaC) {
        RectF rectF = this.A00;
        if (rectF == null) {
            rectF = new RectF();
            this.A00 = rectF;
        }
        rectF.set(aaC.A01, aaC.A03, aaC.A02, aaC.A00);
        Path path = this.A03;
        RectF rectF2 = this.A00;
        C7384Etj.A0X(rectF2);
        path.addOval(rectF2, Path.Direction.CCW);
    }

    @Override // X.InterfaceC1068ATy
    public final void A3k(InterfaceC1068ATy interfaceC1068ATy, long j) {
        Path path = this.A03;
        if (!(interfaceC1068ATy instanceof C1710Aot)) {
            throw C8j3.A18("Unable to obtain android.graphics.Path");
        }
        path.addPath(((C1710Aot) interfaceC1068ATy).A03, AnonymousClass003.A03(j), AnonymousClass004.A00(j));
    }

    @Override // X.InterfaceC1068ATy
    public final void A3r(AaC aaC) {
        float f = aaC.A01;
        if (!Float.isNaN(f)) {
            float f2 = aaC.A03;
            if (!Float.isNaN(f2)) {
                float f3 = aaC.A02;
                if (!Float.isNaN(f3)) {
                    float f4 = aaC.A00;
                    if (!Float.isNaN(f4)) {
                        RectF rectF = this.A00;
                        if (rectF == null) {
                            rectF = new RectF();
                            this.A00 = rectF;
                        }
                        rectF.set(f, f2, f3, f4);
                        Path path = this.A03;
                        RectF rectF2 = this.A00;
                        C7384Etj.A0X(rectF2);
                        path.addRect(rectF2, Path.Direction.CCW);
                        return;
                    }
                }
            }
        }
        throw C3cG.A0Q("Invalid rectangle, make sure no value is NaN");
    }

    @Override // X.InterfaceC1068ATy
    public final void A3t(AW7 aw7) {
        RectF rectF = this.A00;
        if (rectF == null) {
            rectF = new RectF();
            this.A00 = rectF;
        }
        rectF.set(aw7.A01, aw7.A03, aw7.A02, aw7.A00);
        float[] fArr = this.A02;
        if (fArr == null) {
            fArr = new float[8];
            this.A02 = fArr;
        }
        long j = aw7.A06;
        fArr[0] = AnonymousClass001.A00(j);
        fArr[1] = AnonymousClass001.A01(j, 4294967295L);
        long j2 = aw7.A07;
        fArr[2] = AnonymousClass001.A00(j2);
        fArr[3] = AnonymousClass001.A01(j2, 4294967295L);
        long j3 = aw7.A05;
        fArr[4] = AnonymousClass001.A00(j3);
        fArr[5] = AnonymousClass001.A01(j3, 4294967295L);
        long j4 = aw7.A04;
        fArr[6] = AnonymousClass001.A00(j4);
        fArr[7] = AnonymousClass001.A01(j4, 4294967295L);
        Path path = this.A03;
        RectF rectF2 = this.A00;
        C7384Etj.A0X(rectF2);
        float[] fArr2 = this.A02;
        C7384Etj.A0X(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // X.InterfaceC1068ATy
    public final void A4i(AaC aaC, float f, float f2, boolean z) {
        float f3 = aaC.A01;
        float f4 = aaC.A03;
        float f5 = aaC.A02;
        float f6 = aaC.A00;
        RectF rectF = this.A00;
        if (rectF == null) {
            rectF = new RectF();
            this.A00 = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = this.A03;
        RectF rectF2 = this.A00;
        C7384Etj.A0X(rectF2);
        path.arcTo(rectF2, f, f2, z);
    }

    @Override // X.InterfaceC1068ATy
    public final AaC AD1() {
        RectF rectF = this.A00;
        if (rectF == null) {
            rectF = new RectF();
            this.A00 = rectF;
        }
        this.A03.computeBounds(rectF, true);
        return C8j3.A0f(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // X.InterfaceC1068ATy
    public final void AhM(long j) {
        Matrix matrix = this.A01;
        if (matrix == null) {
            this.A01 = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.A01;
        C7384Etj.A0X(matrix2);
        matrix2.setTranslate(AnonymousClass003.A03(j), AnonymousClass004.A00(j));
        Path path = this.A03;
        Matrix matrix3 = this.A01;
        C7384Etj.A0X(matrix3);
        path.transform(matrix3);
    }

    public C1710Aot(Path path) {
        this.A03 = path;
    }

    public C1710Aot() {
        this(new Path());
    }
}
