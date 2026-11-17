package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ffd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8526Ffd implements InterfaceC8529Ffg {
    public final InterfaceC8529Ffg A00;
    public final List A01;

    @Override // X.InterfaceC8529Ffg
    public final void A9G(Canvas canvas, RectF rectF) {
        C7384Etj.A0Y(rectF, 1);
        InterfaceC8529Ffg interfaceC8529Ffg = this.A00;
        Path pathAQH = interfaceC8529Ffg.AQH(rectF);
        List<C8527Ffe> list = this.A01;
        for (C8527Ffe c8527Ffe : list) {
            C8531Ffi c8531Ffi = c8527Ffe.A01;
            int i = c8531Ffi.A02;
            if (Color.alpha(i) != 0 && pathAQH != null) {
                canvas.save();
                Paint paint = c8527Ffe.A00;
                paint.setColor(i);
                paint.setMaskFilter(null);
                PointF pointF = c8531Ffi.A03;
                paint.setShadowLayer(8.0f * 0.5f, pointF.x, pointF.y, i);
                canvas.drawPath(pathAQH, paint);
                paint.clearShadowLayer();
                canvas.restore();
            }
        }
        interfaceC8529Ffg.A9G(canvas, rectF);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // X.InterfaceC8529Ffg
    public final Path AQH(RectF rectF) {
        C7384Etj.A0Y(rectF, 0);
        return this.A00.AQH(rectF);
    }

    @Override // X.InterfaceC8529Ffg
    public final PointF A78(RectF rectF) {
        return this.A00.A78(rectF);
    }

    @Override // X.InterfaceC8529Ffg
    public final RectF AN0(RectF rectF) {
        return this.A00.AN0(rectF);
    }

    @Override // X.InterfaceC8529Ffg
    public final PointF AXu(RectF rectF) {
        return this.A00.AXu(rectF);
    }

    @Override // X.InterfaceC8529Ffg
    public final C8530Ffh Agm() {
        List list = this.A01;
        C8530Ffh c8530Ffh = C8530Ffh.A04;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
            c8530Ffh = new C8530Ffh(c8530Ffh.A03 + 0.0f, c8530Ffh.A01 + 0.0f, c8530Ffh.A00 + 0.0f, c8530Ffh.A02 + 0.0f);
        }
        return c8530Ffh;
    }

    @Override // X.InterfaceC8529Ffg
    public final C8530Ffh AiL() {
        C8530Ffh c8530Ffh;
        List list = this.A01;
        C8530Ffh c8530Ffh2 = C8530Ffh.A04;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8531Ffi c8531Ffi = ((C8527Ffe) it.next()).A01;
            if (Color.alpha(c8531Ffi.A02) != 0) {
                float f = 8.0f * 0.5f;
                PointF pointF = c8531Ffi.A03;
                float f2 = pointF.x;
                float f3 = pointF.y;
                c8530Ffh = new C8530Ffh(f - Math.min(0.0f, f3), f - Math.min(0.0f, f2), f + Math.max(0.0f, f3), Math.max(0.0f, f2) + f);
            } else {
                c8530Ffh = c8530Ffh2;
            }
            c8530Ffh2 = new C8530Ffh(c8530Ffh2.A03 + c8530Ffh.A03, c8530Ffh2.A01 + c8530Ffh.A01, c8530Ffh2.A00 + c8530Ffh.A00, c8530Ffh2.A02 + c8530Ffh.A02);
        }
        return c8530Ffh2;
    }

    public C8526Ffd(InterfaceC8529Ffg interfaceC8529Ffg, List list) {
        this.A00 = interfaceC8529Ffg;
        this.A01 = list;
    }
}
