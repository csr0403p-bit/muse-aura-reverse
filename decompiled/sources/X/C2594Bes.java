package X;

import X.InterfaceC2616Bfh;
import java.util.Set;

/* renamed from: X.Bes, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2594Bes<T extends InterfaceC2616Bfh> implements BfN<Bf9<T>>, InterfaceC2551Bdc, InterfaceC2557Bdl {
    public final C2584Beg A00;
    public static final AbstractC2531BdI<InterfaceC2616Bfh> A03 = AbstractC2531BdI.A00(InterfaceC2616Bfh.class, "camerax.video.VideoCapture.videoOutput");
    public static final AbstractC2531BdI<BpS<BdF, InterfaceC2436BbP>> A02 = AbstractC2531BdI.A00(BpS.class, "camerax.video.VideoCapture.videoEncoderInfoFinder");
    public static final AbstractC2531BdI<Boolean> A01 = AbstractC2531BdI.A00(Boolean.class, "camerax.video.VideoCapture.forceEnableSurfaceProcessing");

    @Override // X.InterfaceC2586Bei, X.InterfaceC2585Beh
    public final /* synthetic */ boolean A74(AbstractC2531BdI abstractC2531BdI) {
        return this.A00.A74(abstractC2531BdI);
    }

    @Override // X.BfN
    public final /* synthetic */ EnumC2489BcG ADT() {
        return (EnumC2489BcG) this.A00.Abk(BfN.A01);
    }

    @Override // X.InterfaceC2586Bei
    public final InterfaceC2585Beh ADr() {
        return this.A00;
    }

    @Override // X.InterfaceC2490BcH
    public final int AGW() {
        return 34;
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

    public C2594Bes(C2584Beg c2584Beg) {
        BeS.A05(c2584Beg.A00.containsKey(A03));
        this.A00 = c2584Beg;
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ void ABW(InterfaceC2588Bek interfaceC2588Bek, String str) {
        InterfaceC2585Beh.A01(interfaceC2588Bek, this, str);
    }
}
