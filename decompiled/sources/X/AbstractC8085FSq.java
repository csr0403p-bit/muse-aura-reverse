package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.FSq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8085FSq {
    public int A00 = Integer.MIN_VALUE;
    public final Rect A01 = AbstractC7607F5u.A0X();
    public final FTN A02;

    public static AbstractC8085FSq A00(FTN ftn, int i) {
        if (i == 0) {
            return new C8084FSp(ftn);
        }
        if (i == 1) {
            return new C8083FSo(ftn);
        }
        throw C60O.A0i("invalid orientation");
    }

    public final int A01() {
        return this instanceof C8083FSo ? this.A02.A00 : this.A02.A03;
    }

    public final int A02() {
        int i;
        int iA0l;
        if (this instanceof C8083FSo) {
            FTN ftn = this.A02;
            i = ftn.A00;
            iA0l = ftn.A0j();
        } else {
            FTN ftn2 = this.A02;
            i = ftn2.A03;
            iA0l = ftn2.A0l();
        }
        return i - iA0l;
    }

    public final int A03() {
        return this instanceof C8083FSo ? this.A02.A01 : this.A02.A04;
    }

    public final int A04() {
        return this instanceof C8083FSo ? this.A02.A0m() : this.A02.A0k();
    }

    public final int A05() {
        int iA0k;
        int iA0l;
        boolean z = this instanceof C8083FSo;
        FTN ftn = this.A02;
        if (z) {
            iA0k = ftn.A00 - ftn.A0m();
            iA0l = ftn.A0j();
        } else {
            iA0k = ftn.A03 - ftn.A0k();
            iA0l = ftn.A0l();
        }
        return iA0k - iA0l;
    }

    public final int A06(View view) {
        int right;
        int i;
        boolean z = this instanceof C8083FSo;
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        if (z) {
            right = view.getBottom() + FTf.A00(view).bottom;
            i = marginLayoutParamsA0e.bottomMargin;
        } else {
            right = view.getRight() + FTf.A00(view).right;
            i = marginLayoutParamsA0e.rightMargin;
        }
        return right + i;
    }

    public final int A07(View view) {
        boolean z = this instanceof C8083FSo;
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        Rect rectA00 = FTf.A00(view);
        return z ? AbstractC7609F5w.A0C(marginLayoutParamsA0e, view.getMeasuredHeight() + rectA00.top, rectA00.bottom) : AbstractC7608F5v.A0A(marginLayoutParamsA0e, view.getMeasuredWidth() + rectA00.left + rectA00.right);
    }

    public final int A08(View view) {
        boolean z = this instanceof C8083FSo;
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        Rect rectA00 = FTf.A00(view);
        return z ? AbstractC7608F5v.A0A(marginLayoutParamsA0e, view.getMeasuredWidth() + rectA00.left + rectA00.right) : AbstractC7609F5w.A0C(marginLayoutParamsA0e, view.getMeasuredHeight() + rectA00.top, rectA00.bottom);
    }

    public final int A09(View view) {
        int left;
        int i;
        boolean z = this instanceof C8083FSo;
        ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(view);
        if (z) {
            left = view.getTop() - FTf.A00(view).top;
            i = marginLayoutParamsA0e.topMargin;
        } else {
            left = view.getLeft() - FTf.A00(view).left;
            i = marginLayoutParamsA0e.leftMargin;
        }
        return left - i;
    }

    public final int A0A(View view) {
        boolean z = this instanceof C8083FSo;
        FTN ftn = this.A02;
        if (z) {
            Rect rect = this.A01;
            ftn.A17(rect, view);
            return rect.bottom;
        }
        Rect rect2 = this.A01;
        ftn.A17(rect2, view);
        return rect2.right;
    }

    public final int A0B(View view) {
        boolean z = this instanceof C8083FSo;
        FTN ftn = this.A02;
        if (z) {
            Rect rect = this.A01;
            ftn.A17(rect, view);
            return rect.top;
        }
        Rect rect2 = this.A01;
        ftn.A17(rect2, view);
        return rect2.left;
    }

    public final void A0C(int i) {
        if (this instanceof C8083FSo) {
            this.A02.A12(i);
        } else {
            this.A02.A11(i);
        }
    }

    public AbstractC8085FSq(FTN ftn) {
        this.A02 = ftn;
    }
}
