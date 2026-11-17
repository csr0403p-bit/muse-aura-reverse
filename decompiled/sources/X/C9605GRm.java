package X;

import com.facebook.rsys.sdk.RsysSdkImpl;

/* renamed from: X.GRm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9605GRm implements GS8 {
    public final /* synthetic */ RsysSdkImpl A00;

    @Override // X.GS8
    public final void AS4(GR9 gr9) {
        C7384Etj.A0Y(gr9, 0);
        HqD hqD = HqD.A1j;
        C9597GRd c9597GRd = (C9597GRd) gr9;
        String str = c9597GRd.A05;
        Hy5.A00(hqD.eventName, str, hqD.tags);
        this.A00.A08.remove(str);
        c9597GRd.A06.remove(this);
    }

    public C9605GRm(RsysSdkImpl rsysSdkImpl) {
        this.A00 = rsysSdkImpl;
    }

    @Override // X.GS8
    public final /* synthetic */ void AUC(GR9 gr9, GRD grd) {
    }
}
