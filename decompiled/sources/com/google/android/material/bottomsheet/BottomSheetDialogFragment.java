package com.google.android.material.bottomsheet;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractDialogC8260Fag;
import X.DialogC8130FVg;
import X.FVt;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public abstract class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public boolean waitingForDismissAllowingStateLoss;

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() throws Resources.NotFoundException {
        tryDismissWithAnimation(false);
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() throws Resources.NotFoundException {
        tryDismissWithAnimation(true);
        super.dismissAllowingStateLoss();
    }

    private boolean tryDismissWithAnimation(boolean z) throws Resources.NotFoundException {
        Dialog dialog = this.mDialog;
        if (!(dialog instanceof DialogC8130FVg)) {
            return false;
        }
        DialogC8130FVg dialogC8130FVg = (DialogC8130FVg) dialog;
        if (dialogC8130FVg.A03 != null) {
            return false;
        }
        DialogC8130FVg.A01(dialogC8130FVg);
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        int i = this.mTheme;
        if (i == 0) {
            TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
            i = context.getTheme().resolveAttribute(R.attr._name_removed__res_0x7f0400a0, typedValueA0Z, true) ? typedValueA0Z.resourceId : R.style._name_removed__res_0x7f1300cb;
        }
        DialogC8130FVg dialogC8130FVg = new DialogC8130FVg(context, i);
        dialogC8130FVg.A04 = true;
        dialogC8130FVg.A05 = true;
        dialogC8130FVg.A01 = new FVt(dialogC8130FVg);
        AbstractDialogC8260Fag.A02(dialogC8130FVg).A0O(1);
        dialogC8130FVg.A07 = AbstractC7609F5w.A0R(dialogC8130FVg.getContext().getTheme(), R.attr._name_removed__res_0x7f0401c5).getBoolean(0, false);
        return dialogC8130FVg;
    }
}
