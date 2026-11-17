package com.facebook.aura.vds.compose.icons;

import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
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
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C2VU;
import X.C3Ue;
import X.F60;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraIconButtonKt$AuraIconButtonV2$9 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ AVy $iconPainter;
    public final /* synthetic */ B6A $overrideIconColor;
    public final /* synthetic */ C1DG $overrideIconSize;
    public final /* synthetic */ AuraIconButtonSizeV2 $size;
    public final /* synthetic */ String $testTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraIconButtonKt$AuraIconButtonV2$9(AuraIconButtonSizeV2 auraIconButtonSizeV2, String str, C1DG c1dg, AVy aVy, B6A b6a) {
        super(3);
        this.$size = auraIconButtonSizeV2;
        this.$testTag = str;
        this.$overrideIconSize = c1dg;
        this.$iconPainter = aVy;
        this.$overrideIconColor = b6a;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        BRg bRgA00;
        float fM2555iconSizeD9Ej5fM;
        long jM2544applyContentAlphaek8zF_U;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BRg bRgA002 = BRg.A00;
            BRg bRgA07 = C10G.A07(bRgA002, this.$size.m2554buttonSizeD9Ej5fM());
            String str = this.$testTag;
            if (str != null) {
                bRgA00 = AbstractC07539Wl.A00(bRgA002, str);
            } else {
                bRgA00 = bRgA002;
            }
            BRg bRgThen = bRgA07.then(bRgA00);
            Alignment alignment = C2VU.A09;
            C1DG c1dg = this.$overrideIconSize;
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = this.$size;
            AVy aVy = this.$iconPainter;
            B6A b6a = this.$overrideIconColor;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            if (c1dg != null) {
                fM2555iconSizeD9Ej5fM = c1dg.A00;
            } else {
                fM2555iconSizeD9Ej5fM = auraIconButtonSizeV2.m2555iconSizeD9Ej5fM();
            }
            BRg bRgA072 = C10G.A07(bRgA002, fM2555iconSizeD9Ej5fM);
            if (str != null) {
                bRgA002 = AbstractC07539Wl.A00(bRgA002, str);
            }
            BRg bRgThen2 = bRgA072.then(bRgA002);
            if (b6a == null) {
                bfm.AgE(652184935);
                jM2544applyContentAlphaek8zF_U = ColorExtKt.m2544applyContentAlphaek8zF_U(AuraTheme.INSTANCE.getContentColor(bfm, 6), bfm, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(652183571);
                BBI.A0R(bbi, false);
                jM2544applyContentAlphaek8zF_U = b6a.A00;
            }
            AuraIconKt.m2569AuraIconInternalcf5BqRc(bRgThen2, aVy, jM2544applyContentAlphaek8zF_U, null, bfm, AVy.$stable << 3, 8);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
