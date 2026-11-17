package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.FbL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8296FbL implements Runnable {
    public static final String __redex_internal_original_name = "DialogFragment$1";
    public final /* synthetic */ DialogFragment A00;

    public RunnableC8296FbL(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogFragment dialogFragment = this.A00;
        dialogFragment.mOnDismissListener.onDismiss(dialogFragment.mDialog);
    }
}
