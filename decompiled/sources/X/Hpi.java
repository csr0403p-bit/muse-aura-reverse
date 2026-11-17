package X;

import android.view.inputmethod.InputConnectionWrapper;

/* loaded from: classes6.dex */
public final class Hpi extends InputConnectionWrapper {
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        if (charSequence == null) {
            return false;
        }
        return super.commitText(charSequence, i);
    }
}
