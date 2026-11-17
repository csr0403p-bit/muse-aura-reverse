package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class I01 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Hzz A07;
    public final Runnable A08 = new I04(this);

    public static final boolean A00(View view) {
        if (!view.isAccessibilityFocused()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                ADq aDqA0C = ATD.A0C(0, viewGroup.getChildCount());
                if (!(aDqA0C instanceof Collection) || !C3cG.A1N(aDqA0C)) {
                    Iterator<Integer> it = aDqA0C.iterator();
                    while (it.hasNext()) {
                        View childAt = viewGroup.getChildAt(((BNt) it).A00());
                        C7384Etj.A0U(childAt);
                        if (A00(childAt)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public I01(Hzz hzz, int i, boolean z) {
        this.A06 = i;
        this.A07 = hzz;
        this.A02 = z;
        this.A03 = z;
    }
}
