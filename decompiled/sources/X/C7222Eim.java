package X;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: X.Eim, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7222Eim {
    public final InterfaceC7136Egs A00;

    public final void A01(C7242EjD c7242EjD, C7197Ei9 c7197Ei9) {
        C7384Etj.A0Y(c7242EjD, 0);
        InterfaceC8647Fhz interfaceC8647Fhz = ((AbstractC7191Ei2) c7197Ei9).A01;
        C7384Etj.A0Y(interfaceC8647Fhz, 0);
        if (!AbstractC7213Eib.A00(c7242EjD.A04, interfaceC8647Fhz)) {
            c7242EjD.A04 = interfaceC8647Fhz;
            C7242EjD.A00(c7242EjD);
            c7242EjD.invalidateSelf();
        }
        PointF pointF = ((AbstractC7191Ei2) c7197Ei9).A00;
        if (!AbstractC7213Eib.A00(c7242EjD.A03, pointF)) {
            if (pointF == null) {
                c7242EjD.A03 = null;
            } else {
                PointF pointF2 = c7242EjD.A03;
                if (pointF2 == null) {
                    pointF2 = new PointF();
                    c7242EjD.A03 = pointF2;
                }
                pointF2.set(pointF);
            }
            C7242EjD.A00(c7242EjD);
            c7242EjD.invalidateSelf();
        }
        c7242EjD.setColorFilter(c7197Ei9.A05);
    }

    public final Drawable A00(Resources resources, Drawable drawable, C7197Ei9 c7197Ei9) {
        Drawable c7304EkV;
        C7177Ehm c7177Ehm = ((AbstractC7191Ei2) c7197Ei9).A04;
        if (c7177Ehm == null) {
            return drawable;
        }
        if (drawable instanceof BitmapDrawable) {
            c7304EkV = new C7303EkU(resources, ((BitmapDrawable) drawable).getBitmap());
        } else {
            c7304EkV = drawable instanceof NinePatchDrawable ? new C7304EkV(drawable) : drawable instanceof ColorDrawable ? new C7268Ejt(((ColorDrawable) drawable).getColor()) : new C7282Ek9(drawable);
        }
        ((InterfaceC7175Ehk) c7304EkV).AeL(c7177Ehm.A00);
        return c7304EkV;
    }

    public C7222Eim(InterfaceC7136Egs interfaceC7136Egs) {
        this.A00 = interfaceC7136Egs;
    }
}
