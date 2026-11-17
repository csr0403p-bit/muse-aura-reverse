package androidx.appcompat.view.menu;

import X.AbstractC7609F5w;
import X.AbstractC8356FcU;
import X.C8165FXh;
import X.C8239FaF;
import X.C8249FaR;
import X.C8252FaX;
import X.FYM;
import X.InterfaceC8332Fbz;
import X.InterfaceC8335Fc2;
import X.InterfaceC8336Fc3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public class ActionMenuItemView extends C8165FXh implements InterfaceC8332Fbz, View.OnClickListener, InterfaceC8335Fc2 {
    public AbstractC8356FcU A00;
    public InterfaceC8336Fc3 A01;
    public C8252FaX A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public FYM A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    private void A00() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A08);
        if (this.A06 != null && ((this.A02.A05 & 4) != 4 || (!this.A09 && !this.A0A))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.A08 : null);
        CharSequence contentDescription = this.A02.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.A02.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.A02.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            setTooltipText(z3 ? null : this.A02.getTitle());
        } else {
            setTooltipText(tooltipText);
        }
    }

    @Override // X.InterfaceC8332Fbz
    public final void ANf(C8252FaX c8252FaX) {
        this.A02 = c8252FaX;
        setIcon(c8252FaX.getIcon());
        setTitle(c8252FaX.getTitleCondensed());
        setId(c8252FaX.getItemId());
        setVisibility(AbstractC7609F5w.A06(c8252FaX.isVisible() ? 1 : 0));
        setEnabled(c8252FaX.isEnabled());
        if (c8252FaX.hasSubMenu() && this.A07 == null) {
            this.A07 = new C8239FaF(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // X.InterfaceC8332Fbz
    public C8252FaX getItemData() {
        return this.A02;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC8336Fc3 interfaceC8336Fc3 = this.A01;
        if (interfaceC8336Fc3 != null) {
            interfaceC8336Fc3.AO1(this.A02);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FYM fym;
        if (this.A02.hasSubMenu() && (fym = this.A07) != null && fym.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            C8252FaX c8252FaX = this.A02;
            if (c8252FaX != null) {
                C8249FaR c8249FaR = c8252FaX.A0B;
                c8249FaR.A0A = true;
                c8249FaR.A0D(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A06 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.A03;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        A00();
    }

    public void setItemInvoker(InterfaceC8336Fc3 interfaceC8336Fc3) {
        this.A01 = interfaceC8336Fc3;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.A05 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC8356FcU abstractC8356FcU) {
        this.A00 = abstractC8356FcU;
    }

    public void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        A00();
    }

    @Override // X.InterfaceC8335Fc2
    public final boolean AR4() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // X.InterfaceC8335Fc2
    public final boolean AR5() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.A02.getIcon() == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r4) {
        /*
            r3 = this;
            super.onConfigurationChanged(r4)
            android.content.Context r0 = r3.getContext()
            android.content.res.Configuration r2 = X.C8j3.A0Z(r0)
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L17
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L18
        L17:
            r0 = 1
        L18:
            r3.A09 = r0
            r3.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // X.C8165FXh, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws ExecutionException, InterruptedException {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.A05) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = this.A04;
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size, iMin);
        }
        if (mode != 1073741824 && iMin > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (z || this.A06 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.A06.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActionMenuItemView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.content.res.Resources r3 = r5.getResources()
            android.content.Context r0 = r4.getContext()
            android.content.res.Configuration r2 = X.C8j3.A0Z(r0)
            int r1 = r2.screenWidthDp
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r0) goto L1b
            int r2 = r2.orientation
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L1c
        L1b:
            r0 = 1
        L1c:
            r4.A09 = r0
            int[] r0 = X.FYT.A02
            r2 = 0
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r0, r7, r2)
            int r0 = r1.getDimensionPixelSize(r2, r2)
            r4.A04 = r0
            r1.recycle()
            android.util.DisplayMetrics r0 = r3.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1107296256(0x42000000, float:32.0)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r4.A03 = r0
            r4.setOnClickListener(r4)
            r0 = -1
            r4.A05 = r0
            r4.setSaveEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
