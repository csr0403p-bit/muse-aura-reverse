package X;

import com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HwD implements Hx5 {
    public final /* synthetic */ Hm1<Map<String, ? extends Object>> A00;

    @Override // X.Hx5
    public final void onPurchaseFinished(EnumC9704GeI enumC9704GeI) {
        C7384Etj.A0Y(enumC9704GeI, 0);
        String strName = enumC9704GeI.name();
        String str = enumC9704GeI.resultMessage;
        C9jH c9jH = C9jH.A00;
        Map mapA03 = IapBloksBridge.A03("PURCHASE_FAILURE", "", "", "FAILURE", strName, str, "", "", "", c9jH, c9jH);
        Hm1<Map<String, ? extends Object>> hm1 = this.A00;
        if (hm1.isActive()) {
            hm1.resumeWith(mapA03);
        }
    }

    @Override // X.Hx5
    public final void onPurchaseSuccessful(Hs0 hs0) {
        C7384Etj.A0Y(hs0, 0);
        String str = EnumC9704GeI.A0O.resultMessage;
        String str2 = hs0.A00;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = hs0.A02;
        if (str3 == null) {
            str3 = "";
        }
        C9jH c9jH = C9jH.A00;
        Map mapA03 = IapBloksBridge.A03("PURCHASE_SUCCESS", "", "", "SUCCESS", "SUCCESSFUL", str, str2, str3, "", c9jH, c9jH);
        Hm1<Map<String, ? extends Object>> hm1 = this.A00;
        if (hm1.isActive()) {
            hm1.resumeWith(mapA03);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HwD(Hm1<? super Map<String, ? extends Object>> hm1) {
        this.A00 = hm1;
    }

    @Override // X.Hx5
    public final void onPurchaseFailed(EnumC9704GeI enumC9704GeI, Hzd hzd) {
        AnonymousClass003.A0u(enumC9704GeI, hzd);
        String strName = enumC9704GeI.name();
        String str = enumC9704GeI.resultMessage;
        String strA00 = AbstractC10492Hlw.A00(hzd);
        C9jH c9jH = C9jH.A00;
        Map mapA03 = IapBloksBridge.A03("PURCHASE_FAILURE", "", "", "FAILURE", strName, str, "", "", strA00, c9jH, c9jH);
        Hm1<Map<String, ? extends Object>> hm1 = this.A00;
        if (hm1.isActive()) {
            hm1.resumeWith(mapA03);
        }
    }
}
