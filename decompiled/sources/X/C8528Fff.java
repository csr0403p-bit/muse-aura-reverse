package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;

/* renamed from: X.Fff, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8528Fff {
    public static RectF A00(PointF pointF, RectF rectF) {
        float f = rectF.left;
        float f2 = pointF.x;
        float f3 = rectF.top;
        float f4 = pointF.y;
        return new RectF(f + f2, f3 + f4, rectF.right + f2, rectF.bottom + f4);
    }

    public static final C8532Ffj A01(InterfaceC8529Ffg interfaceC8529Ffg, C10467HkR c10467HkR) {
        Size size = c10467HkR.A01;
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        C8530Ffh c8530FfhAiL = interfaceC8529Ffg.AiL();
        float f = c8530FfhAiL.A01;
        float f2 = c8530FfhAiL.A03;
        PointF pointF = new PointF(f, f2);
        RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth() + f + c8530FfhAiL.A02, size.getHeight() + f2 + c8530FfhAiL.A00);
        RectF rectFA00 = A00(pointF, rectF);
        RectF rectFA002 = A00(pointF, interfaceC8529Ffg.AN0(rectF));
        C8530Ffh c8530FfhAgm = interfaceC8529Ffg.Agm();
        C7384Etj.A0Y(c8530FfhAgm, 1);
        return new C8532Ffj(AbstractC7607F5u.A0W(interfaceC8529Ffg.AXu(rectF), pointF), AbstractC7607F5u.A0W(interfaceC8529Ffg.A78(rectF), pointF), rectF2, rectFA00, rectFA002, A00(pointF, new RectF(rectF.left + c8530FfhAgm.A01, rectF.top + c8530FfhAgm.A03, rectF.right - c8530FfhAgm.A02, rectF.bottom - c8530FfhAgm.A00)));
    }
}
