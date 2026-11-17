package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FIM {
    public final C7764FDr<RenderContext> A00;
    public final InterfaceC7751FDd<RenderContext> A01;
    public final boolean A02;
    public final C7856FHs A03;

    public FIM(C7856FHs c7856FHs, C7764FDr c7764FDr, InterfaceC7751FDd interfaceC7751FDd, boolean z) {
        this.A01 = interfaceC7751FDd;
        this.A00 = c7764FDr;
        this.A03 = c7856FHs;
        this.A02 = z;
    }

    public static final int A00(float f, float f2) {
        int iA01;
        int i;
        if (!Float.isNaN(f) && f == f2) {
            iA01 = Ab3.A01(f);
            i = 1073741824;
        } else {
            if (Float.isNaN(f2)) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            iA01 = Ab3.A01(f2);
            i = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(iA01, i);
    }
}
