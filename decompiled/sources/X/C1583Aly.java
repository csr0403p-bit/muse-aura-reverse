package X;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* renamed from: X.Aly, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1583Aly implements InterfaceC1650AnT {
    public AutofillId A00;
    public final View A01;
    public final AutofillManager A02;
    public final C1597AmP A03;

    public C1583Aly(View view, C1597AmP c1597AmP) {
        this.A01 = view;
        this.A03 = c1597AmP;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw C3cG.A0Q("Autofill service could not be located.");
        }
        this.A02 = autofillManager;
        view.setImportantForAutofill(1);
        AutofillId autofillId = view.getAutofillId();
        if (autofillId == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        this.A00 = autofillId;
    }
}
