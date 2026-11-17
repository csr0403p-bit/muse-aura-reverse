package com.facebook.aura.subscription.model;

import X.AEs;
import X.AEu;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C22I;
import X.C3Ek;
import X.C3Em;
import X.C3UX;
import X.C3rb;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.GBM;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt;
import com.facebook.aura.subscription.repo.HatchSubscriptionStatus;
import com.facebook.aura.subscription.repo.SubscriptionCrossPlatformDialog;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<PaymentPortalEvent> _paymentPortalEvent;
    public final C22I<PaymentPortalEvent> paymentPortalEvent;
    public final AuraSubscriptionRepository repository;
    public final C1BN<UiState> uiState;

    public final class Factory extends AuraViewModelFactory<AuraSubscriptionUsageViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraSubscriptionUsageViewModel create() {
            return new AuraSubscriptionUsageViewModel(AuraSubscriptionRepository.Companion.getInstance(this.userSession), ComplimentarySubscriptionRedemptionController.Companion.getInstance(this.userSession));
        }
    }

    public interface PaymentPortalEvent {

        public final class Error implements PaymentPortalEvent {
            public static final int $stable = 0;
            public static final Error INSTANCE = new Error();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public String toString() {
                return "Error";
            }

            public int hashCode() {
                return 2012186567;
            }
        }

        public final class Open extends C06G implements PaymentPortalEvent {
            public static final int $stable = 0;
            public final String url;

            public Open(String str) {
                C7384Etj.A0Y(str, 0);
                this.url = str;
            }

            public final Open copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Open(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Open) && C7384Etj.areEqual(this.url, ((Open) obj).url));
            }

            public static /* synthetic */ Open copy$default(Open open, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = open.url;
                }
                C7384Etj.A0Y(str, 0);
                return new Open(str);
            }

            public final String component1() {
                return this.url;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public interface ResumeOutcome {

        public final class Failed implements ResumeOutcome {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Failed);
            }

            public String toString() {
                return "Failed";
            }

            public int hashCode() {
                return -946266581;
            }
        }

        public final class Reactivated implements ResumeOutcome {
            public static final int $stable = 0;
            public static final Reactivated INSTANCE = new Reactivated();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Reactivated);
            }

            public String toString() {
                return "Reactivated";
            }

            public int hashCode() {
                return 910983120;
            }
        }
    }

    public interface UiState {

        public final class Error implements UiState {
            public static final int $stable = 0;
            public static final Error INSTANCE = new Error();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public String toString() {
                return "Error";
            }

            public int hashCode() {
                return 1180158098;
            }
        }

        public final class Loaded extends C06G implements UiState {
            public static final int $stable = SubscriptionCrossPlatformDialog.$stable | SubscriptionActions.$stable;
            public final SubscriptionActions actions;
            public final UsageActionsSlot actionsSlot;
            public final String billingSubtitle;
            public final SubscriptionCrossPlatformDialog crossPlatformDialog;
            public final String crossPlatformMessage;
            public final String entryPointCtaLabel;
            public final boolean isCrossPlatform;
            public final boolean isGooglePurchasePlatform;
            public final boolean isPaidTier;
            public final boolean isRedeemingComplimentary;
            public final Integer monthlyUsedPercent;
            public final String monthlyValueLabel;
            public final Long nextBillingDate;
            public final String purchasedRowLabel;
            public final Integer purchasedUsedPercent;
            public final String purchasedValueLabel;
            public final HatchSubscriptionStatus status;
            public final String statusSubtitle;
            public final String tierCode;
            public final String usageRowFooter;
            public final String usageRowLabel;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Loaded) {
                        Loaded loaded = (Loaded) obj;
                        if (!C7384Etj.areEqual(this.monthlyUsedPercent, loaded.monthlyUsedPercent) || !C7384Etj.areEqual(this.nextBillingDate, loaded.nextBillingDate) || this.status != loaded.status || !C7384Etj.areEqual(this.tierCode, loaded.tierCode) || !C7384Etj.areEqual(this.purchasedUsedPercent, loaded.purchasedUsedPercent) || !C7384Etj.areEqual(this.statusSubtitle, loaded.statusSubtitle) || !C7384Etj.areEqual(this.usageRowLabel, loaded.usageRowLabel) || !C7384Etj.areEqual(this.monthlyValueLabel, loaded.monthlyValueLabel) || !C7384Etj.areEqual(this.usageRowFooter, loaded.usageRowFooter) || !C7384Etj.areEqual(this.purchasedRowLabel, loaded.purchasedRowLabel) || !C7384Etj.areEqual(this.purchasedValueLabel, loaded.purchasedValueLabel) || !C7384Etj.areEqual(this.billingSubtitle, loaded.billingSubtitle) || !C7384Etj.areEqual(this.entryPointCtaLabel, loaded.entryPointCtaLabel) || !C7384Etj.areEqual(this.actions, loaded.actions) || this.isPaidTier != loaded.isPaidTier || this.isCrossPlatform != loaded.isCrossPlatform || !C7384Etj.areEqual(this.crossPlatformMessage, loaded.crossPlatformMessage) || !C7384Etj.areEqual(this.crossPlatformDialog, loaded.crossPlatformDialog) || this.isGooglePurchasePlatform != loaded.isGooglePurchasePlatform || this.actionsSlot != loaded.actionsSlot || this.isRedeemingComplimentary != loaded.isRedeemingComplimentary) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final Integer component1() {
                return this.monthlyUsedPercent;
            }

            public final String component10() {
                return this.purchasedRowLabel;
            }

            public final String component11() {
                return this.purchasedValueLabel;
            }

            public final String component12() {
                return this.billingSubtitle;
            }

            public final String component13() {
                return this.entryPointCtaLabel;
            }

            public final SubscriptionActions component14() {
                return this.actions;
            }

            public final boolean component15() {
                return this.isPaidTier;
            }

            public final boolean component16() {
                return this.isCrossPlatform;
            }

            public final String component17() {
                return this.crossPlatformMessage;
            }

            public final SubscriptionCrossPlatformDialog component18() {
                return this.crossPlatformDialog;
            }

            public final boolean component19() {
                return this.isGooglePurchasePlatform;
            }

            public final Long component2() {
                return this.nextBillingDate;
            }

            public final UsageActionsSlot component20() {
                return this.actionsSlot;
            }

            public final boolean component21() {
                return this.isRedeemingComplimentary;
            }

            public final HatchSubscriptionStatus component3() {
                return this.status;
            }

            public final String component4() {
                return this.tierCode;
            }

            public final Integer component5() {
                return this.purchasedUsedPercent;
            }

            public final String component6() {
                return this.statusSubtitle;
            }

            public final String component7() {
                return this.usageRowLabel;
            }

            public final String component8() {
                return this.monthlyValueLabel;
            }

            public final String component9() {
                return this.usageRowFooter;
            }

            public final Loaded copy(Integer num, Long l, HatchSubscriptionStatus hatchSubscriptionStatus, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SubscriptionActions subscriptionActions, boolean z, boolean z2, String str10, SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog, boolean z3, UsageActionsSlot usageActionsSlot, boolean z4) {
                C7384Etj.A0Y(subscriptionActions, 13);
                C7384Etj.A0Y(usageActionsSlot, 19);
                return new Loaded(num, l, hatchSubscriptionStatus, str, num2, str2, str3, str4, str5, str6, str7, str8, str9, subscriptionActions, z, z2, str10, subscriptionCrossPlatformDialog, z3, usageActionsSlot, z4);
            }

            public final SubscriptionActions getActions() {
                return this.actions;
            }

            public final UsageActionsSlot getActionsSlot() {
                return this.actionsSlot;
            }

            public final String getBillingSubtitle() {
                return this.billingSubtitle;
            }

            public final SubscriptionCrossPlatformDialog getCrossPlatformDialog() {
                return this.crossPlatformDialog;
            }

            public final String getCrossPlatformMessage() {
                return this.crossPlatformMessage;
            }

            public final String getEntryPointCtaLabel() {
                return this.entryPointCtaLabel;
            }

            public final Integer getMonthlyUsedPercent() {
                return this.monthlyUsedPercent;
            }

            public final String getMonthlyValueLabel() {
                return this.monthlyValueLabel;
            }

            public final Long getNextBillingDate() {
                return this.nextBillingDate;
            }

            public final String getPurchasedRowLabel() {
                return this.purchasedRowLabel;
            }

            public final Integer getPurchasedUsedPercent() {
                return this.purchasedUsedPercent;
            }

            public final String getPurchasedValueLabel() {
                return this.purchasedValueLabel;
            }

            public final HatchSubscriptionStatus getStatus() {
                return this.status;
            }

            public final String getStatusSubtitle() {
                return this.statusSubtitle;
            }

            public final String getTierCode() {
                return this.tierCode;
            }

            public final String getUsageRowFooter() {
                return this.usageRowFooter;
            }

            public final String getUsageRowLabel() {
                return this.usageRowLabel;
            }

            public int hashCode() {
                return C0KA.A00(AnonymousClass005.A0F(this.actionsSlot, C0KA.A01((((C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.actions, ((((((((((((((((((((((((AnonymousClass006.A0D(this.monthlyUsedPercent) * 31) + AnonymousClass006.A0D(this.nextBillingDate)) * 31) + AnonymousClass006.A0D(this.status)) * 31) + AnonymousClass006.A0G(this.tierCode)) * 31) + AnonymousClass006.A0D(this.purchasedUsedPercent)) * 31) + AnonymousClass006.A0G(this.statusSubtitle)) * 31) + AnonymousClass006.A0G(this.usageRowLabel)) * 31) + AnonymousClass006.A0G(this.monthlyValueLabel)) * 31) + AnonymousClass006.A0G(this.usageRowFooter)) * 31) + AnonymousClass006.A0G(this.purchasedRowLabel)) * 31) + AnonymousClass006.A0G(this.purchasedValueLabel)) * 31) + AnonymousClass006.A0G(this.billingSubtitle)) * 31) + AnonymousClass006.A0G(this.entryPointCtaLabel)) * 31), this.isPaidTier), this.isCrossPlatform) + AnonymousClass006.A0G(this.crossPlatformMessage)) * 31) + C06G.A04(this.crossPlatformDialog)) * 31, this.isGooglePurchasePlatform)), this.isRedeemingComplimentary);
            }

            public final boolean isCrossPlatform() {
                return this.isCrossPlatform;
            }

            public final boolean isGooglePurchasePlatform() {
                return this.isGooglePurchasePlatform;
            }

            public final boolean isPaidTier() {
                return this.isPaidTier;
            }

            public final boolean isRedeemingComplimentary() {
                return this.isRedeemingComplimentary;
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Loaded(Integer num, Long l, HatchSubscriptionStatus hatchSubscriptionStatus, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SubscriptionActions subscriptionActions, boolean z, boolean z2, String str10, SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog, boolean z3, UsageActionsSlot usageActionsSlot, boolean z4, int i, C06H c06h) {
                this(num, l, hatchSubscriptionStatus, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? new SubscriptionActions(null, null, false, AHI.A01, false, SubscriptionEntryPointDestination.UPGRADE, null) : subscriptionActions, z, C06G.A0o(32768, i, z2), (65536 & i) != 0 ? null : str10, (131072 & i) != 0 ? null : subscriptionCrossPlatformDialog, C06G.A0o(262144, i, z3), (524288 & i) != 0 ? UsageActionsSlot.ROWS : usageActionsSlot, C06G.A0o(i, 1048576, z4));
            }

            public static /* synthetic */ Loaded copy$default(Loaded loaded, Integer num, Long l, HatchSubscriptionStatus hatchSubscriptionStatus, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SubscriptionActions subscriptionActions, boolean z, boolean z2, String str10, SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog, boolean z3, UsageActionsSlot usageActionsSlot, boolean z4, int i, Object obj) {
                Integer num3 = num;
                Long l2 = l;
                HatchSubscriptionStatus hatchSubscriptionStatus2 = hatchSubscriptionStatus;
                String str11 = str;
                Integer num4 = num2;
                String str12 = str2;
                String str13 = str3;
                String str14 = str4;
                String str15 = str5;
                String str16 = str6;
                String str17 = str7;
                String str18 = str8;
                String str19 = str9;
                SubscriptionActions subscriptionActions2 = subscriptionActions;
                boolean z5 = z;
                boolean z6 = z2;
                String str20 = str10;
                SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog2 = subscriptionCrossPlatformDialog;
                UsageActionsSlot usageActionsSlot2 = usageActionsSlot;
                boolean z7 = z3;
                boolean z8 = z4;
                if ((i & 1) != 0) {
                    num3 = loaded.monthlyUsedPercent;
                }
                if ((i & 2) != 0) {
                    l2 = loaded.nextBillingDate;
                }
                if ((i & 4) != 0) {
                    hatchSubscriptionStatus2 = loaded.status;
                }
                if ((i & 8) != 0) {
                    str11 = loaded.tierCode;
                }
                if ((i & 16) != 0) {
                    num4 = loaded.purchasedUsedPercent;
                }
                if ((i & 32) != 0) {
                    str12 = loaded.statusSubtitle;
                }
                if ((i & 64) != 0) {
                    str13 = loaded.usageRowLabel;
                }
                if ((i & 128) != 0) {
                    str14 = loaded.monthlyValueLabel;
                }
                if ((i & 256) != 0) {
                    str15 = loaded.usageRowFooter;
                }
                if ((i & 512) != 0) {
                    str16 = loaded.purchasedRowLabel;
                }
                if ((i & 1024) != 0) {
                    str17 = loaded.purchasedValueLabel;
                }
                if ((i & 2048) != 0) {
                    str18 = loaded.billingSubtitle;
                }
                if ((i & 4096) != 0) {
                    str19 = loaded.entryPointCtaLabel;
                }
                if ((i & 8192) != 0) {
                    subscriptionActions2 = loaded.actions;
                }
                if ((i & 16384) != 0) {
                    z5 = loaded.isPaidTier;
                }
                if ((i & 32768) != 0) {
                    z6 = loaded.isCrossPlatform;
                }
                if ((i & 65536) != 0) {
                    str20 = loaded.crossPlatformMessage;
                }
                if ((i & 131072) != 0) {
                    subscriptionCrossPlatformDialog2 = loaded.crossPlatformDialog;
                }
                if ((i & 262144) != 0) {
                    z7 = loaded.isGooglePurchasePlatform;
                }
                if ((i & 524288) != 0) {
                    usageActionsSlot2 = loaded.actionsSlot;
                }
                if ((i & 1048576) != 0) {
                    z8 = loaded.isRedeemingComplimentary;
                }
                String str21 = str15;
                String str22 = str16;
                String str23 = str17;
                String str24 = str18;
                String str25 = str19;
                return loaded.copy(num3, l2, hatchSubscriptionStatus2, str11, num4, str12, str13, str14, str21, str22, str23, str24, str25, subscriptionActions2, z5, z6, str20, subscriptionCrossPlatformDialog2, z7, usageActionsSlot2, z8);
            }

            public Loaded(Integer num, Long l, HatchSubscriptionStatus hatchSubscriptionStatus, String str, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SubscriptionActions subscriptionActions, boolean z, boolean z2, String str10, SubscriptionCrossPlatformDialog subscriptionCrossPlatformDialog, boolean z3, UsageActionsSlot usageActionsSlot, boolean z4) {
                C7384Etj.A0Y(subscriptionActions, 13);
                C7384Etj.A0Y(usageActionsSlot, 19);
                this.monthlyUsedPercent = num;
                this.nextBillingDate = l;
                this.status = hatchSubscriptionStatus;
                this.tierCode = str;
                this.purchasedUsedPercent = num2;
                this.statusSubtitle = str2;
                this.usageRowLabel = str3;
                this.monthlyValueLabel = str4;
                this.usageRowFooter = str5;
                this.purchasedRowLabel = str6;
                this.purchasedValueLabel = str7;
                this.billingSubtitle = str8;
                this.entryPointCtaLabel = str9;
                this.actions = subscriptionActions;
                this.isPaidTier = z;
                this.isCrossPlatform = z2;
                this.crossPlatformMessage = str10;
                this.crossPlatformDialog = subscriptionCrossPlatformDialog;
                this.isGooglePurchasePlatform = z3;
                this.actionsSlot = usageActionsSlot;
                this.isRedeemingComplimentary = z4;
            }
        }

        public final class Loading implements UiState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public String toString() {
                return "Loading";
            }

            public int hashCode() {
                return 2076204358;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel", f = "AuraSubscriptionUsageViewModel.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "emitPaymentPortal", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$emitPaymentPortal$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionUsageViewModel.this.emitPaymentPortal(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$openPaymentPortal$1", f = "AuraSubscriptionUsageViewModel.kt", l = {212}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$openPaymentPortal$1, reason: invalid class name and case insensitive filesystem */
    public final class C141351 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C141351(HtJ<? super C141351> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraSubscriptionUsageViewModel.this.new C141351(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionUsageViewModel auraSubscriptionUsageViewModel = AuraSubscriptionUsageViewModel.this;
                this.label = 1;
                if (auraSubscriptionUsageViewModel.emitPaymentPortal(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraSubscriptionUsageViewModel.this.new C141351(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel", f = "AuraSubscriptionUsageViewModel.kt", l = {196}, m = "resumeSubscription", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$resumeSubscription$1, reason: invalid class name and case insensitive filesystem */
    public final class C141361 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C141361(HtJ<? super C141361> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionUsageViewModel.this.resumeSubscription(this);
        }
    }

    public AuraSubscriptionUsageViewModel(AuraSubscriptionRepository auraSubscriptionRepository, ComplimentarySubscriptionRedemptionController complimentarySubscriptionRedemptionController) {
        boolean zA1a = AnonymousClass002.A1a(auraSubscriptionRepository, complimentarySubscriptionRedemptionController);
        this.repository = auraSubscriptionRepository;
        AnonymousClass603 anonymousClass603A01 = C3rb.A01(AuraSubscriptionUsageViewModel$uiState$1.INSTANCE, auraSubscriptionRepository.subscriptionDetailsState, auraSubscriptionRepository.isSettlingPurchase, auraSubscriptionRepository.provisioningPollExhausted, complimentarySubscriptionRedemptionController.isRedeeming);
        this.uiState = AnonymousClass441.A00(AuraSubscriptionUsageViewModelKt.toUiState(auraSubscriptionRepository.subscriptionDetailsState.getValue(), AnonymousClass001.A1X(auraSubscriptionRepository.isSettlingPurchase.getValue()), AnonymousClass001.A1X(auraSubscriptionRepository.provisioningPollExhausted.getValue()), false), AEu.A00(this), anonymousClass603A01, C3Ek.A00);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, zA1a ? 1 : 0);
        this._paymentPortalEvent = c9290GCr;
        this.paymentPortalEvent = c9290GCr;
        auraSubscriptionRepository.m2262refreshIfStaleLRDsOJo(AuraSubscriptionRepositoryKt.DEFAULT_SUBSCRIPTION_FRESHNESS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emitPaymentPortal(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.AnonymousClass1
            if (r0 == 0) goto L47
            r5 = r7
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$emitPaymentPortal$1 r5 = (com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L4d
            X.Hwg.A00(r2)
        L20:
            java.lang.String r2 = (java.lang.String) r2
            X.3Em<com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$PaymentPortalEvent> r1 = r6._paymentPortalEvent
            if (r2 == 0) goto L31
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$PaymentPortalEvent$Open r0 = new com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$PaymentPortalEvent$Open
            r0.<init>(r2)
        L2b:
            r1.AhV(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L31:
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$PaymentPortalEvent$Error r0 = com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.PaymentPortalEvent.Error.INSTANCE
            goto L2b
        L34:
            X.78T r2 = X.AnonymousClass002.A0s(r2)
            r1 = 0
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$emitPaymentPortal$url$1 r0 = new com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$emitPaymentPortal$url$1
            r0.<init>(r6, r1)
            r5.label = r3
            java.lang.Object r2 = X.GAo.A00(r5, r2, r0)
            if (r2 != r4) goto L20
            return r4
        L47:
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$emitPaymentPortal$1 r5 = new com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$emitPaymentPortal$1
            r5.<init>(r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.emitPaymentPortal(X.HtJ):java.lang.Object");
    }

    public final Object cancelSubscription(HtJ<? super Boolean> htJ) {
        return ((GBM) this.repository.cancelSubscriptionAsync()).A0E(htJ);
    }

    public final C22I<PaymentPortalEvent> getPaymentPortalEvent() {
        return this.paymentPortalEvent;
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void refresh() {
        this.repository.refresh();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resumeSubscription(X.HtJ<? super com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.ResumeOutcome> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.C141361
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$resumeSubscription$1 r4 = (com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.C141361) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r4.label
            r1 = 1
            if (r2 == 0) goto L29
            if (r2 != r1) goto L24
            goto L3d
        L1e:
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$resumeSubscription$1 r4 = new com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$resumeSubscription$1
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r0)
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository r0 = r5.repository     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L4f
            X.27k r0 = r0.reactivateSubscriptionAsync()     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L4f
            r4.label = r1     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L4f
            X.GBM r0 = (X.GBM) r0     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L4f
            java.lang.Object r0 = r0.A0E(r4)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L4f
            if (r0 != r3) goto L40
            return r3
        L3d:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L4f
        L40:
            boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L4f
            if (r0 == 0) goto L49
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$ResumeOutcome$Reactivated r0 = com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.ResumeOutcome.Reactivated.INSTANCE     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L4f
            return r0
        L49:
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$ResumeOutcome$Failed r0 = com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.ResumeOutcome.Failed.INSTANCE     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L4f
            return r0
        L4c:
            com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel$ResumeOutcome$Failed r0 = com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.ResumeOutcome.Failed.INSTANCE
            return r0
        L4f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel.resumeSubscription(X.HtJ):java.lang.Object");
    }

    public final void openPaymentPortal() {
        AnonymousClass001.A1J(new C141351(null), AEu.A00(this));
    }
}
