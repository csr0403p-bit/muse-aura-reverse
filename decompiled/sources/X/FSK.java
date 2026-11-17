package X;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes6.dex */
public final class FSK extends FSJ {
    public boolean A00;
    public final /* synthetic */ FTN A01;
    public final /* synthetic */ FSF A02;
    public final /* synthetic */ boolean A03;

    @Override // X.FSJ, X.AbstractC8094FTa
    public final void A03(View view, C8101FTo c8101FTo) {
        AnonymousClass002.A1A(view, 0, c8101FTo);
        int[] iArrA06 = this.A02.A06(view, this.A01);
        int iCeil = (int) Math.ceil(A05(Math.max(Math.abs(iArrA06[0]), Math.abs(iArrA06[1]))) / 0.3356d);
        if (iCeil > 0) {
            int i = iArrA06[0];
            int i2 = iArrA06[1];
            DecelerateInterpolator decelerateInterpolator = ((FSJ) this).A06;
            c8101FTo.A02 = i;
            c8101FTo.A03 = i2;
            c8101FTo.A01 = iCeil;
            c8101FTo.A05 = decelerateInterpolator;
            c8101FTo.A06 = true;
        }
    }

    @Override // X.FSJ, X.AbstractC8094FTa
    public final void A04(C8101FTo c8101FTo, C8097FTd c8097FTd, int i, int i2) {
        AnonymousClass002.A1B(c8097FTd, 2, c8101FTo);
        this.A00 = true;
        super.A04(c8101FTo, c8097FTd, i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FSK(Context context, FTN ftn, FSF fsf, boolean z) {
        super(context);
        this.A01 = ftn;
        this.A02 = fsf;
        this.A03 = z;
    }
}
