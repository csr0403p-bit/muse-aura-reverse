package com.facebook.aura.confidentialvm.view;

import X.AKH;
import X.AKQ;
import X.AbstractC04540eo;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyleConfig;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSupportInvestigatingCardKt {
    public static final C1D3 CardShape = C1D8.A00(16.0f);

    /* renamed from: com.facebook.aura.confidentialvm.view.HatchSupportInvestigatingCardKt$HatchSupportInvestigatingCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContactSupportClick;
        public final /* synthetic */ Function0<Unit> $onRevokeAccessClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onContactSupportClick = function0;
            this.$onRevokeAccessClick = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSupportInvestigatingCardKt.HatchSupportInvestigatingCard(this.$onContactSupportClick, this.$onRevokeAccessClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchSupportInvestigatingCard(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(function0, function02);
        bfm.AgG(-1027378747);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1D3 c1d3 = CardShape;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA0B = C3U4.A0B(C1b8.A01(C11U.A03(AbstractC04540eo.A00(bRg2, c1d3, 8.0f, 4, C06G.A0F(bfm, akh), C06G.A0F(bfm, akh)), c1d3), AnonymousClass001.A0f(bfm, akh).elevated), 0.0f, 16.0f);
            C9m9 c9m9A00 = AcQ.A00(12.0f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B2 = C3U4.A0B(c1062ATq, 16.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 8.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B2);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            BRg bRgA0O = AnonymousClass001.A0O(C90m.A00, bs0, zA1a);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A06, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120622), null, C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12061f), null, C06G.A0I(bfm, akh), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, zA1a);
            AuraIconButtonKt.m2551AuraIconButtonV2X32rcYo(null, BOf.A00(bfm, R.drawable.headphonemic_outline_24_wght400, 0), AuraIconButtonSizeV2.MEDIUM, new AuraIconButtonStyleConfig(C06G.A0G(bfm, akh), AnonymousClass001.A0f(bfm, akh).secondaryButtonBackground, null, zA1a, 0.0f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120620), function0, null, false, null, null, null, null, null, bfm, AnonymousClass001.A08(iA0T << 15, AnonymousClass001.A03()), 0, 8129);
            BBI.A0R(bbi, zA1a);
            long j2 = AnonymousClass001.A0f(bfm, akh).destructiveText;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120621);
            BRg bRgA0B3 = C3U4.A0B(c1062ATq, 16.0f, 0.0f);
            AuraLabelButtonStyle auraLabelButtonStyleA0g = AnonymousClass006.A0g(bfm);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean zA64 = bfm.A64(j2);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = new HatchSupportInvestigatingCardKt$HatchSupportInvestigatingCard$1$2$1(j2);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0B3, auraLabelButtonStyleA0g, auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, (Function0) objAaT, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0T << 9) & 57344, 0, 134070213);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, bRg2, i, i2);
        }
    }
}
