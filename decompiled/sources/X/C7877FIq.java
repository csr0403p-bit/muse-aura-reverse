package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FIq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7877FIq extends FSG {
    public FSH A00;
    public RecyclerView A01;

    @Override // X.FSF, X.FSO
    public final boolean A02(int i, int i2) {
        FTN ftn;
        View viewA05;
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null || (ftn = recyclerView.A0H) == null || (viewA05 = this.A00.A05(ftn)) == null || !this.A00.A06(viewA05, ftn)) {
            return super.A02(i, i2);
        }
        return false;
    }

    @Override // X.FSF
    public final void A05(RecyclerView recyclerView) {
        this.A01 = recyclerView;
        super.A05(recyclerView);
    }
}
