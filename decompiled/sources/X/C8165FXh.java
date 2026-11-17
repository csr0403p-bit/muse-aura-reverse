package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.FXh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8165FXh extends TextView {
    public Future<AbstractC8056FRk> A00;
    public Hj4 A01;
    public C8087FSs A02;
    public FZL A03;
    public boolean A04;
    public final C8173FXp A05;
    public final FZQ A06;
    public final C8163FXf A07;

    public C8165FXh(Context context) {
        this(context, null, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    private Hj4 getEmojiTextViewHelper() {
        Hj4 hj4 = this.A01;
        if (hj4 != null) {
            return hj4;
        }
        Hj4 hj42 = new Hj4(this);
        this.A01 = hj42;
        return hj42;
    }

    public C8087FSs getFontVariationSettingsManager() {
        C8087FSs c8087FSs = this.A02;
        if (c8087FSs != null) {
            return c8087FSs;
        }
        C8087FSs c8087FSs2 = new C8087FSs(this, new C10637I0h(this, 2));
        this.A02 = c8087FSs2;
        return c8087FSs2;
    }

    public FZL getSuperCaller() {
        FZL c8189FYg = this.A03;
        if (c8189FYg == null) {
            c8189FYg = Build.VERSION.SDK_INT >= 34 ? new C8189FYg(this) : new C8199FYq(this);
            this.A03 = c8189FYg;
        }
        return c8189FYg;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C8173FXp c8173FXp = this.A05;
        if (c8173FXp != null) {
            return C8173FXp.A00(c8173FXp);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C8173FXp c8173FXp = this.A05;
        if (c8173FXp != null) {
            return C8173FXp.A01(c8173FXp);
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return C8163FXf.A00(this.A07);
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return C8163FXf.A01(this.A07);
    }

    @Override // android.widget.TextView
    public CharSequence getText() throws ExecutionException, InterruptedException {
        Future<AbstractC8056FRk> future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                throw BV4.A0a("getPrecomputedText");
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) throws ExecutionException, InterruptedException {
        Future<AbstractC8056FRk> future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                throw BV4.A0a("getPrecomputedText");
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public void setPrecomputedText(AbstractC8056FRk abstractC8056FRk) {
        throw BV4.A0a("getPrecomputedText");
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C8173FXp c8173FXp = this.A05;
        if (c8173FXp != null) {
            c8173FXp.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C8173FXp c8173FXp = this.A05;
        if (c8173FXp != null) {
            c8173FXp.A06(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C8163FXf c8163FXf = this.A07;
        c8163FXf.A09(colorStateList);
        c8163FXf.A07();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C8163FXf c8163FXf = this.A07;
        c8163FXf.A0A(mode);
        c8163FXf.A07();
    }

    public void setTextFuture(Future<AbstractC8056FRk> future) {
        this.A00 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C10436Hhi c10436Hhi) {
        TextDirectionHeuristic textDirectionHeuristic = c10436Hhi.A03;
        int i = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            }
        }
        setTextDirection(i);
        getPaint().set(c10436Hhi.A04);
        setBreakStrategy(c10436Hhi.A00);
        setHyphenationFrequency(c10436Hhi.A01);
    }

    public static C8165FXh A02(C8165FXh c8165FXh) {
        return ((AbstractC8198FYp) c8165FXh.getSuperCaller()).A00;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C8173FXp c8173FXp = this.A05;
        if (c8173FXp != null) {
            c8173FXp.A02();
        }
        C8163FXf c8163FXf = this.A07;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().A02;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public C10436Hhi getTextMetricsParamsCompat() {
        return new C10436Hhi(getTextMetricsParams());
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return getFontVariationSettingsManager().A01;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C8163FXf.A04(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC8191FYi.A00(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) C8j4.A0n(this)).isActive(this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A00.A00.A01(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C8173FXp c8173FXp = this.A05;
        if (c8173FXp != null) {
            c8173FXp.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C8173FXp c8173FXp = this.A05;
        if (c8173FXp != null) {
            c8173FXp.A04(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A07;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A07;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? FWf.A00(context, i) : null, i2 != 0 ? FWf.A00(context, i2) : null, i3 != 0 ? FWf.A00(context, i3) : null, i4 != 0 ? FWf.A00(context, i4) : null);
        C8163FXf c8163FXf = this.A07;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? FWf.A00(context, i) : null, i2 != 0 ? FWf.A00(context, i2) : null, i3 != 0 ? FWf.A00(context, i3) : null, i4 != 0 ? FWf.A00(context, i4) : null);
        C8163FXf c8163FXf = this.A07;
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().A00(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C8163FXf c8163FXf = this.A07;
        if (c8163FXf != null) {
            c8163FXf.A08(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        C8087FSs fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.A01 = typeface;
        fontVariationSettingsManager.A00 = typeface;
        fontVariationSettingsManager.A04.accept(typeface);
    }

    public final /* synthetic */ void A04(Typeface typeface) {
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        FMI.A01(this, i);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public C8165FXh(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.A04 = false;
        this.A03 = null;
        AbstractC7608F5v.A1D(this);
        C8173FXp c8173FXp = new C8173FXp(this);
        this.A05 = c8173FXp;
        c8173FXp.A07(attributeSet, i);
        C8163FXf c8163FXf = new C8163FXf(this);
        this.A07 = c8163FXf;
        c8163FXf.A0B(attributeSet, i);
        c8163FXf.A07();
        FZQ fzq = new FZQ();
        fzq.A00 = this;
        this.A06 = fzq;
        getEmojiTextViewHelper().A00(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A07;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A07;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().Adc(i, f);
        } else {
            FMI.A00(this, f, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (!this.A04) {
            if (typeface != null && i > 0) {
                if (getContext() != null) {
                    typeface = Typeface.create(typeface, i);
                } else {
                    throw C60O.A0i("Context cannot be null");
                }
            }
            this.A04 = true;
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.A04 = false;
            }
        }
    }
}
