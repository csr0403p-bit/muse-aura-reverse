package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class Hyq implements Hvy {
    public final /* synthetic */ HpW A00;
    public final /* synthetic */ Hvy A01;

    @Override // X.Hvy
    public final void onResponse(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map) {
        AnonymousClass003.A0v(interfaceC10512HoG, map);
        this.A00.A00.A05(new C8896FtD(enumC9704GeI, this.A01, map, interfaceC10512HoG, null, 1));
    }

    @Override // X.Hvy
    public final void onResponseWithError(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map, Hzd hzd) {
        AnonymousClass003.A0v(interfaceC10512HoG, map);
        C7384Etj.A0Y(hzd, 3);
        this.A00.A00.A05(new C8894FtB(interfaceC10512HoG, enumC9704GeI, hzd, this.A01, map, null, 3));
    }

    public Hyq(HpW hpW, Hvy hvy) {
        this.A00 = hpW;
        this.A01 = hvy;
    }
}
