package com.facebook.aura.ageverification;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.linktext.HatchInlineLinkTextKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SelfieAgeStepIntroKt {
    public static final String HOW_SELFIES_WORK_LINK_TAG = "how_selfies_work";

    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepIntroKt$SelfieAgeStepIntro$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $picked;
        public final /* synthetic */ SelfieAgeStepViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SelfieAgeStepViewModel selfieAgeStepViewModel, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = selfieAgeStepViewModel;
            this.$picked = z;
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
            SelfieAgeStepIntroKt.SelfieAgeStepIntro(this.$viewModel, this.$picked, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepIntroKt$SelfieIntroText$2, reason: invalid class name and case insensitive filesystem */
    public final class C108872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $picked;
        public final /* synthetic */ SelfieAgeStepViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108872(SelfieAgeStepViewModel selfieAgeStepViewModel, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = selfieAgeStepViewModel;
            this.$picked = z;
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
            SelfieAgeStepIntroKt.SelfieIntroText(this.$viewModel, this.$picked, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SelfieAgeStepIntro(SelfieAgeStepViewModel selfieAgeStepViewModel, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(selfieAgeStepViewModel, 0);
        bfm.AgG(67433978);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(selfieAgeStepViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            C3TH c3th = C2VU.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            BPg.A03(bfm, g0u);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v3);
            C90l c90l = C90l.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90l.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v3);
            SelfieCircleKt.SelfieCircle(c90l, null, ComposableSingletons$SelfieAgeStepIntroKt.f7lambda$215439247, bfm, 390, 1);
            int i5 = iA05 & 14;
            SelfieIntroText(selfieAgeStepViewModel, z, AnonymousClass005.A0T(bfm, c90l.AiP(bs0, 0.5f, false)), bfm, SelfieAgeStepViewModel.$stable | i5 | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            BBI.A0R(bbi, true);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA09 = C3U4.A09(c1062ATq, AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA09);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0v3);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120072);
            boolean z2 = i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(selfieAgeStepViewModel));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new SelfieAgeStepIntroKt$SelfieAgeStepIntro$1$2$1$1(selfieAgeStepViewModel);
                bfm.Ai0(objAaT);
            }
            boolean z3 = false;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, null, null, null, false, false, false, false, false, null, null, (Function0) ((InterfaceC7353EnQ) objAaT), null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134201333);
            if (z) {
                bfm.AgE(-187715925);
            } else {
                bfm.AgE(-187971799);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120077);
                AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
                if (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(selfieAgeStepViewModel))) {
                    z3 = true;
                }
                Object objAaT2 = bfm.AaT();
                if (z3 || objAaT2 == C78N.A00) {
                    objAaT2 = new SelfieAgeStepIntroKt$SelfieAgeStepIntro$1$2$2$1(selfieAgeStepViewModel);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, c1062ATq, auraLabelButtonStyleSecondary, null, null, false, false, false, false, false, null, null, (Function0) ((InterfaceC7353EnQ) objAaT2), null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134201317);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(selfieAgeStepViewModel, z, bRg2, i, i2);
        }
    }

    public static final void SelfieIntroText(SelfieAgeStepViewModel selfieAgeStepViewModel, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        Object[] objArr;
        BRg bRg2 = bRg;
        bfm.AgG(-1797476282);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(selfieAgeStepViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            int i5 = R.string._name_removed__res_0x7f120071;
            if (z) {
                i5 = R.string._name_removed__res_0x7f12043a;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i5);
            if (z) {
                bfm.AgE(-797843362);
                i3 = R.string._name_removed__res_0x7f120074;
                objArr = new Object[]{HatchAppName.value, strA01};
            } else {
                bfm.AgE(-797840183);
                i3 = R.string._name_removed__res_0x7f120070;
                objArr = new Object[]{strA01};
            }
            String strA02 = AbstractC2271BQs.A02(bfm, objArr, i3);
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            long jA07 = C06G.A07(bfm);
            boolean zA1W = AnonymousClass002.A1W(bfm, auraNavigatorA0b, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A65(selfieAgeStepViewModel)), AnonymousClass003.A1K(bfm, strA02, strA01) | bfm.A64(jA07));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = HatchInlineLinkTextKt.m1187buildInlineLinkTextXOJAsU(strA02, strA01, jA07, HOW_SELFIES_WORK_LINK_TAG, new SelfieAgeStepIntroKt$SelfieIntroText$bodyText$1$1(selfieAgeStepViewModel, auraNavigatorA0b));
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(bRg2, f, 0.0f), 0.0f, f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A00, 48);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            int i6 = R.string._name_removed__res_0x7f120073;
            if (z) {
                i6 = R.string._name_removed__res_0x7f120075;
            }
            String strA012 = AbstractC2271BQs.A01(bfm, i6);
            C1822Arm c1822ArmA0U = C06G.A0U(bfm);
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = SelfieAgeStepIntroKt$SelfieIntroText$1$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, AnonymousClass001.A0Y(bs0, objAaT2, false), jA0C, c1822ArmA0U, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, null, C06G.A08(bfm), C06G.A0T(bfm), null, null, new C1YL(3), 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32690);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108872(selfieAgeStepViewModel, z, bRg2, i, i2);
        }
    }
}
