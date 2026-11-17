package X;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.LineBackgroundSpan;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Hhl implements LineBackgroundSpan {
    public final Paint A00;
    public final List<Path> A01;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    public Hhl(Layout layout, float f, float f2, float f3, float f4, float f5, int i) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
            RectF rectF = new RectF(layout.getLineLeft(i2), layout.getLineTop(i2), layout.getLineRight(i2), layout.getLineBottom(i2));
            String string = layout.getText().subSequence(layout.getLineStart(i2), layout.getLineEnd(i2)).toString();
            if (rectF.width() > 0.0f && !TextUtils.isEmpty(string.replace(PairsDiscretionDocument.TERMINATOR, ""))) {
                arrayListA0h2.add(rectF);
            } else if (!arrayListA0h2.isEmpty()) {
                arrayListA0h.add(arrayListA0h2);
                arrayListA0h2 = C3cG.A0h();
            }
        }
        if (!arrayListA0h2.isEmpty()) {
            arrayListA0h.add(arrayListA0h2);
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (int i3 = 0; i3 < arrayListA0h.size(); i3++) {
            List list = (List) arrayListA0h.get(i3);
            Path pathA0V = AbstractC7607F5u.A0V();
            arrayListA0h3.add(pathA0V);
            int size = list.size();
            int i4 = size * 2;
            PointF[] pointFArr = new PointF[i4];
            PointF[] pointFArr2 = new PointF[i4];
            for (int i5 = 0; i5 <= size - 1; i5++) {
                RectF rectF2 = (RectF) list.get(i5);
                int i6 = i5 * 2;
                int i7 = i6 + 1;
                pointFArr2[i6] = new PointF(rectF2.right + f2, rectF2.top - f3);
                pointFArr2[i7] = new PointF(rectF2.right + f2, rectF2.bottom + f4);
                pointFArr[i6] = new PointF(rectF2.left - f, rectF2.top - f3);
                pointFArr[i7] = new PointF(rectF2.left - f, rectF2.bottom + f4);
            }
            for (int i8 = 1; i8 < pointFArr2.length; i8++) {
                PointF pointF = pointFArr2[i8];
                PointF pointF2 = pointFArr2[i8 - 1];
                if (pointF.x > pointF2.x) {
                    pointF2.y = pointF.y;
                } else if (pointF.x < pointF2.x) {
                    pointF.y = pointF2.y;
                }
            }
            for (int i9 = 1; i9 < pointFArr.length; i9++) {
                PointF pointF3 = pointFArr[i9];
                PointF pointF4 = pointFArr[i9 - 1];
                if (pointF3.x > pointF4.x) {
                    pointF3.y = pointF4.y;
                } else if (pointF3.x < pointF4.x) {
                    pointF4.y = pointF3.y;
                }
            }
            ?? A00 = A00(pointFArr2, f5, true);
            ?? A002 = A00(pointFArr, f5, false);
            pathA0V.moveTo(((PointF) A00.get(0)).x, ((PointF) A00.get(0)).y);
            for (int i10 = 1; i10 < A00.size(); i10++) {
                pathA0V.lineTo(((PointF) A00.get(i10)).x, ((PointF) A00.get(i10)).y);
            }
            for (int iA0I = AbstractC7607F5u.A0I(A002, 1); iA0I >= 0; iA0I--) {
                pathA0V.lineTo(((PointF) A002.get(iA0I)).x, ((PointF) A002.get(iA0I)).y);
            }
            pathA0V.close();
        }
        this.A01 = arrayListA0h3;
        Paint paintA0U = AbstractC7607F5u.A0U(1);
        this.A00 = paintA0U;
        paintA0U.setColor(i);
        paintA0U.setStyle(Paint.Style.FILL_AND_STROKE);
        paintA0U.setPathEffect(new CornerPathEffect(f5));
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        Iterator<Path> it = this.A01.iterator();
        while (it.hasNext()) {
            canvas.drawPath(it.next(), this.A00);
        }
    }

    public static List<PointF> A00(PointF[] pointFArr, float f, boolean z) {
        ArrayList arrayListA0h = C3cG.A0h();
        Collections.addAll(arrayListA0h, pointFArr);
        int i = 0;
        while (i < (arrayListA0h.size() / 2) - 1) {
            int i2 = i * 2;
            PointF pointF = (PointF) arrayListA0h.get(i2);
            PointF pointF2 = (PointF) arrayListA0h.get(i2 + 1);
            PointF pointF3 = (PointF) arrayListA0h.get(i2 + 2);
            PointF pointF4 = (PointF) arrayListA0h.get(i2 + 3);
            if (C8j3.A01(pointF2.x, pointF3.x) < f) {
                arrayListA0h.remove(pointF2);
                arrayListA0h.remove(pointF3);
                float f2 = pointF.x;
                float f3 = pointF4.x;
                float fMax = z ? Math.max(f2, f3) : Math.min(f2, f3);
                pointF4.x = fMax;
                pointF.x = fMax;
                i--;
            }
            i++;
        }
        return arrayListA0h;
    }
}
