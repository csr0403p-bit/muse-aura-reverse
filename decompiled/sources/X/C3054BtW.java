package X;

import android.graphics.Matrix;
import java.util.List;

/* renamed from: X.BtW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3054BtW extends C06G implements InterfaceC3055BtX {
    public static final C3054BtW A07 = new C3054BtW(C0881AGi.A00, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final List<InterfaceC3055BtX> A06;

    @Override // X.InterfaceC3055BtX
    public final void A4b(Matrix matrix) {
        C7384Etj.A0Y(matrix, 0);
        Matrix matrixA08 = BV4.A08();
        float[] fArr = {this.A00, this.A02, this.A04, this.A01, this.A03, this.A05, 0.0f, 0.0f, 0.0f};
        matrixA08.getValues(fArr);
        matrixA08.setValues(fArr);
        List<InterfaceC3055BtX> list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).A4b(matrixA08);
        }
        matrix.postConcat(matrixA08);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3054BtW) {
                C3054BtW c3054BtW = (C3054BtW) obj;
                if (Float.compare(this.A00, c3054BtW.A00) != 0 || Float.compare(this.A01, c3054BtW.A01) != 0 || Float.compare(this.A02, c3054BtW.A02) != 0 || Float.compare(this.A03, c3054BtW.A03) != 0 || Float.compare(this.A04, c3054BtW.A04) != 0 || Float.compare(this.A05, c3054BtW.A05) != 0 || !C7384Etj.areEqual(this.A06, c3054BtW.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A06, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(Float.floatToIntBits(this.A00) * 31, this.A01), this.A02), this.A03), this.A04), this.A05));
    }

    /* JADX WARN: Incorrect types in method signature: (FFFFFFLjava/util/List<+LX/BtX;>;)V */
    public C3054BtW(List list, float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = list;
    }
}
