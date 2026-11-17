package X;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class EBb extends InputConnectionWrapper {
    public final TextView A00;

    public EBb(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        this.A00 = textView;
        if (E9X.A08 != null) {
            E9X.A00().A05(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return E9T.A02(this.A00.getEditableText(), this, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return E9T.A02(this.A00.getEditableText(), this, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
