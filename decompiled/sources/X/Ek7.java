package X;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public abstract class Ek7 extends Drawable implements Drawable.Callback, InterfaceC7291EkI, InterfaceC7293EkK {
    public InterfaceC7291EkI A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Drawable[] A06;
    public final C7283EkA A05 = new C7283EkA();
    public final Rect A04 = new Rect();

    @Override // X.InterfaceC7291EkI
    public final void AJq(RectF rectF) {
        C7384Etj.A0Y(rectF, 0);
        InterfaceC7291EkI interfaceC7291EkI = this.A00;
        if (interfaceC7291EkI != null) {
            interfaceC7291EkI.AJq(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // X.InterfaceC7291EkI
    public final void ALx(Matrix matrix) {
        C7384Etj.A0Y(matrix, 0);
        InterfaceC7291EkI interfaceC7291EkI = this.A00;
        if (interfaceC7291EkI != null) {
            interfaceC7291EkI.ALx(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.A04;
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C7384Etj.A0Y(rect, 0);
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                drawable.setBounds(rect);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        C7384Etj.A0Y(iArr, 0);
        boolean z = false;
        for (Drawable drawable : this.A06) {
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C7384Etj.A0Y(runnable, 1);
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C7384Etj.A0Y(runnable, 1);
        unscheduleSelf(runnable);
    }

    public final Drawable A01(int i) {
        Drawable[] drawableArr = this.A06;
        if (i < drawableArr.length) {
            return drawableArr[i];
        }
        throw C60O.A0i("Failed requirement.");
    }

    public final void A02(Drawable drawable, int i) {
        if (i < 0) {
            throw C60O.A0i("Failed requirement.");
        }
        Drawable[] drawableArr = this.A06;
        if (i >= drawableArr.length) {
            throw C60O.A0i("Failed requirement.");
        }
        if (drawable != drawableArr[i]) {
            if (drawable != null && this.A02) {
                drawable.mutate();
            }
            AbstractC7294EkL.A00(null, drawableArr[i], null);
            AbstractC7294EkL.A00(null, drawable, null);
            C7283EkA c7283EkA = this.A05;
            if (drawable != null && c7283EkA != null) {
                c7283EkA.A00(drawable);
            }
            AbstractC7294EkL.A01(drawable, this);
            AbstractC7294EkL.A00(this, drawable, this);
            this.A03 = false;
            drawableArr[i] = drawable;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int iMax = -1;
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int iMax = -1;
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable[] drawableArr = this.A06;
        int length = drawableArr.length;
        int iResolveOpacity = -2;
        if (length != 0) {
            iResolveOpacity = -1;
            for (int i = 1; i < length; i++) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
                }
            }
        }
        return iResolveOpacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.A03) {
            this.A01 = false;
            boolean z = false;
            Drawable[] drawableArr = this.A06;
            int length = drawableArr.length;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                if (drawable == null || !drawable.isStateful()) {
                    z2 = false;
                }
                boolean z3 = z2 | z;
                this.A01 = z3;
                z = z3;
                i++;
            }
            this.A03 = true;
        }
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                drawable.mutate();
            }
        }
        this.A02 = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = false;
        for (Drawable drawable : this.A06) {
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C7283EkA c7283EkA = this.A05;
        c7283EkA.A03 = colorFilter;
        c7283EkA.A04 = AnonymousClass002.A1X(colorFilter);
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.A05.A01 = z ? 1 : 0;
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.A05.A02 = z ? 1 : 0;
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
        }
    }

    public Ek7(Drawable[] drawableArr) {
        this.A06 = drawableArr;
        int i = 0;
        while (true) {
            Drawable[] drawableArr2 = this.A06;
            if (i >= 4) {
                return;
            }
            AbstractC7294EkL.A00(this, drawableArr2[i], this);
            i++;
        }
    }

    @Override // X.InterfaceC7293EkK
    public final void Af3(InterfaceC7291EkI interfaceC7291EkI) {
        this.A00 = interfaceC7291EkI;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        for (Drawable drawable : this.A06) {
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
        }
        return visible;
    }
}
