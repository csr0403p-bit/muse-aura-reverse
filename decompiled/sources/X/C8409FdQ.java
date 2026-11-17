package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: X.FdQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8409FdQ extends AbstractC8417FdZ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public String A08;
    public int[] A09;
    public final Matrix A0A;
    public final Matrix A0B;
    public final ArrayList<AbstractC8417FdZ> A0C;

    public C8409FdQ() {
        this.A0B = BV4.A08();
        this.A0C = C3cG.A0h();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = BV4.A08();
        this.A08 = null;
    }

    public static void A00(C8409FdQ c8409FdQ) {
        Matrix matrix = c8409FdQ.A0A;
        matrix.reset();
        matrix.postTranslate(-c8409FdQ.A00, -c8409FdQ.A01);
        matrix.postScale(c8409FdQ.A03, c8409FdQ.A04);
        matrix.postRotate(c8409FdQ.A02, 0.0f, 0.0f);
        matrix.postTranslate(c8409FdQ.A05 + c8409FdQ.A00, c8409FdQ.A06 + c8409FdQ.A01);
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public void setPivotX(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A00(this);
        }
    }

    public void setPivotY(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A00(this);
        }
    }

    public void setRotation(float f) {
        if (f != this.A02) {
            this.A02 = f;
            A00(this);
        }
    }

    public void setScaleX(float f) {
        if (f != this.A03) {
            this.A03 = f;
            A00(this);
        }
    }

    public void setScaleY(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A00(this);
        }
    }

    public void setTranslateX(float f) {
        if (f != this.A05) {
            this.A05 = f;
            A00(this);
        }
    }

    public void setTranslateY(float f) {
        if (f != this.A06) {
            this.A06 = f;
            A00(this);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FdQ;LX/DQd<Ljava/lang/String;Ljava/lang/Object;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C8409FdQ(DQd dQd, C8409FdQ c8409FdQ) {
        C8418Fda c8418Fda;
        this.A0B = BV4.A08();
        this.A0C = C3cG.A0h();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        Matrix matrixA08 = BV4.A08();
        this.A0A = matrixA08;
        this.A08 = null;
        this.A02 = c8409FdQ.A02;
        this.A00 = c8409FdQ.A00;
        this.A01 = c8409FdQ.A01;
        this.A03 = c8409FdQ.A03;
        this.A04 = c8409FdQ.A04;
        this.A05 = c8409FdQ.A05;
        this.A06 = c8409FdQ.A06;
        this.A09 = c8409FdQ.A09;
        String str = c8409FdQ.A08;
        this.A08 = str;
        this.A07 = c8409FdQ.A07;
        if (str != null) {
            dQd.put(str, this);
        }
        matrixA08.set(c8409FdQ.A0A);
        ArrayList<AbstractC8417FdZ> arrayList = c8409FdQ.A0C;
        for (int i = 0; i < arrayList.size(); i++) {
            AbstractC8417FdZ abstractC8417FdZ = arrayList.get(i);
            if (abstractC8417FdZ instanceof C8409FdQ) {
                this.A0C.add(new C8409FdQ(dQd, (C8409FdQ) abstractC8417FdZ));
            } else {
                if (abstractC8417FdZ instanceof C8412FdT) {
                    C8412FdT c8412FdT = (C8412FdT) abstractC8417FdZ;
                    C8412FdT c8412FdT2 = new C8412FdT(c8412FdT);
                    c8412FdT2.A03 = 0.0f;
                    c8412FdT2.A01 = 1.0f;
                    c8412FdT2.A00 = 1.0f;
                    c8412FdT2.A06 = 0.0f;
                    c8412FdT2.A04 = 1.0f;
                    c8412FdT2.A05 = 0.0f;
                    c8412FdT2.A07 = Paint.Cap.BUTT;
                    c8412FdT2.A08 = Paint.Join.MITER;
                    c8412FdT2.A02 = 4.0f;
                    c8412FdT2.A0B = c8412FdT.A0B;
                    c8412FdT2.A0A = c8412FdT.A0A;
                    c8412FdT2.A03 = c8412FdT.A03;
                    c8412FdT2.A01 = c8412FdT.A01;
                    c8412FdT2.A09 = c8412FdT.A09;
                    ((AbstractC8413FdU) c8412FdT2).A01 = ((AbstractC8413FdU) c8412FdT).A01;
                    c8412FdT2.A00 = c8412FdT.A00;
                    c8412FdT2.A06 = c8412FdT.A06;
                    c8412FdT2.A04 = c8412FdT.A04;
                    c8412FdT2.A05 = c8412FdT.A05;
                    c8412FdT2.A07 = c8412FdT.A07;
                    c8412FdT2.A08 = c8412FdT.A08;
                    c8412FdT2.A02 = c8412FdT.A02;
                    c8418Fda = c8412FdT2;
                } else if (abstractC8417FdZ instanceof C8418Fda) {
                    c8418Fda = new C8418Fda((AbstractC8413FdU) abstractC8417FdZ);
                } else {
                    throw C3cG.A0Q("Unknown object in the tree!");
                }
                this.A0C.add(c8418Fda);
                String str2 = c8418Fda.A02;
                if (str2 != null) {
                    dQd.put(str2, c8418Fda);
                }
            }
        }
    }
}
