package com.facebook.aura.subscription.model;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BLL;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C0KA;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.devices.intf.SubscriptionAddOn;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.iap.HatchTierPrice;
import com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.subscription.repo.SubscriptionBlockedActionDialog;
import com.facebook.aura.subscription.repo.SubscriptionCatalog;
import com.facebook.aura.subscription.repo.SubscriptionCheckoutAddOn;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import com.facebook.aura.subscription.repo.SubscriptionNameDialog;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<UiState> _uiState;
    public final Context appContext;
    public final ConcurrentHashMap<Boolean, SubscriptionCatalog> catalogsByIsCvm;
    public final C20Q<ComplimentarySubscriptionRedemptionState> complimentaryClaimState;
    public final boolean defaultsToConfidentialVm;
    public final SubscriptionPaywallEntryPoint entryPoint;
    public final Function0<Boolean> isComplimentaryClaimEligible;
    public final boolean isConfidentialVmSetup;
    public HoC loadJob;
    public final boolean offersComplimentaryClaim;
    public CheckoutNotice pendingCheckoutNotice;
    public PendingPurchase pendingPurchase;
    public final C1BN<PlanPickerGateState> planPickerGate;
    public final ComplimentarySubscriptionRedemptionController redemptionController;
    public final AuraSubscriptionRepository repository;
    public final C1BN<UiState> uiState;
    public boolean usesConfidentialVmCatalog;

    public final class CheckoutAddOnOffer extends C06G {
        public static final int $stable = 0;
        public final SubscriptionAddOnIntegration integration;
        public final String label;
        public final String subtitle;

        public CheckoutAddOnOffer(SubscriptionAddOnIntegration subscriptionAddOnIntegration, String str, String str2) {
            C7384Etj.A0Y(subscriptionAddOnIntegration, 0);
            this.integration = subscriptionAddOnIntegration;
            this.label = str;
            this.subtitle = str2;
        }

        public final CheckoutAddOnOffer copy(SubscriptionAddOnIntegration subscriptionAddOnIntegration, String str, String str2) {
            C7384Etj.A0Y(subscriptionAddOnIntegration, 0);
            return new CheckoutAddOnOffer(subscriptionAddOnIntegration, str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CheckoutAddOnOffer) {
                    CheckoutAddOnOffer checkoutAddOnOffer = (CheckoutAddOnOffer) obj;
                    if (!C7384Etj.areEqual(this.integration, checkoutAddOnOffer.integration) || !C7384Etj.areEqual(this.label, checkoutAddOnOffer.label) || !C7384Etj.areEqual(this.subtitle, checkoutAddOnOffer.subtitle)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CheckoutAddOnOffer copy$default(CheckoutAddOnOffer checkoutAddOnOffer, SubscriptionAddOnIntegration subscriptionAddOnIntegration, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                subscriptionAddOnIntegration = checkoutAddOnOffer.integration;
            }
            if ((i & 2) != 0) {
                str = checkoutAddOnOffer.label;
            }
            if ((i & 4) != 0) {
                str2 = checkoutAddOnOffer.subtitle;
            }
            return checkoutAddOnOffer.copy(subscriptionAddOnIntegration, str, str2);
        }

        public final SubscriptionAddOnIntegration component1() {
            return this.integration;
        }

        public final String component2() {
            return this.label;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final SubscriptionAddOnIntegration getIntegration() {
            return this.integration;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0E(this.integration) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass005.A0H(this.subtitle);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Factory extends AuraViewModelFactory<AuraSubscriptionPaywallViewModel> {
        public static final int $stable = 8;
        public final Context appContext;
        public final SubscriptionPaywallEntryPoint entryPoint;
        public final boolean offersComplimentaryClaim;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraSubscriptionPaywallViewModel create() {
            return new AuraSubscriptionPaywallViewModel(AuraSubscriptionRepository.Companion.getInstance(this.userSession), this.appContext, this.entryPoint, ComplimentarySubscriptionRedemptionController.Companion.getInstance(this.userSession), new AuraSubscriptionPaywallViewModel$Factory$create$1(this), this.offersComplimentaryClaim);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, Context context, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, boolean z) {
            AnonymousClass005.A0x(abstractC3358CGz, context, subscriptionPaywallEntryPoint);
            this.userSession = abstractC3358CGz;
            this.appContext = context;
            this.entryPoint = subscriptionPaywallEntryPoint;
            this.offersComplimentaryClaim = z;
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, Context context, SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, boolean z, int i, C06H c06h) {
            this(abstractC3358CGz, context, subscriptionPaywallEntryPoint, (i & 8) != 0 ? AnonymousClass002.A1Z(subscriptionPaywallEntryPoint, SubscriptionPaywallEntryPoint.ACTIVATION) : z);
        }
    }

    public interface PayNowResult {

        public final class Ignored implements PayNowResult {
            public static final int $stable = 0;
            public static final Ignored INSTANCE = new Ignored();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Ignored);
            }

            public String toString() {
                return "Ignored";
            }

            public int hashCode() {
                return -2037982907;
            }
        }

        public final class Launch extends C06G implements PayNowResult {
            public static final int $stable = 0;
            public final String productId;

            public Launch(String str) {
                C7384Etj.A0Y(str, 0);
                this.productId = str;
            }

            public final Launch copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Launch(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Launch) && C7384Etj.areEqual(this.productId, ((Launch) obj).productId));
            }

            public static /* synthetic */ Launch copy$default(Launch launch, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = launch.productId;
                }
                C7384Etj.A0Y(str, 0);
                return new Launch(str);
            }

            public final String component1() {
                return this.productId;
            }

            public final String getProductId() {
                return this.productId;
            }

            public int hashCode() {
                return this.productId.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class NeedsName extends C06G implements PayNowResult {
            public static final int $stable = 0;
            public final SubscriptionNameDialog dialog;
            public final Disclaimer disclaimer;

            public NeedsName(SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer) {
                C7384Etj.A0Y(subscriptionNameDialog, 0);
                this.dialog = subscriptionNameDialog;
                this.disclaimer = disclaimer;
            }

            public final NeedsName copy(SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer) {
                C7384Etj.A0Y(subscriptionNameDialog, 0);
                return new NeedsName(subscriptionNameDialog, disclaimer);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof NeedsName) {
                        NeedsName needsName = (NeedsName) obj;
                        if (!C7384Etj.areEqual(this.dialog, needsName.dialog) || !C7384Etj.areEqual(this.disclaimer, needsName.disclaimer)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ NeedsName copy$default(NeedsName needsName, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer, int i, Object obj) {
                if ((i & 1) != 0) {
                    subscriptionNameDialog = needsName.dialog;
                }
                if ((i & 2) != 0) {
                    disclaimer = needsName.disclaimer;
                }
                C7384Etj.A0Y(subscriptionNameDialog, 0);
                return new NeedsName(subscriptionNameDialog, disclaimer);
            }

            public final SubscriptionNameDialog component1() {
                return this.dialog;
            }

            public final Disclaimer component2() {
                return this.disclaimer;
            }

            public final SubscriptionNameDialog getDialog() {
                return this.dialog;
            }

            public final Disclaimer getDisclaimer() {
                return this.disclaimer;
            }

            public int hashCode() {
                return AnonymousClass005.A0E(this.dialog) + AnonymousClass006.A0D(this.disclaimer);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Settling implements PayNowResult {
            public static final int $stable = 0;
            public static final Settling INSTANCE = new Settling();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Settling);
            }

            public String toString() {
                return "Settling";
            }

            public int hashCode() {
                return -103515851;
            }
        }
    }

    public final class PendingPurchase extends C06G {
        public final String name;
        public final String tierId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingPurchase) {
                    PendingPurchase pendingPurchase = (PendingPurchase) obj;
                    if (!C7384Etj.areEqual(this.tierId, pendingPurchase.tierId) || !C7384Etj.areEqual(this.name, pendingPurchase.name)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingPurchase copy$default(PendingPurchase pendingPurchase, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingPurchase.tierId;
            }
            if ((i & 2) != 0) {
                str2 = pendingPurchase.name;
            }
            return new PendingPurchase(str, str2);
        }

        public final String component1() {
            return this.tierId;
        }

        public final String component2() {
            return this.name;
        }

        public final PendingPurchase copy(String str, String str2) {
            return new PendingPurchase(str, str2);
        }

        public final String getName() {
            return this.name;
        }

        public final String getTierId() {
            return this.tierId;
        }

        public int hashCode() {
            return (AnonymousClass006.A0G(this.tierId) * 31) + AnonymousClass005.A0H(this.name);
        }

        public PendingPurchase(String str, String str2) {
            this.tierId = str;
            this.name = str2;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PurchaseOutcome {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ PurchaseOutcome[] $VALUES;
        public static final PurchaseOutcome CANCELED;
        public static final PurchaseOutcome FAILED;
        public static final PurchaseOutcome PENDING;
        public static final PurchaseOutcome SUCCESS;

        static {
            PurchaseOutcome purchaseOutcome = new PurchaseOutcome("SUCCESS", 0);
            SUCCESS = purchaseOutcome;
            PurchaseOutcome purchaseOutcome2 = new PurchaseOutcome("CANCELED", 1);
            CANCELED = purchaseOutcome2;
            PurchaseOutcome purchaseOutcome3 = new PurchaseOutcome(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 2);
            PENDING = purchaseOutcome3;
            PurchaseOutcome purchaseOutcome4 = new PurchaseOutcome(CvmMigrationStatusJson.STAGE_FAILED, 3);
            FAILED = purchaseOutcome4;
            PurchaseOutcome[] purchaseOutcomeArr = {purchaseOutcome, purchaseOutcome2, purchaseOutcome3, purchaseOutcome4};
            $VALUES = purchaseOutcomeArr;
            $ENTRIES = C3cG.A0w(purchaseOutcomeArr);
        }

        public static Ey9<PurchaseOutcome> getEntries() {
            return $ENTRIES;
        }

        public static PurchaseOutcome valueOf(String str) {
            return (PurchaseOutcome) Enum.valueOf(PurchaseOutcome.class, str);
        }

        public static PurchaseOutcome[] values() {
            return (PurchaseOutcome[]) $VALUES.clone();
        }

        public PurchaseOutcome(String str, int i) {
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
                return 383023905;
            }
        }

        public final class Loaded extends C06G implements UiState {
            public static final int $stable = 0;
            public final BO6<String, String> analyticsMetadata;
            public final SubscriptionBlockedActionDialog blockedActionDialog;
            public final boolean canBuyTopUp;
            public final CheckoutAddOnOffer checkoutAddOn;
            public final CheckoutNotice checkoutNotice;
            public final String complimentaryClaimProductId;
            public final String currentProductId;
            public final String currentTierCode;
            public final String defaultSelectedProductId;
            public final boolean isPaidTier;
            public final boolean isPurchasing;
            public final boolean isTopTier;
            public final SubscriptionNameDialog nameCollection;
            public final boolean planChangeBlocked;
            public final BO6<String, HatchTierPrice> prices;
            public final AHD<SubscriptionProduct> products;
            public final String purchaseCtaLabel;
            public final Disclaimer purchaseDisclaimer;
            public final Disclaimer purchaseNotice;
            public final String topUpLabel;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Loaded) {
                        Loaded loaded = (Loaded) obj;
                        if (!C7384Etj.areEqual(this.products, loaded.products) || !C7384Etj.areEqual(this.currentProductId, loaded.currentProductId) || !C7384Etj.areEqual(this.defaultSelectedProductId, loaded.defaultSelectedProductId) || !C7384Etj.areEqual(this.prices, loaded.prices) || this.isPurchasing != loaded.isPurchasing || this.checkoutNotice != loaded.checkoutNotice || this.isTopTier != loaded.isTopTier || this.isPaidTier != loaded.isPaidTier || this.canBuyTopUp != loaded.canBuyTopUp || !C7384Etj.areEqual(this.topUpLabel, loaded.topUpLabel) || !C7384Etj.areEqual(this.purchaseDisclaimer, loaded.purchaseDisclaimer) || !C7384Etj.areEqual(this.purchaseNotice, loaded.purchaseNotice) || this.planChangeBlocked != loaded.planChangeBlocked || !C7384Etj.areEqual(this.blockedActionDialog, loaded.blockedActionDialog) || !C7384Etj.areEqual(this.nameCollection, loaded.nameCollection) || !C7384Etj.areEqual(this.purchaseCtaLabel, loaded.purchaseCtaLabel) || !C7384Etj.areEqual(this.checkoutAddOn, loaded.checkoutAddOn) || !C7384Etj.areEqual(this.currentTierCode, loaded.currentTierCode) || !C7384Etj.areEqual(this.analyticsMetadata, loaded.analyticsMetadata) || !C7384Etj.areEqual(this.complimentaryClaimProductId, loaded.complimentaryClaimProductId)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final AHD<SubscriptionProduct> component1() {
                return this.products;
            }

            public final String component10() {
                return this.topUpLabel;
            }

            public final Disclaimer component11() {
                return this.purchaseDisclaimer;
            }

            public final Disclaimer component12() {
                return this.purchaseNotice;
            }

            public final boolean component13() {
                return this.planChangeBlocked;
            }

            public final SubscriptionBlockedActionDialog component14() {
                return this.blockedActionDialog;
            }

            public final SubscriptionNameDialog component15() {
                return this.nameCollection;
            }

            public final String component16() {
                return this.purchaseCtaLabel;
            }

            public final CheckoutAddOnOffer component17() {
                return this.checkoutAddOn;
            }

            public final String component18() {
                return this.currentTierCode;
            }

            public final BO6<String, String> component19() {
                return this.analyticsMetadata;
            }

            public final String component2() {
                return this.currentProductId;
            }

            public final String component20() {
                return this.complimentaryClaimProductId;
            }

            public final String component3() {
                return this.defaultSelectedProductId;
            }

            public final BO6<String, HatchTierPrice> component4() {
                return this.prices;
            }

            public final boolean component5() {
                return this.isPurchasing;
            }

            public final CheckoutNotice component6() {
                return this.checkoutNotice;
            }

            public final boolean component7() {
                return this.isTopTier;
            }

            public final boolean component8() {
                return this.isPaidTier;
            }

            public final boolean component9() {
                return this.canBuyTopUp;
            }

            public final BO6<String, String> getAnalyticsMetadata() {
                return this.analyticsMetadata;
            }

            public final SubscriptionBlockedActionDialog getBlockedActionDialog() {
                return this.blockedActionDialog;
            }

            public final boolean getCanBuyTopUp() {
                return this.canBuyTopUp;
            }

            public final CheckoutAddOnOffer getCheckoutAddOn() {
                return this.checkoutAddOn;
            }

            public final CheckoutNotice getCheckoutNotice() {
                return this.checkoutNotice;
            }

            public final String getComplimentaryClaimProductId() {
                return this.complimentaryClaimProductId;
            }

            public final String getCurrentProductId() {
                return this.currentProductId;
            }

            public final String getCurrentTierCode() {
                return this.currentTierCode;
            }

            public final String getDefaultSelectedProductId() {
                return this.defaultSelectedProductId;
            }

            public final SubscriptionNameDialog getNameCollection() {
                return this.nameCollection;
            }

            public final boolean getPlanChangeBlocked() {
                return this.planChangeBlocked;
            }

            public final BO6<String, HatchTierPrice> getPrices() {
                return this.prices;
            }

            public final AHD<SubscriptionProduct> getProducts() {
                return this.products;
            }

            public final String getPurchaseCtaLabel() {
                return this.purchaseCtaLabel;
            }

            public final Disclaimer getPurchaseDisclaimer() {
                return this.purchaseDisclaimer;
            }

            public final Disclaimer getPurchaseNotice() {
                return this.purchaseNotice;
            }

            public final String getTopUpLabel() {
                return this.topUpLabel;
            }

            public int hashCode() {
                return ((((((((((((C0KA.A01((((((C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01(AnonymousClass005.A0F(this.prices, (((AnonymousClass005.A0E(this.products) + AnonymousClass006.A0G(this.currentProductId)) * 31) + AnonymousClass006.A0G(this.defaultSelectedProductId)) * 31), this.isPurchasing) + AnonymousClass006.A0D(this.checkoutNotice)) * 31, this.isTopTier), this.isPaidTier), this.canBuyTopUp) + AnonymousClass006.A0G(this.topUpLabel)) * 31) + AnonymousClass006.A0D(this.purchaseDisclaimer)) * 31) + AnonymousClass006.A0D(this.purchaseNotice)) * 31, this.planChangeBlocked) + AnonymousClass006.A0D(this.blockedActionDialog)) * 31) + AnonymousClass006.A0D(this.nameCollection)) * 31) + AnonymousClass006.A0G(this.purchaseCtaLabel)) * 31) + AnonymousClass006.A0D(this.checkoutAddOn)) * 31) + AnonymousClass006.A0G(this.currentTierCode)) * 31) + AnonymousClass006.A0D(this.analyticsMetadata)) * 31) + AnonymousClass005.A0H(this.complimentaryClaimProductId);
            }

            public final boolean isPaidTier() {
                return this.isPaidTier;
            }

            public final boolean isPurchasing() {
                return this.isPurchasing;
            }

            public final boolean isTopTier() {
                return this.isTopTier;
            }

            public Loaded(AHD<SubscriptionProduct> ahd, String str, String str2, BO6<String, HatchTierPrice> bo6, boolean z, CheckoutNotice checkoutNotice, boolean z2, boolean z3, boolean z4, String str3, Disclaimer disclaimer, Disclaimer disclaimer2, boolean z5, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, SubscriptionNameDialog subscriptionNameDialog, String str4, CheckoutAddOnOffer checkoutAddOnOffer, String str5, BO6<String, String> bo62, String str6) {
                AnonymousClass003.A0w(ahd, bo6);
                this.products = ahd;
                this.currentProductId = str;
                this.defaultSelectedProductId = str2;
                this.prices = bo6;
                this.isPurchasing = z;
                this.checkoutNotice = checkoutNotice;
                this.isTopTier = z2;
                this.isPaidTier = z3;
                this.canBuyTopUp = z4;
                this.topUpLabel = str3;
                this.purchaseDisclaimer = disclaimer;
                this.purchaseNotice = disclaimer2;
                this.planChangeBlocked = z5;
                this.blockedActionDialog = subscriptionBlockedActionDialog;
                this.nameCollection = subscriptionNameDialog;
                this.purchaseCtaLabel = str4;
                this.checkoutAddOn = checkoutAddOnOffer;
                this.currentTierCode = str5;
                this.analyticsMetadata = bo62;
                this.complimentaryClaimProductId = str6;
            }

            public final Loaded copy(AHD<SubscriptionProduct> ahd, String str, String str2, BO6<String, HatchTierPrice> bo6, boolean z, CheckoutNotice checkoutNotice, boolean z2, boolean z3, boolean z4, String str3, Disclaimer disclaimer, Disclaimer disclaimer2, boolean z5, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, SubscriptionNameDialog subscriptionNameDialog, String str4, CheckoutAddOnOffer checkoutAddOnOffer, String str5, BO6<String, String> bo62, String str6) {
                AnonymousClass003.A0w(ahd, bo6);
                return new Loaded(ahd, str, str2, bo6, z, checkoutNotice, z2, z3, z4, str3, disclaimer, disclaimer2, z5, subscriptionBlockedActionDialog, subscriptionNameDialog, str4, checkoutAddOnOffer, str5, bo62, str6);
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ Loaded copy$default(Loaded loaded, AHD ahd, String str, String str2, BO6 bo6, boolean z, CheckoutNotice checkoutNotice, boolean z2, boolean z3, boolean z4, String str3, Disclaimer disclaimer, Disclaimer disclaimer2, boolean z5, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, SubscriptionNameDialog subscriptionNameDialog, String str4, CheckoutAddOnOffer checkoutAddOnOffer, String str5, BO6 bo62, String str6, int i, Object obj) {
                AHD ahd2 = ahd;
                String str7 = str;
                String str8 = str2;
                BO6 bo63 = bo6;
                boolean z6 = z;
                CheckoutNotice checkoutNotice2 = checkoutNotice;
                boolean z7 = z2;
                boolean z8 = z3;
                boolean z9 = z4;
                String str9 = str3;
                Disclaimer disclaimer3 = disclaimer;
                Disclaimer disclaimer4 = disclaimer2;
                boolean z10 = z5;
                SubscriptionBlockedActionDialog subscriptionBlockedActionDialog2 = subscriptionBlockedActionDialog;
                SubscriptionNameDialog subscriptionNameDialog2 = subscriptionNameDialog;
                String str10 = str4;
                CheckoutAddOnOffer checkoutAddOnOffer2 = checkoutAddOnOffer;
                String str11 = str5;
                BO6 bo64 = bo62;
                String str12 = str6;
                if ((i & 1) != 0) {
                    ahd2 = loaded.products;
                }
                if ((i & 2) != 0) {
                    str7 = loaded.currentProductId;
                }
                if ((i & 4) != 0) {
                    str8 = loaded.defaultSelectedProductId;
                }
                if ((i & 8) != 0) {
                    bo63 = loaded.prices;
                }
                if ((i & 16) != 0) {
                    z6 = loaded.isPurchasing;
                }
                if ((i & 32) != 0) {
                    checkoutNotice2 = loaded.checkoutNotice;
                }
                if ((i & 64) != 0) {
                    z7 = loaded.isTopTier;
                }
                if ((i & 128) != 0) {
                    z8 = loaded.isPaidTier;
                }
                if ((i & 256) != 0) {
                    z9 = loaded.canBuyTopUp;
                }
                if ((i & 512) != 0) {
                    str9 = loaded.topUpLabel;
                }
                if ((i & 1024) != 0) {
                    disclaimer3 = loaded.purchaseDisclaimer;
                }
                if ((i & 2048) != 0) {
                    disclaimer4 = loaded.purchaseNotice;
                }
                if ((i & 4096) != 0) {
                    z10 = loaded.planChangeBlocked;
                }
                if ((i & 8192) != 0) {
                    subscriptionBlockedActionDialog2 = loaded.blockedActionDialog;
                }
                if ((i & 16384) != 0) {
                    subscriptionNameDialog2 = loaded.nameCollection;
                }
                if ((i & 32768) != 0) {
                    str10 = loaded.purchaseCtaLabel;
                }
                if ((i & 65536) != 0) {
                    checkoutAddOnOffer2 = loaded.checkoutAddOn;
                }
                if ((i & 131072) != 0) {
                    str11 = loaded.currentTierCode;
                }
                if ((i & 262144) != 0) {
                    bo64 = loaded.analyticsMetadata;
                }
                if ((i & 524288) != 0) {
                    str12 = loaded.complimentaryClaimProductId;
                }
                AnonymousClass003.A0w(ahd2, bo63);
                boolean z11 = z8;
                boolean z12 = z9;
                return new Loaded(ahd2, str7, str8, bo63, z6, checkoutNotice2, z7, z11, z12, str9, disclaimer3, disclaimer4, z10, subscriptionBlockedActionDialog2, subscriptionNameDialog2, str10, checkoutAddOnOffer2, str11, bo64, str12);
            }

            public /* synthetic */ Loaded(AHD ahd, String str, String str2, BO6 bo6, boolean z, CheckoutNotice checkoutNotice, boolean z2, boolean z3, boolean z4, String str3, Disclaimer disclaimer, Disclaimer disclaimer2, boolean z5, SubscriptionBlockedActionDialog subscriptionBlockedActionDialog, SubscriptionNameDialog subscriptionNameDialog, String str4, CheckoutAddOnOffer checkoutAddOnOffer, String str5, BO6 bo62, String str6, int i, C06H c06h) {
                this(ahd, str, str2, (i & 8) != 0 ? C0953AJg.A03 : bo6, C3cI.A1S(i, z), (i & 32) != 0 ? null : checkoutNotice, C3cG.A1K(i & 64, z2), C3cH.A1N(i, z3), C3cG.A1K(i & 256, z4), (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : disclaimer, (i & 2048) != 0 ? null : disclaimer2, C3cG.A1K(i & 4096, z5), (i & 8192) != 0 ? null : subscriptionBlockedActionDialog, (i & 16384) != 0 ? null : subscriptionNameDialog, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? null : checkoutAddOnOffer, (131072 & i) != 0 ? null : str5, (262144 & i) != 0 ? null : bo62, (i & 524288) != 0 ? null : str6);
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
                return 534423573;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel", f = "AuraSubscriptionPaywallViewModel.kt", l = {501}, m = "applyPlayStorePrices", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$applyPlayStorePrices$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSubscriptionPaywallViewModel.this.applyPlayStorePrices(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1", f = "AuraSubscriptionPaywallViewModel.kt", l = {335, 378}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C141331 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SubscriptionCatalog $cachedCatalog;
        public final /* synthetic */ CheckoutNotice $carriedNotice;
        public final /* synthetic */ boolean $isCvm;
        public final /* synthetic */ BO6<String, HatchTierPrice> $shownPrices;
        public Object L$0;
        public int label;
        public final /* synthetic */ AuraSubscriptionPaywallViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141331(SubscriptionCatalog subscriptionCatalog, BO6<String, HatchTierPrice> bo6, AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel, CheckoutNotice checkoutNotice, boolean z, HtJ<? super C141331> htJ) {
            super(2, htJ);
            this.$cachedCatalog = subscriptionCatalog;
            this.$shownPrices = bo6;
            this.this$0 = auraSubscriptionPaywallViewModel;
            this.$carriedNotice = checkoutNotice;
            this.$isCvm = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C141331(this.$cachedCatalog, this.$shownPrices, this.this$0, this.$carriedNotice, this.$isCvm, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.C141331.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C141331) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$refreshPlayStorePrices$1", f = "AuraSubscriptionPaywallViewModel.kt", l = {252}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$refreshPlayStorePrices$1, reason: invalid class name and case insensitive filesystem */
    public final class C141341 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ UiState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141341(UiState uiState, HtJ<? super C141341> htJ) {
            super(2, htJ);
            this.$state = uiState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraSubscriptionPaywallViewModel.this.new C141341(this.$state, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionPaywallViewModel auraSubscriptionPaywallViewModel = AuraSubscriptionPaywallViewModel.this;
                AHD<SubscriptionProduct> ahd = ((UiState.Loaded) this.$state).products;
                this.label = 1;
                if (auraSubscriptionPaywallViewModel.applyPlayStorePrices(ahd, this) == enumC10460Hji) {
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
            return ((C141341) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void load() {
        UiState.Loaded loaded;
        CheckoutNotice checkoutNotice = this.pendingCheckoutNotice;
        BO6<String, HatchTierPrice> bo6 = null;
        this.pendingCheckoutNotice = null;
        boolean zCatalogIsCvm = catalogIsCvm();
        SubscriptionCatalog subscriptionCatalog = this.catalogsByIsCvm.get(Boolean.valueOf(zCatalogIsCvm));
        UiState value = this._uiState.getValue();
        if ((value instanceof UiState.Loaded) && (loaded = (UiState.Loaded) value) != null) {
            bo6 = loaded.prices;
        }
        if (subscriptionCatalog == null) {
            this._uiState.Af8(UiState.Loading.INSTANCE);
        }
        launchLoad(new C141331(subscriptionCatalog, bo6, this, checkoutNotice, zCatalogIsCvm, null));
    }

    public final void dropHeldCheckoutNotice() {
        this.pendingCheckoutNotice = null;
    }

    public final void onPurchaseResult(PurchaseOutcome purchaseOutcome) {
        String str;
        String str2;
        C7384Etj.A0Y(purchaseOutcome, 0);
        PendingPurchase pendingPurchase = this.pendingPurchase;
        CheckoutNotice checkoutNotice = null;
        this.pendingPurchase = null;
        int iOrdinal = purchaseOutcome.ordinal();
        if (iOrdinal == 0) {
            AuraSubscriptionRepository auraSubscriptionRepository = this.repository;
            if (pendingPurchase != null) {
                str = pendingPurchase.tierId;
                str2 = pendingPurchase.name;
            } else {
                str = null;
                str2 = null;
            }
            auraSubscriptionRepository.notifyPurchaseCompleted(str, str2);
        } else if (iOrdinal == 2) {
            this.repository.refresh();
        } else if (iOrdinal == 1) {
            checkoutNotice = CheckoutNotice.CANCELED;
        } else {
            if (iOrdinal != 3) {
                throw C3cG.A0q();
            }
            checkoutNotice = CheckoutNotice.FAILED;
        }
        this.pendingCheckoutNotice = checkoutNotice;
        UiState value = this._uiState.getValue();
        if (value instanceof UiState.Loaded) {
            this._uiState.Af8(UiState.Loaded.copy$default((UiState.Loaded) value, null, null, null, null, false, checkoutNotice, false, false, false, null, null, null, false, null, null, null, null, null, null, null, 1048527, null));
            if (purchaseOutcome == PurchaseOutcome.CANCELED || purchaseOutcome == PurchaseOutcome.FAILED) {
                refreshPlayStorePrices();
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseOutcome.values().length];
            try {
                AnonymousClass002.A13(PurchaseOutcome.SUCCESS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PurchaseOutcome.PENDING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PurchaseOutcome.CANCELED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PurchaseOutcome.FAILED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyPlayStorePrices(X.AHD<com.facebook.aura.subscription.repo.SubscriptionProduct> r29, X.HtJ<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.applyPlayStorePrices(X.AHD, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cachedOrFetchedDetails(HtJ<? super SubscriptionDetailsState> htJ) {
        SubscriptionDetailsState value = this.repository.subscriptionDetailsState.getValue();
        return (!(value instanceof SubscriptionDetailsState.Success) || value == null) ? this.repository.fetchSubscriptionDetailsState(htJ) : value;
    }

    private final boolean catalogIsCvm() {
        return this.isConfidentialVmSetup ? this.usesConfidentialVmCatalog : this.repository.isOnConfidentialVm();
    }

    private final void launchLoad(G0V<? super C3UX, ? super HtJ<? super Unit>, ? extends Object> g0v) {
        AnonymousClass002.A1K(this.loadJob);
        BLL bllA00 = AEu.A00(this);
        this.loadJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), g0v, bllA00);
    }

    private final CheckoutAddOnOffer resolveCheckoutAddOn(List<SubscriptionCheckoutAddOn> list, boolean z) {
        SubscriptionCheckoutAddOn next;
        SubscriptionAddOn subscriptionAddOn = SubscriptionAddOn.INSTANCE;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<SubscriptionCheckoutAddOn> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().type);
        }
        SubscriptionAddOnIntegration subscriptionAddOnIntegrationResolveCheckoutIntegration = subscriptionAddOn.resolveCheckoutIntegration(arrayListA0i, z);
        if (subscriptionAddOnIntegrationResolveCheckoutIntegration == null) {
            return null;
        }
        Iterator<SubscriptionCheckoutAddOn> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (C7384Etj.areEqual(next.type, subscriptionAddOnIntegrationResolveCheckoutIntegration.getCatalogType())) {
                break;
            }
        }
        SubscriptionCheckoutAddOn subscriptionCheckoutAddOn = next;
        if (subscriptionCheckoutAddOn != null) {
            return new CheckoutAddOnOffer(subscriptionAddOnIntegrationResolveCheckoutIntegration, subscriptionCheckoutAddOn.label, subscriptionCheckoutAddOn.subtitle);
        }
        return null;
    }

    private final String resolveComplimentaryClaimProductId(List<SubscriptionProduct> list, SubscriptionDetails subscriptionDetails, Disclaimer disclaimer) {
        SubscriptionProduct next;
        if (this.offersComplimentaryClaim && this.usesConfidentialVmCatalog && AnonymousClass003.A1Y(this.isComplimentaryClaimEligible)) {
            Iterator<SubscriptionProduct> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i = next.rank;
                    do {
                        SubscriptionProduct next2 = it.next();
                        int i2 = next2.rank;
                        if (i < i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            SubscriptionProduct subscriptionProduct = next;
            if (subscriptionProduct != null && (this.entryPoint == SubscriptionPaywallEntryPoint.ACTIVATION || (!subscriptionDetails.isPaidTier && (subscriptionProduct.purchaseDisclaimer != null || disclaimer != null)))) {
                return subscriptionProduct.productId;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState resolveLoadedState(com.facebook.aura.subscription.repo.SubscriptionCatalog r35, com.facebook.aura.subscription.repo.SubscriptionDetailsState r36, com.facebook.aura.subscription.model.CheckoutNotice r37) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.resolveLoadedState(com.facebook.aura.subscription.repo.SubscriptionCatalog, com.facebook.aura.subscription.repo.SubscriptionDetailsState, com.facebook.aura.subscription.model.CheckoutNotice):com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState");
    }

    public final void claimComplimentary() {
        this.redemptionController.activate(AuraSubscriptionPaywallViewModelKt.CLAIM_PRESENTATION_ID, AuraSubscriptionPaywallViewModelKt.CLAIM_COMPLIMENTARY_ACTION, ComplimentaryRedeemEntryPoint.SUBSCRIPTION_PAYWALL, this.entryPoint.getValue());
    }

    public final void dismissComplimentaryClaimFailure() {
        this.redemptionController.dismissFailure(AuraSubscriptionPaywallViewModelKt.CLAIM_PRESENTATION_ID);
    }

    public final C20Q<ComplimentarySubscriptionRedemptionState> getComplimentaryClaimState() {
        return this.complimentaryClaimState;
    }

    public final boolean getDefaultsToConfidentialVm() {
        return this.defaultsToConfidentialVm;
    }

    public final C1BN<PlanPickerGateState> getPlanPickerGate() {
        return this.planPickerGate;
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.PayNowResult onPayNowClicked(java.lang.String r28) {
        /*
            r27 = this;
            r5 = r27
            X.BLG<com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState> r0 = r5._uiState
            java.lang.Object r6 = r0.getValue()
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState r6 = (com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState) r6
            r2 = r28
            if (r28 == 0) goto L66
            boolean r0 = r6 instanceof com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState.Loaded
            if (r0 == 0) goto L66
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState$Loaded r6 = (com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState.Loaded) r6
            boolean r0 = r6.isPurchasing
            if (r0 != 0) goto L66
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository r0 = r5.repository
            boolean r0 = r0.getCanStartPurchase()
            if (r0 != 0) goto L25
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PayNowResult$Settling r1 = com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.PayNowResult.Settling.INSTANCE
        L22:
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PayNowResult r1 = (com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.PayNowResult) r1
            return r1
        L25:
            X.AHD<com.facebook.aura.subscription.repo.SubscriptionProduct> r0 = r6.products
            java.util.Iterator r1 = r0.iterator()
        L2b:
            boolean r0 = r1.hasNext()
            r4 = 0
            if (r0 == 0) goto L64
            java.lang.Object r3 = r1.next()
            r0 = r3
            com.facebook.aura.subscription.repo.SubscriptionProduct r0 = (com.facebook.aura.subscription.repo.SubscriptionProduct) r0
            java.lang.String r0 = r0.productId
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2b
        L41:
            com.facebook.aura.subscription.repo.SubscriptionProduct r3 = (com.facebook.aura.subscription.repo.SubscriptionProduct) r3
            if (r3 == 0) goto L66
            X.BO6<java.lang.String, com.facebook.aura.iap.HatchTierPrice> r0 = r6.prices
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L66
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository r0 = r5.repository
            boolean r0 = r0.isNameSatisfied
            if (r0 != 0) goto L69
            com.facebook.aura.subscription.repo.SubscriptionNameDialog r2 = r6.nameCollection
            if (r2 == 0) goto L69
            com.facebook.aura.subscription.repo.Disclaimer r1 = r6.purchaseDisclaimer
            com.facebook.aura.subscription.repo.Disclaimer r0 = r3.purchaseDisclaimer
            if (r0 != 0) goto L5e
            r0 = r1
        L5e:
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PayNowResult$NeedsName r1 = new com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PayNowResult$NeedsName
            r1.<init>(r2, r0)
            return r1
        L64:
            r3 = r4
            goto L41
        L66:
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PayNowResult$Ignored r1 = com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.PayNowResult.Ignored.INSTANCE
            goto L22
        L69:
            java.lang.String r2 = r3.productId
            java.lang.String r1 = r3.tierName
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PendingPurchase r0 = new com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PendingPurchase
            r0.<init>(r2, r1)
            r5.pendingPurchase = r0
            r5.pendingCheckoutNotice = r4
            X.BLG<com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState> r1 = r5._uiState
            r27 = 1048527(0xfffcf, float:1.469299E-39)
            r7 = 0
            r11 = 1
            r13 = 0
            r8 = r7
            r9 = r7
            r10 = r7
            r12 = r7
            r14 = r13
            r15 = r13
            r16 = r7
            r17 = r7
            r18 = r7
            r19 = r13
            r20 = r7
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r28 = r7
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState$Loaded r0 = com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState.Loaded.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.Af8(r0)
            java.lang.String r0 = r3.productId
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PayNowResult$Launch r1 = new com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PayNowResult$Launch
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.onPayNowClicked(java.lang.String):com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$PayNowResult");
    }

    public final void refresh() {
        this.catalogsByIsCvm.clear();
        load();
    }

    public final void refreshPlayStorePrices() {
        UiState value = this._uiState.getValue();
        if (!(value instanceof UiState.Loaded) || ((UiState.Loaded) value).isPurchasing) {
            return;
        }
        launchLoad(new C141341(value, null));
    }

    public final void showConfidentialVmCatalog(boolean z) {
        this.usesConfidentialVmCatalog = z;
        load();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AuraSubscriptionPaywallViewModel(com.facebook.aura.subscription.repo.AuraSubscriptionRepository r8, android.content.Context r9, com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint r10, com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController r11, kotlin.jvm.functions.Function0<java.lang.Boolean> r12, boolean r13) {
        /*
            r7 = this;
            X.AnonymousClass005.A17(r8, r9, r10, r11, r12)
            r7.<init>()
            r7.repository = r8
            r7.appContext = r9
            r7.entryPoint = r10
            r7.redemptionController = r11
            r7.isComplimentaryClaimEligible = r12
            r7.offersComplimentaryClaim = r13
            com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint r3 = com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint.CONFIDENTIAL_VM
            r2 = 0
            if (r10 == r3) goto L1c
            com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint r1 = com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint.ACTIVATION
            r0 = 0
            if (r10 != r1) goto L1d
        L1c:
            r0 = 1
        L1d:
            r7.isConfidentialVmSetup = r0
            if (r10 == r3) goto L29
            if (r13 == 0) goto L2a
            boolean r0 = X.AnonymousClass003.A1Y(r12)
            if (r0 == 0) goto L2a
        L29:
            r2 = 1
        L2a:
            r7.defaultsToConfidentialVm = r2
            r7.usesConfidentialVmCatalog = r2
            java.util.concurrent.ConcurrentHashMap r0 = X.C60O.A1C()
            r7.catalogsByIsCvm = r0
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$UiState$Loading r0 = com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.UiState.Loading.INSTANCE
            X.GCn r0 = X.HnJ.A01(r0)
            r7._uiState = r0
            r4 = 0
            X.3Pi r0 = X.C3cG.A11(r0)
            r7.uiState = r0
            java.lang.String r6 = "activation_complimentary_claim"
            X.20Q r3 = r11.stateFor(r6)
            r7.complimentaryClaimState = r3
            X.1BN<com.facebook.aura.subscription.repo.SubscriptionDetailsState> r2 = r8.subscriptionDetailsState
            r1 = 0
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$planPickerGate$1 r0 = new com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$planPickerGate$1
            r0.<init>(r4)
            X.60I r3 = X.C3rb.A03(r0, r2, r3)
            com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$planPickerGate$2 r2 = new com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel$planPickerGate$2
            r2.<init>(r7, r4)
            r0 = 1
            X.I0u r5 = new X.I0u
            r5.<init>(r2, r3, r0)
            X.BLL r4 = X.AEu.A00(r7)
            X.3Ej r3 = X.C3Ek.A01
            X.1BN<com.facebook.aura.subscription.repo.SubscriptionDetailsState> r0 = r8.subscriptionDetailsState
            java.lang.Object r2 = r0.getValue()
            boolean r0 = r2 instanceof com.facebook.aura.subscription.repo.SubscriptionDetailsState.Success
            if (r0 == 0) goto L78
            com.facebook.aura.subscription.repo.SubscriptionDetailsState$Success r2 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState.Success) r2
            if (r2 == 0) goto L78
            com.facebook.aura.subscription.repo.SubscriptionDetails r1 = r2.details
        L78:
            com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionState r0 = r11.currentState(r6)
            com.facebook.aura.subscription.model.PlanPickerGateState r0 = com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModelKt.planPickerGateState(r1, r0)
            X.3Pi r0 = X.AnonymousClass441.A00(r0, r4, r5, r3)
            r7.planPickerGate = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel.<init>(com.facebook.aura.subscription.repo.AuraSubscriptionRepository, android.content.Context, com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint, com.facebook.aura.subscription.model.ComplimentarySubscriptionRedemptionController, kotlin.jvm.functions.Function0, boolean):void");
    }
}
