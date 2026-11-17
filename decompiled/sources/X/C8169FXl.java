package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.facebook.aura.R;

/* renamed from: X.FXl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8169FXl extends CheckedTextView {
    public Hj4 A00;
    public final C8173FXp A01;
    public final FY6 A02;
    public final C8163FXf A03;

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

    public ColorStateList getSupportCheckMarkTintList() {
        FY6 fy6 = this.A02;
        if (fy6 != null) {
            return fy6.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        FY6 fy6 = this.A02;
        if (fy6 != null) {
            return fy6.A01;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return C8163FXf.A00(this.A03);
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return C8163FXf.A01(this.A03);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        FY6 fy6 = this.A02;
        if (fy6 != null) {
            fy6.A00 = colorStateList;
            fy6.A02 = true;
            fy6.A00();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        FY6 fy6 = this.A02;
        if (fy6 != null) {
            fy6.A01 = mode;
            fy6.A03 = true;
            fy6.A00();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C8163FXf c8163FXf = this.A03;
        c8163FXf.A09(colorStateList);
        c8163FXf.A07();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C8163FXf c8163FXf = this.A03;
        c8163FXf.A0A(mode);
        c8163FXf.A07();
    }

    public C8169FXl(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr._name_removed__res_0x7f0400f5);
        AbstractC7608F5v.A1D(this);
        C8163FXf c8163FXf = new C8163FXf(this);
        this.A03 = c8163FXf;
        c8163FXf.A0B(attributeSet, R.attr._name_removed__res_0x7f0400f5);
        c8163FXf.A07();
        C8173FXp c8173FXp = new C8173FXp(this);
        this.A01 = c8173FXp;
        c8173FXp.A07(attributeSet, R.attr._name_removed__res_0x7f0400f5);
        FY6 fy6 = new FY6(this);
        this.A02 = fy6;
        CheckedTextView checkedTextView = fy6.A05;
        Context context2 = checkedTextView.getContext();
        int[] iArr = FYT.A0B;
        C8140FWd c8140FWdA00 = C8140FWd.A00(context2, attributeSet, iArr, R.attr._name_removed__res_0x7f0400f5, 0);
        TypedArray typedArray = c8140FWdA00.A02;
        checkedTextView.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, R.attr._name_removed__res_0x7f0400f5, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    checkedTextView.setCheckMarkDrawable(FWf.A00(context2, resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                checkedTextView.setCheckMarkDrawable(FWf.A00(context2, resourceId));
            }
            if (typedArray.hasValue(2)) {
                checkedTextView.setCheckMarkTintList(c8140FWdA00.A01(2));
            }
            if (typedArray.hasValue(3)) {
                checkedTextView.setCheckMarkTintMode(FWU.A00(null, typedArray.getInt(3, -1)));
            }
            typedArray.recycle();
            getEmojiTextViewHelper().A00(attributeSet, R.attr._name_removed__res_0x7f0400f5);
        } catch (Throwable th) {
            typedArray.recycle();
            throw th;
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C8163FXf c8163FXf = this.A03;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
        C8173FXp c8173FXp = this.A01;
        if (c8173FXp != null) {
            c8173FXp.A02();
        }
        FY6 fy6 = this.A02;
        if (fy6 != null) {
            fy6.A00();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC8191FYi.A00(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A00.A00.A01(z);
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        FY6 fy6 = this.A02;
        if (fy6 != null) {
            if (fy6.A04) {
                fy6.A04 = false;
            } else {
                fy6.A04 = true;
                fy6.A00();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A03;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A03;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A00.A00.A02(z);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C8163FXf c8163FXf = this.A03;
        if (c8163FXf != null) {
            c8163FXf.A08(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(FWf.A01(this, i));
    }
}
