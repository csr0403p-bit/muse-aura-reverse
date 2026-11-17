package com.facebook.aura.vds.compose.surface;

import X.AKQ;
import X.AaM;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00x;
import X.C0z7;
import X.C1515AkP;
import X.C1DH;
import X.C1DM;
import X.C1EQ;
import X.C2VU;
import X.C3Ue;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.vds.compose.theme.AuraContentAlphaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSurfaceKt$AuraSurface$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ boolean $clipContent;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
    public final /* synthetic */ C1EQ $legacyBrush;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSurfaceKt$AuraSurface$5(BRg bRg, C1EQ c1eq, long j, C1DH c1dh, C1DM c1dm, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
        super(2);
        this.$modifier = bRg;
        this.$legacyBrush = c1eq;
        this.$color = j;
        this.$border = c1dh;
        this.$shape = c1dm;
        this.$clipContent = z;
        this.$content = g0w;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            float fA02 = AnonymousClass001.A02(bfm.A6v(AuraContentAlphaKt.LocalAuraContentAlpha));
            BRg bRg = this.$modifier;
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AuraSurfaceKt$AuraSurface$5$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, false);
            Unit unit = Unit.INSTANCE;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new PointerInputEventHandler() { // from class: com.facebook.aura.vds.compose.surface.AuraSurfaceKt$AuraSurface$5$2$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return Unit.INSTANCE;
                    }
                };
                bfm.Ai0(objAaT2);
            }
            BRg bRgThen = bRg.then(AaM.A00(bRgA0Y, (PointerInputEventHandler) objAaT2, unit));
            C1EQ c1eq = this.$legacyBrush;
            boolean zA64 = bfm.A64(this.$color) | bfm.A62(fA02);
            long j = this.$color;
            Object objAaT3 = bfm.AaT();
            if (zA64 || objAaT3 == obj) {
                objAaT3 = new AuraSurfaceKt$AuraSurface$5$3$1(j, fA02);
                bfm.Ai0(objAaT3);
            }
            BRg bRgSurface = AuraSurfaceKt.surface(bRgThen, c1eq, (Function0) objAaT3, this.$border, this.$shape, this.$clipContent, bfm, 0);
            Alignment alignment = C2VU.A09;
            G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, true);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgSurface);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(C0z7.A00, bfm, g0w, 6);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
