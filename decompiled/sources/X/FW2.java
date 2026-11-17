package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public abstract class FW2 extends FrameLayout {
    public static final View.OnTouchListener A07 = new FWB();
    public int A00;
    public ColorStateList A01;
    public FWN A02;
    public FWO A03;
    public PorterDuff.Mode A04;
    public final float A05;
    public final float A06;

    public FW2(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC8218FZl.A00(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, FX0.A0J);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.A00 = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.A06 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC8141FWe.A00(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(FWA.A00(PorterDuff.Mode.SRC_IN, typedArrayObtainStyledAttributes.getInt(5, -1)));
        this.A05 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(A07);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen._name_removed__res_0x7f070004);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(FWP.A00(this.A06, FWM.A01(this, R.attr._name_removed__res_0x7f040139), FWM.A01(this, R.attr._name_removed__res_0x7f040132)));
            ColorStateList colorStateList = this.A01;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.A05;
    }

    public int getAnimationMode() {
        return this.A00;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.A06;
    }

    public void setAnimationMode(int i) {
        this.A00 = i;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.A01 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.A01);
            drawable.setTintMode(this.A04);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.A01 = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.A04);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.A04 = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(FWN fwn) {
        this.A02 = fwn;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : A07);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(FWO fwo) {
        this.A03 = fwo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FWN fwn = this.A02;
        if (fwn != null) {
            FW1 fw1 = ((FWD) fwn).A00;
            WindowInsets rootWindowInsets = fw1.A0E.getRootWindowInsets();
            if (rootWindowInsets != null) {
                fw1.A02 = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                FW1.A01(fw1);
            }
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        FW8 fw8;
        super.onDetachedFromWindow();
        FWN fwn = this.A02;
        if (fwn != null) {
            FWD fwd = (FWD) fwn;
            FW1 fw1 = fwd.A00;
            FW5 fw5A00 = FW5.A00();
            FVe fVe = fw1.A07;
            synchronized (fw5A00.A03) {
                z = FW5.A03(fVe, fw5A00) || !((fw8 = fw5A00.A01) == null || fVe == null || fw8.A02.get() != fVe);
            }
            if (z) {
                FW1.A0H.post(new FW9(fwd));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        FWO fwo = this.A03;
        if (fwo != null) {
            FW1 fw1 = ((FWE) fwo).A00;
            fw1.A0E.A03 = null;
            FW1.A00(fw1);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw F60.createAndThrow();
    }
}
