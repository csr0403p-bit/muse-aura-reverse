package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class G3d {
    public G3e A00 = new G3e();
    public final G3f A01;

    public final View A00(int i, int i2, int i3, int i4) {
        G3f g3f = this.A01;
        int iAIb = g3f.AIb();
        int iAIZ = g3f.AIZ();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewADX = g3f.ADX(i);
            int iADa = g3f.ADa(viewADX);
            int iADZ = g3f.ADZ(viewADX);
            G3e g3e = this.A00;
            g3e.A04 = iAIb;
            g3e.A03 = iAIZ;
            g3e.A02 = iADa;
            g3e.A01 = iADZ;
            g3e.A00 = 0;
            g3e.A00 = i3;
            if (g3e.A00()) {
                return viewADX;
            }
            if (i4 != 0) {
                g3e.A00 = 0;
                g3e.A00 = i4;
                if (g3e.A00()) {
                    view = viewADX;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean A01(View view) {
        G3e g3e = this.A00;
        G3f g3f = this.A01;
        int iAIb = g3f.AIb();
        int iAIZ = g3f.AIZ();
        int iADa = g3f.ADa(view);
        int iADZ = g3f.ADZ(view);
        g3e.A04 = iAIb;
        g3e.A03 = iAIZ;
        g3e.A02 = iADa;
        g3e.A01 = iADZ;
        g3e.A00 = 0;
        g3e.A00 = 24579;
        return g3e.A00();
    }

    public G3d(G3f g3f) {
        this.A01 = g3f;
    }
}
