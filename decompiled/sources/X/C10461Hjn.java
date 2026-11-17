package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/* renamed from: X.Hjn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10461Hjn implements TextView.OnEditorActionListener {
    public static final C10461Hjn A00 = new C10461Hjn();

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6) {
            return false;
        }
        Object objA0n = C8j4.A0n(textView);
        C7384Etj.A0Z(objA0n, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) objA0n).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        textView.clearFocus();
        return true;
    }
}
