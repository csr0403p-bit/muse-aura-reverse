package X;

import android.net.ConnectivityManager;

/* renamed from: X.EKs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6623EKs implements ELZ {
    public final ConnectivityManager A00;

    public C6623EKs(ConnectivityManager connectivityManager) {
        C7384Etj.A0Y(connectivityManager, 0);
        this.A00 = connectivityManager;
    }

    @Override // X.ELZ
    public final boolean AN8(EKE eke) {
        C7384Etj.A0Y(eke, 0);
        EKL ekl = eke.A0B;
        return (ekl.A02.A00 == null && ekl.A03 == C79.A00) ? false : true;
    }

    @Override // X.ELZ
    public final C20Q<ENN> AhD(EKL ekl) {
        C7384Etj.A0Y(ekl, 0);
        return AbstractC05643uj.A00(new EZB(this, ekl, null, 5));
    }
}
