package X;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes5.dex */
public final class EBe implements TextWatcher {
    public AbstractC6499E9g A00;
    public boolean A01 = true;
    public int A02;
    public int A03;
    public final EditText A04;

    public static void A00(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            E9X.A00().A03(editableText, 0, editableText == null ? 0 : editableText.length(), 0);
            if (selectionStart < 0) {
                if (selectionEnd >= 0) {
                    Selection.setSelection(editableText, selectionEnd);
                }
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else {
                Selection.setSelection(editableText, selectionStart);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.A04;
        if (editText.isInEditMode() || !this.A01 || E9X.A08 == null) {
            return;
        }
        int i = this.A03;
        int i2 = this.A02;
        if (i2 > 0) {
            int iA01 = E9X.A00().A01();
            if (iA01 != 0) {
                if (iA01 == 1) {
                    E9X.A00().A03(editable, i, i + i2, 0);
                    return;
                } else if (iA01 != 3) {
                    return;
                }
            }
            E9X e9xA00 = E9X.A00();
            AbstractC6499E9g eBf = this.A00;
            if (eBf == null) {
                eBf = new EBf(editText);
                this.A00 = eBf;
            }
            e9xA00.A06(eBf);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A03 = i;
        this.A02 = i3;
    }

    public EBe(EditText editText) {
        this.A04 = editText;
    }
}
