package com.facebook.aura.subscription.view;

import X.AFz;
import X.AKL;
import X.AKO;
import X.AKQ;
import X.AQA;
import X.ARK;
import X.AbstractC0885AGm;
import X.AbstractC2022Awb;
import X.AbstractC2094AyJ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass000;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO4;
import X.BOD;
import X.BOI;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0A8;
import X.C0jP;
import X.C0ob;
import X.C0v2;
import X.C1062ATq;
import X.C10G;
import X.C11S;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1804ArN;
import X.C1822Arm;
import X.C1AC;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1b8;
import X.C20Q;
import X.C2CK;
import X.C2VU;
import X.C3Tx;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C90l;
import X.C98f;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.G2k;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionState;
import com.facebook.aura.subscription.model.PaywallCta;
import com.facebook.aura.subscription.model.PlanPickerGateState;
import com.facebook.aura.subscription.model.PurchaseBlock;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.subscription.repo.SubscriptionBlockedActionDialog;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.controls.AuraRadioKt;
import com.facebook.aura.vds.compose.controls.AuraSwitchKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.tag.AuraStatusTagKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraActivationSubscriptionScreenKt {
    public static final float ActivationLogoDrop = AuraDimensKt.SpacingLargePlusMicro + AuraDimensKt.SpacingMicro;

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationConfirmNameSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<Boolean, Unit> $onPurchaseFinished;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u) {
            super(3);
            this.$entryPoint = subscriptionPaywallEntryPoint;
            this.$onDismiss = function0;
            this.$onPurchaseFinished = g0u;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                SubscriptionConfirmNameSheetKt.SubscriptionConfirmNameSheet(this.$entryPoint, null, null, this.$onDismiss, this.$onPurchaseFinished, bfm, 48, 4);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationConfirmNameSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<Boolean, Unit> $onPurchaseFinished;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, int i) {
            super(2);
            this.$entryPoint = subscriptionPaywallEntryPoint;
            this.$onDismiss = function0;
            this.$onPurchaseFinished = g0u;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ActivationConfirmNameSheet(this.$entryPoint, this.$onDismiss, this.$onPurchaseFinished, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationFinishNavigation$2, reason: invalid class name and case insensitive filesystem */
    public final class C141552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C20Q<AuraActivationPlanFinishViewModel.ViewEffect> $viewEffects;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141552(C20Q<? extends AuraActivationPlanFinishViewModel.ViewEffect> c20q, int i) {
            super(2);
            this.$viewEffects = c20q;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ActivationFinishNavigation(this.$viewEffects, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C141561 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<SubscriptionProduct, BFM, Integer, BRg> $impressionModifier;
        public final /* synthetic */ boolean $isSelectionLocked;
        public final /* synthetic */ G0U<SubscriptionProduct, Unit> $onSelect;
        public final /* synthetic */ String $selectedId;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $state;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r18, X.BFM r19, int r20) {
            /*
                r17 = this;
                r7 = 0
                r0 = r18
                X.C7384Etj.A0Y(r0, r7)
                r1 = r20
                boolean r0 = X.AnonymousClass004.A1G(r1)
                r8 = r19
                boolean r0 = X.AnonymousClass001.A1b(r0, r8, r1)
                if (r0 == 0) goto Lac
                r1 = r17
                com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState$Loaded r6 = r1.$state
                X.AHD<com.facebook.aura.subscription.repo.SubscriptionProduct> r0 = r6.products
                java.lang.String r5 = r1.$selectedId
                boolean r4 = r1.$isSelectionLocked
                X.G0U<com.facebook.aura.subscription.repo.SubscriptionProduct, kotlin.Unit> r3 = r1.$onSelect
                X.G0W<com.facebook.aura.subscription.repo.SubscriptionProduct, X.BFM, java.lang.Integer, X.BRg> r2 = r1.$impressionModifier
                java.util.Iterator r11 = r0.iterator()
                r1 = 0
            L27:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto Laf
                java.lang.Object r12 = r11.next()
                int r10 = r1 + 1
                if (r1 >= 0) goto L3d
                X.AbstractC0885AGm.A14()
                X.F60 r0 = X.F60.createAndThrow()
                throw r0
            L3d:
                com.facebook.aura.subscription.repo.SubscriptionProduct r12 = (com.facebook.aura.subscription.repo.SubscriptionProduct) r12
                r13 = 0
                if (r1 <= 0) goto La5
                r0 = -1899215424(0xffffffff8ecc45c0, float:-5.035705E-30)
                X.BS0 r1 = X.C3cG.A09(r8, r0)
                float r0 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingLarge
                X.BRg r0 = X.C3U4.A07(r1, r0)
                com.facebook.aura.vds.compose.divider.AuraDividerKt.AuraRowDivider(r0, r8, r7, r7)
            L52:
                X.BBI r9 = X.C3cG.A07(r8)
                X.BO6<java.lang.String, com.facebook.aura.iap.HatchTierPrice> r1 = r6.prices
                java.lang.String r0 = r12.productId
                java.lang.Object r0 = r1.get(r0)
                com.facebook.aura.iap.HatchTierPrice r0 = (com.facebook.aura.iap.HatchTierPrice) r0
                if (r0 == 0) goto L64
                java.lang.String r13 = r0.formattedPrice
            L64:
                java.lang.String r0 = r12.productId
                boolean r14 = X.C7384Etj.areEqual(r0, r5)
                if (r4 == 0) goto L75
                java.lang.String r0 = r12.productId
                boolean r0 = X.C7384Etj.areEqual(r0, r5)
                r15 = 0
                if (r0 == 0) goto L76
            L75:
                r15 = 1
            L76:
                boolean r0 = X.AnonymousClass003.A1J(r8, r3, r12)
                java.lang.Object r1 = r8.AaT()
                if (r0 != 0) goto L84
                java.lang.Object r0 = X.C78N.A00
                if (r1 != r0) goto L8c
            L84:
                com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanCard$1$1$1$1 r1 = new com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanCard$1$1$1$1
                r1.<init>(r3, r12)
                X.BBI.A0O(r9, r1)
            L8c:
                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                int r19 = com.facebook.aura.subscription.repo.SubscriptionProduct.$stable
                java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
                java.lang.Object r17 = r2.invoke(r12, r8, r0)
                X.BRg r17 = (X.BRg) r17
                r18 = r8
                r20 = r7
                r16 = r1
                com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt.ActivationPlanRow(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r1 = r10
                goto L27
            La5:
                r0 = -1899130856(0xffffffff8ecd9018, float:-5.067516E-30)
                r8.AgE(r0)
                goto L52
            Lac:
                r8.Afo()
            Laf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt.C141561.invoke(X.07C, X.BFM, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141561(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, String str, boolean z, G0U<? super SubscriptionProduct, Unit> g0u, G0W<? super SubscriptionProduct, ? super BFM, ? super Integer, ? extends BRg> g0w) {
            super(3);
            this.$state = loaded;
            this.$selectedId = str;
            this.$isSelectionLocked = z;
            this.$onSelect = g0u;
            this.$impressionModifier = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C141572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<SubscriptionProduct, BFM, Integer, BRg> $impressionModifier;
        public final /* synthetic */ boolean $isSelectionLocked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<SubscriptionProduct, Unit> $onSelect;
        public final /* synthetic */ String $selectedId;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141572(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, String str, boolean z, G0U<? super SubscriptionProduct, Unit> g0u, G0W<? super SubscriptionProduct, ? super BFM, ? super Integer, ? extends BRg> g0w, BRg bRg, int i, int i2) {
            super(2);
            this.$state = loaded;
            this.$selectedId = str;
            this.$isSelectionLocked = z;
            this.$onSelect = g0u;
            this.$impressionModifier = g0w;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ActivationPlanCard(this.$state, this.$selectedId, this.$isSelectionLocked, this.$onSelect, this.$impressionModifier, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanCardFrame$1, reason: invalid class name and case insensitive filesystem */
    public final class C141581 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141581(BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ActivationPlanCardFrame(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanCardSkeleton$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C141592 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ BO4 $shimmerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141592(BO4 bo4) {
            super(3);
            this.$shimmerState = bo4;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BO4 bo4 = this.$shimmerState;
                int i2 = 0;
                do {
                    if (i2 > 0) {
                        bfm.AgE(-180229453);
                        AuraDividerKt.AuraRowDivider(C3U4.A07(BRg.A00, AuraDimensKt.SpacingLarge), bfm, 0, 0);
                    } else {
                        bfm.AgE(-180144885);
                    }
                    AnonymousClass001.A1D(bfm);
                    AuraActivationSubscriptionScreenKt.ActivationPlanRowSkeleton(bo4, null, bfm, 0, 2);
                    i2++;
                } while (i2 < 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanCardSkeleton$3, reason: invalid class name */
    /* loaded from: classes.dex */
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

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ActivationPlanCardSkeleton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanOptions$2, reason: invalid class name and case insensitive filesystem */
    public final class C141602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ boolean $isToggleEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onUsesConfidentialVmChange;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $plans;
        public final /* synthetic */ boolean $usesConfidentialVm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141602(boolean z, boolean z2, String str, G0U<? super Boolean, Unit> g0u, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$usesConfidentialVm = z;
            this.$isToggleEnabled = z2;
            this.$cvmLearnMoreUrl = str;
            this.$onUsesConfidentialVmChange = g0u;
            this.$modifier = bRg;
            this.$plans = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ActivationPlanOptions(this.$usesConfidentialVm, this.$isToggleEnabled, this.$cvmLearnMoreUrl, this.$onUsesConfidentialVmChange, this.$modifier, this.$plans, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C141612 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isEnabled;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $price;
        public final /* synthetic */ SubscriptionProduct $product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141612(SubscriptionProduct subscriptionProduct, String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$product = subscriptionProduct;
            this.$price = str;
            this.$isSelected = z;
            this.$isEnabled = z2;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ActivationPlanRow(this.$product, this.$price, this.$isSelected, this.$isEnabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlanRowSkeleton$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C141622 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ BO4 $shimmerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141622(BO4 bo4, BRg bRg, int i, int i2) {
            super(2);
            this.$shimmerState = bo4;
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
            AuraActivationSubscriptionScreenKt.ActivationPlanRowSkeleton(this.$shimmerState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationPlans$2, reason: invalid class name and case insensitive filesystem */
    public final class C141632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ ComplimentarySubscriptionRedemptionState $complimentaryClaimState;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ AuraActivationPlanFinishViewModel $finishViewModel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141632(AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel, SubscriptionAttribution subscriptionAttribution, AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, String str, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, BRg bRg, int i, int i2) {
            super(2);
            this.$finishViewModel = auraActivationPlanFinishViewModel;
            this.$attribution = subscriptionAttribution;
            this.$viewModel = auraSubscriptionPaywallViewModel;
            this.$complimentaryClaimState = complimentarySubscriptionRedemptionState;
            this.$cvmLearnMoreUrl = str;
            this.$appDisclosureLegalText = g2k;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ActivationPlans(this.$finishViewModel, this.$attribution, this.$viewModel, this.$complimentaryClaimState, this.$cvmLearnMoreUrl, this.$appDisclosureLegalText, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ SubscriptionBlockedActionDialog $blockedActionDialog;
        public final /* synthetic */ String $complimentaryClaimProductId;
        public final /* synthetic */ ComplimentarySubscriptionRedemptionState $complimentaryClaimState;
        public final /* synthetic */ PaywallCta $cta;
        public final /* synthetic */ String $currentTierCode;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
        public final /* synthetic */ PaywallFunnel $funnel;
        public final /* synthetic */ boolean $isCompletingPurchase;
        public final /* synthetic */ MutableState<Boolean> $isConfirmingName$delegate;
        public final /* synthetic */ boolean $isPlanChangeBlocked;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState.Loaded $loaded;
        public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;
        public final /* synthetic */ C98f $nmeEntryPoint;
        public final /* synthetic */ G0U<Boolean, Unit> $onPurchaseConfirmed;
        public final /* synthetic */ String $paywallImpressionKey;
        public final /* synthetic */ Disclaimer $purchaseDisclaimer;
        public final /* synthetic */ String $purchaseToast;
        public final /* synthetic */ String $selectedId;
        public final /* synthetic */ MutableState<Boolean> $showBlockedActionDialog$delegate;
        public final /* synthetic */ G0U<String, Unit> $showDismissToast;
        public final /* synthetic */ MutableState<Boolean> $showPendingDialog$delegate;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState $uiState;
        public final /* synthetic */ MutableState<String> $userSelectedId$delegate;
        public final /* synthetic */ MutableState<Boolean> $usesConfidentialVm$delegate;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass11(AuraSubscriptionPaywallViewModel.UiState uiState, String str, String str2, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, String str3, AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, MutableState<Boolean> mutableState, AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, PaywallFunnel paywallFunnel, String str4, C98f c98f, MutableState<String> mutableState2, String str5, PaywallCta paywallCta, boolean z, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, Disclaimer disclaimer, boolean z2, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, String str6, G0U<? super String, Unit> g0u, G0U<? super Boolean, Unit> g0u2, AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, SubscriptionAttribution subscriptionAttribution, MutableState<Boolean> mutableState3, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5) {
            super(4);
            this.$uiState = uiState;
            this.$selectedId = str;
            this.$complimentaryClaimProductId = str2;
            this.$complimentaryClaimState = complimentarySubscriptionRedemptionState;
            this.$cvmLearnMoreUrl = str3;
            this.$viewModel = auraSubscriptionPaywallViewModel;
            this.$usesConfidentialVm$delegate = mutableState;
            this.$loaded = loaded;
            this.$funnel = paywallFunnel;
            this.$currentTierCode = str4;
            this.$nmeEntryPoint = c98f;
            this.$userSelectedId$delegate = mutableState2;
            this.$paywallImpressionKey = str5;
            this.$cta = paywallCta;
            this.$isPlanChangeBlocked = z;
            this.$blockedActionDialog = subscriptionBlockedActionDialog;
            this.$purchaseDisclaimer = disclaimer;
            this.$isCompletingPurchase = z2;
            this.$entryPoint = subscriptionPaywallEntryPoint;
            this.$purchaseToast = str6;
            this.$showDismissToast = g0u;
            this.$onPurchaseConfirmed = g0u2;
            this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
            this.$attribution = subscriptionAttribution;
            this.$isConfirmingName$delegate = mutableState3;
            this.$appDisclosureLegalText = g2k;
            this.$showPendingDialog$delegate = mutableState4;
            this.$showBlockedActionDialog$delegate = mutableState5;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2265invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01fe  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m2265invokei1RSzL4(float r65, float r66, X.BFM r67, int r68) {
            /*
                Method dump skipped, instructions count: 958
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt.AnonymousClass11.m2265invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ ComplimentarySubscriptionRedemptionState $complimentaryClaimState;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ boolean $isCompletingPurchase;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onPurchaseConfirmed;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass12(SubscriptionAttribution subscriptionAttribution, AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, String str, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$attribution = subscriptionAttribution;
            this.$viewModel = auraSubscriptionPaywallViewModel;
            this.$complimentaryClaimState = complimentarySubscriptionRedemptionState;
            this.$cvmLearnMoreUrl = str;
            this.$appDisclosureLegalText = g2k;
            this.$isCompletingPurchase = z;
            this.$onPurchaseConfirmed = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ActivationSubscriptionContent(this.$attribution, this.$viewModel, this.$complimentaryClaimState, this.$cvmLearnMoreUrl, this.$appDisclosureLegalText, this.$isCompletingPurchase, this.$onPurchaseConfirmed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$AuraActivationSubscriptionScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C141642 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ AuraActivationPlanFinishViewModel $finishViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141642(AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel) {
            super(4);
            this.$finishViewModel = auraActivationPlanFinishViewModel;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2266invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2266invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 128), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchSubsurface hatchSubsurface = HatchSubsurface.SUBSCRIPTION;
            HatchScreen hatchScreen = HatchScreen.SUBSCRIPTION_PAYWALL;
            AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel = this.$finishViewModel;
            boolean zA67 = bfm.A67(auraActivationPlanFinishViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraActivationSubscriptionScreenKt$AuraActivationSubscriptionScreen$2$1$1(auraActivationPlanFinishViewModel);
                BBI.A0T(bfm, objAaT);
            }
            SubscriptionSheetHelpersKt.SubscriptionLoadError(hatchSubsurface, hatchScreen, (Function0) ((InterfaceC7353EnQ) objAaT), C10G.A01, bfm, 3126, 0);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$AuraActivationSubscriptionScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C141653 extends AbstractC7559F3s implements G2k<AuraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState, BRg, BFM, Integer, Unit> {
        public final /* synthetic */ G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ AuraActivationPlanFinishViewModel $finishViewModel;

        public final void invoke(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, BRg bRg, BFM bfm, int i) {
            AnonymousClass005.A10(auraSubscriptionPaywallViewModel, complimentarySubscriptionRedemptionState, bRg);
            int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraSubscriptionPaywallViewModel, bfm, i) ? 1 : 0) | i : i;
            if ((i & 48) == 0) {
                iA05 |= AnonymousClass005.A09(bfm, complimentarySubscriptionRedemptionState);
            }
            if ((i & 384) == 0) {
                iA05 |= AnonymousClass004.A0f(bfm, bRg);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
                AuraActivationSubscriptionScreenKt.ActivationPlans(this.$finishViewModel, this.$attribution, auraSubscriptionPaywallViewModel, complimentarySubscriptionRedemptionState, this.$cvmLearnMoreUrl, this.$appDisclosureLegalText, bRg, bfm, AnonymousClass001.A05(iA05 << 12, AnonymousClass002.A08(iA05 << 6, AuraSubscriptionPaywallViewModel.$stable << 6)), 0);
            } else {
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141653(AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel, SubscriptionAttribution subscriptionAttribution, String str, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k) {
            super(5);
            this.$finishViewModel = auraActivationPlanFinishViewModel;
            this.$attribution = subscriptionAttribution;
            this.$cvmLearnMoreUrl = str;
            this.$appDisclosureLegalText = g2k;
        }

        @Override // X.G2k
        public /* bridge */ /* synthetic */ Unit invoke(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, BRg bRg, BFM bfm, Integer num) {
            invoke(auraSubscriptionPaywallViewModel, complimentarySubscriptionRedemptionState, bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$AuraActivationSubscriptionScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, BRg bRg, int i, int i2) {
            super(2);
            this.$cvmLearnMoreUrl = str;
            this.$appDisclosureLegalText = g2k;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.AuraActivationSubscriptionScreen(this.$cvmLearnMoreUrl, this.$appDisclosureLegalText, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ComplimentaryClaimFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C141662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ Disclaimer $disclaimer;
        public final /* synthetic */ boolean $isClaiming;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClaim;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141662(Disclaimer disclaimer, boolean z, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$disclaimer = disclaimer;
            this.$isClaiming = z;
            this.$onClaim = function0;
            this.$appDisclosureLegalText = g0v;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ComplimentaryClaimFooter(this.$disclaimer, this.$isClaiming, this.$onClaim, this.$appDisclosureLegalText, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ConfidentialVmSwitchPlanPicker$1, reason: invalid class name and case insensitive filesystem */
    public final class C141671 extends AbstractC7559F3s implements G2k<AuraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState, BRg, BFM, Integer, Unit> {
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ G0U<Boolean, Unit> $onSubscribed;

        public final void invoke(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, BRg bRg, BFM bfm, int i) {
            AnonymousClass005.A10(auraSubscriptionPaywallViewModel, complimentarySubscriptionRedemptionState, bRg);
            int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraSubscriptionPaywallViewModel, bfm, i) ? 1 : 0) | i : i;
            if ((i & 48) == 0) {
                iA05 |= AnonymousClass005.A09(bfm, complimentarySubscriptionRedemptionState);
            }
            if ((i & 384) == 0) {
                iA05 |= AnonymousClass004.A0f(bfm, bRg);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
                AuraActivationSubscriptionScreenKt.ActivationSubscriptionContent(this.$attribution, auraSubscriptionPaywallViewModel, complimentarySubscriptionRedemptionState, this.$cvmLearnMoreUrl, null, false, this.$onSubscribed, bRg, bfm, AnonymousClass001.A0C(iA05 << 15, AnonymousClass002.A07(iA05 << 3, (AuraSubscriptionPaywallViewModel.$stable << 3) | 221184)), 0);
            } else {
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141671(SubscriptionAttribution subscriptionAttribution, String str, G0U<? super Boolean, Unit> g0u) {
            super(5);
            this.$attribution = subscriptionAttribution;
            this.$cvmLearnMoreUrl = str;
            this.$onSubscribed = g0u;
        }

        @Override // X.G2k
        public /* bridge */ /* synthetic */ Unit invoke(AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, BRg bRg, BFM bfm, Integer num) {
            invoke(auraSubscriptionPaywallViewModel, complimentarySubscriptionRedemptionState, bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ConfidentialVmSwitchPlanPicker$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C141682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onSubscribed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141682(String str, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$cvmLearnMoreUrl = str;
            this.$onSubscribed = g0u;
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
            AuraActivationSubscriptionScreenKt.ConfidentialVmSwitchPlanPicker(this.$cvmLearnMoreUrl, this.$onSubscribed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ConfidentialVmToggleDescription$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C141692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ApQ $description;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141692(ApQ apQ, BRg bRg) {
            super(2);
            this.$description = apQ;
            this.$modifier = bRg;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                C1822Arm c1822ArmWithFullLineHeight = AuraActivationSubscriptionScreenKt.withFullLineHeight(C06G.A0Y(bfm));
                AuraTextKt.m2640AuraTextVmYn7U0(this.$description, this.$modifier, C06G.A08(bfm), c1822ArmWithFullLineHeight, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32752);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ConfidentialVmToggleDescription$3, reason: invalid class name and case insensitive filesystem */
    public final class C141703 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141703(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$learnMoreUrl = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ConfidentialVmToggleDescription(this.$learnMoreUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ConfidentialVmToggleRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C141712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onCheckedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141712(boolean z, boolean z2, String str, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$checked = z;
            this.$enabled = z2;
            this.$learnMoreUrl = str;
            this.$onCheckedChange = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.ConfidentialVmToggleRow(this.$checked, this.$enabled, this.$learnMoreUrl, this.$onCheckedChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$1, reason: invalid class name and case insensitive filesystem */
    public final class C141721 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ AuraActivationPlanFinishViewModel $finishViewModel;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141721(AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel, String str, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, BRg bRg, int i, int i2) {
            super(2);
            this.$finishViewModel = auraActivationPlanFinishViewModel;
            this.$cvmLearnMoreUrl = str;
            this.$appDisclosureLegalText = g2k;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.HeldPlanConfidentialVmOffer(this.$finishViewModel, this.$cvmLearnMoreUrl, this.$appDisclosureLegalText, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
        public final /* synthetic */ G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ Map<String, String> $offerMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, Map<String, String> map) {
            super(3);
            this.$appDisclosureLegalText = g2k;
            this.$offerMetadata = map;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
            invoke(bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(BRg bRg, BFM bfm, int i) {
            C7384Etj.A0Y(bRg, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, bRg);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> g2k = this.$appDisclosureLegalText;
                boolean zA67 = bfm.A67(this.$offerMetadata);
                Map<String, String> map = this.$offerMetadata;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$6$1$1(map);
                    bfm.Ai0(objAaT);
                }
                g2k.invoke(bRg, false, objAaT, bfm, Integer.valueOf((i & 14) | 48));
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> $appDisclosureLegalText;
        public final /* synthetic */ String $cvmLearnMoreUrl;
        public final /* synthetic */ AuraActivationPlanFinishViewModel $finishViewModel;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel, String str, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, BRg bRg, int i, int i2) {
            super(2);
            this.$finishViewModel = auraActivationPlanFinishViewModel;
            this.$cvmLearnMoreUrl = str;
            this.$appDisclosureLegalText = g2k;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.HeldPlanConfidentialVmOffer(this.$finishViewModel, this.$cvmLearnMoreUrl, this.$appDisclosureLegalText, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$PlanPickerGate$2, reason: invalid class name and case insensitive filesystem */
    public final class C141732 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G2k<AuraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState, BRg, BFM, Integer, Unit> $content;
        public final /* synthetic */ C1BO<PlanPickerGateState> $gate$delegate;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141732(G2k<? super AuraSubscriptionPaywallViewModel, ? super ComplimentarySubscriptionRedemptionState, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, BRg bRg, C1BO<PlanPickerGateState> c1bo) {
            super(2);
            this.$content = g2k;
            this.$viewModel = auraSubscriptionPaywallViewModel;
            this.$modifier = bRg;
            this.$gate$delegate = c1bo;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                this.$content.invoke(this.$viewModel, this.$gate$delegate.getValue().claimState, this.$modifier, bfm, Integer.valueOf(AuraSubscriptionPaywallViewModel.$stable));
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$PlanPickerGate$3, reason: invalid class name and case insensitive filesystem */
    public final class C141743 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionAttribution $attribution;
        public final /* synthetic */ G2k<AuraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState, BRg, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141743(SubscriptionAttribution subscriptionAttribution, BRg bRg, G2k<? super AuraSubscriptionPaywallViewModel, ? super ComplimentarySubscriptionRedemptionState, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, int i, int i2) {
            super(2);
            this.$attribution = subscriptionAttribution;
            this.$modifier = bRg;
            this.$content = g2k;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraActivationSubscriptionScreenKt.PlanPickerGate(this.$attribution, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ConfidentialVmSwitchPlanPicker(String str, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, g0u);
        bfm.AgG(901056229);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new SubscriptionAttribution(SubscriptionPaywallEntryPoint.CONFIDENTIAL_VM, null);
                BBI.A0T(bfm, objAaT);
            }
            SubscriptionAttribution subscriptionAttribution = (SubscriptionAttribution) objAaT;
            PlanPickerGate(subscriptionAttribution, bRg2, B1V.A00(bfm, new C141671(subscriptionAttribution, str, g0u), -172830382), bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141682(str, g0u, bRg2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraActivationPlanFinishViewModel.Page.values().length];
            try {
                AnonymousClass002.A13(AuraActivationPlanFinishViewModel.Page.LOADING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraActivationPlanFinishViewModel.Page.LOAD_FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraActivationPlanFinishViewModel.Page.CONFIDENTIAL_VM_OFFER, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraActivationPlanFinishViewModel.Page.PLANS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ActivationPlanOptions(boolean z, boolean z2, String str, G0U<? super Boolean, Unit> g0u, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-602428267);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRgA0P);
        }
        if ((196608 & i) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0n, 74898), bfm, iA0n)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0P);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(C11U.A03(bRgA0R, auraTheme.getShapes(bfm, 6).card), auraTheme.getColors(bfm, 6).secondaryElevated);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            AnonymousClass003.A13(bfm, g0v, iA0n >> 15);
            ConfidentialVmToggleRow(z, z2, str, g0u, null, bfm, iA0n & 8190, 16);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141602(z, z2, str, g0u, bRgA0P, g0v, i, i2);
        }
    }

    public static final void ActivationPlanRow(SubscriptionProduct subscriptionProduct, String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-838565111);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(subscriptionProduct, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            boolean zA65 = bfm.A65(subscriptionProduct.benefits);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                int i4 = 0;
                for (Object obj : subscriptionProduct.benefits) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                        break;
                    }
                    String str2 = (String) obj;
                    if (i4 > 0) {
                        c1731ApSA0W.A0E(PairsDiscretionDocument.TERMINATOR);
                    }
                    c1731ApSA0W.A07(AuraSubscriptionPaywallBottomSheetKt.renderBenefit(str2));
                    i4 = i5;
                }
                objAaT = c1731ApSA0W.A04();
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            C1AC c1ac = C2VU.A04;
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingXsmallPlusNano);
            BRg bRgPlanRowPadding = planRowPadding(C0ob.A00(AnonymousClass001.A0R(bRg2), C3cG.A0A(3), function0, z, z2));
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgPlanRowPadding);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = C11S.A00(ARK.A01(bs0, 1.0f, true), z2 ? 1.0f : 0.3f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA00);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(subscriptionProduct.tierName, null, colors.primaryText, withFullLineHeight(C60Q.A0D(bfm, auraTheme)), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            float f = AuraDimensKt.SpacingNano;
            C01N.A08(bfm, bs0, f);
            if (str == null) {
                AuraSubscriptionPaywallBottomSheetKt.PlanPriceShimmer(null, null, withFullLineHeight(C3cH.A0X(bfm, auraTheme, 886006807).subheadlineRegular), bfm, 0, 3);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(886129505);
                AuraTextKt.m2639AuraTextUY9GdpU(AuraSubscriptionPaywallBottomSheetKt.subscriptionPricePerPeriod(str, subscriptionProduct.billingInterval, bfm, (iA05 >> 3) & 14), null, colors.secondaryText, withFullLineHeight(C3cH.A0B(bfm, auraTheme)), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            }
            if (apQ.length() > 0) {
                bfm.AgE(886392044);
                C01N.A08(bfm, bs0, f);
                AuraTextKt.m2640AuraTextVmYn7U0(apQ, null, colors.secondaryText, withFullLineHeight(C3cH.A0E(bfm, auraTheme)), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32754);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(886625567);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            Object objAaT2 = bfm.AaT();
            Object obj2 = C78N.A00;
            if (objAaT2 == obj2) {
                objAaT2 = AuraActivationSubscriptionScreenKt$ActivationPlanRow$1$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA002 = AbstractC2022Awb.A00(bs0, (G0U) objAaT2);
            boolean z3 = (57344 & iA05) == 16384;
            Object objAaT3 = bfm.AaT();
            if (z3 || objAaT3 == obj2) {
                objAaT3 = new AuraActivationSubscriptionScreenKt$ActivationPlanRow$1$3$1(function0);
                BBI.A0O(bbi, objAaT3);
            }
            AuraRadioKt.m2530AuraRadioV9fs2A(bRgA002, z2, z, (G0U) objAaT3, null, 0L, bfm, ((iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA05 & 896), 48);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141612(subscriptionProduct, str, z, z2, function0, bRg2, i, i2);
        }
    }

    public static final void ActivationPlanRowSkeleton(BO4 bo4, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1531222357);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bo4) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1AC c1ac = C2VU.A04;
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingXsmallPlusNano);
            BRg bRgPlanRowPadding = planRowPadding(AnonymousClass001.A0R(bRg2));
            InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(c9m9A00, bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgPlanRowPadding);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0b);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = ARK.A00(bs0);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA00);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            int i4 = (iA0d << 9) & 7168;
            AuraSubscriptionPaywallBottomSheetKt.m2272TextLineShimmero3XDK20(withFullLineHeight(C60Q.A0D(bfm, auraTheme)), 72.0f, 16.0f, bo4, null, bfm, i4 | 432, 16);
            float f = AuraDimensKt.SpacingNano;
            C01N.A08(bfm, bs0, f);
            AuraSubscriptionPaywallBottomSheetKt.PlanPriceShimmer(null, bo4, withFullLineHeight(C3cH.A0B(bfm, auraTheme)), bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 1);
            C01N.A08(bfm, bs0, f);
            bfm.AgE(14090383);
            Iterator it = Arrays.asList(C8j3.A0k(180.0f), C8j3.A0k(140.0f), C8j3.A0k(160.0f)).iterator();
            while (it.hasNext()) {
                AuraSubscriptionPaywallBottomSheetKt.m2272TextLineShimmero3XDK20(withFullLineHeight(C3cH.A0E(bfm, auraTheme)), ((C1DG) it.next()).A00, 12.0f, bo4, null, bfm, i4 | 384, 16);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            BOI.A02(bfm, C10G.A07(bs0, auraTheme.getDimensions(bfm, 6).icon.xSmall), C1D8.A00, bo4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141622(bo4, bRg2, i, i2);
        }
    }

    public static final void ActivationPlans(AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel, SubscriptionAttribution subscriptionAttribution, AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, String str, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-861231952);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, auraActivationPlanFinishViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, subscriptionAttribution);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(auraSubscriptionPaywallViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass007.A06(bfm, complimentarySubscriptionRedemptionState.ordinal());
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, str);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, g2k);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AuraDisclosureViewModel.Factory factory = new AuraDisclosureViewModel.Factory(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi));
            Object objA07 = AKO.A07(AKL.A00, bbi);
            C7384Etj.A0Z(objA07, AnonymousClass000.A00(6));
            ComponentActivity componentActivity = (ComponentActivity) objA07;
            AuraDisclosureViewModel auraDisclosureViewModel = (AuraDisclosureViewModel) C3cH.A0H(factory, componentActivity, AnonymousClass003.A0Z(componentActivity), C3cG.A0x(AuraDisclosureViewModel.class));
            ActivationFinishNavigation(auraActivationPlanFinishViewModel.viewEffects, bfm, 0);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120249);
            boolean zA0F = C1BO.A0F(C2CK.A02(bfm, auraActivationPlanFinishViewModel.isFinishing));
            boolean zA1O = AnonymousClass003.A1O(bfm, auraDisclosureViewModel, strA0v, bfm.A67(auraActivationPlanFinishViewModel));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new AuraActivationSubscriptionScreenKt$ActivationPlans$1$1(auraActivationPlanFinishViewModel, auraDisclosureViewModel, strA0v);
                BBI.A0O(bbi, objAaT);
            }
            int i4 = iA0T >> 3;
            ActivationSubscriptionContent(subscriptionAttribution, auraSubscriptionPaywallViewModel, complimentarySubscriptionRedemptionState, str, g2k, zA0F, (G0U) objAaT, bRg2, bfm, (i4 & 57344) | AnonymousClass003.A06(i4, (i4 & 14) | (AuraSubscriptionPaywallViewModel.$stable << 3)) | (29360128 & (iA0T << 3)), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141632(auraActivationPlanFinishViewModel, subscriptionAttribution, auraSubscriptionPaywallViewModel, complimentarySubscriptionRedemptionState, str, g2k, bRg2, i, i2);
        }
    }

    public static final void AuraActivationSubscriptionScreen(String str, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, g2k);
        bfm.AgG(-585671096);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g2k);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            AuraActivationPlanFinishViewModel.Factory factory = new AuraActivationPlanFinishViewModel.Factory(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel = (AuraActivationPlanFinishViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(AuraActivationPlanFinishViewModel.class));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new SubscriptionAttribution(SubscriptionPaywallEntryPoint.ACTIVATION, null);
                BBI.A0O(bbi, objAaT);
            }
            SubscriptionAttribution subscriptionAttribution = (SubscriptionAttribution) objAaT;
            int iOrdinal = ((AuraActivationPlanFinishViewModel.Page) C1BO.A07(bfm, auraActivationPlanFinishViewModel.page)).ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(-189186435);
                OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner("Activation plan picker: reading subscription", bRg2, null, bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 4);
            } else if (iOrdinal == zA1a) {
                bfm.AgE(-1569589328);
                AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
                boolean zA67 = bfm.A67(auraNavigatorA05);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == obj) {
                    objAaT2 = new AuraActivationSubscriptionScreenKt$AuraActivationSubscriptionScreen$1$1(auraNavigatorA05);
                    BBI.A0O(bbi, objAaT2);
                }
                HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, bRg2, null, 0L, null, null, (Function0) objAaT2, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new C141642(auraActivationPlanFinishViewModel), -1136154228), bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 0, 805306368, 536870844);
            } else if (iOrdinal == 3) {
                bfm.AgE(-189163350);
                HeldPlanConfidentialVmOffer(auraActivationPlanFinishViewModel, str, g2k, bRg2, bfm, (iA0d << 3) & 8176, 0);
            } else {
                if (iOrdinal != 2) {
                    throw AnonymousClass003.A0k(bfm, bbi, -189188992);
                }
                bfm.AgE(-189153842);
                PlanPickerGate(subscriptionAttribution, bRg2, B1V.A00(bfm, new C141653(auraActivationPlanFinishViewModel, subscriptionAttribution, str, g2k), -201605066), bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, g2k, bRg2, i, i2);
        }
    }

    public static final void ComplimentaryClaimFooter(Disclaimer disclaimer, boolean z, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(1010925616);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, disclaimer) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0P.then(c1062ATq);
            float f = AuraDimensKt.SpacingLarge;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bRgThen, f, f2, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f2, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            if (disclaimer == null) {
                bfm.AgE(68118844);
            } else {
                bfm.AgE(68118845);
                AuraSubscriptionPaywallBottomSheetKt.PaywallLegalClause(disclaimer, HatchScreen.SUBSCRIPTION_PAYWALL, c1062ATq, bfm, 432, 0);
            }
            BBI.A0R(bbi, false);
            AnonymousClass003.A13(bfm, g0v, iA0d >> 9);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12109c), null, c1062ATq, null, AuraButtonSize.LARGE, null, false, false, !z, z, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, ((iA0d >> 3) & 14) | ((iA0d << 6) & 57344), 0, 134199765);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141662(disclaimer, z, function0, g0v, bRgA0P, i, i2);
        }
    }

    public static final void ConfidentialVmToggleRow(boolean z, boolean z2, String str, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1671454370);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1Q = AnonymousClass002.A1Q(iA0n & 7168, 2048);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new AuraActivationSubscriptionScreenKt$ConfidentialVmToggleRow$onToggle$1$1(g0u);
                BBI.A0T(bfm, objAaT);
            }
            G0U g0u2 = (G0U) objAaT;
            C1AC c1ac = C2VU.A04;
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
            BRg bRgA01 = C0v2.A01(AnonymousClass001.A0R(bRg2), C3cG.A0A(2), g0u2, z, z2);
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(bRgA01, f, AuraDimensKt.SpacingMedium, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(c9m9A00, bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0b);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u3 = C1515AkP.A02;
            BPg.A03(bfm, g0u3);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v2 = C1515AkP.A05;
            BPg.A02(bfm, bRgA012, g0v2);
            BS0 bs0 = BRg.A00;
            BRg bRgA013 = ARK.A01(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgA013);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA014, g0v2);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingXsmall, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA015 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0S, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA015, g0v2);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12109e);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmWithFullLineHeight = withFullLineHeight(auraTheme.getTypography(bfm, 6).subheadlineMedium);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA016 = ARK.A01(bs0, 1.0f, false);
            C3Tx c3Tx = AbstractC2094AyJ.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA016.then(new AQA(c3Tx)), jA06, c1822ArmWithFullLineHeight, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraStatusTagKt.m2637AuraStatusTagRWsq2U(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12072c), C3cH.A07(bfm, auraTheme), new AQA(c3Tx), 0L, bfm, 0, 8);
            BBI.A0R(bbi, true);
            ConfidentialVmToggleDescription(str, null, bfm, (iA0n >> 6) & 14, 2);
            BBI.A0R(bbi, true);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = AuraActivationSubscriptionScreenKt$ConfidentialVmToggleRow$1$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraSwitchKt.AuraSwitch(AnonymousClass001.A0X(bs0, objAaT2), z2, z, g0u2, null, null, null, bfm, (iA0n & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0n << 6) & 896), HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141712(z, z2, str, g0u, bRg2, i, i2);
        }
    }

    public static final void HeldPlanConfidentialVmOffer(AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel, String str, G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass7;
        BRg bRg2 = bRg;
        bfm.AgG(1872774412);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, auraActivationPlanFinishViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g2k);
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
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            AuraDisclosureViewModel.Factory factory = new AuraDisclosureViewModel.Factory(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi));
            Object objA07 = AKO.A07(AKL.A00, bbi);
            C7384Etj.A0Z(objA07, AnonymousClass000.A00(6));
            ComponentActivity componentActivity = (ComponentActivity) objA07;
            AuraDisclosureViewModel auraDisclosureViewModel = (AuraDisclosureViewModel) C3cH.A0H(factory, componentActivity, AnonymousClass003.A0Z(componentActivity), C3cG.A0x(AuraDisclosureViewModel.class));
            ActivationFinishNavigation(auraActivationPlanFinishViewModel.viewEffects, bfm, 0);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120249);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$offerImpressionKey$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            String str2 = (String) AFz.A03(bfm, (Function0) objAaT, objArr);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), SubscriptionPaywallEntryPoint.ACTIVATION.getValue());
                bfm.Ai0(objAaT2);
            }
            Map map = (Map) objAaT2;
            boolean zA1R = AnonymousClass001.A1R(bfm, strA0v, AnonymousClass005.A1S(bfm, map, auraActivationPlanFinishViewModel, auraDisclosureViewModel));
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == obj) {
                objAaT3 = new AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$finishActivation$1$1(map, auraActivationPlanFinishViewModel, auraDisclosureViewModel, strA0v);
                BBI.A0O(bbi, objAaT3);
            }
            G0V g0v = (G0V) objAaT3;
            if (C1BO.A0F(C2CK.A02(bfm, auraActivationPlanFinishViewModel.isFinishing))) {
                bfm.AgE(198515442);
                OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner("Activation plan picker: finishing on the held plan", bRg2, null, bfm, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 4);
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc != null) {
                    anonymousClass7 = new C141721(auraActivationPlanFinishViewModel, str, g2k, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass7);
                }
                return;
            }
            bfm.AgE(198673046);
            BBI.A0R(bbi, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207a3);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120769);
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_CVM_OFFER, HatchComponent.CVM_SCREEN_VIEW, null, map, null, 500L, 0.0f, str2, null, null);
            boolean zA1M = AnonymousClass003.A1M(bfm, map, auraNavigatorA05);
            Object objAaT4 = bfm.AaT();
            if (zA1M || objAaT4 == obj) {
                objAaT4 = new AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$2$1(map, auraNavigatorA05);
                BBI.A0O(bbi, objAaT4);
            }
            Function0 function0 = (Function0) objAaT4;
            boolean zA65 = bfm.A65(g0v);
            Object objAaT5 = bfm.AaT();
            if (zA65 || objAaT5 == obj) {
                objAaT5 = new AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$3$1(g0v);
                BBI.A0O(bbi, objAaT5);
            }
            Function0 function02 = (Function0) objAaT5;
            boolean zA652 = bfm.A65(g0v);
            Object objAaT6 = bfm.AaT();
            if (zA652 || objAaT6 == obj) {
                objAaT6 = new AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$4$1(g0v);
                BBI.A0O(bbi, objAaT6);
            }
            Function0 function03 = (Function0) objAaT6;
            boolean zA67 = bfm.A67(map);
            Object objAaT7 = bfm.AaT();
            if (zA67 || objAaT7 == obj) {
                objAaT7 = new AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$5$1(map);
                BBI.A0O(bbi, objAaT7);
            }
            ConfidentialVmEncryptionOnboardingScreenKt.ConfidentialVmEncryptionOfferPage(strA01, str, function0, function02, function03, (Function0) objAaT7, bRgHatchImpression, null, strA012, B1V.A00(bfm, new AnonymousClass6(g2k, map), 813991128), null, bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 805306368, 0, 1152);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass7 = new AnonymousClass7(auraActivationPlanFinishViewModel, str, g2k, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass7);
        }
    }

    public static final void logHeldPlanOfferClick(HatchComponent hatchComponent, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_CVM_OFFER, hatchComponent, null, map, null);
    }

    public static final void logLegalTextLinkClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.SUBSCRIPTION_PAYWALL, HatchComponent.LEGAL_LINK, null, null, null);
    }

    public static final AuraSubscriptionPaywallViewModel planPickerViewModel(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        AuraSubscriptionPaywallViewModel.Factory factory = new AuraSubscriptionPaywallViewModel.Factory(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi), AnonymousClass001.A0I(AKO.A01(bbi)), subscriptionPaywallEntryPoint, true);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (AuraSubscriptionPaywallViewModel) C3cH.A0G(factory, bodA00, AnonymousClass005.A0Y(bodA00), AuraSubscriptionPaywallViewModel.class);
        }
        throw AnonymousClass001.A0o();
    }

    public static final BRg planRowPadding(BRg bRg) {
        float f = AuraDimensKt.SpacingLarge;
        float f2 = AuraDimensKt.SpacingSmall + AuraDimensKt.SpacingXsmallPlusNano;
        return C3U4.A0C(bRg, f, f2, AuraDimensKt.SpacingMedium, f2);
    }

    public static final C1822Arm withFullLineHeight(C1822Arm c1822Arm) {
        return C1822Arm.A00(null, c1822Arm, null, null, null, new C1804ArN(0, 0.5f, 0), null, null, null, null, 0, 0, 0, 15728639, 0L, 0L, 0L, 0L);
    }

    public static final void ActivationConfirmNameSheet(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-1434213268);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, subscriptionPaywallEntryPoint) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(null, function0, null, null, 0L, false, false, B1V.A00(bfm, new AnonymousClass1(subscriptionPaywallEntryPoint, function0, g0u), -2008239163), bfm, (iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 12582912, 125);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(subscriptionPaywallEntryPoint, function0, g0u, i);
        }
    }

    public static final void ActivationFinishNavigation(C20Q<? extends AuraActivationPlanFinishViewModel.ViewEffect> c20q, BFM bfm, int i) {
        bfm.AgG(418524923);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c20q, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120243);
            G0U<String, Unit> g0uRememberDismissToast = SubscriptionSheetHelpersKt.rememberDismissToast(bfm, 0);
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(c20q))) {
                z = false;
            }
            boolean zA1P = AnonymousClass003.A1P(bfm, g0uRememberDismissToast, strA01, bfm.A67(auraNavigatorA05) | z);
            Object objAaT = bfm.AaT();
            if (zA1P || objAaT == C78N.A00) {
                objAaT = new AuraActivationSubscriptionScreenKt$ActivationFinishNavigation$1$1(c20q, auraNavigatorA05, g0uRememberDismissToast, strA01, null);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, c20q);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141552(c20q, i);
        }
    }

    public static final void ActivationPlanCard(AuraSubscriptionPaywallViewModel.UiState.Loaded loaded, String str, boolean z, G0U<? super SubscriptionProduct, Unit> g0u, G0W<? super SubscriptionProduct, ? super BFM, ? super Integer, ? extends BRg> g0w, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(394867677);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, loaded) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0w);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            ActivationPlanCardFrame(bRg, B1V.A00(bfm, new C141561(loaded, str, z, g0u, g0w), 1629878751), bfm, ((iA0d >> 15) & 14) | 48, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141572(loaded, str, z, g0u, g0w, bRg, i, i2);
        }
    }

    public static final void ActivationPlanCardFrame(BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        bfm.AgG(-633249153);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1DM c1dm = auraTheme.getShapes(bfm, 6).large;
            BRg bRgA02 = C1DI.A02(C1b8.A01(C11U.A03(AnonymousClass001.A0R(bRg), c1dm), auraTheme.getColors(bfm, 6).card), c1dm, 1.0f, auraTheme.getColors(bfm, 6).border);
            int i4 = (iA0d << 6) & 7168;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AnonymousClass004.A1B(bbi, C90l.A00, bfm, g0w, ((i4 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141581(bRg, g0w, i, i2);
        }
    }

    public static final void ActivationPlanCardSkeleton(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1275501755);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210b0);
            BO4 bo4RememberPaywallShimmerState = AuraSubscriptionPaywallBottomSheetKt.rememberPaywallShimmerState(bfm, 0);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraActivationSubscriptionScreenKt$ActivationPlanCardSkeleton$1$1(strA01);
                BBI.A0T(bfm, objAaT);
            }
            ActivationPlanCardFrame(AnonymousClass001.A0Y(bRg, objAaT, false), B1V.A00(bfm, new C141592(bo4RememberPaywallShimmerState), 1236411463), bfm, 48, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ConfidentialVmToggleDescription(String str, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-373088651);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12109d);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12043a);
            long j = C3cH.A0W(bfm).link;
            boolean zA1T = AnonymousClass002.A1T(bfm, j, AnonymousClass003.A1B(iA0d), AnonymousClass003.A1K(bfm, strA01, strA012));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                HxE<String, List<HatchTextLink>> hxEWithLinkedArguments = HatchLinkTextKt.withLinkedArguments(strA01, Arrays.asList(C3cG.A0r(HatchAppName.value, ""), C3cG.A0r(strA012, str)));
                String str2 = hxEWithLinkedArguments.first;
                List<HatchTextLink> list = hxEWithLinkedArguments.second;
                objAaT = C3cG.A0r(HatchLinkTextKt.m1189buildHatchLinkAnnotatedString9LQNqLg(str2, list, j, null), HatchLinkTextKt.hatchLinkTitlesByUrl(str2, list));
                BBI.A0T(bfm, objAaT);
            }
            HxE hxE = (HxE) objAaT;
            ApQ apQ = (ApQ) hxE.first;
            final C0jP c0jPRememberHatchLinkUriHandler = HatchLinkTextKt.rememberHatchLinkUriHandler((Map) hxE.second, null, bfm, 0, 2);
            boolean zA65 = bfm.A65(c0jPRememberHatchLinkUriHandler);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new C0jP() { // from class: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt$ConfidentialVmToggleDescription$uriHandler$1$1
                    @Override // X.C0jP
                    public void openUri(String str3) {
                        AnonymousClass006.A0b(str3).logClick(HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.SUBSCRIPTION_PAYWALL, HatchComponent.CVM_LEARN_MORE_LINK, null, AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), SubscriptionPaywallEntryPoint.ACTIVATION.getValue()), null);
                        c0jPRememberHatchLinkUriHandler.openUri(str3);
                    }
                };
                BBI.A0T(bfm, objAaT2);
            }
            AnonymousClass006.A15(bfm, Am0.A0G.A04(objAaT2), new C141692(apQ, bRg), 234001205);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141703(str, bRg, i, i2);
        }
    }

    public static final void PlanPickerGate(SubscriptionAttribution subscriptionAttribution, BRg bRg, G2k<? super AuraSubscriptionPaywallViewModel, ? super ComplimentarySubscriptionRedemptionState, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, BFM bfm, int i, int i2) {
        bfm.AgG(2126354027);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, subscriptionAttribution) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g2k);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModelPlanPickerViewModel = planPickerViewModel(subscriptionAttribution.localEntryPoint, bfm, 0);
            C1BO c1boA02 = C2CK.A02(bfm, auraSubscriptionPaywallViewModelPlanPickerViewModel.planPickerGate);
            PurchaseBlock purchaseBlock = ((PlanPickerGateState) c1boA02.getValue()).purchaseBlock;
            SubscriptionDetails subscriptionDetails = ((PlanPickerGateState) c1boA02.getValue()).details;
            boolean zA67 = bfm.A67(auraNavigatorA05);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraActivationSubscriptionScreenKt$PlanPickerGate$1$1(auraNavigatorA05);
                BBI.A0O(bbi, objAaT);
            }
            AuraSubscriptionSheetKt.PurchaseBlockGate(purchaseBlock, subscriptionDetails, (Function0) objAaT, subscriptionAttribution, B1V.A00(bfm, new C141732(g2k, auraSubscriptionPaywallViewModelPlanPickerViewModel, bRg, c1boA02), 597743283), bfm, (SubscriptionDetails.$stable << 3) | RuntimeInternals.IOPRIO_BACKGROUND | ((iA0T << 9) & 7168));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141743(subscriptionAttribution, bRg, g2k, i, i2);
        }
    }

    public static final /* synthetic */ PlanPickerGateState access$PlanPickerGate$lambda$0(C1BO c1bo) {
        return (PlanPickerGateState) c1bo.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* renamed from: ActivationPlanBody-8u0NR3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2263ActivationPlanBody8u0NR3k(com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState r45, java.lang.String r46, boolean r47, boolean r48, boolean r49, java.lang.String r50, float r51, kotlin.jvm.functions.Function0<kotlin.Unit> r52, X.G0U<? super java.lang.Boolean, kotlin.Unit> r53, X.G0U<? super com.facebook.aura.subscription.repo.SubscriptionProduct, kotlin.Unit> r54, X.G0W<? super com.facebook.aura.subscription.repo.SubscriptionProduct, ? super X.BFM, ? super java.lang.Integer, ? extends X.BRg> r55, X.BRg r56, X.BFM r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt.m2263ActivationPlanBody8u0NR3k(com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState, java.lang.String, boolean, boolean, boolean, java.lang.String, float, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0W, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0220 A[PHI: r81
  0x0220: PHI (r81v3 boolean) = (r81v0 boolean), (r81v4 boolean) binds: [B:119:0x021e, B:117:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04d0 A[PHI: r81
  0x04d0: PHI (r81v1 boolean) = (r81v0 boolean), (r81v3 boolean), (r81v3 boolean) binds: [B:119:0x021e, B:121:0x0224, B:122:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04e3 A[PHI: r23
  0x04e3: PHI (r23v3 java.lang.String) = (r23v1 java.lang.String), (r23v5 java.lang.String) binds: [B:85:0x018d, B:208:0x04e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActivationSubscriptionContent(com.facebook.aura.navigation.key.SubscriptionAttribution r90, com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel r91, com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionState r92, java.lang.String r93, X.G2k<? super X.BRg, ? super java.lang.Boolean, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r94, boolean r95, X.G0U<? super java.lang.Boolean, kotlin.Unit> r96, X.BRg r97, X.BFM r98, int r99, int r100) {
        /*
            Method dump skipped, instructions count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt.ActivationSubscriptionContent(com.facebook.aura.navigation.key.SubscriptionAttribution, com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel, com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionState, java.lang.String, X.G2k, boolean, X.G0U, X.BRg, X.BFM, int, int):void");
    }
}
