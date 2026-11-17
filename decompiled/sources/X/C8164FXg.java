package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.facebook.aura.R;
import com.facebook.aura.file.utils.HatchFileUIUtils;

/* renamed from: X.FXg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8164FXg extends EditText implements FS3 {
    public C8206FYx A00;
    public C8087FSs A01;
    public final C8173FXp A02;
    public final EBd A03;
    public final FZQ A04;
    public final C8163FXf A05;
    public final FRG A06;

    private C8206FYx getSuperCaller() {
        C8206FYx c8206FYx = this.A00;
        if (c8206FYx != null) {
            return c8206FYx;
        }
        C8206FYx c8206FYx2 = new C8206FYx(this);
        this.A00 = c8206FYx2;
        return c8206FYx2;
    }

    @Override // X.FS3
    public final C8071FRz AVD(C8071FRz c8071FRz) {
        return this.A06.AVC(this, c8071FRz);
    }

    public C8087FSs getFontVariationSettingsManager() {
        C8087FSs c8087FSs = this.A01;
        if (c8087FSs != null) {
            return c8087FSs;
        }
        C8087FSs c8087FSs2 = new C8087FSs(this, new C10637I0h(this, 1));
        this.A01 = c8087FSs2;
        return c8087FSs2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C8173FXp c8173FXp = this.A02;
        if (c8173FXp != null) {
            return C8173FXp.A00(c8173FXp);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C8173FXp c8173FXp = this.A02;
        if (c8173FXp != null) {
            return C8173FXp.A01(c8173FXp);
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return C8163FXf.A00(this.A05);
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return C8163FXf.A01(this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        android.util.Log.i("ReceiveContent", X.AnonymousClass007.A0a("Can't handle drop: no activity: view=", r4));
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDragEvent(android.view.DragEvent r5) {
        /*
            r4 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 >= r0) goto L9a
            java.lang.Object r0 = r5.getLocalState()
            if (r0 != 0) goto L9a
            java.lang.String[] r0 = X.AbstractC8060FRo.A0D(r4)
            if (r0 == 0) goto L9a
            android.content.Context r3 = r4.getContext()
        L16:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L8f
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L83
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L8f
            int r1 = r5.getAction()
            r0 = 1
            if (r1 != r0) goto L31
            boolean r0 = r4 instanceof android.widget.TextView
            r0 = r0 ^ 1
            if (r0 == 0) goto L9a
        L2f:
            r0 = 1
            return r0
        L31:
            int r0 = r5.getAction()
            r2 = 3
            if (r0 != r2) goto L9a
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L6d
            r3.requestDragAndDropPermissions(r5)
            float r1 = r5.getX()
            float r0 = r5.getY()
            int r1 = r4.getOffsetForPosition(r1, r0)
            r4.beginBatchEdit()
            java.lang.CharSequence r0 = r4.getText()     // Catch: java.lang.Throwable -> L8a
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch: java.lang.Throwable -> L8a
            android.text.Selection.setSelection(r0, r1)     // Catch: java.lang.Throwable -> L8a
            android.content.ClipData r1 = r5.getClipData()     // Catch: java.lang.Throwable -> L8a
            X.FRu r0 = new X.FRu     // Catch: java.lang.Throwable -> L8a
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L8a
            X.Hqo r0 = r0.A00     // Catch: java.lang.Throwable -> L8a
            X.FRz r0 = r0.A5P()     // Catch: java.lang.Throwable -> L8a
            X.AbstractC8060FRo.A01(r4, r0)     // Catch: java.lang.Throwable -> L8a
            r4.endBatchEdit()
            goto L2f
        L6d:
            r3.requestDragAndDropPermissions(r5)
            android.content.ClipData r1 = r5.getClipData()
            X.FRu r0 = new X.FRu
            r0.<init>(r1, r2)
            X.Hqo r0 = r0.A00
            X.FRz r0 = r0.A5P()
            X.AbstractC8060FRo.A01(r4, r0)
            goto L2f
        L83:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L16
        L8a:
            r0 = move-exception
            r4.endBatchEdit()
            throw r0
        L8f:
            java.lang.String r0 = "Can't handle drop: no activity: view="
            java.lang.String r1 = X.AnonymousClass007.A0a(r0, r4)
            java.lang.String r0 = "ReceiveContent"
            android.util.Log.i(r0, r1)
        L9a:
            boolean r0 = super.onDragEvent(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8164FXg.onDragEvent(android.view.DragEvent):boolean");
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (Build.VERSION.SDK_INT >= 31 || AbstractC8060FRo.A0D(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0) {
            return true;
        }
        C8066FRu c8066FRu = new C8066FRu(primaryClip, 1);
        int i2 = i != 16908322 ? 1 : 0;
        Hqo hqo = c8066FRu.A00;
        hqo.AdQ(i2);
        AbstractC8060FRo.A01(this, hqo.A5P());
        return true;
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.A03.A03(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A03.A00(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C8173FXp c8173FXp = this.A02;
        if (c8173FXp != null) {
            c8173FXp.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C8173FXp c8173FXp = this.A02;
        if (c8173FXp != null) {
            c8173FXp.A06(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C8163FXf c8163FXf = this.A05;
        c8163FXf.A09(colorStateList);
        c8163FXf.A07();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C8163FXf c8163FXf = this.A05;
        c8163FXf.A0A(mode);
        c8163FXf.A07();
    }

    public C8164FXg(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr._name_removed__res_0x7f0401bc);
        AbstractC7608F5v.A1D(this);
        C8173FXp c8173FXp = new C8173FXp(this);
        this.A02 = c8173FXp;
        c8173FXp.A07(attributeSet, R.attr._name_removed__res_0x7f0401bc);
        C8163FXf c8163FXf = new C8163FXf(this);
        this.A05 = c8163FXf;
        c8163FXf.A0B(attributeSet, R.attr._name_removed__res_0x7f0401bc);
        c8163FXf.A07();
        FZQ fzq = new FZQ();
        fzq.A00 = this;
        this.A04 = fzq;
        this.A06 = new FRG();
        EBd eBd = new EBd(this);
        this.A03 = eBd;
        eBd.A02(attributeSet, R.attr._name_removed__res_0x7f0401bc);
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
        C8173FXp c8173FXp = this.A02;
        if (c8173FXp != null) {
            c8173FXp.A02();
        }
        C8163FXf c8163FXf = this.A05;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().A02;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return getFontVariationSettingsManager().A01;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrA0D;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C8163FXf.A04(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC8191FYi.A00(this, editorInfo, inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrA0D = AbstractC8060FRo.A0D(this)) != null) {
            editorInfo.contentMimeTypes = strArrA0D;
            inputConnectionOnCreateInputConnection = new C2078Axt(inputConnectionOnCreateInputConnection, new HuU(this));
        }
        return this.A03.A01(editorInfo, inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) C8j4.A0n(this)).isActive(this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C8173FXp c8173FXp = this.A02;
        if (c8173FXp != null) {
            c8173FXp.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C8173FXp c8173FXp = this.A02;
        if (c8173FXp != null) {
            c8173FXp.A04(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A05;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C8163FXf c8163FXf = this.A05;
        if (c8163FXf != null) {
            c8163FXf.A07();
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().A00(str);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C8163FXf c8163FXf = this.A05;
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

    public final /* synthetic */ void A00(Typeface typeface) {
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }
}
