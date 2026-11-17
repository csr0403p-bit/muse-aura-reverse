package X;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Fam, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8264Fam {
    public Interpolator A01;
    public FT0 A02;
    public boolean A03;
    public long A00 = -1;
    public final AbstractC8334Fc1 A05 = new I0F(this);
    public final ArrayList<C8093FSz> A04 = C3cG.A0h();

    public final void A00() {
        if (this.A03) {
            Iterator<C8093FSz> it = this.A04.iterator();
            while (it.hasNext()) {
                it.next().A01();
            }
            this.A03 = false;
        }
    }

    public final void A01() {
        View viewA00;
        if (this.A03) {
            return;
        }
        Iterator<C8093FSz> it = this.A04.iterator();
        while (it.hasNext()) {
            C8093FSz next = it.next();
            long j = this.A00;
            if (j >= 0) {
                next.A03(j);
            }
            Interpolator interpolator = this.A01;
            if (interpolator != null && (viewA00 = C8093FSz.A00(next)) != null) {
                viewA00.animate().setInterpolator(interpolator);
            }
            if (this.A02 != null) {
                next.A04(this.A05);
            }
            View viewA002 = C8093FSz.A00(next);
            if (viewA002 != null) {
                viewA002.animate().start();
            }
        }
        this.A03 = true;
    }
}
