package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.Awo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2034Awo implements InterfaceC2147AzZ {
    public InputMethodManager A00;
    public final View A01;
    public final C2066Axg A02;

    public final InputMethodManager A00() {
        InputMethodManager inputMethodManager = this.A00;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object objA0n = C8j4.A0n(this.A01);
        C7384Etj.A0Z(objA0n, AbstractC7606F5t.A00(4));
        InputMethodManager inputMethodManager2 = (InputMethodManager) objA0n;
        this.A00 = inputMethodManager2;
        return inputMethodManager2;
    }

    @Override // X.InterfaceC2147AzZ
    public void AgL() {
    }

    public AbstractC2034Awo(View view) {
        this.A01 = view;
        this.A02 = new C2066Axg(view);
    }
}
