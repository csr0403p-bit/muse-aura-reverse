package com.google.android.material.button;

import X.AbstractC4103Cmd;
import X.AbstractC7607F5u;
import X.AbstractC8141FWe;
import X.AbstractC8218FZl;
import X.BV5;
import X.C3cG;
import X.C60O;
import X.C8152FWr;
import X.C8166FXi;
import X.FW7;
import X.FWA;
import X.FWf;
import X.FX0;
import X.FXD;
import X.FXK;
import X.FXL;
import X.I15;
import X.InterfaceC8153FWv;
import X.InterfaceC8155FWx;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public class MaterialButton extends C8166FXi implements InterfaceC8153FWv, Checkable {
    public static final int[] A0D = {R.attr.state_checkable};
    public static final int[] A0E = {R.attr.state_checked};
    public int A00;
    public Drawable A01;
    public InterfaceC8155FWx A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public boolean A09;
    public boolean A0A;
    public final C8152FWr A0B;
    public final LinkedHashSet<OnCheckedChangeListener> A0C;

    public MaterialButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (0 != 0) {
            throw new NullPointerException("this$0");
        }
        super.setPressed(z);
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new I15(6);
        public boolean A00;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    private void A00(int i, int i2) {
        if (this.A01 == null || getLayout() == null) {
            return;
        }
        int i3 = this.A00;
        boolean z = true;
        if (i3 != 1 && i3 != 2) {
            z = false;
        }
        if (z || i3 == 3 || i3 == 4) {
            this.A06 = 0;
            if (i3 == 1 || i3 == 3) {
                this.A03 = 0;
            } else {
                int intrinsicWidth = this.A05;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.A01.getIntrinsicWidth();
                }
                int textWidth = (((((i - getTextWidth()) - getPaddingEnd()) - intrinsicWidth) - this.A04) - getPaddingStart()) / 2;
                if (BV5.A1O(getLayoutDirection(), 1) != (this.A00 == 4)) {
                    textWidth = -textWidth;
                }
                if (this.A03 == textWidth) {
                    return;
                } else {
                    this.A03 = textWidth;
                }
            }
        } else {
            if (i3 != 16 && i3 != 32) {
                return;
            }
            this.A03 = 0;
            if (i3 == 16) {
                this.A06 = 0;
            } else {
                int intrinsicHeight = this.A05;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.A01.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.A04) - getPaddingBottom()) / 2;
                if (this.A06 == textHeight) {
                    return;
                } else {
                    this.A06 = textHeight;
                }
            }
        }
        A01(false);
    }

    private void A01(boolean z) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.A01 = drawableMutate;
            drawableMutate.setTintList(this.A07);
            PorterDuff.Mode mode = this.A08;
            if (mode != null) {
                this.A01.setTintMode(mode);
            }
            int intrinsicWidth = this.A05;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.A01.getIntrinsicWidth();
            }
            int intrinsicHeight = this.A05;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.A01.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A01;
            int i = this.A03;
            int i2 = this.A06;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        }
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            int i3 = this.A00;
            if ((i3 != 1 && i3 != 2) || drawable3 == this.A01) {
                if (i3 == 3 || i3 == 4) {
                    if (drawable5 == this.A01) {
                        return;
                    }
                } else if ((i3 != 16 && i3 != 32) || drawable4 == this.A01) {
                    return;
                }
            }
        }
        int i4 = this.A00;
        boolean z2 = true;
        if (i4 != 1 && i4 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.A01, null, null, null);
            return;
        }
        if (i4 == 3 || i4 == 4) {
            setCompoundDrawablesRelative(null, null, this.A01, null);
        } else if (i4 == 16 || i4 == 32) {
            setCompoundDrawablesRelative(null, this.A01, null, null);
        }
    }

    private boolean A02() {
        C8152FWr c8152FWr = this.A0B;
        return (c8152FWr == null || c8152FWr.A0E) ? false : true;
    }

    private String getA11yClassName() {
        C8152FWr c8152FWr = this.A0B;
        return ((c8152FWr == null || !c8152FWr.A0F) ? Button.class : CompoundButton.class).getName();
    }

    public Drawable getIcon() {
        return this.A01;
    }

    public int getIconGravity() {
        return this.A00;
    }

    public int getIconPadding() {
        return this.A04;
    }

    public int getIconSize() {
        return this.A05;
    }

    public ColorStateList getIconTint() {
        return this.A07;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public int getInsetBottom() {
        return this.A0B.A02;
    }

    public int getInsetTop() {
        return this.A0B.A05;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A0A;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C8152FWr c8152FWr = this.A0B;
        if (c8152FWr != null && c8152FWr.A0F) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A0D);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A0E);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        setChecked(savedState.A00);
    }

    @Override // X.C8166FXi, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? FWf.A01(this, i) : null);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C8152FWr c8152FWr = this.A0B;
        if (c8152FWr == null || !c8152FWr.A0F || !isEnabled() || this.A0A == z) {
            return;
        }
        this.A0A = z;
        refreshDrawableState();
        if (this.A09) {
            return;
        }
        this.A09 = true;
        Iterator<OnCheckedChangeListener> it = this.A0C.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("this$0");
        }
        this.A09 = false;
    }

    public void setIcon(Drawable drawable) {
        if (this.A01 != drawable) {
            this.A01 = drawable;
            A01(true);
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? FWf.A01(this, i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw C60O.A0i("iconSize cannot be less than 0");
        }
        if (this.A05 != i) {
            this.A05 = i;
            A01(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            A01(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.A08 != mode) {
            this.A08 = mode;
            A01(false);
        }
    }

    public void setInsetBottom(int i) {
        C8152FWr c8152FWr = this.A0B;
        C8152FWr.A04(c8152FWr, c8152FWr.A05, i);
    }

    public void setInsetTop(int i) {
        C8152FWr c8152FWr = this.A0B;
        C8152FWr.A04(c8152FWr, i, c8152FWr.A02);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC8155FWx interfaceC8155FWx) {
        this.A02 = interfaceC8155FWx;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.A0A);
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rectA0X = AbstractC7607F5u.A0X();
        paint.getTextBounds(string, 0, string.length(), rectA0X);
        return Math.min(rectA0X.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (A02()) {
            return this.A0B.A00;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (A02()) {
            return this.A0B.A08;
        }
        return null;
    }

    public FXK getShapeAppearanceModel() {
        if (A02()) {
            return this.A0B.A0D;
        }
        throw C3cG.A0Q("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (A02()) {
            return this.A0B.A09;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (A02()) {
            return this.A0B.A06;
        }
        return 0;
    }

    @Override // X.C8166FXi
    public ColorStateList getSupportBackgroundTintList() {
        return A02() ? this.A0B.A07 : super.getSupportBackgroundTintList();
    }

    @Override // X.C8166FXi
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return A02() ? this.A0B.A0A : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (A02()) {
            FXD.A00(this, C8152FWr.A00(this.A0B, false));
        }
    }

    @Override // X.C8166FXi, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @Override // X.C8166FXi, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = r2.getA11yClassName()
            r3.setClassName(r0)
            X.FWr r0 = r2.A0B
            if (r0 == 0) goto L13
            boolean r1 = r0.A0F
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            r3.setCheckable(r0)
            boolean r0 = r2.isChecked()
            r3.setChecked(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.A00 = this.A0A;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
    }

    @Override // X.C8166FXi, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!A02()) {
            super.setBackgroundColor(i);
            return;
        }
        C8152FWr c8152FWr = this.A0B;
        if (C8152FWr.A00(c8152FWr, false) != null) {
            C8152FWr.A00(c8152FWr, false).setTint(i);
        }
    }

    @Override // X.C8166FXi, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!A02()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C8152FWr c8152FWr = this.A0B;
        c8152FWr.A0E = true;
        MaterialButton materialButton = c8152FWr.A0I;
        materialButton.setSupportBackgroundTintList(c8152FWr.A07);
        materialButton.setSupportBackgroundTintMode(c8152FWr.A0A);
        super.setBackgroundDrawable(drawable);
    }

    public void setCheckable(boolean z) {
        if (A02()) {
            this.A0B.A0F = z;
        }
    }

    public void setCornerRadius(int i) {
        if (A02()) {
            C8152FWr c8152FWr = this.A0B;
            if (c8152FWr.A0G && c8152FWr.A00 == i) {
                return;
            }
            c8152FWr.A00 = i;
            c8152FWr.A0G = true;
            FXL fxl = new FXL(c8152FWr.A0D);
            FXL.A00(fxl, i);
            c8152FWr.A05(new FXK(fxl));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (A02()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (A02()) {
            C8152FWr.A00(this.A0B, false).A08(f);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC4103Cmd.A03(getContext(), i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (A02()) {
            C8152FWr c8152FWr = this.A0B;
            if (c8152FWr.A08 != colorStateList) {
                c8152FWr.A08 = colorStateList;
                MaterialButton materialButton = c8152FWr.A0I;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (A02()) {
            setRippleColor(AbstractC4103Cmd.A03(getContext(), i));
        }
    }

    @Override // X.InterfaceC8153FWv
    public void setShapeAppearanceModel(FXK fxk) {
        if (!A02()) {
            throw C3cG.A0Q("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.A0B.A05(fxk);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (A02()) {
            C8152FWr c8152FWr = this.A0B;
            c8152FWr.A0H = z;
            C8152FWr.A03(c8152FWr);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (A02()) {
            C8152FWr c8152FWr = this.A0B;
            if (c8152FWr.A09 != colorStateList) {
                c8152FWr.A09 = colorStateList;
                C8152FWr.A03(c8152FWr);
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (A02()) {
            setStrokeColor(AbstractC4103Cmd.A03(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (A02()) {
            C8152FWr c8152FWr = this.A0B;
            if (c8152FWr.A06 != i) {
                c8152FWr.A06 = i;
                C8152FWr.A03(c8152FWr);
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (A02()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // X.C8166FXi
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!A02()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C8152FWr c8152FWr = this.A0B;
        if (c8152FWr.A07 != colorStateList) {
            c8152FWr.A07 = colorStateList;
            if (C8152FWr.A00(c8152FWr, false) != null) {
                C8152FWr.A00(c8152FWr, false).setTintList(c8152FWr.A07);
            }
        }
    }

    @Override // X.C8166FXi
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!A02()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C8152FWr c8152FWr = this.A0B;
        if (c8152FWr.A0A != mode) {
            c8152FWr.A0A = mode;
            if (C8152FWr.A00(c8152FWr, false) == null || c8152FWr.A0A == null) {
                return;
            }
            C8152FWr.A00(c8152FWr, false).setTintMode(c8152FWr.A0A);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC8218FZl.A00(context, attributeSet, i, com.facebook.aura.R.style._name_removed__res_0x7f130111), attributeSet, i);
        this.A0C = C3cG.A0k();
        this.A0A = false;
        this.A09 = false;
        Context context2 = getContext();
        TypedArray typedArrayA00 = FW7.A00(context2, attributeSet, FX0.A07, i, com.facebook.aura.R.style._name_removed__res_0x7f130111);
        this.A04 = typedArrayA00.getDimensionPixelSize(12, 0);
        int i2 = typedArrayA00.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.A08 = FWA.A00(mode, i2);
        this.A07 = AbstractC8141FWe.A00(context2, typedArrayA00, 14);
        this.A01 = AbstractC8141FWe.A01(context2, typedArrayA00, 10);
        this.A00 = typedArrayA00.getInteger(11, 1);
        this.A05 = typedArrayA00.getDimensionPixelSize(13, 0);
        C8152FWr c8152FWr = new C8152FWr(this, new FXK(FXK.A02(context2, attributeSet, i, com.facebook.aura.R.style._name_removed__res_0x7f130111)));
        this.A0B = c8152FWr;
        c8152FWr.A03 = typedArrayA00.getDimensionPixelOffset(1, 0);
        c8152FWr.A04 = typedArrayA00.getDimensionPixelOffset(2, 0);
        c8152FWr.A05 = typedArrayA00.getDimensionPixelOffset(3, 0);
        c8152FWr.A02 = typedArrayA00.getDimensionPixelOffset(4, 0);
        if (typedArrayA00.hasValue(8)) {
            int dimensionPixelSize = typedArrayA00.getDimensionPixelSize(8, -1);
            c8152FWr.A00 = dimensionPixelSize;
            FXL fxl = new FXL(c8152FWr.A0D);
            FXL.A00(fxl, dimensionPixelSize);
            c8152FWr.A05(new FXK(fxl));
            c8152FWr.A0G = true;
        }
        c8152FWr.A06 = typedArrayA00.getDimensionPixelSize(20, 0);
        c8152FWr.A0A = FWA.A00(mode, typedArrayA00.getInt(7, -1));
        MaterialButton materialButton = c8152FWr.A0I;
        Context context3 = materialButton.getContext();
        c8152FWr.A07 = AbstractC8141FWe.A00(context3, typedArrayA00, 6);
        c8152FWr.A09 = AbstractC8141FWe.A00(context3, typedArrayA00, 19);
        c8152FWr.A08 = AbstractC8141FWe.A00(context3, typedArrayA00, 16);
        c8152FWr.A0F = typedArrayA00.getBoolean(5, false);
        c8152FWr.A01 = typedArrayA00.getDimensionPixelSize(9, 0);
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        if (typedArrayA00.hasValue(0)) {
            c8152FWr.A0E = true;
            materialButton.setSupportBackgroundTintList(c8152FWr.A07);
            materialButton.setSupportBackgroundTintMode(c8152FWr.A0A);
        } else {
            C8152FWr.A02(c8152FWr);
        }
        materialButton.setPaddingRelative(paddingStart + c8152FWr.A03, paddingTop + c8152FWr.A05, paddingEnd + c8152FWr.A04, paddingBottom + c8152FWr.A02);
        typedArrayA00.recycle();
        setCompoundDrawablePadding(this.A04);
        A01(this.A01 != null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.aura.R.attr._name_removed__res_0x7f0403bf);
    }
}
