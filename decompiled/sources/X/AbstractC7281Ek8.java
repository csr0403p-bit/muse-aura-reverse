package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ek8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7281Ek8 extends Drawable implements Drawable.Callback, InterfaceC7291EkI, InterfaceC7293EkK {
    public static final Matrix A03 = BV4.A08();
    public Drawable A00;
    public InterfaceC7291EkI A01;
    public final C7283EkA A02 = new C7283EkA();

    @Override // X.InterfaceC7291EkI
    public final void AJq(RectF rectF) {
        InterfaceC7291EkI interfaceC7291EkI = this.A01;
        if (interfaceC7291EkI != null) {
            interfaceC7291EkI.AJq(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // X.InterfaceC7291EkI
    public final void ALx(Matrix matrix) {
        Matrix matrix2;
        if (this instanceof C7242EjD) {
            C7242EjD c7242EjD = (C7242EjD) this;
            C7384Etj.A0Y(matrix, 0);
            InterfaceC7291EkI interfaceC7291EkI = ((AbstractC7281Ek8) c7242EjD).A01;
            if (interfaceC7291EkI != null) {
                interfaceC7291EkI.ALx(matrix);
            } else {
                matrix.reset();
            }
            Drawable drawable = ((AbstractC7281Ek8) c7242EjD).A00;
            if (drawable != null && (c7242EjD.A01 != drawable.getIntrinsicWidth() || c7242EjD.A00 != drawable.getIntrinsicHeight())) {
                C7242EjD.A00(c7242EjD);
            }
            matrix2 = c7242EjD.A02;
            if (matrix2 == null) {
                return;
            }
        } else {
            if (!(this instanceof C7243EjE)) {
                InterfaceC7291EkI interfaceC7291EkI2 = this.A01;
                if (interfaceC7291EkI2 != null) {
                    interfaceC7291EkI2.ALx(matrix);
                    return;
                } else {
                    matrix.reset();
                    return;
                }
            }
            C7243EjE c7243EjE = (C7243EjE) this;
            C7384Etj.A0Y(matrix, 0);
            InterfaceC7291EkI interfaceC7291EkI3 = ((AbstractC7281Ek8) c7243EjE).A01;
            if (interfaceC7291EkI3 != null) {
                interfaceC7291EkI3.ALx(matrix);
            } else {
                matrix.reset();
            }
            matrix2 = c7243EjE.A00;
            if (matrix2.isIdentity()) {
                return;
            }
        }
        matrix.preConcat(matrix2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.A00;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A00;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.A00 = i;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C7283EkA c7283EkA = this.A02;
        c7283EkA.A03 = colorFilter;
        c7283EkA.A04 = AnonymousClass002.A1X(colorFilter);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.A02.A01 = z ? 1 : 0;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.A02.A02 = z ? 1 : 0;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public AbstractC7281Ek8(Drawable drawable) {
        this.A00 = drawable;
        AbstractC7294EkL.A00(this, drawable, this);
    }

    @Override // X.InterfaceC7293EkK
    public final void Af3(InterfaceC7291EkI interfaceC7291EkI) {
        this.A01 = interfaceC7291EkI;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.A00;
        return drawable != null ? drawable.setVisible(z, z2) : visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
