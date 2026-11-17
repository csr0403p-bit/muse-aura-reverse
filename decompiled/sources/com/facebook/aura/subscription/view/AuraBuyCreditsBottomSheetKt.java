package com.facebook.aura.subscription.view;

import X.AHD;
import X.AKO;
import X.AKQ;
import X.ARK;
import X.AX9;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO4;
import X.BO6;
import X.BOI;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C08R;
import X.C0953AJg;
import X.C0jP;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1YL;
import X.C1qN;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C8j4;
import X.C8j5;
import X.C90l;
import X.C98b;
import X.C98c;
import X.C98d;
import X.C98e;
import X.C98f;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1072AWd;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.iap.HatchSubscriptionPurchase;
import com.facebook.aura.linktext.HatchInlineLinkTextKt;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel;
import com.facebook.aura.status.viewmodel.CreditProduct;
import com.facebook.aura.subscription.model.CheckoutNotice;
import com.facebook.aura.subscription.repo.CurrencyAmount;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.subscription.repo.DisclaimerRun;
import com.facebook.aura.subscription.repo.SubscriptionBillingCapabilityKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraBuyCreditsBottomSheetKt {
    public static final String TAG = "AuraBuyCreditsBottomSheet";

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraBuyCreditsViewModel $buyCreditsViewModel;
        public final /* synthetic */ C98f $entrypoint;
        public final /* synthetic */ String $prevSurface;
        public final /* synthetic */ MutableState<String> $selectedProductId$delegate;
        public final /* synthetic */ C1BO<AuraBuyCreditsViewModel.UiState> $uiState$delegate;
        public final /* synthetic */ HatchNMEGaiWaterfallEventLogger $waterfallLogger;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            boolean z;
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(c1062ATq.then(C10G.A00), AuraDimensKt.SpacingMedium);
            AuraBuyCreditsViewModel auraBuyCreditsViewModel = this.$buyCreditsViewModel;
            C1BO<AuraBuyCreditsViewModel.UiState> c1bo = this.$uiState$delegate;
            MutableState<String> mutableState = this.$selectedProductId$delegate;
            HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger = this.$waterfallLogger;
            C98f c98f = this.$entrypoint;
            String str = this.$prevSurface;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            if (c1bo.getValue().isLoading) {
                bfm.AgE(-1845216443);
                z = true;
                BRg bRgA012 = ARK.A01(c1062ATq, 1.0f, true);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA012);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            } else {
                if (c1bo.getValue().error != null) {
                    bfm.AgE(-1845005922);
                    HatchSubsurface hatchSubsurface = HatchSubsurface.CREDITS_SHEET;
                    HatchScreen hatchScreen = HatchScreen.BUY_MORE_CREDITS;
                    boolean zA67 = bfm.A67(auraBuyCreditsViewModel);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$10$1$2$1(auraBuyCreditsViewModel);
                        BBI.A0O(bbi, objAaT);
                    }
                    z = true;
                    SubscriptionSheetHelpersKt.SubscriptionLoadError(hatchSubsurface, hatchScreen, (Function0) ((InterfaceC7353EnQ) objAaT), ARK.A01(c1062ATq, 1.0f, true), bfm, 54, 0);
                    BBI.A0R(bbi, false);
                    BBI.A0R(bbi, z);
                }
                bfm.AgE(-1844694651);
                z = true;
                BRg bRgA0H = AnonymousClass007.A0H(bfm, c1062ATq, new ARK(1.0f, true));
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bRgA0H);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA014, g0vA0u);
                AHD ahdA1D = C8j4.A1D(c1bo);
                String strA05 = MutableState.A05(mutableState);
                boolean zA1W = AnonymousClass002.A1W(bfm, str, AnonymousClass003.A1J(bfm, mutableState, hatchNMEGaiWaterfallEventLogger), bfm.A63(AnonymousClass003.A0K(c98f)));
                Object objAaT2 = bfm.AaT();
                if (zA1W || objAaT2 == C78N.A00) {
                    objAaT2 = new AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$10$1$3$1$1(hatchNMEGaiWaterfallEventLogger, c98f, mutableState, str);
                    BBI.A0O(bbi, objAaT2);
                }
                AuraBuyCreditsBottomSheetKt.CreditProductsSection(c90l, ahdA1D, strA05, (G0U) objAaT2, bfm, 6);
            }
            BBI.A0R(bbi, z);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(AuraBuyCreditsViewModel auraBuyCreditsViewModel, C1BO<AuraBuyCreditsViewModel.UiState> c1bo, MutableState<String> mutableState, HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98f c98f, String str) {
            super(3);
            this.$buyCreditsViewModel = auraBuyCreditsViewModel;
            this.$uiState$delegate = c1bo;
            this.$selectedProductId$delegate = mutableState;
            this.$waterfallLogger = hatchNMEGaiWaterfallEventLogger;
            this.$entrypoint = c98f;
            this.$prevSurface = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ AuraBuyCreditsViewModel $buyCreditsViewModel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $onNavigateToPage;
        public final /* synthetic */ String $prevSurface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass11(String str, SubscriptionAttribution subscriptionAttribution, Function0<Unit> function0, G0U<? super AuraSubscriptionPage, Unit> g0u, BRg bRg, AuraBuyCreditsViewModel auraBuyCreditsViewModel, int i, int i2) {
            super(2);
            this.$prevSurface = str;
            this.$attribution = subscriptionAttribution;
            this.$onBack = function0;
            this.$onNavigateToPage = g0u;
            this.$modifier = bRg;
            this.$buyCreditsViewModel = auraBuyCreditsViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBuyCreditsBottomSheetKt.AuraBuyCreditsBottomSheet(this.$prevSurface, this.$attribution, this.$onBack, this.$onNavigateToPage, this.$modifier, this.$buyCreditsViewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $fallbackCtaLabel;
        public final /* synthetic */ Function0<Unit> $onPayNow;
        public final /* synthetic */ CreditProduct $selectedProduct;
        public final /* synthetic */ C1BO<AuraBuyCreditsViewModel.UiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(String str, CreditProduct creditProduct, Function0<Unit> function0, C1BO<AuraBuyCreditsViewModel.UiState> c1bo) {
            super(2);
            this.$fallbackCtaLabel = str;
            this.$selectedProduct = creditProduct;
            this.$onPayNow = function0;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(BFM bfm, int i) {
            boolean z = false;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            Disclaimer disclaimer = this.$uiState$delegate.getValue().disclaimer;
            boolean z2 = this.$uiState$delegate.getValue().isLoading;
            CheckoutNotice checkoutNotice = this.$uiState$delegate.getValue().checkoutNotice;
            boolean z3 = this.$uiState$delegate.getValue().isPurchasing;
            String str = this.$uiState$delegate.getValue().ctaLabel;
            if (str == null) {
                str = this.$fallbackCtaLabel;
            }
            if (this.$selectedProduct != null && !this.$uiState$delegate.getValue().isPurchasing && this.$uiState$delegate.getValue().disclaimer != null) {
                z = true;
            }
            AuraBuyCreditsBottomSheetKt.BuyCreditsFooter(disclaimer, z2, checkoutNotice, z3, str, z, this.$onPayNow, null, bfm, 0, 128);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$BuyCreditsDisclaimer$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Disclaimer $serverDisclaimer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Disclaimer disclaimer, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$serverDisclaimer = disclaimer;
            this.$isLoading = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBuyCreditsBottomSheetKt.BuyCreditsDisclaimer(this.$serverDisclaimer, this.$isLoading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$BuyCreditsDisclaimer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Disclaimer $serverDisclaimer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Disclaimer disclaimer, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$serverDisclaimer = disclaimer;
            this.$isLoading = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBuyCreditsBottomSheetKt.BuyCreditsDisclaimer(this.$serverDisclaimer, this.$isLoading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$BuyCreditsDisclaimerShimmer$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBuyCreditsBottomSheetKt.BuyCreditsDisclaimerShimmer(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$BuyCreditsFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C141752 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CheckoutNotice $checkoutNotice;
        public final /* synthetic */ String $ctaLabel;
        public final /* synthetic */ Disclaimer $disclaimer;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isPayNowEnabled;
        public final /* synthetic */ boolean $isPurchasing;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onPayNow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141752(Disclaimer disclaimer, boolean z, CheckoutNotice checkoutNotice, boolean z2, String str, boolean z3, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$disclaimer = disclaimer;
            this.$isLoading = z;
            this.$checkoutNotice = checkoutNotice;
            this.$isPurchasing = z2;
            this.$ctaLabel = str;
            this.$isPayNowEnabled = z3;
            this.$onPayNow = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBuyCreditsBottomSheetKt.BuyCreditsFooter(this.$disclaimer, this.$isLoading, this.$checkoutNotice, this.$isPurchasing, this.$ctaLabel, this.$isPayNowEnabled, this.$onPayNow, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$CreditProductRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C141762 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ CreditProduct $product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141762(CreditProduct creditProduct, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$product = creditProduct;
            this.$isSelected = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBuyCreditsBottomSheetKt.CreditProductRow(this.$product, this.$isSelected, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$CreditProductsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C141772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0U<CreditProduct, Unit> $onProductSelected;
        public final /* synthetic */ List<CreditProduct> $products;
        public final /* synthetic */ String $selectedProductId;
        public final /* synthetic */ C07C $this_CreditProductsSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141772(C07C c07c, List<CreditProduct> list, String str, G0U<? super CreditProduct, Unit> g0u, int i) {
            super(2);
            this.$this_CreditProductsSection = c07c;
            this.$products = list;
            this.$selectedProductId = str;
            this.$onProductSelected = g0u;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBuyCreditsBottomSheetKt.CreditProductsSection(this.$this_CreditProductsSection, this.$products, this.$selectedProductId, this.$onProductSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt$launchTopUpPurchase$1, reason: invalid class name and case insensitive filesystem */
    public final class C141781 extends AbstractC7559F3s implements G0U<HatchSubscriptionPurchase.Result, Unit> {
        public final /* synthetic */ G0V<String, String, Unit> $logOutcome;
        public final /* synthetic */ G0U<C98b, Unit> $logWaterfall;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onError;
        public final /* synthetic */ Function0<Unit> $onPending;
        public final /* synthetic */ Function0<Unit> $onSuccess;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchSubscriptionPurchase.Result result) {
            G0U<C98b, Unit> g0u;
            C98b c98b;
            Function0<Unit> function0;
            C7384Etj.A0Y(result, 0);
            if (result.equals(HatchSubscriptionPurchase.Result.Success.INSTANCE)) {
                this.$logOutcome.invoke(null, null);
                this.$logWaterfall.invoke(C98b.CONSUMABLE_PURCHASE_SUCCESSFUL);
                function0 = this.$onSuccess;
            } else if (result.equals(HatchSubscriptionPurchase.Result.Canceled.INSTANCE)) {
                this.$logOutcome.invoke(null, "cancelled");
                this.$logWaterfall.invoke(C98b.CONSUMABLE_PURCHASE_CANCELLED);
                function0 = this.$onCancel;
            } else if (result instanceof HatchSubscriptionPurchase.Result.Pending) {
                this.$logOutcome.invoke(null, ((HatchSubscriptionPurchase.Result.Pending) result).reason);
                function0 = this.$onPending;
            } else {
                if (result instanceof HatchSubscriptionPurchase.Result.Failed) {
                    this.$logOutcome.invoke(((HatchSubscriptionPurchase.Result.Failed) result).reason, null);
                    g0u = this.$logWaterfall;
                    c98b = C98b.CONSUMABLE_PURCHASE_ERROR;
                } else {
                    if (!result.equals(HatchSubscriptionPurchase.Result.Unavailable.INSTANCE)) {
                        throw C3cG.A0q();
                    }
                    this.$logOutcome.invoke("unavailable", null);
                    g0u = this.$logWaterfall;
                    c98b = C98b.CONSUMABLE_PURCHASE_NOT_SUPPORTED_ERROR;
                }
                g0u.invoke(c98b);
                function0 = this.$onError;
            }
            function0.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141781(G0V<? super String, ? super String, Unit> g0v, G0U<? super C98b, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
            super(1);
            this.$logOutcome = g0v;
            this.$logWaterfall = g0u;
            this.$onSuccess = function0;
            this.$onCancel = function02;
            this.$onPending = function03;
            this.$onError = function04;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchSubscriptionPurchase.Result result) {
            invoke2(result);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraBuyCreditsBottomSheet(java.lang.String r58, com.facebook.aura.navigation.key.SubscriptionAttribution r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, X.G0U<? super com.facebook.aura.navigation.key.AuraSubscriptionPage, kotlin.Unit> r61, X.BRg r62, com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel r63, X.BFM r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraBuyCreditsBottomSheetKt.AuraBuyCreditsBottomSheet(java.lang.String, com.facebook.aura.navigation.key.SubscriptionAttribution, kotlin.jvm.functions.Function0, X.G0U, X.BRg, com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel, X.BFM, int, int):void");
    }

    public static final void BuyCreditsDisclaimer(Disclaimer disclaimer, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass2;
        BRg bRg2 = bRg;
        bfm.AgG(-1340247106);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, disclaimer) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
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
            if (disclaimer != null) {
                bfm.AgE(-1285356703);
                BBI bbi = (BBI) bfm;
                C0jP c0jP = (C0jP) AKO.A07(Am0.A0G, bbi);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                long j = auraTheme.getColors(bfm, 6).accent;
                boolean zA1W = AnonymousClass002.A1W(bfm, c0jP, bfm.A64(j), AnonymousClass001.A1M(iA0d));
                Object objAaT = bfm.AaT();
                if (zA1W || objAaT == C78N.A00) {
                    AHD<DisclaimerRun> ahd = disclaimer.runs;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                    Iterator it = ahd.iterator();
                    while (it.hasNext()) {
                        C8j5.A0p(arrayListA0i, it);
                    }
                    objAaT = HatchInlineLinkTextKt.m1186buildClauseTextbw27NRU(arrayListA0i, j, new AuraBuyCreditsBottomSheetKt$BuyCreditsDisclaimer$clause$1$2(disclaimer, c0jP));
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT, AnonymousClass001.A0R(bRg2), C3cH.A07(bfm, auraTheme), C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).caption1Regular, null, null, null, null, null, null, null, null, 5, 0, 0, 16744447, 0L, 0L, 0L, 0L), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32752);
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc != null) {
                    anonymousClass2 = new AnonymousClass1(disclaimer, z, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -1284123740);
            if (z) {
                bfm.AgE(-1284104427);
                BuyCreditsDisclaimerShimmer(bRg2, bfm, (iA0d >> 6) & 14, 0);
            } else {
                bfm.AgE(-1284059260);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(disclaimer, z, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }

    public static final void BuyCreditsDisclaimerShimmer(BRg bRg, BFM bfm, int i, int i2) {
        BS0 bs0;
        BRg bRgA0P = bRg;
        bfm.AgG(717911140);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRgA0P) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BO4 bo4A01 = BOI.A01(bfm, null, 0.0f, 252, auraTheme.getColors(bfm, 6).shimmeringBase, auraTheme.getColors(bfm, 6).shimmeringHighlight);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            C1D3 c1d3A00 = C1D8.A00(4.0f);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0P.then(c1062ATq);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraBuyCreditsBottomSheetKt$BuyCreditsDisclaimerShimmer$1$1(strA01);
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgThen, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 4.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            bfm.AgE(1777933852);
            int i4 = 0;
            do {
                bs0 = BRg.A00;
                BOI.A02(bfm, C10G.A04(c1062ATq, 12.0f), c1d3A00, bo4A01);
                i4++;
            } while (i4 < 4);
            BBI.A0R(bbi, false);
            BOI.A02(bfm, C10G.A04(C10G.A03(bs0, 0.6f), 12.0f), c1d3A00, bo4A01);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRgA0P, i, i2);
        }
    }

    public static final void BuyCreditsFooter(Disclaimer disclaimer, boolean z, CheckoutNotice checkoutNotice, boolean z2, String str, boolean z3, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1982135069);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, disclaimer) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(checkoutNotice));
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z3);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA09 = C3U4.A09(bRg2.then(c1062ATq), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            BuyCreditsDisclaimer(disclaimer, z, null, bfm, iA0d & 126, 4);
            if (SubscriptionBillingCapabilityKt.usesIacBilling()) {
                bfm.AgE(-1652585011);
                SubscriptionSheetHelpersKt.MockPaymentWarning(null, bfm, 0, 1);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1652552337);
                BBI.A0R(bbi, false);
            }
            if (checkoutNotice == null) {
                bfm.AgE(-1652529367);
            } else {
                bfm.AgE(-1652529366);
                SubscriptionSheetHelpersKt.CheckoutNoticeMessage(checkoutNotice, c1062ATq, bfm, 48, 0);
            }
            BBI.A0R(bbi, false);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, SubscriptionBillingCapabilityKt.usesIacBilling() ? FGI.A0M("[Mock Payment] ", str) : str, null, c1062ATq, null, AuraButtonSize.SMALL, null, false, false, z3, z2, false, null, null, function0, null, null, null, null, AuraBuyCreditsBottomSheetKt$BuyCreditsFooter$1$2.INSTANCE, null, null, null, false, 0, false, 0, bfm, ((iA0d << 12) & 1879048192) | 199680, ((iA0d >> 9) & 14) | (57344 & (iA0d >> 6)), 0, 133675477);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141752(disclaimer, z, checkoutNotice, z2, str, z3, function0, bRg2, i, i2);
        }
    }

    public static final void CreditProductRow(CreditProduct creditProduct, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-737778940);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, creditProduct) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C1qN();
                BBI.A0T(bfm, objAaT);
            }
            AuraCardType.None none = AuraCardType.None.INSTANCE;
            BRg bRgThen = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 64.0f).then(new AX9(null, (InterfaceC1072AWd) objAaT, C3cG.A0A(3), function0, z, false, true));
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            String str = creditProduct.displayTitle;
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            String str2 = creditProduct.rowSubtitle;
            ApQ apQA0X = str2 != null ? AnonymousClass005.A0X(str2) : null;
            G0W<C08R, BFM, Integer, Unit> g0w = null;
            C0953AJg c0953AJg = C0953AJg.A03;
            long j = B6A.A07;
            AuraCardContent auraCardContent = new AuraCardContent(str, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJg, (B6A) null, apQA0X, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, false, (String) null, (C1822Arm) null, j, j, (C1YL) null);
            if (z) {
                g0w = ComposableSingletons$AuraBuyCreditsBottomSheetKt.lambda$76963966;
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgThen, auraCardStyleCardStyleForSettings, auraCardContent, none, null, g0w, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3072, 0, 262096);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141762(creditProduct, z, function0, bRg2, i, i2);
        }
    }

    public static final void CreditProductsSection(C07C c07c, List<CreditProduct> list, String str, G0U<? super CreditProduct, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-252548431);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            boolean zA1D = ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(list))) | AnonymousClass003.A1D(iA0d) | ((iA0d & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new AuraBuyCreditsBottomSheetKt$CreditProductsSection$1$1(list, str, g0u);
                BBI.A0T(bfm, objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141772(c07c, list, str, g0u, i);
        }
    }

    public static final /* synthetic */ AuraBuyCreditsViewModel.UiState access$AuraBuyCreditsBottomSheet$lambda$0(C1BO c1bo) {
        return (AuraBuyCreditsViewModel.UiState) c1bo.getValue();
    }

    public static final /* synthetic */ Integer access$AuraBuyCreditsBottomSheet$lambda$24(MutableState mutableState) {
        return (Integer) mutableState.getValue();
    }

    public static final void launchTopUpPurchase(FragmentActivity fragmentActivity, String str, String str2, String str3, Map<String, String> map, HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98f c98f, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        AnonymousClass003.A0x(str, str2);
        C7384Etj.A0Y(map, 4);
        AnonymousClass005.A13(hatchNMEGaiWaterfallEventLogger, function0, function02, 5);
        C3cH.A18(function03, function04);
        AuraBuyCreditsBottomSheetKt$launchTopUpPurchase$logOutcome$1 auraBuyCreditsBottomSheetKt$launchTopUpPurchase$logOutcome$1 = new AuraBuyCreditsBottomSheetKt$launchTopUpPurchase$logOutcome$1(map);
        AuraBuyCreditsBottomSheetKt$launchTopUpPurchase$logWaterfall$1 auraBuyCreditsBottomSheetKt$launchTopUpPurchase$logWaterfall$1 = new AuraBuyCreditsBottomSheetKt$launchTopUpPurchase$logWaterfall$1(hatchNMEGaiWaterfallEventLogger, c98f, map);
        if (fragmentActivity != null) {
            auraBuyCreditsBottomSheetKt$launchTopUpPurchase$logWaterfall$1.invoke(C98b.CONSUMABLE_PURCHASE_INITIATE);
            HatchSubscriptionPurchase.INSTANCE.launchTopUp(fragmentActivity, str, str2, str3, new C141781(auraBuyCreditsBottomSheetKt$launchTopUpPurchase$logOutcome$1, auraBuyCreditsBottomSheetKt$launchTopUpPurchase$logWaterfall$1, function0, function03, function04, function02));
        } else {
            auraBuyCreditsBottomSheetKt$launchTopUpPurchase$logOutcome$1.invoke("precondition", (String) null);
            auraBuyCreditsBottomSheetKt$launchTopUpPurchase$logWaterfall$1.invoke(C98b.CONSUMABLE_PURCHASE_NOT_SUPPORTED_ERROR);
            function02.invoke();
        }
    }

    public static final void logPackPriceImpressions(List<CreditProduct> list, HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98f c98f) {
        Integer num;
        for (CreditProduct creditProduct : list) {
            String str = creditProduct.dcpProductId;
            String str2 = creditProduct.productType;
            String str3 = creditProduct.formattedPrice;
            if (str3 == null) {
                str3 = "";
            }
            CurrencyAmount currencyAmount = creditProduct.priceAmount;
            String str4 = null;
            if (currencyAmount != null) {
                num = currencyAmount.amount;
                str4 = currencyAmount.currency;
            } else {
                num = null;
            }
            Map<String, String> mapConsumablePriceImpressionEventData = HatchPriceImpressionEventDataKt.consumablePriceImpressionEventData(str, str2, str3, num, str4);
            if (mapConsumablePriceImpressionEventData != null) {
                hatchNMEGaiWaterfallEventLogger.logEvent(C98e.CONSUMABLE_PAYMENT_SCREEN, C98d.MANAGEMENT, C98b.PRICE_IMPRESSION, c98f, mapConsumablePriceImpressionEventData, C98c.TOP_UP_PACK_ROW_WITH_PRICE_INFO, null);
            }
        }
    }
}
