package com.facebook.aura.activation.view;

import X.AKH;
import X.AKQ;
import X.ARD;
import X.AYW;
import X.AbstractC04540eo;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0861A6i;
import X.C0v5;
import X.C1067ATw;
import X.C10G;
import X.C11N;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1YD;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.model.InviteTooltipViewModel;
import com.facebook.aura.header.view.HeaderButtonKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraShapes;
import com.facebook.aura.vds.compose.theme.AuraShapesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchInviteButtonTooltipKt {
    public static final C1067ATw TooltipPointer = new C1067ATw(HatchInviteButtonTooltipKt$TooltipPointer$1.INSTANCE);

    /* renamed from: com.facebook.aura.activation.view.HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<Function0<Unit>, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z, BRg bRg, G0W<? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInviteButtonTooltipKt.HatchInviteButtonTooltip(this.$enabled, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.HatchInviteButtonTooltipKt$InviteTooltipBubble$3, reason: invalid class name and case insensitive filesystem */
    public final class C107273 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107273(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onDismiss = function0;
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
            HatchInviteButtonTooltipKt.InviteTooltipBubble(this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchInviteButtonTooltip(boolean z, BRg bRg, G0W<? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0w, 2);
        bfm.AgG(486988912);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InviteTooltipViewModel.Factory factory = new InviteTooltipViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            InviteTooltipViewModel inviteTooltipViewModel = (InviteTooltipViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(InviteTooltipViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, inviteTooltipViewModel.visible);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA67 = bfm.A67(inviteTooltipViewModel) | AnonymousClass003.A1B(iA0n);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$1$1(inviteTooltipViewModel, z);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, inviteTooltipViewModel, boolValueOf);
            boolean zA672 = bfm.A67(inviteTooltipViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$dismiss$1$1(inviteTooltipViewModel);
                bfm.Ai0(objAaT2);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT2;
            int i4 = iA0n >> 3;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0D);
            AnonymousClass001.A1G(interfaceC7353EnQ, bfm, g0w, i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            if (C1BO.A0F(c1boA02)) {
                bfm.AgE(-888265813);
                AYW.A00(bfm, C2VU.A0D, new C11N(false), (Function0) interfaceC7353EnQ, B1V.A00(bfm, new HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$2$2(interfaceC7353EnQ), 1520057550), 27654, 0, (0 << 32) | (Integer.valueOf(AnonymousClass002.A0Y(bfm).Abr(HeaderButtonKt.PillIconTouchTarget)).intValue() & 4294967295L));
            } else {
                bfm.AgE(-887957332);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, bRg2, g0w, i, i2);
        }
    }

    public static final void InviteTooltipBubble(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1064018366);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long jA0C = C06G.A0C(bfm);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "hatch-invite-button-tooltip");
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchInviteButtonTooltipKt$InviteTooltipBubble$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(ARD.A01(bRgA00, (G0U) objAaT, false), new C1YD(0), null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, C2VU.A01);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            float f = HeaderButtonKt.PillIconTouchTarget;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bs0, 0.0f, 0.0f, (f - f2) / 2.0f, 0.0f);
            float f3 = AuraDimensKt.SpacingMicroPlusNano;
            C3Ue.A04(C1b8.A03(C10G.A0C(bRgA0C, f2, f3), TooltipPointer, jA0C), bfm, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120432);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            long j = AnonymousClass002.A0c(bfm).invertedText;
            AKH<AuraShapes> akh = AuraShapesKt.LocalAuraShapes;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(C11U.A04(AbstractC04540eo.A00(bs0, ((AuraShapes) bfm.A6v(akh)).tooltip, f3, 28, 0L, 0L), ((AuraShapes) bfm.A6v(akh)).tooltip, jA0C), f2, AuraDimensKt.SpacingXsmall), j, c1822ArmA0Z, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107273(function0, bRg2, i, i2);
        }
    }
}
