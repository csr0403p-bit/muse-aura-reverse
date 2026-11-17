package com.facebook.aura.subscription.view;

import X.AKQ;
import X.AVy;
import X.AbstractC1103AYp;
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
import X.AxM;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1SA;
import X.C1YL;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel;
import com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics;
import com.facebook.aura.subscription.repo.ComplimentaryRedeemPage;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraComplimentaryRedeemScreenKt {

    /* renamed from: com.facebook.aura.subscription.view.AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ComplimentaryRedeemEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, BRg bRg, int i, int i2) {
            super(2);
            this.$entryPoint = complimentaryRedeemEntryPoint;
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
            AuraComplimentaryRedeemScreenKt.AuraComplimentaryRedeemScreen(this.$entryPoint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRedeem;
        public final /* synthetic */ AuraComplimentaryRedeemViewModel.UiState.Ready $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraComplimentaryRedeemViewModel.UiState.Ready ready, Function0<Unit> function0) {
            super(4);
            this.$state = ready;
            this.$onRedeem = function0;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2271invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2271invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            C3TH c3th = C2VU.A00;
            AuraComplimentaryRedeemViewModel.UiState.Ready ready = this.$state;
            Function0<Unit> function0 = this.$onRedeem;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraComplimentaryRedeemScreenKt.m2267ComplimentaryRedeemBodyuFdPcIQ(ready.page, f, C90l.A00.AiP(bs0, 1.0f, true), bfm, (iA04 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            AuraComplimentaryRedeemScreenKt.m2268ComplimentaryRedeemFooterhGBTI10(ready.page, ready.isRedeeming, function0, f2, null, bfm, (iA04 << 6) & 7168, 16);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Map<String, String> $analyticsMetadata;
        public final /* synthetic */ ComplimentaryRedeemAnalytics.Attribution $attribution;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onDismissFailure;
        public final /* synthetic */ Function0<Unit> $onRedeem;
        public final /* synthetic */ AuraComplimentaryRedeemViewModel.UiState.Ready $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraComplimentaryRedeemViewModel.UiState.Ready ready, ComplimentaryRedeemAnalytics.Attribution attribution, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$state = ready;
            this.$attribution = attribution;
            this.$analyticsMetadata = map;
            this.$onBack = function0;
            this.$onRedeem = function02;
            this.$onDismissFailure = function03;
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
            AuraComplimentaryRedeemScreenKt.ComplimentaryRedeemContent(this.$state, this.$attribution, this.$analyticsMetadata, this.$onBack, this.$onRedeem, this.$onDismissFailure, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraComplimentaryRedeemScreenKt$ComplimentarySubscriptionRedeemFailedDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C141791 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141791(Function0<Unit> function0) {
            super(2);
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA65 = bfm.A65(this.$onDismiss);
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new AuraComplimentaryRedeemScreenKt$ComplimentarySubscriptionRedeemFailedDialog$1$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraComplimentaryRedeemScreenKt$ComplimentarySubscriptionRedeemFailedDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C141802 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141802(Function0<Unit> function0, BRg bRg, int i, int i2) {
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
            AuraComplimentaryRedeemScreenKt.ComplimentarySubscriptionRedeemFailedDialog(this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraComplimentaryRedeemScreen(ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(complimentaryRedeemEntryPoint, 0);
        bfm.AgG(-254666597);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, complimentaryRedeemEntryPoint) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraComplimentaryRedeemViewModel.Factory factory = new AuraComplimentaryRedeemViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            AuraComplimentaryRedeemViewModel auraComplimentaryRedeemViewModel = (AuraComplimentaryRedeemViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(AuraComplimentaryRedeemViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, auraComplimentaryRedeemViewModel.uiState);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            ComplimentaryRedeemAnalytics complimentaryRedeemAnalytics = ComplimentaryRedeemAnalytics.INSTANCE;
            ComplimentaryRedeemAnalytics.Attribution attribution = complimentaryRedeemAnalytics.attribution(complimentaryRedeemEntryPoint);
            int i4 = iA08 & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = complimentaryRedeemAnalytics.metadata(complimentaryRedeemEntryPoint);
                bfm.Ai0(objAaT);
            }
            Map map = (Map) objAaT;
            AuraComplimentaryRedeemViewModel.UiState uiState = (AuraComplimentaryRedeemViewModel.UiState) c1boA02.getValue();
            if (C7384Etj.areEqual(uiState, AuraComplimentaryRedeemViewModel.UiState.Loading.INSTANCE)) {
                HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass002.A0R(bRg2, bfm, 78557781), bfm, 0, 0);
            } else if (C7384Etj.areEqual(uiState, AuraComplimentaryRedeemViewModel.UiState.Closed.INSTANCE)) {
                bfm.AgE(78561711);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A17(bfm, objAaT2, unit);
            } else {
                if (!(uiState instanceof AuraComplimentaryRedeemViewModel.UiState.Ready)) {
                    throw AnonymousClass005.A0k(bfm, 78556182);
                }
                bfm.AgE(78567493);
                AuraComplimentaryRedeemViewModel.UiState.Ready ready = (AuraComplimentaryRedeemViewModel.UiState.Ready) uiState;
                boolean zA1S = AnonymousClass005.A1S(bfm, attribution, map, auraNavigatorA0b);
                Object objAaT3 = bfm.AaT();
                if (zA1S || objAaT3 == C78N.A00) {
                    objAaT3 = new AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$2$1(attribution, map, auraNavigatorA0b);
                    bfm.Ai0(objAaT3);
                }
                Function0 function0 = (Function0) objAaT3;
                boolean zA1S2 = AnonymousClass005.A1S(bfm, attribution, map, auraComplimentaryRedeemViewModel) | AnonymousClass002.A1Q(i4, 4);
                Object objAaT4 = bfm.AaT();
                if (zA1S2 || objAaT4 == C78N.A00) {
                    objAaT4 = new AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$3$1(attribution, map, auraComplimentaryRedeemViewModel, complimentaryRedeemEntryPoint);
                    bfm.Ai0(objAaT4);
                }
                Function0 function02 = (Function0) objAaT4;
                boolean zA672 = bfm.A67(auraComplimentaryRedeemViewModel);
                Object objAaT5 = bfm.AaT();
                if (zA672 || objAaT5 == C78N.A00) {
                    objAaT5 = new AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$4$1(auraComplimentaryRedeemViewModel);
                    bfm.Ai0(objAaT5);
                }
                ComplimentaryRedeemContent(ready, attribution, map, function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT5), bRg2, bfm, AnonymousClass006.A04(AuraComplimentaryRedeemViewModel.UiState.Ready.$stable, ComplimentaryRedeemAnalytics.Attribution.$stable << 3, iA08), 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(complimentaryRedeemEntryPoint, bRg2, i, i2);
        }
    }

    /* renamed from: ComplimentaryRedeemBody-uFdPcIQ, reason: not valid java name */
    public static final void m2267ComplimentaryRedeemBodyuFdPcIQ(ComplimentaryRedeemPage complimentaryRedeemPage, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(206764447);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, complimentaryRedeemPage) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA02 = AbstractC1103AYp.A02(AbstractC1103AYp.A00(0, bfm, 0, 1), bRg2, true);
            float f2 = AuraDimensKt.SpacingLarge;
            BRg bRgA0B = C3U4.A0B(bRgA02, f2, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, f);
            C1SA.A00(bfm, null, C10G.A0C(bs0, 204.0f, 120.0f), null, BOf.A00(bfm, R.drawable.hatch_invite_gift_illustration, 0), null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A08(bfm, bs0, f2);
            AuraTextKt.m2639AuraTextUY9GdpU(complimentaryRedeemPage.body, C10G.A02, C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            C01N.A04(bfm, bbi, bs0, f2, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemBody$2(complimentaryRedeemPage, f, bRg2, i, i2);
        }
    }

    public static final void ComplimentaryRedeemContent(AuraComplimentaryRedeemViewModel.UiState.Ready ready, ComplimentaryRedeemAnalytics.Attribution attribution, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2131758117);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ready, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(attribution, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(map, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function03);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (ready.showFailure) {
                bfm.AgE(1819966730);
                ComplimentarySubscriptionRedeemFailedDialog(function03, null, bfm, (iA05 >> 15) & 14, 2);
            } else {
                bfm.AgE(1820046493);
            }
            boolean zA1V = AnonymousClass001.A1V(bfm);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, HatchImpressionModifierKt.hatchImpression(bRg2, attribution.origin, attribution.surface, attribution.subsurface, attribution.screen, HatchComponent.REDEEM_COMPLIMENTARY_SUBSCRIPTION_SCREEN, null, map, null, 500L, 0.0f, null, null, null), AuraContentRole.Focused, 0L, ready.page.title, null, function0, null, zA1V, zA1V, zA1V ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1V ? 1 : 0, null, null, null, zA1V, B1V.A00(bfm, new AnonymousClass1(ready, function02), -1007821974), bfm, ((iA05 << 9) & 3670016) | 390, zA1V ? 1 : 0, 805306368, 536870824);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ready, attribution, map, function0, function02, function03, bRg2, i, i2);
        }
    }

    /* renamed from: ComplimentaryRedeemFooter-hGBTI10, reason: not valid java name */
    public static final void m2268ComplimentaryRedeemFooterhGBTI10(ComplimentaryRedeemPage complimentaryRedeemPage, boolean z, Function0<Unit> function0, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1379703198);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, complimentaryRedeemPage) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA01 = C1b8.A01(bRg2.then(c1062ATq), C06G.A0B(bfm));
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, i4);
            Disclaimer disclaimer = complimentaryRedeemPage.disclaimer;
            HatchScreen hatchScreen = HatchScreen.REDEEM_COMPLIMENTARY_SUBSCRIPTION;
            BS0 bs0 = BRg.A00;
            float f2 = AuraDimensKt.SpacingLarge;
            AuraSubscriptionPaywallBottomSheetKt.PaywallLegalClause(disclaimer, hatchScreen, C3U4.A0B(c1062ATq, f2, 0.0f), bfm, 48, 0);
            BRg bRgA0C = C3U4.A0C(c1062ATq, f2, AuraDimensKt.SpacingMedium, f2, 0.0f);
            boolean zA1F = AnonymousClass004.A1F(iA0d) | AnonymousClass003.A1C(iA0d) | ((iA0d & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemFooter$1$1$1(complimentaryRedeemPage, z, function0);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA0C, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582912, 126);
            C01N.A04(bfm, bbi, bs0, f2 + f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemFooter$2(complimentaryRedeemPage, z, function0, f, bRg2, i, i2);
        }
    }

    public static final void ComplimentarySubscriptionRedeemFailedDialog(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(1153881140);
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
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210bb), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210ba), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C141791(function0), -1208534075), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0T >> 3) & 14) | 196608 | ((iA0T << 18) & 3670016), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141802(function0, bRg2, i, i2);
        }
    }
}
