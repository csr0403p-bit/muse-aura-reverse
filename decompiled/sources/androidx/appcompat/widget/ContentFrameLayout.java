package androidx.appcompat.widget;

import X.AbstractC7607F5u;
import X.C8093FSz;
import X.C8243FaJ;
import X.C8249FaR;
import X.C8254Faa;
import X.C8308Fba;
import X.InterfaceC8305FbX;
import X.InterfaceC8352FcQ;
import X.LayoutInflaterFactory2C8250FaT;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class ContentFrameLayout extends FrameLayout {
    public InterfaceC8352FcQ A00;
    public TypedValue A01;
    public TypedValue A02;
    public TypedValue A03;
    public TypedValue A04;
    public TypedValue A05;
    public TypedValue A06;
    public final Rect A07;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        TypedValue typedValue = this.A01;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        this.A01 = typedValueA0Z;
        return typedValueA0Z;
    }

    public TypedValue getFixedHeightMinor() {
        TypedValue typedValue = this.A02;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        this.A02 = typedValueA0Z;
        return typedValueA0Z;
    }

    public TypedValue getFixedWidthMajor() {
        TypedValue typedValue = this.A03;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        this.A03 = typedValueA0Z;
        return typedValueA0Z;
    }

    public TypedValue getFixedWidthMinor() {
        TypedValue typedValue = this.A04;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        this.A04 = typedValueA0Z;
        return typedValueA0Z;
    }

    public TypedValue getMinWidthMajor() {
        TypedValue typedValue = this.A05;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        this.A05 = typedValueA0Z;
        return typedValueA0Z;
    }

    public TypedValue getMinWidthMinor() {
        TypedValue typedValue = this.A06;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        this.A06 = typedValueA0Z;
        return typedValueA0Z;
    }

    public void setAttachListener(InterfaceC8352FcQ interfaceC8352FcQ) {
        this.A00 = interfaceC8352FcQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C8243FaJ c8243FaJ;
        super.onDetachedFromWindow();
        InterfaceC8352FcQ interfaceC8352FcQ = this.A00;
        if (interfaceC8352FcQ != null) {
            LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = ((C8308Fba) interfaceC8352FcQ).A00;
            InterfaceC8305FbX interfaceC8305FbX = layoutInflaterFactory2C8250FaT.A0M;
            if (interfaceC8305FbX != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC8305FbX;
                ActionBarOverlayLayout.A01(actionBarOverlayLayout);
                ActionMenuView actionMenuView = ((C8254Faa) actionBarOverlayLayout.A03).A09.A0A;
                if (actionMenuView != null && (c8243FaJ = actionMenuView.A04) != null) {
                    c8243FaJ.A01();
                }
            }
            if (layoutInflaterFactory2C8250FaT.A0A != null) {
                layoutInflaterFactory2C8250FaT.A09.getDecorView().removeCallbacks(layoutInflaterFactory2C8250FaT.A0P);
                if (layoutInflaterFactory2C8250FaT.A0A.isShowing()) {
                    try {
                        layoutInflaterFactory2C8250FaT.A0A.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C8250FaT.A0A = null;
            }
            C8093FSz c8093FSz = layoutInflaterFactory2C8250FaT.A0N;
            if (c8093FSz != null) {
                c8093FSz.A01();
            }
            C8249FaR c8249FaR = layoutInflaterFactory2C8250FaT.A0P(0).A0A;
            if (c8249FaR != null) {
                c8249FaR.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.getContext()
            android.util.DisplayMetrics r6 = X.C60Q.A0B(r0)
            int r1 = r6.widthPixels
            int r0 = r6.heightPixels
            boolean r10 = X.C8j3.A1T(r1, r0)
            int r7 = android.view.View.MeasureSpec.getMode(r12)
            int r4 = android.view.View.MeasureSpec.getMode(r13)
            r5 = 6
            r2 = 5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto Lcf
            if (r10 == 0) goto Lcb
            android.util.TypedValue r8 = r11.A04
        L24:
            if (r8 == 0) goto Lcf
            int r0 = r8.type
            if (r0 == 0) goto Lcf
            if (r0 != r2) goto Lc0
            float r0 = r8.getDimension(r6)
        L30:
            int r9 = (int) r0
            if (r9 <= 0) goto Lcf
            android.graphics.Rect r0 = r11.A07
            int r8 = r0.left
            int r0 = r0.right
            int r8 = r8 + r0
            int r9 = r9 - r8
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = java.lang.Math.min(r9, r0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r9 = 1
        L48:
            if (r4 != r1) goto L71
            if (r10 == 0) goto Lbd
            android.util.TypedValue r4 = r11.A01
        L4e:
            if (r4 == 0) goto L71
            int r0 = r4.type
            if (r0 == 0) goto L71
            if (r0 != r2) goto Lb3
            float r0 = r4.getDimension(r6)
        L5a:
            int r8 = (int) r0
            if (r8 <= 0) goto L71
            android.graphics.Rect r0 = r11.A07
            int r4 = r0.top
            int r0 = r0.bottom
            int r4 = r4 + r0
            int r8 = r8 - r4
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            int r0 = java.lang.Math.min(r8, r0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L71:
            super.onMeasure(r12, r13)
            int r4 = r11.getMeasuredWidth()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            if (r9 != 0) goto La3
            if (r7 != r1) goto La3
            if (r10 == 0) goto Lb0
            android.util.TypedValue r1 = r11.A06
        L83:
            if (r1 == 0) goto La3
            int r0 = r1.type
            if (r0 == 0) goto La3
            if (r0 != r2) goto La4
            float r0 = r1.getDimension(r6)
        L8f:
            int r2 = (int) r0
            if (r2 <= 0) goto L9a
            android.graphics.Rect r0 = r11.A07
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r2 = r2 - r1
        L9a:
            if (r4 >= r2) goto La3
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            super.onMeasure(r0, r13)
        La3:
            return
        La4:
            if (r0 != r5) goto Lae
            int r0 = r6.widthPixels
            float r0 = (float) r0
            float r0 = r1.getFraction(r0, r0)
            goto L8f
        Lae:
            r2 = 0
            goto L9a
        Lb0:
            android.util.TypedValue r1 = r11.A05
            goto L83
        Lb3:
            if (r0 != r5) goto L71
            int r0 = r6.heightPixels
            float r0 = (float) r0
            float r0 = r4.getFraction(r0, r0)
            goto L5a
        Lbd:
            android.util.TypedValue r4 = r11.A02
            goto L4e
        Lc0:
            if (r0 != r5) goto Lcf
            int r0 = r6.widthPixels
            float r0 = (float) r0
            float r0 = r8.getFraction(r0, r0)
            goto L30
        Lcb:
            android.util.TypedValue r8 = r11.A03
            goto L24
        Lcf:
            r9 = 0
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = AbstractC7607F5u.A0X();
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
