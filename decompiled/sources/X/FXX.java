package X;

import android.content.DialogInterface;

/* loaded from: classes6.dex */
public final class FXX implements DialogInterface.OnCancelListener {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public FXX(FBB fbb, F6D f6d, HsM hsM, int i) {
        this.$t = i;
        this.A02 = hsM;
        this.A00 = fbb;
        this.A01 = f6d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        HsM hsM = (HsM) this.A02;
        AbstractC7691FAk.A00((F6D) this.A01, C9115Fyg.A03(C9115Fyg.A00(), this.A00, 0), hsM);
    }
}
