package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: X.FdP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8408FdP {
    public static final Matrix A0G = BV4.A08();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public Paint A05;
    public Paint A06;
    public PathMeasure A07;
    public Boolean A08;
    public String A09;
    public int A0A;
    public final Matrix A0B;
    public final Path A0C;
    public final Path A0D;
    public final DQd<String, Object> A0E;
    public final C8409FdQ A0F;

    /* JADX WARN: Removed duplicated region for block: B:152:0x0408  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.graphics.Canvas r49, android.graphics.Matrix r50, X.C8409FdQ r51, X.C8408FdP r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8408FdP.A00(android.graphics.Canvas, android.graphics.Matrix, X.FdQ, X.FdP, int, int):void");
    }

    public float getAlpha() {
        return this.A04 / 255.0f;
    }

    public int getRootAlpha() {
        return this.A04;
    }

    public void setAlpha(float f) {
        this.A04 = (int) (f * 255.0f);
    }

    public void setRootAlpha(int i) {
        this.A04 = i;
    }

    public C8408FdP() {
        this.A0B = BV4.A08();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A04 = 255;
        this.A09 = null;
        this.A08 = null;
        this.A0E = new DQd<>(0);
        this.A0F = new C8409FdQ();
        this.A0C = AbstractC7607F5u.A0V();
        this.A0D = AbstractC7607F5u.A0V();
    }

    public C8408FdP(C8408FdP c8408FdP) {
        this.A0B = BV4.A08();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A04 = 255;
        this.A09 = null;
        this.A08 = null;
        DQd<String, Object> dQd = new DQd<>(0);
        this.A0E = dQd;
        this.A0F = new C8409FdQ(dQd, c8408FdP.A0F);
        this.A0C = new Path(c8408FdP.A0C);
        this.A0D = new Path(c8408FdP.A0D);
        this.A01 = c8408FdP.A01;
        this.A00 = c8408FdP.A00;
        this.A03 = c8408FdP.A03;
        this.A02 = c8408FdP.A02;
        this.A0A = c8408FdP.A0A;
        this.A04 = c8408FdP.A04;
        this.A09 = c8408FdP.A09;
        String str = c8408FdP.A09;
        if (str != null) {
            dQd.put(str, this);
        }
        this.A08 = c8408FdP.A08;
    }
}
