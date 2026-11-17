package androidx.appcompat.widget;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context, null);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int iA09;
        int iA00;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int iA0B = AbstractC7609F5w.A0B(this);
        if (view != null) {
            view.measure(i, 0);
            iA0B += view.getMeasuredHeight();
            iA09 = AbstractC7608F5v.A09(view, 0);
        } else {
            iA09 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iA00 = A00(view2);
            measuredHeight = view2.getMeasuredHeight() - iA00;
            iA0B += iA00;
            iA09 = AbstractC7608F5v.A09(view2, iA09);
        } else {
            iA00 = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(AbstractC7607F5u.A0D(size, iA0B, 0), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            iA0B += measuredHeight2;
            iA09 = AbstractC7608F5v.A09(view3, iA09);
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - iA0B;
        if (view2 != null) {
            int i5 = iA0B - iA00;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iA00 += iMin;
            }
            AbstractC7608F5v.A1E(view2, iA00, 1073741824, i);
            iA0B = i5 + view2.getMeasuredHeight();
            iA09 = AbstractC7608F5v.A09(view2, iA09);
        }
        if (view3 != null && i4 > 0) {
            AbstractC7608F5v.A1E(view3, measuredHeight2 + i4, mode, i);
            iA0B = (iA0B - measuredHeight2) + view3.getMeasuredHeight();
            iA09 = AbstractC7608F5v.A09(view3, iA09);
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + AbstractC7609F5w.A09(this), i, iA09), View.resolveSizeAndState(iA0B, i2, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt3.getLayoutParams();
                    if (layoutParams.width == -1) {
                        int i8 = layoutParams.height;
                        layoutParams.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i2, 0);
                        layoutParams.height = i8;
                    }
                }
            }
        }
    }

    public static int A00(View view) {
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight <= 0) {
            minimumHeight = 0;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() == 1) {
                    return A00(viewGroup.getChildAt(0));
                }
            }
        }
        return minimumHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            int r13 = r14.getPaddingLeft()
            int r0 = r18 - r16
            int r12 = X.AbstractC7607F5u.A0F(r14, r0)
            int r0 = r0 - r13
            int r11 = X.AbstractC7607F5u.A0F(r14, r0)
            int r2 = r14.getMeasuredHeight()
            int r4 = r14.getChildCount()
            int r3 = r14.A06
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            r0 = 16
            if (r1 == r0) goto L9c
            r0 = 80
            if (r1 == r0) goto L92
            int r1 = r14.getPaddingTop()
        L2b:
            android.graphics.drawable.Drawable r0 = r14.A0A
            r7 = 0
            if (r0 != 0) goto L8d
            r10 = 0
        L31:
            if (r7 >= r4) goto La8
            android.view.View r8 = r14.getChildAt(r7)
            if (r8 == 0) goto L7b
            int r2 = r8.getVisibility()
            r0 = 8
            if (r2 == r0) goto L7b
            int r6 = r8.getMeasuredWidth()
            int r9 = r8.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r2 = r5.gravity
            if (r2 >= 0) goto L54
            r2 = r3
        L54:
            int r0 = r14.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r2, r0)
            r2 = r0 & 7
            r0 = 1
            if (r2 == r0) goto L81
            r0 = 5
            if (r2 == r0) goto L7e
            int r2 = r5.leftMargin
            int r2 = r2 + r13
        L67:
            boolean r0 = r14.A03(r7)
            if (r0 == 0) goto L6e
            int r1 = r1 + r10
        L6e:
            int r0 = r5.topMargin
            int r1 = r1 + r0
            int r6 = r6 + r2
            int r0 = r9 + r1
            r8.layout(r2, r1, r6, r0)
            int r0 = r5.bottomMargin
            int r9 = r9 + r0
            int r1 = r1 + r9
        L7b:
            int r7 = r7 + 1
            goto L31
        L7e:
            int r2 = r12 - r6
            goto L89
        L81:
            int r0 = r11 - r6
            int r2 = r0 / 2
            int r2 = r2 + r13
            int r0 = r5.leftMargin
            int r2 = r2 + r0
        L89:
            int r0 = r5.rightMargin
            int r2 = r2 - r0
            goto L67
        L8d:
            int r10 = r0.getIntrinsicHeight()
            goto L31
        L92:
            int r1 = r14.getPaddingTop()
            int r1 = r1 + r19
            int r1 = r1 - r17
            int r1 = r1 - r2
            goto L2b
        L9c:
            int r1 = r14.getPaddingTop()
            int r19 = r19 - r17
            int r19 = r19 - r2
            int r0 = r19 / 2
            int r1 = r1 + r0
            goto L2b
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
