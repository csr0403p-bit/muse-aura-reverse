package androidx.appcompat.widget;

import X.FYT;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean A00;
    public int A01;
    public boolean A02;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = -1;
        int[] iArr = FYT.A0A;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.A02 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.A02);
        }
    }

    private void setStacked(boolean z) {
        if (this.A00 != z) {
            if (!z || this.A02) {
                this.A00 = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            if (!z && this.A00) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099 A[EDGE_INSN: B:48:0x0099->B:36:0x0099 BREAK  A[LOOP:0: B:24:0x004b->B:44:0x00b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            boolean r0 = r5.A02
            r3 = 0
            if (r0 == 0) goto L16
            int r0 = r5.A01
            if (r2 <= r0) goto L14
            boolean r0 = r5.A00
            if (r0 == 0) goto L14
            r5.setStacked(r3)
        L14:
            r5.A01 = r2
        L16:
            boolean r0 = r5.A00
            r4 = 1
            if (r0 != 0) goto Lb7
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto Lb7
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r2 = 1
        L2a:
            super.onMeasure(r0, r7)
            boolean r0 = r5.A02
            if (r0 == 0) goto Lb4
            boolean r0 = r5.A00
            if (r0 != 0) goto Lb4
            int r1 = r5.getMeasuredWidthAndState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto Lb4
            r5.setStacked(r4)
        L43:
            super.onMeasure(r6, r7)
        L46:
            r4 = 0
            int r1 = r5.getChildCount()
        L4b:
            if (r4 >= r1) goto L99
            android.view.View r0 = r5.getChildAt(r4)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb1
            if (r4 < 0) goto L99
            android.view.View r0 = r5.getChildAt(r4)
            android.view.ViewGroup$MarginLayoutParams r2 = X.AbstractC7607F5u.A0e(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r3 = X.AbstractC7609F5w.A0C(r2, r1, r0)
            boolean r0 = r5.A00
            if (r0 == 0) goto Lab
            int r2 = r4 + 1
            int r1 = r5.getChildCount()
        L77:
            if (r2 >= r1) goto L99
            android.view.View r0 = r5.getChildAt(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto La8
            if (r2 < 0) goto L99
            android.view.View r0 = r5.getChildAt(r2)
            int r2 = r0.getPaddingTop()
            android.util.DisplayMetrics r0 = X.AbstractC7609F5w.A0S(r5)
            float r1 = r0.density
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = r2 + r0
            int r3 = r3 + r2
        L99:
            int r0 = r5.getMinimumHeight()
            if (r0 == r3) goto La7
            r5.setMinimumHeight(r3)
            if (r7 != 0) goto La7
            super.onMeasure(r6, r7)
        La7:
            return
        La8:
            int r2 = r2 + 1
            goto L77
        Lab:
            int r0 = r5.getPaddingBottom()
            int r3 = r3 + r0
            goto L99
        Lb1:
            int r4 = r4 + 1
            goto L4b
        Lb4:
            if (r2 == 0) goto L46
            goto L43
        Lb7:
            r0 = r6
            r2 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
