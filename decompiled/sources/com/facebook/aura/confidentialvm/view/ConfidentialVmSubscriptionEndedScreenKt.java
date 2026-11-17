package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1SA;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.icu.text.CompactDecimalFormat;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel;
import com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSubscriptionEndedScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedScreenKt$ConfidentialVmSubscriptionEndedScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel) {
            super(2);
            this.$viewModel = confidentialVmSubscriptionEndedViewModel;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(confidentialVmSubscriptionEndedViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmSubscriptionEndedScreenKt$ConfidentialVmSubscriptionEndedScreen$2$1$1(confidentialVmSubscriptionEndedViewModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(confidentialVmSubscriptionEndedViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConfidentialVmSubscriptionEndedScreenKt$ConfidentialVmSubscriptionEndedScreen$2$2$1(confidentialVmSubscriptionEndedViewModel2);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel3 = this.$viewModel;
                boolean zA673 = bfm.A67(confidentialVmSubscriptionEndedViewModel3);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConfidentialVmSubscriptionEndedScreenKt$ConfidentialVmSubscriptionEndedScreen$2$3$1(confidentialVmSubscriptionEndedViewModel3);
                    bfm.Ai0(objAaT3);
                }
                ConfidentialVmOverflowMenuKt.ConfidentialVmOverflowMenu(function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT3), null, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedScreenKt$ConfidentialVmSubscriptionEndedScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<Long> $topupBalance$delegate;
        public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, C1BO<Long> c1bo) {
            super(4);
            this.$viewModel = confidentialVmSubscriptionEndedViewModel;
            this.$topupBalance$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m474invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m474invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel = this.$viewModel;
            C1BO<Long> c1bo = this.$topupBalance$delegate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA0T = AnonymousClass005.A0T(bfm, AnonymousClass001.A0N(C90l.A00, bs0, true));
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0B = C3U4.A0B(bRgA0T, f3, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A00, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            C1SA.A00(bfm, null, C10G.A07(bs0, 64.0f), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 432, 120);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12075a);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
            long jA0C = C06G.A0C(bfm);
            BRg bRgA0C = C3U4.A0C(C10G.A02, 0.0f, AuraDimensKt.SpacingLargePlusMicro, 0.0f, 0.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConfidentialVmSubscriptionEndedScreenKt$ConfidentialVmSubscriptionEndedScreen$3$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            ConfidentialVmSubscriptionEndedScreenKt.SubscriptionEndedConsequences(ConfidentialVmSubscriptionEndedScreenKt.ConfidentialVmSubscriptionEndedScreen$lambda$0(c1bo), C3U4.A0B(bs0, 0.0f, f3), bfm, 0, 0);
            BBI.A0R(bbi, true);
            ConfidentialVmSubscriptionEndedActionsKt.SubscriptionEndedActions(confidentialVmSubscriptionEndedViewModel, C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, f2), null, bfm, ConfidentialVmSubscriptionEndedViewModel.$stable, 4);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedScreenKt$ConfidentialVmSubscriptionEndedScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmSubscriptionEndedViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSubscriptionEndedScreenKt.ConfidentialVmSubscriptionEndedScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedScreenKt$SubscriptionEndedConsequences$2, reason: invalid class name and case insensitive filesystem */
    public final class C112772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ long $topupBalance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112772(long j, BRg bRg, int i, int i2) {
            super(2);
            this.$topupBalance = j;
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
            ConfidentialVmSubscriptionEndedScreenKt.SubscriptionEndedConsequences(this.$topupBalance, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmSubscriptionEndedScreen(X.BRg r42, com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel r43, X.BFM r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSubscriptionEndedScreenKt.ConfidentialVmSubscriptionEndedScreen(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel, X.BFM, int, int):void");
    }

    public static final void SubscriptionEndedConsequences(long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1487296462);
        int iA0M = (i & 6) == 0 ? i | AnonymousClass004.A0M(bfm, j) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0M |= 48;
        } else if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0M & 19, 18), bfm, iA0M)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(bRg2, AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120758);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120757);
            C0881AGi c0881AGi = C0881AGi.A00;
            ConfidentialVmBenefitsKt.ConfidentialVmBenefit(R.drawable.aiincognito_outline_24_wght400, strA01, new ApQ(strA012, c0881AGi), null, bfm, 0, 8);
            if (j > 0) {
                bfm.AgE(-1674705425);
                Locale localeA0b = AnonymousClass007.A0b(bfm);
                boolean zA1R = AnonymousClass001.A1R(bfm, localeA0b, AnonymousClass003.A1B(iA0M));
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = CompactDecimalFormat.getInstance(localeA0b, CompactDecimalFormat.CompactStyle.SHORT).format(j);
                    bfm.Ai0(objAaT);
                }
                int i4 = (int) (j > 2147483647L ? 2147483647L : j);
                C7384Etj.A0X(objAaT);
                ConfidentialVmBenefitsKt.ConfidentialVmBenefit(R.drawable.coinstack_outline_24_wght400, AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100020, new Object[]{objAaT}, bfm, i4), AnonymousClass006.A0Z(bfm, c0881AGi, R.string._name_removed__res_0x7f12075b), null, bfm, 0, 8);
            } else {
                bfm.AgE(-1673945274);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112772(j, bRg2, i, i2);
        }
    }

    public static final long ConfidentialVmSubscriptionEndedScreen$lambda$0(C1BO<Long> c1bo) {
        return c1bo.getValue().longValue();
    }
}
