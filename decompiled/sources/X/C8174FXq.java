package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: X.FXq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8174FXq extends ToggleButton {
    public Hj4 A00;
    public final C8173FXp A01;
    public final C8163FXf A02;

    private Hj4 getEmojiTextViewHelper() {
        Hj4 hj4 = this.A00;
        if (hj4 != null) {
            return hj4;
        }
        Hj4 hj42 = new Hj4(this);
        this.A00 = hj42;
        return hj42;
    }

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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return C8163FXf.A00(this.A02);
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return C8163FXf.A01(this.A02);
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C8163FXf c8163FXf = this.A02;
        c8163FXf.A09(colorStateList);
        c8163FXf.A07();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C8163FXf c8163FXf = this.A02;
        c8163FXf.A0A(mode);
        c8163FXf.A07();
    }

    public C8174FXq(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC7608F5v.A1D(this);
        C8173FXp c8173FXp = new C8173FXp(this);
        this.A01 = c8173FXp;
        c8173FXp.A07(attributeSet, R.attr.buttonStyleToggle);
        C8163FXf c8163FXf = new C8163FXf(this);
        this.A02 = c8163FXf;
        c8163FXf.A0B(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().A00(attributeSet, R.attr.buttonStyleToggle);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C8173FXp c8173FXp = this.A01;
        if (c8173FXp != null) {
            c8173FXp.A02();
        }
        C8163FXf c8163FXf = this.A02;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A00.A00.A01(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A02;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A02;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A00.A00.A02(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A00.A00.A03(inputFilterArr));
    }
}
