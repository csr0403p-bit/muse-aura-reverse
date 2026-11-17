package X;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class I0I extends FSJ {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0I(Context context, Object obj, int i) {
        super(context);
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.FSJ, X.AbstractC8094FTa
    public final void A03(View view, C8101FTo c8101FTo) {
        FSF fsf;
        RecyclerView recyclerView;
        switch (this.$t) {
            case 0:
                fsf = (FSF) this.A00;
                recyclerView = fsf.A01;
                break;
            case 1:
                fsf = (FSF) this.A00;
                recyclerView = fsf.A01;
                if (recyclerView == null) {
                    return;
                }
                break;
            default:
                super.A03(view, c8101FTo);
                return;
        }
        int[] iArrA06 = fsf.A06(view, recyclerView.A0H);
        int i = iArrA06[0];
        int i2 = iArrA06[1];
        int iCeil = (int) Math.ceil(A05(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = ((FSJ) this).A06;
            c8101FTo.A02 = i;
            c8101FTo.A03 = i2;
            c8101FTo.A01 = iCeil;
            c8101FTo.A05 = decelerateInterpolator;
            c8101FTo.A06 = true;
        }
    }

    @Override // X.FSJ
    public final int A05(int i) {
        return this.$t != 0 ? super.A05(i) : Math.min(100, super.A05(i));
    }
}
