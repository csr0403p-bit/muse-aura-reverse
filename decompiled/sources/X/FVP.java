package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FVP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final View A06;
    public boolean A05 = true;
    public boolean A04 = true;

    public final void A00() {
        View view = this.A06;
        view.offsetTopAndBottom(this.A03 - (view.getTop() - this.A01));
        view.offsetLeftAndRight(this.A02 - (view.getLeft() - this.A00));
    }

    public FVP(View view) {
        this.A06 = view;
    }
}
