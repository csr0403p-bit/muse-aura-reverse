package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: X.FXk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8168FXk extends MultiAutoCompleteTextView {
    public static final int[] A03 = {R.attr.popupBackground};
    public final C8173FXp A00;
    public final EBd A01;
    public final C8163FXf A02;

    public ColorStateList getSupportBackgroundTintList() {
        C8173FXp c8173FXp = this.A00;
        if (c8173FXp != null) {
            return C8173FXp.A00(c8173FXp);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C8173FXp c8173FXp = this.A00;
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

    public void setEmojiCompatEnabled(boolean z) {
        this.A01.A03(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A01.A00(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C8173FXp c8173FXp = this.A00;
        if (c8173FXp != null) {
            c8173FXp.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C8173FXp c8173FXp = this.A00;
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

    public C8168FXk(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, com.facebook.aura.R.attr._name_removed__res_0x7f04005a);
        Context context2 = getContext();
        FWZ.A03(context2, this);
        C8140FWd c8140FWdA00 = C8140FWd.A00(context2, attributeSet, A03, com.facebook.aura.R.attr._name_removed__res_0x7f04005a, 0);
        TypedArray typedArray = c8140FWdA00.A02;
        if (typedArray.hasValue(0)) {
            setDropDownBackgroundDrawable(c8140FWdA00.A02(0));
        }
        typedArray.recycle();
        C8173FXp c8173FXp = new C8173FXp(this);
        this.A00 = c8173FXp;
        c8173FXp.A07(attributeSet, com.facebook.aura.R.attr._name_removed__res_0x7f04005a);
        C8163FXf c8163FXf = new C8163FXf(this);
        this.A02 = c8163FXf;
        c8163FXf.A0B(attributeSet, com.facebook.aura.R.attr._name_removed__res_0x7f04005a);
        c8163FXf.A07();
        EBd eBd = new EBd(this);
        this.A01 = eBd;
        eBd.A02(attributeSet, com.facebook.aura.R.attr._name_removed__res_0x7f04005a);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA00 = eBd.A00(keyListener);
            if (keyListenerA00 != keyListener) {
                super.setKeyListener(keyListenerA00);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C8173FXp c8173FXp = this.A00;
        if (c8173FXp != null) {
            c8173FXp.A02();
        }
        C8163FXf c8163FXf = this.A02;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC8191FYi.A00(this, editorInfo, inputConnectionOnCreateInputConnection);
        return this.A01.A01(editorInfo, inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C8173FXp c8173FXp = this.A00;
        if (c8173FXp != null) {
            c8173FXp.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C8173FXp c8173FXp = this.A00;
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(FWf.A01(this, i));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C8163FXf c8163FXf = this.A02;
        if (c8163FXf != null) {
            c8163FXf.A08(context, i);
        }
    }
}
