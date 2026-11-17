package com.facebook.aura.subscription.view;

import X.AKQ;
import X.ASj;
import X.AbstractC05192Wm;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1515AkP;
import X.C2HU;
import X.C3U4;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;
import com.facebook.aura.subscription.model.SubscriptionEntryPointDestination;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraSubscriptionUsageCardKt {
    public static final int USAGE_CARD_RESIZE_DURATION_MS = 200;

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageCardKt$AuraSubscriptionUsageCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<SubscriptionEntryPointDestination, Unit> $onEntryPointClick;
        public final /* synthetic */ AuraSubscriptionUsageViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraSubscriptionUsageViewModel.UiState uiState, G0U<? super SubscriptionEntryPointDestination, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = uiState;
            this.$onEntryPointClick = g0u;
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
            AuraSubscriptionUsageCardKt.AuraSubscriptionUsageCard(this.$uiState, this.$onEntryPointClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageCardKt$UsageContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C142102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ Map<String, String> $analyticsMetadata;
        public final /* synthetic */ String $entryPointCtaLabel;
        public final /* synthetic */ SubscriptionEntryPointDestination $entryPointDestination;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isPaidTier;
        public final /* synthetic */ boolean $isRedeemingComplimentary;
        public final /* synthetic */ String $monthlyLabel;
        public final /* synthetic */ String $monthlySubtitle;
        public final /* synthetic */ Integer $monthlyUsedPercent;
        public final /* synthetic */ String $monthlyValueLabel;
        public final /* synthetic */ G0U<SubscriptionEntryPointDestination, Unit> $onEntryPointClick;
        public final /* synthetic */ String $purchasedLabel;
        public final /* synthetic */ Integer $purchasedUsedPercent;
        public final /* synthetic */ String $purchasedValueLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142102(Integer num, String str, String str2, String str3, boolean z, boolean z2, Integer num2, String str4, String str5, String str6, SubscriptionEntryPointDestination subscriptionEntryPointDestination, boolean z3, Map<String, String> map, G0U<? super SubscriptionEntryPointDestination, Unit> g0u, int i, int i2) {
            super(2);
            this.$monthlyUsedPercent = num;
            this.$monthlySubtitle = str;
            this.$monthlyLabel = str2;
            this.$monthlyValueLabel = str3;
            this.$isPaidTier = z;
            this.$isLoading = z2;
            this.$purchasedUsedPercent = num2;
            this.$purchasedLabel = str4;
            this.$purchasedValueLabel = str5;
            this.$entryPointCtaLabel = str6;
            this.$entryPointDestination = subscriptionEntryPointDestination;
            this.$isRedeemingComplimentary = z3;
            this.$analyticsMetadata = map;
            this.$onEntryPointClick = g0u;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageCardKt.UsageContent(this.$monthlyUsedPercent, this.$monthlySubtitle, this.$monthlyLabel, this.$monthlyValueLabel, this.$isPaidTier, this.$isLoading, this.$purchasedUsedPercent, this.$purchasedLabel, this.$purchasedValueLabel, this.$entryPointCtaLabel, this.$entryPointDestination, this.$isRedeemingComplimentary, this.$analyticsMetadata, this.$onEntryPointClick, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageCardKt$UsageContent$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ Map<String, String> $analyticsMetadata;
        public final /* synthetic */ String $entryPointCtaLabel;
        public final /* synthetic */ SubscriptionEntryPointDestination $entryPointDestination;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isPaidTier;
        public final /* synthetic */ boolean $isRedeemingComplimentary;
        public final /* synthetic */ String $monthlyLabel;
        public final /* synthetic */ String $monthlySubtitle;
        public final /* synthetic */ Integer $monthlyUsedPercent;
        public final /* synthetic */ String $monthlyValueLabel;
        public final /* synthetic */ G0U<SubscriptionEntryPointDestination, Unit> $onEntryPointClick;
        public final /* synthetic */ String $purchasedLabel;
        public final /* synthetic */ Integer $purchasedUsedPercent;
        public final /* synthetic */ String $purchasedValueLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Integer num, String str, String str2, String str3, boolean z, boolean z2, Integer num2, String str4, String str5, String str6, SubscriptionEntryPointDestination subscriptionEntryPointDestination, boolean z3, Map<String, String> map, G0U<? super SubscriptionEntryPointDestination, Unit> g0u, int i, int i2) {
            super(2);
            this.$monthlyUsedPercent = num;
            this.$monthlySubtitle = str;
            this.$monthlyLabel = str2;
            this.$monthlyValueLabel = str3;
            this.$isPaidTier = z;
            this.$isLoading = z2;
            this.$purchasedUsedPercent = num2;
            this.$purchasedLabel = str4;
            this.$purchasedValueLabel = str5;
            this.$entryPointCtaLabel = str6;
            this.$entryPointDestination = subscriptionEntryPointDestination;
            this.$isRedeemingComplimentary = z3;
            this.$analyticsMetadata = map;
            this.$onEntryPointClick = g0u;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSubscriptionUsageCardKt.UsageContent(this.$monthlyUsedPercent, this.$monthlySubtitle, this.$monthlyLabel, this.$monthlyValueLabel, this.$isPaidTier, this.$isLoading, this.$purchasedUsedPercent, this.$purchasedLabel, this.$purchasedValueLabel, this.$entryPointCtaLabel, this.$entryPointDestination, this.$isRedeemingComplimentary, this.$analyticsMetadata, this.$onEntryPointClick, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        }
    }

    public static final void AuraSubscriptionUsageCard(AuraSubscriptionUsageViewModel.UiState uiState, G0U<? super SubscriptionEntryPointDestination, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        boolean zA1a = AnonymousClass002.A1a(uiState, g0u);
        bfm.AgG(1715779565);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(uiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            BRg bRgA00 = AbstractC07539Wl.A00(AbstractC05192Wm.A00(new ASj(C2HU.A01, 200, 0), AnonymousClass001.A0R(bRgA0P)), "hatch-subscription-usage-card");
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (uiState instanceof AuraSubscriptionUsageViewModel.UiState.Error) {
                bfm.AgE(-1985644541);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210c7), C3U4.A09(BRg.A00, AuraDimensKt.SpacingMedium), auraColorsA0c.secondaryText, C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else if (uiState instanceof AuraSubscriptionUsageViewModel.UiState.Loading) {
                bfm.AgE(-1985316902);
                UsageContent(null, null, null, null, false, zA1a, null, null, null, null, null, false, null, g0u, bfm, 920350134, ((iA05 << 6) & 7168) | 438);
            } else {
                if (!(uiState instanceof AuraSubscriptionUsageViewModel.UiState.Loaded)) {
                    throw AnonymousClass003.A0k(bfm, bbi, 767229514);
                }
                bfm.AgE(-1984674210);
                AuraSubscriptionUsageViewModel.UiState.Loaded loaded = (AuraSubscriptionUsageViewModel.UiState.Loaded) uiState;
                UsageContent(loaded.monthlyUsedPercent, loaded.statusSubtitle, loaded.usageRowLabel, loaded.monthlyValueLabel, loaded.isPaidTier, false, loaded.purchasedUsedPercent, loaded.purchasedRowLabel, loaded.purchasedValueLabel, loaded.entryPointCtaLabel, loaded.actions.entryPointDestination, loaded.isRedeemingComplimentary, AuraSubscriptionUsageViewModelKt.subscriptionAnalyticsMetadata(uiState), g0u, bfm, 196608, (iA05 << 6) & 7168);
            }
            BBI.A0R(bbi, false);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(uiState, g0u, bRgA0P, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e3  */
    /* JADX WARN: Type inference failed for: r4v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void UsageContent(java.lang.Integer r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, boolean r60, boolean r61, java.lang.Integer r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, com.facebook.aura.subscription.model.SubscriptionEntryPointDestination r66, boolean r67, java.util.Map<java.lang.String, java.lang.String> r68, X.G0U<? super com.facebook.aura.subscription.model.SubscriptionEntryPointDestination, kotlin.Unit> r69, X.BFM r70, int r71, int r72) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionUsageCardKt.UsageContent(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.subscription.model.SubscriptionEntryPointDestination, boolean, java.util.Map, X.G0U, X.BFM, int, int):void");
    }
}
