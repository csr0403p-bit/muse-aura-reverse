package androidx.appcompat.widget;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.BV4;
import X.BV5;
import X.C8140FWd;
import X.C8315Fbh;
import X.FVG;
import X.FYT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes6.dex */
public class LinearLayoutCompat extends ViewGroup {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Drawable A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public int[] A0E;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0B = true;
        this.A01 = -1;
        this.A02 = 0;
        this.A06 = 8388659;
        int[] iArr = FYT.A0D;
        C8140FWd c8140FWd = new C8140FWd(context, context.obtainStyledAttributes(attributeSet, iArr, 0, 0));
        TypedArray typedArray = c8140FWd.A02;
        saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, 0);
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        if (!typedArray.getBoolean(2, true)) {
            this.A0B = false;
        }
        this.A00 = typedArray.getFloat(4, -1.0f);
        this.A01 = typedArray.getInt(3, -1);
        this.A0C = typedArray.getBoolean(7, false);
        setDividerDrawable(c8140FWd.A02(5));
        this.A08 = typedArray.getInt(8, 0);
        this.A04 = typedArray.getDimensionPixelSize(6, 0);
        typedArray.recycle();
    }

    public final boolean A03(int i) {
        int i2;
        if (i == 0) {
            i2 = this.A08 & 1;
        } else {
            int childCount = getChildCount();
            int i3 = this.A08;
            i2 = i3 & 4;
            if (i != childCount) {
                if ((i3 & 2) != 0) {
                    for (int i4 = i - 1; i4 >= 0; i4--) {
                        if (getChildAt(i4).getVisibility() == 8) {
                        }
                    }
                }
            }
        }
        return i2 != 0;
    }

    public void setWeightSum(float f) {
        this.A00 = Math.max(0.0f, f);
    }

    private final void A01(Canvas canvas, int i) {
        this.A0A.setBounds(getPaddingLeft() + this.A04, i, AbstractC7607F5u.A0F(this, getWidth()) - this.A04, this.A03 + i);
        this.A0A.draw(canvas);
    }

    private final void A02(Canvas canvas, int i) {
        this.A0A.setBounds(i, getPaddingTop() + this.A04, this.A05 + i, AbstractC7609F5w.A0A(this) - this.A04);
        this.A0A.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof FVG;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this instanceof ActionMenuView) {
            C8315Fbh c8315Fbh = new C8315Fbh(-2, -2);
            c8315Fbh.A04 = false;
            ((LinearLayout.LayoutParams) c8315Fbh).gravity = 16;
            return c8315Fbh;
        }
        int i = this.A07;
        if (i == 0) {
            return new FVG(-2, -2);
        }
        if (i == 1) {
            return new FVG(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return this instanceof ActionMenuView ? ((ActionMenuView) this).generateLayoutParams(layoutParams) : ((layoutParams instanceof FVG) || (layoutParams instanceof ViewGroup.MarginLayoutParams)) ? new FVG((ViewGroup.MarginLayoutParams) layoutParams) : new FVG(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.A01 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.A01;
        if (childCount <= i2) {
            throw BV4.A0c("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.A01 != 0) {
                throw BV4.A0c("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int iA0H = this.A02;
        if (this.A07 == 1 && (i = this.A06 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) != 48) {
            if (i == 16) {
                iA0H += (AbstractC7610F5x.A0H(this, AbstractC7607F5u.A0E(this, getBottom())) - this.A09) / 2;
            } else if (i == 80) {
                iA0H = (AbstractC7607F5u.A0E(this, getBottom()) - getPaddingBottom()) - this.A09;
            }
        }
        return iA0H + AbstractC7607F5u.A0e(childAt).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.A01;
    }

    public Drawable getDividerDrawable() {
        return this.A0A;
    }

    public int getDividerPadding() {
        return this.A04;
    }

    public int getDividerWidth() {
        return this.A05;
    }

    public int getGravity() {
        return this.A06;
    }

    public int getOrientation() {
        return this.A07;
    }

    public int getShowDividers() {
        return this.A08;
    }

    public float getWeightSum() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        if (this.A0A != null) {
            if (this.A07 == 1) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt != null && childAt.getVisibility() != 8 && A03(i)) {
                        A01(canvas, (childAt.getTop() - AbstractC7607F5u.A0e(childAt).topMargin) - this.A03);
                    }
                }
                if (A03(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    A01(canvas, childAt2 == null ? AbstractC7609F5w.A0A(this) - this.A03 : childAt2.getBottom() + AbstractC7607F5u.A0e(childAt2).bottomMargin);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean zA1O = BV5.A1O(getLayoutDirection(), 1);
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && A03(i2)) {
                    ViewGroup.MarginLayoutParams marginLayoutParamsA0e = AbstractC7607F5u.A0e(childAt3);
                    A02(canvas, zA1O ? childAt3.getRight() + marginLayoutParamsA0e.rightMargin : (childAt3.getLeft() - marginLayoutParamsA0e.leftMargin) - this.A05);
                }
            }
            if (A03(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParamsA0e2 = AbstractC7607F5u.A0e(childAt4);
                    if (zA1O) {
                        left = childAt4.getLeft();
                        paddingRight = marginLayoutParamsA0e2.leftMargin;
                        right = (left - paddingRight) - this.A05;
                    } else {
                        right = childAt4.getRight() + marginLayoutParamsA0e2.rightMargin;
                    }
                } else if (zA1O) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    paddingRight = getPaddingRight();
                    right = (left - paddingRight) - this.A05;
                }
                A02(canvas, right);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r37, int r38) {
        /*
            Method dump skipped, instructions count: 1693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.A0B = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw BV5.A0S("base aligned child index out of range (0, ", ")", getChildCount());
        }
        this.A01 = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.A0A) {
            this.A0A = drawable;
            boolean z = false;
            if (drawable != null) {
                this.A05 = drawable.getIntrinsicWidth();
                this.A03 = drawable.getIntrinsicHeight();
            } else {
                this.A05 = 0;
                this.A03 = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.A04 = i;
    }

    public void setGravity(int i) {
        if (this.A06 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 0) {
                i |= 48;
            }
            this.A06 = i;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.A0C = z;
    }

    public void setOrientation(int i) {
        if (this.A07 != i) {
            this.A07 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.A08) {
            requestLayout();
        }
        this.A08 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
        int i3 = this.A06;
        if ((i3 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) != i2) {
            this.A06 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A06;
        if ((8388615 & i3) != i2) {
            this.A06 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        boolean z = this instanceof ActionMenuView;
        Context context = getContext();
        if (z) {
            return new C8315Fbh(context, attributeSet);
        }
        return new FVG(context, attributeSet);
    }
}
