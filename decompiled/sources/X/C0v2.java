package X;

/* renamed from: X.0v2, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0v2 {
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;ZLX/AWd;LX/1Yg;ZLX/1YD;LX/G0U<-Ljava/lang/Boolean;Lkotlin/Unit;>;)LX/BRg; */
    public static final BRg A00(final InterfaceC05011Yg interfaceC05011Yg, InterfaceC1072AWd interfaceC1072AWd, BRg bRg, final C1YD c1yd, final G0U g0u, final boolean z, final boolean z2) {
        BRg bRgA02;
        C3UH c3uh;
        if (interfaceC05011Yg instanceof C3UH) {
            c3uh = (C3UH) interfaceC05011Yg;
        } else {
            if (interfaceC05011Yg != null) {
                if (interfaceC1072AWd != null) {
                    bRgA02 = C0yB.A00(interfaceC05011Yg, interfaceC1072AWd, BRg.A00).then(new AXC(null, interfaceC1072AWd, c1yd, g0u, z, false, z2));
                } else {
                    bRgA02 = AxM.A02(BRg.A00, AbstractC2139Az7.A00, new G0W<BRg, BFM, Integer, BRg>() { // from class: X.0v3
                        @Override // X.G0W
                        public final /* bridge */ /* synthetic */ BRg invoke(BRg bRg2, BFM bfm, Integer num) {
                            BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
                            bfmA0P.AgE(-1525724089);
                            InterfaceC1072AWd interfaceC1072AWd2 = (InterfaceC1072AWd) AnonymousClass005.A0d(bfmA0P);
                            BRg bRgThen = C0yB.A00(interfaceC05011Yg, interfaceC1072AWd2, BRg.A00).then(new AXC(null, interfaceC1072AWd2, c1yd, g0u, z, false, z2));
                            AnonymousClass001.A1D(bfmA0P);
                            return bRgThen;
                        }
                    });
                }
                return bRg.then(bRgA02);
            }
            c3uh = null;
        }
        bRgA02 = new AXC(c3uh, interfaceC1072AWd, c1yd, g0u, z, false, z2);
        return bRg.then(bRgA02);
    }

    public static final BRg A01(BRg bRg, C1YD c1yd, G0U g0u, boolean z, boolean z2) {
        return bRg.then(new AXC(null, null, c1yd, g0u, z, true, z2));
    }
}
