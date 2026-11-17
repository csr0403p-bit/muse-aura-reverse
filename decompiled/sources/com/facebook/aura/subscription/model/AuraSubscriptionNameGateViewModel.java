package com.facebook.aura.subscription.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.subscription.repo.SaveViewerNameResult;
import com.facebook.aura.subscription.repo.SubscriptionNameDialog;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class AuraSubscriptionNameGateViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<HeldPurchase> _heldPurchase;
    public final C1BN<HeldPurchase> heldPurchase;
    public final AuraSubscriptionRepository repository;

    public final class Factory extends AuraViewModelFactory<AuraSubscriptionNameGateViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraSubscriptionNameGateViewModel create() {
            return new AuraSubscriptionNameGateViewModel(AuraSubscriptionRepository.Companion.getInstance(this.userSession));
        }
    }

    public interface HeldCheckout {

        public final class Tier extends C06G implements HeldCheckout {
            public static final int $stable = 8;
            public final SubscriptionAttribution attribution;
            public final SubscriptionAddOnIntegration checkoutAddOn;
            public final PaywallCta cta;
            public final PurchaseTap tap;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Tier) {
                        Tier tier = (Tier) obj;
                        if (!C7384Etj.areEqual(this.tap, tier.tap) || this.cta != tier.cta || !C7384Etj.areEqual(this.attribution, tier.attribution) || !C7384Etj.areEqual(this.checkoutAddOn, tier.checkoutAddOn)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Tier copy$default(Tier tier, PurchaseTap purchaseTap, PaywallCta paywallCta, SubscriptionAttribution subscriptionAttribution, SubscriptionAddOnIntegration subscriptionAddOnIntegration, int i, Object obj) {
                if ((i & 1) != 0) {
                    purchaseTap = tier.tap;
                }
                if ((i & 2) != 0) {
                    paywallCta = tier.cta;
                }
                if ((i & 4) != 0) {
                    subscriptionAttribution = tier.attribution;
                }
                if ((i & 8) != 0) {
                    subscriptionAddOnIntegration = tier.checkoutAddOn;
                }
                AnonymousClass005.A0x(purchaseTap, paywallCta, subscriptionAttribution);
                return new Tier(purchaseTap, paywallCta, subscriptionAttribution, subscriptionAddOnIntegration);
            }

            public final PurchaseTap component1() {
                return this.tap;
            }

            public final PaywallCta component2() {
                return this.cta;
            }

            public final SubscriptionAttribution component3() {
                return this.attribution;
            }

            public final SubscriptionAddOnIntegration component4() {
                return this.checkoutAddOn;
            }

            @Override // com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel.HeldCheckout
            public SubscriptionAttribution getAttribution() {
                return this.attribution;
            }

            public final SubscriptionAddOnIntegration getCheckoutAddOn() {
                return this.checkoutAddOn;
            }

            public final PaywallCta getCta() {
                return this.cta;
            }

            @Override // com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel.HeldCheckout
            public Map<String, String> getPayMetadata() {
                return this.tap.payMetadata;
            }

            public final PurchaseTap getTap() {
                return this.tap;
            }

            public int hashCode() {
                return AnonymousClass005.A0F(this.attribution, AnonymousClass005.A0F(this.cta, AnonymousClass005.A0E(this.tap))) + AnonymousClass006.A0D(this.checkoutAddOn);
            }

            @Override // com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel.HeldCheckout
            public boolean isSubscriptionPlanPurchase() {
                return true;
            }

            public Tier(PurchaseTap purchaseTap, PaywallCta paywallCta, SubscriptionAttribution subscriptionAttribution, SubscriptionAddOnIntegration subscriptionAddOnIntegration) {
                AnonymousClass005.A0x(purchaseTap, paywallCta, subscriptionAttribution);
                this.tap = purchaseTap;
                this.cta = paywallCta;
                this.attribution = subscriptionAttribution;
                this.checkoutAddOn = subscriptionAddOnIntegration;
            }

            public final Tier copy(PurchaseTap purchaseTap, PaywallCta paywallCta, SubscriptionAttribution subscriptionAttribution, SubscriptionAddOnIntegration subscriptionAddOnIntegration) {
                AnonymousClass005.A0x(purchaseTap, paywallCta, subscriptionAttribution);
                return new Tier(purchaseTap, paywallCta, subscriptionAttribution, subscriptionAddOnIntegration);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ Tier(PurchaseTap purchaseTap, PaywallCta paywallCta, SubscriptionAttribution subscriptionAttribution, SubscriptionAddOnIntegration subscriptionAddOnIntegration, int i, C06H c06h) {
                this(purchaseTap, paywallCta, subscriptionAttribution, (i & 8) != 0 ? null : subscriptionAddOnIntegration);
            }
        }

        public final class TopUp extends C06G implements HeldCheckout {
            public static final int $stable = 8;
            public final SubscriptionAttribution attribution;
            public final String dcpProductId;
            public final String externalProductId;
            public final Map<String, String> payMetadata;
            public final String productType;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof TopUp) {
                        TopUp topUp = (TopUp) obj;
                        if (!C7384Etj.areEqual(this.externalProductId, topUp.externalProductId) || !C7384Etj.areEqual(this.dcpProductId, topUp.dcpProductId) || !C7384Etj.areEqual(this.productType, topUp.productType) || !C7384Etj.areEqual(this.payMetadata, topUp.payMetadata) || !C7384Etj.areEqual(this.attribution, topUp.attribution)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TopUp copy$default(TopUp topUp, String str, String str2, String str3, Map map, SubscriptionAttribution subscriptionAttribution, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = topUp.externalProductId;
                }
                if ((i & 2) != 0) {
                    str2 = topUp.dcpProductId;
                }
                if ((i & 4) != 0) {
                    str3 = topUp.productType;
                }
                if ((i & 8) != 0) {
                    map = topUp.payMetadata;
                }
                if ((i & 16) != 0) {
                    subscriptionAttribution = topUp.attribution;
                }
                return topUp.copy(str, str2, str3, map, subscriptionAttribution);
            }

            public final String component1() {
                return this.externalProductId;
            }

            public final String component2() {
                return this.dcpProductId;
            }

            public final String component3() {
                return this.productType;
            }

            public final Map<String, String> component4() {
                return this.payMetadata;
            }

            public final SubscriptionAttribution component5() {
                return this.attribution;
            }

            @Override // com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel.HeldCheckout
            public SubscriptionAttribution getAttribution() {
                return this.attribution;
            }

            public final String getDcpProductId() {
                return this.dcpProductId;
            }

            public final String getExternalProductId() {
                return this.externalProductId;
            }

            @Override // com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel.HeldCheckout
            public Map<String, String> getPayMetadata() {
                return this.payMetadata;
            }

            public final String getProductType() {
                return this.productType;
            }

            public int hashCode() {
                return AnonymousClass005.A0G(this.attribution, AnonymousClass005.A0F(this.payMetadata, (AnonymousClass005.A0I(this.dcpProductId, AnonymousClass001.A0G(this.externalProductId)) + AnonymousClass006.A0G(this.productType)) * 31));
            }

            @Override // com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel.HeldCheckout
            public boolean isSubscriptionPlanPurchase() {
                return false;
            }

            public TopUp(String str, String str2, String str3, Map<String, String> map, SubscriptionAttribution subscriptionAttribution) {
                AnonymousClass005.A0y(str, str2, map);
                C7384Etj.A0Y(subscriptionAttribution, 4);
                this.externalProductId = str;
                this.dcpProductId = str2;
                this.productType = str3;
                this.payMetadata = map;
                this.attribution = subscriptionAttribution;
            }

            public final TopUp copy(String str, String str2, String str3, Map<String, String> map, SubscriptionAttribution subscriptionAttribution) {
                AnonymousClass005.A0y(str, str2, map);
                C7384Etj.A0Y(subscriptionAttribution, 4);
                return new TopUp(str, str2, str3, map, subscriptionAttribution);
            }

            public String toString() {
                return super.toString();
            }
        }

        SubscriptionAttribution getAttribution();

        Map<String, String> getPayMetadata();

        boolean isSubscriptionPlanPurchase();
    }

    public final class HeldPurchase extends C06G {
        public static final int $stable = 8;
        public final HeldCheckout checkout;
        public final SubscriptionNameDialog dialog;
        public final Disclaimer disclaimer;
        public final boolean launched;
        public final NameSubmission submission;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HeldPurchase) {
                    HeldPurchase heldPurchase = (HeldPurchase) obj;
                    if (!C7384Etj.areEqual(this.checkout, heldPurchase.checkout) || !C7384Etj.areEqual(this.dialog, heldPurchase.dialog) || !C7384Etj.areEqual(this.disclaimer, heldPurchase.disclaimer) || !C7384Etj.areEqual(this.submission, heldPurchase.submission) || this.launched != heldPurchase.launched) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ HeldPurchase(HeldCheckout heldCheckout, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer, NameSubmission nameSubmission, boolean z, int i, C06H c06h) {
            this(heldCheckout, subscriptionNameDialog, disclaimer, (i & 8) != 0 ? NameSubmission.Idle.INSTANCE : nameSubmission, C3cI.A1S(i, z));
        }

        public static /* synthetic */ HeldPurchase copy$default(HeldPurchase heldPurchase, HeldCheckout heldCheckout, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer, NameSubmission nameSubmission, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                heldCheckout = heldPurchase.checkout;
            }
            if ((i & 2) != 0) {
                subscriptionNameDialog = heldPurchase.dialog;
            }
            if ((i & 4) != 0) {
                disclaimer = heldPurchase.disclaimer;
            }
            if ((i & 8) != 0) {
                nameSubmission = heldPurchase.submission;
            }
            if ((i & 16) != 0) {
                z = heldPurchase.launched;
            }
            return heldPurchase.copy(heldCheckout, subscriptionNameDialog, disclaimer, nameSubmission, z);
        }

        public final HeldCheckout component1() {
            return this.checkout;
        }

        public final SubscriptionNameDialog component2() {
            return this.dialog;
        }

        public final Disclaimer component3() {
            return this.disclaimer;
        }

        public final NameSubmission component4() {
            return this.submission;
        }

        public final boolean component5() {
            return this.launched;
        }

        public final HeldCheckout getCheckout() {
            return this.checkout;
        }

        public final SubscriptionNameDialog getDialog() {
            return this.dialog;
        }

        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        public final boolean getLaunched() {
            return this.launched;
        }

        public final NameSubmission getSubmission() {
            return this.submission;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.submission, (AnonymousClass005.A0F(this.dialog, AnonymousClass005.A0E(this.checkout)) + AnonymousClass006.A0D(this.disclaimer)) * 31), this.launched);
        }

        public final HeldPurchase copy(HeldCheckout heldCheckout, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer, NameSubmission nameSubmission, boolean z) {
            AnonymousClass005.A0y(heldCheckout, subscriptionNameDialog, nameSubmission);
            return new HeldPurchase(heldCheckout, subscriptionNameDialog, disclaimer, nameSubmission, z);
        }

        public String toString() {
            return super.toString();
        }

        public HeldPurchase(HeldCheckout heldCheckout, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer, NameSubmission nameSubmission, boolean z) {
            AnonymousClass005.A0y(heldCheckout, subscriptionNameDialog, nameSubmission);
            this.checkout = heldCheckout;
            this.dialog = subscriptionNameDialog;
            this.disclaimer = disclaimer;
            this.submission = nameSubmission;
            this.launched = z;
        }
    }

    public final class NameExit extends C06G {
        public static final int $stable = 8;
        public final String failureReason;
        public final Map<String, String> payMetadata;
        public final String result;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof NameExit) {
                    NameExit nameExit = (NameExit) obj;
                    if (!C7384Etj.areEqual(this.payMetadata, nameExit.payMetadata) || !C7384Etj.areEqual(this.result, nameExit.result) || !C7384Etj.areEqual(this.failureReason, nameExit.failureReason)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NameExit copy$default(NameExit nameExit, Map map, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                map = nameExit.payMetadata;
            }
            if ((i & 2) != 0) {
                str = nameExit.result;
            }
            if ((i & 4) != 0) {
                str2 = nameExit.failureReason;
            }
            return nameExit.copy(map, str, str2);
        }

        public final Map<String, String> component1() {
            return this.payMetadata;
        }

        public final String component2() {
            return this.result;
        }

        public final String component3() {
            return this.failureReason;
        }

        public final String getFailureReason() {
            return this.failureReason;
        }

        public final Map<String, String> getPayMetadata() {
            return this.payMetadata;
        }

        public final String getResult() {
            return this.result;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.result, AnonymousClass005.A0E(this.payMetadata)) + AnonymousClass006.A0G(this.failureReason);
        }

        public NameExit(Map<String, String> map, String str, String str2) {
            AnonymousClass003.A0u(map, str);
            this.payMetadata = map;
            this.result = str;
            this.failureReason = str2;
        }

        public final NameExit copy(Map<String, String> map, String str, String str2) {
            AnonymousClass003.A0u(map, str);
            return new NameExit(map, str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public interface NameSubmission {

        public final class Failed extends C06G implements NameSubmission {
            public static final int $stable = 0;
            public final String detail;
            public final String reason;

            public Failed(String str, String str2) {
                C7384Etj.A0Y(str2, 1);
                this.detail = str;
                this.reason = str2;
            }

            public final Failed copy(String str, String str2) {
                C7384Etj.A0Y(str2, 1);
                return new Failed(str, str2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Failed) {
                        Failed failed = (Failed) obj;
                        if (!C7384Etj.areEqual(this.detail, failed.detail) || !C7384Etj.areEqual(this.reason, failed.reason)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.detail;
                }
                if ((i & 2) != 0) {
                    str2 = failed.reason;
                }
                C7384Etj.A0Y(str2, 1);
                return new Failed(str, str2);
            }

            public final String component1() {
                return this.detail;
            }

            public final String component2() {
                return this.reason;
            }

            public final String getDetail() {
                return this.detail;
            }

            public final String getReason() {
                return this.reason;
            }

            public int hashCode() {
                return AnonymousClass001.A0H(this.reason, AnonymousClass006.A0G(this.detail) * 31);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Idle implements NameSubmission {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public String toString() {
                return "Idle";
            }

            public int hashCode() {
                return 1520640197;
            }
        }

        public final class Invalid extends C06G implements NameSubmission {
            public static final int $stable = 0;
            public final String detail;

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Invalid) && C7384Etj.areEqual(this.detail, ((Invalid) obj).detail));
            }

            public static /* synthetic */ Invalid copy$default(Invalid invalid, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = invalid.detail;
                }
                return new Invalid(str);
            }

            public final String component1() {
                return this.detail;
            }

            public final Invalid copy(String str) {
                return new Invalid(str);
            }

            public final String getDetail() {
                return this.detail;
            }

            public int hashCode() {
                return AnonymousClass006.A0G(this.detail);
            }

            public Invalid(String str) {
                this.detail = str;
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Saved implements NameSubmission {
            public static final int $stable = 0;
            public static final Saved INSTANCE = new Saved();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Saved);
            }

            public String toString() {
                return "Saved";
            }

            public int hashCode() {
                return -95638602;
            }
        }

        public final class Submitting implements NameSubmission {
            public static final int $stable = 0;
            public static final Submitting INSTANCE = new Submitting();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Submitting);
            }

            public String toString() {
                return AnonymousClass000.A00(25);
            }

            public int hashCode() {
                return -963875017;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel$onNameConfirmed$1", f = "AuraSubscriptionNameGateViewModel.kt", l = {134}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel$onNameConfirmed$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $firstName;
        public final /* synthetic */ String $lastName;
        public final /* synthetic */ HeldPurchase $submitting;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, HeldPurchase heldPurchase, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$firstName = str;
            this.$lastName = str2;
            this.$submitting = heldPurchase;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraSubscriptionNameGateViewModel.this.new AnonymousClass1(this.$firstName, this.$lastName, this.$submitting, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            NameSubmission failed;
            HeldPurchase value;
            HeldPurchase heldPurchaseCopy;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = AuraSubscriptionNameGateViewModel.this.repository;
                String str = this.$firstName;
                String str2 = this.$lastName;
                this.label = 1;
                obj = auraSubscriptionRepository.saveViewerName(str, str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SaveViewerNameResult saveViewerNameResult = (SaveViewerNameResult) obj;
            if (C7384Etj.areEqual(saveViewerNameResult, SaveViewerNameResult.Success.INSTANCE)) {
                AuraSubscriptionNameGateViewModel.this.repository.isNameSatisfied = true;
                failed = NameSubmission.Saved.INSTANCE;
            } else if (saveViewerNameResult instanceof SaveViewerNameResult.InvalidName) {
                failed = new NameSubmission.Invalid(((SaveViewerNameResult.InvalidName) saveViewerNameResult).detail);
            } else {
                if (!(saveViewerNameResult instanceof SaveViewerNameResult.Failed)) {
                    throw C3cG.A0q();
                }
                SaveViewerNameResult.Failed failed2 = (SaveViewerNameResult.Failed) saveViewerNameResult;
                failed = new NameSubmission.Failed(failed2.detail, failed2.reason);
            }
            NameSubmission nameSubmission = failed;
            BLG<HeldPurchase> blg = AuraSubscriptionNameGateViewModel.this._heldPurchase;
            HeldPurchase heldPurchase = this.$submitting;
            do {
                value = blg.getValue();
                heldPurchaseCopy = value;
                if (heldPurchaseCopy == heldPurchase) {
                    heldPurchaseCopy = heldPurchaseCopy.copy(heldPurchaseCopy.checkout, heldPurchaseCopy.dialog, heldPurchaseCopy.disclaimer, nameSubmission, heldPurchaseCopy.launched);
                }
            } while (!blg.A6e(value, heldPurchaseCopy));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AuraSubscriptionNameGateViewModel(AuraSubscriptionRepository auraSubscriptionRepository) {
        C7384Etj.A0Y(auraSubscriptionRepository, 0);
        this.repository = auraSubscriptionRepository;
        C9286GCn c9286GCnA01 = HnJ.A01(null);
        this._heldPurchase = c9286GCnA01;
        this.heldPurchase = C3cG.A11(c9286GCnA01);
    }

    public final void holdForNameConfirmation(HeldCheckout heldCheckout, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer) {
        AnonymousClass002.A1I(this._heldPurchase, new HeldPurchase(heldCheckout, subscriptionNameDialog, disclaimer, NameSubmission.Idle.INSTANCE, AnonymousClass004.A1b(heldCheckout, subscriptionNameDialog)));
    }

    public final void onNameConfirmed(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        HeldPurchase value = this._heldPurchase.getValue();
        if (value == null || C7384Etj.areEqual(value.submission, NameSubmission.Submitting.INSTANCE) || C7384Etj.areEqual(value.submission, NameSubmission.Saved.INSTANCE)) {
            return;
        }
        HeldPurchase heldPurchaseCopy = value.copy(value.checkout, value.dialog, value.disclaimer, NameSubmission.Submitting.INSTANCE, value.launched);
        this._heldPurchase.Af8(heldPurchaseCopy);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(str, str2, heldPurchaseCopy, null), AEu.A00(this));
    }

    private final void setSubmission(NameSubmission nameSubmission) {
        HeldPurchase value;
        HeldPurchase heldPurchase;
        BLG<HeldPurchase> blg = this._heldPurchase;
        do {
            value = blg.getValue();
            heldPurchase = value;
        } while (!blg.A6e(value, heldPurchase != null ? heldPurchase.copy(heldPurchase.checkout, heldPurchase.dialog, heldPurchase.disclaimer, nameSubmission, heldPurchase.launched) : null));
    }

    public final HeldPurchase claimCheckoutLaunch() {
        HeldPurchase value;
        HeldPurchase heldPurchaseCopy;
        HeldPurchase value2 = this._heldPurchase.getValue();
        if (value2 == null || !C7384Etj.areEqual(value2.submission, NameSubmission.Saved.INSTANCE) || value2.launched) {
            return null;
        }
        BLG<HeldPurchase> blg = this._heldPurchase;
        do {
            value = blg.getValue();
            heldPurchaseCopy = value;
            if (heldPurchaseCopy == value2) {
                heldPurchaseCopy = heldPurchaseCopy.copy(heldPurchaseCopy.checkout, heldPurchaseCopy.dialog, heldPurchaseCopy.disclaimer, heldPurchaseCopy.submission, true);
            }
        } while (!blg.A6e(value, heldPurchaseCopy));
        return value2;
    }

    public final C1BN<HeldPurchase> getHeldPurchase() {
        return this.heldPurchase;
    }

    public final NameExit nameCollectionExit() {
        String str;
        String str2;
        HeldPurchase value = this._heldPurchase.getValue();
        String str3 = null;
        if (value == null) {
            return null;
        }
        this._heldPurchase.Af8(null);
        if (C7384Etj.areEqual(value.submission, NameSubmission.Saved.INSTANCE)) {
            return null;
        }
        NameSubmission nameSubmission = value.submission;
        NameSubmission.Failed failed = nameSubmission instanceof NameSubmission.Failed ? (NameSubmission.Failed) nameSubmission : null;
        Map<String, String> payMetadata = value.checkout.getPayMetadata();
        if (failed == null || (str2 = failed.reason) == null) {
            str = AuraSubscriptionNameGateViewModelKt.NAME_DISMISSED_RESULT;
            if (failed != null) {
            }
            return new NameExit(payMetadata, str, str3);
        }
        str = str2.equals(AuraSubscriptionNameGateViewModelKt.ACCOUNT_NOT_FOUND_ERROR_TYPE) ? AuraSubscriptionNameGateViewModelKt.NAME_ACCOUNT_NOT_FOUND_RESULT : AuraSubscriptionNameGateViewModelKt.NAME_UPDATE_FAILED_RESULT;
        str3 = failed.reason;
        return new NameExit(payMetadata, str, str3);
    }

    public final void onNameEdited() {
        HeldPurchase value = this._heldPurchase.getValue();
        NameSubmission nameSubmission = value != null ? value.submission : null;
        if ((nameSubmission instanceof NameSubmission.Invalid) || (nameSubmission instanceof NameSubmission.Failed)) {
            setSubmission(NameSubmission.Idle.INSTANCE);
        }
    }
}
