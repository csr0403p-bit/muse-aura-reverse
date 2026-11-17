package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class FHT {
    public final /* synthetic */ FHU A00;

    public final boolean A00(FGF fgf) {
        FHU fhu = this.A00;
        Object obj = fgf.A05;
        if (AbstractC7607F5u.A0M(fgf.A01) == fhu.A04.A06 && (obj instanceof View)) {
            fhu.A01 = (View) obj;
        } else if (obj instanceof ViewGroup) {
            FHU.A00((ViewGroup) obj, fhu);
        }
        return fhu.A01 == null;
    }

    public FHT(FHU fhu) {
        this.A00 = fhu;
    }
}
