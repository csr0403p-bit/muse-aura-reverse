package X;

import com.meta.vesta.network.VestaNetworkException;
import kotlin.Unit;

/* renamed from: X.HCh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10362HCh implements ADl {
    public final /* synthetic */ String A00;
    public final /* synthetic */ G0U<String, R> A01;
    public final /* synthetic */ G0U<Throwable, Unit> A02;
    public final /* synthetic */ G0U<R, Unit> A03;

    @Override // X.ADl
    public final void onFailure(Throwable th) {
        C7384Etj.A0Y(th, 0);
        CFK.A08("VPMStefiNetworkHandler", FGI.A0U("[", this.A00, "] Stefi transport failure"), th);
        G0U<Throwable, Unit> g0u = this.A02;
        if (!(th instanceof VestaNetworkException)) {
            th = new VestaNetworkException("Transport failure", th);
        }
        g0u.invoke(th);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-Ljava/lang/String;+TR;>;Ljava/lang/String;LX/G0U<-Ljava/lang/Throwable;Lkotlin/Unit;>;LX/G0U<-TR;Lkotlin/Unit;>;)V */
    public C10362HCh(String str, G0U g0u, G0U g0u2, G0U g0u3) {
        this.A01 = g0u;
        this.A00 = str;
        this.A02 = g0u2;
        this.A03 = g0u3;
    }
}
