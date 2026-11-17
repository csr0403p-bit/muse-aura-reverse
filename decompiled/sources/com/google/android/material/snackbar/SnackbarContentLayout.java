package com.google.android.material.snackbar;

import X.FX0;
import X.HsX;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public class SnackbarContentLayout extends LinearLayout implements HsX {
    public Button A00;
    public TextView A01;
    public int A02;
    public int A03;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public Button getActionView() {
        return this.A00;
    }

    public TextView getMessageView() {
        return this.A01;
    }

    public void setMaxInlineActionWidth(int i) {
        this.A02 = i;
    }

    private boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A01.getPaddingTop() == i2 && this.A01.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A01;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.A01 = (TextView) findViewById(R.id.snackbar_text);
        this.A00 = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            int r1 = r6.A03
            if (r1 <= 0) goto L14
            int r0 = r6.getMeasuredWidth()
            if (r0 <= r1) goto L14
            int r7 = X.AbstractC7608F5v.A05(r1)
            super.onMeasure(r7, r8)
        L14:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165227(0x7f07002b, float:1.7944665E38)
            int r5 = r1.getDimensionPixelSize(r0)
            r0 = 2131165226(0x7f07002a, float:1.7944663E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.widget.TextView r0 = r6.A01
            android.text.Layout r0 = r0.getLayout()
            int r0 = r0.getLineCount()
            r3 = 0
            r2 = 1
            if (r0 <= r2) goto L4e
            int r0 = r6.A02
            if (r0 <= 0) goto L4f
            android.widget.Button r0 = r6.A00
            int r1 = r0.getMeasuredWidth()
            int r0 = r6.A02
            if (r1 <= r0) goto L4f
            int r0 = r5 - r4
            boolean r0 = r6.A00(r2, r5, r0)
        L48:
            if (r0 == 0) goto L4d
            super.onMeasure(r7, r8)
        L4d:
            return
        L4e:
            r5 = r4
        L4f:
            boolean r0 = r6.A00(r3, r5, r5)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FX0.A0J);
        this.A03 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.A02 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
