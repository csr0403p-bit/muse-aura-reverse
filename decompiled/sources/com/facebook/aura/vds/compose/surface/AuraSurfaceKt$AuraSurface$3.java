package com.facebook.aura.vds.compose.surface;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0v5;
import X.C0z7;
import X.C1515AkP;
import X.C1DH;
import X.C1DM;
import X.C1EQ;
import X.C1YD;
import X.C2VU;
import X.C3Ue;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC05011Yg;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.vds.compose.theme.AuraContentAlphaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSurfaceKt$AuraSurface$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1DH $border;
    public final /* synthetic */ boolean $clipContent;
    public final /* synthetic */ Function0<B6A> $colorLambda;
    public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC05011Yg $indication;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ C1EQ $legacyBrush;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ Function0<Unit> $onLongClick;
    public final /* synthetic */ String $onLongClickLabel;
    public final /* synthetic */ C1DM $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSurfaceKt$AuraSurface$3(BRg bRg, InterfaceC1072AWd interfaceC1072AWd, InterfaceC05011Yg interfaceC05011Yg, boolean z, String str, String str2, Function0<Unit> function0, Function0<Unit> function02, C1EQ c1eq, Function0<B6A> function03, C1DH c1dh, C1DM c1dm, boolean z2, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
        super(2);
        this.$modifier = bRg;
        this.$interactionSource = interfaceC1072AWd;
        this.$indication = interfaceC05011Yg;
        this.$enabled = z;
        this.$onClickLabel = str;
        this.$onLongClickLabel = str2;
        this.$onLongClick = function0;
        this.$onClick = function02;
        this.$legacyBrush = c1eq;
        this.$colorLambda = function03;
        this.$border = c1dh;
        this.$shape = c1dm;
        this.$clipContent = z2;
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
                objAaT = AuraSurfaceKt$AuraSurface$3$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, true);
            InterfaceC1072AWd interfaceC1072AWd = this.$interactionSource;
            InterfaceC05011Yg interfaceC05011Yg = this.$indication;
            boolean z = this.$enabled;
            BRg bRgThen = bRg.then(C0v5.A00(interfaceC05011Yg, interfaceC1072AWd, bRgA0Y, new C1YD(0), this.$onClickLabel, this.$onLongClickLabel, this.$onLongClick, this.$onClick, z));
            C1EQ c1eq = this.$legacyBrush;
            boolean zA1I = AnonymousClass003.A1I(bfm, this.$colorLambda, fA02);
            Function0<B6A> function0 = this.$colorLambda;
            Object objAaT2 = bfm.AaT();
            if (zA1I || objAaT2 == obj) {
                objAaT2 = new AuraSurfaceKt$AuraSurface$3$2$1(function0, fA02);
                bfm.Ai0(objAaT2);
            }
            BRg bRgSurface = AuraSurfaceKt.surface(bRgThen, c1eq, (Function0) objAaT2, this.$border, this.$shape, this.$clipContent, bfm, 0);
            Alignment alignment = C2VU.A09;
            G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w = this.$content;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, true);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgSurface);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(C0z7.A00, bfm, g0w, 6);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
