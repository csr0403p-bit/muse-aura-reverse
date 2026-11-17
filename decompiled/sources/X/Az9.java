package X;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes4.dex */
public class Az9 extends Az8 {
    public final View A00;

    @Override // X.Az8
    public void A01() {
        View view = this.A00;
        if (view != null) {
            ((InputMethodManager) C8j4.A0n(view)).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // X.Az8
    public void A02() {
        final View viewFindFocus = this.A00;
        if (viewFindFocus != null) {
            if (viewFindFocus.isInEditMode() || viewFindFocus.onCheckIsTextEditor()) {
                viewFindFocus.requestFocus();
            } else {
                viewFindFocus = viewFindFocus.getRootView().findFocus();
                if (viewFindFocus == null && (viewFindFocus = viewFindFocus.getRootView().findViewById(R.id.content)) == null) {
                    return;
                }
            }
            if (viewFindFocus.hasWindowFocus()) {
                viewFindFocus.post(new Runnable() { // from class: X.AzB
                    public static final String __redex_internal_original_name = "SoftwareKeyboardControllerCompat$Impl20$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        View view = viewFindFocus;
                        ((InputMethodManager) C8j4.A0n(view)).showSoftInput(view, 0);
                    }
                });
            }
        }
    }

    public Az9(View view) {
        this.A00 = view;
    }
}
