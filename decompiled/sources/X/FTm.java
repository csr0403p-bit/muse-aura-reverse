package X;

import android.view.View;

/* loaded from: classes6.dex */
public abstract class FTm {
    public static int A00(View view, View view2, AbstractC8085FSq abstractC8085FSq, FTN ftn, C8097FTd c8097FTd, boolean z) {
        if (ftn.A0h() == 0 || c8097FTd.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return AbstractC7607F5u.A0B(FTN.A0Y(view), FTN.A0Y(view2)) + 1;
        }
        return Math.min(abstractC8085FSq.A05(), abstractC8085FSq.A06(view2) - abstractC8085FSq.A09(view));
    }

    public static int A01(View view, View view2, AbstractC8085FSq abstractC8085FSq, FTN ftn, C8097FTd c8097FTd, boolean z) {
        int iA00;
        if (ftn.A0h() == 0 || (iA00 = c8097FTd.A00()) == 0 || view == null || view2 == null) {
            return 0;
        }
        return z ? (int) (((abstractC8085FSq.A06(view2) - abstractC8085FSq.A09(view)) / (AbstractC7607F5u.A0B(FTN.A0Y(view), FTN.A0Y(view2)) + 1)) * c8097FTd.A00()) : iA00;
    }

    public static int A02(View view, View view2, AbstractC8085FSq abstractC8085FSq, FTN ftn, C8097FTd c8097FTd, boolean z, boolean z2) {
        if (ftn.A0h() == 0 || c8097FTd.A00() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c8097FTd.A00() - Math.max(FTN.A0Y(view), FTN.A0Y(view2))) - 1) : Math.max(0, Math.min(FTN.A0Y(view), FTN.A0Y(view2)));
        if (z) {
            return Math.round((iMax * (AbstractC7607F5u.A0B(abstractC8085FSq.A06(view2), abstractC8085FSq.A09(view)) / (AbstractC7607F5u.A0B(FTN.A0Y(view), FTN.A0Y(view2)) + 1))) + (abstractC8085FSq.A04() - abstractC8085FSq.A09(view)));
        }
        return iMax;
    }
}
