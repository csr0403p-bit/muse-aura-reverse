package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchFeedbackSheetKt$HatchFeedbackSheet$3$1$3 extends AbstractC7559F3s implements G0W<G0V<? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ MutableState<String> $comment$delegate;
    public final /* synthetic */ AuraTypography $typography;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFeedbackSheetKt$HatchFeedbackSheet$3$1$3(AuraColors auraColors, AuraTypography auraTypography, MutableState<String> mutableState) {
        super(3);
        this.$colors = auraColors;
        this.$typography = auraTypography;
        this.$comment$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(G0V<? super BFM, ? super Integer, ? extends Unit> g0v, BFM bfm, Integer num) {
        invoke((G0V<? super BFM, ? super Integer, Unit>) g0v, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        int iA0T = i;
        C7384Etj.A0Y(g0v, 0);
        if ((i & 6) == 0) {
            iA0T = i | AnonymousClass004.A0T(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            BRg bRgA01 = C11U.A01(C10G.A02, 24.0f);
            AuraColors auraColors = this.$colors;
            BRg bRgA09 = C3U4.A09(C1b8.A01(bRgA01, auraColors.background), AuraDimensKt.SpacingMedium);
            Alignment alignment = C2VU.A0B;
            AuraTypography auraTypography = this.$typography;
            MutableState<String> mutableState = this.$comment$delegate;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA012, iA0J);
            if (MutableState.A01((MutableState) mutableState) == 0) {
                bfm.AgE(-1212284413);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209d9), null, auraColors.secondaryText, auraTypography.bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(-1212068653);
            }
            BBI.A0R(bbi, false);
            AnonymousClass005.A0q(bbi, bfm, g0v, iA0T);
            return;
        }
        bfm.Afo();
    }
}
