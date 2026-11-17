package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class FH9 {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ FHQ A03;

    public FH9(FHQ fhq) {
        this.A03 = fhq;
    }

    public final void A00() {
        int i;
        if (this.A02 != null) {
            int i2 = this.A00;
            FHQ fhq = this.A03;
            int length = fhq.A04.length;
            while (true) {
                if (i2 >= length) {
                    i = this.A01;
                    break;
                }
                FGF fgf = fhq.A04[i2];
                if (fgf != null) {
                    if (FGF.A00(fgf) == C79.A01) {
                        i = i2 + 1;
                        break;
                    } else if (fgf.A02) {
                        Object obj = fgf.A05;
                        Drawable drawable = obj instanceof Drawable ? (Drawable) obj : null;
                        Canvas canvas = this.A02;
                        if (drawable != null && canvas != null) {
                            drawable.draw(canvas);
                        }
                    }
                }
                i2++;
            }
            this.A00 = i;
        }
    }
}
