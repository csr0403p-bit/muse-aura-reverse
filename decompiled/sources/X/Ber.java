package X;

import java.util.Set;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class Ber implements BfN<BfD> {
    public final InterfaceC2585Beh A00;

    @Override // X.InterfaceC2586Bei, X.InterfaceC2585Beh
    public final /* synthetic */ boolean A74(AbstractC2531BdI abstractC2531BdI) {
        return this.A00.A74(abstractC2531BdI);
    }

    @Override // X.BfN
    public final EnumC2489BcG ADT() {
        return EnumC2489BcG.METERING_REPEATING;
    }

    @Override // X.InterfaceC2586Bei
    public final InterfaceC2585Beh ADr() {
        return this.A00;
    }

    @Override // X.InterfaceC2490BcH
    public final /* synthetic */ int AGW() {
        return AnonymousClass001.A0F(this.A00.Abk(InterfaceC2490BcH.A01));
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ BY1 AIG(AbstractC2531BdI abstractC2531BdI) {
        return this.A00.AIG(abstractC2531BdI);
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ Set AJ7(AbstractC2531BdI abstractC2531BdI) {
        return this.A00.AJ7(abstractC2531BdI);
    }

    @Override // X.InterfaceC2586Bei, X.InterfaceC2585Beh
    public final /* synthetic */ Set APd() {
        return this.A00.APd();
    }

    @Override // X.InterfaceC2586Bei, X.InterfaceC2585Beh
    public final /* synthetic */ Object Abk(AbstractC2531BdI abstractC2531BdI) {
        return this.A00.Abk(abstractC2531BdI);
    }

    @Override // X.InterfaceC2586Bei, X.InterfaceC2585Beh
    public final /* synthetic */ Object Abl(AbstractC2531BdI abstractC2531BdI, Object obj) {
        return this.A00.Abl(abstractC2531BdI, obj);
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ Object Abm(AbstractC2531BdI abstractC2531BdI, BY1 by1) {
        return this.A00.Abm(abstractC2531BdI, by1);
    }

    public Ber() {
        C2582Bee c2582BeeA00 = C2582Bee.A00();
        c2582BeeA00.ANl(BfN.A06, new C2642BgR());
        BV6.A11(InterfaceC2490BcH.A01, c2582BeeA00, 34);
        c2582BeeA00.ANl(BdG.A00, C2602BfB.class);
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(C2602BfB.class.getCanonicalName());
        sbA0w.append("-");
        c2582BeeA00.ANl(BdG.A01, C8j3.A14(UUID.randomUUID(), sbA0w));
        this.A00 = c2582BeeA00;
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ void ABW(InterfaceC2588Bek interfaceC2588Bek, String str) {
        InterfaceC2585Beh.A01(interfaceC2588Bek, this, str);
    }
}
