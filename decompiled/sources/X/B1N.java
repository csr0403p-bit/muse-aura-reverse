package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class B1N extends AbstractC1718Ap2 implements C13s, FPU {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Window A04;
    public final MutableState A05;

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    @Override // X.AbstractC1718Ap2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1N.A0D(int, int):void");
    }

    @Override // X.AbstractC1718Ap2
    public final void A0F(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int paddingLeft2 = getPaddingLeft() + ((((i3 - i) - measuredWidth) - paddingLeft) / 2);
            int paddingTop2 = getPaddingTop() + ((((i4 - i2) - measuredHeight) - paddingTop) / 2);
            childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
        }
    }

    @Override // X.C13s
    public final Window AMm() {
        return this.A04;
    }

    @Override // X.AbstractC1718Ap2
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A02;
    }

    @Override // X.FPU
    public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
        if (!this.A00) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c8497Ff4.A00.A0A(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c8497Ff4;
    }

    public B1N(Context context, Window window) {
        super(context);
        this.A04 = window;
        this.A05 = AbstractC1798ArH.A06(C8kE.A00);
        AbstractC8082FSn.A00(this, this);
        C8490Fex.A01(this, new B1O(this));
    }
}
