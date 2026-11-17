package X;

import com.facebook.payments.dcp.xapp.controller.IapController;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HiT implements Hvy {
    public final /* synthetic */ IapController A00;
    public final /* synthetic */ Hvy A01;
    public final /* synthetic */ C9691Gdw A02;

    @Override // X.Hvy
    public final void onResponseWithError(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map, Hzd hzd) {
        AnonymousClass005.A11(interfaceC10512HoG, map, hzd, 0);
        IapController iapController = this.A00;
        HsR hsR = iapController.A00;
        if (hsR != null) {
            HjL hjL = (HjL) hsR;
            hjL.A04.flowEndFail(hjL.A00, interfaceC10512HoG.AJk().name(), null);
        }
        this.A01.onResponseWithError(interfaceC10512HoG, enumC9704GeI, map, hzd);
        IapController.A02(interfaceC10512HoG, iapController, this.A02, map);
    }

    public HiT(IapController iapController, Hvy hvy, C9691Gdw c9691Gdw) {
        this.A00 = iapController;
        this.A02 = c9691Gdw;
        this.A01 = hvy;
    }

    @Override // X.Hvy
    public final void onResponse(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map) {
        AnonymousClass003.A0v(interfaceC10512HoG, map);
        IapController iapController = this.A00;
        C9691Gdw c9691Gdw = this.A02;
        Hvy hvy = this.A01;
        EnumC9706GeK enumC9706GeKAJk = interfaceC10512HoG.AJk();
        EnumC9706GeK enumC9706GeK = EnumC9706GeK.A0H;
        HsR hsR = iapController.A00;
        if (enumC9706GeKAJk == enumC9706GeK) {
            if (hsR != null) {
                HjL hjL = (HjL) hsR;
                hjL.A04.flowEndSuccess(hjL.A00);
            }
            hvy.onResponse(interfaceC10512HoG, enumC9704GeI, map);
        } else {
            if (hsR != null) {
                HjL hjL2 = (HjL) hsR;
                hjL2.A04.flowEndFail(hjL2.A00, enumC9706GeKAJk.name(), null);
            }
            hvy.onResponseWithError(interfaceC10512HoG, enumC9704GeI, map, HiU.A00(interfaceC10512HoG, "FETCH_DCPCATALOG"));
        }
        IapController.A02(interfaceC10512HoG, iapController, c9691Gdw, map);
    }
}
