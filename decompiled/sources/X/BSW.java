package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* loaded from: classes4.dex */
public final class BSW implements InterfaceC1380AiA {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public BSW(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        if (this.$t != 0) {
            return AXQ.A00(c3tf, this, list, i);
        }
        C1634An9 c1634An9 = (C1634An9) this.A01;
        ViewGroup.LayoutParams layoutParams = c1634An9.getLayoutParams();
        C7384Etj.A0X(layoutParams);
        c1634An9.measure(C1634An9.A01(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c1634An9.getMeasuredHeight();
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return this.$t != 0 ? AXQ.A01(c3tf, this, list, i) : A00((C1634An9) this.A01, 0, i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        int iA00;
        int measuredHeight;
        G0U c2334BUi;
        if (this.$t != 0) {
            ((C1711Aou) this.A01).A00 = (EnumC1820Arj) this.A00;
            return axy.APV(C9jH.A00, new BUU(16), 0, 0);
        }
        C1634An9 c1634An9 = (C1634An9) this.A01;
        if (c1634An9.getChildCount() == 0) {
            iA00 = Constraints.A03(j);
            measuredHeight = Constraints.A02(j);
            c2334BUi = new BUU(12);
        } else {
            int iA03 = Constraints.A03(j);
            if (iA03 != 0) {
                c1634An9.getChildAt(0).setMinimumWidth(iA03);
            }
            int iA02 = Constraints.A02(j);
            if (iA02 != 0) {
                c1634An9.getChildAt(0).setMinimumHeight(iA02);
            }
            int iA01 = Constraints.A01(j);
            ViewGroup.LayoutParams layoutParams = c1634An9.getLayoutParams();
            C7384Etj.A0X(layoutParams);
            iA00 = A00(c1634An9, iA02, Constraints.A00(j), C1634An9.A01(iA03, iA01, layoutParams.width));
            measuredHeight = c1634An9.getMeasuredHeight();
            c2334BUi = new C2334BUi(22, this.A00, c1634An9);
        }
        return AXY.A01(axy, c2334BUi, iA00, measuredHeight);
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicHeight(C3TF c3tf, List<? extends C3Tr> list, int i) {
        if (this.$t != 0) {
            return AXQ.A02(c3tf, this, list, i);
        }
        C1634An9 c1634An9 = (C1634An9) this.A01;
        ViewGroup.LayoutParams layoutParams = c1634An9.getLayoutParams();
        C7384Etj.A0X(layoutParams);
        c1634An9.measure(C1634An9.A01(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c1634An9.getMeasuredHeight();
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        return this.$t != 0 ? AXQ.A03(c3tf, this, list, i) : A00((C1634An9) this.A01, 0, i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static int A00(C1634An9 c1634An9, int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = c1634An9.getLayoutParams();
        C7384Etj.A0X(layoutParams);
        c1634An9.measure(i3, C1634An9.A01(i, i2, layoutParams.height));
        return c1634An9.getMeasuredWidth();
    }
}
