package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.0v5, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0v5 {
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/AWd;LX/1Yg;ZLjava/lang/String;LX/1YD;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)LX/BRg; */
    public static final BRg A01(final InterfaceC05011Yg interfaceC05011Yg, InterfaceC1072AWd interfaceC1072AWd, BRg bRg, final C1YD c1yd, final String str, final Function0 function0, final boolean z) {
        BRg bRgA02;
        C3UH c3uh;
        if (interfaceC05011Yg instanceof C3UH) {
            c3uh = (C3UH) interfaceC05011Yg;
        } else {
            if (interfaceC05011Yg != null) {
                if (interfaceC1072AWd != null) {
                    bRgA02 = C0yB.A00(interfaceC05011Yg, interfaceC1072AWd, BRg.A00).then(new AXA(null, interfaceC1072AWd, c1yd, str, function0, false, z));
                } else {
                    bRgA02 = AxM.A02(BRg.A00, AbstractC2139Az7.A00, new G0W<BRg, BFM, Integer, BRg>() { // from class: X.0v4
                        @Override // X.G0W
                        public final /* bridge */ /* synthetic */ BRg invoke(BRg bRg2, BFM bfm, Integer num) {
                            BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
                            bfmA0P.AgE(-1525724089);
                            InterfaceC1072AWd interfaceC1072AWd2 = (InterfaceC1072AWd) AnonymousClass005.A0d(bfmA0P);
                            BRg bRgA00 = C0yB.A00(interfaceC05011Yg, interfaceC1072AWd2, BRg.A00);
                            boolean z2 = z;
                            BRg bRgThen = bRgA00.then(new AXA(null, interfaceC1072AWd2, c1yd, str, function0, false, z2));
                            AnonymousClass001.A1D(bfmA0P);
                            return bRgThen;
                        }
                    });
                }
                return bRg.then(bRgA02);
            }
            c3uh = null;
        }
        bRgA02 = new AXA(c3uh, interfaceC1072AWd, c1yd, str, function0, false, z);
        return bRg.then(bRgA02);
    }

    public static final BRg A03(BRg bRg, C1YD c1yd, String str, Function0 function0, Function0 function02, boolean z) {
        return bRg.then(new AXB(null, null, c1yd, null, str, function02, function0, true, z));
    }

    public static final BRg A04(BRg bRg, C1YD c1yd, String str, Function0 function0, boolean z) {
        return bRg.then(new AXA(null, null, c1yd, str, function0, true, z));
    }

    public static BRg A05(BRg bRg, String str, Function0 function0, boolean z) {
        return A04(bRg, new C1YD(0), str, function0, z);
    }

    public static final BRg A00(final InterfaceC05011Yg interfaceC05011Yg, InterfaceC1072AWd interfaceC1072AWd, BRg bRg, final C1YD c1yd, final String str, final String str2, final Function0 function0, final Function0 function02, final boolean z) {
        BRg bRgA02;
        C3UH c3uh;
        if (interfaceC05011Yg instanceof C3UH) {
            c3uh = (C3UH) interfaceC05011Yg;
        } else {
            if (interfaceC05011Yg != null) {
                BS0 bs0 = BRg.A00;
                if (interfaceC1072AWd != null) {
                    bRgA02 = C0yB.A00(interfaceC05011Yg, interfaceC1072AWd, bs0).then(new AXB(null, interfaceC1072AWd, c1yd, str, str2, function02, function0, false, z));
                } else {
                    bRgA02 = AxM.A02(bs0, AbstractC2139Az7.A00, new G0W<BRg, BFM, Integer, BRg>() { // from class: X.0v6
                        @Override // X.G0W
                        public final /* bridge */ /* synthetic */ BRg invoke(BRg bRg2, BFM bfm, Integer num) {
                            BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
                            bfmA0P.AgE(-1525724089);
                            InterfaceC1072AWd interfaceC1072AWd2 = (InterfaceC1072AWd) AnonymousClass005.A0d(bfmA0P);
                            BRg bRgA00 = C0yB.A00(interfaceC05011Yg, interfaceC1072AWd2, BRg.A00);
                            boolean z2 = z;
                            String str3 = str;
                            BRg bRgThen = bRgA00.then(new AXB(null, interfaceC1072AWd2, c1yd, str3, str2, function02, function0, false, z2));
                            AnonymousClass001.A1D(bfmA0P);
                            return bRgThen;
                        }
                    });
                }
                return bRg.then(bRgA02);
            }
            c3uh = null;
        }
        bRgA02 = new AXB(c3uh, interfaceC1072AWd, c1yd, str, str2, function02, function0, false, z);
        return bRg.then(bRgA02);
    }

    public static BRg A02(BRg bRg, C1YD c1yd, Object obj, String str) {
        return A04(bRg, c1yd, str, (Function0) obj, true);
    }
}
