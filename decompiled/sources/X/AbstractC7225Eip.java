package X;

import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.Eip, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7225Eip extends Ek7 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public InterfaceC7299EkQ A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int[] A08;
    public int[] A09;
    public boolean[] A0A;
    public int A0B;
    public final int A0C;
    public final Drawable[] A0D;

    public AbstractC7225Eip(Drawable[] drawableArr) {
        super(drawableArr);
        this.A06 = true;
        this.A0D = drawableArr;
        int[] iArr = new int[4];
        this.A09 = iArr;
        this.A08 = new int[4];
        this.A0B = 255;
        this.A0A = new boolean[4];
        this.A01 = 0;
        this.A0C = 1;
        this.A02 = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        int[] iArr2 = this.A08;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        boolean[] zArr = this.A0A;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            r4 = 0
            X.C7384Etj.A0Y(r11, r4)
            int r0 = r10.A02
            r7 = 0
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L5f
            if (r0 != r5) goto L25
            int r5 = r10.A00
            if (r5 <= 0) goto Lac
            long r2 = android.os.SystemClock.uptimeMillis()
            long r0 = r10.A03
            long r2 = r2 - r0
            float r1 = (float) r2
            float r0 = (float) r5
            float r1 = r1 / r0
            boolean r3 = r10.A00(r1)
        L1f:
            if (r3 != 0) goto L22
            r6 = 1
        L22:
            r10.A02 = r6
            r5 = r3
        L25:
            android.graphics.drawable.Drawable[] r6 = r10.A0D
            int r3 = r6.length
        L28:
            if (r7 >= r3) goto L8c
            r2 = r6[r7]
            int[] r0 = r10.A08
            r1 = r0[r7]
            int r0 = r10.A0B
            int r1 = r1 * r0
            double r0 = (double) r1
            r8 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 / r8
            double r0 = java.lang.Math.ceil(r0)
            int r8 = (int) r0
            if (r2 == 0) goto L5c
            if (r8 <= 0) goto L5c
            int r0 = r10.A01
            int r0 = r0 + 1
            r10.A01 = r0
            boolean r0 = r10.A06
            if (r0 == 0) goto L50
            r2.mutate()
        L50:
            r2.setAlpha(r8)
            int r0 = r10.A01
            int r0 = r0 + (-1)
            r10.A01 = r0
            r2.draw(r11)
        L5c:
            int r7 = r7 + 1
            goto L28
        L5f:
            int[] r2 = r10.A08
            int[] r1 = r10.A09
            android.graphics.drawable.Drawable[] r0 = r10.A0D
            int r0 = r0.length
            java.lang.System.arraycopy(r2, r4, r1, r4, r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            r10.A03 = r0
            int r1 = r10.A00
            r0 = 0
            if (r1 != 0) goto L76
            r0 = 1065353216(0x3f800000, float:1.0)
        L76:
            boolean r3 = r10.A00(r0)
            boolean r0 = r10.A05
            if (r0 != 0) goto L1f
            int r2 = r10.A0C
            boolean[] r1 = r10.A0A
            int r0 = r1.length
            if (r2 >= r0) goto L1f
            boolean r0 = r1[r2]
            if (r0 == 0) goto L1f
            r10.A05 = r5
            goto L1f
        L8c:
            if (r5 == 0) goto La8
            boolean r0 = r10.A05
            if (r0 == 0) goto L94
            r10.A05 = r4
        L94:
            boolean r0 = r10.A07
            if (r0 == 0) goto La7
            int r1 = r10.A02
            r0 = 2
            if (r1 != r0) goto La7
            boolean[] r1 = r10.A0A
            int r0 = r10.A0C
            boolean r0 = r1[r0]
            if (r0 == 0) goto La7
            r10.A07 = r4
        La7:
            return
        La8:
            r10.invalidateSelf()
            return
        Lac:
            java.lang.IllegalStateException r0 = X.BV4.A0S()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7225Eip.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A00(float r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable[] r0 = r10.A0D
            int r6 = r0.length
            r9 = 0
            r5 = 0
            r8 = 1
        L6:
            if (r5 >= r6) goto L38
            boolean[] r0 = r10.A0A
            boolean r7 = r0[r5]
            r4 = -1
            if (r7 == 0) goto L10
            r4 = 1
        L10:
            int[] r3 = r10.A08
            int[] r0 = r10.A09
            r0 = r0[r5]
            float r2 = (float) r0
            r1 = 255(0xff, float:3.57E-43)
            int r0 = r4 * 255
            float r0 = (float) r0
            float r0 = r0 * r11
            float r2 = r2 + r0
            int r0 = (int) r2
            r3[r5] = r0
            if (r0 >= 0) goto L25
            r3[r5] = r9
        L25:
            r0 = r3[r5]
            if (r0 <= r1) goto L2b
            r3[r5] = r1
        L2b:
            r0 = r3[r5]
            if (r7 == 0) goto L35
            if (r0 >= r1) goto L32
        L31:
            r8 = 0
        L32:
            int r5 = r5 + 1
            goto L6
        L35:
            if (r0 <= 0) goto L32
            goto L31
        L38:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7225Eip.A00(float):boolean");
    }

    public final void A03(int i) {
        this.A0A[i] = true;
        this.A08[i] = 255;
        if (i == this.A0C) {
            this.A07 = true;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A0B;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.A01 == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.A0B != i) {
            this.A0B = i;
            invalidateSelf();
        }
    }
}
