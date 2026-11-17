package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: X.FXu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8178FXu extends ImageView {
    public boolean A00;
    public final C8173FXp A01;
    public final C8179FXv A02;

    public ColorStateList getSupportBackgroundTintList() {
        C8173FXp c8173FXp = this.A01;
        if (c8173FXp != null) {
            return C8173FXp.A00(c8173FXp);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C8173FXp c8173FXp = this.A01;
        if (c8173FXp != null) {
            return C8173FXp.A01(c8173FXp);
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C8142FWg c8142FWg;
        C8179FXv c8179FXv = this.A02;
        if (c8179FXv == null || (c8142FWg = c8179FXv.A01) == null) {
            return null;
        }
        return c8142FWg.A00;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C8142FWg c8142FWg;
        C8179FXv c8179FXv = this.A02;
        if (c8179FXv == null || (c8142FWg = c8179FXv.A01) == null) {
            return null;
        }
        return c8142FWg.A01;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.A02.A02.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C8179FXv c8179FXv = this.A02;
        if (c8179FXv != null && drawable != null && !this.A00) {
            c8179FXv.A00 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c8179FXv != null) {
            c8179FXv.A00();
            if (this.A00) {
                return;
            }
            ImageView imageView = c8179FXv.A02;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c8179FXv.A00);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Drawable drawableA01;
        C8179FXv c8179FXv = this.A02;
        if (c8179FXv != null) {
            ImageView imageView = c8179FXv.A02;
            if (i != 0) {
                drawableA01 = FWf.A01(imageView, i);
                if (drawableA01 != null) {
                    FWU.A01(drawableA01);
                }
            } else {
                drawableA01 = null;
            }
            imageView.setImageDrawable(drawableA01);
            c8179FXv.A00();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C8173FXp c8173FXp = this.A01;
        if (c8173FXp != null) {
            c8173FXp.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C8173FXp c8173FXp = this.A01;
        if (c8173FXp != null) {
            c8173FXp.A06(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C8179FXv c8179FXv = this.A02;
        if (c8179FXv != null) {
            C8142FWg c8142FWg = c8179FXv.A01;
            if (c8142FWg == null) {
                c8142FWg = new C8142FWg();
                c8179FXv.A01 = c8142FWg;
            }
            c8142FWg.A00 = colorStateList;
            c8142FWg.A02 = true;
            c8179FXv.A00();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C8179FXv c8179FXv = this.A02;
        if (c8179FXv != null) {
            C8142FWg c8142FWg = c8179FXv.A01;
            if (c8142FWg == null) {
                c8142FWg = new C8142FWg();
                c8179FXv.A01 = c8142FWg;
            }
            c8142FWg.A01 = mode;
            c8142FWg.A03 = true;
            c8179FXv.A00();
        }
    }

    public C8178FXu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = false;
        AbstractC7608F5v.A1D(this);
        C8173FXp c8173FXp = new C8173FXp(this);
        this.A01 = c8173FXp;
        c8173FXp.A07(attributeSet, i);
        C8179FXv c8179FXv = new C8179FXv(this);
        this.A02 = c8179FXv;
        c8179FXv.A01(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C8173FXp c8173FXp = this.A01;
        if (c8173FXp != null) {
            c8173FXp.A02();
        }
        C8179FXv c8179FXv = this.A02;
        if (c8179FXv != null) {
            c8179FXv.A00();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C8173FXp c8173FXp = this.A01;
        if (c8173FXp != null) {
            c8173FXp.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C8173FXp c8173FXp = this.A01;
        if (c8173FXp != null) {
            c8173FXp.A04(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C8179FXv c8179FXv = this.A02;
        if (c8179FXv != null) {
            c8179FXv.A00();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.A00 = true;
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C8179FXv c8179FXv = this.A02;
        if (c8179FXv != null) {
            c8179FXv.A00();
        }
    }
}
