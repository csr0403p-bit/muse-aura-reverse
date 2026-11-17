package androidx.appcompat.app;

import X.AbstractDialogC8260Fag;
import X.F60;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes6.dex */
public abstract class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof AbstractDialogC8260Fag)) {
            super.setupDialog(dialog, i);
            return;
        }
        AbstractDialogC8260Fag abstractDialogC8260Fag = (AbstractDialogC8260Fag) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        AbstractDialogC8260Fag.A02(abstractDialogC8260Fag).A0O(1);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        throw F60.createAndThrow();
    }
}
