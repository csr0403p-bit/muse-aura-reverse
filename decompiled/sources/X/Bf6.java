package X;

import java.util.Set;

/* loaded from: classes5.dex */
public final class Bf6 implements BfN<C2605BfM>, InterfaceC2551Bdc, InterfaceC2570Bdz {
    public static final AbstractC2531BdI<Integer> A01;
    public static final AbstractC2531BdI<BZ0> A02;
    public static final AbstractC2531BdI<Integer> A03;
    public static final AbstractC2531BdI<Integer> A04;
    public static final AbstractC2531BdI<Integer> A05;
    public static final AbstractC2531BdI<Bf8> A06;
    public static final AbstractC2531BdI<Integer> A07;
    public static final AbstractC2531BdI<Integer> A08;
    public static final AbstractC2531BdI<Integer> A09;
    public static final AbstractC2531BdI<Boolean> A0A;
    public static final AbstractC2531BdI<C2601Bez> A0B;
    public static final AbstractC2531BdI<InterfaceC2787BlA> A0C;
    public static final AbstractC2531BdI<Boolean> A0D;
    public final C2584Beg A00;

    static {
        Class cls = Integer.TYPE;
        A05 = AbstractC2531BdI.A00(cls, "camerax.core.imageCapture.captureMode");
        A03 = AbstractC2531BdI.A00(cls, "camerax.core.imageCapture.flashMode");
        A02 = AbstractC2531BdI.A00(BZ0.class, "camerax.core.imageCapture.captureBundle");
        A01 = AbstractC2531BdI.A00(Integer.class, "camerax.core.imageCapture.bufferFormat");
        A09 = AbstractC2531BdI.A00(Integer.class, "camerax.core.imageCapture.outputFormat");
        A08 = AbstractC2531BdI.A00(Integer.class, "camerax.core.imageCapture.maxCaptureStages");
        A06 = AbstractC2531BdI.A00(Bf8.class, "camerax.core.imageCapture.imageReaderProxyProvider");
        A0D = AbstractC2531BdI.A00(Boolean.TYPE, "camerax.core.imageCapture.useSoftwareJpegEncoder");
        A04 = AbstractC2531BdI.A00(cls, "camerax.core.imageCapture.flashType");
        A07 = AbstractC2531BdI.A00(cls, "camerax.core.imageCapture.jpegCompressionQuality");
        A0C = AbstractC2531BdI.A00(InterfaceC2787BlA.class, "camerax.core.imageCapture.screenFlash");
        A0B = AbstractC2531BdI.A00(C2601Bez.class, "camerax.core.useCase.postviewResolutionSelector");
        A0A = AbstractC2531BdI.A00(Boolean.class, "camerax.core.useCase.isPostviewEnabled");
    }

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

    public Bf6(C2584Beg c2584Beg) {
        this.A00 = c2584Beg;
    }

    @Override // X.InterfaceC2585Beh
    public final /* synthetic */ void ABW(InterfaceC2588Bek interfaceC2588Bek, String str) {
        InterfaceC2585Beh.A01(interfaceC2588Bek, this, str);
    }
}
