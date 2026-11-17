package com.facebook.aura.vds.compose.button;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C02i;
import X.C1515AkP;
import X.C1AC;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraElevatedButtonKt$AuraPillSurface$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ float $paddingHorizontal;
    public final /* synthetic */ float $paddingVertical;
    public final /* synthetic */ boolean $setDefaultMinHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraElevatedButtonKt$AuraPillSurface$1(boolean z, float f, float f2, G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(3);
        this.$setDefaultMinHeight = z;
        this.$paddingHorizontal = f;
        this.$paddingVertical = f2;
        this.$content = g0v;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        C7384Etj.A0Y(interfaceC05151eP, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, interfaceC05151eP);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA4C = interfaceC05151eP.A4C(C2VU.A09, bs0);
            if (this.$setDefaultMinHeight) {
                bRgA4C = bRgA4C.then(AnonymousClass001.A0V(bs0, AuraElevatedButtonKt.PILL_MIN_HEIGHT));
            }
            BRg bRgA0B = C3U4.A0B(bRgA4C, this.$paddingHorizontal, this.$paddingVertical);
            C1AC c1ac = C2VU.A04;
            C02i c02i = AcQ.A02;
            G0V<BFM, Integer, Unit> g0v = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c02i, bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1H(bfm, g0v, 0);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
