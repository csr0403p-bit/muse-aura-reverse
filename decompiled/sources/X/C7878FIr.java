package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FIr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7878FIr extends FSI {
    public FSH A00;
    public RecyclerView A01;

    @Override // X.FSF, X.FSO
    public final boolean A02(int i, int i2) {
        FTN ftn;
        FSH fsh;
        int i3;
        View viewA0w;
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null || (ftn = recyclerView.A0H) == null || (i3 = (fsh = this.A00).A00) == -1 || (viewA0w = ftn.A0w(i3)) == null || !fsh.A06(viewA0w, ftn)) {
            return super.A02(i, i2);
        }
        if (!ftn.A1P()) {
            i = i2;
        }
        if (Math.abs(i) <= this.A01.A0w * 5) {
            return false;
        }
        this.A01.A10(new C7879FIs(viewA0w, fsh, FTN.A0Y(viewA0w) + (i > 0 ? 1 : -1)));
        return false;
    }

    @Override // X.FSF
    public final void A05(RecyclerView recyclerView) {
        this.A01 = recyclerView;
        super.A05(recyclerView);
    }
}
