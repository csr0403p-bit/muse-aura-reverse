package X;

import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
public final class B1O extends AbstractC8493Ff0 {
    public final /* synthetic */ B1N A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1O(B1N b1n) {
        super(1);
        this.A00 = b1n;
    }

    @Override // X.AbstractC8493Ff0
    public final C8492Fez A03(C8492Fez c8492Fez, C8490Fex c8490Fex) {
        B1N b1n = this.A00;
        if (!b1n.A00) {
            View childAt = b1n.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, b1n.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, b1n.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                C8345FcJ c8345FcJA00 = C8345FcJ.A00(iMax, iMax2, iMax3, iMax4);
                C8345FcJ c8345FcJ = c8492Fez.A00;
                int i = c8345FcJA00.A01;
                int i2 = c8345FcJA00.A03;
                int i3 = c8345FcJA00.A02;
                int i4 = c8345FcJA00.A00;
                return new C8492Fez(C8497Ff4.A00(c8345FcJ, i, i2, i3, i4), C8497Ff4.A00(c8492Fez.A01, i, i2, i3, i4));
            }
        }
        return c8492Fez;
    }

    @Override // X.AbstractC8493Ff0
    public final C8497Ff4 A04(C8497Ff4 c8497Ff4, List<C8490Fex> list) {
        B1N b1n = this.A00;
        if (!b1n.A00) {
            View childAt = b1n.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, b1n.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, b1n.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c8497Ff4.A00.A0A(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c8497Ff4;
    }
}
