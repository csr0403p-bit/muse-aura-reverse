package com.facebook.aura.vds.compose.surface;

import X.AKQ;
import X.AX9;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
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
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.vds.compose.theme.AuraContentAlphaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSurfaceKt$AuraSurface$8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ boolean $clipContent;
    public final /* synthetic */ long $color;
    public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ C1EQ $legacyBrush;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSurfaceKt$AuraSurface$8(BRg bRg, boolean z, InterfaceC1072AWd interfaceC1072AWd, boolean z2, Function0<Unit> function0, C1EQ c1eq, long j, C1DH c1dh, C1DM c1dm, boolean z3, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
        super(2);
        this.$modifier = bRg;
        this.$selected = z;
        this.$interactionSource = interfaceC1072AWd;
        this.$enabled = z2;
        this.$onClick = function0;
        this.$legacyBrush = c1eq;
        this.$color = j;
        this.$border = c1dh;
        this.$shape = c1dm;
        this.$clipContent = z3;
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
                objAaT = AuraSurfaceKt$AuraSurface$8$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, true);
            boolean z = this.$selected;
            BRg bRgThen = bRgA0Y.then(new AX9(null, this.$interactionSource, null, this.$onClick, z, false, this.$enabled));
            C1EQ c1eq = this.$legacyBrush;
            boolean zA64 = bfm.A64(this.$color) | bfm.A62(fA02);
            long j = this.$color;
            Object objAaT2 = bfm.AaT();
            if (zA64 || objAaT2 == obj) {
                objAaT2 = new AuraSurfaceKt$AuraSurface$8$2$1(j, fA02);
                bfm.Ai0(objAaT2);
            }
            BRg bRgThen2 = bRg.then(AuraSurfaceKt.surface(bRgThen, c1eq, (Function0) objAaT2, this.$border, this.$shape, this.$clipContent, bfm, 0));
            Alignment alignment = C2VU.A09;
            G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, true);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen2);
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
