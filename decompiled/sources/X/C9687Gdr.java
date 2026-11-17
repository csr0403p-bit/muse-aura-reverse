package X;

import android.content.Context;
import com.facebook.payments.dcp.xapp.controller.IapController;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.Gdr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9687Gdr extends AbstractC7559F3s implements G0U<HyP, Unit> {
    public final /* synthetic */ Hyl $listener;
    public final /* synthetic */ Hnw $request;
    public final /* synthetic */ long $startTime;
    public final /* synthetic */ IapController this$0;

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(HyP hyP) {
        HtJ htJ;
        EVS evsA0s;
        FYG fyg;
        HyP hyP2 = hyP;
        C7384Etj.A0Y(hyP2, 0);
        boolean z = hyP2 instanceof Hs4;
        Boolean boolA0i = AnonymousClass001.A0i();
        if (z) {
            C9699Ge6 c9699Ge6 = this.this$0.A01;
            String str = this.$request.A00;
            long j = this.$startTime;
            C7384Etj.A0Y(str, 0);
            Long lValueOf = Long.valueOf(j);
            String str2 = str;
            htJ = null;
            if (str.length() == 0) {
                str2 = null;
            }
            C9749Gf2 c9749Gf2A01 = C9699Ge6.A01(c9699Ge6, null, null, lValueOf, str2);
            C9700GeE c9700GeEA0J = c9699Ge6.A0J(null);
            c9700GeEA0J.A02(c9699Ge6.A01);
            c9700GeEA0J.A06(boolA0i);
            Map<String, String> map = c9700GeEA0J.A01;
            evsA0s = AbstractC7607F5u.A0s(c9699Ge6.A02.acquireEvent("client_load_dcpiap_success"), 37);
            fyg = new FYG(c9749Gf2A01, c9699Ge6, str, map, 2);
        } else {
            if (!(hyP2 instanceof C9688Gds)) {
                throw C3cG.A0q();
            }
            C9699Ge6 c9699Ge62 = this.this$0.A01;
            String str3 = this.$request.A00;
            long j2 = this.$startTime;
            Hzd hzd = ((C9688Gds) hyP2).A00;
            AnonymousClass002.A1B(str3, 0, hzd);
            Long lValueOf2 = Long.valueOf(j2);
            String str4 = str3;
            htJ = null;
            if (str3.length() == 0) {
                str4 = null;
            }
            C9749Gf2 c9749Gf2A012 = C9699Ge6.A01(c9699Ge62, null, null, lValueOf2, str4);
            C9700GeE c9700GeEA0J2 = c9699Ge62.A0J(null);
            c9700GeEA0J2.A02(c9699Ge62.A01);
            c9700GeEA0J2.A06(boolA0i);
            c9700GeEA0J2.A03(hzd);
            Map<String, String> map2 = c9700GeEA0J2.A01;
            evsA0s = AbstractC7607F5u.A0s(c9699Ge62.A02.acquireEvent("client_load_dcpiap_fail"), 35);
            fyg = new FYG(c9749Gf2A012, c9699Ge62, str3, map2, 0);
        }
        C7NC.A00(evsA0s, fyg);
        Hyl hyl = this.$listener;
        if (hyl == null) {
            return null;
        }
        this.this$0.A04.A00.A05(new C8899FtG((Object) hyl, (MetaAiRsysSdkRealTimeSession) hyP2, (Context) htJ, (HtJ<? super C8899FtG>) 11));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9687Gdr(IapController iapController, Hnw hnw, Hyl hyl, long j) {
        super(1);
        this.this$0 = iapController;
        this.$request = hnw;
        this.$startTime = j;
        this.$listener = hyl;
    }
}
