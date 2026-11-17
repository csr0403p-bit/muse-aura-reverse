package X;

import android.content.Context;

/* renamed from: X.F8i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7643F8i implements FQJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ FDW A02;
    public final /* synthetic */ FDW A03;

    public C7643F8i(Context context, FBB fbb, FDW fdw, FDW fdw2) {
        this.A03 = fdw;
        this.A00 = context;
        this.A02 = fdw2;
        this.A01 = fbb;
    }

    @Override // X.FQJ
    public final void AVx() {
        FDW fdw = this.A03;
        HsM hsMA0D = fdw.A0D(42);
        if (hsMA0D != null) {
            FDW fdw2 = this.A02;
            F9J.A03(this.A01, fdw2, C9115Fyg.A01(fdw2), hsMA0D, 1);
        } else {
            HsM hsMA0Z = AbstractC7608F5v.A0Z(fdw);
            if (hsMA0Z != null) {
                F6D.A03(this.A01, this.A02, C9115Fyg.A00().A05(), hsMA0Z);
            }
        }
    }

    @Override // X.FQJ
    public final void AVy(int i) {
        HsM hsMA0D = this.A03.A0D(38);
        if (hsMA0D != null) {
            int iA00 = (int) FE5.A00(this.A00, i);
            FDW fdw = this.A02;
            C9115Fyg c9115FygA01 = C9115Fyg.A01(fdw);
            FBB fbb = this.A01;
            c9115FygA01.A06(fbb, 1);
            c9115FygA01.A06(Integer.valueOf(iA00), 2);
            F9J.A02(fbb, fdw, c9115FygA01, hsMA0D);
        }
    }

    @Override // X.FQJ
    public final void AVz(int i) {
        FDW fdw = this.A03;
        HsM hsMA0D = fdw.A0D(43);
        if (hsMA0D == null) {
            HsM hsMA0a = AbstractC7608F5v.A0a(fdw);
            if (hsMA0a != null) {
                F6D.A03(this.A01, this.A02, C9115Fyg.A00().A05(), hsMA0a);
                return;
            }
            return;
        }
        int iA00 = (int) FE5.A00(this.A00, i);
        FDW fdw2 = this.A02;
        C9115Fyg c9115FygA01 = C9115Fyg.A01(fdw2);
        FBB fbb = this.A01;
        c9115FygA01.A06(fbb, 1);
        c9115FygA01.A06(Integer.valueOf(iA00), 2);
        F9J.A02(fbb, fdw2, c9115FygA01, hsMA0D);
    }
}
