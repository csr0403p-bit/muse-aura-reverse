package X;

import android.view.View;

/* renamed from: X.FXb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC8159FXb implements View.OnClickListener {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC8159FXb(FBB fbb, FDW fdw, HsM hsM, int i) {
        this.$t = i;
        if (i != 0) {
            this.A01 = fdw;
            this.A02 = hsM;
            this.A00 = fbb;
        } else {
            this.A00 = fdw;
            this.A02 = hsM;
            this.A01 = fbb;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FDW fdw;
        HsM hsM;
        C9115Fyg c9115FygA01;
        int i;
        Object obj;
        if (this.$t != 0) {
            fdw = (FDW) this.A01;
            hsM = (HsM) this.A02;
            c9115FygA01 = C9115Fyg.A01(fdw);
            i = 1;
            obj = this.A00;
        } else {
            fdw = (FDW) this.A00;
            hsM = (HsM) this.A02;
            c9115FygA01 = C9115Fyg.A01(fdw);
            i = 1;
            obj = this.A01;
        }
        F9J.A03((FBB) obj, fdw, c9115FygA01, hsM, i);
    }
}
