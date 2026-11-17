package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes4.dex */
public abstract class BOf {
    public static final AVy A00(BFM bfm, int i, int i2) {
        Drawable drawableA9k;
        Object b9h;
        BBI bbi = (BBI) bfm;
        Context context = (Context) AKO.A08(AndroidCompositionLocals_androidKt.A01, BBI.A04(bbi));
        BRn bRn = (BRn) AKO.A08(BPD.A00, BBI.A04(bbi));
        bfm.AgE(-82959130);
        BBI.A0R(bbi, false);
        boolean zA65 = bfm.A65(bRn) | ((((i2 & 14) ^ 6) > 4 && bfm.A63(i)) || (i2 & 6) == 4);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            try {
                drawableA9k = bRn.A9k(context, i);
            } catch (Resources.NotFoundException unused) {
            }
            if (drawableA9k == null) {
                objAaT = C2263BMw.A00;
            } else if (drawableA9k instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawableA9k).getBitmap();
                C7384Etj.A0U(bitmap);
                B1T b1t = new B1T(bitmap);
                b1t.A00.prepareToDraw();
                objAaT = new C05202ad(b1t, (r1.getHeight() & 4294967295L) | (r1.getWidth() << 32));
            } else {
                if (drawableA9k instanceof ColorDrawable) {
                    long j = B6A.A01;
                    b9h = new C0zI(((ColorDrawable) drawableA9k).getColor() << 32);
                } else {
                    Drawable drawableMutate = drawableA9k.mutate();
                    C7384Etj.A0U(drawableMutate);
                    b9h = new B9H(drawableMutate);
                }
                objAaT = (AVy) b9h;
            }
            bfm.Ai0(objAaT);
        }
        return (AVy) objAaT;
    }
}
