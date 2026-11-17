package X;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes4.dex */
public final class AlR implements InterfaceC1491Ajy {
    public final AutofillManager A00;

    @Override // X.InterfaceC1491Ajy
    public final void ARV(View view, int i, boolean z) {
        this.A00.notifyViewVisibilityChanged(view, i, z);
    }

    public AlR(AutofillManager autofillManager) {
        this.A00 = autofillManager;
    }
}
