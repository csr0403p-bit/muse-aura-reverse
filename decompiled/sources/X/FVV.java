package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes6.dex */
public abstract class FVV extends ImageButton implements InterfaceC8153FWv {
    public abstract CoordinatorLayout.Behavior<FVV> getBehavior();

    public abstract float getCompatElevation();

    public abstract float getCompatHoveredFocusedTranslationZ();

    public abstract float getCompatPressedTranslationZ();

    public abstract Drawable getContentBackground();

    public abstract int getCustomSize();

    public abstract int getExpandedComponentIdHint();

    public abstract FWQ getHideMotionSpec();

    @Deprecated
    public abstract int getRippleColor();

    public abstract ColorStateList getRippleColorStateList();

    public abstract FXK getShapeAppearanceModel();

    public abstract FWQ getShowMotionSpec();

    public abstract int getSize();

    public abstract int getSizeDimension();

    public abstract ColorStateList getSupportBackgroundTintList();

    public abstract PorterDuff.Mode getSupportBackgroundTintMode();

    public abstract ColorStateList getSupportImageTintList();

    public abstract PorterDuff.Mode getSupportImageTintMode();

    public abstract boolean getUseCompatPadding();

    public abstract void setCompatElevation(float f);

    public abstract void setCompatElevationResource(int i);

    public abstract void setCompatHoveredFocusedTranslationZ(float f);

    public abstract void setCompatHoveredFocusedTranslationZResource(int i);

    public abstract void setCompatPressedTranslationZ(float f);

    public abstract void setCompatPressedTranslationZResource(int i);

    public abstract void setCustomSize(int i);

    public abstract void setEnsureMinTouchTargetSize(boolean z);

    public abstract void setExpandedComponentIdHint(int i);

    public abstract void setHideMotionSpec(FWQ fwq);

    public abstract void setHideMotionSpecResource(int i);

    public abstract void setRippleColor(int i);

    public abstract void setRippleColor(ColorStateList colorStateList);

    public abstract void setShadowPaddingEnabled(boolean z);

    @Override // X.InterfaceC8153FWv
    public abstract void setShapeAppearanceModel(FXK fxk);

    public abstract void setShowMotionSpec(FWQ fwq);

    public abstract void setShowMotionSpecResource(int i);

    public abstract void setSize(int i);

    public abstract void setSupportBackgroundTintList(ColorStateList colorStateList);

    public abstract void setSupportBackgroundTintMode(PorterDuff.Mode mode);

    public abstract void setSupportImageTintList(ColorStateList colorStateList);

    public abstract void setSupportImageTintMode(PorterDuff.Mode mode);

    public abstract void setUseCompatPadding(boolean z);

    private FVU getImpl() {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw F60.createAndThrow();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        throw F60.createAndThrow();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        throw F60.createAndThrow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        throw F60.createAndThrow();
    }
}
