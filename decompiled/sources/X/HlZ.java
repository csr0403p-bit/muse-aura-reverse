package X;

import android.content.DialogInterface;

/* loaded from: classes6.dex */
public final class HlZ implements DialogInterface.OnClickListener {
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ F6D A01;
    public final /* synthetic */ FDW A02;

    public HlZ(FBB fbb, F6D f6d, FDW fdw) {
        this.A02 = fdw;
        this.A00 = fbb;
        this.A01 = f6d;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FDW fdw = this.A02;
        HsM hsMA0Z = AbstractC7608F5v.A0Z(fdw);
        if (hsMA0Z != null) {
            AbstractC7691FAk.A02(this.A01, C9115Fyg.A01(fdw), hsMA0Z, this.A00, 1);
        }
    }
}
