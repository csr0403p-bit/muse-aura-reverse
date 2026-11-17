package com.facebook.aura.status.viewmodel;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BLL;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C8j5;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.subscription.model.CheckoutNotice;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.subscription.repo.SubscriptionNameDialog;
import com.facebook.aura.subscription.repo.TopUpPack;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public HoC loadJob;
    public volatile List<TopUpPack> pricedPacks;
    public final AuraSubscriptionRepository repository;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<AuraBuyCreditsViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraBuyCreditsViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new AuraBuyCreditsViewModel(abstractC3358CGz, AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz));
        }
    }

    public interface PayNowResult {

        public final class Ignored implements PayNowResult {
            public static final Ignored INSTANCE = new Ignored();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Ignored);
            }

            public String toString() {
                return "Ignored";
            }

            public int hashCode() {
                return -1977964730;
            }
        }

        public final class Launch extends C06G implements PayNowResult {
            public final PurchaseAction action;

            public Launch(PurchaseAction purchaseAction) {
                C7384Etj.A0Y(purchaseAction, 0);
                this.action = purchaseAction;
            }

            public final Launch copy(PurchaseAction purchaseAction) {
                C7384Etj.A0Y(purchaseAction, 0);
                return new Launch(purchaseAction);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Launch) && C7384Etj.areEqual(this.action, ((Launch) obj).action));
            }

            public static /* synthetic */ Launch copy$default(Launch launch, PurchaseAction purchaseAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    purchaseAction = launch.action;
                }
                C7384Etj.A0Y(purchaseAction, 0);
                return new Launch(purchaseAction);
            }

            public final PurchaseAction component1() {
                return this.action;
            }

            public final PurchaseAction getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class NeedsName extends C06G implements PayNowResult {
            public final PurchaseAction action;
            public final SubscriptionNameDialog dialog;
            public final Disclaimer disclaimer;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof NeedsName) {
                        NeedsName needsName = (NeedsName) obj;
                        if (!C7384Etj.areEqual(this.action, needsName.action) || !C7384Etj.areEqual(this.dialog, needsName.dialog) || !C7384Etj.areEqual(this.disclaimer, needsName.disclaimer)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ NeedsName copy$default(NeedsName needsName, PurchaseAction purchaseAction, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer, int i, Object obj) {
                if ((i & 1) != 0) {
                    purchaseAction = needsName.action;
                }
                if ((i & 2) != 0) {
                    subscriptionNameDialog = needsName.dialog;
                }
                if ((i & 4) != 0) {
                    disclaimer = needsName.disclaimer;
                }
                return needsName.copy(purchaseAction, subscriptionNameDialog, disclaimer);
            }

            public final PurchaseAction component1() {
                return this.action;
            }

            public final SubscriptionNameDialog component2() {
                return this.dialog;
            }

            public final Disclaimer component3() {
                return this.disclaimer;
            }

            public final PurchaseAction getAction() {
                return this.action;
            }

            public final SubscriptionNameDialog getDialog() {
                return this.dialog;
            }

            public final Disclaimer getDisclaimer() {
                return this.disclaimer;
            }

            public int hashCode() {
                return AnonymousClass005.A0F(this.dialog, AnonymousClass005.A0E(this.action)) + AnonymousClass006.A0D(this.disclaimer);
            }

            public NeedsName(PurchaseAction purchaseAction, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer) {
                AnonymousClass003.A0u(purchaseAction, subscriptionNameDialog);
                this.action = purchaseAction;
                this.dialog = subscriptionNameDialog;
                this.disclaimer = disclaimer;
            }

            public final NeedsName copy(PurchaseAction purchaseAction, SubscriptionNameDialog subscriptionNameDialog, Disclaimer disclaimer) {
                AnonymousClass003.A0u(purchaseAction, subscriptionNameDialog);
                return new NeedsName(purchaseAction, subscriptionNameDialog, disclaimer);
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public final class PurchaseAction extends C06G {
        public final String dcpProductId;
        public final String externalProductId;
        public final String productType;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PurchaseAction) {
                    PurchaseAction purchaseAction = (PurchaseAction) obj;
                    if (!C7384Etj.areEqual(this.externalProductId, purchaseAction.externalProductId) || !C7384Etj.areEqual(this.dcpProductId, purchaseAction.dcpProductId) || !C7384Etj.areEqual(this.productType, purchaseAction.productType)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PurchaseAction copy$default(PurchaseAction purchaseAction, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = purchaseAction.externalProductId;
            }
            if ((i & 2) != 0) {
                str2 = purchaseAction.dcpProductId;
            }
            if ((i & 4) != 0) {
                str3 = purchaseAction.productType;
            }
            return purchaseAction.copy(str, str2, str3);
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

        public final String getDcpProductId() {
            return this.dcpProductId;
        }

        public final String getExternalProductId() {
            return this.externalProductId;
        }

        public final String getProductType() {
            return this.productType;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.dcpProductId, AnonymousClass001.A0G(this.externalProductId)) + AnonymousClass006.A0G(this.productType);
        }

        public PurchaseAction(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.externalProductId = str;
            this.dcpProductId = str2;
            this.productType = str3;
        }

        public final PurchaseAction copy(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new PurchaseAction(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ PurchaseAction(String str, String str2, String str3, int i, C06H c06h) {
            this(str, str2, AnonymousClass006.A0t(i, str3));
        }
    }

    public final class UiState extends C06G {
        public final CheckoutNotice checkoutNotice;
        public final String ctaLabel;
        public final Disclaimer disclaimer;
        public final BuyCreditsError error;
        public final boolean isLoading;
        public final boolean isPurchasing;
        public final SubscriptionNameDialog nameCollection;
        public final AHD<CreditProduct> products;

        public UiState(boolean z, AHD<CreditProduct> ahd, BuyCreditsError buyCreditsError, boolean z2, CheckoutNotice checkoutNotice, Disclaimer disclaimer, SubscriptionNameDialog subscriptionNameDialog, String str) {
            C7384Etj.A0Y(ahd, 1);
            this.isLoading = z;
            this.products = ahd;
            this.error = buyCreditsError;
            this.isPurchasing = z2;
            this.checkoutNotice = checkoutNotice;
            this.disclaimer = disclaimer;
            this.nameCollection = subscriptionNameDialog;
            this.ctaLabel = str;
        }

        public final UiState copy(boolean z, AHD<CreditProduct> ahd, BuyCreditsError buyCreditsError, boolean z2, CheckoutNotice checkoutNotice, Disclaimer disclaimer, SubscriptionNameDialog subscriptionNameDialog, String str) {
            C7384Etj.A0Y(ahd, 1);
            return new UiState(z, ahd, buyCreditsError, z2, checkoutNotice, disclaimer, subscriptionNameDialog, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.isLoading != uiState.isLoading || !C7384Etj.areEqual(this.products, uiState.products) || this.error != uiState.error || this.isPurchasing != uiState.isPurchasing || this.checkoutNotice != uiState.checkoutNotice || !C7384Etj.areEqual(this.disclaimer, uiState.disclaimer) || !C7384Etj.areEqual(this.nameCollection, uiState.nameCollection) || !C7384Etj.areEqual(this.ctaLabel, uiState.ctaLabel)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z, AHD ahd, BuyCreditsError buyCreditsError, boolean z2, CheckoutNotice checkoutNotice, Disclaimer disclaimer, SubscriptionNameDialog subscriptionNameDialog, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 2) != 0) {
                ahd = uiState.products;
            }
            if ((i & 4) != 0) {
                buyCreditsError = uiState.error;
            }
            if ((i & 8) != 0) {
                z2 = uiState.isPurchasing;
            }
            if ((i & 16) != 0) {
                checkoutNotice = uiState.checkoutNotice;
            }
            if ((i & 32) != 0) {
                disclaimer = uiState.disclaimer;
            }
            if ((i & 64) != 0) {
                subscriptionNameDialog = uiState.nameCollection;
            }
            if ((i & 128) != 0) {
                str = uiState.ctaLabel;
            }
            return uiState.copy(z, ahd, buyCreditsError, z2, checkoutNotice, disclaimer, subscriptionNameDialog, str);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final AHD<CreditProduct> component2() {
            return this.products;
        }

        public final BuyCreditsError component3() {
            return this.error;
        }

        public final boolean component4() {
            return this.isPurchasing;
        }

        public final CheckoutNotice component5() {
            return this.checkoutNotice;
        }

        public final Disclaimer component6() {
            return this.disclaimer;
        }

        public final SubscriptionNameDialog component7() {
            return this.nameCollection;
        }

        public final String component8() {
            return this.ctaLabel;
        }

        public final CheckoutNotice getCheckoutNotice() {
            return this.checkoutNotice;
        }

        public final String getCtaLabel() {
            return this.ctaLabel;
        }

        public final Disclaimer getDisclaimer() {
            return this.disclaimer;
        }

        public final BuyCreditsError getError() {
            return this.error;
        }

        public final SubscriptionNameDialog getNameCollection() {
            return this.nameCollection;
        }

        public final AHD<CreditProduct> getProducts() {
            return this.products;
        }

        public int hashCode() {
            return ((((((C0KA.A01((AnonymousClass005.A0F(this.products, C0KA.A02(this.isLoading)) + AnonymousClass006.A0D(this.error)) * 31, this.isPurchasing) + AnonymousClass006.A0D(this.checkoutNotice)) * 31) + AnonymousClass006.A0D(this.disclaimer)) * 31) + AnonymousClass006.A0D(this.nameCollection)) * 31) + AnonymousClass005.A0H(this.ctaLabel);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isPurchasing() {
            return this.isPurchasing;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(boolean z, AHD ahd, BuyCreditsError buyCreditsError, boolean z2, CheckoutNotice checkoutNotice, Disclaimer disclaimer, SubscriptionNameDialog subscriptionNameDialog, String str, int i, C06H c06h) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? AHI.A01 : ahd, (i & 4) != 0 ? null : buyCreditsError, AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? null : checkoutNotice, (i & 32) != 0 ? null : disclaimer, (i & 64) != 0 ? null : subscriptionNameDialog, (i & 128) != 0 ? null : str);
        }

        public UiState() {
            this(true, AHI.A01, null, false, null, null, null, null);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel", f = "AuraBuyCreditsViewModel.kt", l = {225}, m = "fetchPlayPrices", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$fetchPlayPrices$1, reason: invalid class name */
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
            return AuraBuyCreditsViewModel.this.fetchPlayPrices(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$loadCreditProducts$2", f = "AuraBuyCreditsViewModel.kt", l = {183, 202}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$loadCreditProducts$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$loadCreditProducts$2$5, reason: invalid class name */
        public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<CreditProduct, CharSequence> {
            public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

            public AnonymousClass5() {
                super(1);
            }

            @Override // X.G0U
            public final CharSequence invoke(CreditProduct creditProduct) {
                C7384Etj.A0Y(creditProduct, 0);
                return FGI.A0U(creditProduct.id, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, creditProduct.formattedPrice);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraBuyCreditsViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraBuyCreditsViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$refreshPlayPrices$1", f = "AuraBuyCreditsViewModel.kt", l = {155}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$refreshPlayPrices$1, reason: invalid class name and case insensitive filesystem */
    public final class C140961 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<TopUpPack> $packs;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140961(List<TopUpPack> list, HtJ<? super C140961> htJ) {
            super(2, htJ);
            this.$packs = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraBuyCreditsViewModel.this.new C140961(this.$packs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraBuyCreditsViewModel auraBuyCreditsViewModel = AuraBuyCreditsViewModel.this;
                List<TopUpPack> list = this.$packs;
                this.label = 1;
                obj = auraBuyCreditsViewModel.fetchPlayPrices(list, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            Map map = (Map) obj;
            if (map != null) {
                AHD<CreditProduct> creditProducts = AuraBuyCreditsViewModelKt.toCreditProducts(this.$packs, map);
                BLG<UiState> blg = AuraBuyCreditsViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    uiState = value;
                } while (!blg.A6e(value, C8j5.A0R(uiState, uiState.error, creditProducts, uiState.isLoading)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C140961) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AuraBuyCreditsViewModel(AbstractC3358CGz abstractC3358CGz, AuraSubscriptionRepository auraSubscriptionRepository) {
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, auraSubscriptionRepository);
        this.userSession = abstractC3358CGz;
        this.repository = auraSubscriptionRepository;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(zA1a, AHI.A01, null, false, null, null, null, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.pricedPacks = C0881AGi.A00;
        loadCreditProducts();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchPlayPrices(java.util.List<com.facebook.aura.subscription.repo.TopUpPack> r8, X.HtJ<? super java.util.Map<java.lang.String, com.facebook.aura.status.viewmodel.PlayPackPrice>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel.AnonymousClass1
            if (r0 == 0) goto L25
            r6 = r9
            com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$fetchPlayPrices$1 r6 = (com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r3 = r6.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r1 = 1
            java.lang.String r5 = "AuraBuyCreditsViewModel"
            r4 = 0
            if (r0 == 0) goto L30
            if (r0 != r1) goto L2b
            java.lang.Object r8 = r6.L$0
            java.util.List r8 = (java.util.List) r8
            goto L43
        L25:
            com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$fetchPlayPrices$1 r6 = new com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$fetchPlayPrices$1
            r6.<init>(r9)
            goto L12
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.Hwg.A00(r3)
            com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$fetchPlayPrices$prices$1 r0 = new com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$fetchPlayPrices$prices$1     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lba
            r0.<init>(r8, r4)     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lba
            r6.L$0 = r8     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lba
            r6.label = r1     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lba
            java.lang.Object r3 = X.C8j4.A0s(r0, r6)     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lba
            if (r3 != r2) goto L46
            return r2
        L43:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lba
        L46:
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lba
            if (r3 != 0) goto L50
            java.lang.String r0 = "load_credit_packs failed: play_prices timed out after 5000ms"
            X.CFK.A06(r5, r0)
            return r4
        L50:
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r8)
            java.util.Iterator r1 = r8.iterator()
        L58:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()
            com.facebook.aura.subscription.repo.TopUpPack r0 = (com.facebook.aura.subscription.repo.TopUpPack) r0
            java.lang.String r0 = r0.playProductId
            r2.add(r0)
            goto L58
        L6a:
            java.util.ArrayList r6 = X.C3cG.A0h()
            java.util.Iterator r2 = r2.iterator()
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r1 = r2.next()
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L72
            r6.add(r1)
            goto L72
        L86:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto Lb2
            int r1 = r3.size()
            int r3 = r8.size()
            java.lang.String r0 = ","
            java.lang.String r2 = X.AbstractC06907md.A01(r0, r6, r4)
            java.lang.String r0 = "load_credit_packs failed: play_prices incomplete, priced "
            java.lang.StringBuilder r1 = X.C60O.A0y(r0, r1)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " missing="
            java.lang.String r0 = X.C60P.A1M(r0, r2, r1)
            X.CFK.A06(r5, r0)
            return r4
        Lb2:
            return r3
        Lb3:
            r1 = move-exception
            java.lang.String r0 = "load_credit_packs failed: play_prices threw"
            X.CFK.A0A(r5, r0, r1)
            return r4
        Lba:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel.fetchPlayPrices(java.util.List, X.HtJ):java.lang.Object");
    }

    private final void launchLoad(G0V<? super C3UX, ? super HtJ<? super Unit>, ? extends Object> g0v) {
        AnonymousClass002.A1K(this.loadJob);
        BLL bllA00 = AEu.A00(this);
        this.loadJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), g0v, bllA00);
    }

    public final void clearCheckoutNotice() {
        UiState value;
        UiState uiState;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(uiState.isLoading, uiState.products, uiState.error, uiState.isPurchasing, null, uiState.disclaimer, uiState.nameCollection, uiState.ctaLabel)));
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void loadCreditProducts() {
        UiState value;
        UiState uiState;
        this.pricedPacks = C0881AGi.A00;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, C8j5.A0R(uiState, null, uiState.products, true)));
        launchLoad(new AnonymousClass2(null));
    }

    public final PayNowResult onPayNowClicked(String str) {
        Object next;
        UiState value;
        SubscriptionNameDialog subscriptionNameDialog;
        UiState value2 = this._uiState.getValue();
        if (!value2.isPurchasing) {
            Iterator it = value2.products.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(((CreditProduct) next).id, str)) {
                    break;
                }
            }
            PurchaseAction purchaseActionResolveTopUpPurchaseAction = AuraBuyCreditsViewModelKt.resolveTopUpPurchaseAction((CreditProduct) next);
            if (purchaseActionResolveTopUpPurchaseAction != null) {
                if (!this.repository.isNameSatisfied && (subscriptionNameDialog = value2.nameCollection) != null) {
                    return new PayNowResult.NeedsName(purchaseActionResolveTopUpPurchaseAction, subscriptionNameDialog, value2.disclaimer);
                }
                BLG<UiState> blg = this._uiState;
                do {
                    value = blg.getValue();
                } while (!AEs.A02(value, null, value, blg, true));
                return new PayNowResult.Launch(purchaseActionResolveTopUpPurchaseAction);
            }
        }
        return PayNowResult.Ignored.INSTANCE;
    }

    public final void onTopUpPurchaseCanceled() {
        UiState value;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!AEs.A02(value, CheckoutNotice.CANCELED, value, blg, false));
        refreshPlayPrices();
    }

    public final void onTopUpPurchaseCompleted() {
        this.repository.refresh();
    }

    public final void onTopUpPurchaseFailed() {
        UiState value;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!AEs.A02(value, CheckoutNotice.FAILED, value, blg, false));
        refreshPlayPrices();
    }

    public final void onTopUpPurchasePending() {
        UiState value;
        UiState uiState;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(uiState.isLoading, uiState.products, uiState.error, false, uiState.checkoutNotice, uiState.disclaimer, uiState.nameCollection, uiState.ctaLabel)));
        this.repository.refresh();
    }

    public final void refreshPlayPrices() {
        List<TopUpPack> list = this.pricedPacks;
        UiState value = this._uiState.getValue();
        if (list.isEmpty() || value.isLoading || value.isPurchasing) {
            return;
        }
        launchLoad(new C140961(list, null));
    }

    public /* synthetic */ AuraBuyCreditsViewModel(AbstractC3358CGz abstractC3358CGz, AuraSubscriptionRepository auraSubscriptionRepository, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz) : auraSubscriptionRepository);
    }
}
