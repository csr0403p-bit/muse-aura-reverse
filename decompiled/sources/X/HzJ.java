package X;

import android.content.Context;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;

/* loaded from: classes6.dex */
public final class HzJ implements Hx5 {
    public final /* synthetic */ HpW A00;
    public final /* synthetic */ Hx5 A01;

    @Override // X.Hx5
    public final void onPurchaseFailed(EnumC9704GeI enumC9704GeI, Hzd hzd) {
        AnonymousClass003.A0u(enumC9704GeI, hzd);
        this.A00.A00.A05(new C8897FtE(hzd, enumC9704GeI, this.A01, null, 4));
    }

    @Override // X.Hx5
    public final void onPurchaseFinished(EnumC9704GeI enumC9704GeI) {
        C7384Etj.A0Y(enumC9704GeI, 0);
        this.A00.A00.A05(new C8899FtG((Object) this.A01, (MetaAiRsysSdkRealTimeSession) enumC9704GeI, (Context) null, (HtJ<? super C8899FtG>) 8));
    }

    @Override // X.Hx5
    public final void onPurchaseSuccessful(Hs0 hs0) {
        C7384Etj.A0Y(hs0, 0);
        this.A00.A00.A05(new C8899FtG((Object) this.A01, (MetaAiRsysSdkRealTimeSession) hs0, (Context) null, (HtJ<? super C8899FtG>) 9));
    }

    public HzJ(HpW hpW, Hx5 hx5) {
        this.A00 = hpW;
        this.A01 = hx5;
    }
}
