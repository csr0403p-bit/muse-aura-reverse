package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import java.io.IOException;
import kotlin.Deprecated;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.FWi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8144FWi extends Drawable implements Drawable.Callback {
    public final Drawable A01;
    public final Rect A02 = AbstractC7607F5u.A0X();
    public float A00 = 1.0f;

    public static Drawable A00(C8144FWi c8144FWi, Object obj) {
        C7384Etj.A0Y(obj, 0);
        return c8144FWi.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        int iA02 = Ab3.A02(rect.width(), this.A00);
        int iA022 = Ab3.A02(rect.height(), this.A00);
        Rect rect2 = this.A02;
        Drawable drawable = this.A01;
        Gravity.apply(17, iA02, iA022, rect, rect2, drawable.getLayoutDirection());
        drawable.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C7384Etj.A0Y(runnable, 1);
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C7384Etj.A0Y(runnable, 1);
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.A01.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.A01.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A01.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.A01.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.A01.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.A01.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable current = this.A01.getCurrent();
        C7384Etj.A0U(current);
        return current;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return this.A01.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.A01.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.A01.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return this.A01.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final Insets getOpticalInsets() {
        Insets opticalInsets = this.A01.getOpticalInsets();
        C7384Etj.A0U(opticalInsets);
        return opticalInsets;
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        int[] state = this.A01.getState();
        C7384Etj.A0U(state);
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.A01.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        return this.A01.hasFocusStateSpecified();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.A01.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.A01.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isFilterBitmap() {
        return this.A01.isFilterBitmap();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.A01.isProjected();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.A01.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.A01.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.A01.mutate();
        Drawable drawableMutate = super.mutate();
        C7384Etj.A0U(drawableMutate);
        return drawableMutate;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return this.A01.onLayoutDirectionChanged(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.A01.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.A01.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.A01.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final void setDither(boolean z) {
        this.A01.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.A01.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.A01.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.A01.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.A01.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.A01.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.A01.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return this.A01.setVisible(z, z2);
    }

    public C8144FWi(Drawable drawable) {
        this.A01 = drawable;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        A00(this, theme).applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        A00(this, canvas).draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        A00(this, rect).getHotspotBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        A00(this, outline).getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return A00(this, rect).getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        AnonymousClass005.A0x(resources, xmlPullParser, attributeSet);
        this.A01.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean state = A00(this, iArr).setState(iArr);
        if (state) {
            Rect bounds = getBounds();
            C7384Etj.A0U(bounds);
            onBoundsChange(bounds);
        }
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        A00(this, runnable).scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return A00(this, iArr).setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        A00(this, runnable).unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        AnonymousClass005.A0x(resources, xmlPullParser, attributeSet);
        this.A01.inflate(resources, xmlPullParser, attributeSet);
    }
}
