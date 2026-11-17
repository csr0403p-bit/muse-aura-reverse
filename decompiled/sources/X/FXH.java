package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes6.dex */
public final class FXH {
    public final FYD[] A09 = new FYD[4];
    public final Matrix[] A07 = new Matrix[4];
    public final Matrix[] A08 = new Matrix[4];
    public final PointF A03 = new PointF();
    public final Path A02 = AbstractC7607F5u.A0V();
    public final Path A00 = AbstractC7607F5u.A0V();
    public final FYD A04 = new FYD();
    public final float[] A05 = new float[2];
    public final float[] A06 = new float[2];
    public final Path A01 = AbstractC7607F5u.A0V();
    public final Path A0A = AbstractC7607F5u.A0V();

    private boolean A00(Path path, int i) {
        Path path2 = this.A0A;
        path2.reset();
        this.A09[i].A03(this.A07[i], path2);
        RectF rectFA0Y = AbstractC7607F5u.A0Y();
        path.computeBounds(rectFA0Y, true);
        path2.computeBounds(rectFA0Y, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectFA0Y, true);
        return !rectFA0Y.isEmpty() || (rectFA0Y.width() > 1.0f && rectFA0Y.height() > 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148 A[EDGE_INSN: B:67:0x0148->B:40:0x0148 BREAK  A[LOOP:0: B:3:0x001e->B:68:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.graphics.Path r18, android.graphics.RectF r19, X.FXK r20, X.FZX r21, float r22) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FXH.A01(android.graphics.Path, android.graphics.RectF, X.FXK, X.FZX, float):void");
    }

    public FXH() {
        int i = 0;
        do {
            this.A09[i] = new FYD();
            this.A07[i] = BV4.A08();
            this.A08[i] = BV4.A08();
            i++;
        } while (i < 4);
    }
}
