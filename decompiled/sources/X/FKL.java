package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class FKL extends Drawable {
    public Paint A00;
    public Paint A01;
    public Drawable A02;
    public Rect A03;
    public final Context A04;
    public final Path A05 = AbstractC7607F5u.A0V();
    public final FKP A06;
    public final C7873FIm A07;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        Paint paint = this.A01;
        if (paint != null) {
            canvas.drawPath(this.A05, paint);
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            Path path = this.A05;
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        Paint paint2 = this.A00;
        if (paint2 != null) {
            canvas.drawPath(this.A05, paint2);
        }
        FKP fkp = this.A06;
        if (fkp == null || fkp.A03 == null || fkp.A0A.isEmpty()) {
            return;
        }
        FE6 fe6 = fkp.A05;
        int i = 0;
        do {
            if (fe6.A00.A00[i] > 0.0f && (fe6.A01[i] >>> 24) != 0) {
                FKP.A01(canvas, fkp);
                return;
            }
            i++;
        } while (i < 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b6  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBoundsChange(android.graphics.Rect r26) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FKL.onBoundsChange(android.graphics.Rect):void");
    }

    public static HxE A00(Object obj, Object obj2, Object obj3, Object obj4) {
        return new HxE(new HxE(obj, obj2), new HxE(obj3, obj4));
    }

    public static final float[] A01(EnumC7870FIi enumC7870FIi, FIe fIe, float f) {
        HxE hxE;
        FIe fIe2 = FIe.A05;
        EnumC7870FIi enumC7870FIi2 = EnumC7870FIi.A03;
        HxE hxEA0r = C3cG.A0r(C3cG.A0r(fIe2, enumC7870FIi2), C3cG.A0r(6, 7));
        Integer numA0V = BV4.A0V();
        EnumC7870FIi enumC7870FIi3 = EnumC7870FIi.A04;
        HxE hxEA0r2 = C3cG.A0r(C3cG.A0r(fIe2, enumC7870FIi3), C3cG.A0r(4, 5));
        FIe fIe3 = FIe.A04;
        EnumC7870FIi enumC7870FIi4 = EnumC7870FIi.A05;
        HxE hxEA00 = A00(fIe3, enumC7870FIi4, numA0V, 1);
        EnumC7870FIi enumC7870FIi5 = EnumC7870FIi.A02;
        HxE hxEA002 = A00(fIe3, enumC7870FIi5, 6, 7);
        FIe fIe4 = FIe.A02;
        HxE hxEA003 = A00(fIe4, enumC7870FIi2, numA0V, 1);
        HxE hxEA004 = A00(fIe4, enumC7870FIi3, 2, 3);
        FIe fIe5 = FIe.A03;
        HxE[] hxEArr = {hxEA0r, hxEA0r2, hxEA00, hxEA002, hxEA003, hxEA004, A00(fIe5, enumC7870FIi4, 2, 3), A00(fIe5, enumC7870FIi5, 4, 5)};
        HashMap mapA0v = BV4.A0v(AIW.A0H(8));
        AGH.A0G(mapA0v, hxEArr);
        float[] fArr = new float[8];
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
        int iOrdinal = enumC7870FIi.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && (hxE = (HxE) mapA0v.get(C3cG.A0r(fIe, enumC7870FIi))) != null) {
            int iA0F = AnonymousClass001.A0F(hxE.first);
            int iA0F2 = AnonymousClass001.A0F(hxE.second);
            fArr[iA0F] = 0.0f;
            fArr[iA0F2] = 0.0f;
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getOpacity() {
        /*
            r6 = this;
            X.FKP r0 = r6.A06
            r5 = -3
            if (r0 != 0) goto L2e
            X.FIm r0 = r6.A07
            X.FKK r4 = r0.A00
            boolean r0 = r4.A00()
            r3 = 1
            if (r0 == 0) goto L1b
            int r0 = r4.A03
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 == r0) goto L1c
        L1b:
            r2 = 0
        L1c:
            android.graphics.drawable.Drawable r0 = r4.A04
            r1 = -1
            if (r0 == 0) goto L2c
            int r0 = r0.getOpacity()
            if (r0 != r1) goto L2c
        L27:
            if (r2 == 0) goto L2e
            if (r3 == 0) goto L2e
            return r1
        L2c:
            r3 = 0
            goto L27
        L2e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FKL.getOpacity():int");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public FKL(Context context, C7873FIm c7873FIm) {
        int i;
        this.A04 = context;
        this.A07 = c7873FIm;
        FKK fkk = c7873FIm.A00;
        FE6 fe6 = fkk.A06;
        FKP fkp = null;
        if (fe6 != null) {
            FKP fkp2 = new FKP();
            List<Float> list = fkk.A08;
            fkp2.A05(fe6, list != null ? AbstractC0878AGe.A0m(list) : null, fkk.A00);
            fkp = fkp2;
        }
        this.A06 = fkp;
        if (fe6 == null && fkk.A00()) {
            Paint paintA0U = AbstractC7607F5u.A0U(5);
            paintA0U.setStyle(Paint.Style.STROKE);
            paintA0U.setStrokeWidth(fkk.A01);
            paintA0U.setColor(fkk.A03);
            this.A00 = paintA0U;
        }
        FKR fkr = fkk.A05;
        if (fkr != null) {
            float f = fkr.A02;
            if (f == 0.0f || (i = fkr.A03) == 0) {
                return;
            }
            Paint paintA0U2 = AbstractC7607F5u.A0U(5);
            AbstractC7607F5u.A1G(paintA0U2);
            paintA0U2.setColor(i);
            paintA0U2.setShadowLayer(f, fkr.A00, fkr.A01, i);
            this.A01 = paintA0U2;
        }
    }
}
