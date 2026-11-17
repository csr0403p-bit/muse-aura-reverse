package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class FSH {
    public int A00;
    public Float A01;
    public Integer A02;
    public FSM A03;
    public FSM A04;

    public final int[] A07(View view, FTN ftn) {
        int[] iArr = new int[2];
        if (ftn.A1P()) {
            iArr[0] = A01(view, A03(ftn), ftn);
        } else {
            iArr[0] = 0;
        }
        if (ftn.A1Q()) {
            iArr[1] = A01(view, A04(ftn), ftn);
        } else {
            iArr[1] = 0;
        }
        this.A00 = FTN.A0Y(view);
        return iArr;
    }

    private int A00(View view, AbstractC8085FSq abstractC8085FSq, FTN ftn) {
        int top;
        int height;
        Integer num = this.A02;
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return abstractC8085FSq.A09(view);
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return abstractC8085FSq.A06(view);
            }
            throw C60Q.A0U("Invalid gravity :", FKB.A00(num));
        }
        if (ftn.A1P()) {
            top = view.getLeft();
            height = view.getWidth();
        } else {
            top = view.getTop();
            height = view.getHeight();
        }
        return top + (height / 2);
    }

    private int A02(AbstractC8085FSq abstractC8085FSq, FTN ftn) {
        Integer num = this.A02;
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            Float f = this.A01;
            RecyclerView recyclerView = ftn.A07;
            if (recyclerView == null || !recyclerView.A0R) {
                return 0;
            }
            return abstractC8085FSq.A04() + Math.round(f.floatValue());
        }
        if (iIntValue == 1) {
            RecyclerView recyclerView2 = ftn.A07;
            return ((recyclerView2 == null || !recyclerView2.A0R) ? 0 : abstractC8085FSq.A04()) + (abstractC8085FSq.A05() / 2);
        }
        if (iIntValue != 2) {
            throw C60Q.A0U("Invalid gravity :", FKB.A00(num));
        }
        RecyclerView recyclerView3 = ftn.A07;
        return (recyclerView3 == null || !recyclerView3.A0R) ? abstractC8085FSq.A01() : abstractC8085FSq.A02();
    }

    private AbstractC8085FSq A03(FTN ftn) {
        FSM fsm = this.A03;
        if (fsm == null || fsm.A01 != ftn) {
            fsm = new FSM(new C8084FSp(ftn), ftn);
            this.A03 = fsm;
        }
        return fsm.A00;
    }

    private AbstractC8085FSq A04(FTN ftn) {
        FSM fsm = this.A04;
        if (fsm == null || fsm.A01 != ftn) {
            fsm = new FSM(new C8083FSo(ftn), ftn);
            this.A04 = fsm;
        }
        return fsm.A00;
    }

    private final int A01(View view, AbstractC8085FSq abstractC8085FSq, FTN ftn) {
        int iA00 = A00(view, abstractC8085FSq, ftn) - A02(abstractC8085FSq, ftn);
        if (abstractC8085FSq.A07(view) <= abstractC8085FSq.A05()) {
            return iA00;
        }
        int iA09 = abstractC8085FSq.A09(view);
        RecyclerView recyclerView = ftn.A07;
        return iA09 - ((recyclerView == null || !recyclerView.A0R) ? 0 : abstractC8085FSq.A04());
    }

    public final View A05(FTN ftn) {
        View viewA0w;
        AbstractC8085FSq abstractC8085FSqA03 = ftn.A1P() ? A03(ftn) : A04(ftn);
        int i = this.A00;
        if (i != -1 && (viewA0w = ftn.A0w(i)) != null && abstractC8085FSqA03.A07(viewA0w) > abstractC8085FSqA03.A05()) {
            return null;
        }
        int iA0h = ftn.A0h();
        View view = null;
        if (iA0h == 0) {
            return null;
        }
        if (this.A02 == C79.A01 && (ftn instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ftn;
            View viewA0O = LinearLayoutManager.A0O(linearLayoutManager, 0, linearLayoutManager.A0h(), true, false);
            if (viewA0O == null || FTN.A0Y(viewA0O) != 0) {
                View viewA0O2 = LinearLayoutManager.A0O(linearLayoutManager, linearLayoutManager.A0h() - 1, -1, true, false);
                iA0h = (viewA0O2 != null ? FTN.A0Y(viewA0O2) : -1) == ftn.A0i() + (-1) ? ftn.A0h() - 1 : 0;
            }
            return ftn.A0x(iA0h);
        }
        int iA02 = A02(abstractC8085FSqA03, ftn);
        int i2 = Integer.MAX_VALUE;
        while (iA0h < iA0h) {
            View viewA0x = ftn.A0x(iA0h);
            int iA0B = AbstractC7607F5u.A0B(A00(viewA0x, abstractC8085FSqA03, ftn), iA02);
            if (iA0B < i2) {
                view = viewA0x;
                i2 = iA0B;
            }
            iA0h++;
        }
        return view;
    }

    public final boolean A06(View view, FTN ftn) {
        AbstractC8085FSq abstractC8085FSqA03 = ftn.A1P() ? A03(ftn) : A04(ftn);
        if (abstractC8085FSqA03.A07(view) <= abstractC8085FSqA03.A05()) {
            return false;
        }
        int iA09 = abstractC8085FSqA03.A09(view);
        int iA06 = abstractC8085FSqA03.A06(view);
        RecyclerView recyclerView = ftn.A07;
        int iA04 = (recyclerView == null || !recyclerView.A0R) ? 0 : abstractC8085FSqA03.A04();
        RecyclerView recyclerView2 = ftn.A07;
        return iA09 <= iA04 && iA06 >= ((recyclerView2 == null || !recyclerView2.A0R) ? abstractC8085FSqA03.A01() : abstractC8085FSqA03.A02());
    }
}
