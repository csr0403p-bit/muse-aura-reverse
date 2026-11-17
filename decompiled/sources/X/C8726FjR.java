package X;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: X.FjR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8726FjR extends C8725FjQ<PointF> {
    public Path A00;
    public final C8725FjQ<PointF> A01;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8726FjR(C6837Eap c6837Eap, C8725FjQ<PointF> c8725FjQ) {
        PointF pointF = c8725FjQ.A0E;
        PointF pointF2 = c8725FjQ.A07;
        super(c8725FjQ.A0B, c8725FjQ.A0C, c8725FjQ.A0D, c6837Eap, c8725FjQ.A06, pointF, pointF2, c8725FjQ.A0A);
        this.A01 = c8725FjQ;
        A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r13 = this;
            T r0 = r13.A07
            if (r0 == 0) goto L17
            T r2 = r13.A0E
            if (r2 == 0) goto L17
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            float r1 = r0.x
            float r0 = r0.y
            boolean r1 = r2.equals(r1, r0)
            r0 = 1
            if (r1 != 0) goto L18
        L17:
            r0 = 0
        L18:
            T r5 = r13.A0E
            if (r5 == 0) goto L68
            T r3 = r13.A07
            if (r3 == 0) goto L68
            if (r0 != 0) goto L68
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            X.FjQ<android.graphics.PointF> r0 = r13.A01
            android.graphics.PointF r4 = r0.A04
            android.graphics.PointF r2 = r0.A05
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            float r1 = r5.x
            float r0 = r5.y
            r6.moveTo(r1, r0)
            if (r4 == 0) goto L69
            if (r2 == 0) goto L69
            float r0 = r4.length()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4d
            float r0 = r2.length()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L69
        L4d:
            float r7 = r5.x
            float r0 = r4.x
            float r7 = r7 + r0
            float r8 = r5.y
            float r0 = r4.y
            float r8 = r8 + r0
            float r11 = r3.x
            float r0 = r2.x
            float r9 = r11 + r0
            float r12 = r3.y
            float r0 = r2.y
            float r10 = r12 + r0
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
        L66:
            r13.A00 = r6
        L68:
            return
        L69:
            float r1 = r3.x
            float r0 = r3.y
            r6.lineTo(r1, r0)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8726FjR.A03():void");
    }
}
